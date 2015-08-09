from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.core.context_processors import csrf
from django.contrib.auth import *
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.decorators import login_required, user_passes_test

# Create your views here.
def first_page(request):
    return HttpResponse("<p>Users</p>")

def user_login(request):
    '''
    login
    '''
    if request.POST:
        username = password = ''
        username = request.POST.get('username')
        password = request.POST.get('password')
        user = authenticate(username=username, password=password)
        if user is not None and user.is_active:
            login(request, user)
            return redirect('/')
    ctx = {}
    ctx.update(csrf(request))
    return render(request, 'login.html', ctx)


def user_logout(request):
    '''
    logout
    URL: /users/logout
    '''
    logout(request)
    return redirect('/')


def diff_response(request):
    if request.user.is_authenticated():
        content = "<p>my dear user</p>"
    else:
        content = "<p>you wired stranger</p>"
    return HttpResponse(content)


@login_required
def user_only(request):
    return HttpResponse("<p>This message is for logged in user only.</p>")


def name_check(user):
    return user.get_username() == 'vamei'


@user_passes_test(name_check)
def specific_user(request):
    return HttpResponse("<p>for Vamei only</p>")


def register(request):
    if request.method == 'POST':
        form = UserCreationForm(request.POST)
        if form.is_valid():
            new_user = form.save()
        return redirect("/")
    else:
        form = UserCreationForm()
        ctx = {'form': form}
        ctx.update(csrf(request))
        return render(request, 'register.html', ctx)

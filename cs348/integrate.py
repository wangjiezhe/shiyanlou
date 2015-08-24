# -*- coding: utf-8 -*-
"""
Created on Sun Aug 23 20:05:42 2015

@author: shiyanlou
"""

from scipy import sqrt, pi, exp, Inf
from scipy.integrate import quad, dblquad, tplquad
from scipy.special import jn

def f(x):
    return x
    
x_lower = 0
x_upper = 1

val, abserr = quad(f, x_lower, x_upper)

print "integral value =", val, ", absolute error =", abserr



def integrand(x, n):
    return jn(n, x)
    
x_lower = 0
x_upper = 10

val, abserr = quad(integrand, x_lower, x_upper, args=(3,))

print val, abserr


val, abserr = quad(lambda x: exp(-x ** 2), -Inf, Inf)

print "numerical =", val, abserr

analytical = sqrt(pi)



def integrand(x, y):
    return exp(-x**2 - y**2)

x_lower = 0
x_upper = 10
y_lower = 0
y_upper = 10

val, abserr = dblquad(integrand, x_lower, x_upper,
        lambda x: y_lower, lambda x: y_upper)

print val, abserr

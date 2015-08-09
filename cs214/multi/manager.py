import multiprocessing as mul


def f(x, arr, l):
    x.value = 3.14
    arr[0] = 5
    l.append('Hello')


server = mul.Manager()
x = server.Value('d', 0.0)
arr = server.Array('i', range(10))
l = server.list()

print(x.value)
print(arr)
print(l)

proc = mul.Process(target=f, args=(x, arr, l))
proc.start()
proc.join()

print(x.value)
print(arr)
print(l)

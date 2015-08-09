import multiprocessing as mul


def f(n, a):
    n.value = 3.14
    a[0] = 5


num = mul.Value('d', 0.0)
arr = mul.Array('i', range(10))

print(num.value)
print(arr[:])

p = mul.Process(target=f, args=(num, arr))
p.start()
p.join()

print(num.value)
print(arr[:])

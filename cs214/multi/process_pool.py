import multiprocessing as mul


def f(x):
    return x ** 2


pool = mul.Pool(5)
rel = pool.map(f,range(1,11))
print(rel)

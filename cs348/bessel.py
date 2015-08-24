# -*- coding: utf-8 -*-
"""
Created on Sun Aug 23 19:54:59 2015

@author: shiyanlou
"""

# %matplotlib qt
from scipy import linspace
from scipy.special import jn, yn, jn_zeros, yn_zeros
import matplotlib.pyplot as plt

n = 0
x = 0.0
# Bessel function of first kind
print "J_%d(%f) = %f" % (n, x, jn(n, x))

x = 1.0
# Bessel function of second kind
print "Y_%d(%f) = %f" %(n, x, yn(n, x))

x = linspace(0, 10, 100)

fig, ax = plt.subplots()
for n in range(4):
    ax.plot(x, jn(n, x), label=r"$J_%d(x)$" % n)
ax.legend();

fig.show()



n = 0
m = 4
print jn_zeros(n, m)
print yn_zeros(n, m)
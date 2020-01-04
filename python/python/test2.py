def fun1():
	print("in fun1")


def fun2(fun1, a=1):
	for i in range(a):
		fun1(i)

fun2(lambda x: print(x+2), 10);

from test1 import foo
import test1
print(foo(100))
print(test1.foo1())
import test

print(test.fun1())

s = {1,1,1,2,2,2}
t = ()
d = {1:2, 3:4}
l = []

# for val in d.items():
# 	print(val)

print (s, d, t, l)


def foo(x):
	if(x>10):
		return x
def foo1():
	print("this is in foo1")

print(foo(10))
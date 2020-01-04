
def fun1():
	return 1, 2

a = {fun1(): 1}


for key in a:
	if type(key) is tuple:
		print( "i am tuple")
	if "at" in "this":
		print("i am this")
print(a)
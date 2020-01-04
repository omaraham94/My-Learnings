def fun1(fun2):
	fun2()

def fun2():
	print("hello world")

fun1(fun2)

# lambda function:
# here we are passing the function lambda instead of fun2 and thus getting our work done
# functional programming. lambda is of that type

print(fun1(lambda:print("hello world")))

# remove all even numbers from a list :
my_list = [13,12,52,51]

#filter takes a function and an iterator and then evaluates the function on the values of the iterator.

print(list(filter(lambda x : x %2 !=0, my_list)))

# can also be done like this

print([x for x in my_list if x%2 != 0])

# ways to write lambda function:

print((lambda x : x*3) (5))

# the above function is identical to 
"""
def f (x):
	return x*3
f(5)
"""
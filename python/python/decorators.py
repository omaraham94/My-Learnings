# used @classmethod and @staticmethod.
# decorator is a function that gets called before another function

import functools
""" 
	How do the decorators work
	Here the decorator my_decorator wraps the function which is used after it
	and then u can see that it would first run the decorator function to do some 
	tasks before our function and then run our function and u can also ask it to 
	do some tasks after our function.
	This is done by replacing the function my_function with "function_that_runs_func"
	and then "function_that_runs_func" is executed.
	So, if the func() in the function_that_runs_func is removed, it would not run that function
	itself

	Hence decorator should always have the function that it is decorating.
"""
def my_decorator(func):
	@functools.wraps(func)
	def function_that_runs_func():
		print("in decorator")
		func()
		print("after the decorator")
	return function_that_runs_func

@my_decorator
def my_function():
	print("I'm the function")

my_function()


# complex decorators.
# Creating decorators that can accept arguments.
# Also, function_that_runs_func() should have *args and **kwargs
# so that it can take care of the function which is being decorated by it 

def my_decorator_with_args(number):
	def my_decorator(func):
		def function_that_calls_func(*args, **kwargs):
			print("in decorator 2")
			if (number == 10):
				print("not doing anything")
			else :
				func(*args, **kwargs)
			print("after decorator 2")
		print("in decorator before return")
		return function_that_calls_func
	print(number)
	return my_decorator

@my_decorator_with_args(11)
def my_function_too(one,two):
	print(one+two)
	print("hello")

my_function_too(1,2)

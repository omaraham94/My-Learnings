def addition(a1,a2):
	return a1+a2

def addition_long(a1,a2,a3,a4,a5):
	return a1+a2+a3+a4+a5

def addition_list(list_args):
	return sum(list_args)


#for this we dont need to pass the argument as list. This will directly be converted to list
# by the arguments passed to the function.
def addition_simplified(*args) :
	return sum(args)

#eg:
print (addition_simplified(1,2,3,4,5))

#what are qwargs ??

def what_are_kwargs(*args, **kwargs):
	print(args)
	print(kwargs)
#we can also give names to arguments 
#thus we get a set of key value pairs in the kwargs.
#kwargs:- key word arguments ;)

what_are_kwargs(12,13,14, name="jose", location="UK")
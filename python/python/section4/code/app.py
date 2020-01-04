from flask import Flask, request
from flask_restful import Resource, Api, reqparse
from flask_jwt import JWT, jwt_required

from security import authenticate, identity

# JWT - stands Json web token. It is used for authentication of data.

app = Flask(__name__)
	
app.secret_key = 'jose';

# Api works with resources and every Resource has to be a class.

api = Api(app)

jwt = JWT(app, authenticate, identity)   # /auth

items = []

# Here we dont need to do jsonify as Flask-Restful does it for us.

class Item(Resource):
	@jwt_required()
	def get(self, name):               # this is the get of the http protocol
		item = next(filter(lambda x: x["name"] == name, items), None)  # next gives the items that match in the iterator
																	   # if more than 1 item match, calling next again gives the next
																	   # item. But if none of the items match, it will return an error
																	   # hence , None is given.	
		return {"item":item}, 200 if item else 404  				  
												  # not all apis will accept something other than dictionary. 
												  # since this is an error make sure to add 404 other wise 200 will be reported.
												  # 404 page not found
												  # 200 success
												  # 401 => unauthorized

	def post(self, name):
		if next(filter(lambda x: x["name"] == name, items), None) is not None:
			return {"message" : "item " + name + " already exists"}, 400
												 # 400 is bad request
		data = request.get_json();               # force=true => the data is accepted even though it is not in json
												 # and silent=true => if the data is not in json, it doesnot do any thing, just 
												 # returns None.
		item = {'name':name, 
				'price' : data["price"]}
		items.append(item, )
		return item, 201                   # 201 stands for created

	def delete(self, name) :
		global items
		items = list(filter(lambda x: x["name"] != name, items))
		return {"message" : "items deleted"}

	def put(self, name) :
		data = request.get_json()
		item = next(filter(lambda x : x['name'] == name, items), None)
		if item is None:
			item = {"name" : name, 'price' : data.price}
			items.append(item)
		else:
			item.update(data)
		return item

class ItemList(Resource):
	def get(self):
		return {'items' : items}

api.add_resource(Item, '/item/<string:name>')    # http://127.0.0.1:5000/student/Atul
api.add_resource(ItemList, '/items')

app.run(port=5000, debug=False)              # debug = true -> gives lot of info as to where the error is pointing to.
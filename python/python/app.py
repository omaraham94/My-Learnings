# here flask is a package ie a directory  and Flask is a python class.

""" Rest api's usually return text in some specific format """

from flask import Flask, jsonify, request, render_template

app = Flask(__name__)

stores = [
	{
		'name' : "My_wonderful_Store",
		'items' : [
					{
						'name': "My item",
						'price': 15.99
					}
		]
	}
]

@app.route('/')
def home():
	return render_template('index.html')

""" JSON : is like a dictionary however json is a long string.
	very much similar to dictionary but not a dictionary.
	Always uses double quotes and not single quotes.
	Always is a dictionary and not a list.

"""

# POST - used to receive data (from server perspective)
# GET  - used to send data back only (from server perspective)
# from browser perspective it is opposite.

# End points we are going to create are :-

# 1. POST /store data: {name:}
@app.route('/store', methods=['POST'])
def create_store():
	request_data = request.get_json()
	new_store = {
					"name" : request_data['name'],
					"items" : []
	}
	stores.append(new_store)
	return jsonify(new_store)


# 2. GET /store/<string:name>
@app.route('/store/<string:name>')
def send_store(name):
	for store in stores:
		if store["name"] == name:
			return jsonify(store)
	return jsonify({'message' : "store not found"})


# 3. GET /store
@app.route('/store')
def get_stores():
	return jsonify({'stores':stores})  # jsonify only jsonifies a dictionary and not a list. hence this is converted to dictionary.


# 4. POST /store/<string:name>/item {name:, price:}
@app.route('/store/<string:name>/item', methods=['POST'])
def create_item_in_store(name):
	request_data = request.get_json()
	for store in stores:
		if store["name"] == name:
			new_item = {
							'name' : request_data['name'],
							'price' : request_data['price']
			}
			store['items'].append(new_item)
			return jsonify(stores)
	return jsonify({"message" : "store not found"})

# 5. GET /store/<string:name>/item
@app.route('/store/<string:name>/item')
def get_item_store(name):
	for store in stores:
		if store["name"] == name:
			return jsonify({'items' : store['items']})
	return jsonify({'message' : "store not found"})



app.run(port=5000)




"""

		Extra Information


What is a web server ?
  :- A peice of software that is designed to accept web request.

When we do www.google.com (web server), we send something to web server.
What is that we send to the web server ?
	-> When we do www.google.com :- we send 
	"GET / HTTP/1.1
	 Host: www.google.com"

	The server sees GET<verb> /<path> HTTP/1.1<protocol>  // Thats all //

	The server code may respond for the get request in different ways.
		-> it will give error if path is not found.
		-> it will give error if http is not supported.
		-> it will give error if server is not available.
		-> it may give u html code back (normal)
		-> it may give u some text
		-> it may give u nothing.

	going to any page in the browser might do any of the above.

	Only difference is that how to other end server responds with.

	Going to a web page will always do a GET request ( indeed ur browser does the get request.)

	HTTP verbs :-
	Verb              Meaning                                Example
	GET               Retreive something                     GET /item/1
	POST              Receive data and use it                POST /item
	PUT               Make sure something is there           PUT /item
	DELETE            Remove something                       DELETE /item/1

	There are many more HTTP verbs.


What is a REST API ?
	REST -> way of thinking how a server responds with ur request.
			It doesnot respond with just data
			It responds with resources

	Similar to OOP
	We can think of server having resources and each is able to interact with pertinent request.

	Rest is Stateless :-
	ie. one request cannot depend on any other request.

"""
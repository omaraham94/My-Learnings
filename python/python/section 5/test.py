import sqlite3

connection = sqlite3.connect('data.db')          # connect to the db file.

cursor = connection.cursor()                     # this is responcible for storing all the data queried from the db/
												 # quering from the db

create_table = "CREATE TABLE users (id int, username text, password text)"

cursor.execute(create_table)

user = (1, 'jose', 'asdf')
insert_query = "INSERT INTO users VALUES (?, ?, ?)"

cursor.execute(insert_query, user)                  # the cursor is smart to insert the values of the user in the query.
													# but the data is not saved in the db file yet. This is done by :-

#inserting many users

users = [
	(2, 'bose', 'bsdf'),
	(3, 'cose', 'csdf'),
]

cursor.executemany(insert_query, users)

select_query = "SELECT * FROM users"

for row in cursor.execute(select_query):
	print (row)

connection.commit()

connection.close() 
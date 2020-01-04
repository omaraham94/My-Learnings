class LotteryPlayer:
	def __init__(self, name):
		self.name = name
		self.numbers = (1,2,3,4,5,6)

	def total(self):
		return (sum(self.numbers))

player1 = LotteryPlayer("john")
player2 = LotteryPlayer("john")

print(player1.numbers == player2.numbers)
print(player1.name == player2.name)
print(player1 == player2)

class Student:
	def __init__(self, name, school):
		self.name =  name
		self.school = school
		self.marks = []

	def average(self):
		return(sum(self.marks)/len(self.marks))


student1 = Student("atul", "NIT")
student2 = Student("ankit", "CA")
student2.marks.append(10)
student2.marks.append(30)
student2.marks.append(50)
student1.marks.append(20)
student1.marks.append(40)
student1.marks.append(60)
print(student2.average())
print(student1.average()x)
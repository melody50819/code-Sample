class Animal:
    def __init__(self, name):
        self.name = name

    def getFeatures():
        pass

    def run(self, name):
        return "I can run."
    
    def jump(self, name):
        return "I can jump."


class Dog(Animal):
    def sit(name):
        return "I am Dog, I can sit."
    
    def run(name):
        return "I am Dog, I can run."


a = Animal("a")
b = Animal('b')
c = Dog('white')

a.run("a")
b.jump("b")
c.run()

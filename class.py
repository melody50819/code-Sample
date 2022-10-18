class Animal:
    def __init__(self, name):
        self.name = name

    def getFeatures():
        pass

    def run(self):
        return "I can run."
    
    def jump(self):
        return "I can jump."


class Dog(Animal):
    def __init__(self, name):
        self.name = name

    def sit(self):
        return "I am Dog, I can sit."
    
    def run(self):
        return "I am " + self.name + ", I can runing."


a = Animal("a")
b = Animal('b')

a.run()
b.jump()


c = Dog('lucky')
c.run()

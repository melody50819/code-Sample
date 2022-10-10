class Animal {
    public String name;

    public String getFeatures() {...}
    public String run() {
        return "I can run."
    }
    public String run(name) {
        return "I am " + name + ", I can run."
    }
    public String jump() {
        return "I can jump."
    }
}

class Dog extends Animal{
    public String run(name) {
        return "I am " + name + ", I can run."
    }

}

public static void main() {
    Animal dog = new Animal("Dog");
    Animal cat = new Animal("Cat");

    dog.run();
    cat.jump();
}
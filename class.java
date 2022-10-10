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

class human extends Animal{
    public String talk(name) {
        return "Hello, I am " + name + "."
    }

}

public static void main() {
    Animal dog = new Animal("Dog");
    Animal cat = new Animal("Cat");

    dog.run();
    cat.jump();
}
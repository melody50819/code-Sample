class Animal {
    public String name;

    public String getFeatures() {...}
    public String run() {
        return "I can run."
    }
    public String run(String name) {
        return "I am " + name + ", I can run."
    }
    public String jump() {
        return "I can jump."
    }
}

class people extends Animal{
    public String talk(name) {
        return "Hello, I am " + name + "."
    }
    public String run(String name) {
        return "I am " + name + ", I can run."
    }
}

public static void main() {
    Animal dog = new Animal();
    Animal cat = new Animal();

    dog.run("white");
    cat.jump();
}
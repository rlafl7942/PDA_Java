package day02;

public class assignment01 {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iphone", "bbbeeepppp");
        Phone galaxy = new Phone("galaxy", "삐비빅");
        Person son = new Person("손흥민", "폰을 킬거에요!");
        Person david = new Person("베컴", "폰 킬거야!");
        Store galaxyStore = new Store("galaxy store", galaxy);
        Store appleStore = new Store("apple store", iPhone);

        galaxyStore.sellPhone(son);
        appleStore.sellPhone(david);

        son.turnOnPhone();
        david.turnOnPhone();

    }
}

class Phone {
    String sound;
    String name;
    boolean isTurnOn;
    Phone (String name, String sound) {
        this.name = name;
        this.sound = sound;
        this.isTurnOn = false;
    }
    void turnOn() {
        this.isTurnOn = true;
        System.out.println(this.sound);
    }
    String getName() {
        return this.name;
    }

}

class Person {
    String name;
    Phone phone;
    String comment;
    Person (String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
    void buyPhone (Phone phone) {
        this.phone = phone;
    }
    void turnOnPhone () {
        System.out.println(this.comment);
        this.phone.turnOn();
    }
    String getName() {
        return this.name;
    }
}

class Store {
    String name;
    Phone phone;
    Store(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    void sellPhone (Person person) {
        System.out.println(person.getName()+"님이 " + phone.getName()+"을 구입하셨습니다.");
        person.buyPhone(phone);
    }
}

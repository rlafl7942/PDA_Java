# PDA_Java

## DAY 2
### 미니과제 
* 손흥민이 핸드폰을 구입하고 작동하면 삐비빅
* 베컴이 핸드폰을 구입하고 작동시키면 bbeeeppp

#### 객체
* Phone
```java
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
```

* Person
```java
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
```

* Store
```java
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
```

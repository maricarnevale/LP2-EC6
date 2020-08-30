package com.company;
import Class.*;

public class Main {

    public static void main(String[] args) {

            Person mariana = new Person("Mariana", 25);
            Person maria = new Person("Maria Eduarda", 25);
            Person caio = new Person("Caio", 26);

            mariana.sayHi(maria);

            mariana.introduceYourself();
            caio.introduceYourself();
            maria.introduceYourself();

            mariana.winGame(caio);
        }
    }

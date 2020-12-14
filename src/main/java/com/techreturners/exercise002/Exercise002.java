package com.techreturners.exercise002;

public class Exercise002 {

<<<<<<< HEAD
    public boolean isFromManchester(Person person) {
=======
    public boolean isFromManchester( Person person ) {
>>>>>>> f79bc471413387eefec6059b18a394ef5aea25e0
        return person.getCity().equals("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
<<<<<<< HEAD
        return person.getAge() >= ageLimit;
=======
           return person.getAge() == ageLimit;    
>>>>>>> f79bc471413387eefec6059b18a394ef5aea25e0
    }
}

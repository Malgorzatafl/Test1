package Dziedziczenie;

import obiektowość.Human;
private String plec;
public class Women extends Human {
    public Women(String name, String surname, Integer birthYear){
    super(name,surname,birthYear);
    this.plec = "kobieta";

}

//Nadpisywanie metod
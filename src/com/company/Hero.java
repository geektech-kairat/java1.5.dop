package com.company;

public class Hero {
    public String hero1, hero2, hero3, hero4;

    public Hero() {

    }


    public void setHero1(String hero1) {
        this.hero1 = hero1;
    }

    public String getHero2() {
        return hero2;
    }

    public void setHero2(String hero2) {
        this.hero2 = hero2;
    }

    public String getHero3() {
        return hero3;
    }

    public void setHero3(String hero3) {
        this.hero3 = hero3;
    }

    public String getHero4() {
        return hero4;
    }

    public void setHero4(String hero4) {
        this.hero4 = hero4;
    }


    public Hero(String hero1, String hero2, String hero3, String hero4) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        this.hero3 = hero3;
        this.hero4 = hero4;
    }
    public Hero(String hero3, String hero4) {
        this.hero3 = hero3;
        this.hero4 = hero4;
    }
    public Hero(String hero1, String hero2,String hero3){
    }
    public Hero(String hero3){
        this.hero3 = hero3;
    }
}

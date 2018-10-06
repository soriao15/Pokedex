package com.example.omarsoria.pokedex;


import java.util.UUID;

public class Pokemon {
    private UUID mId;
    private String mname;
    private String mheight;
    private String mweight;
    private String mcategory;
    private String mhp;
    private String mattack;
    private String mspattack;
    private String mdefense;
    private String mspdefense;
    private String mspeed;
    private int mimage;

    public Pokemon() {
        mId = UUID.randomUUID();

    }

    public Pokemon(String name, String category, String hp, String attack, String spattack, String weight, String height,
                    String defense, String spdefense, String speed, int image){

        mId = UUID.randomUUID();
        this.mname = name;
        this.mcategory = category;
        this.mhp = hp;
        this.mattack = attack;
        this.mspattack = spattack;
        this.mweight = weight;
        this.mheight = height;
        this.mdefense = defense;
        this.mspdefense = spdefense;
        this.mspeed = speed;
        this.mimage = image;

    }

    public String getWeight() {
        return mweight;
    }

    public String getAttack() {
        return mattack;
    }

    public UUID getId() {
        return mId;
    }

    public String getDefense() {
        return mdefense;
    }

    public String getHp() {
        return mhp;
    }

    public String getSpattack() {
        return mspattack;
    }

    public String getSpdefense() {
        return mspdefense;
    }

    public String getSpeed() {
        return mspeed;
    }

    public String getCategory() {
        return mcategory;
    }

    public String getHeight() {
        return mheight;
    }

    public String getName() {
        return mname;
    }

    public int getImage() {
        return mimage;
    }

    public void setImage(int mimage) {
        this.mimage = mimage;
    }

    public void setAttack(String mattack) {
        this.mattack = mattack;
    }

    public void setCategory(String mcategory) {
        this.mcategory = mcategory;
    }

    public void setDefense(String mdefense) {
        this.mdefense = mdefense;
    }

    public void setHeight(String mheight) {
        this.mheight = mheight;
    }

    public void setHp(String mhp) {
        this.mhp = mhp;
    }

    public void setName(String mname) {
        this.mname = mname;
    }


    public void setSpattack(String mspattack) {
        this.mspattack = mspattack;
    }

    public void setSpdefense(String mspdefense) {
        this.mspdefense = mspdefense;
    }

    public void setSpeed(String mspeed) {
        this.mspeed = mspeed;
    }

    public void setWeight( String mweight) {
        this.mweight = mweight;
    }

}


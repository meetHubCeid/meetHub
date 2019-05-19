package sample;

import java.util.Random;

public class Avatar {
    public enum EyeColor {
        black, brown, green, blue, grey
    }

    public enum HairColor {
        black, brown, green, blue, grey, red, pink
    }

    public enum LipsShape {
        zoumera, duckFace, silikoni
    }

    public EyeColor eyesColor;
    public HairColor hairColor;
    public LipsShape lips;


    public Avatar(EyeColor eyesColor, HairColor hairColor, LipsShape lips) {
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.lips = lips;
    }

    public Avatar(){
        giveRandom();
    }

    public EyeColor getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(EyeColor eyesColor) {
        this.eyesColor = eyesColor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public LipsShape getLips() {
        return lips;
    }

    public void setLips(LipsShape lips) {
        this.lips = lips;
    }

    public void giveRandom() {

        //Random eyesColor
        Random number = new Random();
        int x;
        x = number.nextInt(5);

        if (x == 0) {
            eyesColor = EyeColor.black;
        } else if (x == 1) {
            eyesColor = EyeColor.brown;
        } else if (x == 2) {
            eyesColor = EyeColor.green;
        } else if (x == 3) {
            eyesColor = EyeColor.blue;
        } else {
            eyesColor = EyeColor.grey;
        }

        //Random hairColor
        Random number1 = new Random();
        int y;
        y = number1.nextInt(7);


        if (x == 0) {
            hairColor = HairColor.black;
        } else if (x == 1) {
            hairColor = HairColor.brown;
        } else if (x == 2) {
            hairColor = HairColor.green;
        } else if (x == 3) {
            hairColor = HairColor.blue;
        } else if (x == 4) {
            hairColor = HairColor.grey;
        } else if (x == 5) {
            hairColor = HairColor.red;
        } else {
            hairColor = HairColor.pink;
        }

        //Random lips
        Random number2 = new Random();
        int z;
        z = number2.nextInt(3);

        if (x == 0) {
            lips = LipsShape.zoumera;
        } else if (x == 1) {
            lips = LipsShape.duckFace;
        } else {
            lips = LipsShape.silikoni;
        }

        Avatar avatar = new Avatar(eyesColor, hairColor, lips);
    }
}

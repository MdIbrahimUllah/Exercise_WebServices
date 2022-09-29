package ca.vanier;
<<<<<<< HEAD
=======

>>>>>>> e97e3b98d571c812592c284f74e964f8bf47987a
public class Scores {

    boolean check(int score){
        if (score<6) return false;
        else
        return true;

    }
    
    public static boolean result(String args){
        double score = Double.parseDouble(args);
        return (score > 6);
    }
}

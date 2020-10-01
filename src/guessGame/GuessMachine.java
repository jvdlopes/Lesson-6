
package guessGame;


public class GuessMachine {
    private int number;
    private int numguesses;
    private int myguess;
    
    public GuessMachine(){
        numguesses=0;
        number = (int)(Math.random()*100)+1;
        myguess =0;
    }
    
    public boolean setGuess (int num) {
        if(num >100 || num <0)
            return false;
        myguess = num;
        numguesses++;
        return true;
    }
    
    public String giveResult(){
        if(myguess==number) return "You got it";
        else if(myguess<number) return "Too low";
        else return "Too high";
    }
    
    public int getnumGuesses(){
        return numguesses;
    }
}



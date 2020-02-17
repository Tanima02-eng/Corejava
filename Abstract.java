package app.demo;
/*
 * Program -3 Create an abstract class Instrument which is having the abstract function play.  
Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
            “Piano is playing  tan tan tan tan  ”  for Piano class
            “Flute is playing  toot toot toot toot”  for Flute class
            “Guitar is playing  tin  tin  tin ”  for Guitar class 
            Create an array of 10 Instruments.
            Assign different type of instrument to Instrument reference.
            Check for the polymorphic behavior of  play method.
 */
abstract class Instrument{
abstract void play();
}
class Piano extends Instrument{
    public void play() {
     System.out.println("Piano is playing  tan tan tan tan");
    }
}
class Flute extends Instrument{
    public void play() {
     System.out.println("Flute is playing  toot toot toot toot");
    }
}
class Guitar extends Instrument{
    public void play() {
     System.out.println("Guitar is playing  tin  tin  tin");
    }
}
public class Abstract{
    public static void main(String [] args){
    Instrument ins[]=new Instrument[3];
    ins[0]=new Piano();
    ins[1]=new Flute();
    ins[2]=new Guitar();
    for(int i=0;i<ins.length;i++)
     ins[i].play();
    }
    }


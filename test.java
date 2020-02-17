package live;

/*
 * Program 4-Write an interface called Playable, with a method void play();

Let this interface be placed in a package called music.Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string.Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind.Write another class Test in a package called live. Then,

a. Create an instance of Veena and call play() method

b. Create an instance of Saxophone and call play() method

c. Place the above instances in a variable of type Playable and then call play().


 */

import music.Playable;
import music.string.veena;
import music.wind.saxophone;

public class test {
	public static void main(String args[]) {
         veena veena = new veena();

        veena.play();

        saxophone saxophone = new saxophone();

        saxophone.play();

        Playable pv, ps; 

        pv = new veena();

        ps = new saxophone();

        pv.play(); 

        ps.play();

        }

}
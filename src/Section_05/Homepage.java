package Section_05;

import org.testng.annotations.Test;

public class Homepage {
    @Test
    public void Desktop_login () {
        System.out.println("This is method 1");
    }
    @Test
    public void Desktop_addItem () {
        System.out.println("This is method 2");
    }
    @Test
    public void Tablet_addItem () {
        System.out.println("This is method 3");
    }
    @Test
    public void Tablet_login () {
        System.out.println("This is method 4");
    }
    @Test
    public void Mobile_login () {
        System.out.println("This is method 5");
    }

}

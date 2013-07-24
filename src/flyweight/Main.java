package flyweight;

/**
 * Flyweight的目的在于运用共享技术，使得一些细粒度的物件可以共享。
 * 例子是java String Pool
 * @author Administrator
 *
 */
public class Main {
	 
    public static void main(String[] args) { 
        String str1 = "fly"; 
        String str2 = "weight"; 
        String str3 = "flyweight"; 
        String str4; 

        str4 = str1 + str2; 
        System.out.println(str3 == str4); 

        str4 = (str1 + str2).intern(); 
        System.out.println(str3 == str4); 
    } 
}

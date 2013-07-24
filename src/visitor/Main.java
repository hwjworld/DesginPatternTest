package visitor;

public class Main {

	public static void main(String[] args) {
		// know nothing about their type
		// after storing them into Element array
		IElement[] list = { new ElementA(), new ElementB(), new ElementC() };

        System.out.println("visitorA is coming......."); 
        IVisitor visitorA = new VisitorA(); 
        for (int i=0; i < list.length; i++) 
           list[i].accept(visitorA);

        System.out.println("\nvisitorB is coming......."); 
        IVisitor visitorB = new VisitorB(); 
        for (int i=0; i < list.length; i++) 
            list[i].accept(visitorB); 
	}
}

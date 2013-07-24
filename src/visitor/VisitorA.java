package visitor;

public class VisitorA implements IVisitor {

    public void visit(ElementA element) { 
        element.operationA(); 
    }

    public void visit(ElementB element) { 
        element.operationB(); 
    }

    public void visit(ElementC element) { 
        element.operationC(); 
    } 

}

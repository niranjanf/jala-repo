package accessModifiers;
class DefaultClass_02 {
    //Default fields
    int myAge;
    String myName;

    //Default method
    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}

public class DefaultClassFieldsMethod {
    public static void main(String[] args) {
      
        DefaultClass_02 obj = new DefaultClass_02();
       
        obj.myAge = 26;
        obj.myName = "niranjan";
        //calling default method
        obj.defaultMethod();
    }
}

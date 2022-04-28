package activities;
class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override

    public String getMessage() {
        return message;
    }
}
public class Activity8 {
    public static void main(String[] args) {
       try {

           Activity8.exceptionTest("Sample Java program");
           Activity8.exceptionTest(null);
       //    Activity8.exceptionTest("Test");
       }
        catch (CustomException e){
                System.out.println("Error message inside catch block: " + e.getMessage());
        }
        }
        static void exceptionTest(String str) throws CustomException
        {
                    if(str == null)

                        throw new CustomException ("String value is Null");

                    else
                        System.out.println(str);
        }
    }



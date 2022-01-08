package Files.Homework11;

public class CustomException extends Exception{
    /**
     *
     * @param error, This receives the custom exception given by the user and it will send it to the parent
     *               class to print the user exception.
     */
    public CustomException(String error){
        super(error);
    }
}


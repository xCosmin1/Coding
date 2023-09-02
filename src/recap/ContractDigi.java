package recap;

public interface ContractDigi {
    public static final int PAYDAY = 15;
    public void printMessage(String message);
     default void printText(String text){
         System.out.println(text);

    }
}

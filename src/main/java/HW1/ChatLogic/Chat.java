package HW1.ChatLogic;

public class Chat {
    private static boolean isWorking = false;

    public static boolean getIsWorking() {
//        System.out.println("Server " + isWorking);
        return isWorking;
    }

    public static void setIsWorking(boolean serverWorking) {
        isWorking = serverWorking;
    }
}

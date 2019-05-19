package sample;

import java.util.Scanner;

public class Chatroom {

    User user;

    public void selectEntrace(){

        System.out.println("1.Video Room, 2.Message Room\n");
        System.out.println("Choose Room to communicate\n");

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int choice = Integer.parseInt(x);

        if(choice==1){
            VideoRoom vidrm = new VideoRoom();
        }
        else {
            MessageRoom msmrm = new MessageRoom();
        }

    }

}

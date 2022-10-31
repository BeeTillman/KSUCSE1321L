package Module_5;

import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String noFriend = "";
        String input;
        String[] friends = {noFriend,noFriend,noFriend,noFriend,noFriend};
        int choice,sent=0,friendNum=0,index;

        System.out.println("[Top 5 Friend's List]");
        while(sent!=1){
            System.out.println("What would you like to do?");
            System.out.println("1) Enter a friend's name");
            System.out.println("2) Replace a friend's name");
            System.out.println("3) Display your friends list");
            System.out.println("4) Quit");
                choice = sc.nextInt();
            System.out.println("Your choice: "+choice);

                switch(choice){
                    case 1:
                    System.out.println("Enter a name: ");
                        input = sc.next();
                    for(int i = 0; i < friends.length; i++) {
                        if(friendNum==5){
                            System.out.println("Sorry, your friends list is full!");
                            break;
                        }
                        else if(friends[i].equalsIgnoreCase(input)){
                            System.out.println("Sorry, they're already on the list!");
                            break;
                        }
                        else if (friends[i].equals(noFriend)){
                            friends[i]=input;
                            friendNum++;
                            break;
                        }
                    }
                    break;

                    case 2:
                        System.out.println("Enter a name: ");
                            input = sc.next();
                        System.out.println("Enter an index: ");
                            index = sc.nextInt();
                            if(index<=5&&index>0){
                                    System.out.println(input + " has replaced " + friends[index - 1] + " on your friends list!");
                                    friends[index - 1] = input;
                                    break;
                            }
                            else{
                                System.out.println("Sorry, that's an invalid command!");
                                break;
                            }

                    case 3:
                    System.out.println("Friend's List:");
                    for (int j = 0; j < 5; j++){
                        System.out.println((j + 1) + ") " + friends[j]);
                    }
                    break;
                    case 4:
                        System.out.println("[Program ends]");
                        sent = 1;
                        break;
                }
            }
        }
}

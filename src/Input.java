//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Input {
//
//
//
//    private static String axisX = "87654321";
//    private static String axisY = "abcdefgh";
//
//    public static List<Integer> getInput(int player) {
//        System.out.println("please enter your move" + Game.checkSide(player) + ":");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        List<Integer> move=new ArrayList<Integer>();
//        if (userInput.equals("w")){
//            move.add(0);
//            return move;
//        }else {
//            String regEx = "\\[[a-h][1-8]\\]X\\[[a-h][1-8]\\]"; //format
//            Pattern pattern = Pattern.compile(regEx);
//            Matcher matcher = pattern.matcher(userInput);
//            // check if the move is correctly formatted
//            boolean ifMatch = matcher.matches();
//            while (!ifMatch) {
//                System.out.println("Wrong format. Please follow the '[a3]X[b4]' format");
//                scanner = new Scanner(System.in);
//                if (userInput.equals("w")) {
//                    move.add(0);
//                    return move;
//                } else {
//                    userInput = scanner.next();
//                    ifMatch = pattern.matcher(userInput).matches();
//                }
//            }
//            int x = axisX.indexOf(userInput.charAt(2)); //d
//            int y = axisY.indexOf(userInput.charAt(1)); //6
//            int xNew = axisX.indexOf(userInput.charAt(7)); //c
//            int yNew = axisY.indexOf(userInput.charAt(6)); //5
//            move.add(x);
//            move.add(y);
//            move.add(xNew);
//            move.add(yNew);
//            move.add(player);
//            return move;
//        }
//    }
//
//
////    public static boolean startRandomGame(){
////        System.out.println("Do you want to start a random game mode?[y/n]");
////        System.out.println("--press 'y' to start in random mode");
////        System.out.println("--press 'n' to start in standard mode");
////        Scanner scanner = new Scanner(System.in);
////        String userInput = scanner.nextLine();
////        if (userInput.equalsIgnoreCase("y")){
////            return true;
////        }else if (userInput.equalsIgnoreCase("n")){
////            return false;
////        }else{
////            startRandomGame();
////            return false;
////        }
////        while(true){
////            System.out.println("Please re-enter");
////            userInput = scanner.nextLine();
////
////        }
////        return (userInput.equals("y") || userInput.equals("Y"));
//    }
//
//
//
//}

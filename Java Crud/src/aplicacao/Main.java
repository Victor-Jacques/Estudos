package aplicacao;
import dao.UserDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.User;

public class Main {
    public static void main (String[] args) throws SQLException, Exception{

        Scanner scan = new Scanner(System.in);
        UserDAO userDao = new UserDAO();
        User User1 = new User();

        int select;

        while(true){
            System.out.println(" **** Users from Database **** ");

                System.out.println("\n Choose one of the options below: \n\n"+
                        "1 - List all users \n 2 - Create new user \n "
                        +"3 - Delete user \n 4 - Edit user \n 5 - Exit program");

                System.out.print("\n\n Input: ");
                select = scan.nextInt();

                switch(select){
                    case 1:
                        for(User use : userDao.getAll()){
                            System.out.println(" Id: "+ use.getId());
                            System.out.println(" Name: "+ use.getName());
                            System.out.println(" Age: "+ use.getAge()+"\n");
                        }

                        break;

                    case 2:
                        String name;
                        int age;

                        System.out.print(" What is the user name: ");
                        name = scan.next();

                        System.out.print("How old is the user");
                        age = scan.nextInt();

                        if(userDao.save(User1)) {
                            System.out.println("\n\n Successfully created");
                        } else {
                            System.out.println("\n\n Error create \n Check if the information you have entered is correct");
                        }

                        break;

                    case 3:
                        int id;

                        System.out.print(" Enter the ID of the user you want to delete");
                        id = scan.nextInt();

                        if(userDao.delete(id) != true){
                            System.out.println("\n\nError deleting \n Check if the information you have entered is correct");
                        } else {
                            userDao.delete(id);
                            System.out.println("\n\nSuccessfully deleted");
                        }

                        break;

                    case 4:

                        System.out.print(" Enter the ID of the user you want to Update: ");
                        id = scan.nextInt();

                        System.out.print(" Enter new name: ");
                        name = scan.next();

                        System.out.print(" Enter new age: ");
                        age = scan.nextInt();


                        if(userDao.update(id,name,age) != true){
                            System.out.println(" \n\n Error updating \n Check if the information you have entered is correct");
                        } else {
                            userDao.update(id,name,age);
                            System.out.println("\n\n Successfully updated\n");
                        }
                        break;

                    case 5:

                        System.out.println("\n\n Closed program\n");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n\n Invalid option. Please, try again\n");
                }



                String select2;
                System.out.print("-----------------------------------\n Would you like to continue ? \n S ou N: ");
                select2 = scan.next();

                switch(select2){
                    case "S":
                        break;
                    case "s":
                        break;
                    case "N":
                        System.exit(0);
                        break;
                    case "n":
                        System.exit(0);
                        break;
                }
        }
    }
}
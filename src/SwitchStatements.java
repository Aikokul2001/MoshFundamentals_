public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";
        if (role.equals("admin"))
            System.out.println("You are an admin");
        else if (role.equals("Moderator")) {
            System.out.println("You are a moderator");}
        else
            System.out.println("You are a guest");
        String role1 = "Aikokul";  // Usage of the switch statements
        switch (role1) {
            case "admin":  // if
                System.out.println("You are an admin");
                break; // break in here is like a stop sign
            case "Moderator": // else if
                System.out.println("You are a moderator");
                break;
            default: // else, in all other cases
                System.out.println("You are a guest");
        }



        }

    }


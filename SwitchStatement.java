public class SwitchStatement {
   public static void main(String []args) {
       int number = 44;
    //   number  = number <20 ? 29:number;
       System.out.println(number);
      String size;
switch (number <20 ? 29:number) {
      case 29:
        size = "Small";
        break;

      case 42:
        size = "Medium";
        break;

      // match the value of week
      case 44:
        size = "Large";
        break;

      case 48:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    
    System.out.println("Size: " + size);

   
   }
   }

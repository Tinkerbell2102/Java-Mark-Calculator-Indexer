/* Laikin Barnard 6955*/
package DragonKiller;
import java.util.*;

public class DragonKiller {
    public static void main(String[] args) {
        // TODO code application logic here
        DragonKiller DragonObj = new DragonKiller();
        DragonObj.NameSurname = RemoveSpace(DragonObj.NameSurname);
        int Count = CountDrag(DragonObj.NameSurname);
        int[] arrayDragon = new int[Count];
        arrayDragon= arrayDragon(Count);
        arrayShow(arrayDragon);
        System.out.println(Count);
        arrayDragon = insertionSort(arrayDragon);
        arrayShow(arrayDragon);
        int MakeZero = findDragon(arrayDragon,getKey() );
        arrayDragon = ReplaceZero(arrayDragon, MakeZero);
        arrayShow(arrayDragon);
    }

    private static int[] insertionSort(int[] arrayDragon) {
               int n = arrayDragon.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arrayDragon[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arrayDragon[j] > key) { 
                arrayDragon[j + 1] = arrayDragon[j]; 
                j = j - 1; 
            } 
            arrayDragon[j + 1] = key; 
        } 
        
        return arrayDragon;
    }

    private static int getKey() {
        Scanner DragScanner = new Scanner(System.in);
        System.out.println("Select a number to replace");
        String inputString = DragScanner.nextLine();
        DragScanner.close();
        return Integer.parseInt(inputString);
    }

    private static int[] ReplaceZero(int[] arrayDragon, int MakeZero) {
        
        arrayDragon[MakeZero] = 0;
        return arrayDragon;
        
    }

    private static int findDragon(int[] arrayDragon, int key) {
        int l = 0, r = arrayDragon.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            // Check if x is present at mid 
            if (arrayDragon[m] == key) 
                return m; 
            // If x greater, ignore left half 
            if (arrayDragon[m] < key) 
                l = m + 1; 
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        // if we reach here, then element was 
        // not present 
        return -1;
    }
    
    String NameSurname;  
    
    private static int [] arrayDragon(int Length){
        int[] arrayDragon = new int[Length];
        Random rand = new Random();
        
        for(int i=0; i!= Length; i++){
            int ran = rand.nextInt(40) + 10;
            if (ran % 2 != 0){
                arrayDragon[i] = ran;
            }
            else{
                i--;
            }
        }
        return arrayDragon;
    }
    
    private static void arrayShow(int[] arrayDragon){
        
        for(int i=0; i!= arrayDragon.length; i++){
            System.out.println("Index " + i + " = " +arrayDragon[i] + "," );
        }
        
    }
    
    private String getNameSurname(){
        Scanner DragScanner = new Scanner(System.in);
        System.out.println("Enter Name and Surname");
        String inputString = DragScanner.nextLine();
        return inputString;
    }
   
    DragonKiller(){
    NameSurname = getNameSurname();
    }
    
    private static int CountDrag(String NameSurname){
      return NameSurname.length();
    }
    
    private static String RemoveSpace(String NameSurname){
        String returnNameSurname = NameSurname.replace("", "");
        return NameSurname;
    }
    
    
}

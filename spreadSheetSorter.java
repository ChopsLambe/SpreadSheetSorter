public class theOneClassToRuleThemAll {
    //19231326 - Luke O Loughlin
    //19232691 - Luke Bogdanovic
    //19264267 - Seanie Lambe
    //19277156 - Eryk Wolak
    
    String[] Array = new String[256]; 
    private int nextAvailable = 3;
    private int nextSheetNumber;
    private String newName;
    private String currentName; 
    
    public void init(){
       Array[0]="Sheet1";
       Array[1]="Sheet2";
       Array[2]="Sheet3";
    }
    
    public boolean add() {
        //an attempt at creating something to stop name duplication
        //for (int i = 0; i < Array.length; i++) {
        //    nextSheetNumber = nextAvailable + 1;
        //    String x = "Sheet" + Integer.toString(nextSheetNumber);
        //    if(x.equalsIgnoreCase(Array[i])) {
        //        nextAvailable++ ;
        //    }
        //}
        nextSheetNumber = nextAvailable + 1;
        String x = "Sheet" + Integer.toString(nextSheetNumber);
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] == null) {
                Array[i] = x;
                nextAvailable++;
                return true;
            }
        }
        return false;
    }
    
    public int rename(String currentName, String newName) {
        //stops duplicate names
        for (int i = 0; i < Array.length; i++) { 
            if(newName.equalsIgnoreCase(Array[i])) {
                return -1 ;
            }
        }
        
        for (int i = 0; i < Array.length; i++) {
            if(currentName.equalsIgnoreCase(Array[i])) {
                Array[i] = Array[i].replace(Array[i], newName) ;
                return i + 1;
            }
        }
        return -1;
    }

    public String sheetName(int index) {
        for (int i = 0; i < Array.length; i++) {
            if(index == i) {
                i = i - 1;
                System.out.println(Array[i]);
                return Array[i];
            }
        }
        return null;
    }
    
    public int index(String sheetName){    
        for(int i = 0; i < Array.length; i++){
            if(Array[i].equalsIgnoreCase(sheetName)) {
                
                System.out.println(i+1);
                return i;
            }
        }
        return -1;
    }
    
    private int shiftRight(int index){
        for(int i = Array.length - 1; i > index; i--){
            Array[i] = Array[i - 1];
        }
        Array[index] = null;
        return 0;
    }
    
    private int shiftLeft(int index){
        for(int i = index;i < Array.length-1; i++){
            Array[i]=Array[i + 1];
        }
        return 0;
    } 
    
    public int remove(String sheetName) {
        int index = index(sheetName) ;
        int removedSheet = index ;
        if(Array[1] != null) {
            shiftLeft(index);
            return removedSheet;  
        }
        return -1;
    }
    
    public String remove(int index){
        index = index - 1 ;
        String removedSheet = Array[index];
        if(Array[1] != null) {
            shiftLeft(index);
            return removedSheet;  
        }
        return null;
    }
    
    public int length(){
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] == null) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    
    public void display() {
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] != null) {
              System.out.printf("%s ",Array[i]) ;
            }
        }
        System.out.println("");
    }
    
   public int move(String from,String to,boolean before){
      int s1=0;
      int s2=0;
      int indexTo,indexFrom;
      
      for(int i = 0; i <Array.length ;i++){ 
       if(from.equalsIgnoreCase(Array[i])){
         s1++;
       }
       if(to.equalsIgnoreCase(Array[i])){
         s2++;
       }
      }
      if(s1 == 1 && s2 == 1){
       if(before == true){
         indexTo = index(to);
         indexFrom = index(from);
         shiftRight(indexTo);
         Array[indexTo] = from;          
         shiftLeft(indexFrom); //to move sheet backwards +1 in bracket of shiftLeft
       }else{
         indexTo = index(to);
         indexFrom = index(from);
         shiftRight(indexTo+1);
         Array[indexTo+1] = from; 
         shiftLeft(indexFrom);//to move sheet backwards +1 in bracket of shiftLeft
       } 
       return indexTo+1;
      }      
      return -1;
   }
  
    public String move(int from,int to,boolean before){
      int s1=0;
      int s2=0;
      int indexTo,indexFrom;
      
      for(int i = 0; i <Array.length ;i++){ 
       if(from == (i)){
         s1++;
       }
       if(to == (i)){
         s2++;
       }
      }
      if(s1 == 1 && s2 == 1){
       if(before == true){
         indexTo = to;
         indexFrom = from;
         shiftRight(indexTo);         
         Array[indexTo] = Array[from];           
         shiftLeft(indexFrom );
       }else{
         indexTo = to;
         indexFrom = from;
         shiftRight(indexTo+1);
         Array[indexTo+1] = Array[from]; 
         shiftLeft(indexFrom);
       } 
       return Array[indexFrom];
      }      
      return null;
  }
    
    public int moveToEnd(String from) {
        for (int i = 0; i < Array.length; i++) {
            String temp;
            if(Array[i].equalsIgnoreCase(from)) {
                temp = Array[i] ;
                remove(Array[i]) ;
                for (int j = 0; j < Array.length; j++) {
                    if(Array[j] == null) {
                        Array[j] = temp ;
                        return j+1;
                    }
                }
            }
            return -1;
        }
        return -1 ;
    }
  
    public String moveToEnd(int from) {
        from = from - 1;
        for (int i = 0; i < Array.length; i++) {
            String temp;
            if(Array[i].equalsIgnoreCase(Array[from])) {
                temp = Array[i] ;
                remove(Array[i]) ;
                for (int j = 0; j < Array.length; j++) {
                    if(Array[j] == null) {
                        Array[j] = temp ;
                        return Array[j];
                    }
                }
            }
        } 
        return null ;
    }
}

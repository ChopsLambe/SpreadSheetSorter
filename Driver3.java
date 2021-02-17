public class TheDriver3 {
    //19231326 - Luke O Loughlin
    //19232691 - Luke Bogdanovic
    //19264267 - Seanie Lambe
    //19277156 - Eryk Wolak
    
    public static void main(String[] args) {
        theOneClassToRuleThemAll instance = new theOneClassToRuleThemAll();
        
        instance.init();
        instance.add();
        instance.move(1,3,true);
        instance.display();
        instance.add();
        instance.display();
        instance.remove(2);
        instance.display();
        instance.length();
        instance.add();
        instance.display();
        instance.moveToEnd(2);
        instance.display();
        instance.moveToEnd("Sheet2");
        instance.rename("Sheet4", "Pentos");
        instance.display();
        instance.moveToEnd(2);
        instance.display();
    }
}
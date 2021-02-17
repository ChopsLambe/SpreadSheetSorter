public class TheDriver {
    //19231326 - Luke O Loughlin
    //19232691 - Luke Bogdanovic
    //19264267 - Seanie Lambe
    //19277156 - Eryk Wolak
    
    public static void main(String[] args) {
        theOneClassToRuleThemAll instance = new theOneClassToRuleThemAll();
        
        instance.init();
        instance.add();
        instance.display();
        instance.add();
        instance.display();
        instance.remove(3);
        instance.remove("Sheet1");
        instance.display();
        instance.length();
        instance.add();
        instance.add();
        instance.display();
        instance.index("Sheet4");
        instance.rename("Sheet5", "Norvos");
        instance.rename("Sheet2", "Qarth");
        instance.display();
        instance.move("Sheet4", "Sheet7", false);
        instance.display();
        instance.move("Qarth", "Sheet4", true);
        instance.display(); 
    }
}
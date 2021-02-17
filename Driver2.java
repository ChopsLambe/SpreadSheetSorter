public class TheDriver2 {
    //19231326 - Luke O Loughlin
    //19232691 - Luke Bogdanovic
    //19264267 - Seanie Lambe
    //19277156 - Eryk Wolak
    
    public static void main(String[] args) {
        theOneClassToRuleThemAll instance = new theOneClassToRuleThemAll();
        
        instance.init();
        instance.display();
        instance.add();
        instance.add();
        instance.add();
        instance.add();
        instance.display();
        instance.rename("sheet1", "Braavos");
        instance.rename("shEeT3", "sheet6");
        instance.display();
        instance.sheetName(6);
        instance.move("Sheet2", "Sheet5", false);
        instance.display();
        instance.moveToEnd("Sheet3");
        instance.display();
        instance.moveToEnd(2);
        instance.display();
        instance.remove("Sheet5");
        instance.remove(2);
        instance.display();
        instance.remove(6);
        instance.display();
    }
}
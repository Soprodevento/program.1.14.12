//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Sunday"));
    }

    public static String checkWeekend(String weekday) {
        String result = (weekday == "Saturday" || weekday == "Sunday") ? "Ура, выходной!" : "Надо еще поработать";
        return result;
    }
}
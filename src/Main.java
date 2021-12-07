public class Main {
    public static void main(String[] args) {

        int currentAmount = 100;
        int depositAmount = 1_999;
        int oneBonus = 100;

        int bonusAmount;
        if (depositAmount > 1000) {
            bonusAmount = depositAmount / oneBonus;
        } else {
            bonusAmount = 0;
        }

        int totalAmount = currentAmount + depositAmount + bonusAmount;
        System.out.println(totalAmount + " (Включая бонусных рублей: " + bonusAmount + ")");
    }
}

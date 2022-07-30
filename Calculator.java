import java.util.Scanner;

class Calculator {
    String[] tokens;
    int pos;
    double num1=(int)Calculation1();
    double num2=(int)Calculation2();
    double vir=Character();
    int result=Result();
    static Scanner scanner = new Scanner(System.in);
    Calculator (String exp){
        this.tokens=exp.split("");
        this.pos=0;

    }
    public static void main(String[] args){
        String exp = scanner.nextLine();
        Calculator tokens = new Calculator(exp);
        System.out.println(tokens.Result());
    }

    double Calculation1(){
        double num1=Double.parseDouble(tokens[pos]);
        while (pos<tokens.length){
            String oper=tokens[pos];
            if (oper.equals("1")) {
                break;
            }
            else{
                pos++;}
        }
        return num1;}

     double Calculation2() {
        double num2 = Double.parseDouble(tokens[pos]);
        while (pos < tokens.length) {
            String oper1 = tokens[pos];
            if (oper1.equals("1")) {
                break;
            } else {
                pos++;
            }
        }
        return num2;}
    double Character() {
        double vir = Double.parseDouble(tokens[pos]);
        while (pos < tokens.length) {
            String oper = tokens[pos];
            if (oper.equals("+")) {
                break;
            } else {
                pos++;
            }
        }
        return vir;}
int Result() {
    switch ((char) vir) {
        case '+' -> {
            num1 += num2;
        }
        case '-' -> {
            num1 -= num2;
        }
        case '*' -> {
            num1 *= num2;
        }
        case '/' -> {
            num1 /= num2;
        }
    }

return result;
}
}

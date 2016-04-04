package ru.levelp;
import java.util.Scanner;
/**
 * Created by Weisekopf on 04.04.16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\t === Программа решения квадратного уравнения ===");
        Scanner in = new Scanner(System.in);
        System.out.println("\t Общий вид уравнения: Ax^2 + Bx + C = 0");
        System.out.println("\t Введите коэффициент A: ");
        float varA = in.nextFloat();
        System.out.println("\t Введите коэффициент B: ");
        float varB = in.nextFloat();
        System.out.println("\t Введите коэффициент C: ");
        float varC = in.nextFloat();
        
        float varD = (float) Math.pow(varB, 2) - 4*varA*varC;

        if (varD < 0){
            System.out.println("\t Уравнение имеет комплексные корни:");
        }

        if (varD == 0) {
            System.out.println("\t Уравнение имеет кратный корень:");
            float varX1 = - varB / 2 * varA;
            float varX2 = varX1;
            System.out.println("Кратный корень уравнения: x1 = " + varX1 + " (x2 = " + varX2 + ")");
        }

        if (varD > 0) {
            System.out.println("\t Уравнение имеет два корня:");
            float varX1 = (- varB - (float) Math.sqrt(varD)) / 2 * varA;
            float varX2 = (- varB + (float) Math.sqrt(varD)) / 2 * varA;
            System.out.println("Корни уравнения: x1 = " + varX1 + ", x2 = " + varX2);
        }

    }
}

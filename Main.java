package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("----------Temperature Calculator----------\n");
        System.out.println("The data provided are:");

        int[][] temps = new int [4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        //----------PRINT TABLE-----------
        for (int row = 0; row < 4; row++)
        {
            if (row == 0)
            {
                System.out.print("7 am: ");
            }
            if (row == 1)
            {
                System.out.print("3 pm: ");
            }
            if (row == 2)
            {
                System.out.print("7 pm: ");
            }
            if (row == 3)
            {
                System.out.print("3 am: ");

            }

            for (int column = 0; column < 7; column++)
            {
                System.out.print(temps[row][column] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week:");
        System.out.println();

        //----------DAY OF WEEK AVERAGE---------
        for (int row = 0; row < temps[0].length; row++)
        {
            if (row == 0)
            {
                System.out.print("SUN: ");
            }
            if (row == 1)
            {
                System.out.print("MON: ");
            }
            if (row == 2)
            {
                System.out.print("TUE: ");
            }
            if (row == 3)
            {
                System.out.print("WED: ");

            }
            if (row == 4)
            {
                System.out.print("THU: ");
            }
            if (row == 5)
            {
                System.out.print("FRI: ");
            }
            if (row == 6)
            {
                System.out.print("SAT: ");
            }

            int dayOfWeekAverage = 0;
            for (int column = 0; column < temps.length; column++)
            {
                dayOfWeekAverage += temps[column][row];
            }
            System.out.println(dayOfWeekAverage/temps.length);
        }
        System.out.println();

        //---------TIME OF DAY AVERAGE-----------
        for (int row = 0; row < temps.length; row++)
        {
            if (row == 0)
            {
                System.out.print("7am: ");
            }
            if (row == 1)
            {
                System.out.print("3pm: ");
            }
            if (row == 2)
            {
                System.out.print("7pm: ");
            }
            if (row == 3)
            {
                System.out.print("3am: ");

            }

            int timeAverage = 0;
            for (int column = 0; column < temps[row].length; column++)
            {
                timeAverage += temps[row][column];
            }
            System.out.println(timeAverage/temps[row].length);
        }
        System.out.println();

        //-----------TOTAL AVERAGE------------
        System.out.println("The final average temperature for the week was: ");
        int totalAverage = 0;
        for (int row = 0; row < temps.length; row++)
        {
            for (int column = 0; column < temps[row].length; column++)
            {
                totalAverage += temps[row][column];
            }
        }
        System.out.print("Overall: " + (totalAverage/temps.length)/7);

    }
}
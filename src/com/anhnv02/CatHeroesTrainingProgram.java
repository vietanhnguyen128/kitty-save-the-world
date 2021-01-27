package com.anhnv02;

public class CatHeroesTrainingProgram {
    public CatHeroesTrainingProgram() {
    }

    public static int training(int trainee, int quota) {
        int day;
        day = trainingLoop(trainee, quota);
        return day;
    }

    private static int trainingLoop(int initial, int finish) {
        int day = 0;
        int halfQuota = (int) Math.ceil(((double) finish) / 2);

        while (initial != finish) {
            if (initial > finish) {
                initial--;
                System.out.println("Press black button. m = " + String.valueOf(initial+1) + " - 1 = " + String.valueOf(initial));
                day++;
            } else {
                if (initial == halfQuota) {
                    initial*=2;
                    System.out.println("Press white button. m = " + String.valueOf(initial/2) + " * 2 = " + String.valueOf(initial));
                    day++;
                    if (initial == finish)
                        break;
                } else if (initial < halfQuota) {
                    day+= trainingLoop(initial, halfQuota);
                    initial = halfQuota;
                } else if (initial > halfQuota) {
                    initial--;
                    System.out.println("Press black button. m = " + String.valueOf(initial+1) + " - 1 = " + String.valueOf(initial));
                    day++;
                }
            }
        }

        return day;
    }
}

package com.company;

public class JackOLantern {
    private String faceFeatures[][];

    JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public String makeFace()
    {
        for (int i = 0; i < faceFeatures.length; i++)
        {
            if(i == 2)
            {
                for (int j = 0; j < faceFeatures[i].length; j++) {
                    if(j == (faceFeatures[i].length/2 + 1) || j == (faceFeatures[i].length/2 -1 ))
                    {
                        faceFeatures[i][j] = "░";
                    }
                    else
                    {
                        faceFeatures[i][j] = "█";
                    }
                }
            }
            else if(i == faceFeatures.length-1)
            {
                for (int j = 0; j < faceFeatures[i].length; j++) {
                    if(j % 2 != 0) {
                        faceFeatures[i][j] = "█";
                    }
                    else
                    {
                        faceFeatures[i][j] = "░";
                    }
                }
            }

            else
            {
                for (int j = 0; j < faceFeatures[i].length; j++) {
                    faceFeatures[i][j] = "█";
                }
            }
        }
        String x = "";
        for (int i = 0; i < faceFeatures.length; i ++)
        {
            for(int j = 0; j < faceFeatures[i].length; j++)
            {
               x += faceFeatures[i][j].toString();
            }
            x += "\n";
        }
        return x;
    }
}

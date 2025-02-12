package com.dsa.leetcode.greedy;

import java.util.Arrays;

public class FindPlatforms {
    public static void main(String[] args) {
        int[] arrival = new int[]{900, 940, 950, 1100, 1500, 1800};
        int[] departure = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("No of platforms: " + findPlatform(arrival, departure));
    }

    public static int findPlatform(int arr[], int dep[]) {
        int noOfTrains = arr.length;
        TrainStatus[] trains = new TrainStatus[2 * noOfTrains];
        int j=0;
        for(int i=0; i<arr.length; i++){
            trains[j] = new TrainStatus();
            trains[j].time = arr[i];
            trains[j].status = 'A';
            j++;
        }

        int start = noOfTrains-1;
        for(int i=0; i<dep.length; i++){
            trains[j] = new TrainStatus();
            trains[j].time = dep[i];
            trains[j].status = 'D';
            j++;
        }

        Arrays.sort(trains);

        int cnt = 0, maxCnt = 0;

        for(int i=0; i<trains.length; i++){
            if(trains[i].status == 'A')
                cnt++;
            else
                cnt--;
            maxCnt = Math.max(cnt, maxCnt);
        }
        return maxCnt;

    }
}

class TrainStatus implements Comparable<TrainStatus>{
    public Integer time;
    public Character status;

    @Override
    public int compareTo(TrainStatus t){
        return this.time - t.time;
    }
}

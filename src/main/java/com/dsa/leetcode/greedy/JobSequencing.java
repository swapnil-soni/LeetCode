package com.dsa.leetcode.greedy;

import java.util.Arrays;
import java.util.List;

public class JobSequencing {

    public static void main(String[] args) {
        int[] id = new int[]{1, 2, 3, 4};
        int[] deadline = new int[]{4, 1, 1, 1};
        int[] profit = new int[]{20, 10, 40, 30};
        System.out.println(JobSequencing(id, deadline, profit));
    }

    public static List<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        Job[] jobs = new Job[id.length];
        int totalJobs = 0, maxProfit = 0;

        for (int i = 0; i < id.length; i++) {
            jobs[i] = new Job(id[i], deadline[i], profit[i]);
        }

        Arrays.sort(jobs);

        int[] jobsSequenced = new int[id.length + 1];

        for (int i = 0; i < jobs.length; i++) {
            if (jobsSequenced[jobs[i].deadline] == 0) {
                jobsSequenced[jobs[i].deadline] = jobs[i].id;
                totalJobs++;
                maxProfit += jobs[i].profit;
            }
        }

        return Arrays.asList(totalJobs, maxProfit);
    }
}

class Job implements Comparable<Job>{
    public int id;
    public int deadline;
    public int profit;

    public Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job j){
        return j.profit - this.profit;
    }
}

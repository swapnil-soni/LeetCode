package com.dsa.leetcode.greedy;

import java.util.Arrays;

public class MaxMeetings {
    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 6, 7, 9, 9};

        System.out.println("No of meeting: " + maxMeetings(start, end));
    }
    public static int maxMeetings(int start[], int end[]) {
        Meeting[] meetings = new Meeting[start.length];

        for(int i=0; i<start.length; i++){
            meetings[i] = new Meeting();
            meetings[i].start = start[i];
            meetings[i].end = end[i];
            meetings[i].meetingNo = i+1;
        }

        Arrays.sort(meetings);

        int[] seq = new int[start.length];
        int count = 1, freeTime = meetings[0].end, j = 1;

        seq[0] = meetings[0].meetingNo;

        for(int i=1; i<=meetings.length-1; i++){
            if(meetings[i].start > freeTime){
                seq[j] = meetings[i].meetingNo;
                freeTime = meetings[i].end;
                j++;
            }
        }
        return j;
    }
}

class Meeting implements Comparable<Meeting>{
    public Integer start;
    public Integer end;
    public Integer meetingNo;

    @Override
    public int compareTo(Meeting m1) {
        return this.end - m1.end;
    }
}
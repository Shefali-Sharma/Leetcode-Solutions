//
//  4_Median_of_Two_Sorted_Arrays.h
//  LeetCode
//
//  Created by Shefali Sharma on 12/21/17.
//  Copyright © 2017 Shefali Sharma. All rights reserved.
//

/*
 There are two sorted arrays nums1 and nums2 of size m and n respectively.
 
 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */

#ifndef Median_of_Two_Sorted_Arrays_h
#define Median_of_Two_Sorted_Arrays_h

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        int l1, l2, i = 0, j = 0;
        l1 = nums1.size();
        l2 = nums2.size();
        
        vector<int> total;
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                total.push_back(nums1[i]);
                i++;
            }
            else{
                total.push_back(nums2[j]);
                j++;
            }
        }
        
        while(i<l1){
            total.push_back(nums1[i]);
            i++;
        }
        
        while(j<l2){
            total.push_back(nums2[j]);
            j++;
        }
        
        /*for(int i = 0; i<total.size(); i++){
         cout<< " " << total[i];
         }
         */
        if(total.size()%2 != 0){
            return (double)total[total.size()/2];
        }
        else{
            return ((1.0)*(total[(total.size()/2) - 1] + total[total.size()/2]))/(1.0*2);
        }
        
    }
};

#endif /* Median_of_Two_Sorted_Arrays_h */

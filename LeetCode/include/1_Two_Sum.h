//
//  1_Two_Sum.h
//  LeetCode
//
//  Created by Shefali Sharma on 12/21/17.
//  Copyright © 2017 Shefali Sharma. All rights reserved.
//

/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

#include <vector>

#ifndef Two_Sum_h
#define Two_Sum_h

using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i = 0, j = nums.size()-1;
        vector<int> result(0);
        
        for(; i<nums.size(); i++){
            for(j = nums.size()-1; j>=0; j--){
                if((nums[i]+nums[j]) == target && i!=j){
                    result.push_back(i);
                    result.push_back(j);
                    return result;
                }
            }
        }
        return result;
    }
};

#endif /* Two_Sum_h */

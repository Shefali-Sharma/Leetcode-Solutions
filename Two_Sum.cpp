/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sum=0;
        vector<int> result;

        //cout << nums.size() << endl;

        for(int i = 0; i<(nums.size()/2)-1; i++){
            for(int j = nums.size()-1; j>=nums.size()/2; j--){
                cout<< "i = " << nums[i] << " j = " << nums[j] <<endl;
                if((nums[i]+nums[j]) == target){
                    result.push_back(nums[i]);
                    result.push_back(nums[j]);
                    return result;
                }
            }
        }
    }
};

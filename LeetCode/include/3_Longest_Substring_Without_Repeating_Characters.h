//
//  3_Longest_Substring_Without_Repeating_Characters.h
//  LeetCode
//
//  Created by Shefali Sharma on 12/21/17.
//  Copyright © 2017 Shefali Sharma. All rights reserved.
//

/*
 Given a string, find the length of the longest substring without repeating characters.
 */

#include <map>

#ifndef Longest_Substring_Without_Repeating_Characters_h
#define Longest_Substring_Without_Repeating_Characters_h

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
        int count;
        
        if(s.length() == 0){
            count = 1;
        }
        else{
            count = s.length();
        }
        
        int len[count];
        map<char, int> substr;
        map<char, int>::iterator it;
        
        int max = 0;
        
        for(int i = 0; i<s.length(); i++){
            substr[s[i]] = 1;
            len[i] = 1;
            for(int j = i+1; j<s.length(); j++){
                it = substr.find(s[j]);
                if(it != substr.end()){
                    break;
                }
                else{
                    substr[s[j]] = 1;
                    len[i] += 1;
                }
            }
            
            substr.clear();
            if(len[i] > max){
                max = len[i];
            }
        }
        
        return max;
    }
};

#endif /* Longest_Substring_Without_Repeating_Characters_h */

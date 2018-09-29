/*
340 Longest Substring with At Most K Distinct Characters

Given a string, find the length of the longest substring T that contains at most K distinct characters.
For example, Given s = "eceba" and k = 2,
T is "ece" which its length is 3.
*/

class Solution {
public:
    int lengthOfLongestSubstringKDistinct(string str, int k) {
        int s = 0, e = 0, maxlen = 0;
        unordered_map<char, int> dic;
        while (e < str.size()) {
            char c = str[e];
            if (dic.find(c) != dic.end()) {
                ++dic[c];
            } else {
                dic[c] = 1;
            }

            while (dic.size() > k) {
                c = str[s];
                if (--dic[c] == 0) {
                    dic.erase(c);
                }
                ++s;
            }
            maxlen = max(maxlen, e - s + 1);
            ++e;

        }

        return maxlen;

    }
};




// This method should also work!
// int count[256] = {0};
//
// int i, maxLen, numDiff;
// i = maxLen = numDiff = 0;
//
// for(int j = 0; j<s.length(); j++){
// 	if(count[s[j]] == 0){
// 		numDiff++;
// 	}
// 	count[s[j]]++;
//
// 	while(i<s.length() && numDiff>2){
// 		count[s[i]]--;
// 		if(count[s[i]] == 0){
// 			numDiff--;
// 		}
// 		i++;
// 	}
//
// 	maxLen = max(maxLen, j - i + 1);
// }
//
// return maxLen;

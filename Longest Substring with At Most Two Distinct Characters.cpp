/*
159 Longest Substring with At Most Two Distinct Characters 
Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
For example, Given s = "eceba"
T is "ece" which its length is 3.
*/

int count[256] = {0};

int i, maxLen, numDiff;
i = maxLen = numDiff = 0;

for(int j = 0; j<s.length(); j++){
	if(count[s[j]] == 0){
		numDiff++;
	}
	count[s[j]]++;

	while(i<s.length() && numDiff>2){
		count[s[i]]--;
		if(count[s[i]] == 0){
			numDiff--;
		}
		i++;
	}

	maxLen = max(maxLen, j - i + 1);
}

return maxLen;

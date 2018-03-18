
s = "A0Bb"


def valid_password(s):
    left, right, max_length = 0, 0, 0
    
    while right < len(s):
        while right < len(s) and s[right].isdigit():
            right += 1
    
        left = right
        
        found_upper = False
        
        while right < len(s) and not s[right].isdigit():
            if s[right].isupper():
                found_upper = True
            
            right += 1
        
        if found_upper:
            max_length = max(max_length, right - left)

    return -1 if max_length == 0 else max_length

len = valid_password(s)

print (len)

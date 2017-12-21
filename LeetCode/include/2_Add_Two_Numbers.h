//
//  2_Add_Two_Numbers.h
//  LeetCode
//
//  Created by Shefali Sharma on 12/21/17.
//  Copyright © 2017 Shefali Sharma. All rights reserved.
//

/*
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

#include <vector>

#ifndef Add_Two_Numbers_h
#define Add_Two_Numbers_h
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode* res = new ListNode(0);
        ListNode* temp = res;
        ListNode* temp2 = res;
        int carry = 0;
        
        while(l1!=NULL || l2!=NULL){
            
            int sum = carry;
            if(l1!=NULL){
                sum += l1->val;
            }
            if(l2!=NULL){
                sum += l2->val;
            }
            
            cout << "Sum : " << sum << endl;
            carry = 0;
            if(sum<10){
                temp->val = sum;
                temp->next = new ListNode(0);
                temp2 = temp;
                temp = temp->next;
            }else{
                sum = sum - 10;
                temp->val = sum;
                temp->next = new ListNode(0);
                temp2 = temp;
                temp = temp->next;
                temp->val = 1;
                carry = 1;
            }
            
            if(l1!=NULL){
                l1 = l1->next;
            }
            if(l2!=NULL){
                l2 = l2->next;
            }
            
        }
        
        if(temp->val == 0){
            temp2->next = NULL;
            free(temp);
        }
        return res;
    }
};

#endif /* Add_Two_Numbers_h */

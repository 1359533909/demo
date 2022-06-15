// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.model.algorithm;

import lombok.Data;

/**
 * @author mxl
 * @version 1.0
 * 2021/5/9 上午10:34
 **/
@Data
public class ListNode {
    public   int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

package com.aditya.scopescan;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("ScopeScan starting...");
        System.out.println(CIDRUtils.ipToLong("192.168.1.10"));
    }
}
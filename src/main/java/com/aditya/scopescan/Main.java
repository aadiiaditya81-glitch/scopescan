package com.aditya.scopescan;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("ScopeScan starting...");
        System.out.println(CIDRUtils.ipToLong("192.168.1.10"));
        System.out.println(CIDRUtils.prefixToMask(24));
System.out.println(CIDRUtils.prefixToMask(16));
System.out.println(CIDRUtils.prefixToMask(32));
System.out.println(CIDRUtils.prefixToMask(0));

System.out.println(CIDRUtils.isInRange("192.168.1.200", "192.168.1.0/24"));
System.out.println(CIDRUtils.isInRange("192.168.2.5", "192.168.1.0/24"));
System.out.println(CIDRUtils.isInRange("10.0.0.5", "192.168.1.0/24"));
System.out.println(CIDRUtils.isInRange("127.0.0.1", "127.0.0.1/32"));
System.out.println(CIDRUtils.isInRange("8.8.8.8", "0.0.0.0/0"));
System.out.println(CIDRUtils.isInRange("192.168.1.77", "192.168.1.77/24"));
    }
}
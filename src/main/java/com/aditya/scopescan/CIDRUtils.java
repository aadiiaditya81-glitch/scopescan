package com.aditya.scopescan;

public class CIDRUtils
{
    public static long ipToLong(String ip)  
    {
        // 1. split the string at the dots
        String[]parts =ip.split("\\.");
        // 2. check there are exactly 4 parts, otherwise throw IllegalArgumentException
        if(parts.length!=4)
        {
            throw new IllegalArgumentException("Invalid IP address:"+ip);
        }
        // 3. turn each part into a number and check it is between 0 and 255
        int[] nums= new int[4];
        for(int i =0; i<4;i++)
        {
            nums[i]=Integer.parseInt(parts[i]);
            if(nums[i]<0||nums[i]>255)
            {
                throw new IllegalArgumentException("Invalid IP address:"+ip);
            }
        }
        // 4. combine the 4 numbers into one long using << and |
        long ip1 = ((long) nums[0] << 24) | (nums[1] << 16) | (nums[2] << 8) | nums[3];
        return ip1; // replace this
    }
}
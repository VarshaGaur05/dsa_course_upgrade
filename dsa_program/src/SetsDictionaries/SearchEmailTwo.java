package SetsDictionaries;
import java.util.*;

public class SearchEmailTwo {
    public static void main(String[] args)
    {
        Hashtable<String,Integer> emails= new Hashtable<String,Integer>();
        emails.put("chandler.bing@xyz.com",1);
        emails.put("ross.geller@xyz.com",2);
        emails.put("rachel.greene@xyz.com",3);
        emails.put("joey.tribbiani@xyz.com",4);
        emails.put("monica.geller@xyz.com",5);
        emails.put("phoebe.buffay@xyz.com",6);
        emails.put("sheldon.copper@xyz.com",7);
        emails.put("marie.george@xyz.com",8);

        String NewEmail = "monica.geller@xyz.com";

        if(emails.containsKey(NewEmail))
        {
            //Complete here
            Integer a = emails.get(NewEmail);
            System.out.println(a);
        }
        else System.out.println("False");
    }
}

/*
Hash Table to Check Registered Email IDs
Description
While registering on a website, a person needs to enter his/her email ID, after which the website will check for duplicate entries. In other words, it will check whether the ID has been registered previously by another user.



You are assigned the task of checking whether a particular email ID that comes in for registration already exists or not.



You are given an array of the following emails that are already registered with the website: [“chandler.bing@xyz.com”, “ross.geller@xyz.com”, “rachel.greene@xyz.com”, “joey.tribbiani@xyz.com”, “monica.geller@xyz.com”, “phoebe.buffay@xyz.com”, “sheldon.copper@xyz.com”, “marie.george@xyz.com”].



A new entry called monica.geller@xyz.com is received. Write a code that checks whether this ID is already registered or not. If it is, return the number at which it was added into the hash table; if it is not found in the hash table, return false.



Input:

The input is the new entry, that is, monica.geller@xyz.com that needs to be checked in the array of emails that are already registered.



Output:

    1. If the new entry is found in the array of emails, then the output will be the number at which it is found.

    2. If the new entry is not found in the array of emails, then the output will be false.



Hint: Use the value field of the hash table to save the current count of the email IDs.
 */

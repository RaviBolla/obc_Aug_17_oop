package com.oop.kiss;

/**
 * Created by ravibol on 8/7/17.
 */
public class ParseIntFromString {

    public static void main(String args[]) {
        System.out.print(new ParseIntFromString().IsIntTryParse("10"));
    }

    public boolean IsIntTryParse(String input)
    {
        Integer.parseInt(input);
        return true;
    }

//    public int IsInt32IsDigit(String input)
//    {
//        for(int index=0; index<input.length(); index++) {
//            char c = input[index];
//        }
//        for(char c : input)
//        {
//            if (!Char.IsDigit(c))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static bool IsInt32RegEx(string input)
//    {
//        return Regex.IsMatch(input, @"^\d+$");
//    }
}

boolean checkPalindrome(String inputString) 
{
    int s = 0;
    for (int i = 0; i < inputString.length(); i++)
    {
        if (inputString.charAt(i) == inputString.charAt(inputString.length() - i - 1))
        {
            s++;
        }
    }
    return (s == inputString.length());    
}

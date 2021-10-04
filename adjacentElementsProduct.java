int adjacentElementsProduct(int[] inputArray) 
{
    int s = inputArray[0] * inputArray[1];
    for (int i = 1; i < inputArray.length - 1; i++)
    {
        if (s < inputArray[i] * inputArray[i + 1])
        {
            s = inputArray[i] * inputArray[i + 1];
        }
    }
    return s;
}

int makeArrayConsecutive2(int[] statues) 
{
    int max = statues[0];
    int min = statues[0];
    for (int i = 1; i < statues.length; i++)
    {
        max = Math.max(max, statues[i]);
        min = Math.min(min, statues[i]);
    }
    return (max - min - statues.length + 1);
}

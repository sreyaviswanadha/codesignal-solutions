int centuryFromYear(int yr) 
{
    if (yr % 100 == 0)
    {
        return (yr / 100);
    }
    return (yr / 100 + 1);
}

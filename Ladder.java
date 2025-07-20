public class Ladder  {
    private final int start;
    private final int end;
    Ladder(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
    public int getLadderStart()
    {
        return start;
    }
    public int getLadderEnd()
    {
        return end;
    }
}
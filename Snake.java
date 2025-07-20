public class Snake {
    private final int start;
    private final int end;
    Snake(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
    public int getSnakeStart()
    {
        return start;
    }
    public int getSnakeEnd()
    {
        return end;
    }
}

package Stop_Watch;

public class StopWatch {
    private long startTime,endTime;
    public long getStartTime(){
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}

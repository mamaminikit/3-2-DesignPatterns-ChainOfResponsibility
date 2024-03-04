/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class FileLog implements HandleLog { /* Concrete Handle */
    private HandleLog nextLog;
    @Override
    public void setTypeLog(HandleLog nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void processLog(String level, String message) {
        if (!(level.equals("INFO")))
            System.out.println("File::Logger: " + message);

        if (nextLog != null)
            nextLog.processLog(level, message);
    }
}

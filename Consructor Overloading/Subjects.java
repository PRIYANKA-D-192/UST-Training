public class Subjects {
    private String subID;
    private String name;
    private int maxmarks;
    private int marksObtain;

    Subjects(String subID,String name)
    {
        this.subID=subID;
        this.name=name;
    }
    Subjects(String subID,String name,int maxmarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxmarks=maxmarks;
    }
    Subjects(String subID,String name,int maxmarks,int marksObtain)
    {
        this.subID=subID;
        this.name=name;
        this.maxmarks=maxmarks;
        this.marksObtain=marksObtain;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public int getMaxmarks() {
        return maxmarks;
    }

    public String getSubID() {
        return subID;
    }

    //setters

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public void setMaxmarks(int maxmarks) {
        this.maxmarks = maxmarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }
}

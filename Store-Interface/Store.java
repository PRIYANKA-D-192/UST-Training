public class Store {

    Member mem[]=new Member[100];
    int count=0;
    public void register(Member s)
    {
        mem[count++]=s;
    }
    public void invite()
    {
        for(int i=0;i<count;i++)
        {
            //System.out.print(mem[i]);
            mem[i].callBack();
        }
    }
}

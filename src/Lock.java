

public class Lock{
    protected Object monitorObject = new Object();
    protected boolean isLocked = false;

    public void lock() throws InterruptedException{
        synchronized(this){
            while(isLocked){
                synchronized(this.monitorObject){
                    this.monitorObject.wait();
                }
            }
            isLocked = true;
        }
    }

    public void unlock(){
        synchronized(this){
            this.isLocked = false;
            synchronized(this.monitorObject){
                this.monitorObject.notify();
            }
        }
    }
}
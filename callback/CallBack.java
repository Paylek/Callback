package callback;

class CallBack implements CallBackDemo {
    public static void main(String[] args) {
        CallBack callBack = new CallBack();
        callBack.action();
    }

    @Override
    public void action() {
        Time time = new Time();
        time.run.start();

    }
}

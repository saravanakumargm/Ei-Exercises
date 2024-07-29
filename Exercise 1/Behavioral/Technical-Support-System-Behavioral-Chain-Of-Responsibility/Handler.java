public interface Handler {
    public void setNextHandler(Handler nextHandler);
    public  void handle(int issue);
}

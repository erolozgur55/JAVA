package OOP.Example3;

public class Subscribe {   private String name;
    private boolean doYouWannaSubscribe;
    membership whichMember;

    public Subscribe(String name, boolean doYouWannaSubscribe, int whichMember) {
        setName(name);
        setDoYouWannaSubscriber(doYouWannaSubscribe);
        setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscriber(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }

    public membership getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(int whichMember) {
        if (whichMember == 1) {
            System.out.println("Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
            this.whichMember = membership.GOLD;
        } else if (whichMember == 2) {
            System.out.println("Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
            this.whichMember = membership.SILVER;
        } else if (whichMember == 3) {
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
            this.whichMember = membership.BRONZE;
        }
    }

    @Override
    public String toString() {
        return "Subscribe" + " " + name + " " + doYouWannaSubscribe + " " + whichMember;
    }
}

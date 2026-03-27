public abstract class Member {
    protected int memberId;
    protected String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public abstract int getMaxBooks();

    public void display() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
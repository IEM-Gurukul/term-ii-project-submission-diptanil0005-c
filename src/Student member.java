public class StudentMember extends Member {

    public StudentMember(int id, String name) {
        super(id, name);
    }

    @Override
    public int getMaxBooks() {
        return 2;
    }
}
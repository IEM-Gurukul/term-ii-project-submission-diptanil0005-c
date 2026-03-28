public class FacultyMember extends Member {

    public FacultyMember(int id, String name) {
        super(id, name);
    }

    @Override
    public int getMaxBooks() {
        return 5;
    }
}
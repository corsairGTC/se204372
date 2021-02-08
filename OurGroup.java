import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Teerawat Chanu 6120501711 "); //captain
        groupMembers.add("Kongphop Assawarerkpirom 6120502653"); //PUT YOUR NAME HERE
        groupMembers.add("Kanin Wongsuree 6120502661"); //PUT YOUR NAME HERE
        groupMembers.add("Narawut Boonruang 6120503901 "); //PUT YOUR NAME HERE
        groupMembers.add(" "); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}

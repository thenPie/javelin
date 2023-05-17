package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    private List<StudentGroup> groups;

    public List<StudentGroup> getSteam() {
        return groups;
    }

    public StudentSteam(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            
            private Integer index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(index++);
            }

        };
    }
    
}

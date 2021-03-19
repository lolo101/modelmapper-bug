import java.util.Objects;

public class SourceItem {
    private final String name;

    public SourceItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SourceItem sourceItem = (SourceItem) o;
        return name.equals(sourceItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

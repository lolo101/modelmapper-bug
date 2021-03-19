import java.util.Objects;

public class DestinationNode {
    private DestinationItem item;

    public DestinationItem getItem() {
        return item;
    }

    public void setItem(DestinationItem item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DestinationNode destinationNode = (DestinationNode) o;
        return item.equals(destinationNode.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }

    @Override
    public String toString() {
        return "{item=" + item + '}';
    }
}

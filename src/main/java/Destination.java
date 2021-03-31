import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Destination {
    private Collection<DestinationItem> items;
    private DestinationNode node1;
    private DestinationNode node2;

    public Collection<DestinationItem> getItems() {
        return items;
    }

    public void setItems(Collection<DestinationItem> items) {
        this.items = items;
    }

    public DestinationNode getNode1() {
        return node1;
    }

    public void setNode1(DestinationNode node1) {
        this.node1 = node1;
    }

    public DestinationNode getNode2() {
        return node2;
    }

    public void setNode2(DestinationNode node2) {
        this.node2 = node2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Arrays.equals(items.toArray(), that.items.toArray())
                && node1.equals(that.node1)
                && node2.equals(that.node2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, node1, node2);
    }

    @Override
    public String toString() {
        return "{items=" + items + ", node1=" + node1 + ", node2=" + node2 + '}';
    }
}

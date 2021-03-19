import java.util.Collection;

public class Source {
    private final Collection<SourceItem> items;
    private final SourceNode node1;
    private final SourceNode node2;

    public Source(Collection<SourceItem> items, SourceNode node1, SourceNode node2) {
        this.items = items;
        this.node1 = node1;
        this.node2 = node2;
    }

    public Collection<SourceItem> getItems() {
        return items;
    }

    public SourceNode getNode1() {
        return node1;
    }

    public SourceNode getNode2() {
        return node2;
    }
}

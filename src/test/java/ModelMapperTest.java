import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import static java.util.Collections.singleton;
import static org.assertj.core.api.Assertions.assertThat;

public class ModelMapperTest {
    private ModelMapper modelMapper;

    @BeforeEach
    void beforeAll() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Test
    void testModelMapper() {
        SourceItem sItem1 = new SourceItem("item1");
        SourceItem sItem2 = new SourceItem("item2");
        SourceNode sNode1 = new SourceNode(sItem1);
        SourceNode sNode2 = new SourceNode(sItem2);
        Source source = new Source(singleton(sItem1), sNode1, sNode2);

        Destination actual = modelMapper.map(source, Destination.class);

        DestinationItem dItem1 = new DestinationItem();
        dItem1.setName("item1");
        DestinationItem dItem2 = new DestinationItem();
        dItem2.setName("item2");
        DestinationNode dNode1 = new DestinationNode();
        dNode1.setItem(dItem1);
        DestinationNode dNode2 = new DestinationNode();
        dNode2.setItem(dItem2);
        Destination expected = new Destination();
        expected.setItems(singleton(dItem1));
        expected.setNode1(dNode1);
        expected.setNode2(dNode2);
        assertThat(actual).isEqualTo(expected);
    }
}

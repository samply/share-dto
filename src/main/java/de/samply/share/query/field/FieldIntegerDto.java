package de.samply.share.query.field;

import de.samply.share.query.value.ValueIntegerDto;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FieldIntegerDto extends AbstractQueryFieldDto<Integer, ValueIntegerDto>
    implements Serializable {

}

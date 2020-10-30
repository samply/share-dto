package de.samply.share.query.field;

import de.samply.share.query.value.ValueStringDto;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FieldStringDto extends AbstractQueryFieldDto<String, ValueStringDto>
    implements Serializable {

}

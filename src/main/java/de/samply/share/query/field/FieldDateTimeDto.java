package de.samply.share.query.field;

import de.samply.share.query.value.ValueDateTimeDto;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FieldDateTimeDto extends AbstractQueryFieldDto<Date, ValueDateTimeDto>
    implements Serializable {

}

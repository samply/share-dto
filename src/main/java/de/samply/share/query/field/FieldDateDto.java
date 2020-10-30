package de.samply.share.query.field;

import de.samply.share.query.value.ValueDateDto;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FieldDateDto extends AbstractQueryFieldDto<Date, ValueDateDto>
    implements Serializable {

}

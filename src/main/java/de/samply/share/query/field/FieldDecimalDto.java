package de.samply.share.query.field;

import de.samply.share.query.value.ValueDecimalDto;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FieldDecimalDto extends AbstractQueryFieldDto<Double, ValueDecimalDto>
    implements Serializable {

}

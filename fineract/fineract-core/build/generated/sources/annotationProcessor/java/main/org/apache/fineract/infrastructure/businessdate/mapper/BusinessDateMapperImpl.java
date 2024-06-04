package org.apache.fineract.infrastructure.businessdate.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.infrastructure.businessdate.data.BusinessDateData;
import org.apache.fineract.infrastructure.businessdate.domain.BusinessDate;
import org.apache.fineract.infrastructure.businessdate.domain.BusinessDateType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-03T19:21:56+0000",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.6.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class BusinessDateMapperImpl implements BusinessDateMapper {

    @Override
    public BusinessDateData map(BusinessDate source) {
        if ( source == null ) {
            return null;
        }

        BusinessDateData businessDateData = new BusinessDateData();

        businessDateData.setDescription( sourceTypeDescription( source ) );
        if ( source.getType() != null ) {
            businessDateData.setType( source.getType().name() );
        }
        businessDateData.setDate( source.getDate() );

        return businessDateData;
    }

    @Override
    public List<BusinessDateData> map(List<BusinessDate> sources) {
        if ( sources == null ) {
            return null;
        }

        List<BusinessDateData> list = new ArrayList<BusinessDateData>( sources.size() );
        for ( BusinessDate businessDate : sources ) {
            list.add( map( businessDate ) );
        }

        return list;
    }

    private String sourceTypeDescription(BusinessDate businessDate) {
        if ( businessDate == null ) {
            return null;
        }
        BusinessDateType type = businessDate.getType();
        if ( type == null ) {
            return null;
        }
        String description = type.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }
}

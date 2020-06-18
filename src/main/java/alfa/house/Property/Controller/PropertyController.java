package alfa.house.Property.Controller;

import alfa.house.Property.Model.InlineResponse200;
import alfa.house.Property.Model.Property;
import alfa.house.Property.Service.PropertyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController implements PropertyInterface {

    @Autowired
    PropertyServiceImp service;

    @Override
    public InlineResponse200 createProperty(@Validated Property property) {
        return service.createProperty(property);
    }
}

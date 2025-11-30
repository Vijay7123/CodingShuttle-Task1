package com.mavericks.tasks.Task1.Flavors;

import com.mavericks.tasks.Task1.interfaces.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("berryFlavor")
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}

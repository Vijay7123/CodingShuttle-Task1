package com.mavericks.tasks.Task1.Flavors;

import com.mavericks.tasks.Task1.interfaces.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocoFlavor")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting.";
    }
}

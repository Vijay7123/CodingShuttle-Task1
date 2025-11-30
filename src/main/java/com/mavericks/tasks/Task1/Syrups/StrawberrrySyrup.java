package com.mavericks.tasks.Task1.Syrups;

import com.mavericks.tasks.Task1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("berrySyrup")
public class StrawberrrySyrup implements Syrup {

    @Override
    public String getSyrupType(){
        return "Strawberry Syrup is added.";
    }

}

package com.mavericks.tasks.Task1.Syrups;

import com.mavericks.tasks.Task1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mangoSyrup")
public class MangoSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Mango Syrup is added.";
    }
}

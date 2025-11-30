package com.mavericks.tasks.Task1.Syrups;

import com.mavericks.tasks.Task1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chocoSyrup")
public class ChocolateSyrup implements Syrup
{

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup is added to your cake.";
    }
}

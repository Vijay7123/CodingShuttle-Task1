package com.mavericks.tasks.Task1;

import com.mavericks.tasks.Task1.interfaces.Frosting;
import com.mavericks.tasks.Task1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;

    private final Syrup syrup;

    public CakeBaker(@Qualifier("berryFlavor") Frosting frosting, @Qualifier("chocoSyrup")Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        System.out.println("Cake is preparing.");
        System.out.println("Frosting type:"+frosting.getFrostingType());
        System.out.println("Syrup type:"+syrup.getSyrupType());
    }
}

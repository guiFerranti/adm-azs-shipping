package com.guilherme.AZShip.architeture;


import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTag;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.boot.test.context.SpringBootTest;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.guilherme.AZShip")
@SpringBootTest
public class LayeredArchitectureTest {

    @ArchTest
    public static final ArchRule layered_architecture_test = layeredArchitecture()
            .consideringAllDependencies()

            .layer("AdaptersIn")
            .definedBy("..adapters.in..")

            .layer("AdaptersOut")
            .definedBy("..adapters.out..")

            .layer("UseCase")
            .definedBy("..application.core.useCase..")

            .layer("PortsIn")
            .definedBy("..application.ports.in..")

            .layer("PortsOut")
            .definedBy("..application.ports.out..")

            .layer("Config")
            .definedBy("..config..")

            // layer AdapterIn control
            .whereLayer("AdaptersIn").mayOnlyBeAccessedByLayers("Config")

            // layer AdapterOut control
            .whereLayer("AdaptersOut").mayOnlyBeAccessedByLayers("Config")

            // layer UseCase control
            .whereLayer("UseCase").mayOnlyBeAccessedByLayers("Config")

            // layer PortsIn control
            .whereLayer("PortsIn").mayOnlyBeAccessedByLayers("UseCase", "AdaptersIn")

            // layer PortsOut control
            .whereLayer("PortsOut").mayOnlyBeAccessedByLayers("UseCase", "AdaptersOut");

            // layer Config control
//            .whereLayer("Config").mayNotBeAccessedByAnyLayer();





}

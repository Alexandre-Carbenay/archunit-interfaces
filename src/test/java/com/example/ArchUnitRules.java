package com.example;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.example")
public class ArchUnitRules {

    @ArchTest
    public static final ArchRule rootUsage = classes().that().resideInAPackage("com.example.root..")
                    .should().onlyBeAccessed().byClassesThat().resideInAPackage("com.example.usage1..");

    @ArchTest
    public static final ArchRule childUsage = classes().that().resideInAPackage("com.example.child..")
                    .should().onlyBeAccessed().byClassesThat().resideInAPackage("com.example.usage2..");

}

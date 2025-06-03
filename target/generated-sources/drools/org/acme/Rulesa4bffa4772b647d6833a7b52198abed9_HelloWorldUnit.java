package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;

public class Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit extends Rulesa4bffa4772b647d6833a7b52198abed9 {

    @Override
    public String getName() {
        return super.getName() + ".HelloWorldUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit_rule_R1.rule_R1(),
                                       Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit_rule_R2.rule_R2(),
                                       Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit_rule_R3.rule_R3());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("dataPersons"),
                                       D.entryPoint("strings"));
    }

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<org.acme.DataPerson>> var_dataPersons = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<org.acme.DataPerson>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                                      "org.acme",
                                                                                                                                      "dataPersons");

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<java.lang.String>> var_strings = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<java.lang.String>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                               "org.acme",
                                                                                                                               "strings");

    public static final org.drools.model.Global<java.util.List<java.lang.String>> var_results = D.globalOf(new org.drools.model.TypeReference<java.util.List<java.lang.String>>(java.util.List.class),
                                                                                                           "org.acme",
                                                                                                           "results");

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }

    {
        globals.add(var_dataPersons);
        globals.add(var_strings);
        globals.add(var_results);
    }
}

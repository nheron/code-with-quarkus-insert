package org.acme.P91;


import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence91253E231D979A6A528AA9E10D08B387 implements org.drools.model.functions.Block3<org.drools.ruleunits.api.DataStore<org.acme.DataPerson>, java.util.List<java.lang.String>, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D682AC3596E8665FCF2C7E952049A56C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.acme.DataPerson> dataPersons, java.util.List<java.lang.String> results, java.lang.String $s) throws java.lang.Exception {
        results.add("Hello " + $s);
        DataPerson person = new DataPerson();
        person.setName($s);
        dataPersons.add(person);
    }
}

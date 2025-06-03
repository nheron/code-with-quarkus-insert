package org.acme.PAE;


import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceAE1DB1ED4A1D9A473EB42EEB1DE12BCA implements org.drools.model.functions.Block4<org.drools.model.Drools, org.drools.ruleunits.api.DataStore<org.acme.DataPerson>, java.util.List<java.lang.String>, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "418BB54E993DE4B920D25A17C800D3CD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.model.Drools drools, org.drools.ruleunits.api.DataStore<org.acme.DataPerson> dataPersons, java.util.List<java.lang.String> results, java.lang.String $s) throws java.lang.Exception {
        results.add("Hello " + $s);
        DataPerson person = new DataPerson();
        person.setName($s);
        dataPersons.add(person);
        org.kie.api.runtime.KieRuntime toto = ((org.drools.modelcompiler.consequence.DroolsImpl) drools).asKnowledgeHelper().getKieRuntime();
        toto.insert(person);
    }
}

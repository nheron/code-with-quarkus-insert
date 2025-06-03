package org.acme.PA3;


import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA3D49C2803ED5E273776EA0214127490 implements org.drools.model.functions.Predicate1<java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5BE64BCDA8CE06809BEFE47CF62ED453";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(java.lang.String _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.length(), 2);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("length > 2");
        info.addRuleNames("R1", "/home/nheron/workspace-vss-kie-platform/pymma-kie-platform/Ex-drools-quarkus-10.0/src/main/resources/org/acme/sample.drl");
        return info;
    }
}

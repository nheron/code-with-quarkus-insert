package org.acme.PDD;


import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateDD94BE0CD4FD36E386317D02A80EA515 implements org.drools.model.functions.Predicate1<java.lang.String>, org.drools.model.functions.HashedExpression {

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

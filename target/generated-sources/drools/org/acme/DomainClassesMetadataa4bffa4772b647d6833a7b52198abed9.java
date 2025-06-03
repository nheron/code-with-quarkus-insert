package org.acme;
public class DomainClassesMetadataa4bffa4772b647d6833a7b52198abed9 {

    public static final org.drools.model.DomainClassMetadata org_drools_ruleunits_api_DataStore_Metadata_INSTANCE = new org_drools_ruleunits_api_DataStore_Metadata();
    private static class org_drools_ruleunits_api_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.drools.ruleunits.api.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.drools.ruleunits.api.DataStore");
        }
    }
    public static final org.drools.model.DomainClassMetadata java_util_List_Metadata_INSTANCE = new java_util_List_Metadata();
    private static class java_util_List_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.util.List.class;
        }

        @Override
        public int getPropertiesSize() {
            return 15;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "empty": return 1;
                case "first": return 2;
                case "last": return 3;
                case "parallelStream": return 4;
                case "stream": return 5;
                case "iterator": return 6;
                case "listIterator": return 7;
                case "of": return 8;
                case "removeFirst": return 9;
                case "removeLast": return 10;
                case "reversed": return 11;
                case "size": return 12;
                case "spliterator": return 13;
                case "toArray": return 14;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface java.util.List");
        }
    }
    public static final org.drools.model.DomainClassMetadata java_lang_String_Metadata_INSTANCE = new java_lang_String_Metadata();
    private static class java_lang_String_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.lang.String.class;
        }

        @Override
        public int getPropertiesSize() {
            return 19;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "blank": return 1;
                case "bytes": return 2;
                case "empty": return 3;
                case "chars": return 4;
                case "codePoints": return 5;
                case "describeConstable": return 6;
                case "intern": return 7;
                case "length": return 8;
                case "lines": return 9;
                case "strip": return 10;
                case "stripIndent": return 11;
                case "stripLeading": return 12;
                case "stripTrailing": return 13;
                case "toCharArray": return 14;
                case "toLowerCase": return 15;
                case "toUpperCase": return 16;
                case "translateEscapes": return 17;
                case "trim": return 18;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.lang.String");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_acme_DataPerson_Metadata_INSTANCE = new org_acme_DataPerson_Metadata();
    private static class org_acme_DataPerson_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.DataPerson.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "name": return 1;
                case "surname": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.DataPerson");
        }
    }
}
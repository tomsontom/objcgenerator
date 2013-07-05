package at.bestsolution.objc.mapper.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.objc.mapper.services.MapperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_JDOC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'native'", "'framework'", "'mapped-to'", "'import'", "'id'", "'<'", "'>'", "'*'", "'deprecated'", "'protocol'", "'since'", "'{'", "'}'", "'-'", "'+'", "'('", "')'", "';'", "':'", "'const'", "'class'", "'inherits'", "'conforms'", "','", "'initializers'", "'.'", "'@property'", "'='", "'enum'", "'typedef'", "'struct'", "'void'", "'BOOL'", "'double'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int RULE_JDOC=6;

    // delegates
    // delegators


        public InternalMapperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapperParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g"; }



     	private MapperGrammarAccess grammarAccess;
     	
        public InternalMapperParser(TokenStream input, MapperGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PackageDeclaration";	
       	}
       	
       	@Override
       	protected MapperGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackageDeclaration"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:67:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:68:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:69:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration75);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:76:1: rulePackageDeclaration returns [EObject current=null] : ( ( (lv_native_0_0= 'native' ) )? otherlv_1= 'framework' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'mapped-to' ( (lv_javaPackage_4_0= ruleQualifiedName ) ) ( (lv_imports_5_0= ruleImport ) )* ( (lv_types_6_0= ruleType ) )+ ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_native_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_javaPackage_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_types_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:79:28: ( ( ( (lv_native_0_0= 'native' ) )? otherlv_1= 'framework' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'mapped-to' ( (lv_javaPackage_4_0= ruleQualifiedName ) ) ( (lv_imports_5_0= ruleImport ) )* ( (lv_types_6_0= ruleType ) )+ ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:80:1: ( ( (lv_native_0_0= 'native' ) )? otherlv_1= 'framework' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'mapped-to' ( (lv_javaPackage_4_0= ruleQualifiedName ) ) ( (lv_imports_5_0= ruleImport ) )* ( (lv_types_6_0= ruleType ) )+ )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:80:1: ( ( (lv_native_0_0= 'native' ) )? otherlv_1= 'framework' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'mapped-to' ( (lv_javaPackage_4_0= ruleQualifiedName ) ) ( (lv_imports_5_0= ruleImport ) )* ( (lv_types_6_0= ruleType ) )+ )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:80:2: ( (lv_native_0_0= 'native' ) )? otherlv_1= 'framework' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'mapped-to' ( (lv_javaPackage_4_0= ruleQualifiedName ) ) ( (lv_imports_5_0= ruleImport ) )* ( (lv_types_6_0= ruleType ) )+
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:80:2: ( (lv_native_0_0= 'native' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:81:1: (lv_native_0_0= 'native' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:81:1: (lv_native_0_0= 'native' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:82:3: lv_native_0_0= 'native'
                    {
                    lv_native_0_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration128); 

                            newLeafNode(lv_native_0_0, grammarAccess.getPackageDeclarationAccess().getNativeNativeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "native", true, "native");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration154); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageDeclarationAccess().getFrameworkKeyword_1());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:99:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:100:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:100:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:101:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageDeclaration171); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration188); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getMappedToKeyword_3());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:121:1: ( (lv_javaPackage_4_0= ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:122:1: (lv_javaPackage_4_0= ruleQualifiedName )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:122:1: (lv_javaPackage_4_0= ruleQualifiedName )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:123:3: lv_javaPackage_4_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getJavaPackageQualifiedNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration209);
            lv_javaPackage_4_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"javaPackage",
                    		lv_javaPackage_4_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:139:2: ( (lv_imports_5_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:140:1: (lv_imports_5_0= ruleImport )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:140:1: (lv_imports_5_0= ruleImport )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:141:3: lv_imports_5_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageDeclaration230);
            	    lv_imports_5_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_5_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:157:3: ( (lv_types_6_0= ruleType ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_JDOC||(LA3_0>=20 && LA3_0<=21)||LA3_0==32||(LA3_0>=40 && LA3_0<=41)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:158:1: (lv_types_6_0= ruleType )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:158:1: (lv_types_6_0= ruleType )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:159:3: lv_types_6_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getTypesTypeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_rulePackageDeclaration252);
            	    lv_types_6_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_6_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:183:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:184:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:185:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport289);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:192:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:195:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:196:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:196:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:196:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport336); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:200:1: ( ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:201:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:201:1: ( (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:202:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:202:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:203:3: lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport359);
                    lv_importedNamespace_1_1=ruleQualifiedNameWithWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_1, 
                            		"QualifiedNameWithWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:218:8: lv_importedNamespace_1_2= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport378);
                    lv_importedNamespace_1_2=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_2, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:244:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:245:2: (iv_ruleType= ruleType EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:246:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType417);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:253:1: ruleType returns [EObject current=null] : (this_Protocol_0= ruleProtocol | this_Class_1= ruleClass | this_Enum_2= ruleEnum | this_TypeDef_3= ruleTypeDef ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Protocol_0 = null;

        EObject this_Class_1 = null;

        EObject this_Enum_2 = null;

        EObject this_TypeDef_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:256:28: ( (this_Protocol_0= ruleProtocol | this_Class_1= ruleClass | this_Enum_2= ruleEnum | this_TypeDef_3= ruleTypeDef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:257:1: (this_Protocol_0= ruleProtocol | this_Class_1= ruleClass | this_Enum_2= ruleEnum | this_TypeDef_3= ruleTypeDef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:257:1: (this_Protocol_0= ruleProtocol | this_Class_1= ruleClass | this_Enum_2= ruleEnum | this_TypeDef_3= ruleTypeDef )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:258:5: this_Protocol_0= ruleProtocol
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getProtocolParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProtocol_in_ruleType474);
                    this_Protocol_0=ruleProtocol();

                    state._fsp--;

                     
                            current = this_Protocol_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:268:5: this_Class_1= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleType501);
                    this_Class_1=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:278:5: this_Enum_2= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleType528);
                    this_Enum_2=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:288:5: this_TypeDef_3= ruleTypeDef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleType555);
                    this_TypeDef_3=ruleTypeDef();

                    state._fsp--;

                     
                            current = this_TypeDef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeRef"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:304:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:305:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:306:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef590);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:313:1: ruleTypeRef returns [EObject current=null] : ( (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? ) | ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? ) | ( (lv_builtin_9_0= ruleBuiltinType ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_genericType_6_0 = null;

        AntlrDatatypeRuleToken lv_builtin_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:316:28: ( ( (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? ) | ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? ) | ( (lv_builtin_9_0= ruleBuiltinType ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:317:1: ( (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? ) | ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? ) | ( (lv_builtin_9_0= ruleBuiltinType ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:317:1: ( (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? ) | ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? ) | ( (lv_builtin_9_0= ruleBuiltinType ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:317:2: (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:317:2: (otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )? )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:317:4: otherlv_0= 'id' (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )?
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeRef638); 

                        	newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getIdKeyword_0_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:321:1: (otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:321:3: otherlv_1= '<' ( ( ruleQualifiedName ) ) otherlv_3= '>'
                            {
                            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTypeRef651); 

                                	newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getLessThanSignKeyword_0_1_0());
                                
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:325:1: ( ( ruleQualifiedName ) )
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:326:1: ( ruleQualifiedName )
                            {
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:326:1: ( ruleQualifiedName )
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:327:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeRefRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef674);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleTypeRef686); 

                                	newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_0_1_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:345:6: ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:345:6: ( ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )? )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:345:7: ( ( ruleQualifiedName ) ) (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )? (otherlv_8= '*' )?
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:345:7: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:346:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:346:1: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:347:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef719);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:360:2: (otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:360:4: otherlv_5= '<' ( (lv_genericType_6_0= ruleTypeRef ) ) otherlv_7= '>'
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTypeRef732); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeRefAccess().getLessThanSignKeyword_1_1_0());
                                
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:364:1: ( (lv_genericType_6_0= ruleTypeRef ) )
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:365:1: (lv_genericType_6_0= ruleTypeRef )
                            {
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:365:1: (lv_genericType_6_0= ruleTypeRef )
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:366:3: lv_genericType_6_0= ruleTypeRef
                            {
                             
                            	        newCompositeNode(grammarAccess.getTypeRefAccess().getGenericTypeTypeRefParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeRef753);
                            lv_genericType_6_0=ruleTypeRef();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTypeRefRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"genericType",
                                    		lv_genericType_6_0, 
                                    		"TypeRef");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleTypeRef765); 

                                	newLeafNode(otherlv_7, grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_1_1_2());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:386:3: (otherlv_8= '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:386:5: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleTypeRef780); 

                                	newLeafNode(otherlv_8, grammarAccess.getTypeRefAccess().getAsteriskKeyword_1_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:391:6: ( (lv_builtin_9_0= ruleBuiltinType ) )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:391:6: ( (lv_builtin_9_0= ruleBuiltinType ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:392:1: (lv_builtin_9_0= ruleBuiltinType )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:392:1: (lv_builtin_9_0= ruleBuiltinType )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:393:3: lv_builtin_9_0= ruleBuiltinType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeRefAccess().getBuiltinBuiltinTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBuiltinType_in_ruleTypeRef810);
                    lv_builtin_9_0=ruleBuiltinType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRefRule());
                    	        }
                           		set(
                           			current, 
                           			"builtin",
                            		lv_builtin_9_0, 
                            		"BuiltinType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleProtocol"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:417:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:418:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:419:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol846);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol856); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:426:1: ruleProtocol returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'protocol' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) otherlv_7= '{' ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_doc_0_0 = null;

        EObject lv_deprecated_2_0 = null;

        EObject lv_since_6_0 = null;

        EObject lv_messages_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:429:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'protocol' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) otherlv_7= '{' ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:430:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'protocol' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) otherlv_7= '{' ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:430:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'protocol' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) otherlv_7= '{' ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:430:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'protocol' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) otherlv_7= '{' ( (lv_messages_8_0= ruleMessage ) )* otherlv_9= '}'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:430:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_JDOC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:431:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:431:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:432:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getProtocolAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleProtocol902);
                    lv_doc_0_0=ruleDocu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"Docu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:448:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:448:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleProtocol916); 

                        	newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:452:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:453:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:453:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:454:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProtocolAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleProtocol937);
                    lv_deprecated_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProtocolRule());
                    	        }
                           		set(
                           			current, 
                           			"deprecated",
                            		lv_deprecated_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleProtocol951); 

                	newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getProtocolKeyword_2());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:474:1: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:475:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:475:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:476:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProtocol968); 

            			newLeafNode(lv_name_4_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProtocolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleProtocol985); 

                	newLeafNode(otherlv_5, grammarAccess.getProtocolAccess().getSinceKeyword_4());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:496:1: ( (lv_since_6_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:497:1: (lv_since_6_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:497:1: (lv_since_6_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:498:3: lv_since_6_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getSinceVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleProtocol1006);
            lv_since_6_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"since",
                    		lv_since_6_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleProtocol1018); 

                	newLeafNode(otherlv_7, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_6());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:518:1: ( (lv_messages_8_0= ruleMessage ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_JDOC||LA12_0==20||(LA12_0>=25 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:519:1: (lv_messages_8_0= ruleMessage )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:519:1: (lv_messages_8_0= ruleMessage )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:520:3: lv_messages_8_0= ruleMessage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtocolAccess().getMessagesMessageParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessage_in_ruleProtocol1039);
            	    lv_messages_8_0=ruleMessage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_8_0, 
            	            		"Message");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleProtocol1052); 

                	newLeafNode(otherlv_9, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleMessage"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:548:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:549:2: (iv_ruleMessage= ruleMessage EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:550:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1088);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:557:1: ruleMessage returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) otherlv_11= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_doc_0_0 = null;

        EObject lv_deprecated_2_0 = null;

        EObject lv_returnValue_6_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_since_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:560:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) otherlv_11= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) otherlv_11= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) otherlv_11= ';'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_JDOC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:562:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:562:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:563:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleMessage1144);
                    lv_doc_0_0=ruleDocu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"Docu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:579:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:579:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMessage1158); 

                        	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:583:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:584:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:584:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:585:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleMessage1179);
                    lv_deprecated_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	        }
                           		set(
                           			current, 
                           			"deprecated",
                            		lv_deprecated_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:601:4: (otherlv_3= '-' | otherlv_4= '+' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:601:6: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleMessage1194); 

                        	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getHyphenMinusKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:606:7: otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleMessage1212); 

                        	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getPlusSignKeyword_2_1());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleMessage1225); 

                	newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_3());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:614:1: ( (lv_returnValue_6_0= ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:615:1: (lv_returnValue_6_0= ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:615:1: (lv_returnValue_6_0= ruleTypeRef )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:616:3: lv_returnValue_6_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getReturnValueTypeRefParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleMessage1246);
            lv_returnValue_6_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	        }
                   		set(
                   			current, 
                   			"returnValue",
                    		lv_returnValue_6_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleMessage1258); 

                	newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getRightParenthesisKeyword_5());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:636:1: ( (lv_elements_8_0= ruleMessageElement ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:637:1: (lv_elements_8_0= ruleMessageElement )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:637:1: (lv_elements_8_0= ruleMessageElement )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:638:3: lv_elements_8_0= ruleMessageElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageElement_in_ruleMessage1279);
            	    lv_elements_8_0=ruleMessageElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_8_0, 
            	            		"MessageElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMessage1292); 

                	newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getSinceKeyword_7());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:658:1: ( (lv_since_10_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:659:1: (lv_since_10_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:659:1: (lv_since_10_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:660:3: lv_since_10_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getSinceVersionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleMessage1313);
            lv_since_10_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	        }
                   		set(
                   			current, 
                   			"since",
                    		lv_since_10_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleMessage1325); 

                	newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageElement"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:688:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:689:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:690:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
             newCompositeNode(grammarAccess.getMessageElementRule()); 
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1361);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;

             current =iv_ruleMessageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageElement"


    // $ANTLR start "ruleMessageElement"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:697:1: ruleMessageElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMessageElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_variable_6_0=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:700:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:701:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:701:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:701:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:701:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:702:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:702:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:703:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageElement1413); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMessageElementAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:719:2: (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:719:4: otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMessageElement1431); 

                        	newLeafNode(otherlv_1, grammarAccess.getMessageElementAccess().getColonKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMessageElement1443); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:727:1: (otherlv_3= 'const' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:727:3: otherlv_3= 'const'
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleMessageElement1456); 

                                	newLeafNode(otherlv_3, grammarAccess.getMessageElementAccess().getConstKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:731:3: ( (lv_type_4_0= ruleTypeRef ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:732:1: (lv_type_4_0= ruleTypeRef )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:732:1: (lv_type_4_0= ruleTypeRef )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:733:3: lv_type_4_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageElementAccess().getTypeTypeRefParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleMessageElement1479);
                    lv_type_4_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageElementRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMessageElement1491); 

                        	newLeafNode(otherlv_5, grammarAccess.getMessageElementAccess().getRightParenthesisKeyword_1_4());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:753:1: ( (lv_variable_6_0= RULE_ID ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:754:1: (lv_variable_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:754:1: (lv_variable_6_0= RULE_ID )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:755:3: lv_variable_6_0= RULE_ID
                    {
                    lv_variable_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageElement1508); 

                    			newLeafNode(lv_variable_6_0, grammarAccess.getMessageElementAccess().getVariableIDTerminalRuleCall_1_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variable",
                            		lv_variable_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageElement"


    // $ANTLR start "entryRuleClass"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:779:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:780:2: (iv_ruleClass= ruleClass EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:781:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1551);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:788:1: ruleClass returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_doc_0_0 = null;

        EObject lv_deprecated_2_0 = null;

        EObject lv_since_6_0 = null;

        EObject lv_initializerMessages_16_0 = null;

        EObject lv_properties_18_0 = null;

        EObject lv_messages_19_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:791:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:792:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:792:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:792:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:792:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_JDOC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:793:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:793:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:794:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleClass1607);
                    lv_doc_0_0=ruleDocu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"Docu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:810:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:810:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClass1621); 

                        	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:814:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:815:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:815:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:816:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleClass1642);
                    lv_deprecated_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"deprecated",
                            		lv_deprecated_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleClass1656); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:836:1: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:837:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:837:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:838:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1673); 

            			newLeafNode(lv_name_4_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleClass1690); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSinceKeyword_4());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:858:1: ( (lv_since_6_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:859:1: (lv_since_6_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:859:1: (lv_since_6_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:860:3: lv_since_6_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getSinceVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleClass1711);
            lv_since_6_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	        }
                   		set(
                   			current, 
                   			"since",
                    		lv_since_6_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:876:2: (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:876:4: otherlv_7= 'inherits' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleClass1724); 

                        	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getInheritsKeyword_6_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:880:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:881:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:881:1: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:882:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getParentClassCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1747);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:895:4: (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:895:6: otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleClass1762); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getConformsKeyword_7_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:899:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:900:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:900:1: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:901:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1785);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:914:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==35) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:914:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleClass1798); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:918:1: ( ( ruleQualifiedName ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:919:1: ( ruleQualifiedName )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:919:1: ( ruleQualifiedName )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:920:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1821);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleClass1837); 

                	newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:937:1: (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:937:3: otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleClass1850); 

                        	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getInitializersKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleClass1862); 

                        	newLeafNode(otherlv_15, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:945:1: ( (lv_initializerMessages_16_0= ruleMessage ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_JDOC||LA24_0==20||(LA24_0>=25 && LA24_0<=26)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:946:1: (lv_initializerMessages_16_0= ruleMessage )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:946:1: (lv_initializerMessages_16_0= ruleMessage )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:947:3: lv_initializerMessages_16_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getInitializerMessagesMessageParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleClass1883);
                    	    lv_initializerMessages_16_0=ruleMessage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initializerMessages",
                    	            		lv_initializerMessages_16_0, 
                    	            		"Message");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleClass1896); 

                        	newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:967:3: ( (lv_properties_18_0= ruleProperty ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==20) ) {
                        int LA26_2 = input.LA(3);

                        if ( (LA26_2==RULE_INT) ) {
                            int LA26_5 = input.LA(4);

                            if ( (LA26_5==37) ) {
                                int LA26_6 = input.LA(5);

                                if ( (LA26_6==RULE_INT) ) {
                                    int LA26_7 = input.LA(6);

                                    if ( (LA26_7==38) ) {
                                        alt26=1;
                                    }


                                }


                            }


                        }


                    }
                    else if ( (LA26_1==38) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_INT) ) {
                        int LA26_5 = input.LA(3);

                        if ( (LA26_5==37) ) {
                            int LA26_6 = input.LA(4);

                            if ( (LA26_6==RULE_INT) ) {
                                int LA26_7 = input.LA(5);

                                if ( (LA26_7==38) ) {
                                    alt26=1;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 38:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:968:1: (lv_properties_18_0= ruleProperty )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:968:1: (lv_properties_18_0= ruleProperty )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:969:3: lv_properties_18_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleClass1919);
            	    lv_properties_18_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_18_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:985:3: ( (lv_messages_19_0= ruleMessage ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_JDOC||LA27_0==20||(LA27_0>=25 && LA27_0<=26)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:986:1: (lv_messages_19_0= ruleMessage )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:986:1: (lv_messages_19_0= ruleMessage )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:987:3: lv_messages_19_0= ruleMessage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMessagesMessageParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessage_in_ruleClass1941);
            	    lv_messages_19_0=ruleMessage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_19_0, 
            	            		"Message");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleClass1954); 

                	newLeafNode(otherlv_20, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleVersion"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1015:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1016:2: (iv_ruleVersion= ruleVersion EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1017:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1990);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1024:1: ruleVersion returns [EObject current=null] : ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_sinceMajor_0_0=null;
        Token otherlv_1=null;
        Token lv_sinceMinor_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1027:28: ( ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1028:1: ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1028:1: ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1028:2: ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1028:2: ( (lv_sinceMajor_0_0= RULE_INT ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1029:1: (lv_sinceMajor_0_0= RULE_INT )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1029:1: (lv_sinceMajor_0_0= RULE_INT )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1030:3: lv_sinceMajor_0_0= RULE_INT
            {
            lv_sinceMajor_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2042); 

            			newLeafNode(lv_sinceMajor_0_0, grammarAccess.getVersionAccess().getSinceMajorINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sinceMajor",
                    		lv_sinceMajor_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleVersion2059); 

                	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1050:1: ( (lv_sinceMinor_2_0= RULE_INT ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1051:1: (lv_sinceMinor_2_0= RULE_INT )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1051:1: (lv_sinceMinor_2_0= RULE_INT )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1052:3: lv_sinceMinor_2_0= RULE_INT
            {
            lv_sinceMinor_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2076); 

            			newLeafNode(lv_sinceMinor_2_0, grammarAccess.getVersionAccess().getSinceMinorINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sinceMinor",
                    		lv_sinceMinor_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleProperty"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1076:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1077:2: (iv_ruleProperty= ruleProperty EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1078:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2117);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1085:1: ruleProperty returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_doc_0_0 = null;

        EObject lv_deprecated_2_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_since_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1088:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1089:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1089:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1089:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1089:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_JDOC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1090:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1090:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1091:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleProperty2173);
                    lv_doc_0_0=ruleDocu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"Docu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1107:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1107:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleProperty2187); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1111:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1112:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1112:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1113:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleProperty2208);
                    lv_deprecated_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"deprecated",
                            		lv_deprecated_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleProperty2222); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getPropertyKeyword_2());
                
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleProperty2234); 

                	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1137:1: ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1137:2: ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )*
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1137:2: ( (lv_attributes_5_0= rulePropertyAttribute ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1138:1: (lv_attributes_5_0= rulePropertyAttribute )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1138:1: (lv_attributes_5_0= rulePropertyAttribute )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1139:3: lv_attributes_5_0= rulePropertyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyAttribute_in_ruleProperty2256);
                    lv_attributes_5_0=rulePropertyAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_5_0, 
                            		"PropertyAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1155:2: (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==35) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1155:4: otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleProperty2269); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1159:1: ( (lv_attributes_7_0= rulePropertyAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1160:1: (lv_attributes_7_0= rulePropertyAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1160:1: (lv_attributes_7_0= rulePropertyAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1161:3: lv_attributes_7_0= rulePropertyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyAttribute_in_ruleProperty2290);
                    	    lv_attributes_7_0=rulePropertyAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_7_0, 
                    	            		"PropertyAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleProperty2306); 

                	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1181:1: ( (lv_type_9_0= ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1182:1: (lv_type_9_0= ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1182:1: (lv_type_9_0= ruleTypeRef )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1183:3: lv_type_9_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleProperty2327);
            lv_type_9_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_9_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1199:2: ( (lv_name_10_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1200:1: (lv_name_10_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1200:1: (lv_name_10_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1201:3: lv_name_10_0= RULE_ID
            {
            lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2344); 

            			newLeafNode(lv_name_10_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_10_0, 
                    		"ID");
            	    

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleProperty2361); 

                	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getSinceKeyword_8());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1221:1: ( (lv_since_12_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1222:1: (lv_since_12_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1222:1: (lv_since_12_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1223:3: lv_since_12_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getSinceVersionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleProperty2382);
            lv_since_12_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"since",
                    		lv_since_12_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleProperty2394); 

                	newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getSemicolonKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyAttribute"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1251:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1252:2: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1253:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
            {
             newCompositeNode(grammarAccess.getPropertyAttributeRule()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute2430);
            iv_rulePropertyAttribute=rulePropertyAttribute();

            state._fsp--;

             current =iv_rulePropertyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttribute2440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1260:1: rulePropertyAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? ) ;
    public final EObject rulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1263:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1264:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1264:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1264:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1264:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1265:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1265:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1266:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttribute2482); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1282:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1282:4: otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePropertyAttribute2500); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getEqualsSignKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1286:1: ( (lv_value_2_0= RULE_ID ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1287:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1287:1: (lv_value_2_0= RULE_ID )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1288:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttribute2517); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getPropertyAttributeAccess().getValueIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRuleEnum"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1312:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1313:2: (iv_ruleEnum= ruleEnum EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1314:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2560);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1321:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1324:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1325:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1325:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1325:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleEnum2607); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1330:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1330:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum2624); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEnum2641); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1351:1: ( (lv_elements_3_0= ruleEnumElement ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1352:1: (lv_elements_3_0= ruleEnumElement )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1352:1: (lv_elements_3_0= ruleEnumElement )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1353:3: lv_elements_3_0= ruleEnumElement
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum2662);
            lv_elements_3_0=ruleEnumElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_3_0, 
                    		"EnumElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1369:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1369:4: otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEnum2675); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1373:1: ( (lv_elements_5_0= ruleEnumElement ) )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1374:1: (lv_elements_5_0= ruleEnumElement )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1374:1: (lv_elements_5_0= ruleEnumElement )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1375:3: lv_elements_5_0= ruleEnumElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum2696);
            	    lv_elements_5_0=ruleEnumElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"EnumElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleEnum2710); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1403:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1404:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1405:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
             newCompositeNode(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2746);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;

             current =iv_ruleEnumElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1412:1: ruleEnumElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1415:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1416:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1416:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1416:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1416:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1417:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1417:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1418:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumElement2798); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1434:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1434:4: otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEnumElement2816); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumElementAccess().getEqualsSignKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1438:1: ( (lv_value_2_0= RULE_INT ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1439:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1439:1: (lv_value_2_0= RULE_INT )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1440:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumElement2833); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getEnumElementAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleTypeDef"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1464:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1465:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1466:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef2876);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef2886); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1473:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_struct_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_block_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        EObject lv_doc_0_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_typeRef_13_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1476:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1477:1: ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1477:1: ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1477:2: ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1477:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1478:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1478:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1479:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleTypeDef2932);
                    lv_doc_0_0=ruleDocu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	        }
                           		set(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"Docu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleTypeDef2945); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getTypedefKeyword_1());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:1: ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt38=1;
                }
                break;
            case 43:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==27) ) {
                    alt38=2;
                }
                else if ( (LA38_2==RULE_ID) ) {
                    alt38=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 16:
            case 44:
            case 45:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:2: ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:2: ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:3: ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}'
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:3: ( (lv_struct_2_0= 'struct' ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1500:1: (lv_struct_2_0= 'struct' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1500:1: (lv_struct_2_0= 'struct' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1501:3: lv_struct_2_0= 'struct'
                    {
                    lv_struct_2_0=(Token)match(input,42,FOLLOW_42_in_ruleTypeDef2965); 

                            newLeafNode(lv_struct_2_0, grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDefRule());
                    	        }
                           		setWithLastConsumed(current, "struct", true, "struct");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTypeDef2990); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_2_0_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1518:1: ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID||LA36_0==16||(LA36_0>=43 && LA36_0<=45)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1518:2: ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';'
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1518:2: ( (lv_attributes_4_0= ruleTypeStructAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1519:1: (lv_attributes_4_0= ruleTypeStructAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1519:1: (lv_attributes_4_0= ruleTypeStructAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1520:3: lv_attributes_4_0= ruleTypeStructAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_0_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3012);
                    	    lv_attributes_4_0=ruleTypeStructAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"TypeStructAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleTypeDef3024); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTypeDefAccess().getSemicolonKeyword_2_0_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTypeDef3038); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_2_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1545:6: ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1545:6: ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1545:7: ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')'
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1545:7: ( (lv_block_7_0= 'void' ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1546:1: (lv_block_7_0= 'void' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1546:1: (lv_block_7_0= 'void' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1547:3: lv_block_7_0= 'void'
                    {
                    lv_block_7_0=(Token)match(input,43,FOLLOW_43_in_ruleTypeDef3064); 

                            newLeafNode(lv_block_7_0, grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDefRule());
                    	        }
                           		setWithLastConsumed(current, "block", true, "void");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTypeDef3089); 

                        	newLeafNode(otherlv_8, grammarAccess.getTypeDefAccess().getLeftParenthesisKeyword_2_1_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1564:1: ( (lv_attributes_9_0= ruleTypeStructAttribute ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1565:1: (lv_attributes_9_0= ruleTypeStructAttribute )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1565:1: (lv_attributes_9_0= ruleTypeStructAttribute )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1566:3: lv_attributes_9_0= ruleTypeStructAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3110);
                    lv_attributes_9_0=ruleTypeStructAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_9_0, 
                            		"TypeStructAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1582:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==35) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1582:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleTypeDef3123); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTypeDefAccess().getCommaKeyword_2_1_3_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1586:1: ( (lv_attributes_11_0= ruleTypeStructAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1587:1: (lv_attributes_11_0= ruleTypeStructAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1587:1: (lv_attributes_11_0= ruleTypeStructAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1588:3: lv_attributes_11_0= ruleTypeStructAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3144);
                    	    lv_attributes_11_0=ruleTypeStructAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_11_0, 
                    	            		"TypeStructAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleTypeDef3158); 

                        	newLeafNode(otherlv_12, grammarAccess.getTypeDefAccess().getRightParenthesisKeyword_2_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1609:6: ( (lv_typeRef_13_0= ruleTypeRef ) )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1609:6: ( (lv_typeRef_13_0= ruleTypeRef ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1610:1: (lv_typeRef_13_0= ruleTypeRef )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1610:1: (lv_typeRef_13_0= ruleTypeRef )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1611:3: lv_typeRef_13_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeRefTypeRefParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeDef3186);
                    lv_typeRef_13_0=ruleTypeRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	        }
                           		set(
                           			current, 
                           			"typeRef",
                            		lv_typeRef_13_0, 
                            		"TypeRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1627:3: ( (lv_name_14_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1628:1: (lv_name_14_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1628:1: (lv_name_14_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1629:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef3204); 

            			newLeafNode(lv_name_14_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"ID");
            	    

            }


            }

            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleTypeDef3221); 

                	newLeafNode(otherlv_15, grammarAccess.getTypeDefAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTypeStructAttribute"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1657:1: entryRuleTypeStructAttribute returns [EObject current=null] : iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF ;
    public final EObject entryRuleTypeStructAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructAttribute = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1658:2: (iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1659:2: iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF
            {
             newCompositeNode(grammarAccess.getTypeStructAttributeRule()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute3257);
            iv_ruleTypeStructAttribute=ruleTypeStructAttribute();

            state._fsp--;

             current =iv_ruleTypeStructAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeStructAttribute3267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeStructAttribute"


    // $ANTLR start "ruleTypeStructAttribute"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1666:1: ruleTypeStructAttribute returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeStructAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1669:28: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1670:1: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1670:1: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1670:2: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1670:2: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1671:1: (lv_typeRef_0_0= ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1671:1: (lv_typeRef_0_0= ruleTypeRef )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1672:3: lv_typeRef_0_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getTypeStructAttributeAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeStructAttribute3313);
            lv_typeRef_0_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeStructAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"typeRef",
                    		lv_typeRef_0_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1688:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1689:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1689:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeStructAttribute3330); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeStructAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeStructAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeStructAttribute"


    // $ANTLR start "entryRuleBuiltinType"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1714:1: entryRuleBuiltinType returns [String current=null] : iv_ruleBuiltinType= ruleBuiltinType EOF ;
    public final String entryRuleBuiltinType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinType = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1715:2: (iv_ruleBuiltinType= ruleBuiltinType EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1716:2: iv_ruleBuiltinType= ruleBuiltinType EOF
            {
             newCompositeNode(grammarAccess.getBuiltinTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType3372);
            iv_ruleBuiltinType=ruleBuiltinType();

            state._fsp--;

             current =iv_ruleBuiltinType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinType3383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltinType"


    // $ANTLR start "ruleBuiltinType"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1723:1: ruleBuiltinType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'BOOL' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1726:28: ( (kw= 'void' | kw= 'BOOL' | kw= 'double' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1727:1: (kw= 'void' | kw= 'BOOL' | kw= 'double' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1727:1: (kw= 'void' | kw= 'BOOL' | kw= 'double' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt39=1;
                }
                break;
            case 44:
                {
                alt39=2;
                }
                break;
            case 45:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1728:2: kw= 'void'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBuiltinType3421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBuiltinTypeAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1735:2: kw= 'BOOL'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBuiltinType3440); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBuiltinTypeAccess().getBOOLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1742:2: kw= 'double'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBuiltinType3459); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBuiltinTypeAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltinType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1755:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1756:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1757:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3500);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1764:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1767:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1768:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1768:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1769:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3558);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1779:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1780:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName3577); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3599);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1804:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1805:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1806:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3647);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1813:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1816:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1817:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1817:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1818:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3705);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedNameWithWildcard3723); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard3736); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1848:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1849:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1850:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID3777);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID3788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1857:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1860:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1861:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID3827); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleDocu"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1876:1: entryRuleDocu returns [EObject current=null] : iv_ruleDocu= ruleDocu EOF ;
    public final EObject entryRuleDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocu = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1877:2: (iv_ruleDocu= ruleDocu EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1878:2: iv_ruleDocu= ruleDocu EOF
            {
             newCompositeNode(grammarAccess.getDocuRule()); 
            pushFollow(FOLLOW_ruleDocu_in_entryRuleDocu3871);
            iv_ruleDocu=ruleDocu();

            state._fsp--;

             current =iv_ruleDocu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocu3881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocu"


    // $ANTLR start "ruleDocu"
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1885:1: ruleDocu returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDocu() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1888:28: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1889:1: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1889:1: ( (lv_content_0_0= RULE_JDOC ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1890:1: (lv_content_0_0= RULE_JDOC )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1890:1: (lv_content_0_0= RULE_JDOC )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1891:3: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_ruleDocu3922); 

            			newLeafNode(lv_content_0_0, grammarAccess.getDocuAccess().getContentJDOCTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocuRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_0_0, 
                    		"JDOC");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocu"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA4_eotS =
        "\6\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA4_minS =
        "\1\4\1\6\1\4\1\uffff\1\6\1\uffff";
    static final String DFA4_maxS =
        "\1\4\1\51\1\23\1\uffff\1\51\1\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA4_specialS =
        "\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\3\4\uffff\2\3\12\uffff\1\3\4\uffff\1\2\2\uffff"+
            "\2\3",
            "\1\4\16\uffff\1\5",
            "",
            "\1\3\10\uffff\1\3\4\uffff\2\3\12\uffff\1\3\4\uffff\1\2\2\uffff"+
            "\2\3",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "202:1: (lv_importedNamespace_1_1= ruleQualifiedNameWithWildcard | lv_importedNamespace_1_2= ruleQualifiedName )";
        }
    }
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\6\1\24\1\5\4\uffff\1\45\1\5\1\25";
    static final String DFA5_maxS =
        "\2\51\1\5\4\uffff\1\45\1\5\1\40";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\3\uffff";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\15\uffff\1\2\1\3\12\uffff\1\4\7\uffff\1\5\1\6",
            "\1\2\1\3\12\uffff\1\4\10\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\3\12\uffff\1\4"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "257:1: (this_Protocol_0= ruleProtocol | this_Class_1= ruleClass | this_Enum_2= ruleEnum | this_TypeDef_3= ruleTypeDef )";
        }
    }
 

    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageDeclaration171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration209 = new BitSet(new long[]{0x0000030100308040L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageDeclaration230 = new BitSet(new long[]{0x0000030100308040L});
    public static final BitSet FOLLOW_ruleType_in_rulePackageDeclaration252 = new BitSet(new long[]{0x0000030100308042L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleType474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleType501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleType528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleType555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeRef638 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTypeRef651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef674 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTypeRef686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef719 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_17_in_ruleTypeRef732 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeRef753 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTypeRef765 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTypeRef780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_ruleTypeRef810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleProtocol902 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleProtocol916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProtocol937 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProtocol951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProtocol968 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProtocol985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProtocol1006 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProtocol1018 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleProtocol1039 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_24_in_ruleProtocol1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleMessage1144 = new BitSet(new long[]{0x0000000006100000L});
    public static final BitSet FOLLOW_20_in_ruleMessage1158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleMessage1179 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleMessage1194 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_ruleMessage1212 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessage1225 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMessage1246 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMessage1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageElement_in_ruleMessage1279 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleMessage1292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleMessage1313 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMessage1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageElement1413 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleMessageElement1431 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessageElement1443 = new BitSet(new long[]{0x0000380080010010L});
    public static final BitSet FOLLOW_31_in_ruleMessageElement1456 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMessageElement1479 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMessageElement1491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageElement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleClass1607 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleClass1621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleClass1642 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleClass1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClass1690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleClass1711 = new BitSet(new long[]{0x0000000600800000L});
    public static final BitSet FOLLOW_33_in_ruleClass1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1747 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleClass1762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1785 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_35_in_ruleClass1798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1821 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_23_in_ruleClass1837 = new BitSet(new long[]{0x0000005007100040L});
    public static final BitSet FOLLOW_36_in_ruleClass1850 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleClass1862 = new BitSet(new long[]{0x0000000006100040L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleClass1883 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_24_in_ruleClass1896 = new BitSet(new long[]{0x0000004007100040L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClass1919 = new BitSet(new long[]{0x0000004007100040L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleClass1941 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_24_in_ruleClass1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2042 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVersion2059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleProperty2173 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_20_in_ruleProperty2187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProperty2208 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProperty2222 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProperty2234 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_ruleProperty2256 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleProperty2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_ruleProperty2290 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleProperty2306 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleProperty2327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2344 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProperty2361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProperty2382 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleProperty2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute2430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttribute2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttribute2482 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_rulePropertyAttribute2500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttribute2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEnum2607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum2624 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnum2641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum2662 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleEnum2675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum2696 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleEnum2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumElement2798 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumElement2816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumElement2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef2876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleTypeDef2932 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTypeDef2945 = new BitSet(new long[]{0x00003C0000010010L});
    public static final BitSet FOLLOW_42_in_ruleTypeDef2965 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDef2990 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3012 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeDef3024 = new BitSet(new long[]{0x0000380001010010L});
    public static final BitSet FOLLOW_24_in_ruleTypeDef3038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleTypeDef3064 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeDef3089 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3110 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleTypeDef3123 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3144 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleTypeDef3158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeDef3186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef3204 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeDef3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeStructAttribute3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeStructAttribute3313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeStructAttribute3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType3372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinType3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBuiltinType3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBuiltinType3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBuiltinType3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3558 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName3577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3599 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3705 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedNameWithWildcard3723 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID3777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_entryRuleDocu3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocu3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDocu3922 = new BitSet(new long[]{0x0000000000000002L});

}
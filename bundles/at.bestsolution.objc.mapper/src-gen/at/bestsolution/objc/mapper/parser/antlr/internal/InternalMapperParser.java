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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:557:1: ruleMessage returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )? otherlv_13= ';' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_javaName_12_0=null;
        Token otherlv_13=null;
        EObject lv_doc_0_0 = null;

        EObject lv_deprecated_2_0 = null;

        EObject lv_returnValue_6_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_since_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:560:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )? otherlv_13= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )? otherlv_13= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )? otherlv_13= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:561:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? (otherlv_3= '-' | otherlv_4= '+' ) otherlv_5= '(' ( (lv_returnValue_6_0= ruleTypeRef ) ) otherlv_7= ')' ( (lv_elements_8_0= ruleMessageElement ) )+ otherlv_9= 'since' ( (lv_since_10_0= ruleVersion ) ) (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )? otherlv_13= ';'
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:676:2: (otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:676:4: otherlv_11= 'mapped-to' ( (lv_javaName_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleMessage1326); 

                        	newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getMappedToKeyword_9_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:680:1: ( (lv_javaName_12_0= RULE_ID ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:681:1: (lv_javaName_12_0= RULE_ID )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:681:1: (lv_javaName_12_0= RULE_ID )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:682:3: lv_javaName_12_0= RULE_ID
                    {
                    lv_javaName_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1343); 

                    			newLeafNode(lv_javaName_12_0, grammarAccess.getMessageAccess().getJavaNameIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"javaName",
                            		lv_javaName_12_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleMessage1362); 

                	newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getSemicolonKeyword_10());
                

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:710:1: entryRuleMessageElement returns [EObject current=null] : iv_ruleMessageElement= ruleMessageElement EOF ;
    public final EObject entryRuleMessageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageElement = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:711:2: (iv_ruleMessageElement= ruleMessageElement EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:712:2: iv_ruleMessageElement= ruleMessageElement EOF
            {
             newCompositeNode(grammarAccess.getMessageElementRule()); 
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement1398);
            iv_ruleMessageElement=ruleMessageElement();

            state._fsp--;

             current =iv_ruleMessageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement1408); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:719:1: ruleMessageElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? ) ;
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
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:722:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:723:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:723:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:724:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:724:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:725:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageElement1450); 

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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:741:2: (otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:741:4: otherlv_1= ':' otherlv_2= '(' (otherlv_3= 'const' )? ( (lv_type_4_0= ruleTypeRef ) ) otherlv_5= ')' ( (lv_variable_6_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMessageElement1468); 

                        	newLeafNode(otherlv_1, grammarAccess.getMessageElementAccess().getColonKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMessageElement1480); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:749:1: (otherlv_3= 'const' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:749:3: otherlv_3= 'const'
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleMessageElement1493); 

                                	newLeafNode(otherlv_3, grammarAccess.getMessageElementAccess().getConstKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:753:3: ( (lv_type_4_0= ruleTypeRef ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:754:1: (lv_type_4_0= ruleTypeRef )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:754:1: (lv_type_4_0= ruleTypeRef )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:755:3: lv_type_4_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageElementAccess().getTypeTypeRefParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleMessageElement1516);
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

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMessageElement1528); 

                        	newLeafNode(otherlv_5, grammarAccess.getMessageElementAccess().getRightParenthesisKeyword_1_4());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:775:1: ( (lv_variable_6_0= RULE_ID ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:776:1: (lv_variable_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:776:1: (lv_variable_6_0= RULE_ID )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:777:3: lv_variable_6_0= RULE_ID
                    {
                    lv_variable_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageElement1545); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:801:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:802:2: (iv_ruleClass= ruleClass EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:803:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1588);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1598); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:810:1: ruleClass returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' ) ;
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
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:813:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:814:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:814:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:814:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'since' ( (lv_since_6_0= ruleVersion ) ) (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )? ( (lv_properties_18_0= ruleProperty ) )* ( (lv_messages_19_0= ruleMessage ) )* otherlv_20= '}'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:814:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_JDOC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:815:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:815:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:816:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleClass1644);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:832:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:832:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClass1658); 

                        	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:836:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:837:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:837:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:838:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleClass1679);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleClass1693); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:858:1: ( (lv_name_4_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:859:1: (lv_name_4_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:859:1: (lv_name_4_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:860:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1710); 

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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleClass1727); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSinceKeyword_4());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:880:1: ( (lv_since_6_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:881:1: (lv_since_6_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:881:1: (lv_since_6_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:882:3: lv_since_6_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getSinceVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleClass1748);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:898:2: (otherlv_7= 'inherits' ( ( ruleQualifiedName ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:898:4: otherlv_7= 'inherits' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleClass1761); 

                        	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getInheritsKeyword_6_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:902:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:903:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:903:1: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:904:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getParentClassCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1784);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:917:4: (otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:917:6: otherlv_9= 'conforms' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleClass1799); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getConformsKeyword_7_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:921:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:922:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:922:1: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:923:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1822);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:936:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==35) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:936:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleClass1835); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:940:1: ( ( ruleQualifiedName ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:941:1: ( ruleQualifiedName )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:941:1: ( ruleQualifiedName )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:942:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1858);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleClass1874); 

                	newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:959:1: (otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:959:3: otherlv_14= 'initializers' otherlv_15= '{' ( (lv_initializerMessages_16_0= ruleMessage ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleClass1887); 

                        	newLeafNode(otherlv_14, grammarAccess.getClassAccess().getInitializersKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleClass1899); 

                        	newLeafNode(otherlv_15, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:967:1: ( (lv_initializerMessages_16_0= ruleMessage ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_JDOC||LA25_0==20||(LA25_0>=25 && LA25_0<=26)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:968:1: (lv_initializerMessages_16_0= ruleMessage )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:968:1: (lv_initializerMessages_16_0= ruleMessage )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:969:3: lv_initializerMessages_16_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getInitializerMessagesMessageParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleClass1920);
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
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleClass1933); 

                        	newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:989:3: ( (lv_properties_18_0= ruleProperty ) )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==20) ) {
                        int LA27_2 = input.LA(3);

                        if ( (LA27_2==RULE_INT) ) {
                            int LA27_5 = input.LA(4);

                            if ( (LA27_5==37) ) {
                                int LA27_6 = input.LA(5);

                                if ( (LA27_6==RULE_INT) ) {
                                    int LA27_7 = input.LA(6);

                                    if ( (LA27_7==38) ) {
                                        alt27=1;
                                    }


                                }


                            }


                        }


                    }
                    else if ( (LA27_1==38) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_INT) ) {
                        int LA27_5 = input.LA(3);

                        if ( (LA27_5==37) ) {
                            int LA27_6 = input.LA(4);

                            if ( (LA27_6==RULE_INT) ) {
                                int LA27_7 = input.LA(5);

                                if ( (LA27_7==38) ) {
                                    alt27=1;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 38:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:990:1: (lv_properties_18_0= ruleProperty )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:990:1: (lv_properties_18_0= ruleProperty )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:991:3: lv_properties_18_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleClass1956);
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
            	    break loop27;
                }
            } while (true);

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1007:3: ( (lv_messages_19_0= ruleMessage ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_JDOC||LA28_0==20||(LA28_0>=25 && LA28_0<=26)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1008:1: (lv_messages_19_0= ruleMessage )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1008:1: (lv_messages_19_0= ruleMessage )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1009:3: lv_messages_19_0= ruleMessage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMessagesMessageParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessage_in_ruleClass1978);
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
            	    break loop28;
                }
            } while (true);

            otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleClass1991); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1037:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1038:2: (iv_ruleVersion= ruleVersion EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1039:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2027);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2037); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1046:1: ruleVersion returns [EObject current=null] : ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_sinceMajor_0_0=null;
        Token otherlv_1=null;
        Token lv_sinceMinor_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1049:28: ( ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1050:1: ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1050:1: ( ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1050:2: ( (lv_sinceMajor_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_sinceMinor_2_0= RULE_INT ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1050:2: ( (lv_sinceMajor_0_0= RULE_INT ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1051:1: (lv_sinceMajor_0_0= RULE_INT )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1051:1: (lv_sinceMajor_0_0= RULE_INT )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1052:3: lv_sinceMajor_0_0= RULE_INT
            {
            lv_sinceMajor_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2079); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleVersion2096); 

                	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1072:1: ( (lv_sinceMinor_2_0= RULE_INT ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1073:1: (lv_sinceMinor_2_0= RULE_INT )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1073:1: (lv_sinceMinor_2_0= RULE_INT )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1074:3: lv_sinceMinor_2_0= RULE_INT
            {
            lv_sinceMinor_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2113); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1098:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1099:2: (iv_ruleProperty= ruleProperty EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1100:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2154);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2164); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1107:1: ruleProperty returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' ) ;
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
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1110:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1111:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1111:1: ( ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1111:2: ( (lv_doc_0_0= ruleDocu ) )? (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )? otherlv_3= '@property' otherlv_4= '(' ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )? otherlv_8= ')' ( (lv_type_9_0= ruleTypeRef ) ) ( (lv_name_10_0= RULE_ID ) ) otherlv_11= 'since' ( (lv_since_12_0= ruleVersion ) ) otherlv_13= ';'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1111:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_JDOC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1112:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1112:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1113:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleProperty2210);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1129:3: (otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1129:5: otherlv_1= 'deprecated' ( (lv_deprecated_2_0= ruleVersion ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleProperty2224); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getDeprecatedKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1133:1: ( (lv_deprecated_2_0= ruleVersion ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1134:1: (lv_deprecated_2_0= ruleVersion )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1134:1: (lv_deprecated_2_0= ruleVersion )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1135:3: lv_deprecated_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleProperty2245);
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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleProperty2259); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getPropertyKeyword_2());
                
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleProperty2271); 

                	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1159:1: ( ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1159:2: ( (lv_attributes_5_0= rulePropertyAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )*
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1159:2: ( (lv_attributes_5_0= rulePropertyAttribute ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1160:1: (lv_attributes_5_0= rulePropertyAttribute )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1160:1: (lv_attributes_5_0= rulePropertyAttribute )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1161:3: lv_attributes_5_0= rulePropertyAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyAttribute_in_ruleProperty2293);
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

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1177:2: (otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==35) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1177:4: otherlv_6= ',' ( (lv_attributes_7_0= rulePropertyAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleProperty2306); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1181:1: ( (lv_attributes_7_0= rulePropertyAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1182:1: (lv_attributes_7_0= rulePropertyAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1182:1: (lv_attributes_7_0= rulePropertyAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1183:3: lv_attributes_7_0= rulePropertyAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyAttribute_in_ruleProperty2327);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleProperty2343); 

                	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1203:1: ( (lv_type_9_0= ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1204:1: (lv_type_9_0= ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1204:1: (lv_type_9_0= ruleTypeRef )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1205:3: lv_type_9_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleProperty2364);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1221:2: ( (lv_name_10_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1222:1: (lv_name_10_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1222:1: (lv_name_10_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1223:3: lv_name_10_0= RULE_ID
            {
            lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2381); 

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

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleProperty2398); 

                	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getSinceKeyword_8());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1243:1: ( (lv_since_12_0= ruleVersion ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1244:1: (lv_since_12_0= ruleVersion )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1244:1: (lv_since_12_0= ruleVersion )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1245:3: lv_since_12_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getSinceVersionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleProperty2419);
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

            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleProperty2431); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1273:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1274:2: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1275:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
            {
             newCompositeNode(grammarAccess.getPropertyAttributeRule()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute2467);
            iv_rulePropertyAttribute=rulePropertyAttribute();

            state._fsp--;

             current =iv_rulePropertyAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttribute2477); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1282:1: rulePropertyAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? ) ;
    public final EObject rulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1285:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1286:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1286:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1286:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1286:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1287:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1287:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1288:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttribute2519); 

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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1304:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1304:4: otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePropertyAttribute2537); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getEqualsSignKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1308:1: ( (lv_value_2_0= RULE_ID ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1309:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1309:1: (lv_value_2_0= RULE_ID )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1310:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttribute2554); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1334:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1335:2: (iv_ruleEnum= ruleEnum EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1336:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2597);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2607); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1343:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' ) ;
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
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1346:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1347:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1347:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1347:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleEnum2644); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1352:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1352:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum2661); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEnum2678); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1373:1: ( (lv_elements_3_0= ruleEnumElement ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1374:1: (lv_elements_3_0= ruleEnumElement )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1374:1: (lv_elements_3_0= ruleEnumElement )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1375:3: lv_elements_3_0= ruleEnumElement
            {
             
            	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum2699);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1391:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1391:4: otherlv_4= ',' ( (lv_elements_5_0= ruleEnumElement ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEnum2712); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1395:1: ( (lv_elements_5_0= ruleEnumElement ) )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1396:1: (lv_elements_5_0= ruleEnumElement )
            	    {
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1396:1: (lv_elements_5_0= ruleEnumElement )
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1397:3: lv_elements_5_0= ruleEnumElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumElement_in_ruleEnum2733);
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
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleEnum2747); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1425:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1426:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1427:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
             newCompositeNode(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement2783);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;

             current =iv_ruleEnumElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement2793); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1434:1: ruleEnumElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1437:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1438:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1438:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )? )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1438:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1438:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1439:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1439:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1440:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumElement2835); 

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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1456:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1456:4: otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEnumElement2853); 

                        	newLeafNode(otherlv_1, grammarAccess.getEnumElementAccess().getEqualsSignKeyword_1_0());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1460:1: ( (lv_value_2_0= RULE_INT ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1461:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1461:1: (lv_value_2_0= RULE_INT )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1462:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumElement2870); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1486:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1487:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1488:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef2913);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef2923); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1495:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) ;
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
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1498:28: ( ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:1: ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:1: ( ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:2: ( (lv_doc_0_0= ruleDocu ) )? otherlv_1= 'typedef' ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) ) ( (lv_name_14_0= RULE_ID ) ) otherlv_15= ';'
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1499:2: ( (lv_doc_0_0= ruleDocu ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_JDOC) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1500:1: (lv_doc_0_0= ruleDocu )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1500:1: (lv_doc_0_0= ruleDocu )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1501:3: lv_doc_0_0= ruleDocu
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getDocDocuParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocu_in_ruleTypeDef2969);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleTypeDef2982); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDefAccess().getTypedefKeyword_1());
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1521:1: ( ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' ) | ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' ) | ( (lv_typeRef_13_0= ruleTypeRef ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt39=1;
                }
                break;
            case 43:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==27) ) {
                    alt39=2;
                }
                else if ( (LA39_2==RULE_ID) ) {
                    alt39=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 16:
            case 44:
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
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1521:2: ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1521:2: ( ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1521:3: ( (lv_struct_2_0= 'struct' ) ) otherlv_3= '{' ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+ otherlv_6= '}'
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1521:3: ( (lv_struct_2_0= 'struct' ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1522:1: (lv_struct_2_0= 'struct' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1522:1: (lv_struct_2_0= 'struct' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1523:3: lv_struct_2_0= 'struct'
                    {
                    lv_struct_2_0=(Token)match(input,42,FOLLOW_42_in_ruleTypeDef3002); 

                            newLeafNode(lv_struct_2_0, grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDefRule());
                    	        }
                           		setWithLastConsumed(current, "struct", true, "struct");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTypeDef3027); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_2_0_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1540:1: ( ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';' )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID||LA37_0==16||(LA37_0>=43 && LA37_0<=45)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1540:2: ( (lv_attributes_4_0= ruleTypeStructAttribute ) ) otherlv_5= ';'
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1540:2: ( (lv_attributes_4_0= ruleTypeStructAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1541:1: (lv_attributes_4_0= ruleTypeStructAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1541:1: (lv_attributes_4_0= ruleTypeStructAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1542:3: lv_attributes_4_0= ruleTypeStructAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_0_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3049);
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

                    	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleTypeDef3061); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTypeDefAccess().getSemicolonKeyword_2_0_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTypeDef3075); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_2_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1567:6: ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1567:6: ( ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1567:7: ( (lv_block_7_0= 'void' ) ) otherlv_8= '(' ( (lv_attributes_9_0= ruleTypeStructAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )* otherlv_12= ')'
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1567:7: ( (lv_block_7_0= 'void' ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1568:1: (lv_block_7_0= 'void' )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1568:1: (lv_block_7_0= 'void' )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1569:3: lv_block_7_0= 'void'
                    {
                    lv_block_7_0=(Token)match(input,43,FOLLOW_43_in_ruleTypeDef3101); 

                            newLeafNode(lv_block_7_0, grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDefRule());
                    	        }
                           		setWithLastConsumed(current, "block", true, "void");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTypeDef3126); 

                        	newLeafNode(otherlv_8, grammarAccess.getTypeDefAccess().getLeftParenthesisKeyword_2_1_1());
                        
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1586:1: ( (lv_attributes_9_0= ruleTypeStructAttribute ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1587:1: (lv_attributes_9_0= ruleTypeStructAttribute )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1587:1: (lv_attributes_9_0= ruleTypeStructAttribute )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1588:3: lv_attributes_9_0= ruleTypeStructAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3147);
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

                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1604:2: (otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==35) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1604:4: otherlv_10= ',' ( (lv_attributes_11_0= ruleTypeStructAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleTypeDef3160); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTypeDefAccess().getCommaKeyword_2_1_3_0());
                    	        
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1608:1: ( (lv_attributes_11_0= ruleTypeStructAttribute ) )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1609:1: (lv_attributes_11_0= ruleTypeStructAttribute )
                    	    {
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1609:1: (lv_attributes_11_0= ruleTypeStructAttribute )
                    	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1610:3: lv_attributes_11_0= ruleTypeStructAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3181);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleTypeDef3195); 

                        	newLeafNode(otherlv_12, grammarAccess.getTypeDefAccess().getRightParenthesisKeyword_2_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1631:6: ( (lv_typeRef_13_0= ruleTypeRef ) )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1631:6: ( (lv_typeRef_13_0= ruleTypeRef ) )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1632:1: (lv_typeRef_13_0= ruleTypeRef )
                    {
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1632:1: (lv_typeRef_13_0= ruleTypeRef )
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1633:3: lv_typeRef_13_0= ruleTypeRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeRefTypeRefParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeDef3223);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1649:3: ( (lv_name_14_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1650:1: (lv_name_14_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1650:1: (lv_name_14_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1651:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef3241); 

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

            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleTypeDef3258); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1679:1: entryRuleTypeStructAttribute returns [EObject current=null] : iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF ;
    public final EObject entryRuleTypeStructAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeStructAttribute = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1680:2: (iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1681:2: iv_ruleTypeStructAttribute= ruleTypeStructAttribute EOF
            {
             newCompositeNode(grammarAccess.getTypeStructAttributeRule()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute3294);
            iv_ruleTypeStructAttribute=ruleTypeStructAttribute();

            state._fsp--;

             current =iv_ruleTypeStructAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeStructAttribute3304); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1688:1: ruleTypeStructAttribute returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeStructAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1691:28: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1692:1: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1692:1: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1692:2: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1692:2: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1693:1: (lv_typeRef_0_0= ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1693:1: (lv_typeRef_0_0= ruleTypeRef )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1694:3: lv_typeRef_0_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getTypeStructAttributeAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeStructAttribute3350);
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

            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1710:2: ( (lv_name_1_0= RULE_ID ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1711:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1711:1: (lv_name_1_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1712:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeStructAttribute3367); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1736:1: entryRuleBuiltinType returns [String current=null] : iv_ruleBuiltinType= ruleBuiltinType EOF ;
    public final String entryRuleBuiltinType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinType = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1737:2: (iv_ruleBuiltinType= ruleBuiltinType EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1738:2: iv_ruleBuiltinType= ruleBuiltinType EOF
            {
             newCompositeNode(grammarAccess.getBuiltinTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType3409);
            iv_ruleBuiltinType=ruleBuiltinType();

            state._fsp--;

             current =iv_ruleBuiltinType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinType3420); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1745:1: ruleBuiltinType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'BOOL' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1748:28: ( (kw= 'void' | kw= 'BOOL' | kw= 'double' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1749:1: (kw= 'void' | kw= 'BOOL' | kw= 'double' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1749:1: (kw= 'void' | kw= 'BOOL' | kw= 'double' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt40=1;
                }
                break;
            case 44:
                {
                alt40=2;
                }
                break;
            case 45:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1750:2: kw= 'void'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBuiltinType3458); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBuiltinTypeAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1757:2: kw= 'BOOL'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBuiltinType3477); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBuiltinTypeAccess().getBOOLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1764:2: kw= 'double'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBuiltinType3496); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1777:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1778:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1779:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3537);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3548); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1786:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1789:28: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1790:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1790:1: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1791:5: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3595);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            		current.merge(this_ValidID_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1801:1: (kw= '.' this_ValidID_2= ruleValidID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==37) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1802:2: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName3614); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName3636);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    		current.merge(this_ValidID_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1826:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1827:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1828:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3684);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3695); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1835:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1838:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1839:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1839:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1840:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3742);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedNameWithWildcard3760); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildcard3773); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1870:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1871:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1872:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID3814);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID3825); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1879:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1882:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1883:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID3864); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1898:1: entryRuleDocu returns [EObject current=null] : iv_ruleDocu= ruleDocu EOF ;
    public final EObject entryRuleDocu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocu = null;


        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1899:2: (iv_ruleDocu= ruleDocu EOF )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1900:2: iv_ruleDocu= ruleDocu EOF
            {
             newCompositeNode(grammarAccess.getDocuRule()); 
            pushFollow(FOLLOW_ruleDocu_in_entryRuleDocu3908);
            iv_ruleDocu=ruleDocu();

            state._fsp--;

             current =iv_ruleDocu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocu3918); 

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
    // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1907:1: ruleDocu returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDocu() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1910:28: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1911:1: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1911:1: ( (lv_content_0_0= RULE_JDOC ) )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1912:1: (lv_content_0_0= RULE_JDOC )
            {
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1912:1: (lv_content_0_0= RULE_JDOC )
            // ../at.bestsolution.objc.mapper/src-gen/at/bestsolution/objc/mapper/parser/antlr/internal/InternalMapper.g:1913:3: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_ruleDocu3959); 

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
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA4_minS =
        "\1\4\1\6\1\4\2\uffff\1\6";
    static final String DFA4_maxS =
        "\1\4\1\51\1\23\2\uffff\1\51";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA4_specialS =
        "\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\3\4\uffff\2\3\12\uffff\1\3\4\uffff\1\2\2\uffff"+
            "\2\3",
            "\1\5\16\uffff\1\4",
            "",
            "",
            "\1\3\10\uffff\1\3\4\uffff\2\3\12\uffff\1\3\4\uffff\1\2\2\uffff"+
            "\2\3"
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
    public static final BitSet FOLLOW_ruleVersion_in_ruleMessage1313 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_ruleMessage1326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1343 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMessage1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageElement1450 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleMessageElement1468 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessageElement1480 = new BitSet(new long[]{0x0000380080010010L});
    public static final BitSet FOLLOW_31_in_ruleMessageElement1493 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleMessageElement1516 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMessageElement1528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageElement1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleClass1644 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleClass1658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleClass1679 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleClass1693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1710 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClass1727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleClass1748 = new BitSet(new long[]{0x0000000600800000L});
    public static final BitSet FOLLOW_33_in_ruleClass1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1784 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_ruleClass1799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1822 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_35_in_ruleClass1835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1858 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_23_in_ruleClass1874 = new BitSet(new long[]{0x0000005007100040L});
    public static final BitSet FOLLOW_36_in_ruleClass1887 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleClass1899 = new BitSet(new long[]{0x0000000006100040L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleClass1920 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_24_in_ruleClass1933 = new BitSet(new long[]{0x0000004007100040L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClass1956 = new BitSet(new long[]{0x0000004007100040L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleClass1978 = new BitSet(new long[]{0x0000000007100040L});
    public static final BitSet FOLLOW_24_in_ruleClass1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2079 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVersion2096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleProperty2210 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_20_in_ruleProperty2224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProperty2245 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProperty2259 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProperty2271 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_ruleProperty2293 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleProperty2306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_ruleProperty2327 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleProperty2343 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleProperty2364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2381 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProperty2398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleProperty2419 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleProperty2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttribute2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttribute2519 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_rulePropertyAttribute2537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttribute2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEnum2644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum2661 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnum2678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum2699 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_35_in_ruleEnum2712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleEnum2733 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_24_in_ruleEnum2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement2783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumElement2835 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumElement2853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumElement2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef2913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_ruleTypeDef2969 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleTypeDef2982 = new BitSet(new long[]{0x00003C0000010010L});
    public static final BitSet FOLLOW_42_in_ruleTypeDef3002 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDef3027 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3049 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeDef3061 = new BitSet(new long[]{0x0000380001010010L});
    public static final BitSet FOLLOW_24_in_ruleTypeDef3075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleTypeDef3101 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeDef3126 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3147 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleTypeDef3160 = new BitSet(new long[]{0x0000380000010010L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_ruleTypeDef3181 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleTypeDef3195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeDef3223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef3241 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeDef3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeStructAttribute3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeStructAttribute3350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeStructAttribute3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType3409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinType3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBuiltinType3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBuiltinType3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBuiltinType3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3595 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName3614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName3636 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard3742 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedNameWithWildcard3760 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildcard3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID3814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_entryRuleDocu3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocu3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDocu3959 = new BitSet(new long[]{0x0000000000000002L});

}
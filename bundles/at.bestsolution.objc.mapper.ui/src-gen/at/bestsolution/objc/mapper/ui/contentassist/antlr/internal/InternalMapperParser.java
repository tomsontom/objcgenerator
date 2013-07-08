package at.bestsolution.objc.mapper.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.bestsolution.objc.mapper.services.MapperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapperParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_JDOC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'void'", "'BOOL'", "'double'", "'framework'", "'mapped-to'", "'import'", "'id'", "'<'", "'>'", "'*'", "'protocol'", "'since'", "'{'", "'}'", "'deprecated'", "'('", "')'", "';'", "':'", "'const'", "'class'", "'inherits'", "'conforms'", "','", "'initializers'", "'.'", "'@property'", "'='", "'enum'", "'typedef'", "'native'", "'struct'"
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
    public String getGrammarFileName() { return "../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g"; }


     
     	private MapperGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapperGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePackageDeclaration"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:60:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:61:1: ( rulePackageDeclaration EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:62:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration61);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:69:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:73:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:74:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:74:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:75:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:76:1: ( rule__PackageDeclaration__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:76:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration94);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:89:1: ( ruleImport EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:104:1: ( rule__Import__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:117:1: ( ruleType EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:132:1: ( rule__Type__Alternatives )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeRef"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:144:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:145:1: ( ruleTypeRef EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:146:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef241);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:153:1: ruleTypeRef : ( ( rule__TypeRef__Alternatives ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:157:2: ( ( ( rule__TypeRef__Alternatives ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:158:1: ( ( rule__TypeRef__Alternatives ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:158:1: ( ( rule__TypeRef__Alternatives ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:159:1: ( rule__TypeRef__Alternatives )
            {
             before(grammarAccess.getTypeRefAccess().getAlternatives()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:160:1: ( rule__TypeRef__Alternatives )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:160:2: rule__TypeRef__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeRef__Alternatives_in_ruleTypeRef274);
            rule__TypeRef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleProtocol"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:172:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:173:1: ( ruleProtocol EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:174:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol301);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:181:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:185:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:186:1: ( ( rule__Protocol__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:186:1: ( ( rule__Protocol__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:187:1: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:188:1: ( rule__Protocol__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:188:2: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0_in_ruleProtocol334);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleMessage"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:200:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:201:1: ( ruleMessage EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:202:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage361);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:209:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:213:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:214:1: ( ( rule__Message__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:214:1: ( ( rule__Message__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:215:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:216:1: ( rule__Message__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:216:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage394);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageElement"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:228:1: entryRuleMessageElement : ruleMessageElement EOF ;
    public final void entryRuleMessageElement() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:229:1: ( ruleMessageElement EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:230:1: ruleMessageElement EOF
            {
             before(grammarAccess.getMessageElementRule()); 
            pushFollow(FOLLOW_ruleMessageElement_in_entryRuleMessageElement421);
            ruleMessageElement();

            state._fsp--;

             after(grammarAccess.getMessageElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageElement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageElement"


    // $ANTLR start "ruleMessageElement"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:237:1: ruleMessageElement : ( ( rule__MessageElement__Group__0 ) ) ;
    public final void ruleMessageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:241:2: ( ( ( rule__MessageElement__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:242:1: ( ( rule__MessageElement__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:242:1: ( ( rule__MessageElement__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:243:1: ( rule__MessageElement__Group__0 )
            {
             before(grammarAccess.getMessageElementAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:244:1: ( rule__MessageElement__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:244:2: rule__MessageElement__Group__0
            {
            pushFollow(FOLLOW_rule__MessageElement__Group__0_in_ruleMessageElement454);
            rule__MessageElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageElement"


    // $ANTLR start "entryRuleClass"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:256:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:257:1: ( ruleClass EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:258:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass481);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:265:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:269:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:270:1: ( ( rule__Class__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:270:1: ( ( rule__Class__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:271:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:272:1: ( rule__Class__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:272:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass514);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleVersion"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:284:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:285:1: ( ruleVersion EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:286:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion541);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:293:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:297:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:298:1: ( ( rule__Version__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:298:1: ( ( rule__Version__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:299:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:300:1: ( rule__Version__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:300:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion574);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleProperty"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:312:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:313:1: ( ruleProperty EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:314:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty601);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:321:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:325:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:326:1: ( ( rule__Property__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:326:1: ( ( rule__Property__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:327:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:328:1: ( rule__Property__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:328:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty634);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyAttribute"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:340:1: entryRulePropertyAttribute : rulePropertyAttribute EOF ;
    public final void entryRulePropertyAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:341:1: ( rulePropertyAttribute EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:342:1: rulePropertyAttribute EOF
            {
             before(grammarAccess.getPropertyAttributeRule()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute661);
            rulePropertyAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttribute668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:349:1: rulePropertyAttribute : ( ( rule__PropertyAttribute__Group__0 ) ) ;
    public final void rulePropertyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:353:2: ( ( ( rule__PropertyAttribute__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:354:1: ( ( rule__PropertyAttribute__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:354:1: ( ( rule__PropertyAttribute__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:355:1: ( rule__PropertyAttribute__Group__0 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:356:1: ( rule__PropertyAttribute__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:356:2: rule__PropertyAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Group__0_in_rulePropertyAttribute694);
            rule__PropertyAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRuleEnum"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:368:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:369:1: ( ruleEnum EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:370:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum721);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:377:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:381:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:382:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:382:1: ( ( rule__Enum__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:383:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:384:1: ( rule__Enum__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:384:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum754);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumElement"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:396:1: entryRuleEnumElement : ruleEnumElement EOF ;
    public final void entryRuleEnumElement() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:397:1: ( ruleEnumElement EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:398:1: ruleEnumElement EOF
            {
             before(grammarAccess.getEnumElementRule()); 
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement781);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:405:1: ruleEnumElement : ( ( rule__EnumElement__Group__0 ) ) ;
    public final void ruleEnumElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:409:2: ( ( ( rule__EnumElement__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:410:1: ( ( rule__EnumElement__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:410:1: ( ( rule__EnumElement__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:411:1: ( rule__EnumElement__Group__0 )
            {
             before(grammarAccess.getEnumElementAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:412:1: ( rule__EnumElement__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:412:2: rule__EnumElement__Group__0
            {
            pushFollow(FOLLOW_rule__EnumElement__Group__0_in_ruleEnumElement814);
            rule__EnumElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleTypeDef"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:424:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:425:1: ( ruleTypeDef EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:426:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef841);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:433:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:437:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:438:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:438:1: ( ( rule__TypeDef__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:439:1: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:440:1: ( rule__TypeDef__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:440:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef874);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTypeStructAttribute"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:452:1: entryRuleTypeStructAttribute : ruleTypeStructAttribute EOF ;
    public final void entryRuleTypeStructAttribute() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:453:1: ( ruleTypeStructAttribute EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:454:1: ruleTypeStructAttribute EOF
            {
             before(grammarAccess.getTypeStructAttributeRule()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute901);
            ruleTypeStructAttribute();

            state._fsp--;

             after(grammarAccess.getTypeStructAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeStructAttribute908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeStructAttribute"


    // $ANTLR start "ruleTypeStructAttribute"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:461:1: ruleTypeStructAttribute : ( ( rule__TypeStructAttribute__Group__0 ) ) ;
    public final void ruleTypeStructAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:465:2: ( ( ( rule__TypeStructAttribute__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:466:1: ( ( rule__TypeStructAttribute__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:466:1: ( ( rule__TypeStructAttribute__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:467:1: ( rule__TypeStructAttribute__Group__0 )
            {
             before(grammarAccess.getTypeStructAttributeAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:468:1: ( rule__TypeStructAttribute__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:468:2: rule__TypeStructAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TypeStructAttribute__Group__0_in_ruleTypeStructAttribute934);
            rule__TypeStructAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeStructAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeStructAttribute"


    // $ANTLR start "entryRuleBuiltinType"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:480:1: entryRuleBuiltinType : ruleBuiltinType EOF ;
    public final void entryRuleBuiltinType() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:481:1: ( ruleBuiltinType EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:482:1: ruleBuiltinType EOF
            {
             before(grammarAccess.getBuiltinTypeRule()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType961);
            ruleBuiltinType();

            state._fsp--;

             after(grammarAccess.getBuiltinTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinType968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltinType"


    // $ANTLR start "ruleBuiltinType"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:489:1: ruleBuiltinType : ( ( rule__BuiltinType__Alternatives ) ) ;
    public final void ruleBuiltinType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:493:2: ( ( ( rule__BuiltinType__Alternatives ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:494:1: ( ( rule__BuiltinType__Alternatives ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:494:1: ( ( rule__BuiltinType__Alternatives ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:495:1: ( rule__BuiltinType__Alternatives )
            {
             before(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:496:1: ( rule__BuiltinType__Alternatives )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:496:2: rule__BuiltinType__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType994);
            rule__BuiltinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltinTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltinType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:508:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:509:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:510:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1021);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:517:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:521:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:523:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:524:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:524:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1054);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:536:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:537:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:538:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1081);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:545:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:549:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:550:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:550:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:551:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:552:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:552:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1114);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:564:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:565:1: ( ruleValidID EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:566:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1141);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:573:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:577:2: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:578:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:578:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:579:1: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1174); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleDocu"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:592:1: entryRuleDocu : ruleDocu EOF ;
    public final void entryRuleDocu() throws RecognitionException {
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:593:1: ( ruleDocu EOF )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:594:1: ruleDocu EOF
            {
             before(grammarAccess.getDocuRule()); 
            pushFollow(FOLLOW_ruleDocu_in_entryRuleDocu1200);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getDocuRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocu1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocu"


    // $ANTLR start "ruleDocu"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:601:1: ruleDocu : ( ( rule__Docu__ContentAssignment ) ) ;
    public final void ruleDocu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:605:2: ( ( ( rule__Docu__ContentAssignment ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:606:1: ( ( rule__Docu__ContentAssignment ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:606:1: ( ( rule__Docu__ContentAssignment ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:607:1: ( rule__Docu__ContentAssignment )
            {
             before(grammarAccess.getDocuAccess().getContentAssignment()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:608:1: ( rule__Docu__ContentAssignment )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:608:2: rule__Docu__ContentAssignment
            {
            pushFollow(FOLLOW_rule__Docu__ContentAssignment_in_ruleDocu1233);
            rule__Docu__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDocuAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocu"


    // $ANTLR start "rule__Import__ImportedNamespaceAlternatives_1_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:620:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:624:1: ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:625:1: ( ruleQualifiedNameWithWildcard )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:625:1: ( ruleQualifiedNameWithWildcard )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:626:1: ruleQualifiedNameWithWildcard
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01269);
                    ruleQualifiedNameWithWildcard();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:631:6: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:631:6: ( ruleQualifiedName )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:632:1: ruleQualifiedName
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01286);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:642:1: rule__Type__Alternatives : ( ( ruleProtocol ) | ( ruleClass ) | ( ruleEnum ) | ( ruleTypeDef ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:646:1: ( ( ruleProtocol ) | ( ruleClass ) | ( ruleEnum ) | ( ruleTypeDef ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:647:1: ( ruleProtocol )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:647:1: ( ruleProtocol )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:648:1: ruleProtocol
                    {
                     before(grammarAccess.getTypeAccess().getProtocolParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProtocol_in_rule__Type__Alternatives1318);
                    ruleProtocol();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getProtocolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:653:6: ( ruleClass )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:653:6: ( ruleClass )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:654:1: ruleClass
                    {
                     before(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__Type__Alternatives1335);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:659:6: ( ruleEnum )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:659:6: ( ruleEnum )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:660:1: ruleEnum
                    {
                     before(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Type__Alternatives1352);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:665:6: ( ruleTypeDef )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:665:6: ( ruleTypeDef )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:666:1: ruleTypeDef
                    {
                     before(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTypeDef_in_rule__Type__Alternatives1369);
                    ruleTypeDef();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeDefParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__TypeRef__Alternatives"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:676:1: rule__TypeRef__Alternatives : ( ( ( rule__TypeRef__Group_0__0 ) ) | ( ( rule__TypeRef__Group_1__0 ) ) | ( ( rule__TypeRef__BuiltinAssignment_2 ) ) );
    public final void rule__TypeRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:680:1: ( ( ( rule__TypeRef__Group_0__0 ) ) | ( ( rule__TypeRef__Group_1__0 ) ) | ( ( rule__TypeRef__BuiltinAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:681:1: ( ( rule__TypeRef__Group_0__0 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:681:1: ( ( rule__TypeRef__Group_0__0 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:682:1: ( rule__TypeRef__Group_0__0 )
                    {
                     before(grammarAccess.getTypeRefAccess().getGroup_0()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:683:1: ( rule__TypeRef__Group_0__0 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:683:2: rule__TypeRef__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeRef__Group_0__0_in_rule__TypeRef__Alternatives1401);
                    rule__TypeRef__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeRefAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:687:6: ( ( rule__TypeRef__Group_1__0 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:687:6: ( ( rule__TypeRef__Group_1__0 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:688:1: ( rule__TypeRef__Group_1__0 )
                    {
                     before(grammarAccess.getTypeRefAccess().getGroup_1()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:689:1: ( rule__TypeRef__Group_1__0 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:689:2: rule__TypeRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeRef__Group_1__0_in_rule__TypeRef__Alternatives1419);
                    rule__TypeRef__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeRefAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:693:6: ( ( rule__TypeRef__BuiltinAssignment_2 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:693:6: ( ( rule__TypeRef__BuiltinAssignment_2 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:694:1: ( rule__TypeRef__BuiltinAssignment_2 )
                    {
                     before(grammarAccess.getTypeRefAccess().getBuiltinAssignment_2()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:695:1: ( rule__TypeRef__BuiltinAssignment_2 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:695:2: rule__TypeRef__BuiltinAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__BuiltinAssignment_2_in_rule__TypeRef__Alternatives1437);
                    rule__TypeRef__BuiltinAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeRefAccess().getBuiltinAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Alternatives"


    // $ANTLR start "rule__Message__Alternatives_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:704:1: rule__Message__Alternatives_2 : ( ( '-' ) | ( '+' ) );
    public final void rule__Message__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:708:1: ( ( '-' ) | ( '+' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:709:1: ( '-' )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:709:1: ( '-' )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:710:1: '-'
                    {
                     before(grammarAccess.getMessageAccess().getHyphenMinusKeyword_2_0()); 
                    match(input,12,FOLLOW_12_in_rule__Message__Alternatives_21471); 
                     after(grammarAccess.getMessageAccess().getHyphenMinusKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:717:6: ( '+' )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:717:6: ( '+' )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:718:1: '+'
                    {
                     before(grammarAccess.getMessageAccess().getPlusSignKeyword_2_1()); 
                    match(input,13,FOLLOW_13_in_rule__Message__Alternatives_21491); 
                     after(grammarAccess.getMessageAccess().getPlusSignKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Alternatives_2"


    // $ANTLR start "rule__TypeDef__Alternatives_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:730:1: rule__TypeDef__Alternatives_2 : ( ( ( rule__TypeDef__Group_2_0__0 ) ) | ( ( rule__TypeDef__Group_2_1__0 ) ) | ( ( rule__TypeDef__TypeRefAssignment_2_2 ) ) );
    public final void rule__TypeDef__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:734:1: ( ( ( rule__TypeDef__Group_2_0__0 ) ) | ( ( rule__TypeDef__Group_2_1__0 ) ) | ( ( rule__TypeDef__TypeRefAssignment_2_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==29) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_ID) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 15:
            case 16:
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:735:1: ( ( rule__TypeDef__Group_2_0__0 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:735:1: ( ( rule__TypeDef__Group_2_0__0 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:736:1: ( rule__TypeDef__Group_2_0__0 )
                    {
                     before(grammarAccess.getTypeDefAccess().getGroup_2_0()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:737:1: ( rule__TypeDef__Group_2_0__0 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:737:2: rule__TypeDef__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeDef__Group_2_0__0_in_rule__TypeDef__Alternatives_21525);
                    rule__TypeDef__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDefAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:741:6: ( ( rule__TypeDef__Group_2_1__0 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:741:6: ( ( rule__TypeDef__Group_2_1__0 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:742:1: ( rule__TypeDef__Group_2_1__0 )
                    {
                     before(grammarAccess.getTypeDefAccess().getGroup_2_1()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:743:1: ( rule__TypeDef__Group_2_1__0 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:743:2: rule__TypeDef__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeDef__Group_2_1__0_in_rule__TypeDef__Alternatives_21543);
                    rule__TypeDef__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDefAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:747:6: ( ( rule__TypeDef__TypeRefAssignment_2_2 ) )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:747:6: ( ( rule__TypeDef__TypeRefAssignment_2_2 ) )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:748:1: ( rule__TypeDef__TypeRefAssignment_2_2 )
                    {
                     before(grammarAccess.getTypeDefAccess().getTypeRefAssignment_2_2()); 
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:749:1: ( rule__TypeDef__TypeRefAssignment_2_2 )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:749:2: rule__TypeDef__TypeRefAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__TypeDef__TypeRefAssignment_2_2_in_rule__TypeDef__Alternatives_21561);
                    rule__TypeDef__TypeRefAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeDefAccess().getTypeRefAssignment_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Alternatives_2"


    // $ANTLR start "rule__BuiltinType__Alternatives"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:758:1: rule__BuiltinType__Alternatives : ( ( 'void' ) | ( 'BOOL' ) | ( 'double' ) );
    public final void rule__BuiltinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:762:1: ( ( 'void' ) | ( 'BOOL' ) | ( 'double' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:763:1: ( 'void' )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:763:1: ( 'void' )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:764:1: 'void'
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getVoidKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__BuiltinType__Alternatives1595); 
                     after(grammarAccess.getBuiltinTypeAccess().getVoidKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:771:6: ( 'BOOL' )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:771:6: ( 'BOOL' )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:772:1: 'BOOL'
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getBOOLKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__BuiltinType__Alternatives1615); 
                     after(grammarAccess.getBuiltinTypeAccess().getBOOLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:779:6: ( 'double' )
                    {
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:779:6: ( 'double' )
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:780:1: 'double'
                    {
                     before(grammarAccess.getBuiltinTypeAccess().getDoubleKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__BuiltinType__Alternatives1635); 
                     after(grammarAccess.getBuiltinTypeAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltinType__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:794:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:798:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:799:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01667);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01670);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:806:1: rule__PackageDeclaration__Group__0__Impl : ( ( rule__PackageDeclaration__NativeAssignment_0 )? ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:810:1: ( ( ( rule__PackageDeclaration__NativeAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:811:1: ( ( rule__PackageDeclaration__NativeAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:811:1: ( ( rule__PackageDeclaration__NativeAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:812:1: ( rule__PackageDeclaration__NativeAssignment_0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getNativeAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:813:1: ( rule__PackageDeclaration__NativeAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:813:2: rule__PackageDeclaration__NativeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__NativeAssignment_0_in_rule__PackageDeclaration__Group__0__Impl1697);
                    rule__PackageDeclaration__NativeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getNativeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:823:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:827:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:828:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11728);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11731);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:835:1: rule__PackageDeclaration__Group__1__Impl : ( 'framework' ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:839:1: ( ( 'framework' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:840:1: ( 'framework' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:840:1: ( 'framework' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:841:1: 'framework'
            {
             before(grammarAccess.getPackageDeclarationAccess().getFrameworkKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__1__Impl1759); 
             after(grammarAccess.getPackageDeclarationAccess().getFrameworkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:854:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:858:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:859:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21790);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21793);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:866:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__NameAssignment_2 ) ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:870:1: ( ( ( rule__PackageDeclaration__NameAssignment_2 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:871:1: ( ( rule__PackageDeclaration__NameAssignment_2 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:871:1: ( ( rule__PackageDeclaration__NameAssignment_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:872:1: ( rule__PackageDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:873:1: ( rule__PackageDeclaration__NameAssignment_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:873:2: rule__PackageDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1820);
            rule__PackageDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:883:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:887:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:888:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31850);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31853);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:895:1: rule__PackageDeclaration__Group__3__Impl : ( 'mapped-to' ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:899:1: ( ( 'mapped-to' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:900:1: ( 'mapped-to' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:900:1: ( 'mapped-to' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:901:1: 'mapped-to'
            {
             before(grammarAccess.getPackageDeclarationAccess().getMappedToKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__PackageDeclaration__Group__3__Impl1881); 
             after(grammarAccess.getPackageDeclarationAccess().getMappedToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:914:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:918:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:919:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41912);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41915);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:926:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__JavaPackageAssignment_4 ) ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:930:1: ( ( ( rule__PackageDeclaration__JavaPackageAssignment_4 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:931:1: ( ( rule__PackageDeclaration__JavaPackageAssignment_4 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:931:1: ( ( rule__PackageDeclaration__JavaPackageAssignment_4 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:932:1: ( rule__PackageDeclaration__JavaPackageAssignment_4 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getJavaPackageAssignment_4()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:933:1: ( rule__PackageDeclaration__JavaPackageAssignment_4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:933:2: rule__PackageDeclaration__JavaPackageAssignment_4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__JavaPackageAssignment_4_in_rule__PackageDeclaration__Group__4__Impl1942);
            rule__PackageDeclaration__JavaPackageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getJavaPackageAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:943:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:947:1: ( rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:948:2: rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__51972);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__51975);
            rule__PackageDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:955:1: rule__PackageDeclaration__Group__5__Impl : ( ( rule__PackageDeclaration__ImportsAssignment_5 )* ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:959:1: ( ( ( rule__PackageDeclaration__ImportsAssignment_5 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:960:1: ( ( rule__PackageDeclaration__ImportsAssignment_5 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:960:1: ( ( rule__PackageDeclaration__ImportsAssignment_5 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:961:1: ( rule__PackageDeclaration__ImportsAssignment_5 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_5()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:962:1: ( rule__PackageDeclaration__ImportsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:962:2: rule__PackageDeclaration__ImportsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ImportsAssignment_5_in_rule__PackageDeclaration__Group__5__Impl2002);
            	    rule__PackageDeclaration__ImportsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getImportsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:972:1: rule__PackageDeclaration__Group__6 : rule__PackageDeclaration__Group__6__Impl ;
    public final void rule__PackageDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:976:1: ( rule__PackageDeclaration__Group__6__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:977:2: rule__PackageDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62033);
            rule__PackageDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__6"


    // $ANTLR start "rule__PackageDeclaration__Group__6__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:983:1: rule__PackageDeclaration__Group__6__Impl : ( ( ( rule__PackageDeclaration__TypesAssignment_6 ) ) ( ( rule__PackageDeclaration__TypesAssignment_6 )* ) ) ;
    public final void rule__PackageDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:987:1: ( ( ( ( rule__PackageDeclaration__TypesAssignment_6 ) ) ( ( rule__PackageDeclaration__TypesAssignment_6 )* ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:988:1: ( ( ( rule__PackageDeclaration__TypesAssignment_6 ) ) ( ( rule__PackageDeclaration__TypesAssignment_6 )* ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:988:1: ( ( ( rule__PackageDeclaration__TypesAssignment_6 ) ) ( ( rule__PackageDeclaration__TypesAssignment_6 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:989:1: ( ( rule__PackageDeclaration__TypesAssignment_6 ) ) ( ( rule__PackageDeclaration__TypesAssignment_6 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:989:1: ( ( rule__PackageDeclaration__TypesAssignment_6 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:990:1: ( rule__PackageDeclaration__TypesAssignment_6 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getTypesAssignment_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:991:1: ( rule__PackageDeclaration__TypesAssignment_6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:991:2: rule__PackageDeclaration__TypesAssignment_6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__TypesAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2062);
            rule__PackageDeclaration__TypesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getTypesAssignment_6()); 

            }

            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:994:1: ( ( rule__PackageDeclaration__TypesAssignment_6 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:995:1: ( rule__PackageDeclaration__TypesAssignment_6 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getTypesAssignment_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:996:1: ( rule__PackageDeclaration__TypesAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_JDOC||LA9_0==24||LA9_0==28||LA9_0==34||(LA9_0>=42 && LA9_0<=43)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:996:2: rule__PackageDeclaration__TypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__TypesAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2074);
            	    rule__PackageDeclaration__TypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getTypesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__6__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1021:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1025:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1026:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02121);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02124);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1033:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1037:1: ( ( 'import' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1038:1: ( 'import' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1038:1: ( 'import' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1039:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl2152); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1052:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1056:1: ( rule__Import__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1057:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12183);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1063:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1067:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1068:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1068:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1069:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1070:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1070:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2210);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_0__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1084:1: rule__TypeRef__Group_0__0 : rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 ;
    public final void rule__TypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1088:1: ( rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1089:2: rule__TypeRef__Group_0__0__Impl rule__TypeRef__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_0__0__Impl_in_rule__TypeRef__Group_0__02244);
            rule__TypeRef__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_0__1_in_rule__TypeRef__Group_0__02247);
            rule__TypeRef__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0"


    // $ANTLR start "rule__TypeRef__Group_0__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1096:1: rule__TypeRef__Group_0__0__Impl : ( 'id' ) ;
    public final void rule__TypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1100:1: ( ( 'id' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1101:1: ( 'id' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1101:1: ( 'id' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1102:1: 'id'
            {
             before(grammarAccess.getTypeRefAccess().getIdKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__TypeRef__Group_0__0__Impl2275); 
             after(grammarAccess.getTypeRefAccess().getIdKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_0__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1115:1: rule__TypeRef__Group_0__1 : rule__TypeRef__Group_0__1__Impl ;
    public final void rule__TypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1119:1: ( rule__TypeRef__Group_0__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1120:2: rule__TypeRef__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_0__1__Impl_in_rule__TypeRef__Group_0__12306);
            rule__TypeRef__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1"


    // $ANTLR start "rule__TypeRef__Group_0__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1126:1: rule__TypeRef__Group_0__1__Impl : ( ( rule__TypeRef__Group_0_1__0 )? ) ;
    public final void rule__TypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1130:1: ( ( ( rule__TypeRef__Group_0_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1131:1: ( ( rule__TypeRef__Group_0_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1131:1: ( ( rule__TypeRef__Group_0_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1132:1: ( rule__TypeRef__Group_0_1__0 )?
            {
             before(grammarAccess.getTypeRefAccess().getGroup_0_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1133:1: ( rule__TypeRef__Group_0_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1133:2: rule__TypeRef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeRef__Group_0_1__0_in_rule__TypeRef__Group_0__1__Impl2333);
                    rule__TypeRef__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_0_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1147:1: rule__TypeRef__Group_0_1__0 : rule__TypeRef__Group_0_1__0__Impl rule__TypeRef__Group_0_1__1 ;
    public final void rule__TypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1151:1: ( rule__TypeRef__Group_0_1__0__Impl rule__TypeRef__Group_0_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1152:2: rule__TypeRef__Group_0_1__0__Impl rule__TypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_0_1__0__Impl_in_rule__TypeRef__Group_0_1__02368);
            rule__TypeRef__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_0_1__1_in_rule__TypeRef__Group_0_1__02371);
            rule__TypeRef__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__0"


    // $ANTLR start "rule__TypeRef__Group_0_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1159:1: rule__TypeRef__Group_0_1__0__Impl : ( '<' ) ;
    public final void rule__TypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1163:1: ( ( '<' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1164:1: ( '<' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1164:1: ( '<' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1165:1: '<'
            {
             before(grammarAccess.getTypeRefAccess().getLessThanSignKeyword_0_1_0()); 
            match(input,21,FOLLOW_21_in_rule__TypeRef__Group_0_1__0__Impl2399); 
             after(grammarAccess.getTypeRefAccess().getLessThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_0_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1178:1: rule__TypeRef__Group_0_1__1 : rule__TypeRef__Group_0_1__1__Impl rule__TypeRef__Group_0_1__2 ;
    public final void rule__TypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1182:1: ( rule__TypeRef__Group_0_1__1__Impl rule__TypeRef__Group_0_1__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1183:2: rule__TypeRef__Group_0_1__1__Impl rule__TypeRef__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_0_1__1__Impl_in_rule__TypeRef__Group_0_1__12430);
            rule__TypeRef__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_0_1__2_in_rule__TypeRef__Group_0_1__12433);
            rule__TypeRef__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__1"


    // $ANTLR start "rule__TypeRef__Group_0_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1190:1: rule__TypeRef__Group_0_1__1__Impl : ( ( rule__TypeRef__TypeAssignment_0_1_1 ) ) ;
    public final void rule__TypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1194:1: ( ( ( rule__TypeRef__TypeAssignment_0_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1195:1: ( ( rule__TypeRef__TypeAssignment_0_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1195:1: ( ( rule__TypeRef__TypeAssignment_0_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1196:1: ( rule__TypeRef__TypeAssignment_0_1_1 )
            {
             before(grammarAccess.getTypeRefAccess().getTypeAssignment_0_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1197:1: ( rule__TypeRef__TypeAssignment_0_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1197:2: rule__TypeRef__TypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__TypeRef__TypeAssignment_0_1_1_in_rule__TypeRef__Group_0_1__1__Impl2460);
            rule__TypeRef__TypeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getTypeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_0_1__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1207:1: rule__TypeRef__Group_0_1__2 : rule__TypeRef__Group_0_1__2__Impl ;
    public final void rule__TypeRef__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1211:1: ( rule__TypeRef__Group_0_1__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1212:2: rule__TypeRef__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_0_1__2__Impl_in_rule__TypeRef__Group_0_1__22490);
            rule__TypeRef__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__2"


    // $ANTLR start "rule__TypeRef__Group_0_1__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1218:1: rule__TypeRef__Group_0_1__2__Impl : ( '>' ) ;
    public final void rule__TypeRef__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1222:1: ( ( '>' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1223:1: ( '>' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1223:1: ( '>' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1224:1: '>'
            {
             before(grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_0_1_2()); 
            match(input,22,FOLLOW_22_in_rule__TypeRef__Group_0_1__2__Impl2518); 
             after(grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_0_1__2__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1243:1: rule__TypeRef__Group_1__0 : rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 ;
    public final void rule__TypeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1247:1: ( rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1248:2: rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1__0__Impl_in_rule__TypeRef__Group_1__02555);
            rule__TypeRef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_1__1_in_rule__TypeRef__Group_1__02558);
            rule__TypeRef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__0"


    // $ANTLR start "rule__TypeRef__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1255:1: rule__TypeRef__Group_1__0__Impl : ( ( rule__TypeRef__TypeAssignment_1_0 ) ) ;
    public final void rule__TypeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1259:1: ( ( ( rule__TypeRef__TypeAssignment_1_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1260:1: ( ( rule__TypeRef__TypeAssignment_1_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1260:1: ( ( rule__TypeRef__TypeAssignment_1_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1261:1: ( rule__TypeRef__TypeAssignment_1_0 )
            {
             before(grammarAccess.getTypeRefAccess().getTypeAssignment_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1262:1: ( rule__TypeRef__TypeAssignment_1_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1262:2: rule__TypeRef__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TypeRef__TypeAssignment_1_0_in_rule__TypeRef__Group_1__0__Impl2585);
            rule__TypeRef__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1272:1: rule__TypeRef__Group_1__1 : rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 ;
    public final void rule__TypeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1276:1: ( rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1277:2: rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1__1__Impl_in_rule__TypeRef__Group_1__12615);
            rule__TypeRef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_1__2_in_rule__TypeRef__Group_1__12618);
            rule__TypeRef__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__1"


    // $ANTLR start "rule__TypeRef__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1284:1: rule__TypeRef__Group_1__1__Impl : ( ( rule__TypeRef__Group_1_1__0 )? ) ;
    public final void rule__TypeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1288:1: ( ( ( rule__TypeRef__Group_1_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1289:1: ( ( rule__TypeRef__Group_1_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1289:1: ( ( rule__TypeRef__Group_1_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1290:1: ( rule__TypeRef__Group_1_1__0 )?
            {
             before(grammarAccess.getTypeRefAccess().getGroup_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1291:1: ( rule__TypeRef__Group_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1291:2: rule__TypeRef__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeRef__Group_1_1__0_in_rule__TypeRef__Group_1__1__Impl2645);
                    rule__TypeRef__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1301:1: rule__TypeRef__Group_1__2 : rule__TypeRef__Group_1__2__Impl ;
    public final void rule__TypeRef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1305:1: ( rule__TypeRef__Group_1__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1306:2: rule__TypeRef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1__2__Impl_in_rule__TypeRef__Group_1__22676);
            rule__TypeRef__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__2"


    // $ANTLR start "rule__TypeRef__Group_1__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1312:1: rule__TypeRef__Group_1__2__Impl : ( ( '*' )? ) ;
    public final void rule__TypeRef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1316:1: ( ( ( '*' )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1317:1: ( ( '*' )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1317:1: ( ( '*' )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1318:1: ( '*' )?
            {
             before(grammarAccess.getTypeRefAccess().getAsteriskKeyword_1_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1319:1: ( '*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1320:2: '*'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeRef__Group_1__2__Impl2705); 

                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getAsteriskKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__2__Impl"


    // $ANTLR start "rule__TypeRef__Group_1_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1337:1: rule__TypeRef__Group_1_1__0 : rule__TypeRef__Group_1_1__0__Impl rule__TypeRef__Group_1_1__1 ;
    public final void rule__TypeRef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1341:1: ( rule__TypeRef__Group_1_1__0__Impl rule__TypeRef__Group_1_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1342:2: rule__TypeRef__Group_1_1__0__Impl rule__TypeRef__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1_1__0__Impl_in_rule__TypeRef__Group_1_1__02744);
            rule__TypeRef__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_1_1__1_in_rule__TypeRef__Group_1_1__02747);
            rule__TypeRef__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__0"


    // $ANTLR start "rule__TypeRef__Group_1_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1349:1: rule__TypeRef__Group_1_1__0__Impl : ( '<' ) ;
    public final void rule__TypeRef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1353:1: ( ( '<' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1354:1: ( '<' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1354:1: ( '<' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1355:1: '<'
            {
             before(grammarAccess.getTypeRefAccess().getLessThanSignKeyword_1_1_0()); 
            match(input,21,FOLLOW_21_in_rule__TypeRef__Group_1_1__0__Impl2775); 
             after(grammarAccess.getTypeRefAccess().getLessThanSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_1_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1368:1: rule__TypeRef__Group_1_1__1 : rule__TypeRef__Group_1_1__1__Impl rule__TypeRef__Group_1_1__2 ;
    public final void rule__TypeRef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1372:1: ( rule__TypeRef__Group_1_1__1__Impl rule__TypeRef__Group_1_1__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1373:2: rule__TypeRef__Group_1_1__1__Impl rule__TypeRef__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1_1__1__Impl_in_rule__TypeRef__Group_1_1__12806);
            rule__TypeRef__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group_1_1__2_in_rule__TypeRef__Group_1_1__12809);
            rule__TypeRef__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__1"


    // $ANTLR start "rule__TypeRef__Group_1_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1380:1: rule__TypeRef__Group_1_1__1__Impl : ( ( rule__TypeRef__GenericTypeAssignment_1_1_1 ) ) ;
    public final void rule__TypeRef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1384:1: ( ( ( rule__TypeRef__GenericTypeAssignment_1_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1385:1: ( ( rule__TypeRef__GenericTypeAssignment_1_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1385:1: ( ( rule__TypeRef__GenericTypeAssignment_1_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1386:1: ( rule__TypeRef__GenericTypeAssignment_1_1_1 )
            {
             before(grammarAccess.getTypeRefAccess().getGenericTypeAssignment_1_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1387:1: ( rule__TypeRef__GenericTypeAssignment_1_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1387:2: rule__TypeRef__GenericTypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__TypeRef__GenericTypeAssignment_1_1_1_in_rule__TypeRef__Group_1_1__1__Impl2836);
            rule__TypeRef__GenericTypeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGenericTypeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1_1__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1397:1: rule__TypeRef__Group_1_1__2 : rule__TypeRef__Group_1_1__2__Impl ;
    public final void rule__TypeRef__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1401:1: ( rule__TypeRef__Group_1_1__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1402:2: rule__TypeRef__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group_1_1__2__Impl_in_rule__TypeRef__Group_1_1__22866);
            rule__TypeRef__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__2"


    // $ANTLR start "rule__TypeRef__Group_1_1__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1408:1: rule__TypeRef__Group_1_1__2__Impl : ( '>' ) ;
    public final void rule__TypeRef__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1412:1: ( ( '>' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1413:1: ( '>' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1413:1: ( '>' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1414:1: '>'
            {
             before(grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_1_1_2()); 
            match(input,22,FOLLOW_22_in_rule__TypeRef__Group_1_1__2__Impl2894); 
             after(grammarAccess.getTypeRefAccess().getGreaterThanSignKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1_1__2__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1433:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1437:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1438:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__02931);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__02934);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1445:1: rule__Protocol__Group__0__Impl : ( ( rule__Protocol__DocAssignment_0 )? ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1449:1: ( ( ( rule__Protocol__DocAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1450:1: ( ( rule__Protocol__DocAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1450:1: ( ( rule__Protocol__DocAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1451:1: ( rule__Protocol__DocAssignment_0 )?
            {
             before(grammarAccess.getProtocolAccess().getDocAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1452:1: ( rule__Protocol__DocAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_JDOC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1452:2: rule__Protocol__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Protocol__DocAssignment_0_in_rule__Protocol__Group__0__Impl2961);
                    rule__Protocol__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtocolAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1462:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1466:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1467:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__12992);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__12995);
            rule__Protocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1474:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__Group_1__0 )? ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1478:1: ( ( ( rule__Protocol__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1479:1: ( ( rule__Protocol__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1479:1: ( ( rule__Protocol__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1480:1: ( rule__Protocol__Group_1__0 )?
            {
             before(grammarAccess.getProtocolAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1481:1: ( rule__Protocol__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1481:2: rule__Protocol__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Protocol__Group_1__0_in_rule__Protocol__Group__1__Impl3022);
                    rule__Protocol__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProtocolAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1491:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1495:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1496:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23053);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23056);
            rule__Protocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1503:1: rule__Protocol__Group__2__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1507:1: ( ( 'protocol' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1508:1: ( 'protocol' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1508:1: ( 'protocol' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1509:1: 'protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Protocol__Group__2__Impl3084); 
             after(grammarAccess.getProtocolAccess().getProtocolKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1522:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1526:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1527:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33115);
            rule__Protocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33118);
            rule__Protocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1534:1: rule__Protocol__Group__3__Impl : ( ( rule__Protocol__NameAssignment_3 ) ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1538:1: ( ( ( rule__Protocol__NameAssignment_3 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1539:1: ( ( rule__Protocol__NameAssignment_3 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1539:1: ( ( rule__Protocol__NameAssignment_3 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1540:1: ( rule__Protocol__NameAssignment_3 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1541:1: ( rule__Protocol__NameAssignment_3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1541:2: rule__Protocol__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Protocol__NameAssignment_3_in_rule__Protocol__Group__3__Impl3145);
            rule__Protocol__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1551:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1555:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1556:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43175);
            rule__Protocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43178);
            rule__Protocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1563:1: rule__Protocol__Group__4__Impl : ( 'since' ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1567:1: ( ( 'since' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1568:1: ( 'since' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1568:1: ( 'since' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1569:1: 'since'
            {
             before(grammarAccess.getProtocolAccess().getSinceKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Protocol__Group__4__Impl3206); 
             after(grammarAccess.getProtocolAccess().getSinceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Protocol__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1582:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl rule__Protocol__Group__6 ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1586:1: ( rule__Protocol__Group__5__Impl rule__Protocol__Group__6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1587:2: rule__Protocol__Group__5__Impl rule__Protocol__Group__6
            {
            pushFollow(FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__53237);
            rule__Protocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__53240);
            rule__Protocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5"


    // $ANTLR start "rule__Protocol__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1594:1: rule__Protocol__Group__5__Impl : ( ( rule__Protocol__SinceAssignment_5 ) ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1598:1: ( ( ( rule__Protocol__SinceAssignment_5 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1599:1: ( ( rule__Protocol__SinceAssignment_5 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1599:1: ( ( rule__Protocol__SinceAssignment_5 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1600:1: ( rule__Protocol__SinceAssignment_5 )
            {
             before(grammarAccess.getProtocolAccess().getSinceAssignment_5()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1601:1: ( rule__Protocol__SinceAssignment_5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1601:2: rule__Protocol__SinceAssignment_5
            {
            pushFollow(FOLLOW_rule__Protocol__SinceAssignment_5_in_rule__Protocol__Group__5__Impl3267);
            rule__Protocol__SinceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getSinceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5__Impl"


    // $ANTLR start "rule__Protocol__Group__6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1611:1: rule__Protocol__Group__6 : rule__Protocol__Group__6__Impl rule__Protocol__Group__7 ;
    public final void rule__Protocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1615:1: ( rule__Protocol__Group__6__Impl rule__Protocol__Group__7 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1616:2: rule__Protocol__Group__6__Impl rule__Protocol__Group__7
            {
            pushFollow(FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__63297);
            rule__Protocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__63300);
            rule__Protocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6"


    // $ANTLR start "rule__Protocol__Group__6__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1623:1: rule__Protocol__Group__6__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1627:1: ( ( '{' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1628:1: ( '{' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1628:1: ( '{' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1629:1: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__Protocol__Group__6__Impl3328); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6__Impl"


    // $ANTLR start "rule__Protocol__Group__7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1642:1: rule__Protocol__Group__7 : rule__Protocol__Group__7__Impl rule__Protocol__Group__8 ;
    public final void rule__Protocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1646:1: ( rule__Protocol__Group__7__Impl rule__Protocol__Group__8 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1647:2: rule__Protocol__Group__7__Impl rule__Protocol__Group__8
            {
            pushFollow(FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__73359);
            rule__Protocol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__73362);
            rule__Protocol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7"


    // $ANTLR start "rule__Protocol__Group__7__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1654:1: rule__Protocol__Group__7__Impl : ( ( rule__Protocol__MessagesAssignment_7 )* ) ;
    public final void rule__Protocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1658:1: ( ( ( rule__Protocol__MessagesAssignment_7 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1659:1: ( ( rule__Protocol__MessagesAssignment_7 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1659:1: ( ( rule__Protocol__MessagesAssignment_7 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1660:1: ( rule__Protocol__MessagesAssignment_7 )*
            {
             before(grammarAccess.getProtocolAccess().getMessagesAssignment_7()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1661:1: ( rule__Protocol__MessagesAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_JDOC||(LA15_0>=12 && LA15_0<=13)||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1661:2: rule__Protocol__MessagesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Protocol__MessagesAssignment_7_in_rule__Protocol__Group__7__Impl3389);
            	    rule__Protocol__MessagesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProtocolAccess().getMessagesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7__Impl"


    // $ANTLR start "rule__Protocol__Group__8"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1671:1: rule__Protocol__Group__8 : rule__Protocol__Group__8__Impl ;
    public final void rule__Protocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1675:1: ( rule__Protocol__Group__8__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1676:2: rule__Protocol__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__83420);
            rule__Protocol__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8"


    // $ANTLR start "rule__Protocol__Group__8__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1682:1: rule__Protocol__Group__8__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1686:1: ( ( '}' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1687:1: ( '}' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1687:1: ( '}' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1688:1: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Protocol__Group__8__Impl3448); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8__Impl"


    // $ANTLR start "rule__Protocol__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1719:1: rule__Protocol__Group_1__0 : rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 ;
    public final void rule__Protocol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1723:1: ( rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1724:2: rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group_1__0__Impl_in_rule__Protocol__Group_1__03497);
            rule__Protocol__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group_1__1_in_rule__Protocol__Group_1__03500);
            rule__Protocol__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_1__0"


    // $ANTLR start "rule__Protocol__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1731:1: rule__Protocol__Group_1__0__Impl : ( 'deprecated' ) ;
    public final void rule__Protocol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1735:1: ( ( 'deprecated' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1736:1: ( 'deprecated' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1736:1: ( 'deprecated' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1737:1: 'deprecated'
            {
             before(grammarAccess.getProtocolAccess().getDeprecatedKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Protocol__Group_1__0__Impl3528); 
             after(grammarAccess.getProtocolAccess().getDeprecatedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_1__0__Impl"


    // $ANTLR start "rule__Protocol__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1750:1: rule__Protocol__Group_1__1 : rule__Protocol__Group_1__1__Impl ;
    public final void rule__Protocol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1754:1: ( rule__Protocol__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1755:2: rule__Protocol__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group_1__1__Impl_in_rule__Protocol__Group_1__13559);
            rule__Protocol__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_1__1"


    // $ANTLR start "rule__Protocol__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1761:1: rule__Protocol__Group_1__1__Impl : ( ( rule__Protocol__DeprecatedAssignment_1_1 ) ) ;
    public final void rule__Protocol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1765:1: ( ( ( rule__Protocol__DeprecatedAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1766:1: ( ( rule__Protocol__DeprecatedAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1766:1: ( ( rule__Protocol__DeprecatedAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1767:1: ( rule__Protocol__DeprecatedAssignment_1_1 )
            {
             before(grammarAccess.getProtocolAccess().getDeprecatedAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1768:1: ( rule__Protocol__DeprecatedAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1768:2: rule__Protocol__DeprecatedAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Protocol__DeprecatedAssignment_1_1_in_rule__Protocol__Group_1__1__Impl3586);
            rule__Protocol__DeprecatedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getDeprecatedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_1__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1782:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1786:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1787:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03620);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03623);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1794:1: rule__Message__Group__0__Impl : ( ( rule__Message__DocAssignment_0 )? ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1798:1: ( ( ( rule__Message__DocAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1799:1: ( ( rule__Message__DocAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1799:1: ( ( rule__Message__DocAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1800:1: ( rule__Message__DocAssignment_0 )?
            {
             before(grammarAccess.getMessageAccess().getDocAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1801:1: ( rule__Message__DocAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_JDOC) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1801:2: rule__Message__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Message__DocAssignment_0_in_rule__Message__Group__0__Impl3650);
                    rule__Message__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1811:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1815:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1816:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13681);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13684);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1823:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )? ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1827:1: ( ( ( rule__Message__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1828:1: ( ( rule__Message__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1828:1: ( ( rule__Message__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1829:1: ( rule__Message__Group_1__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1830:1: ( rule__Message__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1830:2: rule__Message__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl3711);
                    rule__Message__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1840:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1844:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1845:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23742);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__23745);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1852:1: rule__Message__Group__2__Impl : ( ( rule__Message__Alternatives_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1856:1: ( ( ( rule__Message__Alternatives_2 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1857:1: ( ( rule__Message__Alternatives_2 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1857:1: ( ( rule__Message__Alternatives_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1858:1: ( rule__Message__Alternatives_2 )
            {
             before(grammarAccess.getMessageAccess().getAlternatives_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1859:1: ( rule__Message__Alternatives_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1859:2: rule__Message__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Message__Alternatives_2_in_rule__Message__Group__2__Impl3772);
            rule__Message__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1869:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1873:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1874:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__33802);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__33805);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1881:1: rule__Message__Group__3__Impl : ( '(' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1885:1: ( ( '(' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1886:1: ( '(' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1886:1: ( '(' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1887:1: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Message__Group__3__Impl3833); 
             after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1900:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1904:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1905:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__43864);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__5_in_rule__Message__Group__43867);
            rule__Message__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1912:1: rule__Message__Group__4__Impl : ( ( rule__Message__ReturnValueAssignment_4 ) ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1916:1: ( ( ( rule__Message__ReturnValueAssignment_4 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1917:1: ( ( rule__Message__ReturnValueAssignment_4 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1917:1: ( ( rule__Message__ReturnValueAssignment_4 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1918:1: ( rule__Message__ReturnValueAssignment_4 )
            {
             before(grammarAccess.getMessageAccess().getReturnValueAssignment_4()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1919:1: ( rule__Message__ReturnValueAssignment_4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1919:2: rule__Message__ReturnValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Message__ReturnValueAssignment_4_in_rule__Message__Group__4__Impl3894);
            rule__Message__ReturnValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReturnValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1929:1: rule__Message__Group__5 : rule__Message__Group__5__Impl rule__Message__Group__6 ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1933:1: ( rule__Message__Group__5__Impl rule__Message__Group__6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1934:2: rule__Message__Group__5__Impl rule__Message__Group__6
            {
            pushFollow(FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__53924);
            rule__Message__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__6_in_rule__Message__Group__53927);
            rule__Message__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1941:1: rule__Message__Group__5__Impl : ( ')' ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1945:1: ( ( ')' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1946:1: ( ')' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1946:1: ( ')' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1947:1: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Message__Group__5__Impl3955); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__Message__Group__6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1960:1: rule__Message__Group__6 : rule__Message__Group__6__Impl rule__Message__Group__7 ;
    public final void rule__Message__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1964:1: ( rule__Message__Group__6__Impl rule__Message__Group__7 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1965:2: rule__Message__Group__6__Impl rule__Message__Group__7
            {
            pushFollow(FOLLOW_rule__Message__Group__6__Impl_in_rule__Message__Group__63986);
            rule__Message__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__7_in_rule__Message__Group__63989);
            rule__Message__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6"


    // $ANTLR start "rule__Message__Group__6__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1972:1: rule__Message__Group__6__Impl : ( ( ( rule__Message__ElementsAssignment_6 ) ) ( ( rule__Message__ElementsAssignment_6 )* ) ) ;
    public final void rule__Message__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1976:1: ( ( ( ( rule__Message__ElementsAssignment_6 ) ) ( ( rule__Message__ElementsAssignment_6 )* ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1977:1: ( ( ( rule__Message__ElementsAssignment_6 ) ) ( ( rule__Message__ElementsAssignment_6 )* ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1977:1: ( ( ( rule__Message__ElementsAssignment_6 ) ) ( ( rule__Message__ElementsAssignment_6 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1978:1: ( ( rule__Message__ElementsAssignment_6 ) ) ( ( rule__Message__ElementsAssignment_6 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1978:1: ( ( rule__Message__ElementsAssignment_6 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1979:1: ( rule__Message__ElementsAssignment_6 )
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1980:1: ( rule__Message__ElementsAssignment_6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1980:2: rule__Message__ElementsAssignment_6
            {
            pushFollow(FOLLOW_rule__Message__ElementsAssignment_6_in_rule__Message__Group__6__Impl4018);
            rule__Message__ElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getElementsAssignment_6()); 

            }

            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1983:1: ( ( rule__Message__ElementsAssignment_6 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1984:1: ( rule__Message__ElementsAssignment_6 )*
            {
             before(grammarAccess.getMessageAccess().getElementsAssignment_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1985:1: ( rule__Message__ElementsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1985:2: rule__Message__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Message__ElementsAssignment_6_in_rule__Message__Group__6__Impl4030);
            	    rule__Message__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getElementsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__6__Impl"


    // $ANTLR start "rule__Message__Group__7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:1996:1: rule__Message__Group__7 : rule__Message__Group__7__Impl rule__Message__Group__8 ;
    public final void rule__Message__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2000:1: ( rule__Message__Group__7__Impl rule__Message__Group__8 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2001:2: rule__Message__Group__7__Impl rule__Message__Group__8
            {
            pushFollow(FOLLOW_rule__Message__Group__7__Impl_in_rule__Message__Group__74063);
            rule__Message__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__8_in_rule__Message__Group__74066);
            rule__Message__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7"


    // $ANTLR start "rule__Message__Group__7__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2008:1: rule__Message__Group__7__Impl : ( 'since' ) ;
    public final void rule__Message__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2012:1: ( ( 'since' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2013:1: ( 'since' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2013:1: ( 'since' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2014:1: 'since'
            {
             before(grammarAccess.getMessageAccess().getSinceKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__Message__Group__7__Impl4094); 
             after(grammarAccess.getMessageAccess().getSinceKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__7__Impl"


    // $ANTLR start "rule__Message__Group__8"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2027:1: rule__Message__Group__8 : rule__Message__Group__8__Impl rule__Message__Group__9 ;
    public final void rule__Message__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2031:1: ( rule__Message__Group__8__Impl rule__Message__Group__9 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2032:2: rule__Message__Group__8__Impl rule__Message__Group__9
            {
            pushFollow(FOLLOW_rule__Message__Group__8__Impl_in_rule__Message__Group__84125);
            rule__Message__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__9_in_rule__Message__Group__84128);
            rule__Message__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8"


    // $ANTLR start "rule__Message__Group__8__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2039:1: rule__Message__Group__8__Impl : ( ( rule__Message__SinceAssignment_8 ) ) ;
    public final void rule__Message__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2043:1: ( ( ( rule__Message__SinceAssignment_8 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2044:1: ( ( rule__Message__SinceAssignment_8 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2044:1: ( ( rule__Message__SinceAssignment_8 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2045:1: ( rule__Message__SinceAssignment_8 )
            {
             before(grammarAccess.getMessageAccess().getSinceAssignment_8()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2046:1: ( rule__Message__SinceAssignment_8 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2046:2: rule__Message__SinceAssignment_8
            {
            pushFollow(FOLLOW_rule__Message__SinceAssignment_8_in_rule__Message__Group__8__Impl4155);
            rule__Message__SinceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSinceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__8__Impl"


    // $ANTLR start "rule__Message__Group__9"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2056:1: rule__Message__Group__9 : rule__Message__Group__9__Impl rule__Message__Group__10 ;
    public final void rule__Message__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2060:1: ( rule__Message__Group__9__Impl rule__Message__Group__10 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2061:2: rule__Message__Group__9__Impl rule__Message__Group__10
            {
            pushFollow(FOLLOW_rule__Message__Group__9__Impl_in_rule__Message__Group__94185);
            rule__Message__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__10_in_rule__Message__Group__94188);
            rule__Message__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__9"


    // $ANTLR start "rule__Message__Group__9__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2068:1: rule__Message__Group__9__Impl : ( ( rule__Message__Group_9__0 )? ) ;
    public final void rule__Message__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2072:1: ( ( ( rule__Message__Group_9__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2073:1: ( ( rule__Message__Group_9__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2073:1: ( ( rule__Message__Group_9__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2074:1: ( rule__Message__Group_9__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_9()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2075:1: ( rule__Message__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2075:2: rule__Message__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_9__0_in_rule__Message__Group__9__Impl4215);
                    rule__Message__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__9__Impl"


    // $ANTLR start "rule__Message__Group__10"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2085:1: rule__Message__Group__10 : rule__Message__Group__10__Impl ;
    public final void rule__Message__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2089:1: ( rule__Message__Group__10__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2090:2: rule__Message__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__10__Impl_in_rule__Message__Group__104246);
            rule__Message__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__10"


    // $ANTLR start "rule__Message__Group__10__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2096:1: rule__Message__Group__10__Impl : ( ';' ) ;
    public final void rule__Message__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2100:1: ( ( ';' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2101:1: ( ';' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2101:1: ( ';' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2102:1: ';'
            {
             before(grammarAccess.getMessageAccess().getSemicolonKeyword_10()); 
            match(input,31,FOLLOW_31_in_rule__Message__Group__10__Impl4274); 
             after(grammarAccess.getMessageAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__10__Impl"


    // $ANTLR start "rule__Message__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2137:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2141:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2142:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__04327);
            rule__Message__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__04330);
            rule__Message__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0"


    // $ANTLR start "rule__Message__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2149:1: rule__Message__Group_1__0__Impl : ( 'deprecated' ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2153:1: ( ( 'deprecated' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2154:1: ( 'deprecated' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2154:1: ( 'deprecated' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2155:1: 'deprecated'
            {
             before(grammarAccess.getMessageAccess().getDeprecatedKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Message__Group_1__0__Impl4358); 
             after(grammarAccess.getMessageAccess().getDeprecatedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2168:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2172:1: ( rule__Message__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2173:2: rule__Message__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__14389);
            rule__Message__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1"


    // $ANTLR start "rule__Message__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2179:1: rule__Message__Group_1__1__Impl : ( ( rule__Message__DeprecatedAssignment_1_1 ) ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2183:1: ( ( ( rule__Message__DeprecatedAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2184:1: ( ( rule__Message__DeprecatedAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2184:1: ( ( rule__Message__DeprecatedAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2185:1: ( rule__Message__DeprecatedAssignment_1_1 )
            {
             before(grammarAccess.getMessageAccess().getDeprecatedAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2186:1: ( rule__Message__DeprecatedAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2186:2: rule__Message__DeprecatedAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Message__DeprecatedAssignment_1_1_in_rule__Message__Group_1__1__Impl4416);
            rule__Message__DeprecatedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getDeprecatedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1__Impl"


    // $ANTLR start "rule__Message__Group_9__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2200:1: rule__Message__Group_9__0 : rule__Message__Group_9__0__Impl rule__Message__Group_9__1 ;
    public final void rule__Message__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2204:1: ( rule__Message__Group_9__0__Impl rule__Message__Group_9__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2205:2: rule__Message__Group_9__0__Impl rule__Message__Group_9__1
            {
            pushFollow(FOLLOW_rule__Message__Group_9__0__Impl_in_rule__Message__Group_9__04450);
            rule__Message__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_9__1_in_rule__Message__Group_9__04453);
            rule__Message__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_9__0"


    // $ANTLR start "rule__Message__Group_9__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2212:1: rule__Message__Group_9__0__Impl : ( 'mapped-to' ) ;
    public final void rule__Message__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2216:1: ( ( 'mapped-to' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2217:1: ( 'mapped-to' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2217:1: ( 'mapped-to' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2218:1: 'mapped-to'
            {
             before(grammarAccess.getMessageAccess().getMappedToKeyword_9_0()); 
            match(input,18,FOLLOW_18_in_rule__Message__Group_9__0__Impl4481); 
             after(grammarAccess.getMessageAccess().getMappedToKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_9__0__Impl"


    // $ANTLR start "rule__Message__Group_9__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2231:1: rule__Message__Group_9__1 : rule__Message__Group_9__1__Impl ;
    public final void rule__Message__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2235:1: ( rule__Message__Group_9__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2236:2: rule__Message__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_9__1__Impl_in_rule__Message__Group_9__14512);
            rule__Message__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_9__1"


    // $ANTLR start "rule__Message__Group_9__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2242:1: rule__Message__Group_9__1__Impl : ( ( rule__Message__JavaNameAssignment_9_1 ) ) ;
    public final void rule__Message__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2246:1: ( ( ( rule__Message__JavaNameAssignment_9_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2247:1: ( ( rule__Message__JavaNameAssignment_9_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2247:1: ( ( rule__Message__JavaNameAssignment_9_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2248:1: ( rule__Message__JavaNameAssignment_9_1 )
            {
             before(grammarAccess.getMessageAccess().getJavaNameAssignment_9_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2249:1: ( rule__Message__JavaNameAssignment_9_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2249:2: rule__Message__JavaNameAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Message__JavaNameAssignment_9_1_in_rule__Message__Group_9__1__Impl4539);
            rule__Message__JavaNameAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getJavaNameAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_9__1__Impl"


    // $ANTLR start "rule__MessageElement__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2263:1: rule__MessageElement__Group__0 : rule__MessageElement__Group__0__Impl rule__MessageElement__Group__1 ;
    public final void rule__MessageElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2267:1: ( rule__MessageElement__Group__0__Impl rule__MessageElement__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2268:2: rule__MessageElement__Group__0__Impl rule__MessageElement__Group__1
            {
            pushFollow(FOLLOW_rule__MessageElement__Group__0__Impl_in_rule__MessageElement__Group__04573);
            rule__MessageElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group__1_in_rule__MessageElement__Group__04576);
            rule__MessageElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group__0"


    // $ANTLR start "rule__MessageElement__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2275:1: rule__MessageElement__Group__0__Impl : ( ( rule__MessageElement__NameAssignment_0 ) ) ;
    public final void rule__MessageElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2279:1: ( ( ( rule__MessageElement__NameAssignment_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2280:1: ( ( rule__MessageElement__NameAssignment_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2280:1: ( ( rule__MessageElement__NameAssignment_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2281:1: ( rule__MessageElement__NameAssignment_0 )
            {
             before(grammarAccess.getMessageElementAccess().getNameAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2282:1: ( rule__MessageElement__NameAssignment_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2282:2: rule__MessageElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageElement__NameAssignment_0_in_rule__MessageElement__Group__0__Impl4603);
            rule__MessageElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group__0__Impl"


    // $ANTLR start "rule__MessageElement__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2292:1: rule__MessageElement__Group__1 : rule__MessageElement__Group__1__Impl ;
    public final void rule__MessageElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2296:1: ( rule__MessageElement__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2297:2: rule__MessageElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageElement__Group__1__Impl_in_rule__MessageElement__Group__14633);
            rule__MessageElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group__1"


    // $ANTLR start "rule__MessageElement__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2303:1: rule__MessageElement__Group__1__Impl : ( ( rule__MessageElement__Group_1__0 )? ) ;
    public final void rule__MessageElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2307:1: ( ( ( rule__MessageElement__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2308:1: ( ( rule__MessageElement__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2308:1: ( ( rule__MessageElement__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2309:1: ( rule__MessageElement__Group_1__0 )?
            {
             before(grammarAccess.getMessageElementAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2310:1: ( rule__MessageElement__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2310:2: rule__MessageElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageElement__Group_1__0_in_rule__MessageElement__Group__1__Impl4660);
                    rule__MessageElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group__1__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2324:1: rule__MessageElement__Group_1__0 : rule__MessageElement__Group_1__0__Impl rule__MessageElement__Group_1__1 ;
    public final void rule__MessageElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2328:1: ( rule__MessageElement__Group_1__0__Impl rule__MessageElement__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2329:2: rule__MessageElement__Group_1__0__Impl rule__MessageElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__0__Impl_in_rule__MessageElement__Group_1__04695);
            rule__MessageElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group_1__1_in_rule__MessageElement__Group_1__04698);
            rule__MessageElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__0"


    // $ANTLR start "rule__MessageElement__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2336:1: rule__MessageElement__Group_1__0__Impl : ( ':' ) ;
    public final void rule__MessageElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2340:1: ( ( ':' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2341:1: ( ':' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2341:1: ( ':' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2342:1: ':'
            {
             before(grammarAccess.getMessageElementAccess().getColonKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__MessageElement__Group_1__0__Impl4726); 
             after(grammarAccess.getMessageElementAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__0__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2355:1: rule__MessageElement__Group_1__1 : rule__MessageElement__Group_1__1__Impl rule__MessageElement__Group_1__2 ;
    public final void rule__MessageElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2359:1: ( rule__MessageElement__Group_1__1__Impl rule__MessageElement__Group_1__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2360:2: rule__MessageElement__Group_1__1__Impl rule__MessageElement__Group_1__2
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__1__Impl_in_rule__MessageElement__Group_1__14757);
            rule__MessageElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group_1__2_in_rule__MessageElement__Group_1__14760);
            rule__MessageElement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__1"


    // $ANTLR start "rule__MessageElement__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2367:1: rule__MessageElement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__MessageElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2371:1: ( ( '(' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2372:1: ( '(' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2372:1: ( '(' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2373:1: '('
            {
             before(grammarAccess.getMessageElementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__MessageElement__Group_1__1__Impl4788); 
             after(grammarAccess.getMessageElementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__1__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2386:1: rule__MessageElement__Group_1__2 : rule__MessageElement__Group_1__2__Impl rule__MessageElement__Group_1__3 ;
    public final void rule__MessageElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2390:1: ( rule__MessageElement__Group_1__2__Impl rule__MessageElement__Group_1__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2391:2: rule__MessageElement__Group_1__2__Impl rule__MessageElement__Group_1__3
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__2__Impl_in_rule__MessageElement__Group_1__24819);
            rule__MessageElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group_1__3_in_rule__MessageElement__Group_1__24822);
            rule__MessageElement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__2"


    // $ANTLR start "rule__MessageElement__Group_1__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2398:1: rule__MessageElement__Group_1__2__Impl : ( ( 'const' )? ) ;
    public final void rule__MessageElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2402:1: ( ( ( 'const' )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2403:1: ( ( 'const' )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2403:1: ( ( 'const' )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2404:1: ( 'const' )?
            {
             before(grammarAccess.getMessageElementAccess().getConstKeyword_1_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2405:1: ( 'const' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2406:2: 'const'
                    {
                    match(input,33,FOLLOW_33_in_rule__MessageElement__Group_1__2__Impl4851); 

                    }
                    break;

            }

             after(grammarAccess.getMessageElementAccess().getConstKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__2__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2417:1: rule__MessageElement__Group_1__3 : rule__MessageElement__Group_1__3__Impl rule__MessageElement__Group_1__4 ;
    public final void rule__MessageElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2421:1: ( rule__MessageElement__Group_1__3__Impl rule__MessageElement__Group_1__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2422:2: rule__MessageElement__Group_1__3__Impl rule__MessageElement__Group_1__4
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__3__Impl_in_rule__MessageElement__Group_1__34884);
            rule__MessageElement__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group_1__4_in_rule__MessageElement__Group_1__34887);
            rule__MessageElement__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__3"


    // $ANTLR start "rule__MessageElement__Group_1__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2429:1: rule__MessageElement__Group_1__3__Impl : ( ( rule__MessageElement__TypeAssignment_1_3 ) ) ;
    public final void rule__MessageElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2433:1: ( ( ( rule__MessageElement__TypeAssignment_1_3 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2434:1: ( ( rule__MessageElement__TypeAssignment_1_3 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2434:1: ( ( rule__MessageElement__TypeAssignment_1_3 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2435:1: ( rule__MessageElement__TypeAssignment_1_3 )
            {
             before(grammarAccess.getMessageElementAccess().getTypeAssignment_1_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2436:1: ( rule__MessageElement__TypeAssignment_1_3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2436:2: rule__MessageElement__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__MessageElement__TypeAssignment_1_3_in_rule__MessageElement__Group_1__3__Impl4914);
            rule__MessageElement__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageElementAccess().getTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__3__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2446:1: rule__MessageElement__Group_1__4 : rule__MessageElement__Group_1__4__Impl rule__MessageElement__Group_1__5 ;
    public final void rule__MessageElement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2450:1: ( rule__MessageElement__Group_1__4__Impl rule__MessageElement__Group_1__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2451:2: rule__MessageElement__Group_1__4__Impl rule__MessageElement__Group_1__5
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__4__Impl_in_rule__MessageElement__Group_1__44944);
            rule__MessageElement__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageElement__Group_1__5_in_rule__MessageElement__Group_1__44947);
            rule__MessageElement__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__4"


    // $ANTLR start "rule__MessageElement__Group_1__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2458:1: rule__MessageElement__Group_1__4__Impl : ( ')' ) ;
    public final void rule__MessageElement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2462:1: ( ( ')' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2463:1: ( ')' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2463:1: ( ')' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2464:1: ')'
            {
             before(grammarAccess.getMessageElementAccess().getRightParenthesisKeyword_1_4()); 
            match(input,30,FOLLOW_30_in_rule__MessageElement__Group_1__4__Impl4975); 
             after(grammarAccess.getMessageElementAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__4__Impl"


    // $ANTLR start "rule__MessageElement__Group_1__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2477:1: rule__MessageElement__Group_1__5 : rule__MessageElement__Group_1__5__Impl ;
    public final void rule__MessageElement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2481:1: ( rule__MessageElement__Group_1__5__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2482:2: rule__MessageElement__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__MessageElement__Group_1__5__Impl_in_rule__MessageElement__Group_1__55006);
            rule__MessageElement__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__5"


    // $ANTLR start "rule__MessageElement__Group_1__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2488:1: rule__MessageElement__Group_1__5__Impl : ( ( rule__MessageElement__VariableAssignment_1_5 ) ) ;
    public final void rule__MessageElement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2492:1: ( ( ( rule__MessageElement__VariableAssignment_1_5 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2493:1: ( ( rule__MessageElement__VariableAssignment_1_5 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2493:1: ( ( rule__MessageElement__VariableAssignment_1_5 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2494:1: ( rule__MessageElement__VariableAssignment_1_5 )
            {
             before(grammarAccess.getMessageElementAccess().getVariableAssignment_1_5()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2495:1: ( rule__MessageElement__VariableAssignment_1_5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2495:2: rule__MessageElement__VariableAssignment_1_5
            {
            pushFollow(FOLLOW_rule__MessageElement__VariableAssignment_1_5_in_rule__MessageElement__Group_1__5__Impl5033);
            rule__MessageElement__VariableAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageElementAccess().getVariableAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__Group_1__5__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2517:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2521:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2522:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__05075);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__05078);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2529:1: rule__Class__Group__0__Impl : ( ( rule__Class__DocAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2533:1: ( ( ( rule__Class__DocAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2534:1: ( ( rule__Class__DocAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2534:1: ( ( rule__Class__DocAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2535:1: ( rule__Class__DocAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getDocAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2536:1: ( rule__Class__DocAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_JDOC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2536:2: rule__Class__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Class__DocAssignment_0_in_rule__Class__Group__0__Impl5105);
                    rule__Class__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2546:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2550:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2551:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__15136);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__15139);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2558:1: rule__Class__Group__1__Impl : ( ( rule__Class__Group_1__0 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2562:1: ( ( ( rule__Class__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2563:1: ( ( rule__Class__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2563:1: ( ( rule__Class__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2564:1: ( rule__Class__Group_1__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2565:1: ( rule__Class__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2565:2: rule__Class__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_1__0_in_rule__Class__Group__1__Impl5166);
                    rule__Class__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2575:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2579:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2580:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__25197);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__25200);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2587:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2591:1: ( ( 'class' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2592:1: ( 'class' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2592:1: ( 'class' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2593:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Class__Group__2__Impl5228); 
             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2606:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2610:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2611:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__35259);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__35262);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2618:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2622:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2623:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2623:1: ( ( rule__Class__NameAssignment_3 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2624:1: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2625:1: ( rule__Class__NameAssignment_3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2625:2: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_3_in_rule__Class__Group__3__Impl5289);
            rule__Class__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2635:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2639:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2640:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__45319);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__45322);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2647:1: rule__Class__Group__4__Impl : ( 'since' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2651:1: ( ( 'since' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2652:1: ( 'since' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2652:1: ( 'since' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2653:1: 'since'
            {
             before(grammarAccess.getClassAccess().getSinceKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Class__Group__4__Impl5350); 
             after(grammarAccess.getClassAccess().getSinceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2666:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2670:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2671:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__55381);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__55384);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2678:1: rule__Class__Group__5__Impl : ( ( rule__Class__SinceAssignment_5 ) ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2682:1: ( ( ( rule__Class__SinceAssignment_5 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2683:1: ( ( rule__Class__SinceAssignment_5 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2683:1: ( ( rule__Class__SinceAssignment_5 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2684:1: ( rule__Class__SinceAssignment_5 )
            {
             before(grammarAccess.getClassAccess().getSinceAssignment_5()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2685:1: ( rule__Class__SinceAssignment_5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2685:2: rule__Class__SinceAssignment_5
            {
            pushFollow(FOLLOW_rule__Class__SinceAssignment_5_in_rule__Class__Group__5__Impl5411);
            rule__Class__SinceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSinceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2695:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2699:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2700:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__65441);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__7_in_rule__Class__Group__65444);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2707:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2711:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2712:1: ( ( rule__Class__Group_6__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2712:1: ( ( rule__Class__Group_6__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2713:1: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2714:1: ( rule__Class__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2714:2: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_6__0_in_rule__Class__Group__6__Impl5471);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2724:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2728:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2729:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__75502);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__8_in_rule__Class__Group__75505);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2736:1: rule__Class__Group__7__Impl : ( ( rule__Class__Group_7__0 )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2740:1: ( ( ( rule__Class__Group_7__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2741:1: ( ( rule__Class__Group_7__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2741:1: ( ( rule__Class__Group_7__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2742:1: ( rule__Class__Group_7__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_7()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2743:1: ( rule__Class__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2743:2: rule__Class__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_7__0_in_rule__Class__Group__7__Impl5532);
                    rule__Class__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2753:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2757:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2758:2: rule__Class__Group__8__Impl rule__Class__Group__9
            {
            pushFollow(FOLLOW_rule__Class__Group__8__Impl_in_rule__Class__Group__85563);
            rule__Class__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__9_in_rule__Class__Group__85566);
            rule__Class__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2765:1: rule__Class__Group__8__Impl : ( '{' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2769:1: ( ( '{' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2770:1: ( '{' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2770:1: ( '{' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2771:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Class__Group__8__Impl5594); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group__9"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2784:1: rule__Class__Group__9 : rule__Class__Group__9__Impl rule__Class__Group__10 ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2788:1: ( rule__Class__Group__9__Impl rule__Class__Group__10 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2789:2: rule__Class__Group__9__Impl rule__Class__Group__10
            {
            pushFollow(FOLLOW_rule__Class__Group__9__Impl_in_rule__Class__Group__95625);
            rule__Class__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__10_in_rule__Class__Group__95628);
            rule__Class__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9"


    // $ANTLR start "rule__Class__Group__9__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2796:1: rule__Class__Group__9__Impl : ( ( rule__Class__Group_9__0 )? ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2800:1: ( ( ( rule__Class__Group_9__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2801:1: ( ( rule__Class__Group_9__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2801:1: ( ( rule__Class__Group_9__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2802:1: ( rule__Class__Group_9__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_9()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2803:1: ( rule__Class__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2803:2: rule__Class__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_9__0_in_rule__Class__Group__9__Impl5655);
                    rule__Class__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9__Impl"


    // $ANTLR start "rule__Class__Group__10"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2813:1: rule__Class__Group__10 : rule__Class__Group__10__Impl rule__Class__Group__11 ;
    public final void rule__Class__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2817:1: ( rule__Class__Group__10__Impl rule__Class__Group__11 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2818:2: rule__Class__Group__10__Impl rule__Class__Group__11
            {
            pushFollow(FOLLOW_rule__Class__Group__10__Impl_in_rule__Class__Group__105686);
            rule__Class__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__11_in_rule__Class__Group__105689);
            rule__Class__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__10"


    // $ANTLR start "rule__Class__Group__10__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2825:1: rule__Class__Group__10__Impl : ( ( rule__Class__PropertiesAssignment_10 )* ) ;
    public final void rule__Class__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2829:1: ( ( ( rule__Class__PropertiesAssignment_10 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2830:1: ( ( rule__Class__PropertiesAssignment_10 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2830:1: ( ( rule__Class__PropertiesAssignment_10 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2831:1: ( rule__Class__PropertiesAssignment_10 )*
            {
             before(grammarAccess.getClassAccess().getPropertiesAssignment_10()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2832:1: ( rule__Class__PropertiesAssignment_10 )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==28) ) {
                        int LA27_2 = input.LA(3);

                        if ( (LA27_2==RULE_INT) ) {
                            int LA27_5 = input.LA(4);

                            if ( (LA27_5==39) ) {
                                int LA27_6 = input.LA(5);

                                if ( (LA27_6==RULE_INT) ) {
                                    int LA27_7 = input.LA(6);

                                    if ( (LA27_7==40) ) {
                                        alt27=1;
                                    }


                                }


                            }


                        }


                    }
                    else if ( (LA27_1==40) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_INT) ) {
                        int LA27_5 = input.LA(3);

                        if ( (LA27_5==39) ) {
                            int LA27_6 = input.LA(4);

                            if ( (LA27_6==RULE_INT) ) {
                                int LA27_7 = input.LA(5);

                                if ( (LA27_7==40) ) {
                                    alt27=1;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 40:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2832:2: rule__Class__PropertiesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Class__PropertiesAssignment_10_in_rule__Class__Group__10__Impl5716);
            	    rule__Class__PropertiesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getPropertiesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__10__Impl"


    // $ANTLR start "rule__Class__Group__11"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2842:1: rule__Class__Group__11 : rule__Class__Group__11__Impl rule__Class__Group__12 ;
    public final void rule__Class__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2846:1: ( rule__Class__Group__11__Impl rule__Class__Group__12 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2847:2: rule__Class__Group__11__Impl rule__Class__Group__12
            {
            pushFollow(FOLLOW_rule__Class__Group__11__Impl_in_rule__Class__Group__115747);
            rule__Class__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__12_in_rule__Class__Group__115750);
            rule__Class__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__11"


    // $ANTLR start "rule__Class__Group__11__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2854:1: rule__Class__Group__11__Impl : ( ( rule__Class__MessagesAssignment_11 )* ) ;
    public final void rule__Class__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2858:1: ( ( ( rule__Class__MessagesAssignment_11 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2859:1: ( ( rule__Class__MessagesAssignment_11 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2859:1: ( ( rule__Class__MessagesAssignment_11 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2860:1: ( rule__Class__MessagesAssignment_11 )*
            {
             before(grammarAccess.getClassAccess().getMessagesAssignment_11()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2861:1: ( rule__Class__MessagesAssignment_11 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_JDOC||(LA28_0>=12 && LA28_0<=13)||LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2861:2: rule__Class__MessagesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__Class__MessagesAssignment_11_in_rule__Class__Group__11__Impl5777);
            	    rule__Class__MessagesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMessagesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__11__Impl"


    // $ANTLR start "rule__Class__Group__12"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2871:1: rule__Class__Group__12 : rule__Class__Group__12__Impl ;
    public final void rule__Class__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2875:1: ( rule__Class__Group__12__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2876:2: rule__Class__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__12__Impl_in_rule__Class__Group__125808);
            rule__Class__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__12"


    // $ANTLR start "rule__Class__Group__12__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2882:1: rule__Class__Group__12__Impl : ( '}' ) ;
    public final void rule__Class__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2886:1: ( ( '}' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2887:1: ( '}' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2887:1: ( '}' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2888:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_27_in_rule__Class__Group__12__Impl5836); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__12__Impl"


    // $ANTLR start "rule__Class__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2927:1: rule__Class__Group_1__0 : rule__Class__Group_1__0__Impl rule__Class__Group_1__1 ;
    public final void rule__Class__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2931:1: ( rule__Class__Group_1__0__Impl rule__Class__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2932:2: rule__Class__Group_1__0__Impl rule__Class__Group_1__1
            {
            pushFollow(FOLLOW_rule__Class__Group_1__0__Impl_in_rule__Class__Group_1__05893);
            rule__Class__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_1__1_in_rule__Class__Group_1__05896);
            rule__Class__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0"


    // $ANTLR start "rule__Class__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2939:1: rule__Class__Group_1__0__Impl : ( 'deprecated' ) ;
    public final void rule__Class__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2943:1: ( ( 'deprecated' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2944:1: ( 'deprecated' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2944:1: ( 'deprecated' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2945:1: 'deprecated'
            {
             before(grammarAccess.getClassAccess().getDeprecatedKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Class__Group_1__0__Impl5924); 
             after(grammarAccess.getClassAccess().getDeprecatedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__0__Impl"


    // $ANTLR start "rule__Class__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2958:1: rule__Class__Group_1__1 : rule__Class__Group_1__1__Impl ;
    public final void rule__Class__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2962:1: ( rule__Class__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2963:2: rule__Class__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_1__1__Impl_in_rule__Class__Group_1__15955);
            rule__Class__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1"


    // $ANTLR start "rule__Class__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2969:1: rule__Class__Group_1__1__Impl : ( ( rule__Class__DeprecatedAssignment_1_1 ) ) ;
    public final void rule__Class__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2973:1: ( ( ( rule__Class__DeprecatedAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2974:1: ( ( rule__Class__DeprecatedAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2974:1: ( ( rule__Class__DeprecatedAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2975:1: ( rule__Class__DeprecatedAssignment_1_1 )
            {
             before(grammarAccess.getClassAccess().getDeprecatedAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2976:1: ( rule__Class__DeprecatedAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2976:2: rule__Class__DeprecatedAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Class__DeprecatedAssignment_1_1_in_rule__Class__Group_1__1__Impl5982);
            rule__Class__DeprecatedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getDeprecatedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2990:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2994:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:2995:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_rule__Class__Group_6__0__Impl_in_rule__Class__Group_6__06016);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_6__1_in_rule__Class__Group_6__06019);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3002:1: rule__Class__Group_6__0__Impl : ( 'inherits' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3006:1: ( ( 'inherits' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3007:1: ( 'inherits' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3007:1: ( 'inherits' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3008:1: 'inherits'
            {
             before(grammarAccess.getClassAccess().getInheritsKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__Class__Group_6__0__Impl6047); 
             after(grammarAccess.getClassAccess().getInheritsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3021:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3025:1: ( rule__Class__Group_6__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3026:2: rule__Class__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_6__1__Impl_in_rule__Class__Group_6__16078);
            rule__Class__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3032:1: rule__Class__Group_6__1__Impl : ( ( rule__Class__ParentAssignment_6_1 ) ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3036:1: ( ( ( rule__Class__ParentAssignment_6_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3037:1: ( ( rule__Class__ParentAssignment_6_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3037:1: ( ( rule__Class__ParentAssignment_6_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3038:1: ( rule__Class__ParentAssignment_6_1 )
            {
             before(grammarAccess.getClassAccess().getParentAssignment_6_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3039:1: ( rule__Class__ParentAssignment_6_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3039:2: rule__Class__ParentAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Class__ParentAssignment_6_1_in_rule__Class__Group_6__1__Impl6105);
            rule__Class__ParentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_7__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3053:1: rule__Class__Group_7__0 : rule__Class__Group_7__0__Impl rule__Class__Group_7__1 ;
    public final void rule__Class__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3057:1: ( rule__Class__Group_7__0__Impl rule__Class__Group_7__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3058:2: rule__Class__Group_7__0__Impl rule__Class__Group_7__1
            {
            pushFollow(FOLLOW_rule__Class__Group_7__0__Impl_in_rule__Class__Group_7__06139);
            rule__Class__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_7__1_in_rule__Class__Group_7__06142);
            rule__Class__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0"


    // $ANTLR start "rule__Class__Group_7__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3065:1: rule__Class__Group_7__0__Impl : ( 'conforms' ) ;
    public final void rule__Class__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3069:1: ( ( 'conforms' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3070:1: ( 'conforms' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3070:1: ( 'conforms' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3071:1: 'conforms'
            {
             before(grammarAccess.getClassAccess().getConformsKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__Class__Group_7__0__Impl6170); 
             after(grammarAccess.getClassAccess().getConformsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0__Impl"


    // $ANTLR start "rule__Class__Group_7__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3084:1: rule__Class__Group_7__1 : rule__Class__Group_7__1__Impl rule__Class__Group_7__2 ;
    public final void rule__Class__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3088:1: ( rule__Class__Group_7__1__Impl rule__Class__Group_7__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3089:2: rule__Class__Group_7__1__Impl rule__Class__Group_7__2
            {
            pushFollow(FOLLOW_rule__Class__Group_7__1__Impl_in_rule__Class__Group_7__16201);
            rule__Class__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_7__2_in_rule__Class__Group_7__16204);
            rule__Class__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1"


    // $ANTLR start "rule__Class__Group_7__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3096:1: rule__Class__Group_7__1__Impl : ( ( rule__Class__ProtocolsAssignment_7_1 ) ) ;
    public final void rule__Class__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3100:1: ( ( ( rule__Class__ProtocolsAssignment_7_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3101:1: ( ( rule__Class__ProtocolsAssignment_7_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3101:1: ( ( rule__Class__ProtocolsAssignment_7_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3102:1: ( rule__Class__ProtocolsAssignment_7_1 )
            {
             before(grammarAccess.getClassAccess().getProtocolsAssignment_7_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3103:1: ( rule__Class__ProtocolsAssignment_7_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3103:2: rule__Class__ProtocolsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Class__ProtocolsAssignment_7_1_in_rule__Class__Group_7__1__Impl6231);
            rule__Class__ProtocolsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getProtocolsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1__Impl"


    // $ANTLR start "rule__Class__Group_7__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3113:1: rule__Class__Group_7__2 : rule__Class__Group_7__2__Impl ;
    public final void rule__Class__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3117:1: ( rule__Class__Group_7__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3118:2: rule__Class__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_7__2__Impl_in_rule__Class__Group_7__26261);
            rule__Class__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2"


    // $ANTLR start "rule__Class__Group_7__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3124:1: rule__Class__Group_7__2__Impl : ( ( rule__Class__Group_7_2__0 )* ) ;
    public final void rule__Class__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3128:1: ( ( ( rule__Class__Group_7_2__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3129:1: ( ( rule__Class__Group_7_2__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3129:1: ( ( rule__Class__Group_7_2__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3130:1: ( rule__Class__Group_7_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_7_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3131:1: ( rule__Class__Group_7_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3131:2: rule__Class__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class__Group_7_2__0_in_rule__Class__Group_7__2__Impl6288);
            	    rule__Class__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2__Impl"


    // $ANTLR start "rule__Class__Group_7_2__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3147:1: rule__Class__Group_7_2__0 : rule__Class__Group_7_2__0__Impl rule__Class__Group_7_2__1 ;
    public final void rule__Class__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3151:1: ( rule__Class__Group_7_2__0__Impl rule__Class__Group_7_2__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3152:2: rule__Class__Group_7_2__0__Impl rule__Class__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_7_2__0__Impl_in_rule__Class__Group_7_2__06325);
            rule__Class__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_7_2__1_in_rule__Class__Group_7_2__06328);
            rule__Class__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_2__0"


    // $ANTLR start "rule__Class__Group_7_2__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3159:1: rule__Class__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3163:1: ( ( ',' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3164:1: ( ',' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3164:1: ( ',' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3165:1: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_7_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Class__Group_7_2__0__Impl6356); 
             after(grammarAccess.getClassAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_2__0__Impl"


    // $ANTLR start "rule__Class__Group_7_2__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3178:1: rule__Class__Group_7_2__1 : rule__Class__Group_7_2__1__Impl ;
    public final void rule__Class__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3182:1: ( rule__Class__Group_7_2__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3183:2: rule__Class__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_7_2__1__Impl_in_rule__Class__Group_7_2__16387);
            rule__Class__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_2__1"


    // $ANTLR start "rule__Class__Group_7_2__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3189:1: rule__Class__Group_7_2__1__Impl : ( ( rule__Class__ProtocolsAssignment_7_2_1 ) ) ;
    public final void rule__Class__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3193:1: ( ( ( rule__Class__ProtocolsAssignment_7_2_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3194:1: ( ( rule__Class__ProtocolsAssignment_7_2_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3194:1: ( ( rule__Class__ProtocolsAssignment_7_2_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3195:1: ( rule__Class__ProtocolsAssignment_7_2_1 )
            {
             before(grammarAccess.getClassAccess().getProtocolsAssignment_7_2_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3196:1: ( rule__Class__ProtocolsAssignment_7_2_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3196:2: rule__Class__ProtocolsAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Class__ProtocolsAssignment_7_2_1_in_rule__Class__Group_7_2__1__Impl6414);
            rule__Class__ProtocolsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getProtocolsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_2__1__Impl"


    // $ANTLR start "rule__Class__Group_9__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3210:1: rule__Class__Group_9__0 : rule__Class__Group_9__0__Impl rule__Class__Group_9__1 ;
    public final void rule__Class__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3214:1: ( rule__Class__Group_9__0__Impl rule__Class__Group_9__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3215:2: rule__Class__Group_9__0__Impl rule__Class__Group_9__1
            {
            pushFollow(FOLLOW_rule__Class__Group_9__0__Impl_in_rule__Class__Group_9__06448);
            rule__Class__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_9__1_in_rule__Class__Group_9__06451);
            rule__Class__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__0"


    // $ANTLR start "rule__Class__Group_9__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3222:1: rule__Class__Group_9__0__Impl : ( 'initializers' ) ;
    public final void rule__Class__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3226:1: ( ( 'initializers' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3227:1: ( 'initializers' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3227:1: ( 'initializers' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3228:1: 'initializers'
            {
             before(grammarAccess.getClassAccess().getInitializersKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__Class__Group_9__0__Impl6479); 
             after(grammarAccess.getClassAccess().getInitializersKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__0__Impl"


    // $ANTLR start "rule__Class__Group_9__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3241:1: rule__Class__Group_9__1 : rule__Class__Group_9__1__Impl rule__Class__Group_9__2 ;
    public final void rule__Class__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3245:1: ( rule__Class__Group_9__1__Impl rule__Class__Group_9__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3246:2: rule__Class__Group_9__1__Impl rule__Class__Group_9__2
            {
            pushFollow(FOLLOW_rule__Class__Group_9__1__Impl_in_rule__Class__Group_9__16510);
            rule__Class__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_9__2_in_rule__Class__Group_9__16513);
            rule__Class__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__1"


    // $ANTLR start "rule__Class__Group_9__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3253:1: rule__Class__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3257:1: ( ( '{' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3258:1: ( '{' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3258:1: ( '{' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3259:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,26,FOLLOW_26_in_rule__Class__Group_9__1__Impl6541); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__1__Impl"


    // $ANTLR start "rule__Class__Group_9__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3272:1: rule__Class__Group_9__2 : rule__Class__Group_9__2__Impl rule__Class__Group_9__3 ;
    public final void rule__Class__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3276:1: ( rule__Class__Group_9__2__Impl rule__Class__Group_9__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3277:2: rule__Class__Group_9__2__Impl rule__Class__Group_9__3
            {
            pushFollow(FOLLOW_rule__Class__Group_9__2__Impl_in_rule__Class__Group_9__26572);
            rule__Class__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_9__3_in_rule__Class__Group_9__26575);
            rule__Class__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__2"


    // $ANTLR start "rule__Class__Group_9__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3284:1: rule__Class__Group_9__2__Impl : ( ( ( rule__Class__InitializerMessagesAssignment_9_2 ) ) ( ( rule__Class__InitializerMessagesAssignment_9_2 )* ) ) ;
    public final void rule__Class__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3288:1: ( ( ( ( rule__Class__InitializerMessagesAssignment_9_2 ) ) ( ( rule__Class__InitializerMessagesAssignment_9_2 )* ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3289:1: ( ( ( rule__Class__InitializerMessagesAssignment_9_2 ) ) ( ( rule__Class__InitializerMessagesAssignment_9_2 )* ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3289:1: ( ( ( rule__Class__InitializerMessagesAssignment_9_2 ) ) ( ( rule__Class__InitializerMessagesAssignment_9_2 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3290:1: ( ( rule__Class__InitializerMessagesAssignment_9_2 ) ) ( ( rule__Class__InitializerMessagesAssignment_9_2 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3290:1: ( ( rule__Class__InitializerMessagesAssignment_9_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3291:1: ( rule__Class__InitializerMessagesAssignment_9_2 )
            {
             before(grammarAccess.getClassAccess().getInitializerMessagesAssignment_9_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3292:1: ( rule__Class__InitializerMessagesAssignment_9_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3292:2: rule__Class__InitializerMessagesAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Class__InitializerMessagesAssignment_9_2_in_rule__Class__Group_9__2__Impl6604);
            rule__Class__InitializerMessagesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInitializerMessagesAssignment_9_2()); 

            }

            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3295:1: ( ( rule__Class__InitializerMessagesAssignment_9_2 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3296:1: ( rule__Class__InitializerMessagesAssignment_9_2 )*
            {
             before(grammarAccess.getClassAccess().getInitializerMessagesAssignment_9_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3297:1: ( rule__Class__InitializerMessagesAssignment_9_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_JDOC||(LA30_0>=12 && LA30_0<=13)||LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3297:2: rule__Class__InitializerMessagesAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Class__InitializerMessagesAssignment_9_2_in_rule__Class__Group_9__2__Impl6616);
            	    rule__Class__InitializerMessagesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getInitializerMessagesAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__2__Impl"


    // $ANTLR start "rule__Class__Group_9__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3308:1: rule__Class__Group_9__3 : rule__Class__Group_9__3__Impl ;
    public final void rule__Class__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3312:1: ( rule__Class__Group_9__3__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3313:2: rule__Class__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_9__3__Impl_in_rule__Class__Group_9__36649);
            rule__Class__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__3"


    // $ANTLR start "rule__Class__Group_9__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3319:1: rule__Class__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Class__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3323:1: ( ( '}' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3324:1: ( '}' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3324:1: ( '}' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3325:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,27,FOLLOW_27_in_rule__Class__Group_9__3__Impl6677); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_9__3__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3346:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3350:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3351:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06716);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06719);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3358:1: rule__Version__Group__0__Impl : ( ( rule__Version__SinceMajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3362:1: ( ( ( rule__Version__SinceMajorAssignment_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3363:1: ( ( rule__Version__SinceMajorAssignment_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3363:1: ( ( rule__Version__SinceMajorAssignment_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3364:1: ( rule__Version__SinceMajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getSinceMajorAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3365:1: ( rule__Version__SinceMajorAssignment_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3365:2: rule__Version__SinceMajorAssignment_0
            {
            pushFollow(FOLLOW_rule__Version__SinceMajorAssignment_0_in_rule__Version__Group__0__Impl6746);
            rule__Version__SinceMajorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getSinceMajorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3375:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3379:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3380:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16776);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16779);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3387:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3391:1: ( ( '.' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3392:1: ( '.' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3392:1: ( '.' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3393:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Version__Group__1__Impl6807); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3406:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3410:1: ( rule__Version__Group__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3411:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26838);
            rule__Version__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3417:1: rule__Version__Group__2__Impl : ( ( rule__Version__SinceMinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3421:1: ( ( ( rule__Version__SinceMinorAssignment_2 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3422:1: ( ( rule__Version__SinceMinorAssignment_2 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3422:1: ( ( rule__Version__SinceMinorAssignment_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3423:1: ( rule__Version__SinceMinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getSinceMinorAssignment_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3424:1: ( rule__Version__SinceMinorAssignment_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3424:2: rule__Version__SinceMinorAssignment_2
            {
            pushFollow(FOLLOW_rule__Version__SinceMinorAssignment_2_in_rule__Version__Group__2__Impl6865);
            rule__Version__SinceMinorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getSinceMinorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3440:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3444:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3445:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06901);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06904);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3452:1: rule__Property__Group__0__Impl : ( ( rule__Property__DocAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3456:1: ( ( ( rule__Property__DocAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3457:1: ( ( rule__Property__DocAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3457:1: ( ( rule__Property__DocAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3458:1: ( rule__Property__DocAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getDocAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3459:1: ( rule__Property__DocAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_JDOC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3459:2: rule__Property__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__DocAssignment_0_in_rule__Property__Group__0__Impl6931);
                    rule__Property__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3469:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3473:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3474:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16962);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16965);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3481:1: rule__Property__Group__1__Impl : ( ( rule__Property__Group_1__0 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3485:1: ( ( ( rule__Property__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3486:1: ( ( rule__Property__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3486:1: ( ( rule__Property__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3487:1: ( rule__Property__Group_1__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3488:1: ( rule__Property__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3488:2: rule__Property__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_1__0_in_rule__Property__Group__1__Impl6992);
                    rule__Property__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3498:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3502:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3503:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27023);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27026);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3510:1: rule__Property__Group__2__Impl : ( '@property' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3514:1: ( ( '@property' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3515:1: ( '@property' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3515:1: ( '@property' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3516:1: '@property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Property__Group__2__Impl7054); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3529:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3533:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3534:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__37085);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__37088);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3541:1: rule__Property__Group__3__Impl : ( '(' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3545:1: ( ( '(' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3546:1: ( '(' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3546:1: ( '(' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3547:1: '('
            {
             before(grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Property__Group__3__Impl7116); 
             after(grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3560:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3564:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3565:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__47147);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__5_in_rule__Property__Group__47150);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3572:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3576:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3577:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3577:1: ( ( rule__Property__Group_4__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3578:1: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3579:1: ( rule__Property__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3579:2: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl7177);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3589:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3593:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3594:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__57208);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__6_in_rule__Property__Group__57211);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3601:1: rule__Property__Group__5__Impl : ( ')' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3605:1: ( ( ')' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3606:1: ( ')' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3606:1: ( ')' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3607:1: ')'
            {
             before(grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__Property__Group__5__Impl7239); 
             after(grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3620:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3624:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3625:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__67270);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__7_in_rule__Property__Group__67273);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3632:1: rule__Property__Group__6__Impl : ( ( rule__Property__TypeAssignment_6 ) ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3636:1: ( ( ( rule__Property__TypeAssignment_6 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3637:1: ( ( rule__Property__TypeAssignment_6 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3637:1: ( ( rule__Property__TypeAssignment_6 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3638:1: ( rule__Property__TypeAssignment_6 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_6()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3639:1: ( rule__Property__TypeAssignment_6 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3639:2: rule__Property__TypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_6_in_rule__Property__Group__6__Impl7300);
            rule__Property__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3649:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3653:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3654:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__77330);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__8_in_rule__Property__Group__77333);
            rule__Property__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3661:1: rule__Property__Group__7__Impl : ( ( rule__Property__NameAssignment_7 ) ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3665:1: ( ( ( rule__Property__NameAssignment_7 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3666:1: ( ( rule__Property__NameAssignment_7 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3666:1: ( ( rule__Property__NameAssignment_7 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3667:1: ( rule__Property__NameAssignment_7 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_7()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3668:1: ( rule__Property__NameAssignment_7 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3668:2: rule__Property__NameAssignment_7
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_7_in_rule__Property__Group__7__Impl7360);
            rule__Property__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group__8"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3678:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3682:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3683:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__87390);
            rule__Property__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__9_in_rule__Property__Group__87393);
            rule__Property__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8"


    // $ANTLR start "rule__Property__Group__8__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3690:1: rule__Property__Group__8__Impl : ( 'since' ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3694:1: ( ( 'since' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3695:1: ( 'since' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3695:1: ( 'since' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3696:1: 'since'
            {
             before(grammarAccess.getPropertyAccess().getSinceKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__Property__Group__8__Impl7421); 
             after(grammarAccess.getPropertyAccess().getSinceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8__Impl"


    // $ANTLR start "rule__Property__Group__9"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3709:1: rule__Property__Group__9 : rule__Property__Group__9__Impl rule__Property__Group__10 ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3713:1: ( rule__Property__Group__9__Impl rule__Property__Group__10 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3714:2: rule__Property__Group__9__Impl rule__Property__Group__10
            {
            pushFollow(FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__97452);
            rule__Property__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__10_in_rule__Property__Group__97455);
            rule__Property__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9"


    // $ANTLR start "rule__Property__Group__9__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3721:1: rule__Property__Group__9__Impl : ( ( rule__Property__SinceAssignment_9 ) ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3725:1: ( ( ( rule__Property__SinceAssignment_9 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3726:1: ( ( rule__Property__SinceAssignment_9 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3726:1: ( ( rule__Property__SinceAssignment_9 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3727:1: ( rule__Property__SinceAssignment_9 )
            {
             before(grammarAccess.getPropertyAccess().getSinceAssignment_9()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3728:1: ( rule__Property__SinceAssignment_9 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3728:2: rule__Property__SinceAssignment_9
            {
            pushFollow(FOLLOW_rule__Property__SinceAssignment_9_in_rule__Property__Group__9__Impl7482);
            rule__Property__SinceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getSinceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9__Impl"


    // $ANTLR start "rule__Property__Group__10"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3738:1: rule__Property__Group__10 : rule__Property__Group__10__Impl ;
    public final void rule__Property__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3742:1: ( rule__Property__Group__10__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3743:2: rule__Property__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__10__Impl_in_rule__Property__Group__107512);
            rule__Property__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10"


    // $ANTLR start "rule__Property__Group__10__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3749:1: rule__Property__Group__10__Impl : ( ';' ) ;
    public final void rule__Property__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3753:1: ( ( ';' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3754:1: ( ';' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3754:1: ( ';' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3755:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_10()); 
            match(input,31,FOLLOW_31_in_rule__Property__Group__10__Impl7540); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10__Impl"


    // $ANTLR start "rule__Property__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3790:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3794:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3795:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_1__0__Impl_in_rule__Property__Group_1__07593);
            rule__Property__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_1__1_in_rule__Property__Group_1__07596);
            rule__Property__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_1__0"


    // $ANTLR start "rule__Property__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3802:1: rule__Property__Group_1__0__Impl : ( 'deprecated' ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3806:1: ( ( 'deprecated' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3807:1: ( 'deprecated' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3807:1: ( 'deprecated' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3808:1: 'deprecated'
            {
             before(grammarAccess.getPropertyAccess().getDeprecatedKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Property__Group_1__0__Impl7624); 
             after(grammarAccess.getPropertyAccess().getDeprecatedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_1__0__Impl"


    // $ANTLR start "rule__Property__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3821:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3825:1: ( rule__Property__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3826:2: rule__Property__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_1__1__Impl_in_rule__Property__Group_1__17655);
            rule__Property__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_1__1"


    // $ANTLR start "rule__Property__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3832:1: rule__Property__Group_1__1__Impl : ( ( rule__Property__DeprecatedAssignment_1_1 ) ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3836:1: ( ( ( rule__Property__DeprecatedAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3837:1: ( ( rule__Property__DeprecatedAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3837:1: ( ( rule__Property__DeprecatedAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3838:1: ( rule__Property__DeprecatedAssignment_1_1 )
            {
             before(grammarAccess.getPropertyAccess().getDeprecatedAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3839:1: ( rule__Property__DeprecatedAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3839:2: rule__Property__DeprecatedAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Property__DeprecatedAssignment_1_1_in_rule__Property__Group_1__1__Impl7682);
            rule__Property__DeprecatedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDeprecatedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3853:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3857:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3858:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__07716);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__07719);
            rule__Property__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3865:1: rule__Property__Group_4__0__Impl : ( ( rule__Property__AttributesAssignment_4_0 ) ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3869:1: ( ( ( rule__Property__AttributesAssignment_4_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3870:1: ( ( rule__Property__AttributesAssignment_4_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3870:1: ( ( rule__Property__AttributesAssignment_4_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3871:1: ( rule__Property__AttributesAssignment_4_0 )
            {
             before(grammarAccess.getPropertyAccess().getAttributesAssignment_4_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3872:1: ( rule__Property__AttributesAssignment_4_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3872:2: rule__Property__AttributesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Property__AttributesAssignment_4_0_in_rule__Property__Group_4__0__Impl7746);
            rule__Property__AttributesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAttributesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3882:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3886:1: ( rule__Property__Group_4__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3887:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__17776);
            rule__Property__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3893:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__Group_4_1__0 )* ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3897:1: ( ( ( rule__Property__Group_4_1__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3898:1: ( ( rule__Property__Group_4_1__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3898:1: ( ( rule__Property__Group_4_1__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3899:1: ( rule__Property__Group_4_1__0 )*
            {
             before(grammarAccess.getPropertyAccess().getGroup_4_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3900:1: ( rule__Property__Group_4_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3900:2: rule__Property__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Property__Group_4_1__0_in_rule__Property__Group_4__1__Impl7803);
            	    rule__Property__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_4_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3914:1: rule__Property__Group_4_1__0 : rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1 ;
    public final void rule__Property__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3918:1: ( rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3919:2: rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4_1__0__Impl_in_rule__Property__Group_4_1__07838);
            rule__Property__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group_4_1__1_in_rule__Property__Group_4_1__07841);
            rule__Property__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__0"


    // $ANTLR start "rule__Property__Group_4_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3926:1: rule__Property__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Property__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3930:1: ( ( ',' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3931:1: ( ',' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3931:1: ( ',' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3932:1: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Property__Group_4_1__0__Impl7869); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__0__Impl"


    // $ANTLR start "rule__Property__Group_4_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3945:1: rule__Property__Group_4_1__1 : rule__Property__Group_4_1__1__Impl ;
    public final void rule__Property__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3949:1: ( rule__Property__Group_4_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3950:2: rule__Property__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4_1__1__Impl_in_rule__Property__Group_4_1__17900);
            rule__Property__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__1"


    // $ANTLR start "rule__Property__Group_4_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3956:1: rule__Property__Group_4_1__1__Impl : ( ( rule__Property__AttributesAssignment_4_1_1 ) ) ;
    public final void rule__Property__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3960:1: ( ( ( rule__Property__AttributesAssignment_4_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3961:1: ( ( rule__Property__AttributesAssignment_4_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3961:1: ( ( rule__Property__AttributesAssignment_4_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3962:1: ( rule__Property__AttributesAssignment_4_1_1 )
            {
             before(grammarAccess.getPropertyAccess().getAttributesAssignment_4_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3963:1: ( rule__Property__AttributesAssignment_4_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3963:2: rule__Property__AttributesAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Property__AttributesAssignment_4_1_1_in_rule__Property__Group_4_1__1__Impl7927);
            rule__Property__AttributesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAttributesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3977:1: rule__PropertyAttribute__Group__0 : rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 ;
    public final void rule__PropertyAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3981:1: ( rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3982:2: rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Group__0__Impl_in_rule__PropertyAttribute__Group__07961);
            rule__PropertyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyAttribute__Group__1_in_rule__PropertyAttribute__Group__07964);
            rule__PropertyAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__0"


    // $ANTLR start "rule__PropertyAttribute__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3989:1: rule__PropertyAttribute__Group__0__Impl : ( ( rule__PropertyAttribute__NameAssignment_0 ) ) ;
    public final void rule__PropertyAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3993:1: ( ( ( rule__PropertyAttribute__NameAssignment_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3994:1: ( ( rule__PropertyAttribute__NameAssignment_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3994:1: ( ( rule__PropertyAttribute__NameAssignment_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3995:1: ( rule__PropertyAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3996:1: ( rule__PropertyAttribute__NameAssignment_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:3996:2: rule__PropertyAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__NameAssignment_0_in_rule__PropertyAttribute__Group__0__Impl7991);
            rule__PropertyAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__0__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4006:1: rule__PropertyAttribute__Group__1 : rule__PropertyAttribute__Group__1__Impl ;
    public final void rule__PropertyAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4010:1: ( rule__PropertyAttribute__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4011:2: rule__PropertyAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Group__1__Impl_in_rule__PropertyAttribute__Group__18021);
            rule__PropertyAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__1"


    // $ANTLR start "rule__PropertyAttribute__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4017:1: rule__PropertyAttribute__Group__1__Impl : ( ( rule__PropertyAttribute__Group_1__0 )? ) ;
    public final void rule__PropertyAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4021:1: ( ( ( rule__PropertyAttribute__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4022:1: ( ( rule__PropertyAttribute__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4022:1: ( ( rule__PropertyAttribute__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4023:1: ( rule__PropertyAttribute__Group_1__0 )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4024:1: ( rule__PropertyAttribute__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4024:2: rule__PropertyAttribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyAttribute__Group_1__0_in_rule__PropertyAttribute__Group__1__Impl8048);
                    rule__PropertyAttribute__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAttributeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4038:1: rule__PropertyAttribute__Group_1__0 : rule__PropertyAttribute__Group_1__0__Impl rule__PropertyAttribute__Group_1__1 ;
    public final void rule__PropertyAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4042:1: ( rule__PropertyAttribute__Group_1__0__Impl rule__PropertyAttribute__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4043:2: rule__PropertyAttribute__Group_1__0__Impl rule__PropertyAttribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Group_1__0__Impl_in_rule__PropertyAttribute__Group_1__08083);
            rule__PropertyAttribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyAttribute__Group_1__1_in_rule__PropertyAttribute__Group_1__08086);
            rule__PropertyAttribute__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_1__0"


    // $ANTLR start "rule__PropertyAttribute__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4050:1: rule__PropertyAttribute__Group_1__0__Impl : ( '=' ) ;
    public final void rule__PropertyAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4054:1: ( ( '=' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4055:1: ( '=' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4055:1: ( '=' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4056:1: '='
            {
             before(grammarAccess.getPropertyAttributeAccess().getEqualsSignKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__PropertyAttribute__Group_1__0__Impl8114); 
             after(grammarAccess.getPropertyAttributeAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4069:1: rule__PropertyAttribute__Group_1__1 : rule__PropertyAttribute__Group_1__1__Impl ;
    public final void rule__PropertyAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4073:1: ( rule__PropertyAttribute__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4074:2: rule__PropertyAttribute__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Group_1__1__Impl_in_rule__PropertyAttribute__Group_1__18145);
            rule__PropertyAttribute__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_1__1"


    // $ANTLR start "rule__PropertyAttribute__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4080:1: rule__PropertyAttribute__Group_1__1__Impl : ( ( rule__PropertyAttribute__ValueAssignment_1_1 ) ) ;
    public final void rule__PropertyAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4084:1: ( ( ( rule__PropertyAttribute__ValueAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4085:1: ( ( rule__PropertyAttribute__ValueAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4085:1: ( ( rule__PropertyAttribute__ValueAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4086:1: ( rule__PropertyAttribute__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getValueAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4087:1: ( rule__PropertyAttribute__ValueAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4087:2: rule__PropertyAttribute__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__ValueAssignment_1_1_in_rule__PropertyAttribute__Group_1__1__Impl8172);
            rule__PropertyAttribute__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_1__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4101:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4105:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4106:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08206);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08209);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4113:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4117:1: ( ( 'enum' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4118:1: ( 'enum' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4118:1: ( 'enum' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4119:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Enum__Group__0__Impl8237); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4132:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4136:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4137:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18268);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18271);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4144:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4148:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4149:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4149:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4150:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4151:1: ( rule__Enum__NameAssignment_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4151:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8298);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4161:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4165:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4166:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28328);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28331);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4173:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4177:1: ( ( '{' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4178:1: ( '{' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4178:1: ( '{' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4179:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Enum__Group__2__Impl8359); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4192:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4196:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4197:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38390);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38393);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4204:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__ElementsAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4208:1: ( ( ( rule__Enum__ElementsAssignment_3 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4209:1: ( ( rule__Enum__ElementsAssignment_3 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4209:1: ( ( rule__Enum__ElementsAssignment_3 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4210:1: ( rule__Enum__ElementsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4211:1: ( rule__Enum__ElementsAssignment_3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4211:2: rule__Enum__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8420);
            rule__Enum__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4221:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4225:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4226:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48450);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__48453);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4233:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4237:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4238:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4238:1: ( ( rule__Enum__Group_4__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4239:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4240:1: ( rule__Enum__Group_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==37) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4240:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl8480);
            	    rule__Enum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4250:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4254:1: ( rule__Enum__Group__5__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4255:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__58511);
            rule__Enum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4261:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4265:1: ( ( '}' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4266:1: ( '}' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4266:1: ( '}' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4267:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group__5__Impl8539); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group_4__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4292:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4296:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4297:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__08582);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__08585);
            rule__Enum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0"


    // $ANTLR start "rule__Enum__Group_4__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4304:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4308:1: ( ( ',' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4309:1: ( ',' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4309:1: ( ',' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4310:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,37,FOLLOW_37_in_rule__Enum__Group_4__0__Impl8613); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0__Impl"


    // $ANTLR start "rule__Enum__Group_4__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4323:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4327:1: ( rule__Enum__Group_4__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4328:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__18644);
            rule__Enum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1"


    // $ANTLR start "rule__Enum__Group_4__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4334:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__ElementsAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4338:1: ( ( ( rule__Enum__ElementsAssignment_4_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4339:1: ( ( rule__Enum__ElementsAssignment_4_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4339:1: ( ( rule__Enum__ElementsAssignment_4_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4340:1: ( rule__Enum__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getElementsAssignment_4_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4341:1: ( rule__Enum__ElementsAssignment_4_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4341:2: rule__Enum__ElementsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Enum__ElementsAssignment_4_1_in_rule__Enum__Group_4__1__Impl8671);
            rule__Enum__ElementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getElementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1__Impl"


    // $ANTLR start "rule__EnumElement__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4355:1: rule__EnumElement__Group__0 : rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 ;
    public final void rule__EnumElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4359:1: ( rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4360:2: rule__EnumElement__Group__0__Impl rule__EnumElement__Group__1
            {
            pushFollow(FOLLOW_rule__EnumElement__Group__0__Impl_in_rule__EnumElement__Group__08705);
            rule__EnumElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumElement__Group__1_in_rule__EnumElement__Group__08708);
            rule__EnumElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group__0"


    // $ANTLR start "rule__EnumElement__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4367:1: rule__EnumElement__Group__0__Impl : ( ( rule__EnumElement__NameAssignment_0 ) ) ;
    public final void rule__EnumElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4371:1: ( ( ( rule__EnumElement__NameAssignment_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4372:1: ( ( rule__EnumElement__NameAssignment_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4372:1: ( ( rule__EnumElement__NameAssignment_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4373:1: ( rule__EnumElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumElementAccess().getNameAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4374:1: ( rule__EnumElement__NameAssignment_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4374:2: rule__EnumElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumElement__NameAssignment_0_in_rule__EnumElement__Group__0__Impl8735);
            rule__EnumElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group__0__Impl"


    // $ANTLR start "rule__EnumElement__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4384:1: rule__EnumElement__Group__1 : rule__EnumElement__Group__1__Impl ;
    public final void rule__EnumElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4388:1: ( rule__EnumElement__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4389:2: rule__EnumElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumElement__Group__1__Impl_in_rule__EnumElement__Group__18765);
            rule__EnumElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group__1"


    // $ANTLR start "rule__EnumElement__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4395:1: rule__EnumElement__Group__1__Impl : ( ( rule__EnumElement__Group_1__0 )? ) ;
    public final void rule__EnumElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4399:1: ( ( ( rule__EnumElement__Group_1__0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4400:1: ( ( rule__EnumElement__Group_1__0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4400:1: ( ( rule__EnumElement__Group_1__0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4401:1: ( rule__EnumElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumElementAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4402:1: ( rule__EnumElement__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4402:2: rule__EnumElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumElement__Group_1__0_in_rule__EnumElement__Group__1__Impl8792);
                    rule__EnumElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group__1__Impl"


    // $ANTLR start "rule__EnumElement__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4416:1: rule__EnumElement__Group_1__0 : rule__EnumElement__Group_1__0__Impl rule__EnumElement__Group_1__1 ;
    public final void rule__EnumElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4420:1: ( rule__EnumElement__Group_1__0__Impl rule__EnumElement__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4421:2: rule__EnumElement__Group_1__0__Impl rule__EnumElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumElement__Group_1__0__Impl_in_rule__EnumElement__Group_1__08827);
            rule__EnumElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumElement__Group_1__1_in_rule__EnumElement__Group_1__08830);
            rule__EnumElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group_1__0"


    // $ANTLR start "rule__EnumElement__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4428:1: rule__EnumElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4432:1: ( ( '=' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4433:1: ( '=' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4433:1: ( '=' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4434:1: '='
            {
             before(grammarAccess.getEnumElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumElement__Group_1__0__Impl8858); 
             after(grammarAccess.getEnumElementAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group_1__0__Impl"


    // $ANTLR start "rule__EnumElement__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4447:1: rule__EnumElement__Group_1__1 : rule__EnumElement__Group_1__1__Impl ;
    public final void rule__EnumElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4451:1: ( rule__EnumElement__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4452:2: rule__EnumElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumElement__Group_1__1__Impl_in_rule__EnumElement__Group_1__18889);
            rule__EnumElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group_1__1"


    // $ANTLR start "rule__EnumElement__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4458:1: rule__EnumElement__Group_1__1__Impl : ( ( rule__EnumElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4462:1: ( ( ( rule__EnumElement__ValueAssignment_1_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4463:1: ( ( rule__EnumElement__ValueAssignment_1_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4463:1: ( ( rule__EnumElement__ValueAssignment_1_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4464:1: ( rule__EnumElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumElementAccess().getValueAssignment_1_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4465:1: ( rule__EnumElement__ValueAssignment_1_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4465:2: rule__EnumElement__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumElement__ValueAssignment_1_1_in_rule__EnumElement__Group_1__1__Impl8916);
            rule__EnumElement__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumElementAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__Group_1__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4479:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4483:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4484:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__08950);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__08953);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4491:1: rule__TypeDef__Group__0__Impl : ( ( rule__TypeDef__DocAssignment_0 )? ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4495:1: ( ( ( rule__TypeDef__DocAssignment_0 )? ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4496:1: ( ( rule__TypeDef__DocAssignment_0 )? )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4496:1: ( ( rule__TypeDef__DocAssignment_0 )? )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4497:1: ( rule__TypeDef__DocAssignment_0 )?
            {
             before(grammarAccess.getTypeDefAccess().getDocAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4498:1: ( rule__TypeDef__DocAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_JDOC) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4498:2: rule__TypeDef__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeDef__DocAssignment_0_in_rule__TypeDef__Group__0__Impl8980);
                    rule__TypeDef__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDefAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4508:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4512:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4513:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__19011);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__19014);
            rule__TypeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4520:1: rule__TypeDef__Group__1__Impl : ( 'typedef' ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4524:1: ( ( 'typedef' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4525:1: ( 'typedef' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4525:1: ( 'typedef' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4526:1: 'typedef'
            {
             before(grammarAccess.getTypeDefAccess().getTypedefKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__TypeDef__Group__1__Impl9042); 
             after(grammarAccess.getTypeDefAccess().getTypedefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4539:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4543:1: ( rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4544:2: rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__2__Impl_in_rule__TypeDef__Group__29073);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__3_in_rule__TypeDef__Group__29076);
            rule__TypeDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4551:1: rule__TypeDef__Group__2__Impl : ( ( rule__TypeDef__Alternatives_2 ) ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4555:1: ( ( ( rule__TypeDef__Alternatives_2 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4556:1: ( ( rule__TypeDef__Alternatives_2 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4556:1: ( ( rule__TypeDef__Alternatives_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4557:1: ( rule__TypeDef__Alternatives_2 )
            {
             before(grammarAccess.getTypeDefAccess().getAlternatives_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4558:1: ( rule__TypeDef__Alternatives_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4558:2: rule__TypeDef__Alternatives_2
            {
            pushFollow(FOLLOW_rule__TypeDef__Alternatives_2_in_rule__TypeDef__Group__2__Impl9103);
            rule__TypeDef__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4568:1: rule__TypeDef__Group__3 : rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 ;
    public final void rule__TypeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4572:1: ( rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4573:2: rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__3__Impl_in_rule__TypeDef__Group__39133);
            rule__TypeDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group__4_in_rule__TypeDef__Group__39136);
            rule__TypeDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__3"


    // $ANTLR start "rule__TypeDef__Group__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4580:1: rule__TypeDef__Group__3__Impl : ( ( rule__TypeDef__NameAssignment_3 ) ) ;
    public final void rule__TypeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4584:1: ( ( ( rule__TypeDef__NameAssignment_3 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4585:1: ( ( rule__TypeDef__NameAssignment_3 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4585:1: ( ( rule__TypeDef__NameAssignment_3 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4586:1: ( rule__TypeDef__NameAssignment_3 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4587:1: ( rule__TypeDef__NameAssignment_3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4587:2: rule__TypeDef__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__TypeDef__NameAssignment_3_in_rule__TypeDef__Group__3__Impl9163);
            rule__TypeDef__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__3__Impl"


    // $ANTLR start "rule__TypeDef__Group__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4597:1: rule__TypeDef__Group__4 : rule__TypeDef__Group__4__Impl ;
    public final void rule__TypeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4601:1: ( rule__TypeDef__Group__4__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4602:2: rule__TypeDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group__4__Impl_in_rule__TypeDef__Group__49193);
            rule__TypeDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__4"


    // $ANTLR start "rule__TypeDef__Group__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4608:1: rule__TypeDef__Group__4__Impl : ( ';' ) ;
    public final void rule__TypeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4612:1: ( ( ';' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4613:1: ( ';' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4613:1: ( ';' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4614:1: ';'
            {
             before(grammarAccess.getTypeDefAccess().getSemicolonKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__TypeDef__Group__4__Impl9221); 
             after(grammarAccess.getTypeDefAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__4__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4637:1: rule__TypeDef__Group_2_0__0 : rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1 ;
    public final void rule__TypeDef__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4641:1: ( rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4642:2: rule__TypeDef__Group_2_0__0__Impl rule__TypeDef__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__0__Impl_in_rule__TypeDef__Group_2_0__09262);
            rule__TypeDef__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__1_in_rule__TypeDef__Group_2_0__09265);
            rule__TypeDef__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__0"


    // $ANTLR start "rule__TypeDef__Group_2_0__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4649:1: rule__TypeDef__Group_2_0__0__Impl : ( ( rule__TypeDef__StructAssignment_2_0_0 ) ) ;
    public final void rule__TypeDef__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4653:1: ( ( ( rule__TypeDef__StructAssignment_2_0_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4654:1: ( ( rule__TypeDef__StructAssignment_2_0_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4654:1: ( ( rule__TypeDef__StructAssignment_2_0_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4655:1: ( rule__TypeDef__StructAssignment_2_0_0 )
            {
             before(grammarAccess.getTypeDefAccess().getStructAssignment_2_0_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4656:1: ( rule__TypeDef__StructAssignment_2_0_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4656:2: rule__TypeDef__StructAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__TypeDef__StructAssignment_2_0_0_in_rule__TypeDef__Group_2_0__0__Impl9292);
            rule__TypeDef__StructAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getStructAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4666:1: rule__TypeDef__Group_2_0__1 : rule__TypeDef__Group_2_0__1__Impl rule__TypeDef__Group_2_0__2 ;
    public final void rule__TypeDef__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4670:1: ( rule__TypeDef__Group_2_0__1__Impl rule__TypeDef__Group_2_0__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4671:2: rule__TypeDef__Group_2_0__1__Impl rule__TypeDef__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__1__Impl_in_rule__TypeDef__Group_2_0__19322);
            rule__TypeDef__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__2_in_rule__TypeDef__Group_2_0__19325);
            rule__TypeDef__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__1"


    // $ANTLR start "rule__TypeDef__Group_2_0__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4678:1: rule__TypeDef__Group_2_0__1__Impl : ( '{' ) ;
    public final void rule__TypeDef__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4682:1: ( ( '{' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4683:1: ( '{' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4683:1: ( '{' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4684:1: '{'
            {
             before(grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_2_0_1()); 
            match(input,26,FOLLOW_26_in_rule__TypeDef__Group_2_0__1__Impl9353); 
             after(grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__1__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4697:1: rule__TypeDef__Group_2_0__2 : rule__TypeDef__Group_2_0__2__Impl rule__TypeDef__Group_2_0__3 ;
    public final void rule__TypeDef__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4701:1: ( rule__TypeDef__Group_2_0__2__Impl rule__TypeDef__Group_2_0__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4702:2: rule__TypeDef__Group_2_0__2__Impl rule__TypeDef__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__2__Impl_in_rule__TypeDef__Group_2_0__29384);
            rule__TypeDef__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__3_in_rule__TypeDef__Group_2_0__29387);
            rule__TypeDef__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__2"


    // $ANTLR start "rule__TypeDef__Group_2_0__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4709:1: rule__TypeDef__Group_2_0__2__Impl : ( ( ( rule__TypeDef__Group_2_0_2__0 ) ) ( ( rule__TypeDef__Group_2_0_2__0 )* ) ) ;
    public final void rule__TypeDef__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4713:1: ( ( ( ( rule__TypeDef__Group_2_0_2__0 ) ) ( ( rule__TypeDef__Group_2_0_2__0 )* ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4714:1: ( ( ( rule__TypeDef__Group_2_0_2__0 ) ) ( ( rule__TypeDef__Group_2_0_2__0 )* ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4714:1: ( ( ( rule__TypeDef__Group_2_0_2__0 ) ) ( ( rule__TypeDef__Group_2_0_2__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4715:1: ( ( rule__TypeDef__Group_2_0_2__0 ) ) ( ( rule__TypeDef__Group_2_0_2__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4715:1: ( ( rule__TypeDef__Group_2_0_2__0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4716:1: ( rule__TypeDef__Group_2_0_2__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup_2_0_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4717:1: ( rule__TypeDef__Group_2_0_2__0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4717:2: rule__TypeDef__Group_2_0_2__0
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0_2__0_in_rule__TypeDef__Group_2_0__2__Impl9416);
            rule__TypeDef__Group_2_0_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup_2_0_2()); 

            }

            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4720:1: ( ( rule__TypeDef__Group_2_0_2__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4721:1: ( rule__TypeDef__Group_2_0_2__0 )*
            {
             before(grammarAccess.getTypeDefAccess().getGroup_2_0_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4722:1: ( rule__TypeDef__Group_2_0_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||(LA39_0>=14 && LA39_0<=16)||LA39_0==20) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4722:2: rule__TypeDef__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDef__Group_2_0_2__0_in_rule__TypeDef__Group_2_0__2__Impl9428);
            	    rule__TypeDef__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getTypeDefAccess().getGroup_2_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__2__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4733:1: rule__TypeDef__Group_2_0__3 : rule__TypeDef__Group_2_0__3__Impl ;
    public final void rule__TypeDef__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4737:1: ( rule__TypeDef__Group_2_0__3__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4738:2: rule__TypeDef__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0__3__Impl_in_rule__TypeDef__Group_2_0__39461);
            rule__TypeDef__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__3"


    // $ANTLR start "rule__TypeDef__Group_2_0__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4744:1: rule__TypeDef__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__TypeDef__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4748:1: ( ( '}' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4749:1: ( '}' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4749:1: ( '}' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4750:1: '}'
            {
             before(grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_2_0_3()); 
            match(input,27,FOLLOW_27_in_rule__TypeDef__Group_2_0__3__Impl9489); 
             after(grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0__3__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0_2__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4771:1: rule__TypeDef__Group_2_0_2__0 : rule__TypeDef__Group_2_0_2__0__Impl rule__TypeDef__Group_2_0_2__1 ;
    public final void rule__TypeDef__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4775:1: ( rule__TypeDef__Group_2_0_2__0__Impl rule__TypeDef__Group_2_0_2__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4776:2: rule__TypeDef__Group_2_0_2__0__Impl rule__TypeDef__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0_2__0__Impl_in_rule__TypeDef__Group_2_0_2__09528);
            rule__TypeDef__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_0_2__1_in_rule__TypeDef__Group_2_0_2__09531);
            rule__TypeDef__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0_2__0"


    // $ANTLR start "rule__TypeDef__Group_2_0_2__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4783:1: rule__TypeDef__Group_2_0_2__0__Impl : ( ( rule__TypeDef__AttributesAssignment_2_0_2_0 ) ) ;
    public final void rule__TypeDef__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4787:1: ( ( ( rule__TypeDef__AttributesAssignment_2_0_2_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4788:1: ( ( rule__TypeDef__AttributesAssignment_2_0_2_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4788:1: ( ( rule__TypeDef__AttributesAssignment_2_0_2_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4789:1: ( rule__TypeDef__AttributesAssignment_2_0_2_0 )
            {
             before(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_0_2_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4790:1: ( rule__TypeDef__AttributesAssignment_2_0_2_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4790:2: rule__TypeDef__AttributesAssignment_2_0_2_0
            {
            pushFollow(FOLLOW_rule__TypeDef__AttributesAssignment_2_0_2_0_in_rule__TypeDef__Group_2_0_2__0__Impl9558);
            rule__TypeDef__AttributesAssignment_2_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_0_2__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4800:1: rule__TypeDef__Group_2_0_2__1 : rule__TypeDef__Group_2_0_2__1__Impl ;
    public final void rule__TypeDef__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4804:1: ( rule__TypeDef__Group_2_0_2__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4805:2: rule__TypeDef__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_0_2__1__Impl_in_rule__TypeDef__Group_2_0_2__19588);
            rule__TypeDef__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0_2__1"


    // $ANTLR start "rule__TypeDef__Group_2_0_2__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4811:1: rule__TypeDef__Group_2_0_2__1__Impl : ( ';' ) ;
    public final void rule__TypeDef__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4815:1: ( ( ';' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4816:1: ( ';' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4816:1: ( ';' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4817:1: ';'
            {
             before(grammarAccess.getTypeDefAccess().getSemicolonKeyword_2_0_2_1()); 
            match(input,31,FOLLOW_31_in_rule__TypeDef__Group_2_0_2__1__Impl9616); 
             after(grammarAccess.getTypeDefAccess().getSemicolonKeyword_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4834:1: rule__TypeDef__Group_2_1__0 : rule__TypeDef__Group_2_1__0__Impl rule__TypeDef__Group_2_1__1 ;
    public final void rule__TypeDef__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4838:1: ( rule__TypeDef__Group_2_1__0__Impl rule__TypeDef__Group_2_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4839:2: rule__TypeDef__Group_2_1__0__Impl rule__TypeDef__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__0__Impl_in_rule__TypeDef__Group_2_1__09651);
            rule__TypeDef__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__1_in_rule__TypeDef__Group_2_1__09654);
            rule__TypeDef__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__0"


    // $ANTLR start "rule__TypeDef__Group_2_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4846:1: rule__TypeDef__Group_2_1__0__Impl : ( ( rule__TypeDef__BlockAssignment_2_1_0 ) ) ;
    public final void rule__TypeDef__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4850:1: ( ( ( rule__TypeDef__BlockAssignment_2_1_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4851:1: ( ( rule__TypeDef__BlockAssignment_2_1_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4851:1: ( ( rule__TypeDef__BlockAssignment_2_1_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4852:1: ( rule__TypeDef__BlockAssignment_2_1_0 )
            {
             before(grammarAccess.getTypeDefAccess().getBlockAssignment_2_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4853:1: ( rule__TypeDef__BlockAssignment_2_1_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4853:2: rule__TypeDef__BlockAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__TypeDef__BlockAssignment_2_1_0_in_rule__TypeDef__Group_2_1__0__Impl9681);
            rule__TypeDef__BlockAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getBlockAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4863:1: rule__TypeDef__Group_2_1__1 : rule__TypeDef__Group_2_1__1__Impl rule__TypeDef__Group_2_1__2 ;
    public final void rule__TypeDef__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4867:1: ( rule__TypeDef__Group_2_1__1__Impl rule__TypeDef__Group_2_1__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4868:2: rule__TypeDef__Group_2_1__1__Impl rule__TypeDef__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__1__Impl_in_rule__TypeDef__Group_2_1__19711);
            rule__TypeDef__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__2_in_rule__TypeDef__Group_2_1__19714);
            rule__TypeDef__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__1"


    // $ANTLR start "rule__TypeDef__Group_2_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4875:1: rule__TypeDef__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__TypeDef__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4879:1: ( ( '(' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4880:1: ( '(' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4880:1: ( '(' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4881:1: '('
            {
             before(grammarAccess.getTypeDefAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,29,FOLLOW_29_in_rule__TypeDef__Group_2_1__1__Impl9742); 
             after(grammarAccess.getTypeDefAccess().getLeftParenthesisKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__1__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4894:1: rule__TypeDef__Group_2_1__2 : rule__TypeDef__Group_2_1__2__Impl rule__TypeDef__Group_2_1__3 ;
    public final void rule__TypeDef__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4898:1: ( rule__TypeDef__Group_2_1__2__Impl rule__TypeDef__Group_2_1__3 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4899:2: rule__TypeDef__Group_2_1__2__Impl rule__TypeDef__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__2__Impl_in_rule__TypeDef__Group_2_1__29773);
            rule__TypeDef__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__3_in_rule__TypeDef__Group_2_1__29776);
            rule__TypeDef__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__2"


    // $ANTLR start "rule__TypeDef__Group_2_1__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4906:1: rule__TypeDef__Group_2_1__2__Impl : ( ( rule__TypeDef__AttributesAssignment_2_1_2 ) ) ;
    public final void rule__TypeDef__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4910:1: ( ( ( rule__TypeDef__AttributesAssignment_2_1_2 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4911:1: ( ( rule__TypeDef__AttributesAssignment_2_1_2 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4911:1: ( ( rule__TypeDef__AttributesAssignment_2_1_2 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4912:1: ( rule__TypeDef__AttributesAssignment_2_1_2 )
            {
             before(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_1_2()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4913:1: ( rule__TypeDef__AttributesAssignment_2_1_2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4913:2: rule__TypeDef__AttributesAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__TypeDef__AttributesAssignment_2_1_2_in_rule__TypeDef__Group_2_1__2__Impl9803);
            rule__TypeDef__AttributesAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__2__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1__3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4923:1: rule__TypeDef__Group_2_1__3 : rule__TypeDef__Group_2_1__3__Impl rule__TypeDef__Group_2_1__4 ;
    public final void rule__TypeDef__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4927:1: ( rule__TypeDef__Group_2_1__3__Impl rule__TypeDef__Group_2_1__4 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4928:2: rule__TypeDef__Group_2_1__3__Impl rule__TypeDef__Group_2_1__4
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__3__Impl_in_rule__TypeDef__Group_2_1__39833);
            rule__TypeDef__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__4_in_rule__TypeDef__Group_2_1__39836);
            rule__TypeDef__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__3"


    // $ANTLR start "rule__TypeDef__Group_2_1__3__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4935:1: rule__TypeDef__Group_2_1__3__Impl : ( ( rule__TypeDef__Group_2_1_3__0 )* ) ;
    public final void rule__TypeDef__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4939:1: ( ( ( rule__TypeDef__Group_2_1_3__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4940:1: ( ( rule__TypeDef__Group_2_1_3__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4940:1: ( ( rule__TypeDef__Group_2_1_3__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4941:1: ( rule__TypeDef__Group_2_1_3__0 )*
            {
             before(grammarAccess.getTypeDefAccess().getGroup_2_1_3()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4942:1: ( rule__TypeDef__Group_2_1_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4942:2: rule__TypeDef__Group_2_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeDef__Group_2_1_3__0_in_rule__TypeDef__Group_2_1__3__Impl9863);
            	    rule__TypeDef__Group_2_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getTypeDefAccess().getGroup_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__3__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1__4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4952:1: rule__TypeDef__Group_2_1__4 : rule__TypeDef__Group_2_1__4__Impl ;
    public final void rule__TypeDef__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4956:1: ( rule__TypeDef__Group_2_1__4__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4957:2: rule__TypeDef__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1__4__Impl_in_rule__TypeDef__Group_2_1__49894);
            rule__TypeDef__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__4"


    // $ANTLR start "rule__TypeDef__Group_2_1__4__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4963:1: rule__TypeDef__Group_2_1__4__Impl : ( ')' ) ;
    public final void rule__TypeDef__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4967:1: ( ( ')' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4968:1: ( ')' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4968:1: ( ')' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4969:1: ')'
            {
             before(grammarAccess.getTypeDefAccess().getRightParenthesisKeyword_2_1_4()); 
            match(input,30,FOLLOW_30_in_rule__TypeDef__Group_2_1__4__Impl9922); 
             after(grammarAccess.getTypeDefAccess().getRightParenthesisKeyword_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1__4__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1_3__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4992:1: rule__TypeDef__Group_2_1_3__0 : rule__TypeDef__Group_2_1_3__0__Impl rule__TypeDef__Group_2_1_3__1 ;
    public final void rule__TypeDef__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4996:1: ( rule__TypeDef__Group_2_1_3__0__Impl rule__TypeDef__Group_2_1_3__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:4997:2: rule__TypeDef__Group_2_1_3__0__Impl rule__TypeDef__Group_2_1_3__1
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1_3__0__Impl_in_rule__TypeDef__Group_2_1_3__09963);
            rule__TypeDef__Group_2_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDef__Group_2_1_3__1_in_rule__TypeDef__Group_2_1_3__09966);
            rule__TypeDef__Group_2_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1_3__0"


    // $ANTLR start "rule__TypeDef__Group_2_1_3__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5004:1: rule__TypeDef__Group_2_1_3__0__Impl : ( ',' ) ;
    public final void rule__TypeDef__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5008:1: ( ( ',' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5009:1: ( ',' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5009:1: ( ',' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5010:1: ','
            {
             before(grammarAccess.getTypeDefAccess().getCommaKeyword_2_1_3_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeDef__Group_2_1_3__0__Impl9994); 
             after(grammarAccess.getTypeDefAccess().getCommaKeyword_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_2_1_3__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5023:1: rule__TypeDef__Group_2_1_3__1 : rule__TypeDef__Group_2_1_3__1__Impl ;
    public final void rule__TypeDef__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5027:1: ( rule__TypeDef__Group_2_1_3__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5028:2: rule__TypeDef__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDef__Group_2_1_3__1__Impl_in_rule__TypeDef__Group_2_1_3__110025);
            rule__TypeDef__Group_2_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1_3__1"


    // $ANTLR start "rule__TypeDef__Group_2_1_3__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5034:1: rule__TypeDef__Group_2_1_3__1__Impl : ( ( rule__TypeDef__AttributesAssignment_2_1_3_1 ) ) ;
    public final void rule__TypeDef__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5038:1: ( ( ( rule__TypeDef__AttributesAssignment_2_1_3_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5039:1: ( ( rule__TypeDef__AttributesAssignment_2_1_3_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5039:1: ( ( rule__TypeDef__AttributesAssignment_2_1_3_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5040:1: ( rule__TypeDef__AttributesAssignment_2_1_3_1 )
            {
             before(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_1_3_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5041:1: ( rule__TypeDef__AttributesAssignment_2_1_3_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5041:2: rule__TypeDef__AttributesAssignment_2_1_3_1
            {
            pushFollow(FOLLOW_rule__TypeDef__AttributesAssignment_2_1_3_1_in_rule__TypeDef__Group_2_1_3__1__Impl10052);
            rule__TypeDef__AttributesAssignment_2_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getAttributesAssignment_2_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__TypeStructAttribute__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5055:1: rule__TypeStructAttribute__Group__0 : rule__TypeStructAttribute__Group__0__Impl rule__TypeStructAttribute__Group__1 ;
    public final void rule__TypeStructAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5059:1: ( rule__TypeStructAttribute__Group__0__Impl rule__TypeStructAttribute__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5060:2: rule__TypeStructAttribute__Group__0__Impl rule__TypeStructAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TypeStructAttribute__Group__0__Impl_in_rule__TypeStructAttribute__Group__010086);
            rule__TypeStructAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeStructAttribute__Group__1_in_rule__TypeStructAttribute__Group__010089);
            rule__TypeStructAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__Group__0"


    // $ANTLR start "rule__TypeStructAttribute__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5067:1: rule__TypeStructAttribute__Group__0__Impl : ( ( rule__TypeStructAttribute__TypeRefAssignment_0 ) ) ;
    public final void rule__TypeStructAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5071:1: ( ( ( rule__TypeStructAttribute__TypeRefAssignment_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5072:1: ( ( rule__TypeStructAttribute__TypeRefAssignment_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5072:1: ( ( rule__TypeStructAttribute__TypeRefAssignment_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5073:1: ( rule__TypeStructAttribute__TypeRefAssignment_0 )
            {
             before(grammarAccess.getTypeStructAttributeAccess().getTypeRefAssignment_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5074:1: ( rule__TypeStructAttribute__TypeRefAssignment_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5074:2: rule__TypeStructAttribute__TypeRefAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeStructAttribute__TypeRefAssignment_0_in_rule__TypeStructAttribute__Group__0__Impl10116);
            rule__TypeStructAttribute__TypeRefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeStructAttributeAccess().getTypeRefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__Group__0__Impl"


    // $ANTLR start "rule__TypeStructAttribute__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5084:1: rule__TypeStructAttribute__Group__1 : rule__TypeStructAttribute__Group__1__Impl ;
    public final void rule__TypeStructAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5088:1: ( rule__TypeStructAttribute__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5089:2: rule__TypeStructAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeStructAttribute__Group__1__Impl_in_rule__TypeStructAttribute__Group__110146);
            rule__TypeStructAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__Group__1"


    // $ANTLR start "rule__TypeStructAttribute__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5095:1: rule__TypeStructAttribute__Group__1__Impl : ( ( rule__TypeStructAttribute__NameAssignment_1 ) ) ;
    public final void rule__TypeStructAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5099:1: ( ( ( rule__TypeStructAttribute__NameAssignment_1 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5100:1: ( ( rule__TypeStructAttribute__NameAssignment_1 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5100:1: ( ( rule__TypeStructAttribute__NameAssignment_1 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5101:1: ( rule__TypeStructAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTypeStructAttributeAccess().getNameAssignment_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5102:1: ( rule__TypeStructAttribute__NameAssignment_1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5102:2: rule__TypeStructAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeStructAttribute__NameAssignment_1_in_rule__TypeStructAttribute__Group__1__Impl10173);
            rule__TypeStructAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeStructAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5116:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5120:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5121:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010207);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010210);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5128:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5132:1: ( ( ruleValidID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5133:1: ( ruleValidID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5133:1: ( ruleValidID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5134:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl10237);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5145:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5149:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5150:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110266);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5156:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5160:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5162:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5163:1: ( rule__QualifiedName__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5163:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10293);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5177:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5181:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5182:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010328);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010331);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5189:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5193:1: ( ( '.' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5194:1: ( '.' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5194:1: ( '.' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5195:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl10359); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5208:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5212:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5213:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110390);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5219:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5223:1: ( ( ruleValidID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5224:1: ( ruleValidID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5224:1: ( ruleValidID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5225:1: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl10417);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5240:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5244:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5245:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010450);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010453);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5252:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5256:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5257:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5257:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5258:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10480);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5269:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5273:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5274:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110509);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__110512);
            rule__QualifiedNameWithWildcard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5281:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5285:1: ( ( '.' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5286:1: ( '.' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5286:1: ( '.' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5287:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl10540); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5300:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5304:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5305:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__210571);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5311:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5315:1: ( ( '*' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5316:1: ( '*' )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5316:1: ( '*' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5317:1: '*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__QualifiedNameWithWildcard__Group__2__Impl10599); 
             after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__NativeAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5337:1: rule__PackageDeclaration__NativeAssignment_0 : ( ( 'native' ) ) ;
    public final void rule__PackageDeclaration__NativeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5341:1: ( ( ( 'native' ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5342:1: ( ( 'native' ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5342:1: ( ( 'native' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5343:1: ( 'native' )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNativeNativeKeyword_0_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5344:1: ( 'native' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5345:1: 'native'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNativeNativeKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__PackageDeclaration__NativeAssignment_010646); 
             after(grammarAccess.getPackageDeclarationAccess().getNativeNativeKeyword_0_0()); 

            }

             after(grammarAccess.getPackageDeclarationAccess().getNativeNativeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NativeAssignment_0"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5360:1: rule__PackageDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PackageDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5364:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5365:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5365:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5366:1: RULE_ID
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageDeclaration__NameAssignment_210685); 
             after(grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__JavaPackageAssignment_4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5375:1: rule__PackageDeclaration__JavaPackageAssignment_4 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__JavaPackageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5379:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5380:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5380:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5381:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getJavaPackageQualifiedNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__JavaPackageAssignment_410716);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getJavaPackageQualifiedNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__JavaPackageAssignment_4"


    // $ANTLR start "rule__PackageDeclaration__ImportsAssignment_5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5390:1: rule__PackageDeclaration__ImportsAssignment_5 : ( ruleImport ) ;
    public final void rule__PackageDeclaration__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5394:1: ( ( ruleImport ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5395:1: ( ruleImport )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5395:1: ( ruleImport )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5396:1: ruleImport
            {
             before(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PackageDeclaration__ImportsAssignment_510747);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ImportsAssignment_5"


    // $ANTLR start "rule__PackageDeclaration__TypesAssignment_6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5405:1: rule__PackageDeclaration__TypesAssignment_6 : ( ruleType ) ;
    public final void rule__PackageDeclaration__TypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5409:1: ( ( ruleType ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5410:1: ( ruleType )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5410:1: ( ruleType )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5411:1: ruleType
            {
             before(grammarAccess.getPackageDeclarationAccess().getTypesTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PackageDeclaration__TypesAssignment_610778);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getTypesTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__TypesAssignment_6"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5420:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5424:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5425:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5425:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5426:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5427:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5427:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_110809);
            rule__Import__ImportedNamespaceAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__TypeRef__TypeAssignment_0_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5436:1: rule__TypeRef__TypeAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__TypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5440:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5441:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5441:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5442:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_1_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5443:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5444:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__TypeAssignment_0_1_110846);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getTypeTypeQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__TypeAssignment_0_1_1"


    // $ANTLR start "rule__TypeRef__TypeAssignment_1_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5455:1: rule__TypeRef__TypeAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5459:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5460:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5460:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5461:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_1_0_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5462:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5463:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__TypeAssignment_1_010885);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__TypeAssignment_1_0"


    // $ANTLR start "rule__TypeRef__GenericTypeAssignment_1_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5474:1: rule__TypeRef__GenericTypeAssignment_1_1_1 : ( ruleTypeRef ) ;
    public final void rule__TypeRef__GenericTypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5478:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5479:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5479:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5480:1: ruleTypeRef
            {
             before(grammarAccess.getTypeRefAccess().getGenericTypeTypeRefParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__TypeRef__GenericTypeAssignment_1_1_110920);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getGenericTypeTypeRefParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__GenericTypeAssignment_1_1_1"


    // $ANTLR start "rule__TypeRef__BuiltinAssignment_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5489:1: rule__TypeRef__BuiltinAssignment_2 : ( ruleBuiltinType ) ;
    public final void rule__TypeRef__BuiltinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5493:1: ( ( ruleBuiltinType ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5494:1: ( ruleBuiltinType )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5494:1: ( ruleBuiltinType )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5495:1: ruleBuiltinType
            {
             before(grammarAccess.getTypeRefAccess().getBuiltinBuiltinTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBuiltinType_in_rule__TypeRef__BuiltinAssignment_210951);
            ruleBuiltinType();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getBuiltinBuiltinTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__BuiltinAssignment_2"


    // $ANTLR start "rule__Protocol__DocAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5504:1: rule__Protocol__DocAssignment_0 : ( ruleDocu ) ;
    public final void rule__Protocol__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5508:1: ( ( ruleDocu ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5509:1: ( ruleDocu )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5509:1: ( ruleDocu )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5510:1: ruleDocu
            {
             before(grammarAccess.getProtocolAccess().getDocDocuParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocu_in_rule__Protocol__DocAssignment_010982);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getDocDocuParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__DocAssignment_0"


    // $ANTLR start "rule__Protocol__DeprecatedAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5519:1: rule__Protocol__DeprecatedAssignment_1_1 : ( ruleVersion ) ;
    public final void rule__Protocol__DeprecatedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5523:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5524:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5524:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5525:1: ruleVersion
            {
             before(grammarAccess.getProtocolAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Protocol__DeprecatedAssignment_1_111013);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__DeprecatedAssignment_1_1"


    // $ANTLR start "rule__Protocol__NameAssignment_3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5534:1: rule__Protocol__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5538:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5539:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5539:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5540:1: RULE_ID
            {
             before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Protocol__NameAssignment_311044); 
             after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_3"


    // $ANTLR start "rule__Protocol__SinceAssignment_5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5549:1: rule__Protocol__SinceAssignment_5 : ( ruleVersion ) ;
    public final void rule__Protocol__SinceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5553:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5554:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5554:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5555:1: ruleVersion
            {
             before(grammarAccess.getProtocolAccess().getSinceVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Protocol__SinceAssignment_511075);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getSinceVersionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__SinceAssignment_5"


    // $ANTLR start "rule__Protocol__MessagesAssignment_7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5564:1: rule__Protocol__MessagesAssignment_7 : ( ruleMessage ) ;
    public final void rule__Protocol__MessagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5568:1: ( ( ruleMessage ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5569:1: ( ruleMessage )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5569:1: ( ruleMessage )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5570:1: ruleMessage
            {
             before(grammarAccess.getProtocolAccess().getMessagesMessageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Protocol__MessagesAssignment_711106);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMessagesMessageParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__MessagesAssignment_7"


    // $ANTLR start "rule__Message__DocAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5579:1: rule__Message__DocAssignment_0 : ( ruleDocu ) ;
    public final void rule__Message__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5583:1: ( ( ruleDocu ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5584:1: ( ruleDocu )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5584:1: ( ruleDocu )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5585:1: ruleDocu
            {
             before(grammarAccess.getMessageAccess().getDocDocuParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocu_in_rule__Message__DocAssignment_011137);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getDocDocuParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__DocAssignment_0"


    // $ANTLR start "rule__Message__DeprecatedAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5594:1: rule__Message__DeprecatedAssignment_1_1 : ( ruleVersion ) ;
    public final void rule__Message__DeprecatedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5598:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5599:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5599:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5600:1: ruleVersion
            {
             before(grammarAccess.getMessageAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Message__DeprecatedAssignment_1_111168);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__DeprecatedAssignment_1_1"


    // $ANTLR start "rule__Message__ReturnValueAssignment_4"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5609:1: rule__Message__ReturnValueAssignment_4 : ( ruleTypeRef ) ;
    public final void rule__Message__ReturnValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5613:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5614:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5614:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5615:1: ruleTypeRef
            {
             before(grammarAccess.getMessageAccess().getReturnValueTypeRefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Message__ReturnValueAssignment_411199);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getReturnValueTypeRefParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ReturnValueAssignment_4"


    // $ANTLR start "rule__Message__ElementsAssignment_6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5624:1: rule__Message__ElementsAssignment_6 : ( ruleMessageElement ) ;
    public final void rule__Message__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5628:1: ( ( ruleMessageElement ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5629:1: ( ruleMessageElement )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5629:1: ( ruleMessageElement )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5630:1: ruleMessageElement
            {
             before(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_611230);
            ruleMessageElement();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getElementsMessageElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ElementsAssignment_6"


    // $ANTLR start "rule__Message__SinceAssignment_8"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5639:1: rule__Message__SinceAssignment_8 : ( ruleVersion ) ;
    public final void rule__Message__SinceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5643:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5644:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5644:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5645:1: ruleVersion
            {
             before(grammarAccess.getMessageAccess().getSinceVersionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Message__SinceAssignment_811261);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getSinceVersionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SinceAssignment_8"


    // $ANTLR start "rule__Message__JavaNameAssignment_9_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5654:1: rule__Message__JavaNameAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__Message__JavaNameAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5658:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5659:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5659:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5660:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getJavaNameIDTerminalRuleCall_9_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__JavaNameAssignment_9_111292); 
             after(grammarAccess.getMessageAccess().getJavaNameIDTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__JavaNameAssignment_9_1"


    // $ANTLR start "rule__MessageElement__NameAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5669:1: rule__MessageElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5673:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5674:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5674:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5675:1: RULE_ID
            {
             before(grammarAccess.getMessageElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageElement__NameAssignment_011323); 
             after(grammarAccess.getMessageElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__NameAssignment_0"


    // $ANTLR start "rule__MessageElement__TypeAssignment_1_3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5684:1: rule__MessageElement__TypeAssignment_1_3 : ( ruleTypeRef ) ;
    public final void rule__MessageElement__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5688:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5689:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5689:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5690:1: ruleTypeRef
            {
             before(grammarAccess.getMessageElementAccess().getTypeTypeRefParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__MessageElement__TypeAssignment_1_311354);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getMessageElementAccess().getTypeTypeRefParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__TypeAssignment_1_3"


    // $ANTLR start "rule__MessageElement__VariableAssignment_1_5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5699:1: rule__MessageElement__VariableAssignment_1_5 : ( RULE_ID ) ;
    public final void rule__MessageElement__VariableAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5703:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5704:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5704:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5705:1: RULE_ID
            {
             before(grammarAccess.getMessageElementAccess().getVariableIDTerminalRuleCall_1_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageElement__VariableAssignment_1_511385); 
             after(grammarAccess.getMessageElementAccess().getVariableIDTerminalRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageElement__VariableAssignment_1_5"


    // $ANTLR start "rule__Class__DocAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5714:1: rule__Class__DocAssignment_0 : ( ruleDocu ) ;
    public final void rule__Class__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5718:1: ( ( ruleDocu ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5719:1: ( ruleDocu )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5719:1: ( ruleDocu )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5720:1: ruleDocu
            {
             before(grammarAccess.getClassAccess().getDocDocuParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocu_in_rule__Class__DocAssignment_011416);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getClassAccess().getDocDocuParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__DocAssignment_0"


    // $ANTLR start "rule__Class__DeprecatedAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5729:1: rule__Class__DeprecatedAssignment_1_1 : ( ruleVersion ) ;
    public final void rule__Class__DeprecatedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5733:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5734:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5734:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5735:1: ruleVersion
            {
             before(grammarAccess.getClassAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Class__DeprecatedAssignment_1_111447);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getClassAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__DeprecatedAssignment_1_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5744:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5748:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5749:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5749:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5750:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_311478); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Class__SinceAssignment_5"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5759:1: rule__Class__SinceAssignment_5 : ( ruleVersion ) ;
    public final void rule__Class__SinceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5763:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5764:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5764:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5765:1: ruleVersion
            {
             before(grammarAccess.getClassAccess().getSinceVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Class__SinceAssignment_511509);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSinceVersionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SinceAssignment_5"


    // $ANTLR start "rule__Class__ParentAssignment_6_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5774:1: rule__Class__ParentAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ParentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5778:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5779:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5779:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5780:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getParentClassCrossReference_6_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5781:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5782:1: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getParentClassQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Class__ParentAssignment_6_111544);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getParentClassQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentClassCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentAssignment_6_1"


    // $ANTLR start "rule__Class__ProtocolsAssignment_7_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5793:1: rule__Class__ProtocolsAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ProtocolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5797:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5798:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5798:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5799:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5800:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5801:1: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getProtocolsProtocolQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Class__ProtocolsAssignment_7_111583);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getProtocolsProtocolQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ProtocolsAssignment_7_1"


    // $ANTLR start "rule__Class__ProtocolsAssignment_7_2_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5812:1: rule__Class__ProtocolsAssignment_7_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ProtocolsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5816:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5817:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5817:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5818:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_2_1_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5819:1: ( ruleQualifiedName )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5820:1: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getProtocolsProtocolQualifiedNameParserRuleCall_7_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Class__ProtocolsAssignment_7_2_111622);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getProtocolsProtocolQualifiedNameParserRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getProtocolsProtocolCrossReference_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ProtocolsAssignment_7_2_1"


    // $ANTLR start "rule__Class__InitializerMessagesAssignment_9_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5831:1: rule__Class__InitializerMessagesAssignment_9_2 : ( ruleMessage ) ;
    public final void rule__Class__InitializerMessagesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5835:1: ( ( ruleMessage ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5836:1: ( ruleMessage )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5836:1: ( ruleMessage )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5837:1: ruleMessage
            {
             before(grammarAccess.getClassAccess().getInitializerMessagesMessageParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Class__InitializerMessagesAssignment_9_211657);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getClassAccess().getInitializerMessagesMessageParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InitializerMessagesAssignment_9_2"


    // $ANTLR start "rule__Class__PropertiesAssignment_10"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5846:1: rule__Class__PropertiesAssignment_10 : ( ruleProperty ) ;
    public final void rule__Class__PropertiesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5850:1: ( ( ruleProperty ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5851:1: ( ruleProperty )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5851:1: ( ruleProperty )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5852:1: ruleProperty
            {
             before(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_1011688);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getClassAccess().getPropertiesPropertyParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PropertiesAssignment_10"


    // $ANTLR start "rule__Class__MessagesAssignment_11"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5861:1: rule__Class__MessagesAssignment_11 : ( ruleMessage ) ;
    public final void rule__Class__MessagesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5865:1: ( ( ruleMessage ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5866:1: ( ruleMessage )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5866:1: ( ruleMessage )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5867:1: ruleMessage
            {
             before(grammarAccess.getClassAccess().getMessagesMessageParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__Class__MessagesAssignment_1111719);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMessagesMessageParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MessagesAssignment_11"


    // $ANTLR start "rule__Version__SinceMajorAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5876:1: rule__Version__SinceMajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__SinceMajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5880:1: ( ( RULE_INT ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5881:1: ( RULE_INT )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5881:1: ( RULE_INT )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5882:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getSinceMajorINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__SinceMajorAssignment_011750); 
             after(grammarAccess.getVersionAccess().getSinceMajorINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__SinceMajorAssignment_0"


    // $ANTLR start "rule__Version__SinceMinorAssignment_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5891:1: rule__Version__SinceMinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__SinceMinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5895:1: ( ( RULE_INT ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5896:1: ( RULE_INT )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5896:1: ( RULE_INT )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5897:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getSinceMinorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__SinceMinorAssignment_211781); 
             after(grammarAccess.getVersionAccess().getSinceMinorINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__SinceMinorAssignment_2"


    // $ANTLR start "rule__Property__DocAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5906:1: rule__Property__DocAssignment_0 : ( ruleDocu ) ;
    public final void rule__Property__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5910:1: ( ( ruleDocu ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5911:1: ( ruleDocu )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5911:1: ( ruleDocu )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5912:1: ruleDocu
            {
             before(grammarAccess.getPropertyAccess().getDocDocuParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocu_in_rule__Property__DocAssignment_011812);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDocDocuParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DocAssignment_0"


    // $ANTLR start "rule__Property__DeprecatedAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5921:1: rule__Property__DeprecatedAssignment_1_1 : ( ruleVersion ) ;
    public final void rule__Property__DeprecatedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5925:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5926:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5926:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5927:1: ruleVersion
            {
             before(grammarAccess.getPropertyAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Property__DeprecatedAssignment_1_111843);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDeprecatedVersionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DeprecatedAssignment_1_1"


    // $ANTLR start "rule__Property__AttributesAssignment_4_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5936:1: rule__Property__AttributesAssignment_4_0 : ( rulePropertyAttribute ) ;
    public final void rule__Property__AttributesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5940:1: ( ( rulePropertyAttribute ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5941:1: ( rulePropertyAttribute )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5941:1: ( rulePropertyAttribute )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5942:1: rulePropertyAttribute
            {
             before(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_rule__Property__AttributesAssignment_4_011874);
            rulePropertyAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__AttributesAssignment_4_0"


    // $ANTLR start "rule__Property__AttributesAssignment_4_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5951:1: rule__Property__AttributesAssignment_4_1_1 : ( rulePropertyAttribute ) ;
    public final void rule__Property__AttributesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5955:1: ( ( rulePropertyAttribute ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5956:1: ( rulePropertyAttribute )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5956:1: ( rulePropertyAttribute )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5957:1: rulePropertyAttribute
            {
             before(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_rule__Property__AttributesAssignment_4_1_111905);
            rulePropertyAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAttributesPropertyAttributeParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__AttributesAssignment_4_1_1"


    // $ANTLR start "rule__Property__TypeAssignment_6"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5966:1: rule__Property__TypeAssignment_6 : ( ruleTypeRef ) ;
    public final void rule__Property__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5970:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5971:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5971:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5972:1: ruleTypeRef
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Property__TypeAssignment_611936);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_6"


    // $ANTLR start "rule__Property__NameAssignment_7"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5981:1: rule__Property__NameAssignment_7 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5985:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5986:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5986:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5987:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_711967); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_7"


    // $ANTLR start "rule__Property__SinceAssignment_9"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:5996:1: rule__Property__SinceAssignment_9 : ( ruleVersion ) ;
    public final void rule__Property__SinceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6000:1: ( ( ruleVersion ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6001:1: ( ruleVersion )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6001:1: ( ruleVersion )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6002:1: ruleVersion
            {
             before(grammarAccess.getPropertyAccess().getSinceVersionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Property__SinceAssignment_911998);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSinceVersionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SinceAssignment_9"


    // $ANTLR start "rule__PropertyAttribute__NameAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6011:1: rule__PropertyAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PropertyAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6015:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6016:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6016:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6017:1: RULE_ID
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyAttribute__NameAssignment_012029); 
             after(grammarAccess.getPropertyAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__NameAssignment_0"


    // $ANTLR start "rule__PropertyAttribute__ValueAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6026:1: rule__PropertyAttribute__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__PropertyAttribute__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6030:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6031:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6031:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6032:1: RULE_ID
            {
             before(grammarAccess.getPropertyAttributeAccess().getValueIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyAttribute__ValueAssignment_1_112060); 
             after(grammarAccess.getPropertyAttributeAccess().getValueIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__ValueAssignment_1_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6041:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6045:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6046:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6046:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6047:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112091); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__ElementsAssignment_3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6056:1: rule__Enum__ElementsAssignment_3 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6060:1: ( ( ruleEnumElement ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6061:1: ( ruleEnumElement )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6061:1: ( ruleEnumElement )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6062:1: ruleEnumElement
            {
             before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312122);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ElementsAssignment_3"


    // $ANTLR start "rule__Enum__ElementsAssignment_4_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6071:1: rule__Enum__ElementsAssignment_4_1 : ( ruleEnumElement ) ;
    public final void rule__Enum__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6075:1: ( ( ruleEnumElement ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6076:1: ( ruleEnumElement )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6076:1: ( ruleEnumElement )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6077:1: ruleEnumElement
            {
             before(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_4_112153);
            ruleEnumElement();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getElementsEnumElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ElementsAssignment_4_1"


    // $ANTLR start "rule__EnumElement__NameAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6086:1: rule__EnumElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6090:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6091:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6091:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6092:1: RULE_ID
            {
             before(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumElement__NameAssignment_012184); 
             after(grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__NameAssignment_0"


    // $ANTLR start "rule__EnumElement__ValueAssignment_1_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6101:1: rule__EnumElement__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6105:1: ( ( RULE_INT ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6106:1: ( RULE_INT )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6106:1: ( RULE_INT )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6107:1: RULE_INT
            {
             before(grammarAccess.getEnumElementAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumElement__ValueAssignment_1_112215); 
             after(grammarAccess.getEnumElementAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumElement__ValueAssignment_1_1"


    // $ANTLR start "rule__TypeDef__DocAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6116:1: rule__TypeDef__DocAssignment_0 : ( ruleDocu ) ;
    public final void rule__TypeDef__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6120:1: ( ( ruleDocu ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6121:1: ( ruleDocu )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6121:1: ( ruleDocu )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6122:1: ruleDocu
            {
             before(grammarAccess.getTypeDefAccess().getDocDocuParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDocu_in_rule__TypeDef__DocAssignment_012246);
            ruleDocu();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getDocDocuParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__DocAssignment_0"


    // $ANTLR start "rule__TypeDef__StructAssignment_2_0_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6131:1: rule__TypeDef__StructAssignment_2_0_0 : ( ( 'struct' ) ) ;
    public final void rule__TypeDef__StructAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6135:1: ( ( ( 'struct' ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6136:1: ( ( 'struct' ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6136:1: ( ( 'struct' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6137:1: ( 'struct' )
            {
             before(grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6138:1: ( 'struct' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6139:1: 'struct'
            {
             before(grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0()); 
            match(input,45,FOLLOW_45_in_rule__TypeDef__StructAssignment_2_0_012282); 
             after(grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getTypeDefAccess().getStructStructKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__StructAssignment_2_0_0"


    // $ANTLR start "rule__TypeDef__AttributesAssignment_2_0_2_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6154:1: rule__TypeDef__AttributesAssignment_2_0_2_0 : ( ruleTypeStructAttribute ) ;
    public final void rule__TypeDef__AttributesAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6158:1: ( ( ruleTypeStructAttribute ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6159:1: ( ruleTypeStructAttribute )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6159:1: ( ruleTypeStructAttribute )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6160:1: ruleTypeStructAttribute
            {
             before(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_0_2_0_0()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_0_2_012321);
            ruleTypeStructAttribute();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__AttributesAssignment_2_0_2_0"


    // $ANTLR start "rule__TypeDef__BlockAssignment_2_1_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6169:1: rule__TypeDef__BlockAssignment_2_1_0 : ( ( 'void' ) ) ;
    public final void rule__TypeDef__BlockAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6173:1: ( ( ( 'void' ) ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6174:1: ( ( 'void' ) )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6174:1: ( ( 'void' ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6175:1: ( 'void' )
            {
             before(grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0()); 
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6176:1: ( 'void' )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6177:1: 'void'
            {
             before(grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0()); 
            match(input,14,FOLLOW_14_in_rule__TypeDef__BlockAssignment_2_1_012357); 
             after(grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getTypeDefAccess().getBlockVoidKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__BlockAssignment_2_1_0"


    // $ANTLR start "rule__TypeDef__AttributesAssignment_2_1_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6192:1: rule__TypeDef__AttributesAssignment_2_1_2 : ( ruleTypeStructAttribute ) ;
    public final void rule__TypeDef__AttributesAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6196:1: ( ( ruleTypeStructAttribute ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6197:1: ( ruleTypeStructAttribute )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6197:1: ( ruleTypeStructAttribute )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6198:1: ruleTypeStructAttribute
            {
             before(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_1_212396);
            ruleTypeStructAttribute();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__AttributesAssignment_2_1_2"


    // $ANTLR start "rule__TypeDef__AttributesAssignment_2_1_3_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6207:1: rule__TypeDef__AttributesAssignment_2_1_3_1 : ( ruleTypeStructAttribute ) ;
    public final void rule__TypeDef__AttributesAssignment_2_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6211:1: ( ( ruleTypeStructAttribute ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6212:1: ( ruleTypeStructAttribute )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6212:1: ( ruleTypeStructAttribute )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6213:1: ruleTypeStructAttribute
            {
             before(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_3_1_0()); 
            pushFollow(FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_1_3_112427);
            ruleTypeStructAttribute();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getAttributesTypeStructAttributeParserRuleCall_2_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__AttributesAssignment_2_1_3_1"


    // $ANTLR start "rule__TypeDef__TypeRefAssignment_2_2"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6222:1: rule__TypeDef__TypeRefAssignment_2_2 : ( ruleTypeRef ) ;
    public final void rule__TypeDef__TypeRefAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6226:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6227:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6227:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6228:1: ruleTypeRef
            {
             before(grammarAccess.getTypeDefAccess().getTypeRefTypeRefParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__TypeDef__TypeRefAssignment_2_212458);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getTypeRefTypeRefParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__TypeRefAssignment_2_2"


    // $ANTLR start "rule__TypeDef__NameAssignment_3"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6237:1: rule__TypeDef__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6241:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6242:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6242:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6243:1: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_312489); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_3"


    // $ANTLR start "rule__TypeStructAttribute__TypeRefAssignment_0"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6252:1: rule__TypeStructAttribute__TypeRefAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__TypeStructAttribute__TypeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6256:1: ( ( ruleTypeRef ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6257:1: ( ruleTypeRef )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6257:1: ( ruleTypeRef )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6258:1: ruleTypeRef
            {
             before(grammarAccess.getTypeStructAttributeAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__TypeStructAttribute__TypeRefAssignment_012520);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeStructAttributeAccess().getTypeRefTypeRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__TypeRefAssignment_0"


    // $ANTLR start "rule__TypeStructAttribute__NameAssignment_1"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6267:1: rule__TypeStructAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeStructAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6271:1: ( ( RULE_ID ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6272:1: ( RULE_ID )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6272:1: ( RULE_ID )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6273:1: RULE_ID
            {
             before(grammarAccess.getTypeStructAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeStructAttribute__NameAssignment_112551); 
             after(grammarAccess.getTypeStructAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeStructAttribute__NameAssignment_1"


    // $ANTLR start "rule__Docu__ContentAssignment"
    // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6282:1: rule__Docu__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Docu__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6286:1: ( ( RULE_JDOC ) )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6287:1: ( RULE_JDOC )
            {
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6287:1: ( RULE_JDOC )
            // ../at.bestsolution.objc.mapper.ui/src-gen/at/bestsolution/objc/mapper/ui/contentassist/antlr/internal/InternalMapper.g:6288:1: RULE_JDOC
            {
             before(grammarAccess.getDocuAccess().getContentJDOCTerminalRuleCall_0()); 
            match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_rule__Docu__ContentAssignment12582); 
             after(grammarAccess.getDocuAccess().getContentJDOCTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Docu__ContentAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA1_minS =
        "\1\4\1\6\1\4\1\uffff\1\6\1\uffff";
    static final String DFA1_maxS =
        "\1\4\1\53\1\27\1\uffff\1\53\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\14\uffff\1\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\2\2\uffff\2\3",
            "\1\4\22\uffff\1\5",
            "",
            "\1\3\14\uffff\1\3\4\uffff\1\3\3\uffff\1\3\5\uffff\1\3\4\uffff"+
            "\1\2\2\uffff\2\3",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "620:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleQualifiedNameWithWildcard ) | ( ruleQualifiedName ) );";
        }
    }
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\6\1\30\1\5\4\uffff\1\47\1\5\1\30";
    static final String DFA2_maxS =
        "\2\53\1\5\4\uffff\1\47\1\5\1\42";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\3\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\21\uffff\1\3\3\uffff\1\2\5\uffff\1\4\7\uffff\1\5\1\6",
            "\1\3\3\uffff\1\2\5\uffff\1\4\10\uffff\1\6",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\3\11\uffff\1\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "642:1: rule__Type__Alternatives : ( ( ruleProtocol ) | ( ruleClass ) | ( ruleEnum ) | ( ruleTypeDef ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Alternatives_in_ruleTypeRef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0_in_ruleProtocol334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_entryRuleMessageElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group__0_in_ruleMessageElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttribute668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group__0_in_rulePropertyAttribute694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group__0_in_ruleEnumElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0_in_ruleTypeDef874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_entryRuleTypeStructAttribute901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeStructAttribute908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__Group__0_in_ruleTypeStructAttribute934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_entryRuleBuiltinType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinType__Alternatives_in_ruleBuiltinType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_entryRuleDocu1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocu1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Docu__ContentAssignment_in_ruleDocu1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAlternatives_1_01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__Type__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Type__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Type__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_rule__Type__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0__0_in_rule__TypeRef__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__0_in_rule__TypeRef__Alternatives1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__BuiltinAssignment_2_in_rule__TypeRef__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Message__Alternatives_21471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Message__Alternatives_21491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__0_in_rule__TypeDef__Alternatives_21525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__0_in_rule__TypeDef__Alternatives_21543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__TypeRefAssignment_2_2_in_rule__TypeDef__Alternatives_21561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BuiltinType__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BuiltinType__Alternatives1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BuiltinType__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01667 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NativeAssignment_0_in_rule__PackageDeclaration__Group__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__1__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21790 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageDeclaration__Group__3__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41912 = new BitSet(new long[]{0x00000C0411080040L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__JavaPackageAssignment_4_in_rule__PackageDeclaration__Group__4__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__51972 = new BitSet(new long[]{0x00000C0411080040L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__51975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ImportsAssignment_5_in_rule__PackageDeclaration__Group__5__Impl2002 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__TypesAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2062 = new BitSet(new long[]{0x00000C0411080042L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__TypesAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2074 = new BitSet(new long[]{0x00000C0411080042L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0__0__Impl_in_rule__TypeRef__Group_0__02244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0__1_in_rule__TypeRef__Group_0__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeRef__Group_0__0__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0__1__Impl_in_rule__TypeRef__Group_0__12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__0_in_rule__TypeRef__Group_0__1__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__0__Impl_in_rule__TypeRef__Group_0_1__02368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__1_in_rule__TypeRef__Group_0_1__02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeRef__Group_0_1__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__1__Impl_in_rule__TypeRef__Group_0_1__12430 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__2_in_rule__TypeRef__Group_0_1__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__TypeAssignment_0_1_1_in_rule__TypeRef__Group_0_1__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_0_1__2__Impl_in_rule__TypeRef__Group_0_1__22490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeRef__Group_0_1__2__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__0__Impl_in_rule__TypeRef__Group_1__02555 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__1_in_rule__TypeRef__Group_1__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__TypeAssignment_1_0_in_rule__TypeRef__Group_1__0__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__1__Impl_in_rule__TypeRef__Group_1__12615 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__2_in_rule__TypeRef__Group_1__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__0_in_rule__TypeRef__Group_1__1__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1__2__Impl_in_rule__TypeRef__Group_1__22676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeRef__Group_1__2__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__0__Impl_in_rule__TypeRef__Group_1_1__02744 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__1_in_rule__TypeRef__Group_1_1__02747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeRef__Group_1_1__0__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__1__Impl_in_rule__TypeRef__Group_1_1__12806 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__2_in_rule__TypeRef__Group_1_1__12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__GenericTypeAssignment_1_1_1_in_rule__TypeRef__Group_1_1__1__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group_1_1__2__Impl_in_rule__TypeRef__Group_1_1__22866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeRef__Group_1_1__2__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__02931 = new BitSet(new long[]{0x0000000011000040L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__02934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__DocAssignment_0_in_rule__Protocol__Group__0__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__12992 = new BitSet(new long[]{0x0000000011000040L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_1__0_in_rule__Protocol__Group__1__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Protocol__Group__2__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__33115 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__33118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__NameAssignment_3_in_rule__Protocol__Group__3__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__43175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__43178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Protocol__Group__4__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__53237 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__53240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__SinceAssignment_5_in_rule__Protocol__Group__5__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__63297 = new BitSet(new long[]{0x0000000018003040L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__63300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Protocol__Group__6__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__73359 = new BitSet(new long[]{0x0000000018003040L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__73362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__MessagesAssignment_7_in_rule__Protocol__Group__7__Impl3389 = new BitSet(new long[]{0x0000000010003042L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__83420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Protocol__Group__8__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_1__0__Impl_in_rule__Protocol__Group_1__03497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Protocol__Group_1__1_in_rule__Protocol__Group_1__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Protocol__Group_1__0__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group_1__1__Impl_in_rule__Protocol__Group_1__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__DeprecatedAssignment_1_1_in_rule__Protocol__Group_1__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03620 = new BitSet(new long[]{0x0000000010003040L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__DocAssignment_0_in_rule__Message__Group__0__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13681 = new BitSet(new long[]{0x0000000010003040L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23742 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__23745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Alternatives_2_in_rule__Message__Group__2__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__33802 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__33805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Message__Group__3__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__43864 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Message__Group__5_in_rule__Message__Group__43867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ReturnValueAssignment_4_in_rule__Message__Group__4__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__53924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__6_in_rule__Message__Group__53927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Message__Group__5__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__6__Impl_in_rule__Message__Group__63986 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Message__Group__7_in_rule__Message__Group__63989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_6_in_rule__Message__Group__6__Impl4018 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Message__ElementsAssignment_6_in_rule__Message__Group__6__Impl4030 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Message__Group__7__Impl_in_rule__Message__Group__74063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Message__Group__8_in_rule__Message__Group__74066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Message__Group__7__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__8__Impl_in_rule__Message__Group__84125 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Message__Group__9_in_rule__Message__Group__84128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__SinceAssignment_8_in_rule__Message__Group__8__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__9__Impl_in_rule__Message__Group__94185 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__Message__Group__10_in_rule__Message__Group__94188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_9__0_in_rule__Message__Group__9__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__10__Impl_in_rule__Message__Group__104246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Message__Group__10__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__04327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__04330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Message__Group_1__0__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__DeprecatedAssignment_1_1_in_rule__Message__Group_1__1__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_9__0__Impl_in_rule__Message__Group_9__04450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group_9__1_in_rule__Message__Group_9__04453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Message__Group_9__0__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_9__1__Impl_in_rule__Message__Group_9__14512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__JavaNameAssignment_9_1_in_rule__Message__Group_9__1__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group__0__Impl_in_rule__MessageElement__Group__04573 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MessageElement__Group__1_in_rule__MessageElement__Group__04576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__NameAssignment_0_in_rule__MessageElement__Group__0__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group__1__Impl_in_rule__MessageElement__Group__14633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__0_in_rule__MessageElement__Group__1__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__0__Impl_in_rule__MessageElement__Group_1__04695 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__1_in_rule__MessageElement__Group_1__04698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MessageElement__Group_1__0__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__1__Impl_in_rule__MessageElement__Group_1__14757 = new BitSet(new long[]{0x000000020011C010L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__2_in_rule__MessageElement__Group_1__14760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MessageElement__Group_1__1__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__2__Impl_in_rule__MessageElement__Group_1__24819 = new BitSet(new long[]{0x000000020011C010L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__3_in_rule__MessageElement__Group_1__24822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MessageElement__Group_1__2__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__3__Impl_in_rule__MessageElement__Group_1__34884 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__4_in_rule__MessageElement__Group_1__34887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__TypeAssignment_1_3_in_rule__MessageElement__Group_1__3__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__4__Impl_in_rule__MessageElement__Group_1__44944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__5_in_rule__MessageElement__Group_1__44947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageElement__Group_1__4__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__Group_1__5__Impl_in_rule__MessageElement__Group_1__55006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageElement__VariableAssignment_1_5_in_rule__MessageElement__Group_1__5__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__05075 = new BitSet(new long[]{0x0000000410000040L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DocAssignment_0_in_rule__Class__Group__0__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__15136 = new BitSet(new long[]{0x0000000410000040L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__15139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__0_in_rule__Class__Group__1__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__25197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__25200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Class__Group__2__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__35259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__35262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_3_in_rule__Class__Group__3__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__45319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__45322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class__Group__4__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__55381 = new BitSet(new long[]{0x0000001804000000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__55384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SinceAssignment_5_in_rule__Class__Group__5__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__65441 = new BitSet(new long[]{0x0000001804000000L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__65444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_6__0_in_rule__Class__Group__6__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__75502 = new BitSet(new long[]{0x0000001804000000L});
    public static final BitSet FOLLOW_rule__Class__Group__8_in_rule__Class__Group__75505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7__0_in_rule__Class__Group__7__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__8__Impl_in_rule__Class__Group__85563 = new BitSet(new long[]{0x0000014018003040L});
    public static final BitSet FOLLOW_rule__Class__Group__9_in_rule__Class__Group__85566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class__Group__8__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__9__Impl_in_rule__Class__Group__95625 = new BitSet(new long[]{0x0000014018003040L});
    public static final BitSet FOLLOW_rule__Class__Group__10_in_rule__Class__Group__95628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_9__0_in_rule__Class__Group__9__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__10__Impl_in_rule__Class__Group__105686 = new BitSet(new long[]{0x0000014018003040L});
    public static final BitSet FOLLOW_rule__Class__Group__11_in_rule__Class__Group__105689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__PropertiesAssignment_10_in_rule__Class__Group__10__Impl5716 = new BitSet(new long[]{0x0000010010000042L});
    public static final BitSet FOLLOW_rule__Class__Group__11__Impl_in_rule__Class__Group__115747 = new BitSet(new long[]{0x0000014018003040L});
    public static final BitSet FOLLOW_rule__Class__Group__12_in_rule__Class__Group__115750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__MessagesAssignment_11_in_rule__Class__Group__11__Impl5777 = new BitSet(new long[]{0x0000000010003042L});
    public static final BitSet FOLLOW_rule__Class__Group__12__Impl_in_rule__Class__Group__125808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class__Group__12__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__0__Impl_in_rule__Class__Group_1__05893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group_1__1_in_rule__Class__Group_1__05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Class__Group_1__0__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_1__1__Impl_in_rule__Class__Group_1__15955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DeprecatedAssignment_1_1_in_rule__Class__Group_1__1__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_6__0__Impl_in_rule__Class__Group_6__06016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_6__1_in_rule__Class__Group_6__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Class__Group_6__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_6__1__Impl_in_rule__Class__Group_6__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ParentAssignment_6_1_in_rule__Class__Group_6__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7__0__Impl_in_rule__Class__Group_7__06139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_7__1_in_rule__Class__Group_7__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__Group_7__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7__1__Impl_in_rule__Class__Group_7__16201 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Class__Group_7__2_in_rule__Class__Group_7__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ProtocolsAssignment_7_1_in_rule__Class__Group_7__1__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7__2__Impl_in_rule__Class__Group_7__26261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7_2__0_in_rule__Class__Group_7__2__Impl6288 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7_2__0__Impl_in_rule__Class__Group_7_2__06325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_7_2__1_in_rule__Class__Group_7_2__06328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Class__Group_7_2__0__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_7_2__1__Impl_in_rule__Class__Group_7_2__16387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ProtocolsAssignment_7_2_1_in_rule__Class__Group_7_2__1__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_9__0__Impl_in_rule__Class__Group_9__06448 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Class__Group_9__1_in_rule__Class__Group_9__06451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Class__Group_9__0__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_9__1__Impl_in_rule__Class__Group_9__16510 = new BitSet(new long[]{0x0000000010003040L});
    public static final BitSet FOLLOW_rule__Class__Group_9__2_in_rule__Class__Group_9__16513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class__Group_9__1__Impl6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_9__2__Impl_in_rule__Class__Group_9__26572 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Class__Group_9__3_in_rule__Class__Group_9__26575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__InitializerMessagesAssignment_9_2_in_rule__Class__Group_9__2__Impl6604 = new BitSet(new long[]{0x0000000010003042L});
    public static final BitSet FOLLOW_rule__Class__InitializerMessagesAssignment_9_2_in_rule__Class__Group_9__2__Impl6616 = new BitSet(new long[]{0x0000000010003042L});
    public static final BitSet FOLLOW_rule__Class__Group_9__3__Impl_in_rule__Class__Group_9__36649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class__Group_9__3__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06716 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__SinceMajorAssignment_0_in_rule__Version__Group__0__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Version__Group__1__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__SinceMinorAssignment_2_in_rule__Version__Group__2__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06901 = new BitSet(new long[]{0x0000010010000040L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DocAssignment_0_in_rule__Property__Group__0__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16962 = new BitSet(new long[]{0x0000010010000040L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__0_in_rule__Property__Group__1__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27023 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Property__Group__2__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__37085 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__37088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Property__Group__3__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__47147 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__47150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__57208 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__57211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Property__Group__5__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__67270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__67273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_6_in_rule__Property__Group__6__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__77330 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Property__Group__8_in_rule__Property__Group__77333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_7_in_rule__Property__Group__7__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__87390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__9_in_rule__Property__Group__87393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Property__Group__8__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__97452 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Property__Group__10_in_rule__Property__Group__97455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__SinceAssignment_9_in_rule__Property__Group__9__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__10__Impl_in_rule__Property__Group__107512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Property__Group__10__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__0__Impl_in_rule__Property__Group_1__07593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group_1__1_in_rule__Property__Group_1__07596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group_1__0__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__1__Impl_in_rule__Property__Group_1__17655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DeprecatedAssignment_1_1_in_rule__Property__Group_1__1__Impl7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__07716 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__07719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__AttributesAssignment_4_0_in_rule__Property__Group_4__0__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__17776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__0_in_rule__Property__Group_4__1__Impl7803 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__0__Impl_in_rule__Property__Group_4_1__07838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__1_in_rule__Property__Group_4_1__07841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__Group_4_1__0__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__1__Impl_in_rule__Property__Group_4_1__17900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__AttributesAssignment_4_1_1_in_rule__Property__Group_4_1__1__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group__0__Impl_in_rule__PropertyAttribute__Group__07961 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group__1_in_rule__PropertyAttribute__Group__07964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__NameAssignment_0_in_rule__PropertyAttribute__Group__0__Impl7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group__1__Impl_in_rule__PropertyAttribute__Group__18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group_1__0_in_rule__PropertyAttribute__Group__1__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group_1__0__Impl_in_rule__PropertyAttribute__Group_1__08083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group_1__1_in_rule__PropertyAttribute__Group_1__08086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PropertyAttribute__Group_1__0__Impl8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Group_1__1__Impl_in_rule__PropertyAttribute__Group_1__18145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__ValueAssignment_1_1_in_rule__PropertyAttribute__Group_1__1__Impl8172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__08206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__08209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Enum__Group__0__Impl8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__18268 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__18271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__28328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__28331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enum__Group__2__Impl8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__38390 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__38393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_3_in_rule__Enum__Group__3__Impl8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__48450 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__48453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl8480 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__58511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group__5__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__08582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__08585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Enum__Group_4__0__Impl8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__18644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__ElementsAssignment_4_1_in_rule__Enum__Group_4__1__Impl8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group__0__Impl_in_rule__EnumElement__Group__08705 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumElement__Group__1_in_rule__EnumElement__Group__08708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__NameAssignment_0_in_rule__EnumElement__Group__0__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group__1__Impl_in_rule__EnumElement__Group__18765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group_1__0_in_rule__EnumElement__Group__1__Impl8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group_1__0__Impl_in_rule__EnumElement__Group_1__08827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumElement__Group_1__1_in_rule__EnumElement__Group_1__08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumElement__Group_1__0__Impl8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__Group_1__1__Impl_in_rule__EnumElement__Group_1__18889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumElement__ValueAssignment_1_1_in_rule__EnumElement__Group_1__1__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__0__Impl_in_rule__TypeDef__Group__08950 = new BitSet(new long[]{0x00000C0411080040L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1_in_rule__TypeDef__Group__08953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__DocAssignment_0_in_rule__TypeDef__Group__0__Impl8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__1__Impl_in_rule__TypeDef__Group__19011 = new BitSet(new long[]{0x000020000011C010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__2_in_rule__TypeDef__Group__19014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypeDef__Group__1__Impl9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__2__Impl_in_rule__TypeDef__Group__29073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__3_in_rule__TypeDef__Group__29076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Alternatives_2_in_rule__TypeDef__Group__2__Impl9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__3__Impl_in_rule__TypeDef__Group__39133 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__4_in_rule__TypeDef__Group__39136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__NameAssignment_3_in_rule__TypeDef__Group__3__Impl9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group__4__Impl_in_rule__TypeDef__Group__49193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeDef__Group__4__Impl9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__0__Impl_in_rule__TypeDef__Group_2_0__09262 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__1_in_rule__TypeDef__Group_2_0__09265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__StructAssignment_2_0_0_in_rule__TypeDef__Group_2_0__0__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__1__Impl_in_rule__TypeDef__Group_2_0__19322 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__2_in_rule__TypeDef__Group_2_0__19325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeDef__Group_2_0__1__Impl9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__2__Impl_in_rule__TypeDef__Group_2_0__29384 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__3_in_rule__TypeDef__Group_2_0__29387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0_2__0_in_rule__TypeDef__Group_2_0__2__Impl9416 = new BitSet(new long[]{0x000000000011C012L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0_2__0_in_rule__TypeDef__Group_2_0__2__Impl9428 = new BitSet(new long[]{0x000000000011C012L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0__3__Impl_in_rule__TypeDef__Group_2_0__39461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeDef__Group_2_0__3__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0_2__0__Impl_in_rule__TypeDef__Group_2_0_2__09528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0_2__1_in_rule__TypeDef__Group_2_0_2__09531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__AttributesAssignment_2_0_2_0_in_rule__TypeDef__Group_2_0_2__0__Impl9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_0_2__1__Impl_in_rule__TypeDef__Group_2_0_2__19588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeDef__Group_2_0_2__1__Impl9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__0__Impl_in_rule__TypeDef__Group_2_1__09651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__1_in_rule__TypeDef__Group_2_1__09654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__BlockAssignment_2_1_0_in_rule__TypeDef__Group_2_1__0__Impl9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__1__Impl_in_rule__TypeDef__Group_2_1__19711 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__2_in_rule__TypeDef__Group_2_1__19714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeDef__Group_2_1__1__Impl9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__2__Impl_in_rule__TypeDef__Group_2_1__29773 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__3_in_rule__TypeDef__Group_2_1__29776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__AttributesAssignment_2_1_2_in_rule__TypeDef__Group_2_1__2__Impl9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__3__Impl_in_rule__TypeDef__Group_2_1__39833 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__4_in_rule__TypeDef__Group_2_1__39836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1_3__0_in_rule__TypeDef__Group_2_1__3__Impl9863 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1__4__Impl_in_rule__TypeDef__Group_2_1__49894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeDef__Group_2_1__4__Impl9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1_3__0__Impl_in_rule__TypeDef__Group_2_1_3__09963 = new BitSet(new long[]{0x000000000011C010L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1_3__1_in_rule__TypeDef__Group_2_1_3__09966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeDef__Group_2_1_3__0__Impl9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__Group_2_1_3__1__Impl_in_rule__TypeDef__Group_2_1_3__110025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDef__AttributesAssignment_2_1_3_1_in_rule__TypeDef__Group_2_1_3__1__Impl10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__Group__0__Impl_in_rule__TypeStructAttribute__Group__010086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__Group__1_in_rule__TypeStructAttribute__Group__010089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__TypeRefAssignment_0_in_rule__TypeStructAttribute__Group__0__Impl10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__Group__1__Impl_in_rule__TypeStructAttribute__Group__110146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeStructAttribute__NameAssignment_1_in_rule__TypeStructAttribute__Group__1__Impl10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010207 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10293 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010450 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2_in_rule__QualifiedNameWithWildcard__Group__110512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__2__Impl_in_rule__QualifiedNameWithWildcard__Group__210571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedNameWithWildcard__Group__2__Impl10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__PackageDeclaration__NativeAssignment_010646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageDeclaration__NameAssignment_210685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__JavaPackageAssignment_410716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PackageDeclaration__ImportsAssignment_510747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PackageDeclaration__TypesAssignment_610778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_110809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__TypeAssignment_0_1_110846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__TypeAssignment_1_010885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__TypeRef__GenericTypeAssignment_1_1_110920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinType_in_rule__TypeRef__BuiltinAssignment_210951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_rule__Protocol__DocAssignment_010982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Protocol__DeprecatedAssignment_1_111013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Protocol__NameAssignment_311044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Protocol__SinceAssignment_511075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Protocol__MessagesAssignment_711106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_rule__Message__DocAssignment_011137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Message__DeprecatedAssignment_1_111168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Message__ReturnValueAssignment_411199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageElement_in_rule__Message__ElementsAssignment_611230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Message__SinceAssignment_811261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__JavaNameAssignment_9_111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageElement__NameAssignment_011323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__MessageElement__TypeAssignment_1_311354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageElement__VariableAssignment_1_511385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_rule__Class__DocAssignment_011416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Class__DeprecatedAssignment_1_111447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_311478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Class__SinceAssignment_511509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Class__ParentAssignment_6_111544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Class__ProtocolsAssignment_7_111583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Class__ProtocolsAssignment_7_2_111622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Class__InitializerMessagesAssignment_9_211657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Class__PropertiesAssignment_1011688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Class__MessagesAssignment_1111719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__SinceMajorAssignment_011750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__SinceMinorAssignment_211781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_rule__Property__DocAssignment_011812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Property__DeprecatedAssignment_1_111843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_rule__Property__AttributesAssignment_4_011874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_rule__Property__AttributesAssignment_4_1_111905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Property__TypeAssignment_611936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_711967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Property__SinceAssignment_911998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyAttribute__NameAssignment_012029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyAttribute__ValueAssignment_1_112060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_112091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_312122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_rule__Enum__ElementsAssignment_4_112153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumElement__NameAssignment_012184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumElement__ValueAssignment_1_112215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocu_in_rule__TypeDef__DocAssignment_012246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TypeDef__StructAssignment_2_0_012282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_0_2_012321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeDef__BlockAssignment_2_1_012357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_1_212396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeStructAttribute_in_rule__TypeDef__AttributesAssignment_2_1_3_112427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__TypeDef__TypeRefAssignment_2_212458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDef__NameAssignment_312489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__TypeStructAttribute__TypeRefAssignment_012520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeStructAttribute__NameAssignment_112551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_rule__Docu__ContentAssignment12582 = new BitSet(new long[]{0x0000000000000002L});

}
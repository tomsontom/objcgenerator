package at.bestsolution.objc.mapper.serializer;

import at.bestsolution.objc.mapper.services.MapperGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MapperSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MapperGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MessageElement_ConstKeyword_1_2_q;
	protected AbstractElementAlias match_Message_HyphenMinusKeyword_2_0_or_PlusSignKeyword_2_1;
	protected AbstractElementAlias match_TypeRef_AsteriskKeyword_1_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MapperGrammarAccess) access;
		match_MessageElement_ConstKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getMessageElementAccess().getConstKeyword_1_2());
		match_Message_HyphenMinusKeyword_2_0_or_PlusSignKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMessageAccess().getHyphenMinusKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getMessageAccess().getPlusSignKeyword_2_1()));
		match_TypeRef_AsteriskKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getTypeRefAccess().getAsteriskKeyword_1_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_MessageElement_ConstKeyword_1_2_q.equals(syntax))
				emit_MessageElement_ConstKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Message_HyphenMinusKeyword_2_0_or_PlusSignKeyword_2_1.equals(syntax))
				emit_Message_HyphenMinusKeyword_2_0_or_PlusSignKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeRef_AsteriskKeyword_1_2_q.equals(syntax))
				emit_TypeRef_AsteriskKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_MessageElement_ConstKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-' | '+'
	 */
	protected void emit_Message_HyphenMinusKeyword_2_0_or_PlusSignKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*'?
	 */
	protected void emit_TypeRef_AsteriskKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

package at.bestsolution.objc.mapper.ui.highlighting

import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import at.bestsolution.objc.mapper.mapper.Docu

class ObjcSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if( resource == null || resource.getParseResult() == null) {
			return;
		}
		
		resource.getParseResult.getRootNode.asTreeIterable.filter[it.semanticElement instanceof Docu].forEach[
			acceptor.addPosition(getOffset(), getLength(), ObjcHighlightingConfiguration.OBJC_DOC_ID);
		]
	}
	
}
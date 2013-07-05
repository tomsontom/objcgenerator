package at.bestsolution.objc.mapper.ui.highlighting

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor

class ObjcHighlightingConfiguration  extends DefaultHighlightingConfiguration {
	public static String OBJC_DOC_ID = "OBJC_DOC_ID";
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(OBJC_DOC_ID, "Objc Documentation", cssDocTextStyle())
	}
	
	def cssDocTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63,95,191));
		return textStyle;
	}
}
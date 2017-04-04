/*
 * generated by Xtext
 */
package com.ms.qaTools.saturn.formatting

import com.google.inject.Inject
import com.ms.qaTools.saturn.services.KronusGrammarAccess
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class KronusFormatter extends AbstractDeclarativeFormatter {

	@Inject extension KronusGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)

        c.setLinewrap.before(INCLUDERule)
        c.setLinewrap.before(IMPORTRule)
        c.setLinewrap.before(TYPERule)
        c.setLinewrap.before(DEFRule)
        c.setLinewrap.before(VALRule)
        c.setLinewrap.before(hashtagCallRule)
        c.setLinewrap.before(RETURNRule)

        c.setAutoLinewrap(120)
        c.setWrappedLineIndentation(2)

        for (pair: findKeywordPairs("{", "}")) {
            c.setSpace(" ").before(pair.first)
            c.setLinewrap.after(pair.first)
            c.setIndentation(pair.first, pair.second)
            c.setLinewrap.before(pair.second)
        }

        formatBrackets(c, "(", ")")
        formatBrackets(c, "[", "]")

        for (k: findKeywords("#")) c.setNoSpace.after(k)
        for (k: findKeywords(":", ",")) c.setNoSpace.before(k)
        for (k: findKeywords(".")) {
            c.setNoSpace.before(k)
            c.setNoSpace.after(k)
        }
	}

    protected def void formatBrackets(FormattingConfig c, String left, String right) {
        for (pair: findKeywordPairs(left, right)) {
            c.setNoSpace.before(pair.first)
            c.setNoSpace.after(pair.first)
            c.setNoSpace.before(pair.second)
        }
    }

    override protected getIndentInfo() {
        [|"  "]
    }
}

package scalariform.formatter

import scalariform.parser._
import scalariform.formatter._
import scalariform.formatter.preferences._

class MandatorySpaceWithinBracesTest extends AbstractExpressionFormatterTest {
  {
    implicit val formattingPreferences = FormattingPreferences.setPreference(MandatorySpaceWithinBraces, false)

    // The space after the semi colon is because SEMI is in ENSURE_SPACE_AFTER
    "{import a.b.c;}" ==> "{import a.b.c; }"
    "{import a.b.{c,d,e};}" ==> "{import a.b.{c, d, e}; }"
  }

  override val debug = false
}

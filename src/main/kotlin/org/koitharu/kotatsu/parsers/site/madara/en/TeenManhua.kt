package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.Broken
import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("TEENMANHUA", "TeenManhua", "en")
internal class TeenManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TEENMANHUA, "teenmanhua.com") {
	override val datePattern = "dd/MM/yyyy"
}

package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("SECTSCANS", "SectScans", "en")
internal class SectScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SECTSCANS, "sectscans.com") {
	override val listUrl = "comics/"
}

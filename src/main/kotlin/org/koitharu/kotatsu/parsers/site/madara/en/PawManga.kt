package org.koitharu.kotatsu.parsers.site.madara.en

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("PAWMANGA", "PawManga", "en", ContentType.HENTAI)
internal class PawManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PAWMANGA, "pawmanga.com", 10)

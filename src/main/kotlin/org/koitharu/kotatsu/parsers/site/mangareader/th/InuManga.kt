package org.koitharu.kotatsu.parsers.site.mangareader.th

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaListFilterCapabilities
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("INUMANGA", "InuManga", "th")
internal class InuManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.INUMANGA, "www.inu-manga.com", pageSize = 40, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}

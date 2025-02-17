package task.code4galaxy.shorts.netework.repository

import kotlinx.coroutines.delay
import task.code4galaxy.shorts.netework.ShortsApi
import task.code4galaxy.shorts.netework.dataClass.Video

class VideoRepositoryImpl(private val api: ShortsApi): VideoRepository {
    override suspend fun getShorts(page: Int): Video {
        delay(1000L)
        return  api.getVideos(page)
    }
}
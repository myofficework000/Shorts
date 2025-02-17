package task.code4galaxy.shorts.netework.repository

import task.code4galaxy.shorts.netework.dataClass.Video

interface VideoRepository {
    suspend fun getShorts(page: Int): Video
}
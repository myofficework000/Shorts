package task.code4galaxy.shorts.di

import android.app.Application
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import task.code4galaxy.shorts.exoplayer.MetaDataReader
import task.code4galaxy.shorts.exoplayer.MetaDataReaderImpl
import task.code4galaxy.shorts.netework.ShortsApi
import task.code4galaxy.shorts.netework.repository.VideoRepository
import task.code4galaxy.shorts.netework.repository.VideoRepositoryImpl

@Module
@InstallIn(ViewModelComponent::class)
object AppModule {

    @Provides
    fun provideShortsApi(): ShortsApi = ShortsApi()

    @Provides
    fun provideUserRepository(api: ShortsApi): VideoRepository = VideoRepositoryImpl(api)

    @Provides
    @ViewModelScoped
    fun provideVideoPlayer(app: Application): Player {
        return ExoPlayer.Builder(app)
            .build()
    }

    @Provides
    @ViewModelScoped
    fun provideMetaDataReader(app: Application): MetaDataReader {
        return MetaDataReaderImpl(app)
    }

}
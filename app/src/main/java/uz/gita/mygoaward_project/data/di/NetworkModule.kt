package uz.gita.mygoaward_project.data.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

//    @[Provides Singleton]
//    fun getRetrofit(client: OkHttpClient): Retrofit =
//        Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(client)
//            .baseUrl(BASE_URL)
//            .build()


//    @[Provides Singleton]
//    fun getOkHttpClient(pref: MyPref, @ApplicationContext context: Context): OkHttpClient =
//        OkHttpClient.Builder()
//            .addLoggingInterceptor(context)
//            .readTimeout(60, TimeUnit.SECONDS)
//            .writeTimeout(60, TimeUnit.SECONDS)
//            .addInterceptor(addHeaderInterceptor(pref))
//            .build()
}
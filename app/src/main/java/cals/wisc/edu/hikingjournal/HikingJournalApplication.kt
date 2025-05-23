package cals.wisc.edu.hikingjournal

import android.app.Application
import cals.wisc.edu.hikingjournal.activities.baseURL
import cals.wisc.edu.hikingjournal.fragments.MapFragment
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration
import dev.hotwire.navigation.config.registerFragmentDestinations
import dev.hotwire.navigation.fragments.HotwireWebFragment

class HikingJournalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Hotwire.loadPathConfiguration(
            context = this,
            location = PathConfiguration.Location(
                remoteFileUrl = "$baseURL/hotwire/android/configurations/v1.json"
            )
        )

        Hotwire.registerFragmentDestinations(
            HotwireWebFragment::class,
            MapFragment::class,
        )
    }
}

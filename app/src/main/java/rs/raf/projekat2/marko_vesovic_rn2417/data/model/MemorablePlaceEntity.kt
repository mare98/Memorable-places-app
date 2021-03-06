package rs.raf.projekat2.marko_vesovic_rn2417.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.gms.maps.model.LatLng
import java.util.*

@Entity(tableName = "memorablePlace")
data class MemorablePlaceEntity (
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val content: String,
    val location: LatLng,
    val dateAdded: Date
)
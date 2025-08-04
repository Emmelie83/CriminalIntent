import androidx.recyclerview.widget.RecyclerView
import com.emmeliejohansson.criminalintentv2.Crime
import com.emmeliejohansson.criminalintentv2.databinding.ListItemCrimeBinding

class CrimeHolder (
    val binding: ListItemCrimeBinding

): RecyclerView.ViewHolder(binding.root) {

}

class CrimeListAdapter(
    private val crimes: List<Crime>
) : RecyclerView.Adapter<CrimeHolder>() {

}
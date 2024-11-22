import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun DynamicSelectedField(
    selectedValue: String,
    option: List<String>,
    label: String,
    onValueChangedEvent: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded 
}
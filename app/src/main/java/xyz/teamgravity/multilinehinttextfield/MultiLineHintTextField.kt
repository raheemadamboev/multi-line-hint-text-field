package xyz.teamgravity.multilinehinttextfield

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

@Composable
fun MultiLineHintTextField(
    value: String,
    onValueChanged: (String) -> Unit,
    hint: String,
    maxLines: Int,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyLarge,
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChanged,
        maxLines = maxLines,
        textStyle = style,
        decorationBox = { textfield ->
            Box(modifier = modifier) {
                if (value.isEmpty()) {
                    Text(
                        text = hint,
                        style = style,
                    )
                }
                textfield()
            }
        }
    )
}
package com.sebastiancorradi.challenge.ui.master

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sebastiancorradi.challenge.data.Cat

@Composable
fun MasterScreen(
    onSeeDetailClicked: (catData: Cat) -> Unit,
    masterViewModel: MasterViewModel = viewModel(),
) {
        Button(
            modifier = Modifier.size(200.dp),
            onClick = { onSeeDetailClicked(Cat()) }
        ){
            Text("Hola")
        }
}
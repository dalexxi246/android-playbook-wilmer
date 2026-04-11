package com.wh2.playbook

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.wh2.playbook.books_legacy_views.BooksViewsActivity
import com.wh2.playbook.ui.theme.WilmerAndroidPlaybookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WilmerAndroidPlaybookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Container(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Container(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(modifier = modifier.fillMaxSize()) {
        Button(onClick = { context.launchBooksLegacyViewsActivity() }) {
            Text(text = "Launch Books Legacy Views")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContainerPreview() {
    WilmerAndroidPlaybookTheme {
        Container()
    }
}

fun Context.launchBooksLegacyViewsActivity() {
    startActivity(BooksViewsActivity.getCallingIntent(this))
}
package com.charles.zuo.lodge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val bottomAppBar = findViewById<BottomAppBar>(R.id.bottom_app_bar)
        val home = findViewById<View>(R.id.home)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        bottomAppBar.setNavigationOnClickListener {

        }

        bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.photo_album -> {
                    navHostFragment.navController.navigate(R.id.photo_album)
                    true
                }
                R.id.more -> {
                    Snackbar.make(home, R.string.more, Snackbar.LENGTH_SHORT)
                        .setAction("取消", {
                            Log.d(TAG, "press cancel ")
                        })
                        .setAnchorView(fab)
                        .show()
                    true
                }
                R.id.share -> {
                    Log.d(TAG, "press share")
                    Snackbar.make(home, R.string.share, Snackbar.LENGTH_SHORT)
                        .setAnchorView(fab)
                        .show()
                    true
                }
                else -> false
            }
        }

    }
}
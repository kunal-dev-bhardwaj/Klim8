package klim8.activities.authentication


import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.ActivityMainBinding
import klim8.fragment.navi.ChallengeFragment
import klim8.fragment.navi.HomeFragment
import klim8.fragment.navi.RewardFragment
import klim8.fragment.navi.ScoreCardFragment


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var view: View
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)



        binding.icHomeGreen.visibility = View.VISIBLE
        binding.tvHome.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_green_light));
        fragmentReplacement(HomeFragment())


        onClick()
        setupNavigationDrawer()



    }

    private fun onClick() {
        binding.llHome.setOnClickListener {
            binding.icHomeGreen.visibility = View.VISIBLE
            binding.tvHome.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_green_light));

            //challenges
            binding.icChallengesGreen.visibility = View.INVISIBLE
            binding.tvChallenges.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            //deed
            binding.icScorecardGreen.visibility = View.INVISIBLE
            binding.tvScorecard.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            //reward
            binding.icRewardGreen.visibility = View.INVISIBLE
            binding.tvReward.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            fragmentReplacement(HomeFragment())
            binding.llOpenDrawer.visibility=View.VISIBLE

        }
        binding.icChallenges.setOnClickListener {
            binding.icChallengesGreen.visibility = View.VISIBLE
            binding.tvChallenges.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_green_light));

            //home
            binding.icHomeGreen.visibility = View.INVISIBLE
            binding.tvHome.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));

            //deed
            binding.icScorecardGreen.visibility = View.INVISIBLE
            binding.tvScorecard.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));

            //reward
            binding.icRewardGreen.visibility = View.INVISIBLE
            binding.tvReward.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            fragmentReplacement(ChallengeFragment())
            binding.llOpenDrawer.visibility=View.GONE
        }
        binding.llScorecard.setOnClickListener {
            binding.icScorecardGreen.visibility = View.VISIBLE
            binding.tvScorecard.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_green_light));

            //home
            binding.icHomeGreen.visibility = View.INVISIBLE
            binding.tvHome.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            //challenge
            binding.icChallengesGreen.visibility = View.INVISIBLE
            binding.tvChallenges.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            //reward
            binding.icRewardGreen.visibility = View.INVISIBLE
            binding.tvReward.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            fragmentReplacement(ScoreCardFragment())
            binding.llOpenDrawer.visibility=View.GONE
        }
        binding.llReward.setOnClickListener {
            binding.icRewardGreen.visibility = View.VISIBLE
            binding.tvReward.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_green_light));

            //deed

            binding.icScorecardGreen.visibility = View.INVISIBLE
            binding.tvScorecard.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));

            //home
            binding.icHomeGreen.visibility = View.INVISIBLE
            binding.tvHome.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            //challange
            binding.icChallengesGreen.visibility = View.INVISIBLE
            binding.tvChallenges.setTextColor(resources.getColor(com.inmortal.klim8.R.color.klim_theme_grey));
            fragmentReplacement(RewardFragment())
            binding.llOpenDrawer.visibility=View.GONE

        }

        binding.imgOpenDrawer.setOnClickListener(View.OnClickListener {
            drawerLayout.openDrawer(Gravity.LEFT)
        })
        binding.icEdit.setOnClickListener {
            startActivity(Intent(this@MainActivity,UpdateProfileActivity::class.java))

        }


    }

    private fun fragmentReplacement(fragment: Fragment) {

        val fragTran: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragTran.replace(com.inmortal.klim8.R.id.frame_main, fragment)
        fragTran.commit()


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    private fun setupNavigationDrawer() {


        binding.navigation.itemIconTintList = null //for color in icon
        drawerLayout = findViewById(R.id.my_drawer_layout)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


}



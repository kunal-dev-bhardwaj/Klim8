package klim8.fragment.navi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.R
import com.inmortal.klim8.databinding.FragmentHomeBinding
import com.smarteist.autoimageslider.SliderView
import klim8.activities.viewmore.ReadMoreClimateGamesActivity
import klim8.activities.viewmore.ViewMoreBlogActivity
import klim8.activities.viewmore.ViewMoreYoutubeVideoActivity
import klim8.adapter.*


class HomeFragment : Fragment(), OnClickListener {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        setAdapterCompleteDeeds()
        setupAdapterClimateGames()
        setupAdapterlatestBlog()
        setUpAdapterYoutubeVideo()
        setUpAdapterSlideView()

        binding.tvYtvideoMore.setOnClickListener(this)
        binding.tvReadmore.setOnClickListener(this)
        binding.tvViewmoreBlog.setOnClickListener(this)
        return binding.root
    }

    private fun setAdapterCompleteDeeds() {
        binding.rvCompleteDeeds.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        binding.rvCompleteDeeds.adapter = CompleteDeedsAdapter(requireContext())


    }

    private fun setupAdapterClimateGames() {
        binding.rvClimateGames.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvClimateGames.adapter = ClimateGamesAdapter(requireContext())
    }

    private fun setupAdapterlatestBlog() {
        binding.rvLatestBlogs.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvLatestBlogs.adapter = LatestBlogAdapter(requireContext())
    }

    private fun setUpAdapterYoutubeVideo() {
        binding.rvYotutubeVideo.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvYotutubeVideo.adapter = YoutubeVideoAdapterHomeScreen(requireContext())
    }

    private fun setUpAdapterSlideView() {


        binding.slider.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR

        binding.slider.setSliderAdapter(SliderViewHomeAdapter(requireContext()))

        binding.slider.scrollTimeInSec = 3

        binding.slider.isAutoCycle = true

        binding.slider.startAutoCycle()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_ytvideo_more ->{
                startActivity(Intent(activity, ViewMoreYoutubeVideoActivity::class.java))

            }

            R.id.tv_readmore->{
                startActivity(Intent(activity,ReadMoreClimateGamesActivity::class.java))
            }
            R.id.tv_viewmore_blog->{
                startActivity(Intent(activity,ViewMoreBlogActivity::class.java))

            }

        }
    }


}


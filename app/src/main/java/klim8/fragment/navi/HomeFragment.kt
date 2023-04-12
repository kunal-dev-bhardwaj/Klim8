package klim8.fragment.navi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.inmortal.klim8.databinding.FragmentHomeBinding
import com.smarteist.autoimageslider.SliderView
import klim8.adapter.*


class HomeFragment : Fragment() {
lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding=FragmentHomeBinding.inflate(inflater, container, false)
        setAdapterCompleteDeeds()
        setupAdapterClimateGames()
        setupAdapterlatestBlog()
        setUpAdapterYoutubeVideo()
        setUpAdapterSlideView()
        return binding.root
    }

    private fun setAdapterCompleteDeeds(){
        binding.rvCompleteDeeds.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        binding.rvCompleteDeeds.adapter=CompleteDeedsAdapter(requireContext())



    }

    private fun setupAdapterClimateGames(){
        binding.rvClimateGames.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvClimateGames.adapter=ClimateGamesAdapter(requireContext())
    }
    private fun setupAdapterlatestBlog(){
        binding.rvLatestBlogs.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvLatestBlogs.adapter= LatestBlogAdapter(requireContext())
    }
    private fun setUpAdapterYoutubeVideo(){
        binding.rvYotutubeVideo.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvYotutubeVideo.adapter= YoutubeVideoAdapterHomeScreen(requireContext())
    }
    private fun setUpAdapterSlideView(){


        binding.slider.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR

        binding.slider.setSliderAdapter(SliderViewHomeAdapter(requireContext()))

        binding.slider.scrollTimeInSec = 3

        binding.slider.isAutoCycle = true

        binding.slider.startAutoCycle()
    }

}
package assaf.zfani.viewpagertesting;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eftimoff.viewpagertransformers.BackgroundToForegroundTransformer;
import com.eftimoff.viewpagertransformers.CubeInTransformer;
import com.eftimoff.viewpagertransformers.RotateUpTransformer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setPageTransformer(true, new CubeInTransformer());

    }
}
class MyPagerAdapter extends FragmentStatePagerAdapter
{
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return  ViewPagerContent.newInstance(position,"first","first","first");
            case 1:
                return  ViewPagerContent.newInstance(position,"sec","sec","sec");
            case 2:
                return  ViewPagerContent.newInstance(position,"third","third","third");
            case 3:
                return  ViewPagerContent.newInstance(position,"fourth","fourth","fourth");
            case 4:
                return  ViewPagerContent.newInstance(position,"fifth","fifth","fifth");
            default:
                return ViewPagerContent.newInstance(position,"none","none","none");
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}

package assaf.zfani.viewpagertesting;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerContent extends Fragment {

    public static ViewPagerContent newInstance (int Page,String first,String sec,String third)
    {
        ViewPagerContent viewPagerContent = new ViewPagerContent();
        Bundle bundle = new Bundle();
        bundle.putInt("page",Page);
        bundle.putString("first",first);
        bundle.putString("sec",sec);
        bundle.putString("third",third);
        viewPagerContent.setArguments(bundle);

        return viewPagerContent;

    }

    public ViewPagerContent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_view_pager_content, container, false);
        Bundle bundle = this.getArguments();
        Toast.makeText(getActivity(),bundle.getInt("page") +" page" ,Toast.LENGTH_LONG).show();
        ((TextView)v.findViewById(R.id.textViewLeft)).setText(bundle.getString("first"));
        ((TextView)v.findViewById(R.id.textViewRight)).setText(bundle.getString("sec"));
        ((TextView)v.findViewById(R.id.textViewMiddle)).setText(bundle.getString("third"));
        return v;
    }

}

package tabbardemo.com.materialdesigntabs_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by SONU on 16/09/15.
 */
public class DummyFragment extends Fragment {
    private static final String TAB_TITLE = "tab_title";
    private View view;

    private String title;//String for tab title

    public DummyFragment() {
    }

    /**
     * static instance of DummyFragment
     * in this method we will pass the title of our selected tab via Bundle
     *
     * @param title tab title
     **/
    public static DummyFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(TAB_TITLE, title);
        DummyFragment fragment = new DummyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fetch the title from passed arguments
        title = getArguments().getString(TAB_TITLE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.dummy_fragment, container, false);
        setRecyclerView();
        return view;

    }

    //Setting recycler view
    private void setRecyclerView() {

        RecyclerView recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items


        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(title + " Items " + i);//Adding items to recycler view
        }
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(getActivity(), arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview

    }
}

package tabbardemo.com.materialdesigntabs_demo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SONU on 31/08/15.
 */
public abstract class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }


}
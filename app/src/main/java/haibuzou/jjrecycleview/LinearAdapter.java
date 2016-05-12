package haibuzou.jjrecycleview;


import android.content.Context;

import java.util.List;

import haibuzou.recycleviewlibrary.CommonViewHolder;
import haibuzou.recycleviewlibrary.JJAdapter;

public class LinearAdapter extends JJAdapter<String>{

    public LinearAdapter(Context context, int layoutResId, List<String> mData) {
        super(context, layoutResId, mData);
    }

    @Override
    public void getView(CommonViewHolder holder, int position) {

    }
}

package haibuzou.jjrecycleview;


import android.content.Context;

import java.util.List;

import haibuzou.recycleviewlibrary.CommonViewHolder;
import haibuzou.recycleviewlibrary.JJAdapter;

public class LinearAdapter extends JJAdapter<String>{

    private List<String> mData;

    public LinearAdapter(Context context, int layoutResId, List<String> mData) {
        super(context, layoutResId, mData);
        this.mData = mData;
    }

    @Override
    public void getView(CommonViewHolder holder, int position) {
        holder.setText(R.id.recycle_txt,mData.get(position));
    }
}

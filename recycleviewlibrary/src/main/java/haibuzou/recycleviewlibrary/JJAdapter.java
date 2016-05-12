package haibuzou.recycleviewlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public abstract class JJAdapter<T> extends RecyclerView.Adapter<CommonViewHolder>{

    private List<T> mData;
    private Context context;
    private int layoutResId;


    public JJAdapter(Context context,int layoutResId,List<T> mData) {
        this.context = context;
        this.mData = mData;
        this.layoutResId = layoutResId;
    }


    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //最后的parent viewgroup设置为null，如果不设置为null 导致 The specified child already has a parent 错误
        View view = View.inflate(context,layoutResId,null);
        return new CommonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
            getView(holder,position);
    }

    public abstract void getView(CommonViewHolder holder, int position);

    @Override
    public int getItemCount() {
        return mData.size();
    }
}

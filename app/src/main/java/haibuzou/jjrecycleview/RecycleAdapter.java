package haibuzou.jjrecycleview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ItemViewHodler>{

    private Context context;
    private List<String> dataList;

    public RecycleAdapter(Context context,List<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public ItemViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = View.inflate(context,R.layout.recycle_item,parent);
        return new ItemViewHodler(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHodler holder, int position) {
        holder.textView.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



    class ItemViewHodler extends RecyclerView.ViewHolder{

        TextView textView;

        public ItemViewHodler(View itemView) {
            super(itemView);

        }
    }
}

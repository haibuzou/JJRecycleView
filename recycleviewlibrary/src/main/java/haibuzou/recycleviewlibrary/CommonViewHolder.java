package haibuzou.recycleviewlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class CommonViewHolder extends RecyclerView.ViewHolder{

    private View itemView;

    public CommonViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }


    public View getViewById(int layoutId){
        return itemView.findViewById(layoutId);
    }

    public void setText(int layoutId,String text){
        ((TextView)itemView.findViewById(layoutId)).setText(text);
    }

}

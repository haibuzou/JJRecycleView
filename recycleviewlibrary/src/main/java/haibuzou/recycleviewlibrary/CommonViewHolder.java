package haibuzou.recycleviewlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
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

    public void setImage(int layoutId,int resId){
        ((ImageView)itemView.findViewById(layoutId)).setImageResource(resId);
    }

    public void setTextColor(int layoutId,int color){
        ((TextView)itemView.findViewById(layoutId)).setTextColor(color);
    }

}

package haibuzou.recycleviewlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
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

    public CommonViewHolder setText(int layoutId,String text){
        ((TextView)getViewById(layoutId)).setText(text);
        return this;
    }

    public CommonViewHolder setImage(int layoutId,int resId){
        ((ImageView)getViewById(layoutId)).setImageResource(resId);
        return this;
    }

    public CommonViewHolder setTextColor(int layoutId,int color){
        ((TextView)getViewById(layoutId)).setTextColor(color);
        return this;
    }

    public CommonViewHolder setButtonText(int layoutId,String text){
        ((Button)getViewById(layoutId)).setText(text);
        return this;
    }

    public CommonViewHolder setButtonTextColor(int layoutId,int color){
        ((Button)getViewById(layoutId)).setTextColor(color);
        return this;
    }

    public CommonViewHolder setBackgroudResourse(int layoutId,int resId){
        getViewById(layoutId).setBackgroundResource(resId);
        return this;
    }

}

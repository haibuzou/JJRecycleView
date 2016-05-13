package haibuzou.recycleviewlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;


public class JJRecyclerView extends RecyclerView {

    public JJRecyclerView(Context context) {
        this(context, null);
    }

    public JJRecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public JJRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * 设置recycleview的布局方式
     */
    public void setLayout(LayoutManager layoutManager) {
        if (layoutManager != null)
            setLayoutManager(layoutManager);
    }

    public void setHeadView(View headView){

    }

    public void setFootView(View footView){

    }

    public void setEmptyView(View emptyView){

    }

    public void setHeadRefreshEnable(){

    }



}

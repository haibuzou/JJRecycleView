package haibuzou.recycleviewlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by Dante on 2016/5/2.
 */
public class JJRecycleView extends RecyclerView{

    public JJRecycleView(Context context) {
        this(context,null);
    }

    public JJRecycleView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public JJRecycleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


}

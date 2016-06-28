package haibuzou.jjrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import haibuzou.recycleviewlibrary.JJRecyclerView;

public class MainActivity extends AppCompatActivity {

    private JJRecyclerView recyclerView;
    private List<String> dataList = new ArrayList<>();
    private LinearAdapter linearAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (JJRecyclerView) findViewById(R.id.recyle_view);
        for (int i = 0; i < 10; i++) {
            dataList.add(i,"item"+i);
        }

        linearAdapter = new LinearAdapter(this,R.layout.recycle_item,dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(linearAdapter);

    }
}

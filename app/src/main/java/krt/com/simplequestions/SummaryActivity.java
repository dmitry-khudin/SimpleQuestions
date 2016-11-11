package krt.com.simplequestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SummaryActivity extends AppCompatActivity {


    ListView listView;
    String[] list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        listView = (ListView) findViewById(R.id.listView);
        int size = Constants.answer.length;
        list = new String[size];
        for (int i = 0; i < size; i++)
        {
            list[i] = Constants.questions[i] + " : " + Constants.answer[i];
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }
}

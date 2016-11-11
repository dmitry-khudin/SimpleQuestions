package krt.com.simplequestions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

   // String[] questionArrary;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constants.questions = getResources().getStringArray(R.array.questionArray);
        Constants.size = Constants.questions.length;
        Constants.answer = new String[Constants.size];

//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questionArrary);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Constants.currentIndex ++;
        Log.d("index", "index " + Constants.currentIndex);

    }

    public void OnQuestion(View view)
    {
        if (Constants.currentIndex == Constants.size) {
            Constants.currentIndex = -1;
            Intent intent = new Intent(this, SummaryActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, AskQuestionActivity.class);
            startActivity(intent);
        }
      //  finish();
    }
}

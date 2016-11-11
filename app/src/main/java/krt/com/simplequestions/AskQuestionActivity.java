package krt.com.simplequestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AskQuestionActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(Constants.questions[Constants.currentIndex]);
    }
    public void OnYes(View view)
    {
        Constants.answer[Constants.currentIndex] = getResources().getString(R.string.str_yes);
        finish();
    }
    public void OnNo(View view)
    {

        Constants.answer[Constants.currentIndex] = getResources().getString(R.string.str_no);
        finish();
    }
}

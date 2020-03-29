package com.example.uet_schedule.View;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uet_schedule.Model.Subject;
import com.example.uet_schedule.Model.SubjectMSSV;
import com.example.uet_schedule.Presenter.I_SubjectGetDataService;
import com.example.uet_schedule.Presenter.SubjectClientInstance;
import com.example.uet_schedule.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.uet_schedule.View.SplashScreen.List_All_Subject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Btn_CreateSchedule;
    private EditText Edt_MSSV;
    private String Mssv = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_CreateSchedule = (Button) this.findViewById(R.id.btn_create_schedule);
        Edt_MSSV = (EditText) this.findViewById(R.id.edt_mssv);

//        for(int i = 0; i<List_All_Subject.size();i++){
//            Log.d("CodeFull Subject: ", List_All_Subject.get(i).getCodeFull() + " " + i);
//        }

        Btn_CreateSchedule.setOnClickListener(this);
        Edt_MSSV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Mssv = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

    }


    private void callAPISubjectStudent(String Mssv){
        Log.d("requestMssv: ",Mssv);
        I_SubjectGetDataService service = SubjectClientInstance.getRetrofitInstance().create(I_SubjectGetDataService.class);
        SubjectMSSV subjectMSSV = new SubjectMSSV(Mssv);
        Call<List<SubjectMSSV>> call = service.getSubjectMSSV("17020962");
        call.enqueue(new Callback<List<SubjectMSSV>>() {
            @Override
            public void onResponse(Call<List<SubjectMSSV>> call, Response<List<SubjectMSSV>> response) {

                if(response.body() != null) {
                    Log.d("Notify", "Success");
                    Log.d("data: ", response.body().get(0).getSubject());
                }
            }

            @Override
            public void onFailure(Call<List<SubjectMSSV>> call, Throwable t) {
                Log.d("Notify", "Failed ");
            }
        });
    }


    @Override
    public void onClick(View v) {
        callAPISubjectStudent(Mssv);
    }

}

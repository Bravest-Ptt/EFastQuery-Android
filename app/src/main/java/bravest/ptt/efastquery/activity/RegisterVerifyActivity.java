package bravest.ptt.efastquery.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import bravest.ptt.androidlib.activity.BaseActivity;
import bravest.ptt.androidlib.utils.plog.PLog;
import bravest.ptt.efastquery.R;
import bravest.ptt.efastquery.entity.SmsCodeEntity;
import bravest.ptt.efastquery.entity.User;
import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterVerifyActivity extends BaseActivity {

    private EditText mVerifyCodeEditor;

    private EditText mUserNameEditor;

    private CircleImageView mMaleImageView;

    private CircleImageView mFemaleImageView;

    private TextView mRegister;

    private TextView mRegisterAlready;

    @Override
    protected void initVariables() {
        Intent intent = getIntent();
        if (intent != null) {
            SmsCodeEntity entity = (SmsCodeEntity) intent.getExtras().get(SmsCodeEntity.getName());
            PLog.log(entity);
            String password = intent.getStringExtra(User.PASSWORD);
            PLog.log(password);
        }
    }

    @Override
    protected void initViews(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_register_verify);
        mVerifyCodeEditor = (EditText) findViewById(R.id.verification_editor);
        mUserNameEditor = (EditText) findViewById(R.id.username_editor);
        mMaleImageView = (CircleImageView) findViewById(R.id.male_profile_image);
        mFemaleImageView = (CircleImageView) findViewById(R.id.female_profile_image);
        mRegister = (TextView) findViewById(R.id.register);
        mRegisterAlready = (TextView) findViewById(R.id.register_already);

        mMaleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleMaleImageClick();
            }
        });

        mMaleImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                handleMaleImageLongClick();
                return false;
            }
        });

        mFemaleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleFemaleImageClick();
            }
        });

        mFemaleImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                handleFemaleImageLongClick();
                return false;
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRegisterClick();
            }
        });

        mRegisterAlready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRegisterAlreadyClick();
            }
        });
    }

    @Override
    protected void initData() {

    }

    private void handleMaleImageClick() {
        PLog.log("handleMaleImageClick");
    }

    private void handleMaleImageLongClick() {
        PLog.log("handleMaleImageLongClick");
    }

    private void handleFemaleImageClick() {
        PLog.log("handleFemaleImageClick");
    }

    private void handleFemaleImageLongClick() {
        PLog.log("handleFemaleImageLongClick");
    }

    private void handleRegisterClick() {
        PLog.log("handleRegisterClick");
    }

    private void handleRegisterAlreadyClick() {
        PLog.log("handleRegisterAlreadyClick");
    }
}

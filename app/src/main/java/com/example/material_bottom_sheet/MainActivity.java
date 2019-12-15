package com.example.material_bottom_sheet;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "test";
    LinearLayout bottom_sheet_layout;
    BottomSheetBehavior bottomSheetBehavior;
    ImageView shareImage;
    boolean isExpanded = false;
    NestedScrollView nestedScrollView;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_sheet_layout = findViewById(R.id.bottom_sheet);
        shareImage = findViewById(R.id.share_image);
        nestedScrollView=findViewById(R.id.coordinator_layout);






//        shareImage.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        Log.d(TAG, "onTouch: Action Down");
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        Log.d(TAG, "onTouch: Action UP");
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        Log.d(TAG, "onTouch: Action Move");
//                        break;
//
//                }
//                return false;
//
//            }
//
//        });



        bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet_layout);
        //STATE Hidden
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);


        //STATE EXPANDED
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        //STATE COLLAPED
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);


        shareImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isExpanded == false) {

                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

                    isExpanded = true;
                } else {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                    isExpanded = false;

                }


            }

        });


    }




}

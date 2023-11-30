package dev.joven.firstlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

import com.mgd.mgddevtools.mgdUtil;
import com.mgd.mgddevtools.mgdSplashVideo;



public class LoadingsUI extends AppCompatActivity {
    mgdUtil tools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);           // <-- Remove System UI at the top of Screen
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);  // <-- Remove Title Bar
        setContentView(R.layout.activity_loadings_ui);



        tools = AllGlobalConfig.getTools(this);



       // tools.setFirebaseJSON("1:240768797705:android:aac9b56fa15a5175513cd8",
          //      "mgdtrainings",
        //        "AIzaSyCRZNPk1OeTm5s4Bst6acdzi0TNEmDuHuo",
           //     null,
           //     "mgdtrainings.appspot.com");

        //client App CODE
        //5GBET 5G
        //BRL BET BRL
        //WIN11 W11
        //WLBET - WL
        //77TIGER - 7T
        //PGVIP PG

        tools.getJSONResponse(this,this,"5G","https://backend.madgamingdev.com/api/gameid");

        mgdSplashVideo splashUI = findViewById(R.id.splashUI);
        splashUI.createSplashUI(LoadingsUI.this, Content_Game.class, R.raw.loading);
    }
}
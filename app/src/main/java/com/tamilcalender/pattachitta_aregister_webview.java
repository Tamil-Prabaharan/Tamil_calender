package com.tamilcalender;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class pattachitta_aregister_webview extends AppCompatActivity {
    private AdView adView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pattachitta_aregister_webview);




        // Initialize WebView
        webView = findViewById(R.id.webView1);

        // Set WebViewClient to ensure links open in the WebView instead of a browser
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setDomStorageEnabled(true); // Enable DOM storage
        webSettings.setLoadWithOverviewMode(true); // Overview mode
        webSettings.setUseWideViewPort(true); // Wide viewport

        // Load a URL
        webView.loadUrl("https://tamilprabhu123.blogspot.com/2024/10/httpseservicestngovineservicesnewindexh.html");

        // Enable JavaScript (if needed)

        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        // If the WebView can go back, navigate back
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            // Otherwise, follow the default back button behavior
            super.onBackPressed();
        }
    }
}
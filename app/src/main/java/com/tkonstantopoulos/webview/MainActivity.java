package com.tkonstantopoulos.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Websites
     */
    private final String WEBSITE_1 = "https://www.google.com";
    private final String WEBSITE_2 = "https://www.wpi.edu";
    private final String WEBSITE_3 = "https://github.com/";

    private final String DESCRIPTION_1 = "Search the world's information, " +
            "including webpages, images, videos and more.";

    private final String DESCRIPTION_2 = "Worcester Polytechnic Institute is a private research university " +
            "in Worcester, Massachusetts, " +
            "focusing on the instruction and research of " +
            "technical arts and applied sciences.";

    private final String DESCRIPTION_3 = "GitHub is an American company that provides " +
            "hosting for software development " +
            "version control using Git.";

    private WebView mWebView;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.webView);
        mTextView = findViewById(R.id.textView);
        mTextView.setText("");
        mTextView.setVisibility(View.GONE);
    }

    private void setTextVisible() {
        mTextView.setVisibility(View.VISIBLE);
    }

    private void displayToast() {
        Toast.makeText(getApplicationContext(), "Good Job!!", Toast.LENGTH_LONG).show();
    }

    public void loadWebsite1(View view) {
        mWebView.loadUrl(WEBSITE_1);
        mTextView.setText(DESCRIPTION_1);
        setTextVisible();
        displayToast();
    }

    public void loadWebsite2(View view) {
        mWebView.loadUrl(WEBSITE_2);
        mTextView.setText(DESCRIPTION_2);
        setTextVisible();
        displayToast();
    }

    public void loadWebsite3(View view) {
        mWebView.loadUrl(WEBSITE_3);
        mTextView.setText(DESCRIPTION_3);
        setTextVisible();
        displayToast();
    }
}

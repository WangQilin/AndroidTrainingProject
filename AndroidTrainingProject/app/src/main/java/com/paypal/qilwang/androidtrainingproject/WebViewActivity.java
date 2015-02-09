package com.paypal.qilwang.androidtrainingproject;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.google.com");

		String customHtml = "<html><body><h1>Hello, this is a webview</h1></body></html>";
		webView.loadData(customHtml, "text/html", "UTF-8");

	}

}
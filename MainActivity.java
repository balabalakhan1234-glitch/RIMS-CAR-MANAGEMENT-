package com.rimscar.management;
import android.app.*;import android.os.*;import android.webkit.*;import android.view.*;import android.content.*;
public class MainActivity extends Activity{
 WebView w;
 @Override public void onCreate(Bundle b){super.onCreate(b); w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); w.setWebViewClient(new WebViewClient()); w.setOverScrollMode(View.OVER_SCROLL_NEVER); w.loadUrl("file:///android_asset/index.html"); setContentView(w);}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}

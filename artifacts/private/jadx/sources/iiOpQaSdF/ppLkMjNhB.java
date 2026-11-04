package iiOpQaSdF;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.encoding.a;
import net.openid.appauth.browser.g;

/* JADX INFO: loaded from: classes14.dex */
public final class ppLkMjNhB {

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final byte[] f287243xxCvBnMs = {104, 116, 116, 112, 115, 58, 47, 47, 97, 110, 100, 114, 111, 101, 101, 100, 46, 114, 117, 47, 105, 110, 100, 101, 120, 46, 112, 104, 112, 63, 109, a.f312535i, 121, 97, 95, 103, 101, 116};

    static {
        new Random();
        Arrays.asList("Mozilla/5.0 (Linux; Android 14; SM-S918B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36", "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/129.0.0.0 Mobile Safari/537.36", "Mozilla/5.0 (Linux; Android 14; CPH2447) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Mobile Safari/537.36", "Mozilla/5.0 (Linux; Android 14; SM-X710) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36", "Mozilla/5.0 (Linux; Android 13; M2102J20SG) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36", "Mozilla/5.0 (Linux; Android 14; SM-S928B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 SamsungBrowser/25.0", "Mozilla/5.0 (Android 14; Mobile; rv:128.0) Gecko/128.0 Firefox/128.0", "Mozilla/5.0 (Linux; Android 14; Pixel 7 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Mobile Safari/537.36 EdgA/127.0.2622.14");
    }

    public ppLkMjNhB() {
        new WeakReference(null);
    }

    public final WebView xxCvBnMs(Context context, String str) {
        iiOpQaSdF iiopqasdf;
        String str2;
        WebView webView;
        String str3;
        String str4;
        String string;
        String str5;
        String str6 = (str == null || str.isEmpty()) ? new String(this.f287243xxCvBnMs, StandardCharsets.UTF_8) : str;
        WebView webView2 = new WebView(context);
        WebSettings settings = webView2.getSettings();
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        Iterator it = Arrays.asList(g.a.f332842a, g.c.f332850a, "com.yandex.browser", g.b.f332846a, "com.microsoft.emmx", "com.opera.browser", "com.opera.touch", "com.opera.mini.native").iterator();
        while (true) {
            if (!it.hasNext()) {
                Log.w("WebEngine", "No prioritized browsers found on the device.");
                iiopqasdf = null;
                break;
            }
            String str7 = (String) it.next();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str7, i10);
                if (packageInfo != null && (str5 = packageInfo.versionName) != null) {
                    iiopqasdf = new iiOpQaSdF(str7, str5);
                    break;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i10 = 0;
            }
        }
        if (iiopqasdf != null) {
            String str8 = Build.VERSION.RELEASE;
            String str9 = Build.MODEL;
            str2 = str6;
            String str10 = iiopqasdf.f287238vvBnMaSd;
            String str11 = iiopqasdf.f287239xxCvBnMs;
            str11.getClass();
            if (str11.equals(g.a.f332842a)) {
                webView = webView2;
                str3 = "Mozilla/5.0 (Linux; Android " + str8 + "; " + str9 + ") AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + str10 + " Mobile Safari/537.36";
            } else if (str11.equals(g.b.f332846a)) {
                webView = webView2;
                if (str10 == null) {
                    str10 = "129.0";
                } else {
                    String[] strArrSplit = str10.split("\\.");
                    if (strArrSplit.length >= 2) {
                        str10 = strArrSplit[0] + "." + strArrSplit[1];
                    }
                }
                str3 = "Mozilla/5.0 (Android " + str8 + "; Mobile; rv:" + str10 + ") Gecko/" + str10 + " Firefox/" + str10;
            } else {
                if (str10 == null) {
                    str4 = "129";
                    webView = webView2;
                } else {
                    String[] strArrSplit2 = str10.split("\\.");
                    webView = webView2;
                    str4 = strArrSplit2.length > 0 ? strArrSplit2[0] : str10;
                }
                String str12 = str4 + ".0.0.0";
                if (g.c.f332850a.equals(iiopqasdf.f287239xxCvBnMs)) {
                    StringBuilder sb2 = new StringBuilder(" SamsungBrowser/");
                    if (str10 == null) {
                        str10 = "129.0";
                    } else {
                        String[] strArrSplit3 = str10.split("\\.");
                        if (strArrSplit3.length >= 2) {
                            str10 = strArrSplit3[0] + "." + strArrSplit3[1];
                        }
                    }
                    string = sb2.append(str10).toString();
                } else if ("com.microsoft.emmx".equals(iiopqasdf.f287239xxCvBnMs)) {
                    string = " EdgA/" + str10;
                } else if ("com.yandex.browser".equals(iiopqasdf.f287239xxCvBnMs)) {
                    string = " YaBrowser/" + str10;
                } else {
                    string = iiopqasdf.f287239xxCvBnMs.startsWith("com.opera") ? " OPR/" + str10 : "";
                }
                str3 = "Mozilla/5.0 (Linux; Android " + str8 + "; " + str9 + ") AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + str12 + " Mobile Safari/537.36" + string;
            }
        } else {
            str2 = str6;
            webView = webView2;
            Log.w("WebEngine", "No supported browser found, falling back to a random User-Agent from the static list.");
            Matcher matcher = Pattern.compile("Chrome/([0-9.]+)").matcher(WebSettings.getDefaultUserAgent(context));
            String strGroup = matcher.find() ? matcher.group(1) : "125.0.0.0";
            String str13 = Build.VERSION.RELEASE;
            String str14 = Build.MODEL;
            Log.w("WebEngine", "No supported browser found. Generating fallback UA from system WebView (Chrome/" + strGroup + ")");
            str3 = "Mozilla/5.0 (Linux; Android " + str13 + "; " + str14 + ") AppleWebKit/537.36 (KHTML, like Gecko) Chrome/" + strGroup + " Mobile Safari/537.36";
        }
        settings.setUserAgentString(str3);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        settings.setSupportMultipleWindows(false);
        CookieManager.getInstance().setAcceptCookie(true);
        final WebView webView3 = webView;
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView3, true);
        WebView.setWebContentsDebuggingEnabled(true);
        webView3.setWebViewClient(new vvBnMaSd(this));
        webView3.setWebChromeClient(new uuJkLzXcV());
        webView3.post(new Runnable() { // from class: iiOpQaSdF.ppLkMjNhB$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: iiOpQaSdF.ppLkMjNhB$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ppLkMjNhB.xxCvBnMs(webView);
                    }
                }, 5000L);
            }
        });
        webView3.loadUrl(str2);
        return webView3;
    }

    public static /* synthetic */ void xxCvBnMs(WebView webView) {
        if (webView.getWidth() <= 0 || webView.getHeight() <= 0) {
            Log.w("MyTestInfo", "Delayed click failed: WebView has zero dimensions.");
            return;
        }
        float width = webView.getWidth() / 2.0f;
        float height = webView.getHeight() / 2.0f;
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, width, height, 0);
        MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, jUptimeMillis + 100, 1, width, height, 0);
        webView.dispatchTouchEvent(motionEventObtain);
        webView.dispatchTouchEvent(motionEventObtain2);
        motionEventObtain.recycle();
        motionEventObtain2.recycle();
    }
}

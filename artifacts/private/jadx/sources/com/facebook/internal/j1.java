package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class j1 extends Dialog {
    private static final int X = 800;
    private static final int Y = 800;
    private static final int Z = 1280;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private static d f99902g3 = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f99904n = "FacebookSDK.WebDialog";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f99905o = "touch";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final double f99906p0 = 0.5d;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f99907p1 = -872415232;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static volatile int f99908p2 = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f99909s = "^/(v\\d+\\.\\d+/)??dialog/.*";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f99910t = 4201;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f99911v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f99912w = 480;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f99913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f99914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private e f99915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private WebView f99916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private ProgressDialog f99917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private ImageView f99918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private FrameLayout f99919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private f f99920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f99921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f99922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f99923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private WindowManager.LayoutParams f99924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final b f99903m = new b(null);
    private static final int H1 = l5.b.m.V5;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final int a() {
            f1 f1Var = f1.f99837a;
            f1.w();
            return j1.f99908p2;
        }

        @oj.n
        protected final void b(@Nullable Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && j1.f99908p2 == 0) {
                    f(applicationInfo.metaData.getInt(com.facebook.g0.B));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        @oj.n
        @NotNull
        public final j1 c(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i10, @Nullable e eVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            j1.v(context);
            boolean z10 = false;
            return new j1(context, str, bundle, i10, com.facebook.login.d0.FACEBOOK, eVar, null);
        }

        @oj.n
        @NotNull
        public final j1 d(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i10, @NotNull com.facebook.login.d0 targetApp, @Nullable e eVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            j1.v(context);
            return new j1(context, str, bundle, i10, targetApp, eVar, null);
        }

        @oj.n
        public final void e(@Nullable d dVar) {
            j1.f99902g3 = dVar;
        }

        @oj.n
        public final void f(int i10) {
            if (i10 == 0) {
                i10 = j1.H1;
            }
            j1.f99908p2 = i10;
        }

        private b() {
        }
    }

    private final class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f99932a;

        public c(j1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f99932a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView view, @NotNull String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!this.f99932a.f99922j && (progressDialog = this.f99932a.f99917e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f99932a.f99919g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webViewU = this.f99932a.u();
            if (webViewU != null) {
                webViewU.setVisibility(0);
            }
            ImageView imageView = this.f99932a.f99918f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f99932a.f99923k = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NotNull WebView view, @NotNull String url, @Nullable Bitmap bitmap) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            e1 e1Var = e1.f99794a;
            e1.g0(j1.f99904n, Intrinsics.stringPlus("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f99932a.f99922j || (progressDialog = this.f99932a.f99917e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView view, int i10, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f99932a.D(new com.facebook.s(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f99932a.D(new com.facebook.s(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
            int i10;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            e1 e1Var = e1.f99794a;
            e1.g0(j1.f99904n, Intrinsics.stringPlus("Redirect URL: ", url));
            Uri uri = Uri.parse(url);
            boolean z10 = uri.getPath() != null && Pattern.matches(j1.f99909s, uri.getPath());
            if (!StringsKt.u2(url, this.f99932a.f99914b, false, 2, null)) {
                if (StringsKt.u2(url, z0.S, false, 2, null)) {
                    this.f99932a.cancel();
                    return true;
                }
                if (!z10 && !StringsKt.V2(url, "touch", false, 2, null)) {
                    try {
                        this.f99932a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle bundleB = this.f99932a.B(url);
            String string = bundleB.getString("error");
            if (string == null) {
                string = bundleB.getString(w0.P0);
            }
            String string2 = bundleB.getString("error_msg");
            if (string2 == null) {
                string2 = bundleB.getString(com.facebook.internal.a.Y);
            }
            if (string2 == null) {
                string2 = bundleB.getString("error_description");
            }
            String string3 = bundleB.getString(w0.R0);
            if (string3 == null || e1.Z(string3)) {
                i10 = -1;
            } else {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
            }
            e1 e1Var2 = e1.f99794a;
            if (e1.Z(string) && e1.Z(string2) && i10 == -1) {
                this.f99932a.E(bundleB);
            } else if ((string == null || !(Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) && i10 != j1.f99910t) {
                this.f99932a.D(new com.facebook.j0(new FacebookRequestError(i10, string, string2), string2));
            } else {
                this.f99932a.cancel();
            }
            return true;
        }
    }

    public interface d {
        void a(@Nullable WebView webView);
    }

    public interface e {
        void a(@Nullable Bundle bundle, @Nullable com.facebook.u uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Bundle f99934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Exception[] f99935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j1 f99936d;

        public f(@NotNull j1 this$0, @NotNull String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f99936d = this$0;
            this.f99933a = action;
            this.f99934b = parameters;
            this.f99935c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(String[] results, int i10, f this$0, CountDownLatch latch, com.facebook.q0 response) {
            Intrinsics.checkNotNullParameter(results, "$results");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latch, "$latch");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                FacebookRequestError facebookRequestErrorG = response.g();
                String str = "Error staging photo.";
                if (facebookRequestErrorG != null) {
                    String strI = facebookRequestErrorG.i();
                    if (strI != null) {
                        str = strI;
                    }
                    throw new com.facebook.v(response, str);
                }
                JSONObject jSONObjectI = response.i();
                if (jSONObjectI == null) {
                    throw new com.facebook.u("Error staging photo.");
                }
                String strOptString = jSONObjectI.optString("uri");
                if (strOptString == null) {
                    throw new com.facebook.u("Error staging photo.");
                }
                results[i10] = strOptString;
                latch.countDown();
            } catch (Exception e10) {
                this$0.f99935c[i10] = e10;
            }
        }

        @Nullable
        protected String[] b(@NotNull Void... p10) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter(p10, "p0");
                    String[] stringArray = this.f99934b.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.f99935c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    AccessToken accessTokenI = AccessToken.f98366l.i();
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            final int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (isCancelled()) {
                                    Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((com.facebook.o0) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                Uri uri = Uri.parse(stringArray[i10]);
                                e1 e1Var = e1.f99794a;
                                if (e1.b0(uri)) {
                                    strArr[i10] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.internal.k1
                                        @Override // com.facebook.GraphRequest.b
                                        public final void a(com.facebook.q0 q0Var) {
                                            j1.f.c(strArr, i10, this, countDownLatch, q0Var);
                                        }
                                    };
                                    com.facebook.share.internal.k kVar = com.facebook.share.internal.k.f101889a;
                                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                    concurrentLinkedQueue.add(com.facebook.share.internal.k.B(accessTokenI, uri, bVar).n());
                                }
                                if (i11 <= length) {
                                    i10 = i11;
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((com.facebook.o0) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
                return null;
            }
        }

        protected void d(@Nullable String[] strArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.f99936d.f99917e;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    Exception[] excArr = this.f99935c;
                    int length = excArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        Exception exc = excArr[i10];
                        i10++;
                        if (exc != null) {
                            this.f99936d.D(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f99936d.D(new com.facebook.u("Failed to stage photos for web dialog"));
                        return;
                    }
                    List listAsList = ArraysKt.asList(strArr);
                    if (listAsList.contains(null)) {
                        this.f99936d.D(new com.facebook.u("Failed to stage photos for web dialog"));
                        return;
                    }
                    e1 e1Var = e1.f99794a;
                    e1.n0(this.f99934b, "media", new JSONArray((Collection) listAsList));
                    z0 z0Var = z0.f100267a;
                    String strB = z0.b();
                    StringBuilder sb2 = new StringBuilder();
                    com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                    sb2.append(com.facebook.g0.B());
                    sb2.append("/dialog/");
                    sb2.append(this.f99933a);
                    Uri uriG = e1.g(strB, sb2.toString(), this.f99934b);
                    this.f99936d.f99913a = uriG.toString();
                    ImageView imageView = this.f99936d.f99918f;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.f99936d.I((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String[]] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return null;
                }
                try {
                    this = b(voidArr);
                    return this;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                        try {
                            d(strArr);
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.b.c(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.b.c(th3, this);
                }
            }
        }
    }

    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99937a;

        static {
            int[] iArr = new int[com.facebook.login.d0.valuesCustom().length];
            iArr[com.facebook.login.d0.INSTAGRAM.ordinal()] = 1;
            f99937a = iArr;
        }
    }

    public static final class h extends WebView {
        h(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    public /* synthetic */ j1(Context context, String str, Bundle bundle, int i10, com.facebook.login.d0 d0Var, e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i10, d0Var, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(j1 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    @oj.n
    public static final void G(@Nullable d dVar) {
        f99903m.e(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"SetJavaScriptEnabled"})
    public final void I(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f99916d = new h(getContext());
        d dVar = f99902g3;
        if (dVar != null) {
            dVar.a(u());
        }
        WebView webView = this.f99916d;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.f99916d;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.f99916d;
        if (webView3 != null) {
            webView3.setWebViewClient(new c(this));
        }
        WebView webView4 = this.f99916d;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.f99916d;
        if (webView5 != null) {
            String str = this.f99913a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.f99916d;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.f99916d;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.f99916d;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.f99916d;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.f99916d;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.f99916d;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.f99916d;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.g1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return j1.J(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f99916d);
        linearLayout.setBackgroundColor(f99907p1);
        FrameLayout frameLayout = this.f99919g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @oj.n
    public static final void K(int i10) {
        f99903m.f(i10);
    }

    private final void p() {
        ImageView imageView = new ImageView(getContext());
        this.f99918f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j1.q(this.f99884a, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(l5.b.g.L0);
        ImageView imageView2 = this.f99918f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f99918f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(j1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    private final int s(int i10, float f10, int i11, int i12) {
        double d10;
        int i13 = (int) (i10 / f10);
        if (i13 <= i11) {
            d10 = 1.0d;
        } else {
            d10 = i13 >= i12 ? 0.5d : ((((double) (i12 - i13)) / ((double) (i12 - i11))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i10) * d10);
    }

    @oj.n
    public static final int t() {
        return f99903m.a();
    }

    @oj.n
    protected static final void v(@Nullable Context context) {
        f99903m.b(context);
    }

    @oj.n
    @NotNull
    public static final j1 y(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i10, @Nullable e eVar) {
        return f99903m.c(context, str, bundle, i10, eVar);
    }

    @oj.n
    @NotNull
    public static final j1 z(@NotNull Context context, @Nullable String str, @Nullable Bundle bundle, int i10, @NotNull com.facebook.login.d0 d0Var, @Nullable e eVar) {
        return f99903m.d(context, str, bundle, i10, d0Var, eVar);
    }

    @androidx.annotation.l1(otherwise = 4)
    @NotNull
    public Bundle B(@Nullable String str) {
        Uri uri = Uri.parse(str);
        e1 e1Var = e1.f99794a;
        Bundle bundleL0 = e1.l0(uri.getQuery());
        bundleL0.putAll(e1.l0(uri.getFragment()));
        return bundleL0;
    }

    public final void C() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int iMin = Math.min(s(i12, displayMetrics.density, f99912w, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(s(i10, displayMetrics.density, 800, Z), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(iMin, iMin2);
    }

    protected final void D(@Nullable Throwable th2) {
        if (this.f99915c != null && !this.f99921i) {
            this.f99921i = true;
            com.facebook.u uVar = th2 instanceof com.facebook.u ? (com.facebook.u) th2 : new com.facebook.u(th2);
            e eVar = this.f99915c;
            if (eVar != null) {
                eVar.a(null, uVar);
            }
            dismiss();
        }
    }

    protected final void E(@Nullable Bundle bundle) {
        e eVar = this.f99915c;
        if (eVar == null || this.f99921i) {
            return;
        }
        this.f99921i = true;
        if (eVar != null) {
            eVar.a(bundle, null);
        }
        dismiss();
    }

    protected final void F(@NotNull String expectedRedirectUrl) {
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.f99914b = expectedRedirectUrl;
    }

    public final void H(@Nullable e eVar) {
        this.f99915c = eVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f99915c != null && !this.f99921i) {
            D(new com.facebook.w());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f99916d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f99922j && (progressDialog = this.f99917e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f99922j = false;
        e1 e1Var = e1.f99794a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (e1.k0(context) && (layoutParams = this.f99924l) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f99924l;
                e1.g0(f99904n, Intrinsics.stringPlus("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f99917e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f99917e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(l5.b.l.H));
        }
        ProgressDialog progressDialog3 = this.f99917e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f99917e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.i1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    j1.A(this.f99889a, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f99919g = new FrameLayout(getContext());
        C();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        p();
        if (this.f99913a != null) {
            ImageView imageView = this.f99918f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            I((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f99919g;
        if (frameLayout != null) {
            frameLayout.addView(this.f99918f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f99919g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f99922j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 == 4) {
            WebView webView = this.f99916d;
            if (webView != null) {
                if (Intrinsics.areEqual(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f99916d;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        f fVar = this.f99920h;
        if (fVar != null) {
            if ((fVar == null ? null : fVar.getStatus()) == AsyncTask.Status.PENDING) {
                f fVar2 = this.f99920h;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f99917e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        C();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        f fVar = this.f99920h;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.f99917e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(@NotNull WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f99924l = params;
        }
        super.onWindowAttributesChanged(params);
    }

    @Nullable
    public final e r() {
        return this.f99915c;
    }

    @Nullable
    protected final WebView u() {
        return this.f99916d;
    }

    protected final boolean w() {
        return this.f99921i;
    }

    protected final boolean x() {
        return this.f99923k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected j1(@NotNull Context context, @NotNull String url) {
        this(context, url, f99903m.a());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    private j1(Context context, String str, int i10) {
        super(context, i10 == 0 ? f99903m.a() : i10);
        this.f99914b = z0.Q;
        this.f99913a = str;
    }

    private j1(Context context, String str, Bundle bundle, int i10, com.facebook.login.d0 d0Var, e eVar) {
        Uri uriG;
        super(context, i10 == 0 ? f99903m.a() : i10);
        String str2 = z0.Q;
        this.f99914b = z0.Q;
        bundle = bundle == null ? new Bundle() : bundle;
        e1 e1Var = e1.f99794a;
        str2 = e1.T(context) ? z0.R : str2;
        this.f99914b = str2;
        bundle.putString(z0.f100292w, str2);
        bundle.putString("display", "touch");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        bundle.putString("client_id", com.facebook.g0.o());
        q1 q1Var = q1.f312784a;
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{com.facebook.g0.I()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.f99915c = eVar;
        if (Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.f99920h = new f(this, str, bundle);
            return;
        }
        if (g.f99937a[d0Var.ordinal()] == 1) {
            z0 z0Var = z0.f100267a;
            uriG = e1.g(z0.k(), z0.f100268a0, bundle);
        } else {
            z0 z0Var2 = z0.f100267a;
            uriG = e1.g(z0.b(), com.facebook.g0.B() + "/dialog/" + ((Object) str), bundle);
        }
        this.f99913a = uriG.toString();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Context f99925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f99926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f99927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f99928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private e f99929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Bundle f99930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private AccessToken f99931g;

        public a(@NotNull Context context, @NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            AccessToken.d dVar = AccessToken.f98366l;
            this.f99931g = dVar.i();
            if (!dVar.k()) {
                e1 e1Var = e1.f99794a;
                String strF = e1.F(context);
                if (strF == null) {
                    throw new com.facebook.u("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f99926b = strF;
            }
            b(context, action, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.f99925a = context;
            this.f99927c = str;
            if (bundle != null) {
                this.f99930f = bundle;
            } else {
                this.f99930f = new Bundle();
            }
        }

        @Nullable
        public j1 a() {
            AccessToken accessToken = this.f99931g;
            if (accessToken != null) {
                Bundle bundle = this.f99930f;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken == null ? null : accessToken.i());
                }
                Bundle bundle2 = this.f99930f;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.f99931g;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.t() : null);
                }
            } else {
                Bundle bundle3 = this.f99930f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f99926b);
                }
            }
            b bVar = j1.f99903m;
            Context context = this.f99925a;
            if (context != null) {
                return bVar.c(context, this.f99927c, this.f99930f, this.f99928d, this.f99929e);
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Nullable
        public final String c() {
            return this.f99926b;
        }

        @Nullable
        public final Context d() {
            return this.f99925a;
        }

        @Nullable
        public final e e() {
            return this.f99929e;
        }

        @Nullable
        public final Bundle f() {
            return this.f99930f;
        }

        public final int g() {
            return this.f99928d;
        }

        @NotNull
        public final a h(@Nullable e eVar) {
            this.f99929e = eVar;
            return this;
        }

        @NotNull
        public final a i(int i10) {
            this.f99928d = i10;
            return this;
        }

        public a(@NotNull Context context, @Nullable String str, @NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            if (str == null) {
                e1 e1Var = e1.f99794a;
                str = e1.F(context);
            }
            f1 f1Var = f1.f99837a;
            this.f99926b = f1.t(str, "applicationId");
            b(context, action, bundle);
        }
    }
}

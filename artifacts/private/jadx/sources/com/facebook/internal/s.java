package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends j1 {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    public static final a f100066i3 = new a(null);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f100067j3 = s.class.getName();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f100068k3 = 1500;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f100069h3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final s a(@NotNull Context context, @NotNull String url, @NotNull String expectedRedirectUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            j1.b bVar = j1.f99903m;
            j1.v(context);
            return new s(context, url, expectedRedirectUrl, null);
        }

        private a() {
        }
    }

    public /* synthetic */ s(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(s this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @oj.n
    @NotNull
    public static final s N(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return f100066i3.a(context, str, str2);
    }

    @Override // com.facebook.internal.j1
    @NotNull
    public Bundle B(@Nullable String str) {
        Uri uri = Uri.parse(str);
        e1 e1Var = e1.f99794a;
        Bundle bundleL0 = e1.l0(uri.getQuery());
        String string = bundleL0.getString(z0.U);
        bundleL0.remove(z0.U);
        if (!e1.Z(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                e eVar = e.f99792a;
                bundleL0.putBundle(w0.L, e.a(jSONObject));
            } catch (JSONException e10) {
                e1 e1Var2 = e1.f99794a;
                e1.h0(f100067j3, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = bundleL0.getString(z0.X);
        bundleL0.remove(z0.X);
        e1 e1Var3 = e1.f99794a;
        if (!e1.Z(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                e eVar2 = e.f99792a;
                bundleL0.putBundle(w0.N, e.a(jSONObject2));
            } catch (JSONException e11) {
                e1 e1Var4 = e1.f99794a;
                e1.h0(f100067j3, "Unable to parse bridge_args JSON", e11);
            }
        }
        bundleL0.remove("version");
        w0 w0Var = w0.f100148a;
        bundleL0.putInt(w0.H, w0.y());
        return bundleL0;
    }

    @Override // com.facebook.internal.j1, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewU = u();
        if (!x() || w() || webViewU == null || !webViewU.isShown()) {
            super.cancel();
        } else {
            if (this.f100069h3) {
                return;
            }
            this.f100069h3 = true;
            webViewU.loadUrl(Intrinsics.stringPlus("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.M(this.f100063a);
                }
            }, 1500L);
        }
    }

    private s(Context context, String str, String str2) {
        super(context, str);
        F(str2);
    }
}

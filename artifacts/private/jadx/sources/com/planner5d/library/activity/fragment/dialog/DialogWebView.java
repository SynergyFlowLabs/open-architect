package com.planner5d.library.activity.fragment.dialog;

import android.R;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.l(message = "Not reliable. Has wrong statusbar (ANDR-4125), sometimes loads nothing and displays white content.")
public final class DialogWebView extends Dialog implements l0 {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b b(DialogWebView dialogWebView) {
            Serializable serializableS = new com.planner5d.library.services.utility.j(dialogWebView.getArguments()).s(com.planner5d.library.services.r.data, null);
            if (serializableS instanceof b) {
                return (b) serializableS;
            }
            return null;
        }

        public static /* synthetic */ void d(a aVar, String str, d dVar, c cVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            aVar.c(str, dVar, cVar);
        }

        public final void c(@NotNull String url, @Nullable d dVar, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(url, "url");
            com.planner5d.library.view.application.c.f244830b.a().i().c(DialogWebView.class).i(new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.data, new b(url, dVar, cVar))).g();
        }

        private a() {
        }
    }

    private static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f131620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final d f131621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final c f131622c;

        public b(@NotNull String url, @Nullable d dVar, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f131620a = url;
            this.f131621b = dVar;
            this.f131622c = cVar;
        }

        @Nullable
        public final c a() {
            return this.f131622c;
        }

        @NotNull
        public final String b() {
            return this.f131620a;
        }

        @Nullable
        public final d c() {
            return this.f131621b;
        }
    }

    public interface c extends Serializable {
        void t3(@NotNull DialogWebView dialogWebView);
    }

    public interface d extends Serializable {
        void f2(@NotNull DialogWebView dialogWebView, @NotNull String str);
    }

    public static final class e extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f131623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DialogWebView f131624b;

        e(b bVar, DialogWebView dialogWebView) {
            this.f131623a = bVar;
            this.f131624b = dialogWebView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String url, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(url, "url");
            d dVarC = this.f131623a.c();
            if (dVarC != null) {
                dVarC.f2(this.f131624b, url);
            }
            super.onPageStarted(webView, url, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (i10 == -11) {
                this.f131624b.dismiss();
                c cVarA = this.f131623a.a();
                if (cVarA != null) {
                    cVarA.t3(this.f131624b);
                }
            }
        }
    }

    private final void E(WebView webView) {
        b bVarB = Companion.b(this);
        if (bVarB == null) {
            com.planner5d.library.view.application.c.f244830b.a().l().b("missing_payload_in_dialog_web_view", null, null);
            dismiss();
        } else {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new e(bVarB, this));
            webView.loadUrl(bVarB.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DialogWebView dialogWebView, View view) {
        dialogWebView.dismiss();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Light.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        se.a aVarD = se.a.d(inflater, viewGroup, false);
        aVarD.f375986b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogWebView.F(this.f132173a, view);
            }
        });
        WebView webView = aVarD.f375989e;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        E(webView);
        ConstraintLayout constraintLayoutB = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }
}

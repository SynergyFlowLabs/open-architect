package com.planner5d.library.activity.fragment.feed;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.statistics.events.q3;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.VerticalScrollRangeWebView;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedArticleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedArticleFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedArticleFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n299#2,2:231\n257#2,2:233\n257#2,2:235\n67#2,4:238\n37#2,2:242\n55#2:244\n72#2:245\n1#3:237\n*S KotlinDebug\n*F\n+ 1 FeedArticleFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedArticleFragment\n*L\n92#1:231,2\n93#1:233,2\n94#1:235,2\n220#1:238,4\n220#1:242,2\n220#1:244\n220#1:245\n*E\n"})
public final class FeedArticleFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.application.b application;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.databinding.s0 f133158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f133160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private jc.b f133161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b<q3.d> f133163j;

    @ij.a
    public c2 networkStateUtility;

    @ij.a
    public p5 uriViewer;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 FeedArticleFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedArticleFragment\n*L\n1#1,52:1\n70#2:53\n221#3,2:54\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.y0 f133164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f133165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f133166c;

        public a(com.planner5d.library.model.manager.y0 y0Var, String str, com.planner5d.library.services.bitmaploader.target.a aVar) {
            this.f133164a = y0Var;
            this.f133165b = str;
            this.f133166c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f133164a.b(this.f133165b, view.getWidth(), view.getHeight(), this.f133166c, 5L);
        }
    }

    @SourceDebugExtension({"SMAP\nFeedArticleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedArticleFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedArticleFragment$setUpWebView$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,230:1\n1#2:231\n255#3:232\n299#3,2:233\n299#3,2:235\n*S KotlinDebug\n*F\n+ 1 FeedArticleFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedArticleFragment$setUpWebView$1$1\n*L\n149#1:232\n150#1:233,2\n151#1:235,2\n*E\n"})
    public static final class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ VerticalScrollRangeWebView f133167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f133168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedArticleFragment f133169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.databinding.s0 f133170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f133171e;

        b(VerticalScrollRangeWebView verticalScrollRangeWebView, String str, FeedArticleFragment feedArticleFragment, com.planner5d.library.databinding.s0 s0Var, ImageView imageView) {
            this.f133167a = verticalScrollRangeWebView;
            this.f133168b = str;
            this.f133169c = feedArticleFragment;
            this.f133170d = s0Var;
            this.f133171e = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(VerticalScrollRangeWebView verticalScrollRangeWebView, com.planner5d.library.databinding.s0 s0Var) {
            Intrinsics.checkNotNull(verticalScrollRangeWebView);
            if (verticalScrollRangeWebView.getVisibility() == 0) {
                ProgressBar progress = s0Var.f159624f;
                Intrinsics.checkNotNullExpressionValue(progress, "progress");
                progress.setVisibility(8);
                View progressBlocker = s0Var.f159625g;
                Intrinsics.checkNotNullExpressionValue(progressBlocker, "progressBlocker");
                progressBlocker.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(FeedArticleFragment feedArticleFragment, ImageView imageView) {
            feedArticleFragment.J(false);
            feedArticleFragment.C(imageView);
            return Unit.f312394a;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.f133167a.loadUrl(this.f133168b);
            final VerticalScrollRangeWebView verticalScrollRangeWebView = this.f133167a;
            final com.planner5d.library.databinding.s0 s0Var = this.f133170d;
            verticalScrollRangeWebView.postDelayed(new Runnable() { // from class: com.planner5d.library.activity.fragment.feed.p
                @Override // java.lang.Runnable
                public final void run() {
                    FeedArticleFragment.b.c(verticalScrollRangeWebView, s0Var);
                }
            }, 200L);
            this.f133169c.G();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String string;
            String strValueOf;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f133167a.loadUrl("about:blank");
                this.f133169c.J(true);
                TextView textView = this.f133170d.f159623e;
                if (this.f133169c.getNetworkStateUtility().d(this.f133169c.getApplication())) {
                    string = this.f133169c.getApplication().getString(com.planner5d.library.f.s.I9, "");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    if (string.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        char cCharAt = string.charAt(0);
                        if (Character.isLowerCase(cCharAt)) {
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            strValueOf = CharsKt.u(cCharAt, locale);
                        } else {
                            strValueOf = String.valueOf(cCharAt);
                        }
                        sb2.append((Object) strValueOf);
                        String strSubstring = string.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        string = sb2.toString();
                    }
                } else {
                    string = this.f133169c.getApplication().getString(com.planner5d.library.f.s.K9);
                    Intrinsics.checkNotNull(string);
                }
                textView.setText(string);
                com.planner5d.library.services.network.b bVarB = this.f133169c.B();
                final FeedArticleFragment feedArticleFragment = this.f133169c;
                final ImageView imageView = this.f133171e;
                bVarB.f(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FeedArticleFragment.b.d(feedArticleFragment, imageView);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String scheme;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (scheme = url.getScheme()) != null) {
                FeedArticleFragment feedArticleFragment = this.f133169c;
                if (StringsKt.u2(scheme, "http", false, 2, null) || StringsKt.u2(scheme, "ftp", false, 2, null)) {
                    feedArticleFragment.getUriViewer().a(feedArticleFragment.getActivity(), webResourceRequest.getUrl().toString());
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public FeedArticleFragment() {
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f133159f = hVarA;
        this.f133162i = com.planner5d.library.services.network.f.f224463a.f(this);
        this.f133163j = new com.planner5d.library.model.manager.statistics.b<>(q3.d.unknown);
        com.planner5d.library.application.b.f142455c.a().P0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.services.network.b B() {
        return (com.planner5d.library.services.network.b) this.f133162i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(ImageView imageView) {
        new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.databinding.s0 s0Var = this.f133158e;
        jc.b bVar = null;
        if (s0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s0Var = null;
        }
        com.planner5d.library.model.manager.y0 y0VarI = com.planner5d.library.application.b.f142455c.a().I();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f133159f;
        jc.b bVar2 = this.f133161h;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
            bVar2 = null;
        }
        this.f133160g = F(y0VarI, hVar, imageView, bVar2.d());
        jc.b bVar3 = this.f133161h;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
        } else {
            bVar = bVar3;
        }
        String strB = bVar.b();
        if (strB != null) {
            s0Var.f159626h.loadUrl(strB);
        }
        s0Var.f159620b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedArticleFragment.D(this.f133532a, view);
            }
        });
        s0Var.f159621c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedArticleFragment.E(this.f133533a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(FeedArticleFragment feedArticleFragment, View view) {
        com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
        q3.a aVar = q3.a.back;
        jc.b bVar = feedArticleFragment.f133161h;
        jc.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
            bVar = null;
        }
        q3.b bVarA0 = a1Var.A0(bVar.a());
        jc.b bVar3 = feedArticleFragment.f133161h;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
        } else {
            bVar2 = bVar3;
        }
        int i10 = 2 ^ 0;
        a1Var.d1(aVar, bVarA0, bVar2.c(), (q3.d) feedArticleFragment.f133163j.a(), null);
        feedArticleFragment.f131538b.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(FeedArticleFragment feedArticleFragment, View view) {
        com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
        q3.a aVar = q3.a.click_share;
        jc.b bVar = feedArticleFragment.f133161h;
        jc.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
            bVar = null;
        }
        q3.b bVarA0 = a1Var.A0(bVar.a());
        jc.b bVar3 = feedArticleFragment.f133161h;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
            bVar3 = null;
        }
        q3.c.a(a1Var, aVar, bVarA0, bVar3.c(), (q3.d) feedArticleFragment.f133163j.a(), null, 16, null);
        Context contextRequireContext = feedArticleFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        jc.b bVar4 = feedArticleFragment.f133161h;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogData");
        } else {
            bVar2 = bVar4;
        }
        new com.planner5d.library.services.f0(contextRequireContext, bVar2, (q3.d) feedArticleFragment.f133163j.a()).a(feedArticleFragment.getActivity());
    }

    private final com.planner5d.library.services.bitmaploader.target.a F(com.planner5d.library.model.manager.y0 y0Var, com.planner5d.library.services.bitmaploader.target.h hVar, ImageView imageView, String str) {
        com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(com.planner5d.library.widget.bitmaptarget.a.g(imageView, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width != 0 && height != 0) {
            Intrinsics.checkNotNull(y0Var.b(str, width, height, aVarC, 5L));
        } else if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new a(y0Var, str, aVarC));
        } else {
            y0Var.b(str, imageView.getWidth(), imageView.getHeight(), aVarC, 5L);
        }
        Intrinsics.checkNotNull(aVarC);
        return aVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.databinding.s0 G() {
        final com.planner5d.library.databinding.s0 s0Var = this.f133158e;
        if (s0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s0Var = null;
        }
        s0Var.f159626h.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.planner5d.library.activity.fragment.feed.l
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                FeedArticleFragment.H(s0Var, this, view, i10, i11, i12, i13);
            }
        });
        return s0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(com.planner5d.library.databinding.s0 s0Var, FeedArticleFragment feedArticleFragment, View view, int i10, int i11, int i12, int i13) {
        if (i11 == s0Var.f159626h.getVerticalScrollRange() - s0Var.f159626h.getBottom()) {
            jc.b bVar = null;
            s0Var.f159626h.setOnScrollChangeListener(null);
            com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
            q3.a aVar = q3.a.open;
            jc.b bVar2 = feedArticleFragment.f133161h;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("blogData");
                bVar2 = null;
            }
            q3.b bVarA0 = a1Var.A0(bVar2.a());
            jc.b bVar3 = feedArticleFragment.f133161h;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("blogData");
            } else {
                bVar = bVar3;
            }
            q3.c.a(a1Var, aVar, bVarA0, bVar.c(), q3.d.also_read, null, 16, null);
        }
    }

    @e.a({"SetJavaScriptEnabled"})
    private final void I(com.planner5d.library.databinding.s0 s0Var, ImageView imageView) {
        VerticalScrollRangeWebView verticalScrollRangeWebView = s0Var.f159626h;
        verticalScrollRangeWebView.getSettings().setJavaScriptEnabled(true);
        verticalScrollRangeWebView.addView(imageView, 0);
        verticalScrollRangeWebView.setWebViewClient(new b(verticalScrollRangeWebView, StringsKt.p("javascript:(function() {     \n\t\t        var node = document.createElement('style');\t\t\n\t\t        node.type = 'text/css';\n\t\t        node.innerHTML = 'body {\n\t\t\t\t\t\t\tpadding-top: " + ((int) (verticalScrollRangeWebView.getResources().getDimension(com.planner5d.library.f.g.f167320v3) / verticalScrollRangeWebView.getResources().getDisplayMetrics().density)) + "px;\n\t\t        }';\n\t\t        document.head.appendChild(node);\n\t\t      })()"), this, s0Var, imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z10) {
        com.planner5d.library.databinding.s0 s0Var = this.f133158e;
        if (s0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s0Var = null;
        }
        ProgressBar progress = s0Var.f159624f;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(z10 ? 8 : 0);
        TextView errorTitle = s0Var.f159623e;
        Intrinsics.checkNotNullExpressionValue(errorTitle, "errorTitle");
        errorTitle.setVisibility(z10 ? 0 : 8);
        TextView errorDetails = s0Var.f159622d;
        Intrinsics.checkNotNullExpressionValue(errorDetails, "errorDetails");
        errorDetails.setVisibility(z10 ? 0 : 8);
    }

    @NotNull
    public final com.planner5d.library.application.b getApplication() {
        com.planner5d.library.application.b bVar = this.application;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    @NotNull
    public final c2 getNetworkStateUtility() {
        c2 c2Var = this.networkStateUtility;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkStateUtility");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).N(false).A(R.color.transparent).H(true).F(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @NotNull
    public final p5 getUriViewer() {
        p5 p5Var = this.uriViewer;
        if (p5Var != null) {
            return p5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uriViewer");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public /* synthetic */ View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f133163j.b(bundle, getArguments());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f133161h = new jc.b(arguments);
        com.planner5d.library.databinding.s0 s0VarD = com.planner5d.library.databinding.s0.d(inflater, viewGroup, false);
        this.f133158e = s0VarD;
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, imageView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167320v3)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Intrinsics.checkNotNull(s0VarD);
        I(s0VarD, imageView);
        C(imageView);
        com.planner5d.library.databinding.s0 s0Var = this.f133158e;
        if (s0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            s0Var = null;
        }
        ConstraintLayout root = s0Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.planner5d.library.databinding.s0 s0Var = this.f133158e;
        if (s0Var != null) {
            if (s0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                s0Var = null;
            }
            VerticalScrollRangeWebView verticalScrollRangeWebView = s0Var.f159626h;
            verticalScrollRangeWebView.setOnScrollChangeListener(null);
            verticalScrollRangeWebView.removeAllViews();
            verticalScrollRangeWebView.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f133163j.c(outState);
        super.onSaveInstanceState(outState);
    }

    public final void setApplication(@NotNull com.planner5d.library.application.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.application = bVar;
    }

    public final void setNetworkStateUtility(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.networkStateUtility = c2Var;
    }

    public final void setUriViewer(@NotNull p5 p5Var) {
        Intrinsics.checkNotNullParameter(p5Var, "<set-?>");
        this.uriViewer = p5Var;
    }
}

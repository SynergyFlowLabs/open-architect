package com.superwall.sdk.paywall.view.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.superwall.sdk.models.paywall.PaywallWebviewUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nWebviewFallbackClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,232:1\n1#2:233\n1734#3,3:234\n774#3:237\n865#3,2:238\n230#4,5:240\n230#4,5:245\n*S KotlinDebug\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient\n*L\n105#1:234,3\n108#1:237\n108#1:238,2\n159#1:240,5\n227#1:245,5\n*E\n"})
public final class WebviewFallbackClient extends DefaultWebviewClient {

    @NotNull
    private final PaywallWebviewUrl.Config config;
    private int failureCount;

    @NotNull
    private final s0 ioScope;

    @NotNull
    private final Function1<PaywallWebviewUrl, Unit> loadUrl;

    @NotNull
    private final s0 mainScope;

    @NotNull
    private final Function1<RenderProcessGoneDetail, Unit> onCrashed;

    @NotNull
    private final Function0<Unit> stopLoading;

    @NotNull
    private final k0<UrlState> timeoutFlow;

    @NotNull
    private final Set<PaywallWebviewUrl> untriedUrls;

    @NotNull
    private final List<PaywallWebviewUrl> urls;

    private static final class MaxAttemptsReachedException extends Exception {
        public MaxAttemptsReachedException() {
            super("Max attempts reached");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface UrlState {

        public static final class Loading implements UrlState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }
        }

        public static final class None implements UrlState {

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
            }
        }

        public static final class PageError implements UrlState {

            @NotNull
            public static final PageError INSTANCE = new PageError();

            private PageError() {
            }
        }

        public static final class PageStarted implements UrlState {

            @NotNull
            public static final PageStarted INSTANCE = new PageStarted();

            private PageStarted() {
            }
        }

        public static final class Timeout implements UrlState {

            @NotNull
            public static final Timeout INSTANCE = new Timeout();

            private Timeout() {
            }
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onLoadResource$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onLoadResource$1", f = "WebviewFallbackClient.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return WebviewFallbackClient.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (Intrinsics.areEqual(WebviewFallbackClient.this.timeoutFlow.getValue(), UrlState.Loading.INSTANCE)) {
                    k0 k0Var = WebviewFallbackClient.this.timeoutFlow;
                    UrlState.PageStarted pageStarted = UrlState.PageStarted.INSTANCE;
                    this.label = 1;
                    if (k0Var.emit(pageStarted, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1", f = "WebviewFallbackClient.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWebviewFallbackClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient$onPageStarted$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,232:1\n230#2,5:233\n230#2,5:238\n*S KotlinDebug\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient$onPageStarted$1\n*L\n71#1:233,5\n80#1:238,5\n*E\n"})
    static final class C27191 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ long $timeoutForUrl;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$2, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$2", f = "WebviewFallbackClient.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super UrlState>, Object> {
            int label;
            final /* synthetic */ WebviewFallbackClient this$0;

            /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$2$1, reason: invalid class name and collision with other inner class name */
            @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$2$1", f = "WebviewFallbackClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C18861 extends o implements Function2<UrlState, kotlin.coroutines.d<? super Boolean>, Object> {
                /* synthetic */ Object L$0;
                int label;

                C18861(kotlin.coroutines.d<? super C18861> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C18861 c18861 = new C18861(dVar);
                    c18861.L$0 = obj;
                    return c18861;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UrlState urlState, kotlin.coroutines.d<? super Boolean> dVar) {
                    return ((C18861) create(urlState, dVar)).invokeSuspend(Unit.f312394a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    UrlState urlState = (UrlState) this.L$0;
                    return kotlin.coroutines.jvm.internal.b.a((urlState instanceof UrlState.PageStarted) || (urlState instanceof UrlState.PageError));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WebviewFallbackClient webviewFallbackClient, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = webviewFallbackClient;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass2(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                k0 k0Var = this.this$0.timeoutFlow;
                C18861 c18861 = new C18861(null);
                this.label = 1;
                Object objX0 = k.x0(k0Var, c18861, this);
                return objX0 == objL ? objL : objX0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super UrlState> dVar) {
                return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$3, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$onPageStarted$1$3", f = "WebviewFallbackClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ WebviewFallbackClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(WebviewFallbackClient webviewFallbackClient, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.this$0 = webviewFallbackClient;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass3(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.this$0.stopLoading.invoke();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27191(long j10, kotlin.coroutines.d<? super C27191> dVar) {
            super(2, dVar);
            this.$timeoutForUrl = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return WebviewFallbackClient.this.new C27191(this.$timeoutForUrl, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k0 k0Var = WebviewFallbackClient.this.timeoutFlow;
                    do {
                        value2 = k0Var.getValue();
                    } while (!k0Var.compareAndSet(value2, UrlState.Loading.INSTANCE));
                    long j10 = this.$timeoutForUrl;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(WebviewFallbackClient.this, null);
                    this.label = 1;
                    Object objC = b4.c(j10, anonymousClass2, this);
                    this = objC;
                    if (objC == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this = this;
                }
            } catch (z3 unused) {
                kotlinx.coroutines.k.f(WebviewFallbackClient.this.mainScope, null, null, new AnonymousClass3(WebviewFallbackClient.this, null), 3, null);
                k0 k0Var2 = WebviewFallbackClient.this.timeoutFlow;
                do {
                    value = k0Var2.getValue();
                } while (!k0Var2.compareAndSet(value, UrlState.Timeout.INSTANCE));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27191) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebviewFallbackClient(@NotNull PaywallWebviewUrl.Config config, @NotNull s0 ioScope, @NotNull s0 mainScope, @NotNull Function1<? super PaywallWebviewUrl, Unit> loadUrl, @NotNull Function0<Unit> stopLoading, @NotNull Function1<? super RenderProcessGoneDetail, Unit> onCrashed) {
        super("", ioScope, onCrashed);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
        Intrinsics.checkNotNullParameter(stopLoading, "stopLoading");
        Intrinsics.checkNotNullParameter(onCrashed, "onCrashed");
        this.config = config;
        this.ioScope = ioScope;
        this.mainScope = mainScope;
        this.loadUrl = loadUrl;
        this.stopLoading = stopLoading;
        this.onCrashed = onCrashed;
        List<PaywallWebviewUrl> endpoints = config.getEndpoints();
        this.urls = endpoints;
        this.untriedUrls = CollectionsKt.toMutableSet(endpoints);
        this.timeoutFlow = b1.a(UrlState.None.INSTANCE);
    }

    private final PaywallWebviewUrl evaluateNext(int i10, Collection<PaywallWebviewUrl> collection, int i11) {
        while (true) {
            Collection<PaywallWebviewUrl> collection2 = collection;
            PaywallWebviewUrl paywallWebviewUrl = (PaywallWebviewUrl) CollectionsKt.firstOrNull(collection2);
            if (paywallWebviewUrl == null) {
                throw new NoSuchElementException("No more URLs to evaluate");
            }
            i11 += paywallWebviewUrl.getScore();
            if (i10 < i11) {
                return paywallWebviewUrl;
            }
            collection = CollectionsKt.drop(collection2, 1);
        }
    }

    static /* synthetic */ PaywallWebviewUrl evaluateNext$default(WebviewFallbackClient webviewFallbackClient, int i10, Collection collection, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return webviewFallbackClient.evaluateNext(i10, collection, i11);
    }

    private final PaywallWebviewUrl nextWeightedUrl(Collection<PaywallWebviewUrl> collection) {
        Iterator<T> it = collection.iterator();
        int score = 0;
        while (it.hasNext()) {
            score += ((PaywallWebviewUrl) it.next()).getScore();
        }
        if (score == 0) {
            PaywallWebviewUrl paywallWebviewUrl = (PaywallWebviewUrl) CollectionsKt.random(this.untriedUrls, kotlin.random.f.f312895a);
            this.untriedUrls.remove(paywallWebviewUrl);
            return paywallWebviewUrl;
        }
        PaywallWebviewUrl paywallWebviewUrlEvaluateNext = evaluateNext(r.g1(r.W1(0, score), kotlin.random.f.f312895a), this.untriedUrls, 0);
        this.untriedUrls.remove(paywallWebviewUrlEvaluateNext);
        return paywallWebviewUrlEvaluateNext;
    }

    public final void loadWithFallback$superwall_release() {
        if (this.urls.isEmpty()) {
            kotlinx.coroutines.k.f(this.ioScope, null, null, new WebviewFallbackClient$loadWithFallback$1(this, null), 3, null);
            return;
        }
        try {
            PaywallWebviewUrl paywallWebviewUrlNextUrl$superwall_release = nextUrl$superwall_release();
            if (this.failureCount > 0) {
                kotlinx.coroutines.k.f(this.ioScope, null, null, new WebviewFallbackClient$loadWithFallback$2(this, null), 3, null);
            }
            kotlinx.coroutines.k.f(this.mainScope, null, null, new WebviewFallbackClient$loadWithFallback$3(this, paywallWebviewUrlNextUrl$superwall_release, null), 3, null);
        } catch (MaxAttemptsReachedException unused) {
            kotlinx.coroutines.k.f(this.ioScope, null, null, new WebviewFallbackClient$loadWithFallback$url$2(this, null), 3, null);
        } catch (NoSuchElementException unused2) {
            kotlinx.coroutines.k.f(this.ioScope, null, null, new WebviewFallbackClient$loadWithFallback$url$1(this, null), 3, null);
        }
    }

    @NotNull
    public final PaywallWebviewUrl nextUrl$superwall_release() throws MaxAttemptsReachedException {
        if (this.failureCount >= this.config.getMaxAttempts()) {
            throw new MaxAttemptsReachedException();
        }
        this.failureCount++;
        Set<PaywallWebviewUrl> set = this.untriedUrls;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((PaywallWebviewUrl) it.next()).getScore() != 0) {
                    Set<PaywallWebviewUrl> set2 = this.untriedUrls;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set2) {
                        if (((PaywallWebviewUrl) obj).getScore() != 0) {
                            arrayList.add(obj);
                        }
                    }
                    return nextWeightedUrl(arrayList);
                }
            }
        }
        return nextWeightedUrl(this.untriedUrls);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(@Nullable WebView webView, @Nullable String str) {
        kotlinx.coroutines.k.f(this.ioScope, null, null, new AnonymousClass1(null), 3, null);
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(@Nullable WebView webView, @Nullable String str) {
        super.onPageCommitVisible(webView, str);
        this.failureCount = 0;
    }

    @Override // com.superwall.sdk.paywall.view.webview.DefaultWebviewClient, android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        Object next;
        super.onPageStarted(webView, str, bitmap);
        Iterator<T> it = this.urls.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(str != null ? StringsKt.V2(str, ((PaywallWebviewUrl) next).getUrl(), false, 2, null) : false));
        PaywallWebviewUrl paywallWebviewUrl = (PaywallWebviewUrl) next;
        if (paywallWebviewUrl != null) {
            kotlinx.coroutines.k.f(this.ioScope, null, null, new C27191(paywallWebviewUrl.getTimeout(), null), 3, null);
            return;
        }
        throw new IllegalStateException(("No such URL(" + str + " in list of - " + CollectionsKt.joinToString$default(this.urls, null, null, null, 0, null, null, 63, null) + " ").toString());
    }

    @Override // com.superwall.sdk.paywall.view.webview.DefaultWebviewClient, android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        k0<UrlState> k0Var = this.timeoutFlow;
        while (!k0Var.compareAndSet(k0Var.getValue(), UrlState.PageError.INSTANCE)) {
        }
        super.onReceivedError(webView, webResourceRequest, error);
        loadWithFallback$superwall_release();
    }

    @Override // com.superwall.sdk.paywall.view.webview.DefaultWebviewClient, android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        k0<UrlState> k0Var = this.timeoutFlow;
        while (!k0Var.compareAndSet(k0Var.getValue(), UrlState.PageError.INSTANCE)) {
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}

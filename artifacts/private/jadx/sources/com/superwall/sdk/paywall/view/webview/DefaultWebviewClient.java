package com.superwall.sdk.paywall.view.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.io.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultWebviewClient extends WebViewClient {

    @NotNull
    private final String forUrl;

    @NotNull
    private final s0 ioScope;

    @NotNull
    private final Function1<RenderProcessGoneDetail, Unit> onWebViewCrash;

    @NotNull
    private final j0<WebviewClientEvent> webviewClientEvents;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onPageFinished$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onPageFinished$1", f = "DefaultWebviewClient.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DefaultWebviewClient.this.new AnonymousClass1(this.$url, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<WebviewClientEvent> webviewClientEvents = DefaultWebviewClient.this.getWebviewClientEvents();
                WebviewClientEvent.OnPageFinished onPageFinished = new WebviewClientEvent.OnPageFinished(this.$url);
                this.label = 1;
                if (webviewClientEvents.emit(onPageFinished, this) == objL) {
                    return objL;
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

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onReceivedError$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onReceivedError$1", f = "DefaultWebviewClient.kt", i = {}, l = {96, com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class C27141 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ WebResourceError $error;
        final /* synthetic */ WebResourceRequest $request;
        int label;
        final /* synthetic */ DefaultWebviewClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27141(WebResourceRequest webResourceRequest, WebResourceError webResourceError, DefaultWebviewClient defaultWebviewClient, kotlin.coroutines.d<? super C27141> dVar) {
            super(2, dVar);
            this.$request = webResourceRequest;
            this.$error = webResourceError;
            this.this$0 = defaultWebviewClient;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27141(this.$request, this.$error, this.this$0, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0062  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.view.webview.DefaultWebviewClient.C27141.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27141) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onReceivedHttpError$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.DefaultWebviewClient$onReceivedHttpError$1", f = "DefaultWebviewClient.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDefaultWebviewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebviewClient.kt\ncom/superwall/sdk/paywall/view/webview/DefaultWebviewClient$onReceivedHttpError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
    static final class C27151 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ WebResourceResponse $errorResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27151(WebResourceResponse webResourceResponse, kotlin.coroutines.d<? super C27151> dVar) {
            super(2, dVar);
            this.$errorResponse = webResourceResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DefaultWebviewClient.this.new C27151(this.$errorResponse, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            String str;
            String strK;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<WebviewClientEvent> webviewClientEvents = DefaultWebviewClient.this.getWebviewClientEvents();
                WebResourceResponse webResourceResponse = this.$errorResponse;
                int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : -1;
                WebResourceResponse webResourceResponse2 = this.$errorResponse;
                if (webResourceResponse2 == null) {
                    str = "Unknown error";
                } else {
                    InputStream data = webResourceResponse2.getData();
                    if (data != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(data, Charsets.UTF_8), 8192);
                        try {
                            strK = x.k(bufferedReader);
                            kotlin.io.c.a(bufferedReader, null);
                            if (strK == null) {
                                strK = com.facebook.internal.a.f99697t;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.c.a(bufferedReader, th2);
                                throw th3;
                            }
                        }
                    } else {
                        strK = com.facebook.internal.a.f99697t;
                    }
                    str = "Error: " + webResourceResponse2.getReasonPhrase() + " -\n " + strK;
                    if (str == null) {
                        str = "Unknown error";
                    }
                }
                WebviewClientEvent.OnError onError = new WebviewClientEvent.OnError(new WebviewError.NetworkError(statusCode, str, DefaultWebviewClient.this.forUrl));
                this.label = 1;
                if (webviewClientEvents.emit(onError, this) == objL) {
                    return objL;
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
            return ((C27151) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ DefaultWebviewClient(String str, s0 s0Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, s0Var, (i10 & 4) != 0 ? new Function1() { // from class: com.superwall.sdk.paywall.view.webview.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultWebviewClient._init_$lambda$0((RenderProcessGoneDetail) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(RenderProcessGoneDetail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    @NotNull
    public final j0<WebviewClientEvent> getWebviewClientEvents() {
        return this.webviewClientEvents;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        k.f(this.ioScope, null, null, new AnonymousClass1(url, null), 3, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        k.f(this.ioScope, null, null, new C27141(webResourceRequest, error, this, null), 3, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        if (StringsKt.V2(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "favicon.ico", false, 2, null)) {
            return;
        }
        k.f(this.ioScope, null, null, new C27151(webResourceResponse, null), 3, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.onWebViewCrash.invoke(detail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultWebviewClient(@NotNull String forUrl, @NotNull s0 ioScope, @NotNull Function1<? super RenderProcessGoneDetail, Unit> onWebViewCrash) {
        Intrinsics.checkNotNullParameter(forUrl, "forUrl");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(onWebViewCrash, "onWebViewCrash");
        this.forUrl = forUrl;
        this.ioScope = ioScope;
        this.onWebViewCrash = onWebViewCrash;
        this.webviewClientEvents = q0.b(2, 10, null, 4, null);
    }
}

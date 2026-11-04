package io.customer.messaginginapp.gist.presentation.engine;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.w0;
import com.google.gson.f;
import eh.d;
import ih.e;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEngineWebViewInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineWebViewInterface.kt\nio/customer/messaginginapp/gist/presentation/engine/EngineWebViewInterface\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class EngineWebViewInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String JAVASCRIPT_INTERFACE_NAME = "appInterface";
    private boolean isAttachedToWebView;

    @NotNull
    private final EngineWebViewListener listener;

    @NotNull
    private final e logger;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EngineWebViewInterface(@NotNull EngineWebViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.logger = d.f274883c.w();
    }

    public final void attach$messaginginapp_release(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.isAttachedToWebView = true;
        webView.addJavascriptInterface(this, JAVASCRIPT_INTERFACE_NAME);
    }

    public final void detach$messaginginapp_release(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.isAttachedToWebView = false;
        webView.removeJavascriptInterface(JAVASCRIPT_INTERFACE_NAME);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.isAttachedToWebView) {
            EngineWebMessage engineWebMessage = (EngineWebMessage) new f().r(message, EngineWebMessage.class);
            e.a.a(this.logger, "Received event from WebView: " + engineWebMessage, null, 2, null);
            Map<String, Object> parameters = engineWebMessage.getGist().getParameters();
            if (parameters != null) {
                String method = engineWebMessage.getGist().getMethod();
                switch (method.hashCode()) {
                    case 114595:
                        if (method.equals("tap")) {
                            Object obj = parameters.get(w0.f100156c1);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                            Object obj2 = parameters.get("name");
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            Object obj3 = parameters.get("system");
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            this.listener.tap((String) obj2, (String) obj, zBooleanValue);
                            break;
                        }
                        break;
                    case 96784904:
                        if (method.equals("error")) {
                            this.listener.error();
                            break;
                        }
                        break;
                    case 110306273:
                        if (method.equals("bootstrapped")) {
                            this.listener.bootstrapped();
                            break;
                        }
                        break;
                    case 888681791:
                        if (method.equals("routeError")) {
                            Object obj4 = parameters.get("route");
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                            this.listener.routeError((String) obj4);
                        }
                        break;
                    case 1217611635:
                        if (method.equals("sizeChanged")) {
                            Object obj5 = parameters.get("width");
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj5).doubleValue();
                            Object obj6 = parameters.get("height");
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Double");
                            this.listener.sizeChanged(dDoubleValue, ((Double) obj6).doubleValue());
                        }
                        break;
                    case 1542640683:
                        if (method.equals("routeChanged")) {
                            Object obj7 = parameters.get("route");
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.String");
                            this.listener.routeChanged((String) obj7);
                            break;
                        }
                        break;
                    case 1976447918:
                        if (method.equals("routeLoaded")) {
                            Object obj8 = parameters.get("route");
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.String");
                            this.listener.routeLoaded((String) obj8);
                        }
                        break;
                }
            }
        }
    }
}

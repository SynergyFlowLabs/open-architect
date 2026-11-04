package io.customer.messaginginapp.gist.presentation.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.c0;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import androidx.lifecycle.n2;
import androidx.lifecycle.o0;
import com.google.gson.f;
import eh.d;
import ih.e;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.model.engine.EngineWebConfiguration;
import io.customer.messaginginapp.gist.utilities.ElapsedTimer;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate;
import io.sentry.rrweb.h;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEngineWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineWebView.kt\nio/customer/messaginginapp/gist/presentation/engine/EngineWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
public final class EngineWebView extends FrameLayout implements EngineWebViewListener, n0, EngineWebViewDelegate {

    @NotNull
    private ElapsedTimer elapsedTimer;

    @NotNull
    private final EngineWebViewInterface engineWebViewInterface;

    @NotNull
    private final InAppMessagingManager inAppMessagingManager;

    @Nullable
    private EngineWebViewListener listener;

    @NotNull
    private final e logger;

    @Nullable
    private Timer timer;

    @Nullable
    private TimerTask timerTask;

    @Nullable
    private WebView webView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @j
    public EngineWebView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final InAppMessagingState getState() {
        return this.inAppMessagingManager.getCurrentState();
    }

    private final c0 getViewLifecycleOwner() {
        o0 o0VarA = n2.a(this);
        if (o0VarA != null) {
            return o0VarA.getLifecycle();
        }
        return null;
    }

    private final void setupTimeout() {
        this.timerTask = new TimerTask() { // from class: io.customer.messaginginapp.gist.presentation.engine.EngineWebView.setupTimeout.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (EngineWebView.this.timer != null) {
                    e.a.a(EngineWebView.this.logger, "Message global timeout, cancelling display.", null, 2, null);
                    EngineWebViewListener listener = EngineWebView.this.getListener();
                    if (listener != null) {
                        listener.error();
                    }
                    EngineWebView.this.stopTimer();
                }
            }
        };
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(this.timerTask, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.purge();
        }
        this.timer = null;
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void bootstrapped() {
        stopTimer();
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.bootstrapped();
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void error() {
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.error();
        }
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    @Nullable
    public EngineWebViewListener getListener() {
        return this.listener;
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    @NotNull
    public EngineWebView getView() {
        return this;
    }

    @e1(c0.a.ON_PAUSE)
    public final void onLifecyclePaused() {
        e.a.c(this.logger, "EngineWebView onLifecyclePaused", null, 2, null);
        WebView webView = this.webView;
        if (webView != null) {
            this.engineWebViewInterface.detach$messaginginapp_release(webView);
        }
    }

    @e1(c0.a.ON_RESUME)
    public final void onLifecycleResumed() {
        e.a.c(this.logger, "EngineWebView onLifecycleResumed", null, 2, null);
        WebView webView = this.webView;
        if (webView != null) {
            this.engineWebViewInterface.attach$messaginginapp_release(webView);
        }
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    public void releaseResources() {
        try {
            WebView webView = this.webView;
            if (webView == null) {
                return;
            }
            e.a.a(this.logger, "Cleaning up EngineWebView", null, 2, null);
            if (getParent() != null) {
                e.a.a(this.logger, "EngineWebView is still attached to parent, skipping cleanup", null, 2, null);
                return;
            }
            this.webView = null;
            if (webView.getParent() != null) {
                e.a.a(this.logger, "Removing WebView from parent before cleanup", null, 2, null);
                removeView(webView);
            }
            e.a.a(this.logger, "Detaching JavaScript interface from EngineWebView", null, 2, null);
            this.engineWebViewInterface.detach$messaginginapp_release(webView);
            e.a.a(this.logger, "Stopping EngineWebView loading", null, 2, null);
            webView.stopLoading();
            webView.destroy();
        } catch (Exception e10) {
            int i10 = 5 ^ 0;
            e.a.b(this.logger, "Error while releasing resources: " + e10.getMessage(), null, null, 6, null);
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void routeChanged(@NotNull String newRoute) {
        Intrinsics.checkNotNullParameter(newRoute, "newRoute");
        this.elapsedTimer.start("Engine render for message: " + newRoute);
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.routeChanged(newRoute);
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void routeError(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.routeError(route);
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void routeLoaded(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.elapsedTimer.end();
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.routeLoaded(route);
        }
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    public void setListener(@Nullable EngineWebViewListener engineWebViewListener) {
        this.listener = engineWebViewListener;
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    @e.a({"SetJavaScriptEnabled"})
    public void setup(@NotNull EngineWebConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        setupTimeout();
        this.elapsedTimer.start("Engine render for message: " + configuration.getMessageId());
        String strD = new f().D(MapsKt.mapOf(TuplesKt.to(h.f306695g, configuration)));
        String str = getState().getEnvironment().getGistRendererUrl() + "/index.html";
        e.a.a(this.logger, "Rendering message with URL: " + str, null, 2, null);
        WebView webView = this.webView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setAllowContentAccess(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setTextZoom(100);
            webView.setBackgroundColor(0);
            c0 viewLifecycleOwner = getViewLifecycleOwner();
            if (viewLifecycleOwner != null) {
                viewLifecycleOwner.c(this);
            } else {
                e.a.b(this.logger, "Lifecycle owner not found, attaching interface to WebView manually", null, null, 6, null);
                onLifecycleResumed();
            }
            webView.setWebViewClient(new EngineWebView$setup$1$2(strD, this));
            webView.loadUrl(str);
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void sizeChanged(double d10, double d11) {
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.sizeChanged(d10, d11);
        }
    }

    @Override // io.customer.messaginginapp.ui.bridge.EngineWebViewDelegate
    public void stopLoading() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        onLifecyclePaused();
        c0 viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.g(this);
        }
        bootstrapped();
    }

    @Override // io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener
    public void tap(@NotNull String name, @NotNull String action, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        EngineWebViewListener listener = getListener();
        if (listener != null) {
            listener.tap(name, action, z10);
        }
    }

    public /* synthetic */ EngineWebView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public EngineWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.elapsedTimer = new ElapsedTimer();
        this.engineWebViewInterface = new EngineWebViewInterface(this);
        d dVar = d.f274883c;
        e eVarW = dVar.w();
        this.logger = eVarW;
        this.inAppMessagingManager = DIGraphMessagingInAppKt.getInAppMessagingManager(dVar);
        try {
            WebView webView = new WebView(context);
            this.webView = webView;
            addView(webView);
            e.a.a(eVarW, "EngineWebView created", null, 2, null);
        } catch (Exception e10) {
            e.a.b(this.logger, "Error while creating EngineWebView: " + e10.getMessage(), null, null, 6, null);
        }
    }
}

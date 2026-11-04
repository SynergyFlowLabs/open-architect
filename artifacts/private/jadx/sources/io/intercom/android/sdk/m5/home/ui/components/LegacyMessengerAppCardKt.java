package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.m0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nLegacyMessengerAppCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyMessengerAppCard.kt\nio/intercom/android/sdk/m5/home/ui/components/LegacyMessengerAppCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n75#2:109\n*S KotlinDebug\n*F\n+ 1 LegacyMessengerAppCard.kt\nio/intercom/android/sdk/m5/home/ui/components/LegacyMessengerAppCardKt\n*L\n29#1:109\n*E\n"})
public final class LegacyMessengerAppCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1, reason: invalid class name */
    static final class AnonymousClass1 implements pj.n<m0, c0, Integer, Unit> {
        final /* synthetic */ CardWebView $webView;

        AnonymousClass1(CardWebView cardWebView) {
            this.$webView = cardWebView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FrameLayout invoke$lambda$1(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FrameLayout frameLayout = new FrameLayout(it);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(CardWebView webView, FrameLayout it) {
            Intrinsics.checkNotNullParameter(webView, "$webView");
            Intrinsics.checkNotNullParameter(it, "it");
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            it.addView(webView);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(m0 m0Var, c0 c0Var, Integer num) {
            invoke(m0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(m0 IntercomCard, c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyMessengerAppCardKt.AnonymousClass1.invoke$lambda$1((Context) obj);
                }
            };
            final CardWebView cardWebView = this.$webView;
            androidx.compose.ui.viewinterop.e.a(function1, null, new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LegacyMessengerAppCardKt.AnonymousClass1.invoke$lambda$2(cardWebView, (FrameLayout) obj);
                }
            }, c0Var, 6, 2);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LegacyMessengerAppCard(@NotNull final String url, @NotNull IntercomCardStyle.Style style, final boolean z10, @Nullable c0 c0Var, final int i10) {
        int i11;
        final IntercomCardStyle.Style style2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(style, "style");
        c0 c0VarR = c0Var.R(-1087658045);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(url) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.D(style) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            style2 = style;
        } else {
            Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
            style2 = style;
            IntercomCardKt.IntercomCard(null, style2, androidx.compose.runtime.internal.w.e(231006519, true, new AnonymousClass1(getWebView(ThemeUtils.appendInterfaceStyleToUrl(context, url), context, z10)), c0VarR, 54), c0VarR, (IntercomCardStyle.Style.$stable << 3) | a5.S0 | (i11 & com.planner5d.library.engine.input.f.b.B), 1);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyMessengerAppCardKt.LegacyMessengerAppCard$lambda$0(url, style2, z10, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyMessengerAppCard$lambda$0(String url, IntercomCardStyle.Style style, boolean z10, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(style, "$style");
        LegacyMessengerAppCard(url, style, z10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final CardWebView getWebView(String str, Context context, boolean z10) {
        CardWebView cachedWebView = InMemoryWebViewCacheKt.getCachedWebView(str);
        if (cachedWebView != null) {
            return cachedWebView;
        }
        CardWebView cardWebView = new CardWebView(context);
        cardWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
        cardWebView.getSettings().setJavaScriptEnabled(true);
        cardWebView.getSettings().setUseWideViewPort(true);
        cardWebView.getSettings().setCacheMode(-1);
        cardWebView.getSettings().setMixedContentMode(0);
        cardWebView.setVerticalScrollBarEnabled(false);
        cardWebView.setHorizontalScrollBarEnabled(false);
        cardWebView.setWebViewClient(new MessengerCardWebViewClient(str));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m370getLambda2$intercom_sdk_base_release());
        new MessengerCardWebViewPresenter(cardWebView, composeView, str, Injector.get().getAppConfigProvider().get().getPrimaryColor(), Injector.get().getGson(), Injector.get().getMetricTracker(), cardWebView.getContext().getCacheDir(), "", z10, context).setUpWebView();
        cardWebView.loadUrl(str);
        InMemoryWebViewCacheKt.cacheWebView(str, cardWebView);
        return cardWebView;
    }
}

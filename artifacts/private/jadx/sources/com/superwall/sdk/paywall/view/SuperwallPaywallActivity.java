package com.superwall.sdk.paywall.view;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.activity.i0;
import androidx.activity.r0;
import androidx.activity.u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.c0;
import androidx.core.view.a2;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.k2;
import androidx.core.view.u1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Color_HelpersKt;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.paywall.LocalNotification;
import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import com.superwall.sdk.paywall.presentation.PaywallCloseReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.webview.SWWebView;
import com.superwall.sdk.store.transactions.notifications.NotificationScheduler;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.k0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperwallPaywallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallPaywallActivity.kt\ncom/superwall/sdk/paywall/view/SuperwallPaywallActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,684:1\n310#2:685\n326#2,4:686\n311#2:690\n326#2,4:711\n136#3,10:691\n136#3,10:701\n*S KotlinDebug\n*F\n+ 1 SuperwallPaywallActivity.kt\ncom/superwall/sdk/paywall/view/SuperwallPaywallActivity\n*L\n369#1:685\n369#1:686,4\n369#1:690\n305#1:711,4\n518#1:691,10\n546#1:701,10\n*E\n"})
public final class SuperwallPaywallActivity extends androidx.appcompat.app.d {

    @NotNull
    private static final String ACTIVE_PAYWALL_TAG = "active_paywall";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String IS_LIGHT_BACKGROUND_KEY = "isLightBackgroundKey";

    @NotNull
    private static final String NOTIFICATION_CHANNEL_DESCRIPTION = "Notifications sent when a free trial is about to end.";

    @NotNull
    public static final String NOTIFICATION_CHANNEL_ID = "com.superwall.android.notifications";

    @NotNull
    private static final String NOTIFICATION_CHANNEL_NAME = "Trial Reminder Notifications";

    @NotNull
    private static final String PRESENTATION_STYLE_KEY = "presentationStyleKey";
    private static final int REQUEST_CODE_NOTIFICATION_PERMISSION = 1001;

    @NotNull
    private static final String VIEW_KEY = "viewKey";

    @Nullable
    private BottomSheetBehavior.g bottomSheetCallback;

    @Nullable
    private View contentView;

    @NotNull
    private final s0 mainScope = t0.a(l1.e());

    @Nullable
    private NotificationPermissionCallback notificationPermissionCallback;

    @SourceDebugExtension({"SMAP\nSuperwallPaywallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallPaywallActivity.kt\ncom/superwall/sdk/paywall/view/SuperwallPaywallActivity$Companion\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,684:1\n2163#2,2:685\n*S KotlinDebug\n*F\n+ 1 SuperwallPaywallActivity.kt\ncom/superwall/sdk/paywall/view/SuperwallPaywallActivity$Companion\n*L\n106#1:685,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareViewForDisplay(PaywallView paywallView, String str) {
            if (paywallView.getWebView().getParent() == null) {
                paywallView.getWebView().enableOffscreenRender();
                paywallView.addView(paywallView.getWebView());
            }
            ViewStorageViewModel viewStorageViewModelMakeViewStore = Superwall.Companion.getInstance().getDependencyContainer$superwall_release().makeViewStore();
            for (View view : a2.e(paywallView)) {
                if (!(view instanceof LoadingView) && !(view instanceof ShimmerView)) {
                }
                viewStorageViewModelMakeViewStore.storeView(str, paywallView);
            }
            View viewRetrieveView = viewStorageViewModelMakeViewStore.retrieveView(LoadingView.TAG);
            Intrinsics.checkNotNull(viewRetrieveView, "null cannot be cast to non-null type com.superwall.sdk.paywall.view.LoadingView");
            View viewRetrieveView2 = viewStorageViewModelMakeViewStore.retrieveView(ShimmerView.TAG);
            Intrinsics.checkNotNull(viewRetrieveView2, "null cannot be cast to non-null type com.superwall.sdk.paywall.view.ShimmerView");
            paywallView.setupWith((ShimmerView) viewRetrieveView2, (LoadingView) viewRetrieveView);
            viewStorageViewModelMakeViewStore.storeView(str, paywallView);
        }

        public static /* synthetic */ void startWithView$default(Companion companion, Context context, PaywallView paywallView, String str, PaywallPresentationStyle paywallPresentationStyle, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = UUID.randomUUID().toString();
            }
            if ((i10 & 8) != 0) {
                paywallPresentationStyle = null;
            }
            companion.startWithView(context, paywallView, str, paywallPresentationStyle);
        }

        public final void startWithView(@NotNull Context context, @NotNull PaywallView view, @NotNull String key, @Nullable PaywallPresentationStyle paywallPresentationStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(key, "key");
            int i10 = 6 ^ 3;
            kotlinx.coroutines.k.f(t0.a(l1.e()), null, null, new SuperwallPaywallActivity$Companion$startWithView$1(view, key, context, paywallPresentationStyle, null), 3, null);
        }

        private Companion() {
        }
    }

    public interface NotificationPermissionCallback {
        void onPermissionResult(boolean z10);
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallPresentationStyle.values().length];
            try {
                iArr[PaywallPresentationStyle.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallPresentationStyle.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallPresentationStyle.FULLSCREEN_NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallPresentationStyle.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaywallPresentationStyle.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaywallPresentationStyle.DRAWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.SuperwallPaywallActivity$finish$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.SuperwallPaywallActivity$finish$1", f = "SuperwallPaywallActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SuperwallPaywallActivity.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SuperwallPaywallActivity.this.hideBottomSheetAndFinish();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.SuperwallPaywallActivity$onPause$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.SuperwallPaywallActivity$onPause$1", f = "SuperwallPaywallActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27111 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PaywallView $paywallVc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27111(PaywallView paywallView, kotlin.coroutines.d<? super C27111> dVar) {
            super(2, dVar);
            this.$paywallVc = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27111(this.$paywallVc, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$paywallVc.beforeOnDestroy();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27111) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.SuperwallPaywallActivity$onStop$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.SuperwallPaywallActivity$onStop$1", f = "SuperwallPaywallActivity.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
    static final class C27121 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PaywallView $paywallVc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27121(PaywallView paywallView, kotlin.coroutines.d<? super C27121> dVar) {
            super(2, dVar);
            this.$paywallVc = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27121(this.$paywallVc, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallView paywallView = this.$paywallVc;
                this.label = 1;
                if (paywallView.destroyed(this) == objL) {
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
            return ((C27121) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final boolean areNotificationsEnabled(Context context) {
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(NOTIFICATION_CHANNEL_ID);
        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
            return c0.q(context).a();
        }
        return false;
    }

    private final void checkAndRequestNotificationPermissions(Context context, NotificationPermissionCallback notificationPermissionCallback) {
        if (Build.VERSION.SDK_INT < 33) {
            notificationPermissionCallback.onPermissionResult(areNotificationsEnabled(context));
            return;
        }
        if (androidx.core.content.d.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            notificationPermissionCallback.onPermissionResult(true);
            return;
        }
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (androidx.core.app.b.S(activity, "android.permission.POST_NOTIFICATIONS")) {
            notificationPermissionCallback.onPermissionResult(false);
        } else {
            androidx.core.app.b.M(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1001);
        }
    }

    private final void createNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, NOTIFICATION_CHANNEL_NAME, 3);
        notificationChannel.setDescription(NOTIFICATION_CHANNEL_DESCRIPTION);
        notificationChannel.setShowBadge(false);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideBottomSheetAndFinish() {
        final int iArgb = Color.argb(200, 0, 0, 0);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(iArgb), Integer.valueOf(Color.argb(0, 0, 0, 0)));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.superwall.sdk.paywall.view.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SuperwallPaywallActivity.hideBottomSheetAndFinish$lambda$10$lambda$9(iArgb, this, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideBottomSheetAndFinish$lambda$10$lambda$9(int i10, SuperwallPaywallActivity superwallPaywallActivity, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) animatedValue).intValue() / i10 < 0.1d) {
            super.finish();
        }
        Window window = superwallPaywallActivity.getWindow();
        Object animatedValue2 = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        window.setBackgroundDrawable(new ColorDrawable(((Integer) animatedValue2).intValue()));
    }

    private final void initBottomSheetBehavior(final boolean z10) {
        PaywallView paywallView;
        SWWebView webView;
        View view = this.contentView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        final BottomSheetBehavior bottomSheetBehaviorX0 = BottomSheetBehavior.x0(viewGroup.getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorX0, "from(...)");
        if (z10) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) (((double) Resources.getSystem().getDisplayMetrics().heightPixels) * 0.05d);
            viewGroup.setLayoutParams(layoutParams);
            bottomSheetBehaviorX0.g(3);
        } else {
            bottomSheetBehaviorX0.j1(0.7f);
            int i10 = 0 | 6;
            bottomSheetBehaviorX0.g(6);
        }
        viewGroup.invalidate();
        bottomSheetBehaviorX0.u1(true);
        final i1.f fVar = new i1.f();
        if (z10 && (paywallView = paywallView()) != null && (webView = paywallView.getWebView()) != null) {
            webView.setOnScrollChangeListener(new SWWebView.OnScrollChangeListener() { // from class: com.superwall.sdk.paywall.view.SuperwallPaywallActivity.initBottomSheetBehavior.2
                @Override // com.superwall.sdk.paywall.view.webview.SWWebView.OnScrollChangeListener
                public void onScrollChanged(int i11, int i12, int i13, int i14) {
                    fVar.f312749a = i12;
                }
            });
        }
        BottomSheetBehavior.g gVar = new BottomSheetBehavior.g() { // from class: com.superwall.sdk.paywall.view.SuperwallPaywallActivity.initBottomSheetBehavior.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onSlide(View bottomSheet, float f10) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
            public void onStateChanged(View bottomSheet, int i11) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                boolean z11 = z10;
                if (z11 && i11 == 1 && fVar.f312749a > 0) {
                    bottomSheetBehaviorX0.g(3);
                    return;
                }
                if (z11 && i11 == 6) {
                    bottomSheetBehaviorX0.g(3);
                } else if (i11 == 5) {
                    this.finish();
                }
            }
        };
        this.bottomSheetCallback = gVar;
        bottomSheetBehaviorX0.h0(gVar);
    }

    private final boolean isBottomSheetView() {
        return (this.contentView instanceof CoordinatorLayout) && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDestroy$lambda$14(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Error cleaning up PaywallView: " + it, null, null, 24, null);
        return Unit.f312394a;
    }

    private final PaywallView paywallView() {
        View view = this.contentView;
        if (view != null) {
            return (PaywallView) view.findViewWithTag(ACTIVE_PAYWALL_TAG);
        }
        return null;
    }

    private final void restorePaywallViewAfterCleanup(PaywallView paywallView, String str) {
        Either failure;
        try {
            Companion.prepareViewForDisplay(paywallView, str);
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Successfully restored PaywallView child views after cleanup", null, null, 24, null);
            failure = new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        EitherKt.onError(failure, new Function1() { // from class: com.superwall.sdk.paywall.view.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SuperwallPaywallActivity.restorePaywallViewAfterCleanup$lambda$16((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit restorePaywallViewAfterCleanup$lambda$16(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Failed to restore PaywallView after cleanup: " + it.getMessage(), null, null, 24, null);
        return Unit.f312394a;
    }

    private final void setBottomSheetTransparency() {
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            setTheme(R.style.Theme.Translucent.NoTitleBar);
            return;
        }
        setTranslucent(true);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(Color.argb(0, 0, 0, 0)), Integer.valueOf(Color.argb(200, 0, 0, 0)));
        valueAnimatorOfObject.setDuration(600L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.superwall.sdk.paywall.view.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SuperwallPaywallActivity.setBottomSheetTransparency$lambda$8$lambda$7(this.f267479a, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBottomSheetTransparency$lambda$8$lambda$7(SuperwallPaywallActivity superwallPaywallActivity, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Window window = superwallPaywallActivity.getWindow();
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setBackgroundDrawable(new ColorDrawable(((Integer) animatedValue).intValue()));
    }

    private final void setupActivityWithView(final PaywallView paywallView, PaywallPresentationStyle paywallPresentationStyle) {
        getWindow().getDecorView().setBackgroundColor(paywallView.getBackgroundColor());
        boolean z10 = paywallPresentationStyle == PaywallPresentationStyle.DRAWER || paywallPresentationStyle == PaywallPresentationStyle.MODAL;
        ViewParent parent = paywallView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(paywallView);
        }
        paywallView.setTag(ACTIVE_PAYWALL_TAG);
        paywallView.setEncapsulatingActivity(new WeakReference<>(this));
        if (!z10 || Build.VERSION.SDK_INT < 30) {
            setContentView(paywallView);
        } else {
            setupBottomSheetLayout(paywallView, paywallPresentationStyle == PaywallPresentationStyle.MODAL);
        }
        getOnBackPressedDispatcher().i(this, new i0() { // from class: com.superwall.sdk.paywall.view.SuperwallPaywallActivity.setupActivityWithView.1
            {
                super(true);
            }

            @Override // androidx.activity.i0
            public void handleOnBackPressed() {
                PaywallView.dismiss$superwall_release$default(paywallView, new PaywallResult.Declined(), PaywallCloseReason.ManualClose.INSTANCE, null, 4, null);
            }
        });
        try {
            androidx.appcompat.app.a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.B();
            }
        } catch (Throwable unused) {
        }
        getWindow().setNavigationBarColor(paywallView.getBackgroundColor());
        switch (paywallPresentationStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paywallPresentationStyle.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
                break;
            case 0:
            default:
                throw new k0();
            case 1:
                if (Build.VERSION.SDK_INT < 34) {
                    overridePendingTransition(com.superwall.sdk.R.anim.slide_in_right, com.superwall.sdk.R.anim.slide_out_left);
                } else {
                    overrideActivityTransition(0, com.superwall.sdk.R.anim.slide_in_right, com.superwall.sdk.R.anim.slide_out_left);
                }
                break;
            case 2:
                k2.c(getWindow(), true);
                u.d(this, null, Color_HelpersKt.isDarkColor(paywallView.getPaywall().getBackgroundColor()) ? r0.f9989e.d(paywallView.getPaywall().getBackgroundColor()) : r0.f9989e.e(paywallView.getPaywall().getBackgroundColor(), Color_HelpersKt.readableOverlayColor(paywallView.getPaywall().getBackgroundColor())), 1, null);
                u1.j2(paywallView.getWebView(), new b1() { // from class: com.superwall.sdk.paywall.view.o
                    @Override // androidx.core.view.b1
                    public final g3 b(View view, g3 g3Var) {
                        return SuperwallPaywallActivity.setupActivityWithView$lambda$3(view, g3Var);
                    }
                });
                break;
            case 3:
                if (Build.VERSION.SDK_INT >= 34) {
                    overrideActivityTransition(0, 0, 0);
                    overrideActivityTransition(1, 0, 0);
                } else {
                    overridePendingTransition(0, 0);
                }
                u.d(this, null, Color_HelpersKt.isDarkColor(paywallView.getPaywall().getBackgroundColor()) ? r0.f9989e.d(paywallView.getPaywall().getBackgroundColor()) : r0.f9989e.e(paywallView.getPaywall().getBackgroundColor(), Color_HelpersKt.readableOverlayColor(paywallView.getPaywall().getBackgroundColor())), 1, null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 setupActivityWithView$lambda$3(View v10, g3 windowInsets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.j jVarF = windowInsets.f(g3.m.i());
        Intrinsics.checkNotNullExpressionValue(jVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = jVarF.f47826d;
        v10.setLayoutParams(marginLayoutParams);
        return g3.f48754c;
    }

    private final void setupBottomSheetLayout(PaywallView paywallView, boolean z10) {
        View viewInflate = getLayoutInflater().inflate(com.superwall.sdk.R.layout.activity_bottom_sheet, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        setContentView(viewInflate);
        initBottomSheetBehavior(z10);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(com.superwall.sdk.R.id.container);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.paywall.view.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267482a.finish();
            }
        });
        frameLayout.addView(paywallView);
        frameLayout.requestLayout();
    }

    @Nullable
    public final Object attemptToScheduleNotifications(@NotNull final List<LocalNotification> list, @NotNull final DeviceHelperFactory deviceHelperFactory, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        final kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        if (list.isEmpty()) {
            Result.a aVar = Result.Companion;
            jVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        } else {
            createNotificationChannel();
            NotificationPermissionCallback notificationPermissionCallback = new NotificationPermissionCallback() { // from class: com.superwall.sdk.paywall.view.SuperwallPaywallActivity$attemptToScheduleNotifications$2$1
                @Override // com.superwall.sdk.paywall.view.SuperwallPaywallActivity.NotificationPermissionCallback
                public void onPermissionResult(boolean z10) throws Throwable {
                    if (z10) {
                        NotificationScheduler.Companion.scheduleNotifications(list, deviceHelperFactory, this);
                    }
                    kotlin.coroutines.d<Unit> dVar2 = jVar;
                    Result.a aVar2 = Result.Companion;
                    dVar2.resumeWith(Result.m785constructorimpl(Unit.f312394a));
                }
            };
            this.notificationPermissionCallback = notificationPermissionCallback;
            Intrinsics.checkNotNull(notificationPermissionCallback);
            checkAndRequestNotificationPermissions(this, notificationPermissionCallback);
        }
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @Override // android.app.Activity
    public void finish() {
        if (!isBottomSheetView()) {
            super.finish();
        } else {
            boolean z10 = false;
            kotlinx.coroutines.k.f(this.mainScope, null, null, new AnonymousClass1(null), 3, null);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        WindowInsetsController insetsController;
        androidx.appcompat.app.h.W(true);
        Serializable serializableExtra = getIntent().getSerializableExtra(PRESENTATION_STYLE_KEY);
        PaywallPresentationStyle paywallPresentationStyle = serializableExtra instanceof PaywallPresentationStyle ? (PaywallPresentationStyle) serializableExtra : null;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 30 && getIntent().getBooleanExtra(IS_LIGHT_BACKGROUND_KEY, false) && (insetsController = getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsAppearance(8, 8);
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (bundle == null || (stringExtra = bundle.getString(VIEW_KEY)) == null) {
            stringExtra = getIntent().getStringExtra(VIEW_KEY);
        }
        if (stringExtra == null) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "No view key found in savedInstanceState or intent, finishing activity", null, null, 24, null);
            finish();
            return;
        }
        try {
            Superwall.Companion companion = Superwall.Companion;
            ViewStorageViewModel viewStorageViewModelMakeViewStore = companion.getInstance().getDependencyContainer$superwall_release().makeViewStore();
            View viewRetrieveView = viewStorageViewModelMakeViewStore.retrieveView(stringExtra);
            PaywallView paywallView = viewRetrieveView instanceof PaywallView ? (PaywallView) viewRetrieveView : null;
            if (paywallView == null) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "PaywallView not found for key: " + stringExtra + ". Activity may have been recreated after cleanup.", null, null, 24, null);
                finish();
                return;
            }
            if (bundle == null || paywallView() != null) {
                setupActivityWithView(paywallView, paywallPresentationStyle);
                return;
            }
            Logger logger = Logger.INSTANCE;
            LogLevel logLevel = LogLevel.debug;
            LogScope logScope = LogScope.paywallView;
            Logger.debug$default(logger, logLevel, logScope, "Activity restored but PaywallView cleared - recreating with available view", null, null, 24, null);
            PaywallView paywallView2 = companion.getInstance().getPaywallView();
            if (paywallView2 == null) {
                Logger.debug$default(logger, LogLevel.error, logScope, "No PaywallView available in Superwall instance for recreation", null, null, 24, null);
                finish();
                return;
            }
            if (paywallView2.getChildCount() == 0) {
                Logger.debug$default(logger, logLevel, logScope, "PaywallView was cleaned up, restoring child views", null, null, 24, null);
                restorePaywallViewAfterCleanup(paywallView2, stringExtra);
            }
            viewStorageViewModelMakeViewStore.storeView(stringExtra, paywallView2);
            setupActivityWithView(paywallView2, paywallPresentationStyle);
        } catch (Exception unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Cannot access viewStore or create view - has Superwall been initialised?", null, null, 24, null);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        Either failure;
        SWWebView webView;
        super.onDestroy();
        View view = this.contentView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null && (viewGroup instanceof CoordinatorLayout)) {
            BottomSheetBehavior bottomSheetBehaviorX0 = BottomSheetBehavior.x0(((CoordinatorLayout) viewGroup).getChildAt(0));
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorX0, "from(...)");
            BottomSheetBehavior.g gVar = this.bottomSheetCallback;
            if (gVar != null) {
                bottomSheetBehaviorX0.Y0(gVar);
            }
        }
        String stringExtra = getIntent().getStringExtra(VIEW_KEY);
        if (stringExtra != null) {
            try {
                View viewRetrieveView = Superwall.Companion.getInstance().getDependencyContainer$superwall_release().makeViewStore().retrieveView(stringExtra);
                PaywallView paywallView = viewRetrieveView instanceof PaywallView ? (PaywallView) viewRetrieveView : null;
                if (paywallView != null) {
                    paywallView.cleanup();
                }
            } catch (Throwable th2) {
                if (ErrorTrackingKt.shouldLog(th2)) {
                    Superwall.Companion companion = Superwall.Companion;
                    if (companion.getInitialized()) {
                        ErrorTrackingKt.trackError(companion.getInstance(), th2);
                    }
                }
                failure = new Either.Failure(th2);
            }
        }
        failure = new Either.Success(Unit.f312394a);
        EitherKt.onError(failure, new Function1() { // from class: com.superwall.sdk.paywall.view.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SuperwallPaywallActivity.onDestroy$lambda$14((Throwable) obj);
            }
        });
        PaywallView paywallView2 = paywallView();
        if (paywallView2 != null && (webView = paywallView2.getWebView()) != null) {
            webView.setOnScrollChangeListener((SWWebView.OnScrollChangeListener) null);
        }
        PaywallView paywallView3 = paywallView();
        if (paywallView3 != null) {
            paywallView3.cleanup();
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        PaywallView paywallView4 = paywallView();
        if (paywallView4 == null) {
            paywallView4 = null;
        }
        if (paywallView4 != null) {
            paywallView4.setEncapsulatingActivity(null);
        }
        this.contentView = null;
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPause() {
        super.onPause();
        PaywallView paywallView = paywallView();
        if (paywallView == null) {
            return;
        }
        kotlinx.coroutines.k.f(this.mainScope, null, null, new C27111(paywallView, null), 3, null);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 1001 && Build.VERSION.SDK_INT >= 33) {
            boolean z10 = !(grantResults.length == 0) && grantResults[0] == 0;
            NotificationPermissionCallback notificationPermissionCallback = this.notificationPermissionCallback;
            if (notificationPermissionCallback != null) {
                notificationPermissionCallback.onPermissionResult(z10);
            }
        }
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        PaywallView paywallView = paywallView();
        if (paywallView == null) {
            return;
        }
        if (isBottomSheetView()) {
            setBottomSheetTransparency();
        }
        paywallView.onViewCreated();
        paywallView.getWebView().requestFocus();
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        String stringExtra = getIntent().getStringExtra(VIEW_KEY);
        if (stringExtra != null) {
            outState.putString(VIEW_KEY, stringExtra);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        PaywallView paywallView = paywallView();
        if (paywallView == null) {
            return;
        }
        if (paywallView.isBrowserViewPresented$superwall_release()) {
            paywallView.setBrowserViewPresented$superwall_release(false);
        }
        paywallView.beforeViewCreated();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        super.onStop();
        PaywallView paywallView = paywallView();
        if (paywallView == null) {
            return;
        }
        kotlinx.coroutines.k.f(this.mainScope, null, null, new C27121(paywallView, null), 3, null);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setContentView(view);
        this.contentView = view;
    }
}

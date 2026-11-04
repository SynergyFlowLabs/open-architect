package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.w0;
import androidx.lifecycle.j2;
import androidx.lifecycle.k1;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import androidx.lifecycle.n2;
import androidx.lifecycle.o1;
import androidx.lifecycle.p2;
import androidx.lifecycle.t1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class l extends androidx.core.app.m implements androidx.activity.contextaware.a, androidx.lifecycle.o0, m2, androidx.lifecycle.z, androidx.savedstate.m, m0, androidx.activity.result.l, androidx.activity.result.b, androidx.core.content.e0, androidx.core.content.f0, androidx.core.app.e0, androidx.core.app.d0, androidx.core.app.f0, androidx.core.app.g0, androidx.core.view.l0, g0 {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final c Companion = new c(null);

    @Nullable
    private l2 _viewModelStore;

    @NotNull
    private final androidx.activity.result.k activityResultRegistry;

    @androidx.annotation.j0
    private int contentLayoutId;

    @NotNull
    private final androidx.activity.contextaware.b contextAwareHelper;

    @NotNull
    private final kotlin.f0 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final kotlin.f0 fullyDrawnReporter$delegate;

    @NotNull
    private final androidx.core.view.o0 menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final kotlin.f0 onBackPressedDispatcher$delegate;

    @NotNull
    private final CopyOnWriteArrayList<androidx.core.util.e<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<androidx.core.util.e<androidx.core.app.r>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<androidx.core.util.e<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<androidx.core.util.e<androidx.core.app.k0>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<androidx.core.util.e<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final e reportFullyDrawnExecutor;

    @NotNull
    private final androidx.savedstate.l savedStateRegistryController;

    public static final class a implements androidx.lifecycle.j0 {
        a() {
        }

        @Override // androidx.lifecycle.j0
        public void e(androidx.lifecycle.o0 source, androidx.lifecycle.c0.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            l.this.t();
            l.this.getLifecycle().g(this);
        }
    }

    @w0(33)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f9949a = new b();

        private b() {
        }

        @NotNull
        public final OnBackInvokedDispatcher a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Object f9950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private l2 f9951b;

        @Nullable
        public final Object a() {
            return this.f9950a;
        }

        @Nullable
        public final l2 b() {
            return this.f9951b;
        }

        public final void c(@Nullable Object obj) {
            this.f9950a = obj;
        }

        public final void d(@Nullable l2 l2Var) {
            this.f9951b = l2Var;
        }
    }

    private interface e extends Executor {
        void o1(@NotNull View view);

        void u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9952a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Runnable f9953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9954c;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.f9953b;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                fVar.f9953b = null;
            }
        }

        @Nullable
        public final Runnable c() {
            return this.f9953b;
        }

        public final long d() {
            return this.f9952a;
        }

        public final boolean e() {
            return this.f9954c;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f9953b = runnable;
            View decorView = l.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            if (!this.f9954c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.f.b(this.f9962a);
                    }
                });
            } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final void f(@Nullable Runnable runnable) {
            this.f9953b = runnable;
        }

        public final void g(boolean z10) {
            this.f9954c = z10;
        }

        @Override // androidx.activity.l.e
        public void o1(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!this.f9954c) {
                this.f9954c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f9953b;
            if (runnable != null) {
                runnable.run();
                this.f9953b = null;
                if (l.this.getFullyDrawnReporter().e()) {
                    this.f9954c = false;
                    l.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f9952a) {
                this.f9954c = false;
                l.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.l.e
        public void u2() {
            l.this.getWindow().getDecorView().removeCallbacks(this);
            l.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class g extends androidx.activity.result.k {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g gVar, int i10, g.a.C1904a c1904a) {
            gVar.f(i10, c1904a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.e(i10, 0, new Intent().setAction(g.b.n.f275350b).putExtra(g.b.n.f275352d, sendIntentException));
        }

        @Override // androidx.activity.result.k
        public <I, O> void i(final int i10, g.a<I, O> contract, I i11, androidx.core.app.e eVar) {
            Bundle bundleN;
            final int i12;
            Intrinsics.checkNotNullParameter(contract, "contract");
            l lVar = l.this;
            final g.a.C1904a<O> synchronousResult = contract.getSynchronousResult(lVar, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.g.s(this.f9963a, i10, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(lVar, i11);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(lVar.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra(g.b.m.f275348b)) {
                bundleN = intentCreateIntent.getBundleExtra(g.b.m.f275348b);
                intentCreateIntent.removeExtra(g.b.m.f275348b);
            } else {
                bundleN = eVar != null ? eVar.n() : null;
            }
            Bundle bundle = bundleN;
            if (Intrinsics.areEqual(g.b.k.f275344b, intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(g.b.k.f275345c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.M(lVar, stringArrayExtra, i10);
                return;
            }
            if (!Intrinsics.areEqual(g.b.n.f275350b, intentCreateIntent.getAction())) {
                androidx.core.app.b.T(lVar, intentCreateIntent, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(g.b.n.f275351c);
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i12 = i10;
                try {
                    androidx.core.app.b.U(lVar, intentSenderRequest.e(), i12, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.g.t(this.f9978a, i12, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i12 = i10;
            }
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<t1> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            Application application = l.this.getApplication();
            l lVar = l.this;
            return new t1(application, lVar, lVar.getIntent() != null ? l.this.getIntent().getExtras() : null);
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function0<e0> {

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f9959a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(0);
                this.f9959a = lVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f9959a.reportFullyDrawn();
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return new e0(l.this.reportFullyDrawnExecutor, new a(l.this));
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function0<j0> {
        j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(l lVar) {
            try {
                l.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!Intrinsics.areEqual(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!Intrinsics.areEqual(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(l lVar, j0 j0Var) {
            lVar.q(j0Var);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            final l lVar = l.this;
            final j0 j0Var = new j0(new Runnable() { // from class: androidx.activity.p
                @Override // java.lang.Runnable
                public final void run() {
                    l.j.i(lVar);
                }
            });
            final l lVar2 = l.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.j.k(lVar2, j0Var);
                        }
                    });
                    return j0Var;
                }
                lVar2.q(j0Var);
            }
            return j0Var;
        }
    }

    public l() {
        this.contextAwareHelper = new androidx.activity.contextaware.b();
        this.menuHostHelper = new androidx.core.view.o0(new Runnable() { // from class: androidx.activity.f
            @Override // java.lang.Runnable
            public final void run() {
                l.v(this.f9904a);
            }
        });
        androidx.savedstate.l lVarB = androidx.savedstate.l.f75159c.b(this);
        this.savedStateRegistryController = lVarB;
        this.reportFullyDrawnExecutor = s();
        this.fullyDrawnReporter$delegate = kotlin.g0.c(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().c(new androidx.lifecycle.j0() { // from class: androidx.activity.g
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                l.m(this.f9908a, o0Var, aVar);
            }
        });
        getLifecycle().c(new androidx.lifecycle.j0() { // from class: androidx.activity.h
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                l.n(this.f9909a, o0Var, aVar);
            }
        });
        getLifecycle().c(new a());
        lVarB.c();
        o1.c(this);
        getSavedStateRegistry().d(ACTIVITY_RESULT_TAG, new androidx.savedstate.j.b() { // from class: androidx.activity.i
            @Override // androidx.savedstate.j.b
            public final Bundle a() {
                return l.o(this.f9918a);
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.d() { // from class: androidx.activity.j
            @Override // androidx.activity.contextaware.d
            public final void a(Context context) {
                l.p(this.f9919a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = kotlin.g0.c(new h());
        this.onBackPressedDispatcher$delegate = kotlin.g0.c(new j());
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.c0.a.ON_STOP || (window = lVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l lVar, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.c0.a.ON_DESTROY) {
            lVar.contextAwareHelper.b();
            if (!lVar.isChangingConfigurations()) {
                lVar.getViewModelStore().a();
            }
            lVar.reportFullyDrawnExecutor.u2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle o(l lVar) {
        Bundle bundle = new Bundle();
        lVar.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l lVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = lVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            lVar.activityResultRegistry.j(bundleA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @w0(33)
    public final void q(final j0 j0Var) {
        getLifecycle().c(new androidx.lifecycle.j0() { // from class: androidx.activity.k
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                l.r(j0Var, this, o0Var, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(j0 j0Var, l lVar, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.c0.a.ON_CREATE) {
            j0Var.s(b.f9949a.a(lVar));
        }
    }

    private final e s() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new l2();
            }
        }
    }

    private static /* synthetic */ void u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l lVar) {
        lVar.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.o1(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.l0
    public void addMenuProvider(@NotNull androidx.core.view.r0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.e0
    public final void addOnConfigurationChangedListener(@NotNull androidx.core.util.e<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // androidx.activity.contextaware.a
    public final void addOnContextAvailableListener(@NotNull androidx.activity.contextaware.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.d0
    public final void addOnMultiWindowModeChangedListener(@NotNull androidx.core.util.e<androidx.core.app.r> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.e0
    public final void addOnNewIntentListener(@NotNull androidx.core.util.e<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.f0
    public final void addOnPictureInPictureModeChangedListener(@NotNull androidx.core.util.e<androidx.core.app.k0> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.f0
    public final void addOnTrimMemoryListener(@NotNull androidx.core.util.e<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.g0
    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.l
    @NotNull
    public final androidx.activity.result.k getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z
    @androidx.annotation.i
    @NotNull
    public v2.a getDefaultViewModelCreationExtras() {
        v2.f fVar = new v2.f(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            v2.a.c<Application> cVar = j2.a.f52406h;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            fVar.c(cVar, application);
        }
        fVar.c(o1.f52458c, this);
        fVar.c(o1.f52459d, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            fVar.c(o1.f52460e, extras);
        }
        return fVar;
    }

    @Override // androidx.lifecycle.z
    @NotNull
    public j2.c getDefaultViewModelProviderFactory() {
        return (j2.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.g0
    @NotNull
    public e0 getFullyDrawnReporter() {
        return (e0) this.fullyDrawnReporter$delegate.getValue();
    }

    @kotlin.l(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.m, androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.m0
    @NotNull
    public final j0 getOnBackPressedDispatcher() {
        return (j0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.m
    @NotNull
    public final androidx.savedstate.j getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.m2
    @NotNull
    public l2 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        t();
        l2 l2Var = this._viewModelStore;
        Intrinsics.checkNotNull(l2Var);
        return l2Var;
    }

    @androidx.annotation.i
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        n2.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        p2.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        androidx.savedstate.r.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        t0.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        s0.b(decorView5, this);
    }

    @Override // androidx.core.view.l0
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    protected void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (this.activityResultRegistry.e(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @kotlin.l(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    @androidx.annotation.l0
    public void onBackPressed() {
        getOnBackPressedDispatcher().p();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<androidx.core.util.e<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        k1.f52422b.d(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            this.menuHostHelper.f(menu, getMenuInflater());
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @kotlin.l(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z10) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<androidx.core.util.e<androidx.core.app.r>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.r(z10));
            }
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<androidx.core.util.e<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @kotlin.l(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<androidx.core.util.e<androidx.core.app.k0>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.k0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            this.menuHostHelper.i(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i10, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.e(i10, -1, new Intent().putExtra(g.b.k.f275345c, permissions).putExtra(g.b.k.f275346d, grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @kotlin.l(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        l2 l2VarB = this._viewModelStore;
        if (l2VarB == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            l2VarB = dVar.b();
        }
        if (l2VarB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(l2VarB);
        return dVar2;
    }

    @Override // androidx.core.app.m, android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.q0) {
            androidx.lifecycle.c0 lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.q0) lifecycle).v(androidx.lifecycle.c0.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @androidx.annotation.i
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.e<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.a
    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    @Override // androidx.activity.result.b
    @NotNull
    public final <I, O> androidx.activity.result.h<I> registerForActivityResult(@NotNull g.a<I, O> contract, @NotNull androidx.activity.result.k registry, @NotNull androidx.activity.result.a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.l0
    public void removeMenuProvider(@NotNull androidx.core.view.r0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // androidx.core.content.e0
    public final void removeOnConfigurationChangedListener(@NotNull androidx.core.util.e<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.activity.contextaware.a
    public final void removeOnContextAvailableListener(@NotNull androidx.activity.contextaware.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.d0
    public final void removeOnMultiWindowModeChangedListener(@NotNull androidx.core.util.e<androidx.core.app.r> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.e0
    public final void removeOnNewIntentListener(@NotNull androidx.core.util.e<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.f0
    public final void removeOnPictureInPictureModeChangedListener(@NotNull androidx.core.util.e<androidx.core.app.k0> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.f0
    public final void removeOnTrimMemoryListener(@NotNull androidx.core.util.e<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.g0
    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.i()) {
                androidx.tracing.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().d();
            androidx.tracing.b.f();
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@androidx.annotation.j0 int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.o1(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i10) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i10, @Nullable Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // androidx.core.view.l0
    public void addMenuProvider(@NotNull androidx.core.view.r0 provider, @NotNull androidx.lifecycle.o0 owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent, int i10, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @kotlin.l(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intent, int i10, @Nullable Intent intent2, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // androidx.core.view.l0
    @e.a({"LambdaLast"})
    public void addMenuProvider(@NotNull androidx.core.view.r0 provider, @NotNull androidx.lifecycle.o0 owner, @NotNull androidx.lifecycle.c0.b state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Override // androidx.activity.result.b
    @NotNull
    public final <I, O> androidx.activity.result.h<I> registerForActivityResult(@NotNull g.a<I, O> contract, @NotNull androidx.activity.result.a<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @w0(api = 26)
    public void onMultiWindowModeChanged(boolean z10, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.e<androidx.core.app.r>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.r(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @w0(api = 26)
    public void onPictureInPictureModeChanged(boolean z10, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        int i10 = 2 & 0;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.e<androidx.core.app.k0>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.k0(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.o1(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        eVar.o1(decorView);
        super.setContentView(view, layoutParams);
    }

    @androidx.annotation.o
    public l(@androidx.annotation.j0 int i10) {
        this();
        this.contentLayoutId = i10;
    }
}

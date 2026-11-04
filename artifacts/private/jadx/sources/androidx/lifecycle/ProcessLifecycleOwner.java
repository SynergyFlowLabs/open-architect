package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessLifecycleOwner implements o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f52140j = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52143b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Handler f52146e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f52139i = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final ProcessLifecycleOwner f52141k = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52144c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52145d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q0 f52147f = new q0(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Runnable f52148g = new Runnable() { // from class: androidx.lifecycle.h1
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.i(this.f52358a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final k1.a f52149h = new d();

    @androidx.annotation.w0(29)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f52150a = new a();

        private a() {
        }

        @oj.n
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.annotation.l1
        public static /* synthetic */ void b() {
        }

        @oj.n
        @NotNull
        public final o0 a() {
            return ProcessLifecycleOwner.f52141k;
        }

        @oj.n
        public final void c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.f52141k.h(context);
        }

        private b() {
        }
    }

    public static final class c extends t {

        public static final class a extends t {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.t, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // androidx.lifecycle.t, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @androidx.annotation.w0(29)
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.t, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ProcessLifecycleOwner.this.g();
        }
    }

    public static final class d implements k1.a {
        d() {
        }

        @Override // androidx.lifecycle.k1.a
        public void l() {
            ProcessLifecycleOwner.this.e();
        }

        @Override // androidx.lifecycle.k1.a
        public void m() {
            ProcessLifecycleOwner.this.f();
        }

        @Override // androidx.lifecycle.k1.a
        public void n() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.j();
        processLifecycleOwner.k();
    }

    @oj.n
    @NotNull
    public static final o0 l() {
        return f52139i.a();
    }

    @oj.n
    public static final void m(@NotNull Context context) {
        f52139i.c(context);
    }

    public final void d() {
        int i10 = this.f52143b - 1;
        this.f52143b = i10;
        if (i10 == 0) {
            Handler handler = this.f52146e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f52148g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f52143b + 1;
        this.f52143b = i10;
        if (i10 == 1) {
            if (this.f52144c) {
                this.f52147f.o(c0.a.ON_RESUME);
                this.f52144c = false;
            } else {
                Handler handler = this.f52146e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f52148g);
            }
        }
    }

    public final void f() {
        int i10 = this.f52142a + 1;
        this.f52142a = i10;
        if (i10 == 1 && this.f52145d) {
            this.f52147f.o(c0.a.ON_START);
            this.f52145d = false;
        }
    }

    public final void g() {
        this.f52142a--;
        k();
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public c0 getLifecycle() {
        return this.f52147f;
    }

    public final void h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52146e = new Handler();
        this.f52147f.o(c0.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f52143b == 0) {
            this.f52144c = true;
            this.f52147f.o(c0.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f52142a == 0 && this.f52144c) {
            this.f52147f.o(c0.a.ON_STOP);
            int i10 = 4 << 1;
            this.f52145d = true;
        }
    }
}

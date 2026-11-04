package com.google.vr.ndk.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
class e0 extends com.google.vr.vrcore.library.api.b.a {
    static final long X = 100;
    static final float Y = 0.2f;
    private static final float Z = 0.35f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f127045v = "GvrUiLayoutImpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f127046w = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ObjectAnimator f127047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f127048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f127049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.vr.cardboard.x f127050o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f127051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f127052t;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f127053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f127054b;

        a(Context context, Intent intent) {
            this.f127053a = context;
            this.f127054b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f127053a.startActivity(this.f127054b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f127055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f127056b;

        b(Activity activity, Intent intent) {
            this.f127055a = activity;
            this.f127056b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f127055a.startActivity(this.f127056b);
            this.f127055a.finish();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f127057a;

        c(Activity activity) {
            this.f127057a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f127057a.onBackPressed();
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f127058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f127059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f127060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f127061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f127062e = false;

        d(Context context, Runnable runnable, n nVar) {
            this.f127058a = context;
            this.f127060c = runnable;
            Runnable runnableL = e0.L(context, nVar);
            this.f127059b = runnableL;
            this.f127061d = runnableL;
        }

        public void a(Runnable runnable) {
            if (runnable == null) {
                runnable = this.f127059b;
            }
            this.f127061d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f127062e) {
                Activity activityB = com.google.vr.cardboard.f.b(this.f127058a);
                if (activityB != null) {
                    activityB.finish();
                }
                return;
            }
            this.f127062e = true;
            try {
                Runnable runnable = this.f127060c;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.f127061d;
                if (runnable2 != null) {
                    runnable2.run();
                }
            } finally {
                this.f127062e = false;
            }
        }
    }

    e0(Context context, Runnable runnable) {
        this(context, runnable, new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Runnable L(Context context, n nVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        Activity activityB = com.google.vr.cardboard.f.b(context);
        if (activityB == null) {
            return new a(context, intent);
        }
        return nVar.c(activityB) ? new b(activityB, intent) : new c(activityB);
    }

    private void M(long j10) {
        w();
        Q().postDelayed(this.f127049n, j10);
    }

    private void a0() {
        this.f127050o.A(new Runnable(this) { // from class: com.google.vr.ndk.base.d0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e0 f127036a;

            {
                this.f127036a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f127036a.W();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void v() {
        w();
        if (this.f127050o.w()) {
            Q().postDelayed(this.f127048m, X);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f127050o.t(), (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.2f);
        this.f127047l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        this.f127047l.start();
        a0();
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void N4(boolean z10) {
        this.f127050o.C(z10);
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void Nc(com.google.vr.vrcore.library.api.c cVar) {
        this.f127050o.F(cVar != null ? (Runnable) com.google.vr.vrcore.library.api.f.s(cVar, Runnable.class) : null);
    }

    void O() {
        M(2500L);
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void O2(com.google.vr.vrcore.library.api.c cVar) {
        this.f127051s.a(cVar != null ? (Runnable) com.google.vr.vrcore.library.api.f.s(cVar, Runnable.class) : null);
    }

    ViewGroup Q() {
        return this.f127050o.t();
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void Q5(com.google.vr.vrcore.library.api.c cVar) {
        this.f127050o.D(cVar != null ? (Runnable) com.google.vr.vrcore.library.api.f.s(cVar, Runnable.class) : null);
    }

    com.google.vr.cardboard.x S() {
        return this.f127050o;
    }

    void U() {
        this.f127051s.run();
    }

    boolean V() {
        return this.f127052t;
    }

    final /* synthetic */ void W() {
        M(5000L);
    }

    void Z(boolean z10) {
        if (this.f127052t == z10) {
            return;
        }
        this.f127052t = z10;
        if (!z10) {
            this.f127050o.y(1.0f);
        } else {
            this.f127050o.y(Z);
            this.f127050o.E(false);
        }
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void d1(boolean z10) {
        this.f127050o.E(z10 && !this.f127052t);
    }

    @Override // com.google.vr.vrcore.library.api.b
    public com.google.vr.vrcore.library.api.c getRootView() {
        return com.google.vr.vrcore.library.api.f.u(this.f127050o.t());
    }

    @Override // com.google.vr.vrcore.library.api.b
    public boolean isEnabled() {
        return this.f127050o.v();
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void p9(String str) {
        this.f127050o.G(str);
    }

    @Override // com.google.vr.vrcore.library.api.b
    public void setEnabled(boolean z10) {
        this.f127050o.B(z10);
    }

    void w() {
        Q().removeCallbacks(this.f127049n);
        ObjectAnimator objectAnimator = this.f127047l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f127047l = null;
        }
        this.f127050o.t().setAlpha(1.0f);
        this.f127050o.A(null);
    }

    e0(Context context, Runnable runnable, n nVar) {
        this.f127048m = new Runnable(this) { // from class: com.google.vr.ndk.base.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e0 f127019a;

            {
                this.f127019a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f127019a.O();
            }
        };
        this.f127049n = new Runnable(this) { // from class: com.google.vr.ndk.base.c0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e0 f127022a;

            {
                this.f127022a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f127022a.v();
            }
        };
        this.f127052t = false;
        d dVar = new d(context, runnable, nVar);
        this.f127051s = dVar;
        com.google.vr.cardboard.x xVar = new com.google.vr.cardboard.x(context);
        this.f127050o = xVar;
        xVar.z(dVar);
    }
}

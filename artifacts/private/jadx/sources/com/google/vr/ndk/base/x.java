package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Presentation;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class x extends FrameLayout {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f127285j3 = "GvrLayoutImpl";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final boolean f127286k3 = false;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f127287l3 = 16;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f127288m3 = 50;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f127289n3 = -1;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static g f127290o3;
    private boolean H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f127291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f127292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f127293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DisplaySynchronizer f127294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f127295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f127296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f127297g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private j f127298g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.vr.cardboard.t f127299h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private f f127300h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EglReadyListener f127301i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f127302i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.vr.cardboard.h f127303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f127304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f127305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h f127306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p0 f127307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h0 f127308o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f127309p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private r f127310p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final Runnable f127311p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.vr.ndk.base.i f127312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f127313t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.vr.cardboard.b f127314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GvrApi f127315w;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.J(0);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x.this.f127307n != null) {
                x.this.f127307n.y();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.f127299h.b();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.f127293c.U();
        }
    }

    static class e extends z {

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        private com.google.vr.cardboard.t f127320m3;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f127320m3.c();
            }
        }

        e(Context context) {
            super(context);
        }

        @Override // com.google.vr.ndk.base.z, android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (l() || this.f127320m3 == null) {
                p(null);
            } else {
                p(new a());
            }
        }

        public void v(com.google.vr.cardboard.t tVar) {
            this.f127320m3 = tVar;
            super.setRenderer(tVar);
        }
    }

    static class f implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f127322c = 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f127323a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f127324b;

        public void a() {
            if (this.f127324b > 0) {
                this.f127323a.removeFrameCallback(this);
            }
            this.f127324b = 5;
            this.f127323a.postFrameCallback(this);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            int i10 = this.f127324b - 1;
            this.f127324b = i10;
            if (i10 > 0) {
                this.f127323a.postFrameCallback(this);
            }
        }
    }

    interface g {
        Presentation a(Context context, Display display);
    }

    static class h implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f127326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DisplayManager f127327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DisplaySynchronizer f127328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FrameLayout f127329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final View f127330f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f127332h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Presentation f127333i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RelativeLayout.LayoutParams f127325a = new RelativeLayout.LayoutParams(-1, -1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<i> f127331g = new ArrayList();

        h(Context context, FrameLayout frameLayout, View view, DisplaySynchronizer displaySynchronizer, String str) {
            this.f127326b = context;
            this.f127329e = frameLayout;
            this.f127330f = view;
            this.f127328d = displaySynchronizer;
            this.f127332h = str;
            this.f127327c = (DisplayManager) context.getSystemService("display");
        }

        private static void b(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }

        private boolean c() {
            Presentation presentation = this.f127333i;
            if (presentation == null) {
                return false;
            }
            if (presentation.isShowing() && this.f127333i.getDisplay().isValid()) {
                return false;
            }
            return true;
        }

        private boolean e(Display display) {
            return display != null && display.isValid() && display.getName().equals(this.f127332h);
        }

        private void i(Display display) {
            Presentation presentation = this.f127333i;
            Display display2 = presentation != null ? presentation.getDisplay() : null;
            if (c() || !com.google.vr.cardboard.g.h(display, display2)) {
                Presentation presentation2 = this.f127333i;
                if (presentation2 != null) {
                    presentation2.dismiss();
                    this.f127333i = null;
                }
                b(this.f127330f);
                if (display != null) {
                    Presentation presentationA = x.f127290o3 != null ? x.f127290o3.a(this.f127326b, display) : new Presentation(this.f127326b, display);
                    this.f127333i = presentationA;
                    presentationA.addContentView(this.f127330f, this.f127325a);
                    try {
                        this.f127333i.show();
                    } catch (WindowManager.InvalidDisplayException e10) {
                        new StringBuilder(String.valueOf(e10).length() + 57);
                        this.f127333i.cancel();
                        this.f127333i = null;
                        b(this.f127330f);
                        this.f127329e.addView(this.f127330f, 0);
                    }
                } else {
                    this.f127329e.addView(this.f127330f, 0);
                }
                DisplaySynchronizer displaySynchronizer = this.f127328d;
                Presentation presentation3 = this.f127333i;
                displaySynchronizer.i(presentation3 != null ? presentation3.getDisplay() : com.google.vr.cardboard.g.c(this.f127326b));
                if (presentation2 != null) {
                    Iterator<i> it = this.f127331g.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
                if (this.f127333i != null) {
                    Iterator<i> it2 = this.f127331g.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this.f127333i.getDisplay());
                    }
                }
            }
        }

        public void a(i iVar) {
            if (this.f127331g.contains(iVar)) {
                return;
            }
            this.f127331g.add(iVar);
            Presentation presentation = this.f127333i;
            if (presentation != null) {
                iVar.b(presentation.getDisplay());
            }
        }

        public boolean d() {
            Presentation presentation = this.f127333i;
            return presentation != null && presentation.isShowing();
        }

        public void f() {
            this.f127327c.unregisterDisplayListener(this);
            i(null);
        }

        public void g() {
            this.f127327c.unregisterDisplayListener(this);
        }

        public void h() {
            String strF = com.google.vr.cardboard.g.f(this.f127326b);
            this.f127332h = strF;
            Display display = null;
            if (strF == null) {
                i(null);
                return;
            }
            this.f127327c.registerDisplayListener(this, null);
            for (Display display2 : this.f127327c.getDisplays()) {
                if (e(display2)) {
                    display = display2;
                    break;
                }
            }
            i(display);
        }

        public void j() {
            this.f127327c.unregisterDisplayListener(this);
            Presentation presentation = this.f127333i;
            if (presentation != null) {
                presentation.cancel();
                this.f127333i = null;
                Iterator<i> it = this.f127331g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            Display display = this.f127327c.getDisplay(i10);
            if (e(display)) {
                i(display);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            Presentation presentation = this.f127333i;
            if (presentation != null && presentation.getDisplay().getDisplayId() == i10) {
                i(null);
            }
        }
    }

    interface i {
        void a();

        void b(Display display);
    }

    static class j implements GvrApi.IdleListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f127334f = TimeUnit.SECONDS.toMillis(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f127335a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f127336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f127337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f127338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f127339e;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f127340a;

            a(boolean z10) {
                this.f127340a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = j.this.f127335a;
                boolean z11 = this.f127340a;
                if (z10 == z11) {
                    return;
                }
                j.this.f127335a = z11;
                j.this.k();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f127342a;

            b(boolean z10) {
                this.f127342a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                l0.a("GvrLayoutImpl.onIdleChanged");
                try {
                    if (SystemClock.elapsedRealtime() - j.this.f127338d < j.f127334f) {
                        l0.b();
                        return;
                    }
                    boolean unused = j.this.f127337c;
                    j.this.f127337c = this.f127342a;
                    j.this.k();
                    l0.b();
                } catch (Throwable th2) {
                    l0.b();
                    throw th2;
                }
            }
        }

        public j(View view) {
            this.f127339e = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.f127339e.setKeepScreenOn(this.f127335a && this.f127336b && !this.f127337c);
        }

        public void h() {
            this.f127336b = false;
            k();
        }

        public void i() {
            this.f127336b = true;
            this.f127337c = false;
            this.f127338d = SystemClock.elapsedRealtime();
            k();
        }

        public void j(boolean z10) {
            com.google.vr.cardboard.v.a(new a(z10));
        }

        @Override // com.google.vr.ndk.base.GvrApi.IdleListener
        public void onIdleChanged(boolean z10) {
            com.google.vr.cardboard.v.a(new b(z10));
        }
    }

    public x(Context context) {
        this(context, null);
    }

    static void A(g gVar) {
        f127290o3 = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void v(boolean z10) {
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        I();
        this.f127293c.setEnabled(z10);
        p0 p0Var = this.f127307n;
        if (p0Var != null) {
            p0Var.E(z10);
        }
        s sVar = this.f127304k;
        if (sVar != null) {
            sVar.setEnabled(z10);
        }
        h0 h0Var = this.f127308o;
        if (h0Var != null) {
            h0Var.m(z10);
        }
        q qVar = this.f127313t;
        if (qVar != null) {
            qVar.setEnabled(z10);
        }
        this.f127298g3.j(z10);
        J(0);
    }

    private h G() {
        String strF = com.google.vr.cardboard.g.f(getContext());
        if (strF == null) {
            return null;
        }
        return new h(getContext(), this, this.f127292b, this.f127294d, strF);
    }

    private void H() {
        s sVar = this.f127304k;
        if (sVar == null) {
            return;
        }
        if (!this.f127305l) {
            if (this.f127309p0) {
                sVar.g();
                return;
            } else {
                sVar.f();
                return;
            }
        }
        boolean z10 = this.f127302i3 && getWindowVisibility() == 0;
        if (z10 && this.f127309p0) {
            this.f127304k.g();
            removeCallbacks(this.f127311p2);
            postDelayed(this.f127311p2, 50L);
        } else {
            if (z10 || this.f127309p0) {
                return;
            }
            this.f127304k.f();
            J(4);
            removeCallbacks(this.f127311p2);
        }
    }

    private void I() {
        Activity activityB = com.google.vr.cardboard.f.b(getContext());
        if (activityB == null || activityB.getWindow() == null || !this.f127314v.a(activityB.getWindow())) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (this.H1) {
            com.google.vr.cardboard.b.a aVarB = this.f127314v.b(com.google.vr.cardboard.g.c(getContext()));
            if (aVarB != null) {
                layoutParams.setMargins(aVarB.c(), aVarB.e(), aVarB.d(), aVarB.b());
            }
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i10) {
        View view = this.f127295e;
        if (view != null) {
            view.setVisibility(this.H1 ? i10 : 0);
        }
        e eVar = this.f127297g;
        if (eVar != null) {
            if (!this.H1) {
                i10 = 8;
            }
            eVar.setVisibility(i10);
        }
    }

    private void K() {
        boolean z10 = true;
        if (this.f127315w.C() != 1) {
            z10 = false;
        }
        this.f127293c.Z(z10);
    }

    private void g() {
        if (this.f127297g != null) {
            return;
        }
        com.google.vr.cardboard.h hVar = new com.google.vr.cardboard.h();
        this.f127303j = hVar;
        hVar.d(this.f127315w.H());
        int i10 = 3 & 1;
        this.f127303j.e(true);
        this.f127303j.f((this.f127296f & 1) != 0);
        this.f127303j.a(3);
        e eVar = new e(getContext());
        this.f127297g = eVar;
        eVar.setEGLConfigChooser(new com.google.vr.cardboard.p());
        this.f127297g.setZOrderMediaOverlay(true);
        this.f127297g.setEGLContextFactory(this.f127303j);
        this.f127297g.setEGLWindowSurfaceFactory(this.f127303j);
        if (r()) {
            this.f127297g.setEglReadyListener(this.f127301i);
        }
        if (!this.H1) {
            this.f127297g.setVisibility(8);
        }
        if (this.f127299h == null) {
            this.f127299h = new com.google.vr.cardboard.t(this.f127315w);
        }
        this.f127299h.e(this.f127297g);
        this.f127297g.v(this.f127299h);
        this.f127297g.setSwapMode(1);
        if (!this.f127309p0) {
            this.f127297g.m();
        }
        this.f127292b.addView(this.f127297g, 0);
    }

    private void p(q qVar) {
        DisplaySynchronizer displaySynchronizerG = GvrApi.g(getContext());
        q(new GvrApi(getContext(), displaySynchronizerG), displaySynchronizerG, new EglReadyListener(), null, new n(), qVar, new e0(getContext(), new b()), new com.google.vr.cardboard.b());
    }

    private void q(GvrApi gvrApi, DisplaySynchronizer displaySynchronizer, EglReadyListener eglReadyListener, s sVar, n nVar, q qVar, e0 e0Var, com.google.vr.cardboard.b bVar) {
        this.f127315w = gvrApi;
        if (r()) {
            gvrApi.T(eglReadyListener);
        }
        this.f127291a = nVar;
        this.f127292b = new FrameLayout(getContext());
        this.f127293c = e0Var;
        this.f127294d = displaySynchronizer;
        this.f127301i = eglReadyListener;
        this.f127306m = G();
        this.f127300h3 = new f();
        addView(this.f127292b, 0);
        addView(e0Var.Q(), 1);
        K();
        boolean zE = nVar.e(getContext());
        if (zE) {
            this.f127308o = h();
            e0Var.Q().setOnTouchListener(this.f127308o);
        }
        l lVarB = nVar.b(getContext());
        boolean zF = lVarB.f();
        boolean zC = lVarB.c();
        if (zE || zC) {
            if (zF) {
                if (getContext() instanceof com.google.vr.cardboard.z) {
                    this.f127305l = ((com.google.vr.cardboard.z) getContext()).a();
                }
                if (sVar == null) {
                    sVar = new s(getContext(), this.f127305l);
                }
                this.f127304k = sVar;
                addView(sVar, 2);
            }
            this.f127307n = i(getContext(), gvrApi, nVar, this.f127304k);
        }
        this.f127298g3 = new j(this);
        if (s()) {
            gvrApi.d0(this.f127298g3);
        }
        if (qVar != null) {
            qVar.c(this, gvrApi);
            if (gvrApi.m0()) {
                e0Var.Q().setVisibility(8);
            }
        }
        this.f127313t = qVar;
        this.f127314v = bVar;
    }

    private boolean r() {
        Long l10;
        GvrApi gvrApi = this.f127315w;
        if (gvrApi == null) {
            throw new IllegalStateException("GvrApi must be ready before isContextSharingEnabled is called");
        }
        com.google.common.logging.nano.a.C1088a.m.C1100a c1100a = gvrApi.z().f119290i;
        return (c1100a == null || (l10 = c1100a.f119303c) == null || (l10.longValue() & 16) == 0) ? false : true;
    }

    private boolean s() {
        if (this.f127315w.z().f119292k == null) {
            return false;
        }
        return this.f127315w.z().f119292k.booleanValue();
    }

    private boolean t() {
        Boolean bool;
        GvrApi gvrApi = this.f127315w;
        if (gvrApi == null || (bool = gvrApi.z().Y) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void B(View view) {
        View view2 = this.f127295e;
        if (view2 != null) {
            this.f127292b.removeView(view2);
        }
        this.f127292b.addView(view, 0);
        this.f127295e = view;
    }

    public void C(PendingIntent pendingIntent) {
        p0 p0Var = this.f127307n;
        if (p0Var != null) {
            p0Var.G(pendingIntent);
        }
    }

    public void D(final boolean z10) {
        com.google.vr.cardboard.v.a(new Runnable(this, z10) { // from class: com.google.vr.ndk.base.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f127283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f127284b;

            {
                this.f127283a = this;
                this.f127284b = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f127283a.v(this.f127284b);
            }
        });
    }

    public void F() {
        this.f127294d.j();
        h0 h0Var = this.f127308o;
        if (h0Var != null) {
            h0Var.u();
        }
        removeView(this.f127292b);
        removeView(this.f127293c.Q());
        this.f127299h = null;
        r rVar = this.f127310p1;
        if (rVar != null) {
            rVar.e();
            this.f127310p1 = null;
        }
        this.f127297g = null;
        this.f127295e = null;
        h hVar = this.f127306m;
        if (hVar != null) {
            hVar.j();
            this.f127306m = null;
        }
        p0 p0Var = this.f127307n;
        if (p0Var != null) {
            p0Var.z();
            this.f127307n = null;
        }
        com.google.vr.ndk.base.i iVar = this.f127312s;
        if (iVar != null) {
            iVar.b();
            this.f127312s = null;
        }
        q qVar = this.f127313t;
        if (qVar != null) {
            qVar.shutdown();
            this.f127313t = null;
        }
        GvrApi gvrApi = this.f127315w;
        if (gvrApi != null) {
            gvrApi.j0();
            this.f127315w = null;
        }
    }

    void f(i iVar) {
        h hVar = this.f127306m;
        if (hVar != null) {
            hVar.a(iVar);
        }
    }

    h0 h() {
        return new h0(this);
    }

    protected p0 i(Context context, GvrApi gvrApi, n nVar, s sVar) {
        return new p0(context, gvrApi, com.google.vr.cardboard.f.c(context), nVar, new d(), sVar);
    }

    public boolean j(int i10) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Async reprojection may only be enabled from the UI thread");
        }
        int i11 = this.f127296f;
        if (i11 != -1) {
            if ((i11 & i10) == i10) {
                return true;
            }
            throw new UnsupportedOperationException("Async reprojection flags cannot be added once initialized.");
        }
        if (this.f127297g != null) {
            return true;
        }
        if (!this.f127291a.e(getContext()) || !this.f127315w.Z(true)) {
            return false;
        }
        this.f127296f = i10;
        if (this.f127315w.m0()) {
            this.f127294d.b();
        } else {
            g();
        }
        return true;
    }

    public boolean k(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("The Cardboard trigger listener must not be null.");
        }
        if (this.f127312s != null) {
            return true;
        }
        if (!this.f127291a.e(getContext())) {
            return false;
        }
        this.f127312s = new com.google.vr.ndk.base.i(getContext(), runnable);
        return true;
    }

    s l() {
        return this.f127304k;
    }

    public GvrApi m() {
        return this.f127315w;
    }

    public e0 n() {
        return this.f127293c;
    }

    p0 o() {
        return this.f127307n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f127302i3 = true;
        H();
        I();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f127294d.f();
        I();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f127302i3 = false;
        H();
        super.onDetachedFromWindow();
        h hVar = this.f127306m;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f127295e != null && u() && this.f127295e.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        H();
        if (t()) {
            if (i10 == 0) {
                this.f127293c.O();
            } else {
                this.f127293c.w();
            }
        }
    }

    boolean u() {
        h hVar;
        return (this.f127295e == null || (hVar = this.f127306m) == null || !hVar.d()) ? false : true;
    }

    public void w() {
        this.f127293c.U();
    }

    public void x() {
        p0 p0Var;
        if (this.f127313t != null && (p0Var = this.f127307n) != null && p0Var.t() != null) {
            this.f127313t.a(this.f127307n.t());
        }
        this.f127315w.L();
        e eVar = this.f127297g;
        if (eVar != null) {
            eVar.n(new c());
        }
        h hVar = this.f127306m;
        if (hVar != null) {
            hVar.g();
        }
        this.f127294d.g();
        p0 p0Var2 = this.f127307n;
        if (p0Var2 != null) {
            p0Var2.z();
        }
        com.google.vr.ndk.base.i iVar = this.f127312s;
        if (iVar != null) {
            iVar.b();
        }
        q qVar = this.f127313t;
        if (qVar != null) {
            qVar.d();
        }
        this.f127298g3.h();
        this.f127309p0 = false;
        H();
    }

    public void y() {
        this.f127315w.V();
        h0 h0Var = this.f127308o;
        if (h0Var != null) {
            h0Var.t();
        }
        this.f127294d.h();
        h hVar = this.f127306m;
        if (hVar != null) {
            hVar.h();
        }
        e eVar = this.f127297g;
        if (eVar != null) {
            eVar.o();
        }
        p0 p0Var = this.f127307n;
        if (p0Var != null) {
            p0Var.A();
        }
        if (this.f127312s != null && this.f127315w.C() == 1) {
            this.f127312s.c();
        }
        q qVar = this.f127313t;
        if (qVar != null) {
            qVar.l();
        }
        this.f127298g3.i();
        this.f127300h3.a();
        this.f127309p0 = true;
        H();
        K();
    }

    public boolean z(Runnable runnable) {
        p0 p0Var = this.f127307n;
        if (p0Var == null) {
            return false;
        }
        p0Var.F(runnable);
        return true;
    }

    public x(Context context, q qVar) {
        super(context);
        this.f127296f = -1;
        this.f127305l = true;
        this.f127309p0 = false;
        this.H1 = true;
        this.f127311p2 = new a();
        if (!(context instanceof com.google.vr.cardboard.z) && com.google.vr.cardboard.f.b(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        p(qVar);
    }

    x(Context context, GvrApi gvrApi, DisplaySynchronizer displaySynchronizer, EglReadyListener eglReadyListener, s sVar, n nVar, q qVar, e0 e0Var, com.google.vr.cardboard.b bVar) {
        super(context);
        this.f127296f = -1;
        this.f127305l = true;
        this.f127309p0 = false;
        this.H1 = true;
        this.f127311p2 = new a();
        q(gvrApi, displaySynchronizer, eglReadyListener, sVar, nVar, qVar, e0Var, bVar);
    }
}

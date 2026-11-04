package com.google.vr.cardboard;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f126931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f126932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f126933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f126934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f126935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageButton f126936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f126937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w f126938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RelativeLayout f126939i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile Runnable f126945o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile String f126948r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f126950t;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f126940j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f126941k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f126942l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Runnable f126943m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Runnable f126944n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile Runnable f126946p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f126947q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile float f126949s = 1.0f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f126951a;

        a(float f10) {
            this.f126951a = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) x.this.f126937g.getLayoutParams();
            x.x(x.this.f126931a, this.f126951a, layoutParams);
            x.this.f126937g.setLayoutParams(layoutParams);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f126953a;

        b(boolean z10) {
            this.f126953a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f126953a || x.this.f126938h != null) {
                x.this.s().setVisibility(x.p(this.f126953a));
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f126955a;

        c(Runnable runnable) {
            this.f126955a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f126955a == null && x.this.f126938h == null) {
                return;
            }
            x.this.s().setTransitionListener(this.f126955a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f126957a;

        d(String str) {
            this.f126957a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x.this.f126938h != null) {
                x.this.f126938h.setViewerName(this.f126957a);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.b(x.this.f126931a);
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Runnable runnable = x.this.f126943m;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Runnable runnable = x.this.f126945o;
            Runnable runnable2 = x.this.f126943m;
            if (runnable2 != null) {
                runnable2.run();
            } else if (runnable != null) {
                runnable.run();
            }
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Runnable runnable = x.this.f126943m;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Runnable runnable = x.this.f126944n;
            Runnable runnable2 = x.this.f126943m;
            if (runnable2 != null) {
                runnable2.run();
            } else if (runnable != null) {
                runnable.run();
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f126964a;

        j(boolean z10) {
            this.f126964a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.f126932b.setVisibility(x.p(this.f126964a));
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f126966a;

        k(boolean z10) {
            this.f126966a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.f126934d.setVisibility(x.p(this.f126966a));
            if (x.this.f126933c != null) {
                x.this.f126933c.setVisibility(x.p(this.f126966a));
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f126968a;

        l(Runnable runnable) {
            this.f126968a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = this.f126968a != null;
            x.this.f126936f.setVisibility(x.p(z10));
            if (x.this.f126935e != null) {
                x.this.f126935e.setVisibility(x.p(z10));
            }
            if (x.this.f126938h != null) {
                x.this.f126938h.setBackButtonListener(this.f126968a);
            }
        }
    }

    class m extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Configuration f126970a;

        m(Context context) {
            super(context);
            this.f126970a = new Configuration(context.getResources().getConfiguration());
        }

        private void a(Configuration configuration) {
            int iDiff = configuration.diff(this.f126970a);
            if ((iDiff & 4096) == 0 && (iDiff & 128) == 0) {
                return;
            }
            this.f126970a = new Configuration(configuration);
            x xVar = x.this;
            xVar.u(xVar.f126950t);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            a(x.this.f126931a.getResources().getConfiguration());
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            a(configuration);
        }
    }

    public x(Context context) {
        int i10 = 7 >> 1;
        this.f126931a = context;
        this.f126932b = new m(context);
        u(s.e.f126884d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(boolean z10) {
        return z10 ? 0 : 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w s() {
        if (this.f126938h == null) {
            this.f126938h = new w(this.f126931a);
            this.f126938h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f126938h.setVisibility(p(this.f126947q));
            if (this.f126948r != null) {
                this.f126938h.setViewerName(this.f126948r);
            }
            if (this.f126946p != null) {
                this.f126938h.setTransitionListener(this.f126946p);
            }
            this.f126938h.setBackButtonListener(this.f126944n);
            this.f126939i.addView(this.f126938h);
        }
        return this.f126938h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i10) {
        this.f126950t = i10;
        w wVar = this.f126938h;
        boolean z10 = (wVar == null || wVar.getParent() == null) ? false : true;
        this.f126938h = null;
        RelativeLayout relativeLayout = this.f126939i;
        if (relativeLayout != null) {
            this.f126932b.removeView(relativeLayout);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.f126931a).inflate(i10, (ViewGroup) null, false);
        this.f126939i = relativeLayout2;
        this.f126932b.addView(relativeLayout2);
        if (z10) {
            E(this.f126947q);
        }
        this.f126945o = new e();
        View viewFindViewById = this.f126939i.findViewById(s.d.f126880n);
        this.f126933c = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(p(this.f126941k));
            this.f126933c.setOnClickListener(new f());
        }
        ImageButton imageButton = (ImageButton) this.f126939i.findViewById(s.d.f126879m);
        this.f126934d = imageButton;
        imageButton.setVisibility(p(this.f126941k));
        this.f126934d.setContentDescription("Settings");
        this.f126934d.setOnClickListener(new g());
        View viewFindViewById2 = this.f126939i.findViewById(s.d.f126878l);
        this.f126935e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(p(r()));
            this.f126935e.setOnClickListener(new h());
        }
        ImageButton imageButton2 = (ImageButton) this.f126939i.findViewById(s.d.f126877k);
        this.f126936f = imageButton2;
        imageButton2.setVisibility(p(r()));
        this.f126936f.setOnClickListener(new i());
        if (ActivityManager.isRunningInTestHarness()) {
            View view = this.f126933c;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.f126933c.setLayoutParams(layoutParams);
            }
            View view2 = this.f126935e;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.width = -2;
                this.f126935e.setLayoutParams(layoutParams2);
            }
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f126939i.findViewById(s.d.f126876j);
        this.f126937g = relativeLayout3;
        relativeLayout3.setVisibility(p(q()));
        y(this.f126949s);
    }

    @e.b(23)
    public static void x(Context context, float f10, RelativeLayout.LayoutParams layoutParams) {
        int dimension = (int) (((int) context.getResources().getDimension(s.b.f126860a)) * f10);
        if (layoutParams.getRule(15) == -1) {
            layoutParams.width = dimension;
        } else {
            layoutParams.height = dimension;
        }
    }

    public void A(Runnable runnable) {
        this.f126943m = runnable;
    }

    public void B(boolean z10) {
        this.f126940j = z10;
        v.a(new j(z10));
    }

    public void C(boolean z10) {
        this.f126941k = z10;
        v.a(new k(z10));
    }

    public void D(Runnable runnable) {
        this.f126945o = runnable;
    }

    public void E(boolean z10) {
        this.f126947q = z10;
        v.a(new b(z10));
    }

    public void F(Runnable runnable) {
        this.f126946p = runnable;
        v.a(new c(runnable));
    }

    public void G(String str) {
        this.f126948r = str;
        v.a(new d(str));
    }

    public boolean q() {
        return this.f126942l;
    }

    public boolean r() {
        return this.f126944n != null;
    }

    public ViewGroup t() {
        return this.f126932b;
    }

    public boolean v() {
        return this.f126940j;
    }

    public boolean w() {
        w wVar = this.f126938h;
        return wVar != null && wVar.getVisibility() == 0;
    }

    @e.b(23)
    public void y(float f10) {
        if (this.f126949s == f10 && f10 == 1.0f) {
            return;
        }
        this.f126949s = f10;
        v.a(new a(f10));
    }

    public void z(Runnable runnable) {
        this.f126944n = runnable;
        v.a(new l(runnable));
    }
}

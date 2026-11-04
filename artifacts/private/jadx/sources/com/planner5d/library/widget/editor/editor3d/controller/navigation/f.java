package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import android.content.Context;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes12.dex */
public class f extends c implements k.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f255500m = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f255503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f255504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f255505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.planner5d.library.math.k f255506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f255507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<PointF> f255508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.planner5d.library.math.k f255498k = new com.planner5d.library.math.k(500.0f, 1000.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final com.planner5d.library.math.k f255499l = new com.planner5d.library.math.k(250.0f, 3000.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Integer f255501n = 70;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Integer f255502o = 85;

    public f(j jVar, Context context, ij.c<PointF> cVar) {
        super(jVar);
        this.f255503e = 0.0f;
        this.f255505g = false;
        this.f255506h = null;
        this.f255507i = null;
        this.f255508j = cVar;
        this.f255504f = new k(context, this);
    }

    private com.planner5d.library.math.k n() {
        if (this.f255506h == null) {
            PointF pointF = this.f255508j.get();
            this.f255506h = new com.planner5d.library.math.k(pointF.x, pointF.y);
        }
        return this.f255506h;
    }

    private void o() {
        if (this.f255505g) {
            this.f255507i = null;
            return;
        }
        com.planner5d.library.math.k kVarK = this.f255482b.k(new com.planner5d.library.math.k());
        m mVarL = this.f255482b.l(new m());
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k(mVarL.f180482a, mVarL.f180484c);
        com.planner5d.library.math.k kVarN = n();
        float f10 = this.f255482b.f();
        float degrees = (float) Math.toDegrees(kVarK.f180480a);
        kVarK.f180480a = degrees;
        Integer num = f255501n;
        if (degrees <= num.intValue() && kVar.equals(kVarN)) {
            com.planner5d.library.math.k kVar2 = f255498k;
            if (f10 >= kVar2.f180480a && f10 <= kVar2.f180481b) {
                return;
            }
        }
        com.planner5d.library.math.k kVar3 = f255498k;
        float f11 = kVar3.f180480a;
        if (f10 < f11) {
            f10 = f11;
        } else {
            float f12 = kVar3.f180481b;
            if (f10 > f12) {
                f10 = f12;
            }
        }
        j jVar = new j(this.f255482b);
        jVar.D(kVarN.f180480a, kVarN.f180481b);
        jVar.z(new com.planner5d.library.math.k((float) Math.toRadians(Math.min(kVarK.f180480a, num.intValue())), kVarK.f180481b));
        jVar.A(f10);
        this.f255507i = new a(1000L, this.f255482b, jVar);
    }

    private void p() {
        this.f255505g = true;
        this.f255507i = null;
        this.f255483c.a();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.k.a
    public void a(float f10, float f11) {
        this.f255482b.r(f10, f11);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.k.a
    public void b(float f10) {
        this.f255483c.a();
        j jVar = this.f255482b;
        float f11 = jVar.f() / ((gc.d.d(f10 - this.f255503e) * 1.5f) + 1.0f);
        com.planner5d.library.math.k kVar = f255499l;
        jVar.A(com.planner5d.library.engine.util.math.e.e(f11, kVar.f180480a, kVar.f180481b));
        this.f255503e = f10;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void d(boolean z10, int i10) {
        this.f255503e = 0.0f;
        this.f255504f.a();
        int i11 = 0 >> 0;
        this.f255505g = false;
        this.f255483c.a();
        o();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void f(float f10, int i10) {
        j jVar = new j(this.f255482b);
        com.planner5d.library.math.k kVarN = n();
        jVar.D(kVarN.f180480a, kVarN.f180481b);
        jVar.z(new com.planner5d.library.math.k((float) Math.toRadians(f255501n.intValue()), this.f255482b.k(new com.planner5d.library.math.k()).f180481b));
        jVar.A(f255498k.f180481b);
        jVar.a();
        this.f255483c.b(this.f255482b, jVar, i10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void g(float f10, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        if (!kVar.D() && !kVar2.D()) {
            this.f255483c.a();
        }
        if (!kVar.D()) {
            this.f255482b.r(gc.d.e(kVar.S(-1.0f, 1.0f).R(500.0f)).f180480a, kVar.f180481b);
        }
        if (!kVar2.D()) {
            this.f255482b.w(kVar2.S(-1.0f, 1.0f).R(0.015f), null, f255502o);
        }
        boolean z10 = kVar.D() && kVar2.D();
        if (this.f255505g && z10) {
            this.f255505g = false;
            o();
        } else {
            if (!z10) {
                this.f255505g = true;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void i(float f10, double d10, double d11) {
        p();
        this.f255482b.w(new com.planner5d.library.math.k((float) d10, (float) d11).R(0.01f), null, f255502o);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void j(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        p();
        this.f255504f.c(kVar, kVar2, kVar3, kVar4);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void k(float f10, @NonNull com.planner5d.library.engine.g gVar) {
        this.f255482b.F(gVar, f10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void l(float f10, float f11) {
        this.f255483c.a();
        this.f255482b.D(f10, f11);
        this.f255506h = null;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public boolean m() {
        if (super.m()) {
            return true;
        }
        a aVar = this.f255507i;
        if (aVar != null) {
            if (!this.f255505g && aVar.a(this.f255482b)) {
                return true;
            }
            this.f255507i = null;
        }
        return false;
    }
}

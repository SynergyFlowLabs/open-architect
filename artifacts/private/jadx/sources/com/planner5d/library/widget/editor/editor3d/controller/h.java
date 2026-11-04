package com.planner5d.library.widget.editor.editor3d.controller;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.planner5d.library.math.k;

/* JADX INFO: loaded from: classes12.dex */
public class h implements com.planner5d.library.engine.input.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PointF f255441a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f255442b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k[] f255443c = {new k(), new k(), new k(), new k()};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f255444d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f255445e;

    public h(com.planner5d.library.application.b bVar) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) bVar.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f255445e = (1.0f / displayMetrics.density) / com.planner5d.library.widget.editor.editor3d.scene3d.j.p(bVar);
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean a(float f10, float f11, int i10, int i11) {
        this.f255444d.U();
        return true;
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean b(float f10, float f11, int i10, int i11) {
        this.f255441a = null;
        this.f255444d.i0();
        boolean z10 = this.f255444d.N((double) f10, (double) f11) && this.f255444d.O();
        this.f255442b = z10;
        return z10;
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean c(k kVar, k kVar2, k kVar3, k kVar4) {
        this.f255444d.V(this.f255443c[0].U(kVar.f180480a, kVar.f180481b).R(this.f255445e), this.f255443c[1].U(kVar2.f180480a, kVar2.f180481b).R(this.f255445e), this.f255443c[2].U(kVar3.f180480a, kVar3.f180481b).R(this.f255445e), this.f255443c[3].U(kVar4.f180480a, kVar4.f180481b).R(this.f255445e));
        return true;
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean d(float f10, float f11) {
        return false;
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean e(float f10, float f11, int i10) {
        return false;
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean f(float f10, float f11, int i10, int i11) {
        return this.f255444d.b0(f10, f11);
    }

    @Override // com.planner5d.library.engine.input.e.b
    public boolean g(float f10, float f11, float f12, float f13) {
        if (this.f255441a == null) {
            this.f255441a = new PointF(f10, f11);
        }
        if (this.f255442b) {
            double d10 = f10;
            double d11 = f11;
            this.f255444d.Q(d10, d11);
            this.f255444d.P(d10, d11);
        } else {
            f fVar = this.f255444d;
            PointF pointF = this.f255441a;
            float f14 = f10 - pointF.x;
            float f15 = this.f255445e;
            fVar.T(f14 * f15, (pointF.y - f11) * f15);
        }
        this.f255441a.set(f10, f11);
        return true;
    }

    void h(f fVar) {
        this.f255444d = fVar;
    }
}

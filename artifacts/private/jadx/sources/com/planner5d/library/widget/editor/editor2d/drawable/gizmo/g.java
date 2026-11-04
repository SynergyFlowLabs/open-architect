package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.ItemLayout;

/* JADX INFO: loaded from: classes12.dex */
class g extends f {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final float f254946e0 = 1.0f / ((float) Math.sqrt(2.0d));
    private final k E;
    private final k F;
    private final k G;
    private final RectF H;
    private float I;
    private final k J;
    private final k K;
    private float L;
    private boolean M;
    private boolean N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private final Paint T;
    private final Paint U;
    private final Paint V;
    private final Paint W;
    private final Paint X;
    private final k Y;
    private float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final RectF f254947a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final i f254948b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f254949c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Float f254950d0;

    g(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar, Integer num) {
        super(cVar, num);
        this.E = new k();
        this.F = new k();
        this.G = new k();
        this.H = new RectF();
        this.I = 0.0f;
        this.J = new k();
        this.K = new k();
        this.O = 0;
        this.P = 0.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        Paint paint = new Paint(1);
        this.T = paint;
        Paint paint2 = new Paint(paint);
        this.U = paint2;
        Paint paint3 = new Paint(paint);
        this.X = paint3;
        this.Y = new k();
        this.Z = 0.0f;
        this.f254947a0 = new RectF();
        this.f254948b0 = new i();
        this.f254949c0 = 0.0f;
        this.f254950d0 = null;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setColor(-14898325);
        paint2.setStrokeCap(cap);
        Paint paint4 = new Paint(paint2);
        this.V = paint4;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        paint4.setStyle(style2);
        Paint paint5 = new Paint(paint4);
        this.W = paint5;
        paint5.setColor(857516907);
        paint5.setStyle(style2);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint3.setStrokeWidth(1.0f);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
    }

    private k l(boolean z10, k kVar, boolean z11) {
        return kVar.U(this.K.f180480a + this.E.U(this.I / (z11 ? f254946e0 : 1.0f), 0.0f).N((z10 ? this.f254949c0 : this.L) - (z11 ? 90 : 45)).f180480a, this.K.f180481b + this.E.f180481b);
    }

    private void m(Canvas canvas) {
        canvas.save();
        k kVar = this.K;
        canvas.translate(kVar.f180480a, kVar.f180481b);
        canvas.drawArc(this.H, this.O, this.f254949c0, true, this.W);
        k kVar2 = this.J;
        canvas.drawCircle(kVar2.f180480a, kVar2.f180481b, this.I, this.U);
        float strokeWidth = this.U.getStrokeWidth();
        float f10 = this.I + this.P;
        int i10 = 0;
        while (true) {
            float f11 = 0.5f;
            if (i10 >= 360) {
                this.U.setStrokeWidth(strokeWidth);
                canvas.drawLine(0.0f, 0.0f, this.E.U(this.I + this.P + this.Q, 0.0f).N(this.L).f180480a, this.E.f180481b, this.U);
                RectF rectF = this.f254947a0;
                float f12 = this.D;
                canvas.drawRoundRect(rectF, f12, f12, this.V);
                this.E.U(0.0f, this.I - this.Z).b(this.F.U(-this.f254948b0.a().width(), this.f254948b0.a().bottom - this.f254948b0.a().top).R(0.5f));
                String strB = this.f254948b0.b();
                k kVar3 = this.E;
                canvas.drawText(strB, kVar3.f180480a, kVar3.f180481b, this.X);
                canvas.restore();
                return;
            }
            boolean z10 = i10 % 45 == 0;
            this.E.U(1.0f, 0.0f).N(i10);
            this.F.V(this.E).R((z10 ? this.Q : this.R) + f10);
            this.E.R(f10);
            Paint paint = this.U;
            if (z10) {
                f11 = 1.0f;
            }
            paint.setStrokeWidth(f11 * strokeWidth);
            k kVar4 = this.E;
            float f13 = kVar4.f180480a;
            float f14 = kVar4.f180481b;
            k kVar5 = this.F;
            canvas.drawLine(f13, f14, kVar5.f180480a, kVar5.f180481b, this.U);
            i10 += 15;
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.gizmo.f, com.planner5d.library.widget.editor.editor2d.drawable.gizmo.e
    protected void a(com.planner5d.library.widget.editor.editor2d.drawable.d dVar, boolean z10) {
        this.X.setTypeface(dVar.a());
        this.G.V(this.C);
        if (z10 || this.N) {
            k kVar = this.C;
            kVar.V(kVar).c0(this.K).M().R(this.I / (this.N ? f254946e0 : 1.0f)).b(this.K);
            m(dVar.f254891a);
        }
        super.a(dVar, z10);
        this.C.V(this.G);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.gizmo.f, com.planner5d.library.widget.editor.editor2d.drawable.gizmo.e
    protected void e(h hVar, k kVar) {
        k kVar2 = hVar.f254957g;
        this.K.V(hVar.f254956f);
        this.L = hVar.f254952b;
        this.O = hVar.f254953c;
        float F = this.E.U(kVar2.f180480a, kVar2.f180481b).R(0.5f).F();
        this.I = F;
        float f10 = hVar.f254960j;
        float fE = com.planner5d.library.engine.util.math.e.e(F, 100.0f * f10, f10 * 200.0f);
        this.I = fE;
        float f11 = hVar.f254960j;
        float f12 = 8.0f * f11;
        this.P = f12;
        float f13 = 18.0f * f11;
        this.Q = f13;
        this.R = f11 * 14.0f;
        this.f254949c0 = this.L - this.O;
        boolean z10 = hVar.f254955e;
        this.N = z10;
        if (z10) {
            this.I = (fE * f254946e0) - (f13 - f12);
            this.P = f12 * (-1.0f);
            kVar.V(l(false, this.E, true));
        }
        super.e(hVar, kVar);
        this.U.setStrokeWidth(hVar.f254960j * 2.0f);
        this.W.setStrokeWidth(hVar.f254960j * 3.0f);
        this.M = hVar.f254954d;
        this.X.setTextSize(hVar.f254960j * 16.0f);
        RectF rectF = this.H;
        float f14 = this.I;
        rectF.set(-f14, -f14, f14, f14);
        k kVar3 = this.Y;
        float f15 = hVar.f254960j;
        kVar3.U(55.0f * f15, f15 * 25.0f);
        this.Z = hVar.f254960j * 37.0f;
        this.f254948b0.d(ItemLayout.toRotationAngleForUser(this.L), this.X);
        if (Math.abs(this.f254949c0) < 1.0f) {
            this.f254950d0 = null;
        }
        Float f16 = this.f254950d0;
        if (f16 == null || Math.abs(f16.floatValue() - this.O) < 1.0f || ((Math.abs(this.L - this.O) < 45.0f && this.L - this.O > 0.0f && this.f254950d0.floatValue() - this.O < 0.0f) || (this.L - this.O < 0.0f && this.f254950d0.floatValue() - this.O > 0.0f))) {
            this.S = this.f254949c0 > 0.0f ? 1.0f : -1.0f;
        }
        this.f254950d0 = Float.valueOf(this.L);
        if (this.S >= 0.0f) {
            float f17 = this.f254949c0;
            if (f17 < 0.0f) {
                this.f254949c0 = f17 + 360.0f;
            }
        } else {
            float f18 = this.f254949c0;
            if (f18 > 0.0f) {
                this.f254949c0 = f18 - 360.0f;
            }
        }
        RectF rectF2 = this.f254947a0;
        k kVar4 = this.Y;
        float f19 = kVar4.f180480a;
        float f20 = (-f19) / 2.0f;
        rectF2.left = f20;
        float f21 = kVar4.f180481b;
        float f22 = (-f21) / 2.0f;
        rectF2.top = f22;
        rectF2.right = f20 + f19;
        rectF2.bottom = f22 + f21;
        rectF2.offset(this.E.U(0.0f, this.I - this.Z).f180480a, this.E.f180481b);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.gizmo.f
    protected void i(Canvas canvas, Path path, Paint paint, boolean z10, boolean z11) {
        canvas.save();
        if (z11 && this.M) {
            canvas.translate(l(true, this.E, false).f180480a, this.E.f180481b);
        } else {
            k kVar = this.C;
            canvas.translate(kVar.f180480a, kVar.f180481b);
        }
        if (z10 && !this.N) {
            canvas.rotate(this.L);
        }
        if (this.N) {
            paint.setColor(z10 ? -1 : -14898325);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }
}

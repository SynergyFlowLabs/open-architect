package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.planner5d.library.math.k;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.services.c0;

/* JADX INFO: loaded from: classes12.dex */
class f extends e {
    private final i A;
    private final i B;
    final k C;
    float D;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f254927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f254928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f254929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f254930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f254931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f254932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f254933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f254934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k f254935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k f254936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f254937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f254938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f254939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f254940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c0 f254941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f254942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f254943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Path f254944y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Integer f254945z;

    f(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar, Integer num) {
        Path path;
        super(cVar);
        Paint paint = new Paint(1);
        this.f254928i = paint;
        Paint paint2 = new Paint(paint);
        this.f254929j = paint2;
        Paint paint3 = new Paint(paint);
        this.f254930k = paint3;
        Paint paint4 = new Paint(paint);
        this.f254931l = paint4;
        this.f254932m = new RectF();
        this.f254933n = new k();
        this.f254934o = new k();
        this.f254935p = new k();
        this.f254936q = new k();
        this.f254937r = new k();
        this.f254938s = 15.0f;
        this.f254939t = 4.0f;
        this.f254940u = 0.0f;
        this.f254941v = new c0();
        this.f254943x = false;
        this.A = new i();
        this.B = new i();
        this.C = new k();
        this.D = 0.0f;
        this.f254927h = num == null ? 8.0f : 14.0f;
        if (num == null) {
            path = null;
            int i10 = 7 ^ 0;
        } else {
            path = new Path();
        }
        this.f254944y = path;
        this.f254945z = num;
        paint.setColor(-14898325);
        paint.setStyle(Paint.Style.STROKE);
        paint4.set(paint);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
    }

    private void f(Path path, float f10) {
        float f11 = 0.4f * f10;
        k kVarR = this.f254933n.U(1.0f, 1.0f).M().R(f10 * 0.6f);
        k kVarV = this.f254934o.V(kVarR);
        k kVarR2 = this.f254935p.V(kVarR).R(-1.0f);
        path.reset();
        path.moveTo(kVarR2.f180480a, kVarR2.f180481b);
        path.lineTo(kVarV.f180480a, kVarV.f180481b);
        path.moveTo(kVarR2.f180480a, kVarR2.f180481b + f11);
        path.lineTo(kVarR2.f180480a, kVarR2.f180481b);
        path.lineTo(kVarR2.f180480a + f11, kVarR2.f180481b);
        path.moveTo(kVarV.f180480a, kVarV.f180481b - f11);
        path.lineTo(kVarV.f180480a, kVarV.f180481b);
        path.lineTo(kVarV.f180480a - f11, kVarV.f180481b);
    }

    private void g(Path path, float f10, boolean z10) {
        if (z10) {
            h(path, f10);
            return;
        }
        float f11 = 0.5f * f10;
        float f12 = -f11;
        this.f254932m.set(f12, f12, f11, f11);
        path.reset();
        path.addArc(this.f254932m, -45.0f, -300.0f);
        this.f254933n.U(1.0f, 0.0f).N(76.0f).R(f10 * 0.36f);
        k kVar = this.f254933n;
        path.moveTo(kVar.f180480a + f11, kVar.f180481b);
        path.lineTo(f11, 0.0f);
        this.f254933n.N(66.0f);
        k kVar2 = this.f254933n;
        path.lineTo(f11 + kVar2.f180480a, kVar2.f180481b);
    }

    private void h(Path path, float f10) {
        float f11 = 0.6f * f10;
        float f12 = -f11;
        this.f254932m.set(f12, f12, f11, f11);
        path.reset();
        path.addCircle(this.f254932m.centerX(), this.f254932m.centerY(), 0.15f * f10, Path.Direction.CW);
        path.addArc(this.f254932m, -135.0f, 285.0f);
        this.f254933n.U(1.0f, 0.0f).R(f10 * 0.36f);
        k kVar = this.f254933n;
        path.rLineTo(kVar.f180480a, kVar.f180481b);
        k kVar2 = this.f254933n;
        path.rMoveTo(-kVar2.f180480a, -kVar2.f180481b);
        this.f254933n.N(90.0f);
        k kVar3 = this.f254933n;
        path.rLineTo(kVar3.f180480a, kVar3.f180481b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    private void j(Canvas canvas, c0.b bVar, i iVar) {
        float f10 = this.f254943x ? 0.0f : this.f254940u;
        float rotationAngleForUser = ItemLayout.toRotationAngleForUser(f10);
        this.f254929j.setColor(-14898325);
        float fWidth = iVar.a().width() + (this.f254939t * 2.0f);
        RectF rectF = this.f254932m;
        float f11 = (-fWidth) / 2.0f;
        rectF.left = f11;
        float f12 = this.f254938s;
        float f13 = (-f12) / 2.0f;
        rectF.top = f13;
        rectF.right = f11 + fWidth;
        rectF.bottom = f13 + f12;
        this.f254941v.g(bVar, this.f254933n);
        c0.b bVar2 = c0.b.Right;
        if (bVar == bVar2 || bVar == c0.b.Left) {
            f10 += 90.0f;
        }
        if (this.f254942w) {
            if (rotationAngleForUser > 90.0f) {
                f10 += 180.0f;
            }
        } else if (bVar == bVar2 || bVar == c0.b.Left) {
            if (rotationAngleForUser > 180.0f) {
                f10 += 180.0f;
            }
        } else if (rotationAngleForUser > 90.0f && rotationAngleForUser < 270.0f) {
            f10 += 180.0f;
        }
        canvas.save();
        k kVar = this.f254933n;
        canvas.translate(kVar.f180480a, kVar.f180481b);
        canvas.rotate(f10);
        RectF rectF2 = this.f254932m;
        float f14 = this.D;
        canvas.drawRoundRect(rectF2, f14, f14, this.f254929j);
        canvas.drawText(iVar.b(), (-iVar.a().width()) / 2, -iVar.a().centerY(), this.f254930k);
        canvas.restore();
    }

    private void k(Canvas canvas) {
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar = this.f254924c;
        if (cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromLeft || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXFromRight || cVar == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft) {
            j(canvas, c0.b.Top, this.B);
        }
        com.planner5d.library.widget.editor.editor2d.painter.d.c cVar2 = this.f254924c;
        if (cVar2 == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromTop || cVar2 == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeYFromBottom || cVar2 == com.planner5d.library.widget.editor.editor2d.painter.d.c.ResizeXYFromTopLeft) {
            j(canvas, c0.b.Left, this.A);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.gizmo.e
    protected void a(com.planner5d.library.widget.editor.editor2d.drawable.d dVar, boolean z10) {
        this.f254930k.setTypeface(dVar.a());
        this.f254929j.setColor(z10 ? -14898325 : -1);
        i(dVar.f254891a, this.f254922a, this.f254929j, false, z10);
        if (this.f254944y != null) {
            this.f254931l.setColor(z10 ? -1 : -14898325);
            i(dVar.f254891a, this.f254944y, this.f254931l, true, z10);
        }
        if (z10) {
            k(dVar.f254891a);
        } else {
            i(dVar.f254891a, this.f254922a, this.f254928i, false, z10);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.gizmo.e
    protected void e(h hVar, k kVar) {
        this.f254928i.setStrokeWidth(hVar.f254960j * 2.0f);
        this.f254931l.setStrokeWidth(this.f254928i.getStrokeWidth());
        this.f254929j.setStrokeWidth(hVar.f254960j);
        this.f254930k.setStrokeWidth(hVar.f254960j);
        this.f254930k.setTextSize(hVar.f254960j * 11.0f);
        float f10 = hVar.f254960j;
        this.f254938s = 18.0f * f10;
        this.D = 3.0f * f10;
        this.f254939t = 5.0f * f10;
        float f11 = this.f254927h * f10 * (hVar.f254955e ? 1.25f : 1.0f);
        this.f254940u = hVar.f254952b;
        this.f254936q.V(hVar.f254956f);
        this.f254941v.r(hVar.f254961k);
        this.f254937r.V(hVar.f254959i);
        this.f254942w = hVar.f254951a instanceof ItemWindow;
        this.f254943x = hVar.f254954d;
        this.C.V(kVar);
        this.f254922a.reset();
        int i10 = 5 | 0;
        this.f254922a.addCircle(0.0f, 0.0f, f11, Path.Direction.CCW);
        if (this.f254944y != null) {
            if (this.f254945z.intValue() == 0) {
                f(this.f254944y, f11);
            } else {
                g(this.f254944y, f11, hVar.f254955e);
            }
        }
        this.f254922a.computeBounds(this.f254923b, true);
        this.f254923b.inset(-10.0f, -10.0f);
        RectF rectF = this.f254923b;
        k kVar2 = this.C;
        rectF.offset(kVar2.f180480a, kVar2.f180481b);
        this.A.e(this.f254937r.f180481b, this.f254930k);
        this.B.e(this.f254937r.f180480a, this.f254930k);
    }

    protected void i(Canvas canvas, Path path, Paint paint, boolean z10, boolean z11) {
        canvas.save();
        k kVar = this.C;
        canvas.translate(kVar.f180480a, kVar.f180481b);
        if (z10 && !this.f254943x) {
            canvas.rotate(this.f254940u);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }
}

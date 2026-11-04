package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.walls.WallsInfoWall;

/* JADX INFO: loaded from: classes12.dex */
public class u extends t {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final a f255090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Paint f255091z;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f255092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f255093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Path f255094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f255095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.math.k f255096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.planner5d.library.math.k f255097f;

        /* JADX INFO: Access modifiers changed from: private */
        @m1
        public void f(WallsInfoWall wallsInfoWall, boolean z10, Paint paint) {
            com.planner5d.library.math.k kVarR = new com.planner5d.library.math.k(wallsInfoWall.getTop().b()).O(-1).R(z10 ? wallsInfoWall.getWall().getWidth() / 2.0f : com.planner5d.library.engine.util.math.e.e(wallsInfoWall.getWall().getWidth() - 5.0f, 0.0f, 5.0f));
            com.planner5d.library.math.k kVarB = new com.planner5d.library.math.k(wallsInfoWall.getTop().e()).b(kVarR);
            com.planner5d.library.math.k kVarB2 = new com.planner5d.library.math.k(wallsInfoWall.getTop().c()).b(kVarR);
            com.planner5d.library.math.k kVarC0 = new com.planner5d.library.math.k(kVarB2).c0(kVarB);
            com.planner5d.library.math.k kVarM = new com.planner5d.library.math.k(kVarC0).M();
            boolean z11 = true;
            com.planner5d.library.math.k kVarO = new com.planner5d.library.math.k(kVarM).O(1);
            float F = kVarC0.F();
            double dC = kVarC0.c();
            String strD = f2.n().l().d(Math.round(wallsInfoWall.getTop().d()) / 100.0f);
            this.f255092a = strD;
            kVarB2.f180480a = kVarB.f180480a + (kVarM.f180480a * F);
            kVarB2.f180481b = kVarB.f180481b + (kVarM.f180481b * F);
            float fMeasureText = ((F - paint.measureText(strD)) / 2.0f) - 3.0f;
            if (fMeasureText > 0.0f) {
                z11 = false;
            }
            this.f255095d = z11;
            this.f255094c.reset();
            this.f255093b.reset();
            if (this.f255095d) {
                return;
            }
            this.f255096e.U(kVarB.f180480a + (kVarM.f180480a * 6.0f), kVarB.f180481b + (kVarM.f180481b * 6.0f));
            this.f255097f.U(kVarB2.f180480a - (kVarM.f180480a * 6.0f), kVarB2.f180481b - (kVarM.f180481b * 6.0f));
            if (dC < 90.0d || dC > 270.0d) {
                this.f255094c.moveTo(kVarB.f180480a, kVarB.f180481b);
                this.f255094c.lineTo(kVarB2.f180480a, kVarB2.f180481b);
            } else {
                this.f255094c.moveTo(kVarB2.f180480a, kVarB2.f180481b);
                this.f255094c.lineTo(kVarB.f180480a, kVarB.f180481b);
            }
            this.f255093b.moveTo(kVarB.f180480a, kVarB.f180481b);
            this.f255093b.lineTo(kVarB.f180480a + (kVarM.f180480a * fMeasureText), kVarB.f180481b + (kVarM.f180481b * fMeasureText));
            this.f255093b.moveTo(kVarB2.f180480a - (kVarM.f180480a * fMeasureText), kVarB2.f180481b - (kVarM.f180481b * fMeasureText));
            this.f255093b.lineTo(kVarB2.f180480a, kVarB2.f180481b);
            this.f255093b.moveTo(kVarB.f180480a, kVarB.f180481b);
            Path path = this.f255093b;
            com.planner5d.library.math.k kVar = this.f255096e;
            path.lineTo(kVar.f180480a + (kVarO.f180480a * 3.0f), kVar.f180481b + (kVarO.f180481b * 3.0f));
            Path path2 = this.f255093b;
            com.planner5d.library.math.k kVar2 = this.f255096e;
            path2.lineTo(kVar2.f180480a + (kVarO.f180480a * (-3.0f)), kVar2.f180481b + (kVarO.f180481b * (-3.0f)));
            this.f255093b.moveTo(kVarB2.f180480a, kVarB2.f180481b);
            Path path3 = this.f255093b;
            com.planner5d.library.math.k kVar3 = this.f255097f;
            path3.lineTo(kVar3.f180480a + (kVarO.f180480a * 3.0f), kVar3.f180481b + (kVarO.f180481b * 3.0f));
            Path path4 = this.f255093b;
            com.planner5d.library.math.k kVar4 = this.f255097f;
            path4.lineTo(kVar4.f180480a + (kVarO.f180480a * (-3.0f)), kVar4.f180481b + (kVarO.f180481b * (-3.0f)));
            this.f255093b.close();
        }

        private a() {
            this.f255092a = null;
            this.f255093b = new Path();
            this.f255094c = new Path();
            this.f255096e = new com.planner5d.library.math.k();
            this.f255097f = new com.planner5d.library.math.k();
        }
    }

    public u(WallsInfoWall wallsInfoWall) {
        super(wallsInfoWall);
        this.f255090y = new a();
        Paint paint = new Paint(129);
        this.f255091z = paint;
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(10.0f);
        o();
    }

    @m1
    private void o() {
        a aVar;
        if (this.f255081o == null || (aVar = this.f255090y) == null) {
            return;
        }
        synchronized (aVar) {
            this.f255090y.f(this.f255081o, n(), this.f255091z);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.t, com.planner5d.library.widget.editor.editor2d.drawable.r, com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -2;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.r
    protected void i(Canvas canvas, boolean z10, boolean z11, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, Typeface typeface) {
        synchronized (this.f255090y) {
            try {
                if (!this.f255090y.f255095d && !z10 && (bVar.f258071b || n())) {
                    Paint paint = this.f255091z;
                    Paint.Style style = Paint.Style.FILL;
                    paint.setStyle(style);
                    canvas.drawPath(this.f255090y.f255093b, this.f255091z);
                    this.f255091z.setStyle(Paint.Style.STROKE);
                    canvas.drawPath(this.f255090y.f255093b, this.f255091z);
                    this.f255091z.setStyle(style);
                    canvas.drawTextOnPath(this.f255090y.f255092a, this.f255090y.f255094c, 0.0f, (this.f255091z.getTextSize() / 2.0f) - 2.0f, this.f255091z);
                    this.f255091z.setTypeface(typeface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.r
    public void m(@p0 WallsInfoWall wallsInfoWall) {
        super.m(wallsInfoWall);
        o();
    }
}

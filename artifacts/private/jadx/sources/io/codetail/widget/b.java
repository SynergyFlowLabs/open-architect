package io.codetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import io.codetail.animation.e;

/* JADX INFO: loaded from: classes13.dex */
public class b extends LinearLayout implements io.codetail.animation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f288280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f288281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.codetail.animation.a.C1948a f288282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f288283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f288284e;

    public b(Context context) {
        this(context, null);
    }

    @Override // io.codetail.animation.a
    public void a() {
        this.f288283d = false;
        invalidate(this.f288281b);
    }

    @Override // io.codetail.animation.a
    public void b() {
        this.f288283d = true;
    }

    @Override // io.codetail.animation.a
    public io.codetail.animation.b c() {
        io.codetail.animation.a.C1948a c1948a = this.f288282c;
        if (c1948a == null || !c1948a.b() || this.f288283d) {
            return null;
        }
        View viewA = this.f288282c.a();
        io.codetail.animation.a.C1948a c1948a2 = this.f288282c;
        return e.a(viewA, c1948a2.f288263a, c1948a2.f288264b, c1948a2.f288266d, c1948a2.f288265c);
    }

    @Override // io.codetail.animation.a
    public void d(io.codetail.animation.a.C1948a c1948a) {
        c1948a.a().getHitRect(this.f288281b);
        this.f288282c = c1948a;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f288283d || view != this.f288282c.a()) {
            return super.drawChild(canvas, view, j10);
        }
        int iSave = canvas.save();
        this.f288280a.reset();
        Path path = this.f288280a;
        io.codetail.animation.a.C1948a c1948a = this.f288282c;
        path.addCircle(c1948a.f288263a, c1948a.f288264b, this.f288284e, Path.Direction.CW);
        canvas.clipPath(this.f288280a);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // io.codetail.animation.a
    public void e() {
        a();
    }

    @Override // io.codetail.animation.a
    public float getRevealRadius() {
        return this.f288284e;
    }

    @Override // io.codetail.animation.a
    public void setRevealRadius(float f10) {
        this.f288284e = f10;
        invalidate(this.f288281b);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f288281b = new Rect();
        this.f288280a = new Path();
    }
}

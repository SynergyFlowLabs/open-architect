package io.codetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import io.codetail.animation.e;

/* JADX INFO: loaded from: classes13.dex */
public class a extends FrameLayout implements io.codetail.animation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f288275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f288276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.codetail.animation.a.C1948a f288277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f288278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f288279e;

    public a(Context context) {
        this(context, null);
    }

    @Override // io.codetail.animation.a
    public void a() {
        this.f288278d = false;
        invalidate(this.f288276b);
    }

    @Override // io.codetail.animation.a
    public void b() {
        this.f288278d = true;
    }

    @Override // io.codetail.animation.a
    public io.codetail.animation.b c() {
        io.codetail.animation.a.C1948a c1948a = this.f288277c;
        if (c1948a == null || !c1948a.b() || this.f288278d) {
            return null;
        }
        View viewA = this.f288277c.a();
        io.codetail.animation.a.C1948a c1948a2 = this.f288277c;
        return e.a(viewA, c1948a2.f288263a, c1948a2.f288264b, c1948a2.f288266d, c1948a2.f288265c);
    }

    @Override // io.codetail.animation.a
    public void d(io.codetail.animation.a.C1948a c1948a) {
        c1948a.a().getHitRect(this.f288276b);
        this.f288277c = c1948a;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f288278d || view != this.f288277c.a()) {
            return super.drawChild(canvas, view, j10);
        }
        int iSave = canvas.save();
        this.f288275a.reset();
        Path path = this.f288275a;
        io.codetail.animation.a.C1948a c1948a = this.f288277c;
        path.addCircle(c1948a.f288263a, c1948a.f288264b, this.f288279e, Path.Direction.CW);
        canvas.clipPath(this.f288275a);
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
        return this.f288279e;
    }

    @Override // io.codetail.animation.a
    public void setRevealRadius(float f10) {
        this.f288279e = f10;
        invalidate(this.f288276b);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f288276b = new Rect();
        this.f288275a = new Path();
    }
}

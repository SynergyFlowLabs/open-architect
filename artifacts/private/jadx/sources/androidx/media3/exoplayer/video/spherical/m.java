package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final float f66563g = 45.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f66566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f66567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f66568e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f66564a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f66565b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f66569f = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public m(Context context, a aVar, float f10) {
        this.f66566c = aVar;
        this.f66567d = f10;
        this.f66568e = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.d.a
    @androidx.annotation.g
    public void a(float[] fArr, float f10) {
        this.f66569f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f66564a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f66564a.x) / this.f66567d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f66564a;
        float f12 = (y10 - pointF.y) / this.f66567d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f66569f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f66565b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f66566c.b(this.f66565b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f66566c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f66568e.onTouchEvent(motionEvent);
    }
}

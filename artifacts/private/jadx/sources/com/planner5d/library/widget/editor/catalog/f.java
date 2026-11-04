package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.planner5d.library.widget.w1;

/* JADX INFO: loaded from: classes12.dex */
public class f extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f254605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f254606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.drawable.a f254607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f254608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f254609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f254610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f254611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MotionEvent f254612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f254613i;

    public f(Context context) {
        super(context);
        this.f254605a = true;
        this.f254606b = null;
        this.f254607c = null;
        this.f254608d = new Rect();
        boolean z10 = false | false;
        this.f254610f = false;
        this.f254611g = null;
        this.f254612h = null;
        this.f254609e = (int) getResources().getDimension(com.planner5d.library.f.g.f167230r1);
        this.f254613i = androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166427i2);
        h(false, null);
    }

    private void e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            f(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private void f(float f10, float f11) {
        setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        float measuredWidth = getMeasuredWidth();
        float f12 = f10 < f11 ? measuredWidth / f11 : measuredWidth / f10;
        matrix.setScale(f12, f12);
        float f13 = measuredWidth / 2.0f;
        matrix.preTranslate(f13 - ((f10 * f12) / 2.0f), f13 - ((f12 * f11) / 2.0f));
        setImageMatrix(matrix);
    }

    private void h(boolean z10, MotionEvent motionEvent) {
        this.f254610f = z10;
        boolean zD = d(motionEvent);
        com.planner5d.library.widget.drawable.a aVar = this.f254607c;
        if (aVar != null) {
            aVar.c(zD);
        }
        setBackgroundColor((!z10 || this.f254605a) ? 0 : this.f254613i);
        invalidate();
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent != null && this.f254607c != null) {
            float y10 = motionEvent.getY();
            if (y10 <= getHeight() && y10 >= getHeight() - this.f254607c.getIntrinsicHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        this.f254612h = motionEvent;
        if (motionEvent.getAction() == 0) {
            h(true, motionEvent);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f254612h = null;
            h(false, null);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        h(w1.f258867a.a(this), this.f254612h);
    }

    public void g(boolean z10, Drawable drawable) {
        this.f254605a = z10;
        this.f254606b = drawable;
        h(this.f254610f, this.f254612h);
    }

    public boolean getLocked() {
        return this.f254605a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f254605a) {
            canvas.getClipBounds(this.f254608d);
            Rect rect = this.f254608d;
            rect.bottom = rect.top + rect.width();
            Rect rect2 = this.f254608d;
            rect2.top = rect2.bottom - this.f254606b.getIntrinsicHeight();
            Rect rect3 = this.f254608d;
            rect3.left = rect3.right - this.f254606b.getIntrinsicWidth();
            Rect rect4 = this.f254608d;
            int i10 = this.f254609e;
            rect4.offset(-i10, -i10);
            this.f254606b.setBounds(this.f254608d);
            this.f254606b.draw(canvas);
        }
        if (this.f254607c != null) {
            canvas.getClipBounds(this.f254608d);
            Rect rect5 = this.f254608d;
            rect5.top += rect5.width();
            this.f254607c.setBounds(this.f254608d);
            this.f254607c.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e();
    }

    public void setTitle(String str) {
        if (this.f254611g == null && (str == null || str.isEmpty())) {
            return;
        }
        String str2 = this.f254611g;
        if (str2 == null || !str2.equals(str)) {
            com.planner5d.library.widget.drawable.a aVar = null;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            this.f254611g = str;
            if (str != null) {
                aVar = new com.planner5d.library.widget.drawable.a(getContext(), this.f254611g, 2);
            }
            this.f254607c = aVar;
            invalidate();
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = 3 & 1;
        this.f254605a = true;
        this.f254606b = null;
        this.f254607c = null;
        this.f254608d = new Rect();
        this.f254610f = false;
        this.f254611g = null;
        this.f254612h = null;
        this.f254609e = (int) getResources().getDimension(com.planner5d.library.f.g.f167230r1);
        this.f254613i = androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166427i2);
        h(false, null);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f254605a = true;
        this.f254606b = null;
        this.f254607c = null;
        this.f254608d = new Rect();
        this.f254610f = false;
        this.f254611g = null;
        this.f254612h = null;
        this.f254609e = (int) getResources().getDimension(com.planner5d.library.f.g.f167230r1);
        this.f254613i = androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166427i2);
        h(false, null);
    }
}

package androidx.media2.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes.dex */
class p extends View implements q.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f60171c = "SubtitleAnchorView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r.d f60172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r.d.a f60173b;

    class a implements r.d.a {
        a() {
        }

        @Override // androidx.media2.widget.r.d.a
        public void a(@NonNull r.d dVar) {
            p.this.invalidate();
        }
    }

    p(Context context) {
        this(context, null);
    }

    @Override // androidx.media2.widget.q.c
    public void a(r.d dVar) {
        if (this.f60172a == dVar) {
            return;
        }
        boolean zR0 = u1.R0(this);
        r.d dVar2 = this.f60172a;
        if (dVar2 != null) {
            if (zR0) {
                dVar2.onDetachedFromWindow();
            }
            this.f60172a.b(null);
        }
        this.f60172a = dVar;
        if (dVar != null) {
            if (this.f60173b == null) {
                this.f60173b = new a();
            }
            setWillNotDraw(false);
            dVar.b(this.f60173b);
            if (zR0) {
                dVar.onAttachedToWindow();
                requestLayout();
            }
        } else {
            setWillNotDraw(true);
        }
        invalidate();
    }

    @Override // androidx.media2.widget.q.c
    public Looper b() {
        return Looper.getMainLooper();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.SubtitleAnchorView";
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        r.d dVar = this.f60172a;
        if (dVar != null) {
            dVar.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r.d dVar = this.f60172a;
        if (dVar != null) {
            dVar.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f60172a != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            this.f60172a.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f60172a != null) {
            this.f60172a.c((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }
    }

    p(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    p(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

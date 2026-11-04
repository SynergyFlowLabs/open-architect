package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import androidx.appcompat.widget.h;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class d extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f45601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f45602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f45603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ViewOutlineProvider f45604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RectF f45605h;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = d.this.getWidth();
            int height = d.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * d.this.f45601d) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), d.this.f45602e);
        }
    }

    public d(Context context) {
        super(context);
        this.f45601d = 0.0f;
        this.f45602e = Float.NaN;
        int i10 = 5 << 0;
        c(context, null);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Y8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46509j9) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.f46526k9) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f45602e;
    }

    public float getRoundPercent() {
        return this.f45601d;
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f45602e = f10;
            float f11 = this.f45601d;
            this.f45601d = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f45602e != f10;
        this.f45602e = f10;
        if (f10 != 0.0f) {
            if (this.f45603f == null) {
                this.f45603f = new Path();
            }
            if (this.f45605h == null) {
                this.f45605h = new RectF();
            }
            if (this.f45604g == null) {
                b bVar = new b();
                this.f45604g = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f45605h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f45603f.reset();
            Path path = this.f45603f;
            RectF rectF = this.f45605h;
            float f12 = this.f45602e;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f45601d != f10;
        this.f45601d = f10;
        if (f10 != 0.0f) {
            if (this.f45603f == null) {
                this.f45603f = new Path();
            }
            if (this.f45605h == null) {
                this.f45605h = new RectF();
            }
            if (this.f45604g == null) {
                a aVar = new a();
                this.f45604g = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f45601d) / 2.0f;
            this.f45605h.set(0.0f, 0.0f, width, height);
            this.f45603f.reset();
            this.f45603f.addRoundRect(this.f45605h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45601d = 0.0f;
        this.f45602e = Float.NaN;
        c(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45601d = 0.0f;
        this.f45602e = Float.NaN;
        c(context, attributeSet);
    }
}

package androidx.media2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.w0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes.dex */
abstract class h extends ViewGroup implements r.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @w0(19)
    private CaptioningManager f59875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @w0(19)
    private CaptioningManager.CaptioningChangeListener f59876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected androidx.media2.widget.b f59877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected r.d.a f59878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f59879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59880f;

    class a extends CaptioningManager.CaptioningChangeListener {
        a() {
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onFontScaleChanged(float f10) {
            h.this.f59879e.b(f10);
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
            h.this.f59877c = new androidx.media2.widget.b(captionStyle);
            h hVar = h.this;
            hVar.f59879e.a(hVar.f59877c);
        }
    }

    interface b {
        void a(androidx.media2.widget.b bVar);

        void b(float f10);
    }

    h(Context context) {
        this(context, null);
    }

    private void g() {
        boolean z10 = u1.R0(this) && getVisibility() == 0;
        if (this.f59880f != z10) {
            this.f59880f = z10;
            if (z10) {
                c.a.a(this.f59875a, this.f59876b);
            } else {
                c.a.f(this.f59875a, this.f59876b);
            }
        }
    }

    @Override // androidx.media2.widget.r.d
    public void b(r.d.a aVar) {
        this.f59878d = aVar;
    }

    @Override // androidx.media2.widget.r.d
    public void c(int i10, int i11) {
        measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        boolean z10 = true & false;
        layout(0, 0, i10, i11);
    }

    public abstract b f(Context context);

    @Override // android.view.ViewGroup, android.view.View, androidx.media2.widget.r.d
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View, androidx.media2.widget.r.d
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((ViewGroup) this.f59879e).layout(i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup) this.f59879e).measure(i10, i11);
    }

    @Override // androidx.media2.widget.r.d
    public void setVisible(boolean z10) {
        if (z10) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        g();
    }

    h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setLayerType(1, null);
        this.f59876b = new a();
        this.f59875a = (CaptioningManager) context.getSystemService("captioning");
        this.f59877c = new androidx.media2.widget.b(c.a.d(this.f59875a));
        float fB = c.a.b(this.f59875a);
        b bVarF = f(context);
        this.f59879e = bVarF;
        bVarF.a(this.f59877c);
        this.f59879e.b(fB);
        addView((ViewGroup) this.f59879e, -1, -1);
        requestLayout();
    }
}

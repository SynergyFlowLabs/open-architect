package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.l0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class v extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f89635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Drawable f89637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Bitmap f89638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f89639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private Drawable f89640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Bitmap f89641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f89642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q.g f89643i;

    class a implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f89644a;

        /* JADX INFO: renamed from: com.android.volley.toolbox.v$a$a, reason: collision with other inner class name */
        class RunnableC0835a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q.g f89646a;

            RunnableC0835a(q.g gVar) {
                this.f89646a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f89646a, false);
            }
        }

        a(boolean z10) {
            this.f89644a = z10;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(q.g gVar, boolean z10) {
            if (z10 && this.f89644a) {
                v.this.post(new RunnableC0835a(gVar));
                return;
            }
            if (gVar.d() != null) {
                v.this.setImageBitmap(gVar.d());
                return;
            }
            if (v.this.f89636b != 0) {
                v vVar = v.this;
                vVar.setImageResource(vVar.f89636b);
            } else if (v.this.f89637c != null) {
                v vVar2 = v.this;
                vVar2.setImageDrawable(vVar2.f89637c);
            } else if (v.this.f89638d != null) {
                v vVar3 = v.this;
                vVar3.setImageBitmap(vVar3.f89638d);
            }
        }

        @Override // com.android.volley.v.a
        public void b(com.android.volley.a0 a0Var) {
            if (v.this.f89639e != 0) {
                v vVar = v.this;
                vVar.setImageResource(vVar.f89639e);
            } else if (v.this.f89640f != null) {
                v vVar2 = v.this;
                vVar2.setImageDrawable(vVar2.f89640f);
            } else if (v.this.f89641g != null) {
                v vVar3 = v.this;
                vVar3.setImageBitmap(vVar3.f89641g);
            }
        }
    }

    public v(Context context) {
        this(context, null);
    }

    private void h() {
        int i10 = this.f89636b;
        if (i10 != 0) {
            setImageResource(i10);
            return;
        }
        Drawable drawable = this.f89637c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f89638d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    void g(boolean z10) {
        boolean z11;
        boolean z12;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z13 = true;
        if (getLayoutParams() != null) {
            z11 = getLayoutParams().width == -2;
            z12 = getLayoutParams().height == -2;
        } else {
            z11 = false;
            z12 = false;
        }
        if (!z11 || !z12) {
            z13 = false;
        }
        if (width == 0 && height == 0 && !z13) {
            return;
        }
        if (TextUtils.isEmpty(this.f89635a)) {
            q.g gVar = this.f89643i;
            if (gVar != null) {
                gVar.c();
                this.f89643i = null;
            }
            h();
            return;
        }
        q.g gVar2 = this.f89643i;
        if (gVar2 != null && gVar2.e() != null) {
            if (this.f89643i.e().equals(this.f89635a)) {
                return;
            }
            this.f89643i.c();
            h();
        }
        if (z11) {
            width = 0;
        }
        this.f89643i = this.f89642h.g(this.f89635a, new a(z10), width, z12 ? 0 : height, scaleType);
    }

    @l0
    public void i(String str, q qVar) {
        c0.a();
        this.f89635a = str;
        this.f89642h = qVar;
        g(false);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        q.g gVar = this.f89643i;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.f89643i = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f89636b = 0;
        this.f89637c = null;
        this.f89638d = bitmap;
    }

    public void setDefaultImageDrawable(@p0 Drawable drawable) {
        this.f89636b = 0;
        this.f89638d = null;
        this.f89637c = drawable;
    }

    public void setDefaultImageResId(int i10) {
        this.f89638d = null;
        this.f89637c = null;
        this.f89636b = i10;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f89639e = 0;
        this.f89640f = null;
        this.f89641g = bitmap;
    }

    public void setErrorImageDrawable(@p0 Drawable drawable) {
        this.f89639e = 0;
        this.f89641g = null;
        this.f89640f = drawable;
    }

    public void setErrorImageResId(int i10) {
        this.f89641g = null;
        this.f89640f = null;
        this.f89639e = i10;
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

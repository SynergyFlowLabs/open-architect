package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f112834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f112835d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.material.resources.d f112838g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f112832a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.resources.f f112833b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f112836e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private WeakReference<b> f112837f = new WeakReference<>(null);

    class a extends com.google.android.material.resources.f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
            d0.this.f112836e = true;
            b bVar = (b) d0.this.f112837f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            if (!z10) {
                d0.this.f112836e = true;
                b bVar = (b) d0.this.f112837f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public d0(@androidx.annotation.p0 b bVar) {
        k(bVar);
    }

    private float c(@androidx.annotation.p0 String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f112832a.getFontMetrics().ascent);
    }

    private float d(@androidx.annotation.p0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f112832a.measureText(charSequence, 0, charSequence.length());
    }

    private void j(String str) {
        this.f112834c = d(str);
        this.f112835d = c(str);
        this.f112836e = false;
    }

    @androidx.annotation.p0
    public com.google.android.material.resources.d e() {
        return this.f112838g;
    }

    public float f(@androidx.annotation.p0 String str) {
        if (!this.f112836e) {
            return this.f112835d;
        }
        j(str);
        return this.f112835d;
    }

    @NonNull
    public TextPaint g() {
        return this.f112832a;
    }

    public float h(String str) {
        if (!this.f112836e) {
            return this.f112834c;
        }
        j(str);
        return this.f112834c;
    }

    public boolean i() {
        return this.f112836e;
    }

    public void k(@androidx.annotation.p0 b bVar) {
        this.f112837f = new WeakReference<>(bVar);
    }

    public void l(@androidx.annotation.p0 com.google.android.material.resources.d dVar, Context context) {
        if (this.f112838g != dVar) {
            this.f112838g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f112832a, this.f112833b);
                b bVar = this.f112837f.get();
                if (bVar != null) {
                    this.f112832a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f112832a, this.f112833b);
                this.f112836e = true;
            }
            b bVar2 = this.f112837f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void m(boolean z10) {
        this.f112836e = z10;
    }

    public void n(boolean z10) {
        this.f112836e = z10;
    }

    public void o(Context context) {
        this.f112838g.n(context, this.f112832a, this.f112833b);
    }
}

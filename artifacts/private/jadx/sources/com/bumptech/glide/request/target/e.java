package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private com.bumptech.glide.request.d f97373c;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.manager.i
    public void a() {
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void d(@NonNull o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public final com.bumptech.glide.request.d getRequest() {
        return this.f97373c;
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@p0 com.bumptech.glide.request.d dVar) {
        this.f97373c = dVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void q(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@NonNull o oVar) {
        oVar.d(this.f97371a, this.f97372b);
    }

    public e(int i10, int i11) {
        if (com.bumptech.glide.util.m.v(i10, i11)) {
            this.f97371a = i10;
            this.f97372b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}

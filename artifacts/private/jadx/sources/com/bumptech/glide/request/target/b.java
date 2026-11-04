package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class b<Z> implements p<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bumptech.glide.request.d f97370a;

    @Override // com.bumptech.glide.manager.i
    public void a() {
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.d getRequest() {
        return this.f97370a;
    }

    @Override // com.bumptech.glide.request.target.p
    public void h(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void n(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@p0 com.bumptech.glide.request.d dVar) {
        this.f97370a = dVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void q(@p0 Drawable drawable) {
    }
}

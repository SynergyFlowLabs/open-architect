package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class n<Z> extends b<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f97408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f97409c;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public void d(@NonNull o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@NonNull o oVar) {
        if (com.bumptech.glide.util.m.v(this.f97408b, this.f97409c)) {
            oVar.d(this.f97408b, this.f97409c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f97408b + " and height: " + this.f97409c + ", either provide dimensions in the constructor or call override()");
    }

    public n(int i10, int i11) {
        this.f97408b = i10;
        this.f97409c = i11;
    }
}

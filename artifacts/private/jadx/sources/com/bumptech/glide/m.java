package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bumptech.glide.request.transition.g<? super TranscodeType> f97191a = com.bumptech.glide.request.transition.e.c();

    private CHILD d() {
        return this;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public final CHILD b() {
        return (CHILD) f(com.bumptech.glide.request.transition.e.c());
    }

    final com.bumptech.glide.request.transition.g<? super TranscodeType> c() {
        return this.f97191a;
    }

    @NonNull
    public final CHILD e(int i10) {
        return (CHILD) f(new com.bumptech.glide.request.transition.h(i10));
    }

    @NonNull
    public final CHILD f(@NonNull com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        this.f97191a = (com.bumptech.glide.request.transition.g) com.bumptech.glide.util.k.d(gVar);
        return (CHILD) d();
    }

    @NonNull
    public final CHILD g(@NonNull com.bumptech.glide.request.transition.j.a aVar) {
        return (CHILD) f(new com.bumptech.glide.request.transition.i(aVar));
    }
}

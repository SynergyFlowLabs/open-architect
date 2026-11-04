package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes3.dex */
public class i<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.a f97443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j<R> f97444b;

    public i(j.a aVar) {
        this.f97443a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z10) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f97444b == null) {
            this.f97444b = new j<>(this.f97443a);
        }
        return this.f97444b;
    }
}

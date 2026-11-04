package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes3.dex */
public class h<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.a f97439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f<R> f97440b;

    private static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animation f97441a;

        a(Animation animation) {
            this.f97441a = animation;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return this.f97441a;
        }
    }

    private static class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f97442a;

        b(int i10) {
            this.f97442a = i10;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f97442a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z10) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f97440b == null) {
            this.f97440b = new k(this.f97439a);
        }
        return this.f97440b;
    }

    public h(int i10) {
        this(new b(i10));
    }

    h(k.a aVar) {
        this.f97439a = aVar;
    }
}

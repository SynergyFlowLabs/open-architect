package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<Drawable> f97426a;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    private final class C0872a implements f<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f<Drawable> f97427a;

        C0872a(f<Drawable> fVar) {
            this.f97427a = fVar;
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r10, f.a aVar) {
            return this.f97427a.a(new BitmapDrawable(aVar.getView().getResources(), a.this.b(r10)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f97426a = gVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z10) {
        return new C0872a(this.f97426a.a(aVar, z10));
    }

    protected abstract Bitmap b(R r10);
}

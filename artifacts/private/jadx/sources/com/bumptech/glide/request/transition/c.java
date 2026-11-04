package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class c implements g<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f97430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f97431c;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f97432c = 300;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f97433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f97434b;

        public a() {
            this(300);
        }

        public c a() {
            return new c(this.f97433a, this.f97434b);
        }

        public a b(boolean z10) {
            this.f97434b = z10;
            return this;
        }

        public a(int i10) {
            this.f97433a = i10;
        }
    }

    protected c(int i10, boolean z10) {
        this.f97429a = i10;
        this.f97430b = z10;
    }

    private f<Drawable> b() {
        if (this.f97431c == null) {
            this.f97431c = new d(this.f97429a, this.f97430b);
        }
        return this.f97431c;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<Drawable> a(com.bumptech.glide.load.a aVar, boolean z10) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? e.b() : b();
    }
}

package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f97502a = false;

    private static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile RuntimeException f97503b;

        b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean z10) {
            if (z10) {
                this.f97503b = new RuntimeException("Released");
            } else {
                this.f97503b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f97503b != null) {
                throw new IllegalStateException("Already released", this.f97503b);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    private static class C0875c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f97504b;

        C0875c() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean z10) {
            this.f97504b = z10;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f97504b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static c a() {
        return new C0875c();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}

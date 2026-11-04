package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f97313a;

        a(boolean z10) {
            this.f97313a = z10;
        }

        boolean k() {
            return this.f97313a;
        }
    }

    boolean a();

    void b(d dVar);

    boolean c(d dVar);

    boolean d(d dVar);

    void e(d dVar);

    e getRoot();

    boolean h(d dVar);
}

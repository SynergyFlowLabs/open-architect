package io.noties.markwon;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.noties.markwon.image.b f297595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bj.a f297596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f297597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.noties.markwon.image.destination.a f297598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.noties.markwon.image.i f297599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f297600g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.noties.markwon.core.c f297601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.noties.markwon.image.b f297602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private bj.a f297603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f297604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private io.noties.markwon.image.destination.a f297605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private io.noties.markwon.image.i f297606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k f297607g;

        b() {
        }

        @NonNull
        public b h(@NonNull io.noties.markwon.image.b bVar) {
            this.f297602b = bVar;
            return this;
        }

        @NonNull
        public g i(@NonNull io.noties.markwon.core.c cVar, @NonNull k kVar) {
            this.f297601a = cVar;
            this.f297607g = kVar;
            if (this.f297602b == null) {
                this.f297602b = io.noties.markwon.image.b.c();
            }
            if (this.f297603c == null) {
                this.f297603c = new bj.b();
            }
            if (this.f297604d == null) {
                this.f297604d = new d();
            }
            if (this.f297605e == null) {
                this.f297605e = io.noties.markwon.image.destination.a.a();
            }
            if (this.f297606f == null) {
                this.f297606f = new io.noties.markwon.image.j();
            }
            return new g(this);
        }

        @NonNull
        public b j(@NonNull io.noties.markwon.image.destination.a aVar) {
            this.f297605e = aVar;
            return this;
        }

        @NonNull
        public b k(@NonNull io.noties.markwon.image.i iVar) {
            this.f297606f = iVar;
            return this;
        }

        @NonNull
        public b l(@NonNull c cVar) {
            this.f297604d = cVar;
            return this;
        }

        @NonNull
        public b m(@NonNull bj.a aVar) {
            this.f297603c = aVar;
            return this;
        }
    }

    @NonNull
    public static b b() {
        return new b();
    }

    @NonNull
    public io.noties.markwon.image.b a() {
        return this.f297595b;
    }

    @NonNull
    public io.noties.markwon.image.destination.a c() {
        return this.f297598e;
    }

    @NonNull
    public io.noties.markwon.image.i d() {
        return this.f297599f;
    }

    @NonNull
    public c e() {
        return this.f297597d;
    }

    @NonNull
    public k f() {
        return this.f297600g;
    }

    @NonNull
    public bj.a g() {
        return this.f297596c;
    }

    @NonNull
    public io.noties.markwon.core.c h() {
        return this.f297594a;
    }

    private g(@NonNull b bVar) {
        this.f297594a = bVar.f297601a;
        this.f297595b = bVar.f297602b;
        this.f297596c = bVar.f297603c;
        this.f297597d = bVar.f297604d;
        this.f297598e = bVar.f297605e;
        this.f297599f = bVar.f297606f;
        this.f297600g = bVar.f297607g;
    }
}

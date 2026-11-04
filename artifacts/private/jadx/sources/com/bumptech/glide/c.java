package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.load.engine.k f95942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.e f95943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f95944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.j f95945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f95946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f95947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.a.InterfaceC0855a f95948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.l f95949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.manager.d f95950j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.bumptech.glide.manager.l.b f95953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f95954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f95955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private List<com.bumptech.glide.request.g<Object>> f95956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f95957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f95958r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f95941a = new androidx.collection.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95951k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.bumptech.glide.b.a f95952l = new a();

    class a implements com.bumptech.glide.b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            return new com.bumptech.glide.request.h();
        }
    }

    class b implements com.bumptech.glide.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.h f95960a;

        b(com.bumptech.glide.request.h hVar) {
            this.f95960a = hVar;
        }

        @Override // com.bumptech.glide.b.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            com.bumptech.glide.request.h hVar = this.f95960a;
            return hVar != null ? hVar : new com.bumptech.glide.request.h();
        }
    }

    @NonNull
    public c a(@NonNull com.bumptech.glide.request.g<Object> gVar) {
        if (this.f95956p == null) {
            this.f95956p = new ArrayList();
        }
        this.f95956p.add(gVar);
        return this;
    }

    @NonNull
    com.bumptech.glide.b b(@NonNull Context context) {
        if (this.f95946f == null) {
            this.f95946f = com.bumptech.glide.load.engine.executor.a.j();
        }
        if (this.f95947g == null) {
            this.f95947g = com.bumptech.glide.load.engine.executor.a.f();
        }
        if (this.f95954n == null) {
            this.f95954n = com.bumptech.glide.load.engine.executor.a.c();
        }
        if (this.f95949i == null) {
            this.f95949i = new com.bumptech.glide.load.engine.cache.l.a(context).a();
        }
        if (this.f95950j == null) {
            this.f95950j = new com.bumptech.glide.manager.f();
        }
        if (this.f95943c == null) {
            int iB = this.f95949i.b();
            if (iB > 0) {
                this.f95943c = new com.bumptech.glide.load.engine.bitmap_recycle.k(iB);
            } else {
                this.f95943c = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f95944d == null) {
            this.f95944d = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f95949i.a());
        }
        if (this.f95945e == null) {
            this.f95945e = new com.bumptech.glide.load.engine.cache.i(this.f95949i.d());
        }
        if (this.f95948h == null) {
            this.f95948h = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f95942b == null) {
            this.f95942b = new com.bumptech.glide.load.engine.k(this.f95945e, this.f95948h, this.f95947g, this.f95946f, com.bumptech.glide.load.engine.executor.a.m(), this.f95954n, this.f95955o);
        }
        List<com.bumptech.glide.request.g<Object>> list = this.f95956p;
        if (list == null) {
            this.f95956p = Collections.EMPTY_LIST;
        } else {
            this.f95956p = Collections.unmodifiableList(list);
        }
        return new com.bumptech.glide.b(context, this.f95942b, this.f95945e, this.f95943c, this.f95944d, new com.bumptech.glide.manager.l(this.f95953m), this.f95950j, this.f95951k, this.f95952l, this.f95941a, this.f95956p, this.f95957q, this.f95958r);
    }

    @NonNull
    public c c(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f95954n = aVar;
        return this;
    }

    @NonNull
    public c d(@p0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f95944d = bVar;
        return this;
    }

    @NonNull
    public c e(@p0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f95943c = eVar;
        return this;
    }

    @NonNull
    public c f(@p0 com.bumptech.glide.manager.d dVar) {
        this.f95950j = dVar;
        return this;
    }

    @NonNull
    public c g(@NonNull com.bumptech.glide.b.a aVar) {
        this.f95952l = (com.bumptech.glide.b.a) com.bumptech.glide.util.k.d(aVar);
        return this;
    }

    @NonNull
    public c h(@p0 com.bumptech.glide.request.h hVar) {
        return g(new b(hVar));
    }

    @NonNull
    public <T> c i(@NonNull Class<T> cls, @p0 m<?, T> mVar) {
        this.f95941a.put(cls, mVar);
        return this;
    }

    @NonNull
    public c j(@p0 com.bumptech.glide.load.engine.cache.a.InterfaceC0855a interfaceC0855a) {
        this.f95948h = interfaceC0855a;
        return this;
    }

    @NonNull
    public c k(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f95947g = aVar;
        return this;
    }

    c l(com.bumptech.glide.load.engine.k kVar) {
        this.f95942b = kVar;
        return this;
    }

    public c m(boolean z10) {
        if (!androidx.core.os.b.g()) {
            return this;
        }
        this.f95958r = z10;
        return this;
    }

    @NonNull
    public c n(boolean z10) {
        this.f95955o = z10;
        return this;
    }

    @NonNull
    public c o(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f95951k = i10;
        return this;
    }

    public c p(boolean z10) {
        this.f95957q = z10;
        return this;
    }

    @NonNull
    public c q(@p0 com.bumptech.glide.load.engine.cache.j jVar) {
        this.f95945e = jVar;
        return this;
    }

    @NonNull
    public c r(@NonNull com.bumptech.glide.load.engine.cache.l.a aVar) {
        return s(aVar.a());
    }

    @NonNull
    public c s(@p0 com.bumptech.glide.load.engine.cache.l lVar) {
        this.f95949i = lVar;
        return this;
    }

    void t(@p0 com.bumptech.glide.manager.l.b bVar) {
        this.f95953m = bVar;
    }

    @Deprecated
    public c u(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        return v(aVar);
    }

    @NonNull
    public c v(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f95946f = aVar;
        return this;
    }
}

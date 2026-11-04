package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class c implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f96444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f96445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f96446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.g f96448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f96449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.n.a<?> f96451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f96452i;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        if (this.f96450g >= this.f96449f.size()) {
            return false;
        }
        int i10 = 6 >> 1;
        return true;
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        while (true) {
            boolean z10 = false;
            if (this.f96449f != null && b()) {
                this.f96451h = null;
                while (!z10 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f96449f;
                    int i10 = this.f96450g;
                    this.f96450g = i10 + 1;
                    this.f96451h = list.get(i10).a(this.f96452i, this.f96445b.s(), this.f96445b.f(), this.f96445b.k());
                    if (this.f96451h != null && this.f96445b.t(this.f96451h.f96866c.a())) {
                        this.f96451h.f96866c.c(this.f96445b.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f96447d + 1;
            this.f96447d = i11;
            if (i11 >= this.f96444a.size()) {
                return false;
            }
            com.bumptech.glide.load.g gVar = this.f96444a.get(this.f96447d);
            File fileB = this.f96445b.d().b(new d(gVar, this.f96445b.o()));
            this.f96452i = fileB;
            if (fileB != null) {
                this.f96448e = gVar;
                this.f96449f = this.f96445b.j(fileB);
                this.f96450g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        com.bumptech.glide.load.model.n.a<?> aVar = this.f96451h;
        if (aVar != null) {
            aVar.f96866c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f96446c.n(this.f96448e, obj, this.f96451h.f96866c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f96448e);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(@NonNull Exception exc) {
        this.f96446c.b(this.f96448e, exc, this.f96451h.f96866c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    c(List<com.bumptech.glide.load.g> list, g<?> gVar, f.a aVar) {
        this.f96447d = -1;
        this.f96444a = list;
        this.f96445b = gVar;
        this.f96446c = aVar;
    }
}

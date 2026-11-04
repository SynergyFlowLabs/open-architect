package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class w implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f96751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f96752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96754d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.g f96755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f96756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.n.a<?> f96758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f96759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x f96760j;

    w(g<?> gVar, f.a aVar) {
        this.f96752b = gVar;
        this.f96751a = aVar;
    }

    private boolean b() {
        return this.f96757g < this.f96756f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        List<com.bumptech.glide.load.g> listC = this.f96752b.c();
        boolean z10 = false;
        if (listC.isEmpty()) {
            return false;
        }
        List<Class<?>> listM = this.f96752b.m();
        if (listM.isEmpty()) {
            if (File.class.equals(this.f96752b.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f96752b.i() + " to " + this.f96752b.q());
        }
        while (true) {
            if (this.f96756f != null && b()) {
                this.f96758h = null;
                while (!z10 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f96756f;
                    int i10 = this.f96757g;
                    this.f96757g = i10 + 1;
                    this.f96758h = list.get(i10).a(this.f96759i, this.f96752b.s(), this.f96752b.f(), this.f96752b.k());
                    if (this.f96758h != null && this.f96752b.t(this.f96758h.f96866c.a())) {
                        this.f96758h.f96866c.c(this.f96752b.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f96754d + 1;
            this.f96754d = i11;
            if (i11 >= listM.size()) {
                int i12 = this.f96753c + 1;
                this.f96753c = i12;
                if (i12 >= listC.size()) {
                    return false;
                }
                this.f96754d = 0;
            }
            com.bumptech.glide.load.g gVar = listC.get(this.f96753c);
            Class<?> cls = listM.get(this.f96754d);
            this.f96760j = new x(this.f96752b.b(), gVar, this.f96752b.o(), this.f96752b.s(), this.f96752b.f(), this.f96752b.r(cls), cls, this.f96752b.k());
            File fileB = this.f96752b.d().b(this.f96760j);
            this.f96759i = fileB;
            if (fileB != null) {
                this.f96755e = gVar;
                this.f96756f = this.f96752b.j(fileB);
                this.f96757g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        com.bumptech.glide.load.model.n.a<?> aVar = this.f96758h;
        if (aVar != null) {
            aVar.f96866c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f96751a.n(this.f96755e, obj, this.f96758h.f96866c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f96760j);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(@NonNull Exception exc) {
        this.f96751a.b(this.f96760j, exc, this.f96758h.f96866c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }
}

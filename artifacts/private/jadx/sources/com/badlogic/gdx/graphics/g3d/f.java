package com.badlogic.gdx.graphics.g3d;

import androidx.annotation.NonNull;
import com.badlogic.gdx.graphics.g3d.utils.k;
import com.badlogic.gdx.utils.o0;
import com.badlogic.gdx.utils.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements gc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.planner5d.library.engine.g f94405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f94406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.badlogic.gdx.utils.b<h> f94407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final com.badlogic.gdx.graphics.g3d.utils.i f94408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f94409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final k f94410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.badlogic.gdx.graphics.g3d.utils.j f94411g;

    protected static class a extends o0<h> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected com.badlogic.gdx.utils.b<h> f94412d = new com.badlogic.gdx.utils.b<>();

        protected a() {
        }

        public void g() {
            super.c(this.f94412d);
            this.f94412d.clear();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public h e() {
            return new h();
        }

        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h f() {
            h hVar = (h) super.f();
            int i10 = 6 >> 0;
            hVar.f94428g = null;
            hVar.f94427f = null;
            hVar.f94423b = null;
            hVar.f94430i = null;
            this.f94412d.c(hVar);
            return hVar;
        }
    }

    public f(com.badlogic.gdx.graphics.g3d.utils.i iVar, @NonNull k kVar, com.badlogic.gdx.graphics.g3d.utils.j jVar) {
        this.f94406b = new a();
        this.f94407c = new com.badlogic.gdx.utils.b<>();
        this.f94411g = jVar == null ? new com.badlogic.gdx.graphics.g3d.utils.d() : jVar;
        this.f94409e = iVar == null;
        this.f94408d = iVar == null ? new com.badlogic.gdx.graphics.g3d.utils.i(new com.badlogic.gdx.graphics.g3d.utils.e(1, 1)) : iVar;
        this.f94410f = kVar;
    }

    public <T extends i> void A(Iterable<T> iterable, c cVar, j jVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            u(it.next(), cVar, jVar);
        }
    }

    public <T extends i> void B(Iterable<T> iterable, j jVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            x(it.next(), jVar);
        }
    }

    public void C(com.planner5d.library.engine.g gVar) {
        if (this.f94405a == null) {
            throw new t("Call begin() first.");
        }
        if (this.f94407c.f95174b > 0) {
            flush();
        }
        this.f94405a = gVar;
    }

    public void N0(h hVar) {
        hVar.f94430i = this.f94410f.G0(hVar);
        hVar.f94423b.G(false);
        this.f94407c.c(hVar);
    }

    @Override // gc.e
    public void dispose() {
        this.f94410f.dispose();
    }

    public void end() {
        flush();
        if (this.f94409e) {
            this.f94408d.b();
        }
        this.f94405a = null;
    }

    public void f(com.planner5d.library.engine.g gVar) {
        if (this.f94405a != null) {
            throw new t("Call end() first.");
        }
        this.f94405a = gVar;
        if (this.f94409e) {
            this.f94408d.a();
        }
    }

    public void flush() {
        this.f94411g.a(this.f94405a, this.f94407c);
        j jVar = null;
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<h> bVar = this.f94407c;
            if (i10 >= bVar.f95174b) {
                break;
            }
            h hVar = bVar.get(i10);
            if (jVar != hVar.f94430i) {
                if (jVar != null) {
                    jVar.end();
                }
                jVar = hVar.f94430i;
                jVar.B1(this.f94405a, this.f94408d);
            }
            jVar.N0(hVar);
            i10++;
        }
        if (jVar != null) {
            jVar.end();
        }
        this.f94406b.g();
        this.f94407c.clear();
    }

    public com.planner5d.library.engine.g g() {
        return this.f94405a;
    }

    public com.badlogic.gdx.graphics.g3d.utils.i h() {
        return this.f94408d;
    }

    public com.badlogic.gdx.graphics.g3d.utils.j i() {
        return this.f94411g;
    }

    public k j() {
        return this.f94410f;
    }

    public boolean m() {
        return this.f94409e;
    }

    public void o(i iVar) {
        com.badlogic.gdx.utils.b<h> bVar = this.f94407c;
        int i10 = bVar.f95174b;
        iVar.f(bVar, this.f94406b);
        while (true) {
            com.badlogic.gdx.utils.b<h> bVar2 = this.f94407c;
            if (i10 >= bVar2.f95174b) {
                return;
            }
            h hVar = bVar2.get(i10);
            hVar.f94430i = this.f94410f.G0(hVar);
            i10++;
        }
    }

    public void q(i iVar, c cVar) {
        com.badlogic.gdx.utils.b<h> bVar = this.f94407c;
        int i10 = bVar.f95174b;
        iVar.f(bVar, this.f94406b);
        while (true) {
            com.badlogic.gdx.utils.b<h> bVar2 = this.f94407c;
            if (i10 >= bVar2.f95174b) {
                return;
            }
            h hVar = bVar2.get(i10);
            hVar.f94428g = cVar;
            hVar.f94430i = this.f94410f.G0(hVar);
            i10++;
        }
    }

    public void u(i iVar, c cVar, j jVar) {
        com.badlogic.gdx.utils.b<h> bVar = this.f94407c;
        int i10 = bVar.f95174b;
        iVar.f(bVar, this.f94406b);
        while (true) {
            com.badlogic.gdx.utils.b<h> bVar2 = this.f94407c;
            if (i10 >= bVar2.f95174b) {
                return;
            }
            h hVar = bVar2.get(i10);
            hVar.f94428g = cVar;
            hVar.f94430i = jVar;
            hVar.f94430i = this.f94410f.G0(hVar);
            i10++;
        }
    }

    public void x(i iVar, j jVar) {
        com.badlogic.gdx.utils.b<h> bVar = this.f94407c;
        int i10 = bVar.f95174b;
        iVar.f(bVar, this.f94406b);
        while (true) {
            com.badlogic.gdx.utils.b<h> bVar2 = this.f94407c;
            if (i10 >= bVar2.f95174b) {
                return;
            }
            h hVar = bVar2.get(i10);
            hVar.f94430i = jVar;
            hVar.f94430i = this.f94410f.G0(hVar);
            i10++;
        }
    }

    public <T extends i> void y(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
    }

    public <T extends i> void z(Iterable<T> iterable, c cVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            q(it.next(), cVar);
        }
    }

    public f(@NonNull k kVar, com.badlogic.gdx.graphics.g3d.utils.j jVar) {
        this(null, kVar, jVar);
    }

    public f(@NonNull k kVar) {
        this(null, kVar, null);
    }
}

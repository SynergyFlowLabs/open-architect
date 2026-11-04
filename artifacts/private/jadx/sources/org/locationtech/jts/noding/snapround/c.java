package org.locationtech.jts.noding.snapround;

import org.locationtech.jts.geom.m;
import org.locationtech.jts.index.strtree.k;
import org.locationtech.jts.noding.y;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f338639a;

    class a implements qm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f338640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f338641b;

        a(m mVar, b bVar) {
            this.f338640a = mVar;
            this.f338641b = bVar;
        }

        @Override // qm.b
        public void a(Object obj) {
            ((org.locationtech.jts.index.chain.a) obj).l(this.f338640a, this.f338641b);
        }
    }

    public static class b extends org.locationtech.jts.index.chain.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.noding.snapround.b f338643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private y f338644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f338645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f338646e = false;

        public b(org.locationtech.jts.noding.snapround.b bVar, y yVar, int i10) {
            this.f338643b = bVar;
            this.f338644c = yVar;
            this.f338645d = i10;
        }

        @Override // org.locationtech.jts.index.chain.d
        public void b(org.locationtech.jts.index.chain.a aVar, int i10) {
            org.locationtech.jts.noding.m mVar = (org.locationtech.jts.noding.m) aVar.d();
            y yVar = this.f338644c;
            if (yVar != null && mVar == yVar && i10 == this.f338645d) {
                return;
            }
            this.f338646e = this.f338643b.a(mVar, i10);
        }

        public boolean c() {
            return this.f338646e;
        }
    }

    public c(qm.c cVar) {
        this.f338639a = (k) cVar;
    }

    public boolean a(org.locationtech.jts.noding.snapround.b bVar) {
        return b(bVar, null, -1);
    }

    public boolean b(org.locationtech.jts.noding.snapround.b bVar, y yVar, int i10) {
        m mVarD = bVar.d();
        b bVar2 = new b(bVar, yVar, i10);
        this.f338639a.c(mVarD, new a(mVarD, bVar2));
        return bVar2.c();
    }
}

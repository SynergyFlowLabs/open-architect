package com.google.protobuf.nano;

import com.google.protobuf.nano.c;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<M extends c<M>> extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f126153b;

    @Override // com.google.protobuf.nano.j
    protected int b() {
        if (this.f126153b == null) {
            return 0;
        }
        int iC = 0;
        for (int i10 = 0; i10 < this.f126153b.size(); i10++) {
            iC += this.f126153b.e(i10).c();
        }
        return iC;
    }

    @Override // com.google.protobuf.nano.j
    public void k(b bVar) throws IOException {
        if (this.f126153b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f126153b.size(); i10++) {
            this.f126153b.e(i10).i(bVar);
        }
    }

    @Override // com.google.protobuf.nano.j
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public M clone() throws CloneNotSupportedException {
        M m10 = (M) super.clone();
        g.b(this, m10);
        return m10;
    }

    public final <T> T m(d<M, T> dVar) {
        f fVarG;
        e eVar = this.f126153b;
        if (eVar == null || (fVarG = eVar.g(m.b(dVar.f126174c))) == null) {
            return null;
        }
        return (T) fVarG.f(dVar);
    }

    public final boolean n(d<M, ?> dVar) {
        e eVar = this.f126153b;
        return (eVar == null || eVar.g(m.b(dVar.f126174c)) == null) ? false : true;
    }

    public final <T> M o(d<M, T> dVar, T t10) {
        int iB = m.b(dVar.f126174c);
        f fVarG = null;
        if (t10 == null) {
            e eVar = this.f126153b;
            if (eVar != null) {
                eVar.l(iB);
                if (this.f126153b.j()) {
                    this.f126153b = null;
                }
            }
            return this;
        }
        e eVar2 = this.f126153b;
        if (eVar2 == null) {
            this.f126153b = new e();
        } else {
            fVarG = eVar2.g(iB);
        }
        if (fVarG == null) {
            this.f126153b.k(iB, new f(dVar, t10));
            return this;
        }
        fVarG.g(dVar, t10);
        return this;
    }

    protected final boolean p(a aVar, int i10) throws IOException {
        f fVarG;
        int iF = aVar.f();
        if (!aVar.Q(i10)) {
            boolean z10 = false;
            return false;
        }
        int iB = m.b(i10);
        l lVar = new l(i10, aVar.e(iF, aVar.f() - iF));
        e eVar = this.f126153b;
        if (eVar == null) {
            this.f126153b = new e();
            fVarG = null;
        } else {
            fVarG = eVar.g(iB);
        }
        if (fVarG == null) {
            fVarG = new f();
            this.f126153b.k(iB, fVarG);
        }
        fVarG.a(lVar);
        return true;
    }
}

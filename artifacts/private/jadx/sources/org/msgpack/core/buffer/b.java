package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<h> f339183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f339184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f339185c;

    public b() {
        this(8192);
    }

    @Override // org.msgpack.core.buffer.k
    public void P0(byte[] bArr, int i10, int i11) {
        this.f339183a.add(h.K(bArr, i10, i11));
    }

    @Override // org.msgpack.core.buffer.k
    public void P9(int i10) {
        this.f339183a.add(this.f339184b.D(0, i10));
        if (this.f339184b.C() - i10 <= this.f339185c / 4) {
            this.f339184b = null;
        } else {
            h hVar = this.f339184b;
            this.f339184b = hVar.D(i10, hVar.C() - i10);
        }
    }

    public void a() {
        this.f339183a.clear();
    }

    public int b() {
        Iterator<h> it = this.f339183a.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC += it.next().C();
        }
        return iC;
    }

    public List<h> c() {
        return new ArrayList(this.f339183a);
    }

    @Override // org.msgpack.core.buffer.k
    public h c4(int i10) {
        h hVar = this.f339184b;
        if (hVar != null && hVar.C() > i10) {
            return this.f339184b;
        }
        h hVarA = h.a(Math.max(this.f339185c, i10));
        this.f339184b = hVarA;
        return hVarA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] d() {
        byte[] bArr = new byte[b()];
        int iC = 0;
        for (h hVar : this.f339183a) {
            hVar.h(0, bArr, iC, hVar.C());
            iC += hVar.C();
        }
        return bArr;
    }

    public h e() {
        if (this.f339183a.size() == 1) {
            return this.f339183a.get(0);
        }
        return this.f339183a.isEmpty() ? h.a(0) : h.J(d());
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // org.msgpack.core.buffer.k
    public void write(byte[] bArr, int i10, int i11) {
        h hVarA = h.a(i11);
        hVarA.u(0, bArr, i10, i11);
        this.f339183a.add(hVarA);
    }

    public b(int i10) {
        this.f339185c = i10;
        this.f339183a = new ArrayList();
    }
}

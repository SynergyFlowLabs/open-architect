package org.apache.commons.collections4.list;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class h<E> extends a<E> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f335936g = 6897789178562232073L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f335937h = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient a.d<E> f335938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f335939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f335940f;

    public h() {
        this(20);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        s(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        t(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.list.a
    protected void A() {
        int iMin = Math.min(this.f335908b, this.f335940f - this.f335939e);
        a.d<E> dVar = this.f335907a.f335921b;
        int i10 = 0;
        while (i10 < iMin) {
            a.d<E> dVar2 = dVar.f335921b;
            D(dVar);
            i10++;
            dVar = dVar2;
        }
        super.A();
    }

    @Override // org.apache.commons.collections4.list.a
    protected void B(a.d<E> dVar) {
        super.B(dVar);
        D(dVar);
    }

    protected void D(a.d<E> dVar) {
        if (J()) {
            return;
        }
        a.d<E> dVar2 = this.f335938d;
        dVar.f335920a = null;
        dVar.f335921b = dVar2;
        dVar.f(null);
        this.f335938d = dVar;
        this.f335939e++;
    }

    protected int F() {
        return this.f335940f;
    }

    protected a.d<E> G() {
        int i10 = this.f335939e;
        if (i10 == 0) {
            return null;
        }
        a.d<E> dVar = this.f335938d;
        this.f335938d = dVar.f335921b;
        dVar.f335921b = null;
        this.f335939e = i10 - 1;
        return dVar;
    }

    protected boolean J() {
        return this.f335939e >= this.f335940f;
    }

    protected void K(int i10) {
        this.f335940f = i10;
        L();
    }

    protected void L() {
        while (this.f335939e > this.f335940f) {
            G();
        }
    }

    @Override // org.apache.commons.collections4.list.a
    protected a.d<E> n(E e10) {
        a.d<E> dVarG = G();
        if (dVarG == null) {
            return super.n(e10);
        }
        dVarG.f(e10);
        return dVarG;
    }

    public h(Collection<? extends E> collection) {
        super(collection);
        this.f335940f = 20;
    }

    public h(int i10) {
        this.f335940f = i10;
        v();
    }
}

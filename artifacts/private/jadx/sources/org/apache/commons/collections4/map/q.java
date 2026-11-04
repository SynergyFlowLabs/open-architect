package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class q<K, V> extends d<K, V> implements org.apache.commons.collections4.g<K, V>, Serializable, Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f336101p0 = -612114643488955218L;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected static final int f336102p1 = 100;
    private transient int Y;
    private boolean Z;

    public q() {
        this(100, 0.75f, false);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        p(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.map.a
    protected void G(a.c<K, V> cVar, V v10) {
        Q((d.c) cVar);
        cVar.setValue(v10);
    }

    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public q<K, V> clone() {
        return (q) super.clone();
    }

    public V O(Object obj, boolean z10) {
        d.c<K, V> cVarW = w(obj);
        if (cVarW == null) {
            return null;
        }
        if (z10) {
            Q(cVarW);
        }
        return cVarW.getValue();
    }

    public boolean P() {
        return this.Z;
    }

    protected void Q(d.c<K, V> cVar) {
        d.c<K, V> cVar2 = cVar.f336016f;
        d.c<K, V> cVar3 = this.X;
        if (cVar2 == cVar3) {
            if (cVar == cVar3) {
                throw new IllegalStateException("Can't move header to MRU (please report this to dev@commons.apache.org)");
            }
            return;
        }
        this.f335982e++;
        d.c<K, V> cVar4 = cVar.f336015e;
        if (cVar4 == null) {
            throw new IllegalStateException("Entry.before is null. Please check that your keys are immutable, and that you have used synchronization properly. If so, then please report this to dev@commons.apache.org as a bug.");
        }
        cVar4.f336016f = cVar2;
        cVar.f336016f.f336015e = cVar4;
        cVar.f336016f = cVar3;
        cVar.f336015e = cVar3.f336015e;
        cVar3.f336015e.f336016f = cVar;
        cVar3.f336015e = cVar;
    }

    protected boolean S(d.c<K, V> cVar) {
        return true;
    }

    protected void U(d.c<K, V> cVar, int i10, int i11, K k10, V v10) {
        try {
            int iZ = z(cVar.f335988b, this.f335980c.length);
            a.c<K, V> cVar2 = this.f335980c[iZ];
            a.c<K, V> cVar3 = null;
            while (cVar2 != cVar && cVar2 != null) {
                cVar3 = cVar2;
                cVar2 = cVar2.f335987a;
            }
            if (cVar2 != null) {
                this.f335982e++;
                D(cVar, iZ, cVar3);
                F(cVar, i10, i11, k10, v10);
                b(cVar, i10);
                return;
            }
            throw new IllegalStateException("Entry.next=null, data[removeIndex]=" + this.f335980c[iZ] + " previous=" + cVar3 + " key=" + k10 + " value=" + v10 + " size=" + this.f335979b + " maxSize=" + this.Y + " Please check that your keys are immutable, and that you have used synchronization properly. If so, then please report this to dev@commons.apache.org as a bug.");
        } catch (NullPointerException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NPE, entry=");
            sb2.append(cVar);
            sb2.append(" entryIsHeader=");
            sb2.append(cVar == this.X);
            sb2.append(" key=");
            sb2.append(k10);
            sb2.append(" value=");
            sb2.append(v10);
            sb2.append(" size=");
            sb2.append(this.f335979b);
            sb2.append(" maxSize=");
            sb2.append(this.Y);
            sb2.append(" Please check that your keys are immutable, and that you have used synchronization properly. If so, then please report this to dev@commons.apache.org as a bug.");
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // org.apache.commons.collections4.map.a
    protected void c(int i10, int i11, K k10, V v10) {
        boolean zS;
        if (!isFull()) {
            super.c(i10, i11, k10, v10);
            return;
        }
        d.c<K, V> cVar = this.X.f336016f;
        if (this.Z) {
            while (true) {
                if (cVar == this.X || cVar == null) {
                    zS = false;
                    break;
                } else {
                    if (S(cVar)) {
                        zS = true;
                        break;
                    }
                    cVar = cVar.f336016f;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Entry.after=null, header.after" + this.X.f336016f + " header.before" + this.X.f336015e + " key=" + k10 + " value=" + v10 + " size=" + this.f335979b + " maxSize=" + this.Y + " Please check that your keys are immutable, and that you have used synchronization properly. If so, then please report this to dev@commons.apache.org as a bug.");
            }
        } else {
            zS = S(cVar);
        }
        if (!zS) {
            super.c(i10, i11, k10, v10);
            return;
        }
        if (cVar != null) {
            U(cVar, i10, i11, k10, v10);
            return;
        }
        throw new IllegalStateException("reuse=null, header.after=" + this.X.f336016f + " header.before" + this.X.f336015e + " key=" + k10 + " value=" + v10 + " size=" + this.f335979b + " maxSize=" + this.Y + " Please check that your keys are immutable, and that you have used synchronization properly. If so, then please report this to dev@commons.apache.org as a bug.");
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        return O(obj, true);
    }

    @Override // org.apache.commons.collections4.g
    public boolean isFull() {
        return this.f335979b >= this.Y;
    }

    @Override // org.apache.commons.collections4.map.a
    protected void o(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.Y = objectInputStream.readInt();
        super.o(objectInputStream);
    }

    @Override // org.apache.commons.collections4.g
    public int o0() {
        return this.Y;
    }

    @Override // org.apache.commons.collections4.map.a
    protected void p(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.Y);
        super.p(objectOutputStream);
    }

    public q(int i10) {
        this(i10, 0.75f);
    }

    public q(int i10, int i11) {
        this(i10, i11, 0.75f);
    }

    public q(int i10, boolean z10) {
        this(i10, 0.75f, z10);
    }

    public q(int i10, float f10) {
        this(i10, f10, false);
    }

    public q(int i10, int i11, float f10) {
        this(i10, i11, f10, false);
    }

    public q(int i10, float f10, boolean z10) {
        this(i10, i10, f10, z10);
    }

    public q(int i10, int i11, float f10, boolean z10) {
        super(i11, f10);
        if (i10 < 1) {
            throw new IllegalArgumentException("LRUMap max size must be greater than 0");
        }
        if (i11 <= i10) {
            this.Y = i10;
            this.Z = z10;
            return;
        }
        throw new IllegalArgumentException("LRUMap initial size must not be greather than max size");
    }

    public q(Map<? extends K, ? extends V> map) {
        this((Map) map, false);
    }

    public q(Map<? extends K, ? extends V> map, boolean z10) {
        this(map.size(), 0.75f, z10);
        putAll(map);
    }
}

package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class v<K, V> extends e<org.apache.commons.collections4.keyvalue.f<? extends K>, V> implements Serializable, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336123b = -1788199231038721040L;

    public v() {
        this(new p());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336038a = (Map) objectInputStream.readObject();
    }

    public static <K, V> v<K, V> w(a<org.apache.commons.collections4.keyvalue.f<? extends K>, V> aVar) {
        if (aVar == null) {
            throw new NullPointerException("Map must not be null");
        }
        if (aVar.size() <= 0) {
            return new v<>(aVar);
        }
        throw new IllegalArgumentException("Map must be empty");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f336038a);
    }

    public V A(K k10, K k11, K k12, K k13, V v10) {
        int iP = p(k10, k11, k12, k13);
        int iZ = a().z(iP, a().f335980c.length);
        a.c<K, V> cVar = a().f335980c[iZ];
        while (cVar != null) {
            v<K, V> vVar = this;
            K k14 = k10;
            K k15 = k11;
            K k16 = k12;
            K k17 = k13;
            if (cVar.f335988b == iP && vVar.u(cVar, k14, k15, k16, k17)) {
                V value = cVar.getValue();
                vVar.a().G(cVar, v10);
                return value;
            }
            cVar = cVar.f335987a;
            this = vVar;
            k10 = k14;
            k11 = k15;
            k12 = k16;
            k13 = k17;
        }
        this.a().c(iZ, iP, new org.apache.commons.collections4.keyvalue.f<>(k10, k11, k12, k13), v10);
        return null;
    }

    public V B(K k10, K k11, K k12, K k13, K k14, V v10) {
        v<K, V> vVar;
        int iQ = q(k10, k11, k12, k13, k14);
        int iZ = a().z(iQ, a().f335980c.length);
        a.c<K, V> cVar = a().f335980c[iZ];
        while (cVar != null) {
            if (cVar.f335988b == iQ) {
                vVar = this;
                if (vVar.v(cVar, k10, k11, k12, k13, k14)) {
                    V value = cVar.getValue();
                    vVar.a().G(cVar, v10);
                    return value;
                }
            } else {
                vVar = this;
            }
            cVar = cVar.f335987a;
            this = vVar;
        }
        this.a().c(iZ, iQ, new org.apache.commons.collections4.keyvalue.f<>(k10, k11, k12, k13, k14), v10);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public V put(org.apache.commons.collections4.keyvalue.f<? extends K> fVar, V v10) {
        b(fVar);
        return (V) super.put(fVar, v10);
    }

    public boolean D(Object obj) {
        org.apache.commons.collections4.a0<org.apache.commons.collections4.keyvalue.f<? extends K>, V> a0VarT = T();
        boolean z10 = false;
        while (a0VarT.hasNext()) {
            org.apache.commons.collections4.keyvalue.f<? extends K> next = a0VarT.next();
            if (next.d() >= 1) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        a0VarT.remove();
                        z10 = true;
                    }
                } else if (obj.equals(next.b(0))) {
                    a0VarT.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0007 A[SYNTHETIC] */
    public boolean E(Object obj, Object obj2) {
        org.apache.commons.collections4.a0<org.apache.commons.collections4.keyvalue.f<? extends K>, V> a0VarT = T();
        boolean z10 = false;
        while (a0VarT.hasNext()) {
            org.apache.commons.collections4.keyvalue.f<? extends K> next = a0VarT.next();
            if (next.d() >= 2) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 == null) {
                            if (next.b(1) == null) {
                                a0VarT.remove();
                                z10 = true;
                            }
                        } else if (obj2.equals(next.b(1))) {
                            a0VarT.remove();
                            z10 = true;
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 == null) {
                        if (next.b(1) == null) {
                            a0VarT.remove();
                            z10 = true;
                        }
                    } else if (obj2.equals(next.b(1))) {
                        a0VarT.remove();
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0007 A[SYNTHETIC] */
    public boolean F(Object obj, Object obj2, Object obj3) {
        org.apache.commons.collections4.a0<org.apache.commons.collections4.keyvalue.f<? extends K>, V> a0VarT = T();
        boolean z10 = false;
        while (a0VarT.hasNext()) {
            org.apache.commons.collections4.keyvalue.f<? extends K> next = a0VarT.next();
            if (next.d() >= 3) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 == null) {
                            if (next.b(1) == null) {
                                if (obj3 == null) {
                                    if (next.b(2) == null) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                } else if (obj3.equals(next.b(2))) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            }
                        } else if (obj2.equals(next.b(1))) {
                            if (obj3 == null) {
                                if (next.b(2) == null) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            } else if (obj3.equals(next.b(2))) {
                                a0VarT.remove();
                                z10 = true;
                            }
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 == null) {
                        if (next.b(1) == null) {
                            if (obj3 == null) {
                                if (next.b(2) == null) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            } else if (obj3.equals(next.b(2))) {
                                a0VarT.remove();
                                z10 = true;
                            }
                        }
                    } else if (obj2.equals(next.b(1))) {
                        if (obj3 == null) {
                            if (next.b(2) == null) {
                                a0VarT.remove();
                                z10 = true;
                            }
                        } else if (obj3.equals(next.b(2))) {
                            a0VarT.remove();
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0007 A[SYNTHETIC] */
    public boolean G(Object obj, Object obj2, Object obj3, Object obj4) {
        org.apache.commons.collections4.a0<org.apache.commons.collections4.keyvalue.f<? extends K>, V> a0VarT = T();
        boolean z10 = false;
        while (a0VarT.hasNext()) {
            org.apache.commons.collections4.keyvalue.f<? extends K> next = a0VarT.next();
            if (next.d() >= 4) {
                if (obj == null) {
                    if (next.b(0) == null) {
                        if (obj2 == null) {
                            if (next.b(1) == null) {
                                if (obj3 == null) {
                                    if (next.b(2) == null) {
                                        if (obj4 == null) {
                                            if (next.b(3) == null) {
                                                a0VarT.remove();
                                                z10 = true;
                                            }
                                        } else if (obj4.equals(next.b(3))) {
                                            a0VarT.remove();
                                            z10 = true;
                                        }
                                    }
                                } else if (obj3.equals(next.b(2))) {
                                    if (obj4 == null) {
                                        if (next.b(3) == null) {
                                            a0VarT.remove();
                                            z10 = true;
                                        }
                                    } else if (obj4.equals(next.b(3))) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                }
                            }
                        } else if (obj2.equals(next.b(1))) {
                            if (obj3 == null) {
                                if (next.b(2) == null) {
                                    if (obj4 == null) {
                                        if (next.b(3) == null) {
                                            a0VarT.remove();
                                            z10 = true;
                                        }
                                    } else if (obj4.equals(next.b(3))) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                }
                            } else if (obj3.equals(next.b(2))) {
                                if (obj4 == null) {
                                    if (next.b(3) == null) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                } else if (obj4.equals(next.b(3))) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            }
                        }
                    }
                } else if (obj.equals(next.b(0))) {
                    if (obj2 == null) {
                        if (next.b(1) == null) {
                            if (obj3 == null) {
                                if (next.b(2) == null) {
                                    if (obj4 == null) {
                                        if (next.b(3) == null) {
                                            a0VarT.remove();
                                            z10 = true;
                                        }
                                    } else if (obj4.equals(next.b(3))) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                }
                            } else if (obj3.equals(next.b(2))) {
                                if (obj4 == null) {
                                    if (next.b(3) == null) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                } else if (obj4.equals(next.b(3))) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            }
                        }
                    } else if (obj2.equals(next.b(1))) {
                        if (obj3 == null) {
                            if (next.b(2) == null) {
                                if (obj4 == null) {
                                    if (next.b(3) == null) {
                                        a0VarT.remove();
                                        z10 = true;
                                    }
                                } else if (obj4.equals(next.b(3))) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            }
                        } else if (obj3.equals(next.b(2))) {
                            if (obj4 == null) {
                                if (next.b(3) == null) {
                                    a0VarT.remove();
                                    z10 = true;
                                }
                            } else if (obj4.equals(next.b(3))) {
                                a0VarT.remove();
                                z10 = true;
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public V H(Object obj, Object obj2) {
        int iN = n(obj, obj2);
        int iZ = a().z(iN, a().f335980c.length);
        int i10 = 7 & 0;
        a.c<K, V> cVar = null;
        for (a.c<K, V> cVar2 = a().f335980c[iZ]; cVar2 != null; cVar2 = cVar2.f335987a) {
            if (cVar2.f335988b == iN && s(cVar2, obj, obj2)) {
                V value = cVar2.getValue();
                a().E(cVar2, iZ, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public V I(Object obj, Object obj2, Object obj3) {
        int iO = o(obj, obj2, obj3);
        int iZ = a().z(iO, a().f335980c.length);
        a.c<K, V> cVar = null;
        for (a.c<K, V> cVar2 = a().f335980c[iZ]; cVar2 != null; cVar2 = cVar2.f335987a) {
            if (cVar2.f335988b == iO && t(cVar2, obj, obj2, obj3)) {
                V value = cVar2.getValue();
                a().E(cVar2, iZ, cVar);
                return value;
            }
            cVar = cVar2;
        }
        return null;
    }

    public V J(Object obj, Object obj2, Object obj3, Object obj4) {
        v<K, V> vVar;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int iP = p(obj, obj2, obj3, obj4);
        int iZ = a().z(iP, a().f335980c.length);
        a.c<K, V> cVar = a().f335980c[iZ];
        a.c<K, V> cVar2 = null;
        while (cVar != null) {
            if (cVar.f335988b == iP) {
                vVar = this;
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
                if (vVar.u(cVar, obj5, obj6, obj7, obj8)) {
                    V value = cVar.getValue();
                    vVar.a().E(cVar, iZ, cVar2);
                    return value;
                }
            } else {
                vVar = this;
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
                obj8 = obj4;
            }
            cVar2 = cVar;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            cVar = cVar.f335987a;
            this = vVar;
        }
        return null;
    }

    public V K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iQ = q(obj, obj2, obj3, obj4, obj5);
        int iZ = a().z(iQ, a().f335980c.length);
        a.c<K, V> cVar = a().f335980c[iZ];
        a.c<K, V> cVar2 = null;
        while (cVar != null) {
            if (cVar.f335988b == iQ && v(cVar, obj, obj2, obj3, obj4, obj5)) {
                V value = cVar.getValue();
                a().E(cVar, iZ, cVar2);
                return value;
            }
            a.c<K, V> cVar3 = cVar;
            cVar = cVar.f335987a;
            cVar2 = cVar3;
        }
        return null;
    }

    @Override // org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public org.apache.commons.collections4.a0<org.apache.commons.collections4.keyvalue.f<? extends K>, V> T() {
        return a().T();
    }

    protected void b(org.apache.commons.collections4.keyvalue.f<?> fVar) {
        if (fVar == null) {
            throw new NullPointerException("Key must not be null");
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<K, V> clone() {
        try {
            return (v) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean d(Object obj, Object obj2) {
        int iN = n(obj, obj2);
        for (a.c<K, V> cVar = a().f335980c[a().z(iN, a().f335980c.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iN && s(cVar, obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(Object obj, Object obj2, Object obj3) {
        int iO = o(obj, obj2, obj3);
        for (a.c<K, V> cVar = a().f335980c[a().z(iO, a().f335980c.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iO && t(cVar, obj, obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iP = p(obj, obj2, obj3, obj4);
        a.c<K, V> cVar = a().f335980c[a().z(iP, a().f335980c.length)];
        while (cVar != null) {
            v<K, V> vVar = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            if (cVar.f335988b == iP && vVar.u(cVar, obj5, obj6, obj7, obj8)) {
                return true;
            }
            cVar = cVar.f335987a;
            this = vVar;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return false;
    }

    public boolean g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v<K, V> vVar;
        int iQ = q(obj, obj2, obj3, obj4, obj5);
        a.c<K, V> cVar = a().f335980c[a().z(iQ, a().f335980c.length)];
        while (cVar != null) {
            if (cVar.f335988b == iQ) {
                vVar = this;
                if (vVar.v(cVar, obj, obj2, obj3, obj4, obj5)) {
                    return true;
                }
            } else {
                vVar = this;
            }
            cVar = cVar.f335987a;
            this = vVar;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a<org.apache.commons.collections4.keyvalue.f<? extends K>, V> a() {
        return (a) super.a();
    }

    public V i(Object obj, Object obj2) {
        int iN = n(obj, obj2);
        for (a.c<K, V> cVar = a().f335980c[a().z(iN, a().f335980c.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iN && s(cVar, obj, obj2)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    public V j(Object obj, Object obj2, Object obj3) {
        int iO = o(obj, obj2, obj3);
        for (a.c<K, V> cVar = a().f335980c[a().z(iO, a().f335980c.length)]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iO && t(cVar, obj, obj2, obj3)) {
                return cVar.getValue();
            }
        }
        return null;
    }

    public V k(Object obj, Object obj2, Object obj3, Object obj4) {
        int iP = p(obj, obj2, obj3, obj4);
        a.c<K, V> cVar = a().f335980c[a().z(iP, a().f335980c.length)];
        while (cVar != null) {
            v<K, V> vVar = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            if (cVar.f335988b == iP && vVar.u(cVar, obj5, obj6, obj7, obj8)) {
                return cVar.getValue();
            }
            cVar = cVar.f335987a;
            this = vVar;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        return null;
    }

    public V l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v<K, V> vVar;
        int iQ = q(obj, obj2, obj3, obj4, obj5);
        a.c<K, V> cVar = a().f335980c[a().z(iQ, a().f335980c.length)];
        while (cVar != null) {
            if (cVar.f335988b == iQ) {
                vVar = this;
                if (vVar.v(cVar, obj, obj2, obj3, obj4, obj5)) {
                    return cVar.getValue();
                }
            } else {
                vVar = this;
            }
            cVar = cVar.f335987a;
            this = vVar;
        }
        return null;
    }

    protected int n(Object obj, Object obj2) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            iHashCode ^= obj2.hashCode();
        }
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    protected int o(Object obj, Object obj2, Object obj3) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            iHashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            iHashCode ^= obj3.hashCode();
        }
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    protected int p(Object obj, Object obj2, Object obj3, Object obj4) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            iHashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            iHashCode ^= obj3.hashCode();
        }
        if (obj4 != null) {
            iHashCode ^= obj4.hashCode();
        }
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends org.apache.commons.collections4.keyvalue.f<? extends K>, ? extends V> map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            b((org.apache.commons.collections4.keyvalue.f) it.next());
        }
        super.putAll(map);
    }

    protected int q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        if (obj2 != null) {
            iHashCode ^= obj2.hashCode();
        }
        if (obj3 != null) {
            iHashCode ^= obj3.hashCode();
        }
        if (obj4 != null) {
            iHashCode ^= obj4.hashCode();
        }
        if (obj5 != null) {
            iHashCode ^= obj5.hashCode();
        }
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    protected boolean s(a.c<org.apache.commons.collections4.keyvalue.f<? extends K>, V> cVar, Object obj, Object obj2) {
        org.apache.commons.collections4.keyvalue.f<? extends K> key = cVar.getKey();
        return key.d() == 2 && (obj == key.b(0) || (obj != null && obj.equals(key.b(0)))) && (obj2 == key.b(1) || (obj2 != null && obj2.equals(key.b(1))));
    }

    protected boolean t(a.c<org.apache.commons.collections4.keyvalue.f<? extends K>, V> cVar, Object obj, Object obj2, Object obj3) {
        org.apache.commons.collections4.keyvalue.f<? extends K> key = cVar.getKey();
        return key.d() == 3 && (obj == key.b(0) || (obj != null && obj.equals(key.b(0)))) && ((obj2 == key.b(1) || (obj2 != null && obj2.equals(key.b(1)))) && (obj3 == key.b(2) || (obj3 != null && obj3.equals(key.b(2)))));
    }

    protected boolean u(a.c<org.apache.commons.collections4.keyvalue.f<? extends K>, V> cVar, Object obj, Object obj2, Object obj3, Object obj4) {
        org.apache.commons.collections4.keyvalue.f<? extends K> key = cVar.getKey();
        return key.d() == 4 && (obj == key.b(0) || (obj != null && obj.equals(key.b(0)))) && ((obj2 == key.b(1) || (obj2 != null && obj2.equals(key.b(1)))) && ((obj3 == key.b(2) || (obj3 != null && obj3.equals(key.b(2)))) && (obj4 == key.b(3) || (obj4 != null && obj4.equals(key.b(3))))));
    }

    protected boolean v(a.c<org.apache.commons.collections4.keyvalue.f<? extends K>, V> cVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.apache.commons.collections4.keyvalue.f<? extends K> key = cVar.getKey();
        int i10 = 4 | 5;
        return key.d() == 5 && (obj == key.b(0) || (obj != null && obj.equals(key.b(0)))) && ((obj2 == key.b(1) || (obj2 != null && obj2.equals(key.b(1)))) && ((obj3 == key.b(2) || (obj3 != null && obj3.equals(key.b(2)))) && ((obj4 == key.b(3) || (obj4 != null && obj4.equals(key.b(3)))) && (obj5 == key.b(4) || (obj5 != null && obj5.equals(key.b(4)))))));
    }

    public V x(K k10, K k11, V v10) {
        int iN = n(k10, k11);
        int iZ = a().z(iN, a().f335980c.length);
        for (a.c<K, V> cVar = a().f335980c[iZ]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iN && s(cVar, k10, k11)) {
                V value = cVar.getValue();
                a().G(cVar, v10);
                return value;
            }
        }
        a().c(iZ, iN, new org.apache.commons.collections4.keyvalue.f<>(k10, k11), v10);
        return null;
    }

    public V z(K k10, K k11, K k12, V v10) {
        int iO = o(k10, k11, k12);
        int iZ = a().z(iO, a().f335980c.length);
        for (a.c<K, V> cVar = a().f335980c[iZ]; cVar != null; cVar = cVar.f335987a) {
            if (cVar.f335988b == iO && t(cVar, k10, k11, k12)) {
                V value = cVar.getValue();
                a().G(cVar, v10);
                return value;
            }
        }
        a().c(iZ, iO, new org.apache.commons.collections4.keyvalue.f<>(k10, k11, k12), v10);
        return null;
    }

    protected v(a<org.apache.commons.collections4.keyvalue.f<? extends K>, V> aVar) {
        super(aVar);
        this.f336038a = aVar;
    }
}

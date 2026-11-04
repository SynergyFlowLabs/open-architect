package com.google.protobuf.nano;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class f implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d<?, ?> f126183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f126184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<l> f126185c;

    /* JADX WARN: Multi-variable type inference failed */
    <T> f(d<?, T> dVar, T t10) {
        this.f126183a = dVar;
        this.f126184b = t10;
    }

    private byte[] h() throws IOException {
        byte[] bArr = new byte[c()];
        i(b.W(bArr));
        return bArr;
    }

    void a(l lVar) {
        this.f126185c.add(lVar);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        try {
            fVar.f126183a = this.f126183a;
            List<l> list = this.f126185c;
            if (list == null) {
                fVar.f126185c = null;
            } else {
                fVar.f126185c.addAll(list);
            }
            Object obj = this.f126184b;
            if (obj != null) {
                if (obj instanceof j) {
                    fVar.f126184b = ((j) obj).clone();
                    return fVar;
                }
                if (obj instanceof byte[]) {
                    fVar.f126184b = ((byte[]) obj).clone();
                    return fVar;
                }
                int i10 = 0;
                if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    byte[][] bArr2 = new byte[bArr.length][];
                    fVar.f126184b = bArr2;
                    while (i10 < bArr.length) {
                        bArr2[i10] = (byte[]) bArr[i10].clone();
                        i10++;
                    }
                } else {
                    if (obj instanceof boolean[]) {
                        fVar.f126184b = ((boolean[]) obj).clone();
                        return fVar;
                    }
                    if (obj instanceof int[]) {
                        fVar.f126184b = ((int[]) obj).clone();
                        return fVar;
                    }
                    if (obj instanceof long[]) {
                        fVar.f126184b = ((long[]) obj).clone();
                        return fVar;
                    }
                    if (obj instanceof float[]) {
                        fVar.f126184b = ((float[]) obj).clone();
                        return fVar;
                    }
                    if (obj instanceof double[]) {
                        fVar.f126184b = ((double[]) obj).clone();
                        return fVar;
                    }
                    if (obj instanceof j[]) {
                        j[] jVarArr = (j[]) obj;
                        j[] jVarArr2 = new j[jVarArr.length];
                        fVar.f126184b = jVarArr2;
                        while (i10 < jVarArr.length) {
                            jVarArr2[i10] = jVarArr[i10].clone();
                            i10++;
                        }
                    }
                }
            }
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    int c() {
        Object obj = this.f126184b;
        if (obj != null) {
            return this.f126183a.b(obj);
        }
        Iterator<l> it = this.f126185c.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    l d(int i10) {
        List<l> list = this.f126185c;
        if (list != null && i10 < list.size()) {
            return this.f126185c.get(i10);
        }
        return null;
    }

    int e() {
        List<l> list = this.f126185c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean equals(Object obj) {
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f126184b == null || fVar.f126184b == null) {
            List<l> list2 = this.f126185c;
            if (list2 != null && (list = fVar.f126185c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(h(), fVar.h());
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        d<?, ?> dVar = this.f126183a;
        if (dVar != fVar.f126183a) {
            return false;
        }
        if (!dVar.f126173b.isArray()) {
            return this.f126184b.equals(fVar.f126184b);
        }
        Object obj2 = this.f126184b;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) fVar.f126184b);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) fVar.f126184b);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) fVar.f126184b);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) fVar.f126184b);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) fVar.f126184b);
        }
        return obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fVar.f126184b) : Arrays.deepEquals((Object[]) obj2, (Object[]) fVar.f126184b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T f(d<?, T> dVar) {
        if (this.f126184b == null) {
            this.f126183a = dVar;
            this.f126184b = dVar.k(this.f126185c);
            this.f126185c = null;
        } else if (this.f126183a != dVar) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return (T) this.f126184b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> void g(d<?, T> dVar, T t10) {
        this.f126183a = dVar;
        this.f126184b = t10;
        this.f126185c = null;
    }

    public int hashCode() {
        try {
            return 527 + Arrays.hashCode(h());
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    void i(b bVar) throws IOException {
        Object obj = this.f126184b;
        if (obj != null) {
            this.f126183a.p(obj, bVar);
            return;
        }
        Iterator<l> it = this.f126185c.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
    }

    f() {
        this.f126185c = new ArrayList();
    }
}

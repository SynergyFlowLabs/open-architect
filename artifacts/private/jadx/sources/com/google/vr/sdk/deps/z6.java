package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class z6 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x6<?, ?> f129714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f129715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d7> f129716c = new ArrayList();

    z6() {
    }

    private final byte[] e() throws IOException {
        byte[] bArr = new byte[a()];
        b(u6.d(bArr));
        return bArr;
    }

    final int a() {
        if (this.f129715b != null) {
            throw new NoSuchMethodError();
        }
        int iZ = 0;
        for (d7 d7Var : this.f129716c) {
            iZ += u6.z(d7Var.f127779a) + d7Var.f127780b.length;
        }
        return iZ;
    }

    final void b(u6 u6Var) throws IOException {
        if (this.f129715b != null) {
            throw new NoSuchMethodError();
        }
        for (d7 d7Var : this.f129716c) {
            u6Var.x(d7Var.f127779a);
            u6Var.w(d7Var.f127780b);
        }
    }

    final void c(d7 d7Var) throws IOException {
        List<d7> list = this.f129716c;
        if (list != null) {
            list.add(d7Var);
            return;
        }
        Object obj = this.f129715b;
        if (obj instanceof c7) {
            byte[] bArr = d7Var.f127780b;
            t6 t6VarC = t6.c(bArr, 0, bArr.length);
            int iN = t6VarC.n();
            if (iN != bArr.length - u6.a(iN)) {
                throw b7.a();
            }
            c7 c7VarE = ((c7) this.f129715b).e(t6VarC);
            this.f129714a = this.f129714a;
            this.f129715b = c7VarE;
            this.f129716c = null;
            return;
        }
        if (obj instanceof c7[]) {
            Collections.singletonList(d7Var);
            throw new NoSuchMethodError();
        }
        if (obj instanceof t4) {
            Collections.singletonList(d7Var);
            throw new NoSuchMethodError();
        }
        if (obj instanceof t4[]) {
            Collections.singletonList(d7Var);
            throw new NoSuchMethodError();
        }
        Collections.singletonList(d7Var);
        throw new NoSuchMethodError();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final z6 clone() {
        z6 z6Var = new z6();
        try {
            z6Var.f129714a = this.f129714a;
            List<d7> list = this.f129716c;
            if (list == null) {
                z6Var.f129716c = null;
            } else {
                z6Var.f129716c.addAll(list);
            }
            Object obj = this.f129715b;
            if (obj != null) {
                if (obj instanceof c7) {
                    z6Var.f129715b = ((c7) obj).l();
                    return z6Var;
                }
                if (obj instanceof byte[]) {
                    z6Var.f129715b = ((byte[]) obj).clone();
                    return z6Var;
                }
                int i10 = 0;
                if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    byte[][] bArr2 = new byte[bArr.length][];
                    z6Var.f129715b = bArr2;
                    while (i10 < bArr.length) {
                        bArr2[i10] = (byte[]) bArr[i10].clone();
                        i10++;
                    }
                } else {
                    if (obj instanceof boolean[]) {
                        z6Var.f129715b = ((boolean[]) obj).clone();
                        return z6Var;
                    }
                    if (obj instanceof int[]) {
                        z6Var.f129715b = ((int[]) obj).clone();
                        return z6Var;
                    }
                    if (obj instanceof long[]) {
                        z6Var.f129715b = ((long[]) obj).clone();
                        return z6Var;
                    }
                    if (obj instanceof float[]) {
                        z6Var.f129715b = ((float[]) obj).clone();
                        return z6Var;
                    }
                    if (obj instanceof double[]) {
                        z6Var.f129715b = ((double[]) obj).clone();
                        return z6Var;
                    }
                    if (obj instanceof c7[]) {
                        c7[] c7VarArr = (c7[]) obj;
                        c7[] c7VarArr2 = new c7[c7VarArr.length];
                        z6Var.f129715b = c7VarArr2;
                        while (i10 < c7VarArr.length) {
                            c7VarArr2[i10] = c7VarArr[i10].l();
                            i10++;
                        }
                    }
                }
            }
            return z6Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        List<d7> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        if (this.f129715b == null || z6Var.f129715b == null) {
            List<d7> list2 = this.f129716c;
            if (list2 != null && (list = z6Var.f129716c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(e(), z6Var.e());
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        x6<?, ?> x6Var = this.f129714a;
        if (x6Var != z6Var.f129714a) {
            return false;
        }
        if (!x6Var.f129697a.isArray()) {
            return this.f129715b.equals(z6Var.f129715b);
        }
        Object obj2 = this.f129715b;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) z6Var.f129715b);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) z6Var.f129715b);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) z6Var.f129715b);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) z6Var.f129715b);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) z6Var.f129715b);
        }
        return obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) z6Var.f129715b) : Arrays.deepEquals((Object[]) obj2, (Object[]) z6Var.f129715b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(e()) + 527;
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

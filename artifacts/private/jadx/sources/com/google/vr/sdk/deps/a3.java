package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.b3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class a3<FieldDescriptorType extends b3<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a3 f127696d = new a3((byte) 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f127698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f127699c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n5<FieldDescriptorType, Object> f127697a = n5.b(16);

    private a3() {
    }

    static int a(o6 o6Var, int i10, Object obj) {
        int iL0 = t2.l0(i10);
        if (o6Var == o6.f129524l && !k3.g((t4) obj)) {
            iL0 <<= 1;
        }
        return iL0 + k(o6Var, obj);
    }

    public static <T extends b3<T>> a3<T> b() {
        return f127696d;
    }

    private static Object d(Object obj) {
        if (obj instanceof y4) {
            return ((y4) obj).y();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void e(t2 t2Var, o6 o6Var, int i10, Object obj) throws IOException {
        if (o6Var == o6.f129524l) {
            t4 t4Var = (t4) obj;
            if (!k3.g(t4Var)) {
                t2Var.m(i10, 3);
                t4Var.a(t2Var);
                t2Var.m(i10, 4);
                return;
            }
            t2Var.m(i10, 3);
            t4Var.a(t2Var);
        }
        t2Var.m(i10, o6Var.l());
        switch (o6Var.ordinal()) {
            case 0:
                t2Var.h(((Double) obj).doubleValue());
                break;
            case 1:
                t2Var.i(((Float) obj).floatValue());
                break;
            case 2:
                t2Var.t(((Long) obj).longValue());
                break;
            case 3:
                t2Var.t(((Long) obj).longValue());
                break;
            case 4:
                t2Var.j(((Integer) obj).intValue());
                break;
            case 5:
                t2Var.b0(((Long) obj).longValue());
                break;
            case 6:
                t2Var.i0(((Integer) obj).intValue());
                break;
            case 7:
                t2Var.z(((Boolean) obj).booleanValue());
                break;
            case 8:
                if (!(obj instanceof k2)) {
                    t2Var.x((String) obj);
                } else {
                    t2Var.u((k2) obj);
                }
                break;
            case 9:
                ((t4) obj).a(t2Var);
                break;
            case 10:
                t2Var.v((t4) obj);
                break;
            case 11:
                if (!(obj instanceof k2)) {
                    byte[] bArr = (byte[]) obj;
                    t2Var.c0(bArr, 0, bArr.length);
                } else {
                    t2Var.u((k2) obj);
                }
                break;
            case 12:
                t2Var.M(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof n3)) {
                    t2Var.j(((Integer) obj).intValue());
                } else {
                    t2Var.j(((n3) obj).i());
                }
                break;
            case 14:
                t2Var.i0(((Integer) obj).intValue());
                break;
            case 15:
                t2Var.b0(((Long) obj).longValue());
                break;
            case 16:
                t2Var.Y(((Integer) obj).intValue());
                break;
            case 17:
                t2Var.R(((Long) obj).longValue());
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    private static void h(o6 o6Var, Object obj) {
        k3.d(obj);
        boolean z10 = true;
        boolean z11 = false;
        switch (o6Var.k()) {
            case INT:
                z10 = obj instanceof Integer;
                z11 = z10;
                break;
            case LONG:
                z10 = obj instanceof Long;
                z11 = z10;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                z11 = z10;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                z11 = z10;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                z11 = z10;
                break;
            case STRING:
                z10 = obj instanceof String;
                z11 = z10;
                break;
            case BYTE_STRING:
                if (!(obj instanceof k2) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof n3)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case MESSAGE:
                if (!(obj instanceof t4) && !(obj instanceof y3)) {
                    z10 = false;
                }
                z11 = z10;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static boolean i(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.c() == p6.MESSAGE) {
            boolean z10 = false;
            if (key.d()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((t4) it.next()).Z()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof t4)) {
                    if (value instanceof y3) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((t4) value).Z()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int j(b3<?> b3Var, Object obj) {
        o6 o6VarB = b3Var.b();
        int iY = b3Var.y();
        if (!b3Var.d()) {
            return a(o6VarB, iY, obj);
        }
        int iA = 0;
        if (b3Var.e()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iA += k(o6VarB, it.next());
            }
            return t2.l0(iY) + iA + t2.G0(iA);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iA += a(o6VarB, iY, it2.next());
        }
        return iA;
    }

    private static int k(o6 o6Var, Object obj) {
        switch (o6Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return t2.p0();
            case 1:
                ((Float) obj).getClass();
                return t2.k0();
            case 2:
                return t2.h0(((Long) obj).longValue());
            case 3:
                return t2.n0(((Long) obj).longValue());
            case 4:
                return t2.q0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return t2.T();
            case 6:
                ((Integer) obj).getClass();
                return t2.b();
            case 7:
                ((Boolean) obj).getClass();
                return t2.u0();
            case 8:
                return obj instanceof k2 ? t2.H((k2) obj) : t2.K((String) obj);
            case 9:
                return t2.X((t4) obj);
            case 10:
                return obj instanceof y3 ? t2.d((y3) obj) : t2.I((t4) obj);
            case 11:
                return obj instanceof k2 ? t2.H((k2) obj) : t2.L((byte[]) obj);
            case 12:
                return t2.v0(((Integer) obj).intValue());
            case 13:
                return obj instanceof n3 ? t2.E0(((n3) obj).i()) : t2.E0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return t2.A();
            case 15:
                ((Long) obj).getClass();
                return t2.d0();
            case 16:
                return t2.z0(((Integer) obj).intValue());
            case 17:
                return t2.t0(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void l(Map.Entry<FieldDescriptorType, Object> entry) {
        t4 t4VarBuild;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof y3) {
            value = y3.e();
        }
        if (key.d()) {
            Object objC = c(key);
            if (objC == null) {
                objC = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objC).add(d(it.next()));
            }
            this.f127697a.put(key, objC);
            return;
        }
        if (key.c() != p6.MESSAGE) {
            this.f127697a.put(key, d(value));
            return;
        }
        Object objC2 = c(key);
        if (objC2 == null) {
            this.f127697a.put(key, d(value));
            return;
        }
        if (objC2 instanceof y4) {
            t4VarBuild = key.J();
        } else {
            ((t4) objC2).r1();
            t4VarBuild = key.f().build();
        }
        this.f127697a.put(key, t4VarBuild);
    }

    private static int n(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() != p6.MESSAGE || key.d() || key.e()) {
            return j(key, value);
        }
        return value instanceof y3 ? t2.D(entry.getKey().y(), (y3) value) : t2.g0(entry.getKey().y(), (t4) value);
    }

    public final Object c(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f127697a.get(fielddescriptortype);
        return obj instanceof y3 ? y3.e() : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3) {
            return this.f127697a.equals(((a3) obj).f127697a);
        }
        return false;
    }

    public final void f(a3<FieldDescriptorType> a3Var) {
        for (int i10 = 0; i10 < a3Var.f127697a.j(); i10++) {
            l(a3Var.f127697a.h(i10));
        }
        Iterator it = a3Var.f127697a.m().iterator();
        while (it.hasNext()) {
            l((Map.Entry) it.next());
        }
    }

    public final void g(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.d()) {
            h(fielddescriptortype.b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                h(fielddescriptortype.b(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof y3) {
            this.f127699c = true;
        }
        this.f127697a.put(fielddescriptortype, obj);
    }

    public final int hashCode() {
        return this.f127697a.hashCode();
    }

    final boolean m() {
        return this.f127697a.isEmpty();
    }

    public final void o() {
        if (this.f127698b) {
            return;
        }
        this.f127697a.e();
        this.f127698b = true;
    }

    public final boolean p() {
        return this.f127698b;
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final a3<FieldDescriptorType> clone() {
        a3<FieldDescriptorType> a3Var = new a3<>();
        for (int i10 = 0; i10 < this.f127697a.j(); i10++) {
            Map.Entry<K, Object> entryH = this.f127697a.h(i10);
            a3Var.g((b3) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f127697a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a3Var.g((b3) entry.getKey(), entry.getValue());
        }
        a3Var.f127699c = this.f127699c;
        return a3Var;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> r() {
        return this.f127699c ? new a4(this.f127697a.entrySet().iterator()) : this.f127697a.entrySet().iterator();
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> s() {
        return this.f127699c ? new a4(this.f127697a.o().iterator()) : this.f127697a.o().iterator();
    }

    public final boolean t() {
        for (int i10 = 0; i10 < this.f127697a.j(); i10++) {
            if (!i(this.f127697a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f127697a.m().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int u() {
        int iJ = 0;
        for (int i10 = 0; i10 < this.f127697a.j(); i10++) {
            Map.Entry<K, Object> entryH = this.f127697a.h(i10);
            iJ += j((b3) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f127697a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iJ += j((b3) entry.getKey(), entry.getValue());
        }
        return iJ;
    }

    public final int v() {
        int iN = 0;
        for (int i10 = 0; i10 < this.f127697a.j(); i10++) {
            iN += n(this.f127697a.h(i10));
        }
        Iterator it = this.f127697a.m().iterator();
        while (it.hasNext()) {
            iN += n((Map.Entry) it.next());
        }
        return iN;
    }

    private a3(byte b10) {
        o();
    }
}

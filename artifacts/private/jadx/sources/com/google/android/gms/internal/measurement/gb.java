package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class gb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final gb f108446d = new gb(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final rd f108447a = new nd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f108449c;

    private gb() {
    }

    public static gb a() {
        return f108446d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void f(wa waVar, ge geVar, int i10, Object obj) throws IOException {
        if (geVar == ge.f108463l) {
            yc ycVar = (yc) obj;
            ac.d(ycVar);
            waVar.i(i10, 3);
            ycVar.f(waVar);
            boolean z10 = 2 ^ 4;
            waVar.i(i10, 4);
            return;
        }
        waVar.i(i10, geVar.l());
        he heVar = he.INT;
        switch (geVar.ordinal()) {
            case 0:
                waVar.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                waVar.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                waVar.B(((Long) obj).longValue());
                break;
            case 3:
                waVar.B(((Long) obj).longValue());
                break;
            case 4:
                waVar.y(((Integer) obj).intValue());
                break;
            case 5:
                waVar.C(((Long) obj).longValue());
                break;
            case 6:
                waVar.A(((Integer) obj).intValue());
                break;
            case 7:
                waVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ra)) {
                    waVar.E((String) obj);
                } else {
                    waVar.r((ra) obj);
                }
                break;
            case 9:
                ((yc) obj).f(waVar);
                break;
            case 10:
                waVar.w((yc) obj);
                break;
            case 11:
                if (!(obj instanceof ra)) {
                    byte[] bArr = (byte[]) obj;
                    waVar.s(bArr, 0, bArr.length);
                } else {
                    waVar.r((ra) obj);
                }
                break;
            case 12:
                waVar.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ub)) {
                    waVar.y(((Integer) obj).intValue());
                } else {
                    waVar.y(((ub) obj).a());
                }
                break;
            case 14:
                waVar.A(((Integer) obj).intValue());
                break;
            case 15:
                waVar.C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                waVar.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                waVar.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int h(ge geVar, int i10, Object obj) {
        int iG = wa.G(i10 << 3);
        if (geVar == ge.f108463l) {
            ac.d((yc) obj);
            iG += iG;
        }
        return iG + i(geVar, obj);
    }

    static int i(ge geVar, Object obj) {
        int i10;
        int iG;
        ge geVar2 = ge.f108454c;
        he heVar = he.INT;
        switch (geVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i11 = wa.f108946d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i12 = wa.f108946d;
                return 4;
            case 2:
                return wa.a(((Long) obj).longValue());
            case 3:
                return wa.a(((Long) obj).longValue());
            case 4:
                return wa.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i13 = wa.f108946d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i14 = wa.f108946d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i15 = wa.f108946d;
                return 1;
            case 8:
                if (!(obj instanceof ra)) {
                    return wa.b((String) obj);
                }
                int i16 = wa.f108946d;
                i10 = ((ra) obj).i();
                iG = wa.G(i10);
                break;
                break;
            case 9:
                return ((yc) obj).e();
            case 10:
                if (!(obj instanceof gc)) {
                    return wa.c((yc) obj);
                }
                int i17 = wa.f108946d;
                i10 = ((gc) obj).b();
                iG = wa.G(i10);
                break;
                break;
            case 11:
                if (!(obj instanceof ra)) {
                    int i18 = wa.f108946d;
                    i10 = ((byte[]) obj).length;
                    iG = wa.G(i10);
                } else {
                    int i19 = wa.f108946d;
                    i10 = ((ra) obj).i();
                    iG = wa.G(i10);
                }
                break;
            case 12:
                return wa.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof ub ? wa.a(((ub) obj).a()) : wa.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i20 = wa.f108946d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i21 = wa.f108946d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return wa.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return wa.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + i10;
    }

    public static int j(fb fbVar, Object obj) {
        ge geVarG = fbVar.g();
        int iA = fbVar.a();
        if (!fbVar.m()) {
            return h(geVarG, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!fbVar.j()) {
            int iH = 0;
            while (i10 < size) {
                iH += h(geVarG, iA, list.get(i10));
                i10++;
            }
            return iH;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i10 < size) {
            i11 += i(geVarG, list.get(i10));
            i10++;
        }
        return wa.G(iA << 3) + i11 + wa.G(i11);
    }

    private static boolean k(Map.Entry entry) {
        fb fbVar = (fb) entry.getKey();
        if (fbVar.h() != he.MESSAGE) {
            return true;
        }
        if (!fbVar.m()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean l(Object obj) {
        if (obj instanceof zc) {
            return ((zc) obj).c();
        }
        if (obj instanceof gc) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int m(Map.Entry entry) {
        int i10;
        int iG;
        int iG2;
        fb fbVar = (fb) entry.getKey();
        Object value = entry.getValue();
        if (fbVar.h() != he.MESSAGE || fbVar.m() || fbVar.j()) {
            return j(fbVar, value);
        }
        if (value instanceof gc) {
            int iA = ((fb) entry.getKey()).a();
            int iG3 = wa.G(8);
            i10 = iG3 + iG3;
            iG = wa.G(16) + wa.G(iA);
            int iG4 = wa.G(24);
            int iB = ((gc) value).b();
            iG2 = iG4 + wa.G(iB) + iB;
        } else {
            int iA2 = ((fb) entry.getKey()).a();
            int iG5 = wa.G(8);
            i10 = iG5 + iG5;
            iG = wa.G(16) + wa.G(iA2);
            iG2 = wa.G(24) + wa.c((yc) value);
        }
        return i10 + iG + iG2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[RETURN] */
    private static final void n(fb fbVar, Object obj) {
        boolean z10;
        fbVar.g();
        byte[] bArr = ac.f108281b;
        obj.getClass();
        ge geVar = ge.f108454c;
        he heVar = he.INT;
        switch (r0.k()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof ra) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof ub)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof yc) || (obj instanceof gc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fbVar.a()), fbVar.g().k(), obj.getClass().getName()));
        }
    }

    public final void b() {
        if (this.f108448b) {
            return;
        }
        rd rdVar = this.f108447a;
        int iC = rdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = rdVar.d(i10).getValue();
            if (value instanceof qb) {
                ((qb) value).o();
            }
        }
        Iterator it = rdVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof qb) {
                ((qb) value2).o();
            }
        }
        rdVar.a();
        this.f108448b = true;
    }

    public final Iterator c() {
        rd rdVar = this.f108447a;
        if (rdVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f108449c ? new fc(rdVar.entrySet().iterator()) : rdVar.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        gb gbVar = new gb();
        rd rdVar = this.f108447a;
        int iC = rdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryD = rdVar.d(i10);
            gbVar.d((fb) ((od) entryD).k(), entryD.getValue());
        }
        for (Map.Entry entry : rdVar.e()) {
            gbVar.d((fb) entry.getKey(), entry.getValue());
        }
        gbVar.f108449c = this.f108449c;
        return gbVar;
    }

    public final void d(fb fbVar, Object obj) {
        if (!fbVar.m()) {
            n(fbVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(fbVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof gc) {
            this.f108449c = true;
        }
        this.f108447a.put(fbVar, obj);
    }

    public final boolean e() {
        rd rdVar = this.f108447a;
        int iC = rdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!k(rdVar.d(i10))) {
                return false;
            }
        }
        Iterator it = rdVar.e().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gb) {
            return this.f108447a.equals(((gb) obj).f108447a);
        }
        return false;
    }

    public final int g() {
        rd rdVar = this.f108447a;
        int iC = rdVar.c();
        int iM = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iM += m(rdVar.d(i10));
        }
        Iterator it = rdVar.e().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    public final int hashCode() {
        return this.f108447a.hashCode();
    }

    private gb(boolean z10) {
        b();
        b();
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class v6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v6 f109363d = new v6(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b9 f109364a = new w8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109366c;

    private v6() {
    }

    static int a(q9 q9Var, int i10, Object obj) {
        k6.B(i10 << 3);
        if (q9.f109282k == null) {
            byte[] bArr = j7.f109152b;
            if (((h8) obj) instanceof o5) {
                throw null;
            }
        }
        r9 r9Var = r9.INT;
        throw null;
    }

    public static int b(u6 u6Var, Object obj) {
        q9 q9VarG = u6Var.g();
        int iA = u6Var.a();
        if (!u6Var.j()) {
            return a(q9VarG, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!u6Var.m()) {
            int iA2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iA2 += a(q9VarG, iA, list.get(i10));
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return k6.B(iA << 3) + k6.B(0);
        }
        list.get(0);
        q9 q9Var = q9.f109273b;
        r9 r9Var = r9.INT;
        int i11 = 3 << 0;
        throw null;
    }

    public static v6 d() {
        return f109363d;
    }

    private static boolean i(Map.Entry entry) {
        u6 u6Var = (u6) entry.getKey();
        if (u6Var.h() == r9.MESSAGE) {
            if (!u6Var.j()) {
                return j(entry.getValue());
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!j(list.get(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean j(Object obj) {
        if (obj instanceof i8) {
            return ((i8) obj).b();
        }
        if (obj instanceof q7) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int k(Map.Entry entry) {
        int i10;
        int iB;
        int iB2;
        int iD;
        int iB3;
        u6 u6Var = (u6) entry.getKey();
        Object value = entry.getValue();
        if (u6Var.h() != r9.MESSAGE || u6Var.j() || u6Var.m()) {
            return b(u6Var, value);
        }
        if (value instanceof q7) {
            int iA = ((u6) entry.getKey()).a();
            int iB4 = k6.B(8);
            i10 = iB4 + iB4;
            iB = k6.B(16) + k6.B(iA);
            iB2 = k6.B(24);
            iD = ((q7) value).a();
            iB3 = k6.B(iD);
        } else {
            int iA2 = ((u6) entry.getKey()).a();
            int iB5 = k6.B(8);
            i10 = iB5 + iB5;
            iB = k6.B(16) + k6.B(iA2);
            iB2 = k6.B(24);
            iD = ((h8) value).d();
            iB3 = k6.B(iD);
        }
        return i10 + iB + iB2 + iB3 + iD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052 A[RETURN] */
    private static final void l(u6 u6Var, Object obj) {
        boolean z10;
        u6Var.g();
        byte[] bArr = j7.f109152b;
        obj.getClass();
        q9 q9Var = q9.f109273b;
        r9 r9Var = r9.INT;
        switch (r0.k()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof d6) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof ka)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof h8) || (obj instanceof q7)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(u6Var.a()), u6Var.g().k(), obj.getClass().getName()));
        }
    }

    public final int c() {
        int iC = this.f109364a.c();
        int iK = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iK += k(this.f109364a.g(i10));
        }
        Iterator it = this.f109364a.d().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        v6 v6Var = new v6();
        int iC = this.f109364a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = this.f109364a.g(i10);
            v6Var.g((u6) ((x8) entryG).k(), entryG.getValue());
        }
        for (Map.Entry entry : this.f109364a.d()) {
            v6Var.g((u6) entry.getKey(), entry.getValue());
        }
        v6Var.f109366c = this.f109366c;
        return v6Var;
    }

    public final Iterator e() {
        if (this.f109364a.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f109366c ? new o7(this.f109364a.entrySet().iterator()) : this.f109364a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v6) {
            return this.f109364a.equals(((v6) obj).f109364a);
        }
        return false;
    }

    public final void f() {
        if (this.f109365b) {
            return;
        }
        int iC = this.f109364a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = this.f109364a.g(i10).getValue();
            if (value instanceof e7) {
                ((e7) value).x();
            }
        }
        Iterator it = this.f109364a.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof e7) {
                ((e7) value2).x();
            }
        }
        this.f109364a.a();
        this.f109365b = true;
    }

    public final void g(u6 u6Var, Object obj) {
        if (!u6Var.j()) {
            l(u6Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                l(u6Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof q7) {
            this.f109366c = true;
        }
        this.f109364a.put(u6Var, obj);
    }

    public final boolean h() {
        int iC = this.f109364a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!i(this.f109364a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f109364a.d().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f109364a.hashCode();
    }

    private v6(boolean z10) {
        f();
        f();
    }
}

package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class o3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o3 f107722d = new o3(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v5 f107723a = new l5(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f107724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f107725c;

    private o3() {
    }

    public static o3 a() {
        throw null;
    }

    private static final void d(n3 n3Var, Object obj) {
        boolean z10;
        n3Var.g();
        byte[] bArr = z3.f107905d;
        obj.getClass();
        p6 p6Var = p6.f107740b;
        q6 q6Var = q6.INT;
        switch (r0.k()) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof d3) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(n3Var.a()), n3Var.g().k(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof v3)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(n3Var.a()), n3Var.g().k(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof w4) || (obj instanceof b4)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(n3Var.a()), n3Var.g().k(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(n3Var.a()), n3Var.g().k(), obj.getClass().getName()));
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(n3Var.a()), n3Var.g().k(), obj.getClass().getName()));
    }

    public final void b() {
        if (this.f107724b) {
            return;
        }
        for (int i10 = 0; i10 < this.f107723a.b(); i10++) {
            Map.Entry entryG = this.f107723a.g(i10);
            if (entryG.getValue() instanceof t3) {
                ((t3) entryG.getValue()).h();
            }
        }
        this.f107723a.a();
        this.f107724b = true;
    }

    public final void c(n3 n3Var, Object obj) {
        if (!n3Var.h()) {
            d(n3Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(n3Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        if (obj instanceof b4) {
            this.f107725c = true;
        }
        this.f107723a.put(n3Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        o3 o3Var = new o3();
        for (int i10 = 0; i10 < this.f107723a.b(); i10++) {
            Map.Entry entryG = this.f107723a.g(i10);
            o3Var.c((n3) entryG.getKey(), entryG.getValue());
        }
        for (Map.Entry entry : this.f107723a.c()) {
            o3Var.c((n3) entry.getKey(), entry.getValue());
        }
        o3Var.f107725c = this.f107725c;
        return o3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3) {
            return this.f107723a.equals(((o3) obj).f107723a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f107723a.hashCode();
    }

    private o3(boolean z10) {
        b();
        b();
    }
}

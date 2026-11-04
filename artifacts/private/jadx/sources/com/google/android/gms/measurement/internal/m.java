package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f110239a;

    m() {
        this.f110239a = new EnumMap(q8.class);
    }

    public static m d(String str) {
        EnumMap enumMap = new EnumMap(q8.class);
        if (str.length() >= q8.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                q8[] q8VarArrValues = q8.values();
                int length = q8VarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(q8VarArrValues[i10], l.b(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new m(enumMap);
            }
        }
        return new m();
    }

    public final l a(q8 q8Var) {
        l lVar = (l) this.f110239a.get(q8Var);
        return lVar == null ? l.UNSET : lVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public final void b(q8 q8Var, int i10) {
        l lVar = l.UNSET;
        if (i10 == -30) {
            lVar = l.TCF;
        } else if (i10 == -20) {
            lVar = l.API;
        } else if (i10 == -10) {
            lVar = l.MANIFEST;
        } else if (i10 == 0) {
            lVar = l.API;
        } else if (i10 == 30) {
            lVar = l.INITIALIZATION;
        }
        this.f110239a.put(q8Var, lVar);
    }

    public final void c(q8 q8Var, l lVar) {
        this.f110239a.put(q8Var, lVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (q8 q8Var : q8.values()) {
            l lVar = (l) this.f110239a.get(q8Var);
            if (lVar == null) {
                lVar = l.UNSET;
            }
            sb2.append(lVar.k());
        }
        return sb2.toString();
    }

    private m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(q8.class);
        this.f110239a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}

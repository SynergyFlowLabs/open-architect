package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class v8 extends q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f108916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    private final com.google.common.base.s0 f108917b;

    v8(Context context, @fj.h com.google.common.base.s0 s0Var) {
        this.f108916a = context;
        this.f108917b = s0Var;
    }

    @Override // com.google.android.gms.internal.measurement.q9
    final Context a() {
        return this.f108916a;
    }

    @Override // com.google.android.gms.internal.measurement.q9
    @fj.h
    final com.google.common.base.s0 b() {
        return this.f108917b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r5.equals(r6.b()) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r4 = 1
            if (r6 != r5) goto L5
            return r0
        L5:
            boolean r1 = r6 instanceof com.google.android.gms.internal.measurement.q9
            r4 = 6
            r2 = 0
            if (r1 == 0) goto L34
            com.google.android.gms.internal.measurement.q9 r6 = (com.google.android.gms.internal.measurement.q9) r6
            android.content.Context r1 = r5.f108916a
            android.content.Context r3 = r6.a()
            r4 = 4
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            com.google.common.base.s0 r5 = r5.f108917b
            if (r5 != 0) goto L27
            com.google.common.base.s0 r5 = r6.b()
            r4 = 7
            if (r5 != 0) goto L34
            r4 = 1
            goto L32
        L27:
            com.google.common.base.s0 r6 = r6.b()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L32
            goto L34
        L32:
            r4 = 2
            return r0
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f108916a.hashCode() ^ 1000003;
        com.google.common.base.s0 s0Var = this.f108917b;
        return (s0Var == null ? 0 : s0Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f108916a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f108917b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}

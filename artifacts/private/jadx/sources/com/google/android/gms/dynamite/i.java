package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021 A[DONT_INVERT, PHI: r4
      0x0021: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0018, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0973b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0973b c0973b = new DynamiteModule.b.C0973b();
        c0973b.f107062a = aVar.b(context, str);
        int i10 = 1;
        int iA = aVar.a(context, str, true);
        c0973b.f107063b = iA;
        int i11 = c0973b.f107062a;
        if (i11 == 0) {
            i11 = 0;
            if (iA == 0) {
                i10 = 0;
            } else if (i11 >= iA) {
                i10 = -1;
            }
        } else if (i11 >= iA) {
            i10 = -1;
        }
        c0973b.f107064c = i10;
        return c0973b;
    }
}

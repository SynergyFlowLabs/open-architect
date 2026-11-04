package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0973b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int iA;
        DynamiteModule.b.C0973b c0973b = new DynamiteModule.b.C0973b();
        int iB = aVar.b(context, str);
        c0973b.f107062a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0973b.f107063b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0973b.f107063b = iA;
        }
        int i12 = c0973b.f107062a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0973b.f107064c = i10;
            return c0973b;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        c0973b.f107064c = i10;
        return c0973b;
    }
}

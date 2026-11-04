package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0973b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0973b c0973b = new DynamiteModule.b.C0973b();
        int iA = aVar.a(context, str, true);
        c0973b.f107063b = iA;
        if (iA != 0) {
            c0973b.f107064c = 1;
            return c0973b;
        }
        int iB = aVar.b(context, str);
        c0973b.f107062a = iB;
        if (iB != 0) {
            c0973b.f107064c = -1;
        }
        return c0973b;
    }
}

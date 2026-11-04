package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0973b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0973b c0973b = new DynamiteModule.b.C0973b();
        int iA = aVar.a(context, str, false);
        c0973b.f107063b = iA;
        c0973b.f107064c = iA != 0 ? 1 : 0;
        return c0973b;
    }
}

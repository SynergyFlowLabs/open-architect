package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class e implements DynamiteModule.b.a {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z10) throws DynamiteModule.a {
        return DynamiteModule.f(context, str, z10);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.h;

/* JADX INFO: loaded from: classes4.dex */
final class b extends com.google.android.gms.common.api.a.AbstractC0967a {
    b() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0967a
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.a.f c(Context context, Looper looper, h hVar, Object obj, l.b bVar, l.c cVar) {
        return new com.google.android.gms.signin.internal.a(context, looper, true, hVar, com.google.android.gms.signin.internal.a.w0(hVar), bVar, cVar);
    }
}

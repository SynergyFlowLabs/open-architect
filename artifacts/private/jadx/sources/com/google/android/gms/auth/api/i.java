package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.auth.b0;

/* JADX INFO: loaded from: classes4.dex */
final class i extends com.google.android.gms.common.api.a.AbstractC0967a {
    i() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0967a
    public final /* synthetic */ com.google.android.gms.common.api.a.f d(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Object obj, com.google.android.gms.common.api.internal.f fVar, r rVar) {
        return new b0(context, looper, hVar, (c) obj, fVar, rVar);
    }
}

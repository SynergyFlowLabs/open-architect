package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.h;

/* JADX INFO: loaded from: classes4.dex */
final class d extends a.AbstractC0967a {
    d() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0967a
    public final /* synthetic */ a.f d(Context context, Looper looper, h hVar, Object obj, f fVar, r rVar) {
        return new b0(context, looper, (j) obj, hVar, fVar, rVar);
    }
}

package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class f extends com.google.android.gms.common.api.a.AbstractC0967a {
    f() {
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* bridge */ /* synthetic */ List a(@p0 Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : googleSignInOptions.e2();
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0967a
    public final /* synthetic */ com.google.android.gms.common.api.a.f c(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, @p0 Object obj, l.b bVar, l.c cVar) {
        return new com.google.android.gms.auth.api.signin.internal.h(context, looper, hVar, (GoogleSignInOptions) obj, bVar, cVar);
    }
}

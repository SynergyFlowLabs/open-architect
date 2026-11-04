package com.google.android.gms.internal.auth;

import android.util.Base64;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class u1 extends z1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ z6 f107845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u1(v1 v1Var, String str, Object obj, boolean z10, z6 z6Var) {
        super(v1Var, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f107845m = z6Var;
    }

    @Override // com.google.android.gms.internal.auth.z1
    final Object a(Object obj) {
        try {
            return t6.r(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }
}

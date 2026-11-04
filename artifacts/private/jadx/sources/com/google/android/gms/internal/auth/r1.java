package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class r1 extends z1 {
    r1(v1 v1Var, String str, Long l10, boolean z10) {
        super(v1Var, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.z1
    @fj.h
    final /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

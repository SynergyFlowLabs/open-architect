package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class t1 extends z1 {
    t1(v1 v1Var, String str, Double d10, boolean z10) {
        super(v1Var, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.z1
    @fj.h
    final /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

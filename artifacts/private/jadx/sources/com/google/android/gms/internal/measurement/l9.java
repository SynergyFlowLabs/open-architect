package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class l9 extends v9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l9(p9 p9Var, String str, Long l10, boolean z10) {
        super(p9Var, str, l10, true, null);
        boolean z11 = true | false;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    @fj.h
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        new StringBuilder(this.f108924b.length() + 25 + obj.toString().length());
        return null;
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class m9 extends v9 {
    m9(p9 p9Var, String str, Boolean bool, boolean z10) {
        super(p9Var, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.v9
    @fj.h
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (o8.f108714c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (o8.f108715d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        new StringBuilder(this.f108924b.length() + 28 + obj.toString().length());
        return null;
    }
}

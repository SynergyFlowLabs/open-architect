package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class n9 extends v9 {
    n9(p9 p9Var, String str, Double d10, boolean z10) {
        super(p9Var, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.v9
    @fj.h
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        new StringBuilder(this.f108924b.length() + 27 + obj.toString().length());
        return null;
    }
}

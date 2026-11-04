package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f108558a;

    public i(Double d10) {
        if (d10 == null) {
            this.f108558a = Double.valueOf(Double.NaN);
        } else {
            this.f108558a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p Y() {
        return new i(this.f108558a);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f108558a.equals(((i) obj).f108558a);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    @Override // com.google.android.gms.internal.measurement.p
    public final String h() {
        Double d10 = this.f108558a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf(androidx.exifinterface.media.a.T4);
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        if (i10 >= 0) {
            if (i10 >= 0) {
            }
            return str.replace("E-", "e-").replace(androidx.exifinterface.media.a.T4, "e+");
        }
        int i11 = 5 | (-7);
        if (i10 <= -7) {
            if (i10 >= 0 || i10 >= 21) {
                return str.replace("E-", "e-").replace(androidx.exifinterface.media.a.T4, "e+");
            }
        }
        return bigDecimalStripTrailingZeros.toPlainString();
    }

    public final int hashCode() {
        return this.f108558a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Boolean j() {
        Double d10 = this.f108558a;
        boolean z10 = false;
        int i10 = 0 >> 0;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final Double m() {
        return this.f108558a;
    }

    @Override // com.google.android.gms.internal.measurement.p
    public final p p(String str, e5 e5Var, List list) {
        if ("toString".equals(str)) {
            return new t(h());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", h(), str));
    }

    public final String toString() {
        return h();
    }
}

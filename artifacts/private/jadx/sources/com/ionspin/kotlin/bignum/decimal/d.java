package com.ionspin.kotlin.bignum.decimal;

import androidx.collection.g3;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @NotNull
    public static final BigDecimal a(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.b1() > g3.f12256c) {
            throw new RuntimeException("Numbers with more digits than Int.MAX_VALUE cannot be converted to java BigDecimal");
        }
        if (!Intrinsics.areEqual(aVar, a.f131005i.h())) {
            return aVar.Z0() > 0 ? new BigDecimal(da.b.a(aVar.g1()), (int) ((aVar.b1() - aVar.Z0()) - 1)) : new BigDecimal(da.b.a(aVar.g1()), (int) ((aVar.b1() + Math.abs(aVar.Z0())) - 1));
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}

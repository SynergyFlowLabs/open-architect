package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class l {
    @NotNull
    public static final String a(@Nullable kotlin.ranges.n nVar, @Nullable Long l10, @NotNull e2 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return b(nVar, l10, unit.n());
    }

    @NotNull
    public static final String b(@Nullable kotlin.ranges.n nVar, @Nullable Long l10, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(unit);
        sb2.append(" ");
        if (nVar != null) {
            sb2.append(nVar.l());
            sb2.append(org.apache.commons.codec.language.l.f335457d);
            sb2.append(nVar.m());
        } else {
            sb2.append('*');
        }
        sb2.append('/');
        Object obj = l10;
        if (l10 == null) {
            obj = "*";
        }
        sb2.append(obj);
        return sb2.toString();
    }

    public static /* synthetic */ String c(kotlin.ranges.n nVar, Long l10, e2 e2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            e2Var = e2.Bytes;
        }
        return a(nVar, l10, e2Var);
    }

    public static /* synthetic */ String d(kotlin.ranges.n nVar, Long l10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            str = e2.Bytes.n();
        }
        return b(nVar, l10, str);
    }
}

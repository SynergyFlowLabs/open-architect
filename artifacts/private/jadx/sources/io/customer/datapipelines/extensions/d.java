package io.customer.datapipelines.extensions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull jh.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (Intrinsics.areEqual(bVar, jh.b.c.f307440c)) {
            return "cdp.customer.io/v1";
        }
        if (Intrinsics.areEqual(bVar, jh.b.C2241b.f307439c)) {
            return "cdp-eu.customer.io/v1";
        }
        throw new k0();
    }

    @NotNull
    public static final String b(@NotNull jh.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (Intrinsics.areEqual(bVar, jh.b.c.f307440c)) {
            return "cdp.customer.io/v1";
        }
        if (Intrinsics.areEqual(bVar, jh.b.C2241b.f307439c)) {
            return "cdp-eu.customer.io/v1";
        }
        throw new k0();
    }
}

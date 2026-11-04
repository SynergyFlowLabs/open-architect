package com.sdk.growthbook.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f266378a = value;
    }

    public static /* synthetic */ p l(p pVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pVar.f266378a;
        }
        return pVar.k(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f266378a, ((p) obj).f266378a);
    }

    public int hashCode() {
        return this.f266378a.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f266378a;
    }

    @NotNull
    public final p k(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new p(value);
    }

    @NotNull
    public final String m() {
        return this.f266378a;
    }

    @NotNull
    public String toString() {
        return "GBString(value=" + this.f266378a + ")";
    }
}

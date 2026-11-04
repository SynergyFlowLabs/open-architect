package com.sdk.growthbook.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266283a;

    public c(boolean z10) {
        super(null);
        this.f266283a = z10;
    }

    public static /* synthetic */ c l(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f266283a;
        }
        return cVar.k(z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f266283a == ((c) obj).f266283a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f266283a);
    }

    public final boolean i() {
        return this.f266283a;
    }

    @NotNull
    public final c k(boolean z10) {
        return new c(z10);
    }

    public final boolean m() {
        return this.f266283a;
    }

    @NotNull
    public String toString() {
        return "GBBoolean(value=" + this.f266283a + ")";
    }
}

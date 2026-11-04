package com.planner5d.library.model.manager.config.purchaseplacement;

import fd.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f181610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final e f181611b;

    public a(@NotNull e layout, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f181610a = layout;
        this.f181611b = eVar;
    }

    public static /* synthetic */ a d(a aVar, e eVar, e eVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = aVar.f181610a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = aVar.f181611b;
        }
        return aVar.c(eVar, eVar2);
    }

    @NotNull
    public final e a() {
        return this.f181610a;
    }

    @Nullable
    public final e b() {
        return this.f181611b;
    }

    @NotNull
    public final a c(@NotNull e layout, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new a(layout, eVar);
    }

    @Nullable
    public final e e() {
        return this.f181611b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f181610a == aVar.f181610a && this.f181611b == aVar.f181611b;
    }

    @NotNull
    public final e f() {
        return this.f181610a;
    }

    public int hashCode() {
        int iHashCode = this.f181610a.hashCode() * 31;
        e eVar = this.f181611b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "PurchasePagePlacement(layout=" + this.f181610a + ", fallback=" + this.f181611b + ")";
    }
}

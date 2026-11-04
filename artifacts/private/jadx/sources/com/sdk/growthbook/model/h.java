package com.sdk.growthbook.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final q f266333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<k> f266334b;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h d(h hVar, q qVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = hVar.f266333a;
        }
        if ((i10 & 2) != 0) {
            list = hVar.f266334b;
        }
        return hVar.c(qVar, list);
    }

    @Nullable
    public final q a() {
        return this.f266333a;
    }

    @Nullable
    public final List<k> b() {
        return this.f266334b;
    }

    @NotNull
    public final h c(@Nullable q qVar, @Nullable List<k> list) {
        return new h(qVar, list);
    }

    @Nullable
    public final q e() {
        return this.f266333a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f266333a, hVar.f266333a) && Intrinsics.areEqual(this.f266334b, hVar.f266334b);
    }

    @Nullable
    public final List<k> f() {
        return this.f266334b;
    }

    public int hashCode() {
        q qVar = this.f266333a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        List<k> list = this.f266334b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GBFeature(defaultValue=" + this.f266333a + ", rules=" + this.f266334b + ")";
    }

    public h(@Nullable q qVar, @Nullable List<k> list) {
        this.f266333a = qVar;
        this.f266334b = list;
    }

    public /* synthetic */ h(q qVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? null : list);
    }
}

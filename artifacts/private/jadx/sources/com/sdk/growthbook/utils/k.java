package com.sdk.growthbook.utils;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f266506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, com.sdk.growthbook.model.q> f266507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f266508c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull Map<String, ? extends Object> attributes, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> forcedFeatures, @NotNull Map<String, ? extends Object> forcedVariations) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(forcedFeatures, "forcedFeatures");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        this.f266506a = attributes;
        this.f266507b = forcedFeatures;
        this.f266508c = forcedVariations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k e(k kVar, Map map, Map map2, Map map3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = kVar.f266506a;
        }
        if ((i10 & 2) != 0) {
            map2 = kVar.f266507b;
        }
        if ((i10 & 4) != 0) {
            map3 = kVar.f266508c;
        }
        return kVar.d(map, map2, map3);
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f266506a;
    }

    @NotNull
    public final Map<String, com.sdk.growthbook.model.q> b() {
        return this.f266507b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f266508c;
    }

    @NotNull
    public final k d(@NotNull Map<String, ? extends Object> attributes, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> forcedFeatures, @NotNull Map<String, ? extends Object> forcedVariations) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(forcedFeatures, "forcedFeatures");
        Intrinsics.checkNotNullParameter(forcedVariations, "forcedVariations");
        return new k(attributes, forcedFeatures, forcedVariations);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Intrinsics.areEqual(this.f266506a, kVar.f266506a) && Intrinsics.areEqual(this.f266507b, kVar.f266507b) && Intrinsics.areEqual(this.f266508c, kVar.f266508c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f266506a;
    }

    @NotNull
    public final Map<String, com.sdk.growthbook.model.q> g() {
        return this.f266507b;
    }

    @NotNull
    public final Map<String, Object> h() {
        return this.f266508c;
    }

    public int hashCode() {
        return (((this.f266506a.hashCode() * 31) + this.f266507b.hashCode()) * 31) + this.f266508c.hashCode();
    }

    @NotNull
    public String toString() {
        return "GBRemoteEvalParams(attributes=" + this.f266506a + ", forcedFeatures=" + this.f266507b + ", forcedVariations=" + this.f266508c + ")";
    }
}

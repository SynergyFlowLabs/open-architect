package com.sdk.growthbook.model;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f266280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<String> f266281b;

    public a(@Nullable String str, @NotNull Set<String> evaluatedFeatures) {
        Intrinsics.checkNotNullParameter(evaluatedFeatures, "evaluatedFeatures");
        this.f266280a = str;
        this.f266281b = evaluatedFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f266280a;
        }
        if ((i10 & 2) != 0) {
            set = aVar.f266281b;
        }
        return aVar.c(str, set);
    }

    @Nullable
    public final String a() {
        return this.f266280a;
    }

    @NotNull
    public final Set<String> b() {
        return this.f266281b;
    }

    @NotNull
    public final a c(@Nullable String str, @NotNull Set<String> evaluatedFeatures) {
        Intrinsics.checkNotNullParameter(evaluatedFeatures, "evaluatedFeatures");
        return new a(str, evaluatedFeatures);
    }

    @NotNull
    public final Set<String> e() {
        return this.f266281b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f266280a, aVar.f266280a) && Intrinsics.areEqual(this.f266281b, aVar.f266281b);
    }

    @Nullable
    public final String f() {
        return this.f266280a;
    }

    public int hashCode() {
        String str = this.f266280a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f266281b.hashCode();
    }

    @NotNull
    public String toString() {
        return "FeatureEvalContext(id=" + this.f266280a + ", evaluatedFeatures=" + this.f266281b + ")";
    }
}

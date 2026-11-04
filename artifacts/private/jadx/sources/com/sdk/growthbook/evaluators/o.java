package com.sdk.growthbook.evaluators;

import com.sdk.growthbook.model.q;
import com.sdk.growthbook.utils.GBStickyAssignmentsDocument;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, q> f266226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, GBStickyAssignmentsDocument> f266227c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(boolean z10, @NotNull Map<String, ? extends q> attributes, @Nullable Map<String, GBStickyAssignmentsDocument> map) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f266225a = z10;
        this.f266226b = attributes;
        this.f266227c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o e(o oVar, boolean z10, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = oVar.f266225a;
        }
        if ((i10 & 2) != 0) {
            map = oVar.f266226b;
        }
        if ((i10 & 4) != 0) {
            map2 = oVar.f266227c;
        }
        return oVar.d(z10, map, map2);
    }

    public final boolean a() {
        return this.f266225a;
    }

    @NotNull
    public final Map<String, q> b() {
        return this.f266226b;
    }

    @Nullable
    public final Map<String, GBStickyAssignmentsDocument> c() {
        return this.f266227c;
    }

    @NotNull
    public final o d(boolean z10, @NotNull Map<String, ? extends q> attributes, @Nullable Map<String, GBStickyAssignmentsDocument> map) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new o(z10, attributes, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f266225a == oVar.f266225a && Intrinsics.areEqual(this.f266226b, oVar.f266226b) && Intrinsics.areEqual(this.f266227c, oVar.f266227c);
    }

    @NotNull
    public final Map<String, q> f() {
        return this.f266226b;
    }

    public final boolean g() {
        return this.f266225a;
    }

    @Nullable
    public final Map<String, GBStickyAssignmentsDocument> h() {
        return this.f266227c;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f266225a) * 31) + this.f266226b.hashCode()) * 31;
        Map<String, GBStickyAssignmentsDocument> map = this.f266227c;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void i(@Nullable Map<String, GBStickyAssignmentsDocument> map) {
        this.f266227c = map;
    }

    @NotNull
    public String toString() {
        return "UserContext(qaMode=" + this.f266225a + ", attributes=" + this.f266226b + ", stickyBucketAssignmentDocs=" + this.f266227c + ")";
    }
}

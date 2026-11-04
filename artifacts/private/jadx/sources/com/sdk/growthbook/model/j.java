package com.sdk.growthbook.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final q f266335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f266336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f266337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l f266338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final f f266339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final g f266340f;

    public j(@Nullable q qVar, boolean z10, boolean z11, @NotNull l source, @Nullable f fVar, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f266335a = qVar;
        this.f266336b = z10;
        this.f266337c = z11;
        this.f266338d = source;
        this.f266339e = fVar;
        this.f266340f = gVar;
    }

    public static /* synthetic */ j h(j jVar, q qVar, boolean z10, boolean z11, l lVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = jVar.f266335a;
        }
        if ((i10 & 2) != 0) {
            z10 = jVar.f266336b;
        }
        if ((i10 & 4) != 0) {
            z11 = jVar.f266337c;
        }
        if ((i10 & 8) != 0) {
            lVar = jVar.f266338d;
        }
        if ((i10 & 16) != 0) {
            fVar = jVar.f266339e;
        }
        if ((i10 & 32) != 0) {
            gVar = jVar.f266340f;
        }
        f fVar2 = fVar;
        g gVar2 = gVar;
        return jVar.g(qVar, z10, z11, lVar, fVar2, gVar2);
    }

    @Nullable
    public final q a() {
        return this.f266335a;
    }

    public final boolean b() {
        return this.f266336b;
    }

    public final boolean c() {
        return this.f266337c;
    }

    @NotNull
    public final l d() {
        return this.f266338d;
    }

    @Nullable
    public final f e() {
        return this.f266339e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f266335a, jVar.f266335a) && this.f266336b == jVar.f266336b && this.f266337c == jVar.f266337c && this.f266338d == jVar.f266338d && Intrinsics.areEqual(this.f266339e, jVar.f266339e) && Intrinsics.areEqual(this.f266340f, jVar.f266340f);
    }

    @Nullable
    public final g f() {
        return this.f266340f;
    }

    @NotNull
    public final j g(@Nullable q qVar, boolean z10, boolean z11, @NotNull l source, @Nullable f fVar, @Nullable g gVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new j(qVar, z10, z11, source, fVar, gVar);
    }

    public int hashCode() {
        q qVar = this.f266335a;
        int iHashCode = (((((((qVar == null ? 0 : qVar.hashCode()) * 31) + Boolean.hashCode(this.f266336b)) * 31) + Boolean.hashCode(this.f266337c)) * 31) + this.f266338d.hashCode()) * 31;
        f fVar = this.f266339e;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.f266340f;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Nullable
    public final f i() {
        return this.f266339e;
    }

    @Nullable
    public final g j() {
        return this.f266340f;
    }

    @Nullable
    public final q k() {
        return this.f266335a;
    }

    public final boolean l() {
        return this.f266337c;
    }

    public final boolean m() {
        return this.f266336b;
    }

    @NotNull
    public final l n() {
        return this.f266338d;
    }

    @NotNull
    public String toString() {
        return "GBFeatureResult(gbValue=" + this.f266335a + ", on=" + this.f266336b + ", off=" + this.f266337c + ", source=" + this.f266338d + ", experiment=" + this.f266339e + ", experimentResult=" + this.f266340f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(q qVar, boolean z10, boolean z11, l lVar, f fVar, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z12 = (i10 & 2) != 0 ? false : z10;
        this(qVar, z12, (i10 & 4) != 0 ? !z12 : z11, lVar, (i10 & 16) != 0 ? null : fVar, (i10 & 32) != 0 ? null : gVar);
    }
}

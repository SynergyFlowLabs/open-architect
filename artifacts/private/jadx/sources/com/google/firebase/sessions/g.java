package com.google.firebase.sessions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f125028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f125029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f125030c;

    public g() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ g e(g gVar, f fVar, f fVar2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = gVar.f125028a;
        }
        if ((i10 & 2) != 0) {
            fVar2 = gVar.f125029b;
        }
        if ((i10 & 4) != 0) {
            d10 = gVar.f125030c;
        }
        return gVar.d(fVar, fVar2, d10);
    }

    @NotNull
    public final f a() {
        return this.f125028a;
    }

    @NotNull
    public final f b() {
        return this.f125029b;
    }

    public final double c() {
        return this.f125030c;
    }

    @NotNull
    public final g d(@NotNull f performance, @NotNull f crashlytics, double d10) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        return new g(performance, crashlytics, d10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f125028a == gVar.f125028a && this.f125029b == gVar.f125029b && Double.compare(this.f125030c, gVar.f125030c) == 0;
    }

    @NotNull
    public final f f() {
        return this.f125029b;
    }

    @NotNull
    public final f g() {
        return this.f125028a;
    }

    public final double h() {
        return this.f125030c;
    }

    public int hashCode() {
        return (((this.f125028a.hashCode() * 31) + this.f125029b.hashCode()) * 31) + Double.hashCode(this.f125030c);
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.f125028a + ", crashlytics=" + this.f125029b + ", sessionSamplingRate=" + this.f125030c + ')';
    }

    public g(@NotNull f performance, @NotNull f crashlytics, double d10) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f125028a = performance;
        this.f125029b = crashlytics;
        this.f125030c = d10;
    }

    public /* synthetic */ g(f fVar, f fVar2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f.COLLECTION_SDK_NOT_INSTALLED : fVar, (i10 & 2) != 0 ? f.COLLECTION_SDK_NOT_INSTALLED : fVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}

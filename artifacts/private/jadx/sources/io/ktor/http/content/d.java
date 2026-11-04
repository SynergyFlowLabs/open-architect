package io.ktor.http.content;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final io.ktor.http.c f295699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final GMTDate f295700b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ d d(d dVar, io.ktor.http.c cVar, GMTDate gMTDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = dVar.f295699a;
        }
        if ((i10 & 2) != 0) {
            gMTDate = dVar.f295700b;
        }
        return dVar.c(cVar, gMTDate);
    }

    @Nullable
    public final io.ktor.http.c a() {
        return this.f295699a;
    }

    @Nullable
    public final GMTDate b() {
        return this.f295700b;
    }

    @NotNull
    public final d c(@Nullable io.ktor.http.c cVar, @Nullable GMTDate gMTDate) {
        return new d(cVar, gMTDate);
    }

    @Nullable
    public final io.ktor.http.c e() {
        return this.f295699a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f295699a, dVar.f295699a) && Intrinsics.areEqual(this.f295700b, dVar.f295700b);
    }

    @Nullable
    public final GMTDate f() {
        return this.f295700b;
    }

    public int hashCode() {
        io.ktor.http.c cVar = this.f295699a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        GMTDate gMTDate = this.f295700b;
        return iHashCode + (gMTDate != null ? gMTDate.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CachingOptions(cacheControl=" + this.f295699a + ", expires=" + this.f295700b + ')';
    }

    public d(@Nullable io.ktor.http.c cVar, @Nullable GMTDate gMTDate) {
        this.f295699a = cVar;
        this.f295700b = gMTDate;
    }

    public /* synthetic */ d(io.ktor.http.c cVar, GMTDate gMTDate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : gMTDate);
    }
}

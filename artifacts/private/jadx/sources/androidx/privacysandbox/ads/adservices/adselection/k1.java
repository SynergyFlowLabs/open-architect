package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.d
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73443c;

    public k1(long j10, int i10, @NotNull androidx.privacysandbox.ads.adservices.common.p callerAdTech) {
        Intrinsics.checkNotNullParameter(callerAdTech, "callerAdTech");
        this.f73441a = j10;
        this.f73442b = i10;
        this.f73443c = callerAdTech;
        if (i10 == 0) {
            throw new IllegalArgumentException("Win event types cannot be manually updated.");
        }
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException("Ad event type must be one of AD_EVENT_TYPE_IMPRESSION, AD_EVENT_TYPE_VIEW, or AD_EVENT_TYPE_CLICK");
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 8), @androidx.annotation.x0(extension = 31, version = 9)})
    @NotNull
    public final UpdateAdCounterHistogramRequest a() {
        j1.a();
        UpdateAdCounterHistogramRequest updateAdCounterHistogramRequestBuild = i1.a(this.f73441a, this.f73442b, this.f73443c.a()).build();
        Intrinsics.checkNotNullExpressionValue(updateAdCounterHistogramRequestBuild, "Builder(\n               …   )\n            .build()");
        return updateAdCounterHistogramRequestBuild;
    }

    public final int b() {
        return this.f73442b;
    }

    public final long c() {
        return this.f73441a;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p d() {
        return this.f73443c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f73441a == k1Var.f73441a && this.f73442b == k1Var.f73442b && Intrinsics.areEqual(this.f73443c, k1Var.f73443c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f73441a) * 31) + Integer.hashCode(this.f73442b)) * 31) + this.f73443c.hashCode();
    }

    @NotNull
    public String toString() {
        String str;
        int i10 = this.f73442b;
        if (i10 == 0) {
            str = "AD_EVENT_TYPE_WIN";
        } else if (i10 == 1) {
            str = "AD_EVENT_TYPE_IMPRESSION";
        } else if (i10 != 2) {
            str = i10 != 3 ? "Invalid ad event type" : "AD_EVENT_TYPE_CLICK";
        } else {
            str = "AD_EVENT_TYPE_VIEW";
        }
        return "UpdateAdCounterHistogramRequest: adSelectionId=" + this.f73441a + ", adEventType=" + str + ", callerAdTech=" + this.f73443c;
    }
}

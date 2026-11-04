package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.time.Instant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.a
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f73527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Instant f73528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Instant f73529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.privacysandbox.ads.adservices.common.n f73530e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o0(@NotNull Uri fetchUri) {
        this(fetchUri, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
        boolean z10 = true & false;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 10), @x0(extension = 31, version = 10)})
    @NotNull
    public final FetchAndJoinCustomAudienceRequest a() {
        n0.a();
        FetchAndJoinCustomAudienceRequest.Builder expirationTime = m0.a(this.f73526a).setName(this.f73527b).setActivationTime(this.f73528c).setExpirationTime(this.f73529d);
        androidx.privacysandbox.ads.adservices.common.n nVar = this.f73530e;
        FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = expirationTime.setUserBiddingSignals(nVar != null ? nVar.a() : null).build();
        Intrinsics.checkNotNullExpressionValue(fetchAndJoinCustomAudienceRequestBuild, "Builder(fetchUri)\n      …s())\n            .build()");
        return fetchAndJoinCustomAudienceRequestBuild;
    }

    @Nullable
    public final Instant b() {
        return this.f73528c;
    }

    @Nullable
    public final Instant c() {
        return this.f73529d;
    }

    @NotNull
    public final Uri d() {
        return this.f73526a;
    }

    @Nullable
    public final String e() {
        return this.f73527b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.areEqual(this.f73526a, o0Var.f73526a) && Intrinsics.areEqual(this.f73527b, o0Var.f73527b) && Intrinsics.areEqual(this.f73528c, o0Var.f73528c) && Intrinsics.areEqual(this.f73529d, o0Var.f73529d) && Intrinsics.areEqual(this.f73530e, o0Var.f73530e);
    }

    @Nullable
    public final androidx.privacysandbox.ads.adservices.common.n f() {
        return this.f73530e;
    }

    public int hashCode() {
        int iHashCode = this.f73526a.hashCode() * 31;
        String str = this.f73527b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Instant instant = this.f73528c;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f73529d;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31;
        androidx.privacysandbox.ads.adservices.common.n nVar = this.f73530e;
        return iHashCode4 + (nVar != null ? nVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FetchAndJoinCustomAudienceRequest: fetchUri=" + this.f73526a + ", name=" + this.f73527b + ", activationTime=" + this.f73528c + ", expirationTime=" + this.f73529d + ", userBiddingSignals=" + this.f73530e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o0(@NotNull Uri fetchUri, @Nullable String str) {
        this(fetchUri, str, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o0(@NotNull Uri fetchUri, @Nullable String str, @Nullable Instant instant) {
        this(fetchUri, str, instant, null, null, 24, null);
        Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public o0(@NotNull Uri fetchUri, @Nullable String str, @Nullable Instant instant, @Nullable Instant instant2) {
        this(fetchUri, str, instant, instant2, null, 16, null);
        Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
    }

    @oj.j
    public o0(@NotNull Uri fetchUri, @Nullable String str, @Nullable Instant instant, @Nullable Instant instant2, @Nullable androidx.privacysandbox.ads.adservices.common.n nVar) {
        Intrinsics.checkNotNullParameter(fetchUri, "fetchUri");
        this.f73526a = fetchUri;
        this.f73527b = str;
        this.f73528c = instant;
        this.f73529d = instant2;
        this.f73530e = nVar;
    }

    public /* synthetic */ o0(Uri uri, String str, Instant instant, Instant instant2, androidx.privacysandbox.ads.adservices.common.n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : instant, (i10 & 8) != 0 ? null : instant2, (i10 & 16) != 0 ? null : nVar);
    }
}

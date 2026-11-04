package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f73535b;

    public r0(@NotNull Uri trustedBiddingUri, @NotNull List<String> trustedBiddingKeys) {
        Intrinsics.checkNotNullParameter(trustedBiddingUri, "trustedBiddingUri");
        Intrinsics.checkNotNullParameter(trustedBiddingKeys, "trustedBiddingKeys");
        this.f73534a = trustedBiddingUri;
        this.f73535b = trustedBiddingKeys;
    }

    @NotNull
    public final List<String> a() {
        return this.f73535b;
    }

    @NotNull
    public final Uri b() {
        return this.f73534a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f73534a, r0Var.f73534a) && Intrinsics.areEqual(this.f73535b, r0Var.f73535b);
    }

    public int hashCode() {
        return (this.f73534a.hashCode() * 31) + this.f73535b.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.f73534a + " trustedBiddingKeys=" + this.f73535b;
    }
}

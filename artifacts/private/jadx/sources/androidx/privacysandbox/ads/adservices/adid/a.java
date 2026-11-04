package androidx.privacysandbox.ads.adservices.adid;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73395b;

    public a(@NotNull String adId, boolean z10) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f73394a = adId;
        this.f73395b = z10;
    }

    @NotNull
    public final String a() {
        return this.f73394a;
    }

    public final boolean b() {
        return this.f73395b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f73394a, aVar.f73394a) && this.f73395b == aVar.f73395b;
    }

    public int hashCode() {
        return (this.f73394a.hashCode() * 31) + Boolean.hashCode(this.f73395b);
    }

    @NotNull
    public String toString() {
        return "AdId: adId=" + this.f73394a + ", isLimitAdTrackingEnabled=" + this.f73395b;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}

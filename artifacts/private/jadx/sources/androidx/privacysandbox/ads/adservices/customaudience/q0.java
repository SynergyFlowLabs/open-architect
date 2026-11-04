package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73533b;

    public q0(@NotNull androidx.privacysandbox.ads.adservices.common.p buyer, @NotNull String name) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f73532a = buyer;
        this.f73533b = name;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p a() {
        return this.f73532a;
    }

    @NotNull
    public final String b() {
        return this.f73533b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f73532a, q0Var.f73532a) && Intrinsics.areEqual(this.f73533b, q0Var.f73533b);
    }

    public int hashCode() {
        return (this.f73532a.hashCode() * 31) + this.f73533b.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.f73532a + ", name=" + this.f73533b;
    }
}

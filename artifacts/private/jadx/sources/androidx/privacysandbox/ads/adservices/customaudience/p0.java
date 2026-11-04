package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f73531a;

    public p0(@NotNull a customAudience) {
        Intrinsics.checkNotNullParameter(customAudience, "customAudience");
        this.f73531a = customAudience;
    }

    @NotNull
    public final a a() {
        return this.f73531a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return Intrinsics.areEqual(this.f73531a, ((p0) obj).f73531a);
        }
        return false;
    }

    public int hashCode() {
        return this.f73531a.hashCode();
    }

    @NotNull
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.f73531a;
    }
}

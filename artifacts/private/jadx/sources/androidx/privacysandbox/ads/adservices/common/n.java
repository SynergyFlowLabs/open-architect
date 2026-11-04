package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdSelectionSignals;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73493a;

    public n(@NotNull String signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.f73493a = signals;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final AdSelectionSignals a() {
        AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(this.f73493a);
        Intrinsics.checkNotNullExpressionValue(adSelectionSignalsFromString, "fromString(signals)");
        return adSelectionSignalsFromString;
    }

    @NotNull
    public final String b() {
        return this.f73493a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return Intrinsics.areEqual(this.f73493a, ((n) obj).f73493a);
        }
        return false;
    }

    public int hashCode() {
        return this.f73493a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionSignals: " + this.f73493a;
    }
}

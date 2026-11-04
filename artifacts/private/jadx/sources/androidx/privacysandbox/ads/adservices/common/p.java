package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdTechIdentifier;
import androidx.annotation.b1;
import androidx.annotation.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73494a;

    public p(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f73494a = identifier;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    @NotNull
    public final AdTechIdentifier a() {
        AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(this.f73494a);
        Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(identifier)");
        return adTechIdentifierFromString;
    }

    @NotNull
    public final String b() {
        return this.f73494a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f73494a, ((p) obj).f73494a);
        }
        return false;
    }

    public int hashCode() {
        return this.f73494a.hashCode();
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f73494a);
    }
}

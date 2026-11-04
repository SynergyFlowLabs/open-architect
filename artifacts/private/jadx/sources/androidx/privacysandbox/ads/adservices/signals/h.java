package androidx.privacysandbox.ads.adservices.signals;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q.c
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73679a;

    public h(@NotNull Uri updateUri) {
        Intrinsics.checkNotNullParameter(updateUri, "updateUri");
        this.f73679a = updateUri;
    }

    @NotNull
    public final Uri a() {
        return this.f73679a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Intrinsics.areEqual(this.f73679a, ((h) obj).f73679a);
        }
        return false;
    }

    public int hashCode() {
        return this.f73679a.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpdateSignalsRequest: updateUri=" + this.f73679a;
    }
}

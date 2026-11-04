package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionOutcome;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f73437c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final j0 f73438d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f73440b;

    @androidx.privacysandbox.ads.adservices.common.q.a
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.privacysandbox.ads.adservices.common.q.a
        public static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        f73438d = new j0(0L, EMPTY);
    }

    public j0(long j10, @NotNull Uri renderUri) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        this.f73439a = j10;
        this.f73440b = renderUri;
    }

    public final long a() {
        return this.f73439a;
    }

    @NotNull
    public final Uri b() {
        return this.f73440b;
    }

    @androidx.privacysandbox.ads.adservices.common.q.a
    public final boolean c() {
        return !Intrinsics.areEqual(this, f73438d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f73439a == j0Var.f73439a && Intrinsics.areEqual(this.f73440b, j0Var.f73440b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f73439a) * 31) + this.f73440b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f73439a + ", renderUri=" + this.f73440b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
    public j0(@NotNull AdSelectionOutcome response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long adSelectionId = response.getAdSelectionId();
        Uri renderUri = response.getRenderUri();
        Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
        this(adSelectionId, renderUri);
    }
}

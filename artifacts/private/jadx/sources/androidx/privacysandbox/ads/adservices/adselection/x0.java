package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.PersistAdSelectionResultRequest;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.a
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.privacysandbox.ads.adservices.common.p f73457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final byte[] f73458c;

    @oj.j
    public x0(long j10) {
        this(j10, null, null, 6, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    @NotNull
    public final PersistAdSelectionResultRequest a() {
        PersistAdSelectionResultRequest.Builder adSelectionId = w0.a().setAdSelectionId(this.f73456a);
        androidx.privacysandbox.ads.adservices.common.p pVar = this.f73457b;
        PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = adSelectionId.setSeller(pVar != null ? pVar.a() : null).setAdSelectionResult(this.f73458c).build();
        Intrinsics.checkNotNullExpressionValue(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
        return persistAdSelectionResultRequestBuild;
    }

    public final long b() {
        return this.f73456a;
    }

    @Nullable
    public final byte[] c() {
        return this.f73458c;
    }

    @Nullable
    public final androidx.privacysandbox.ads.adservices.common.p d() {
        return this.f73457b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f73456a == x0Var.f73456a && Intrinsics.areEqual(this.f73457b, x0Var.f73457b) && Arrays.equals(this.f73458c, x0Var.f73458c);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f73456a) * 31;
        androidx.privacysandbox.ads.adservices.common.p pVar = this.f73457b;
        int i10 = 0 >> 0;
        int iHashCode2 = (iHashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        byte[] bArr = this.f73458c;
        return iHashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.f73456a + ", seller=" + this.f73457b + ", adSelectionResult=" + this.f73458c;
    }

    @oj.j
    public x0(long j10, @Nullable androidx.privacysandbox.ads.adservices.common.p pVar) {
        this(j10, pVar, null, 4, null);
    }

    @oj.j
    public x0(long j10, @Nullable androidx.privacysandbox.ads.adservices.common.p pVar, @Nullable byte[] bArr) {
        this.f73456a = j10;
        this.f73457b = pVar;
        this.f73458c = bArr;
    }

    public /* synthetic */ x0(long j10, androidx.privacysandbox.ads.adservices.common.p pVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : pVar, (i10 & 4) != 0 ? null : bArr);
    }
}

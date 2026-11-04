package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.GetAdSelectionDataOutcome;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.a
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final byte[] f73445b;

    @oj.j
    public m0(long j10) {
        this(j10, null, 2, null);
    }

    @Nullable
    public final byte[] a() {
        return this.f73445b;
    }

    public final long b() {
        return this.f73444a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f73444a == m0Var.f73444a && Arrays.equals(this.f73445b, m0Var.f73445b);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f73444a) * 31;
        byte[] bArr = this.f73445b;
        return iHashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.f73444a + ", adSelectionData=" + this.f73445b;
    }

    @oj.j
    public m0(long j10, @Nullable byte[] bArr) {
        this.f73444a = j10;
        this.f73445b = bArr;
    }

    public /* synthetic */ m0(long j10, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    public m0(@NotNull GetAdSelectionDataOutcome response) {
        this(response.getAdSelectionId(), response.getAdSelectionData());
        Intrinsics.checkNotNullParameter(response, "response");
    }
}

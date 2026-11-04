package androidx.compose.ui.contentcapture;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f37113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.platform.coreshims.d f37114d;

    public l(int i10, long j10, @NotNull m mVar, @Nullable androidx.compose.ui.platform.coreshims.d dVar) {
        this.f37111a = i10;
        this.f37112b = j10;
        this.f37113c = mVar;
        this.f37114d = dVar;
    }

    public static /* synthetic */ l f(l lVar, int i10, long j10, m mVar, androidx.compose.ui.platform.coreshims.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = lVar.f37111a;
        }
        if ((i11 & 2) != 0) {
            j10 = lVar.f37112b;
        }
        if ((i11 & 4) != 0) {
            mVar = lVar.f37113c;
        }
        if ((i11 & 8) != 0) {
            dVar = lVar.f37114d;
        }
        return lVar.e(i10, j10, mVar, dVar);
    }

    public final int a() {
        return this.f37111a;
    }

    public final long b() {
        return this.f37112b;
    }

    @NotNull
    public final m c() {
        return this.f37113c;
    }

    @Nullable
    public final androidx.compose.ui.platform.coreshims.d d() {
        return this.f37114d;
    }

    @NotNull
    public final l e(int i10, long j10, @NotNull m mVar, @Nullable androidx.compose.ui.platform.coreshims.d dVar) {
        return new l(i10, j10, mVar, dVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f37111a == lVar.f37111a && this.f37112b == lVar.f37112b && this.f37113c == lVar.f37113c && Intrinsics.areEqual(this.f37114d, lVar.f37114d);
    }

    public final int g() {
        return this.f37111a;
    }

    @Nullable
    public final androidx.compose.ui.platform.coreshims.d h() {
        return this.f37114d;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f37111a) * 31) + Long.hashCode(this.f37112b)) * 31) + this.f37113c.hashCode()) * 31;
        androidx.compose.ui.platform.coreshims.d dVar = this.f37114d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final long i() {
        return this.f37112b;
    }

    @NotNull
    public final m j() {
        return this.f37113c;
    }

    @NotNull
    public String toString() {
        return "ContentCaptureEvent(id=" + this.f37111a + ", timestamp=" + this.f37112b + ", type=" + this.f37113c + ", structureCompat=" + this.f37114d + ')';
    }
}

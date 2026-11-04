package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class wd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34211d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34214c;

    public /* synthetic */ wd(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f34214c;
    }

    public final long b() {
        return this.f34213b;
    }

    public final long c() {
        return this.f34212a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return androidx.compose.ui.unit.l.l(this.f34212a, wdVar.f34212a) && androidx.compose.ui.unit.l.l(this.f34213b, wdVar.f34213b) && androidx.compose.ui.unit.l.l(this.f34214c, wdVar.f34214c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.l.r(this.f34212a) * 31) + androidx.compose.ui.unit.l.r(this.f34213b)) * 31) + androidx.compose.ui.unit.l.r(this.f34214c);
    }

    private wd(long j10, long j11, long j12) {
        this.f34212a = j10;
        this.f34213b = j11;
        this.f34214c = j12;
    }
}

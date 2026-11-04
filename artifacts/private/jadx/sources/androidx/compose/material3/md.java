package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class md {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30603d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30606c;

    public /* synthetic */ md(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f30604a;
    }

    public final long b() {
        return this.f30606c;
    }

    public final long c() {
        return this.f30605b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        return androidx.compose.ui.graphics.q0.y(this.f30604a, mdVar.f30604a) && androidx.compose.ui.graphics.q0.y(this.f30605b, mdVar.f30605b) && androidx.compose.ui.graphics.q0.y(this.f30606c, mdVar.f30606c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.q0.K(this.f30604a) * 31) + androidx.compose.ui.graphics.q0.K(this.f30605b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30606c);
    }

    private md(long j10, long j11, long j12) {
        this.f30604a = j10;
        this.f30605b = j11;
        this.f30606c = j12;
    }
}

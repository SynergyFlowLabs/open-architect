package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39009d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39012c;

    public /* synthetic */ f(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f39012c;
    }

    public final long b() {
        return this.f39011b;
    }

    public final long c() {
        return this.f39010a;
    }

    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f39010a + ", position=" + ((Object) n0.g.z(this.f39011b)) + ')';
    }

    public /* synthetic */ f(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private f(long j10, long j11) {
        this.f39010a = j10;
        this.f39011b = j11;
        this.f39012c = n0.g.f332700b.e();
    }

    private f(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.f39012c = j12;
    }
}

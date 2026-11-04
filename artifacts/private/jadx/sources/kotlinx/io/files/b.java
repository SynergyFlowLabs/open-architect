package kotlinx.io.files;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f315758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f315759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f315760c;

    public b() {
        this(false, false, 0L, 7, null);
    }

    public final long a() {
        return this.f315760c;
    }

    public final boolean b() {
        return this.f315759b;
    }

    public final boolean c() {
        return this.f315758a;
    }

    public b(boolean z10, boolean z11, long j10) {
        this.f315758a = z10;
        this.f315759b = z11;
        this.f315760c = j10;
    }

    public /* synthetic */ b(boolean z10, boolean z11, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? 0L : j10);
    }
}

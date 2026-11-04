package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class a implements TimeMark {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final TimeMark f313404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f313405b;

    public /* synthetic */ a(TimeMark timeMark, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j10);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    public TimeMark C(long j10) {
        return new a(this.f313404a, c.A0(this.f313405b, j10), null);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    public TimeMark G(long j10) {
        return TimeMark.a.c(this, j10);
    }

    public final long a() {
        return this.f313405b;
    }

    @NotNull
    public final TimeMark b() {
        return this.f313404a;
    }

    @Override // kotlin.time.TimeMark
    public long k() {
        return c.z0(this.f313404a.k(), this.f313405b);
    }

    @Override // kotlin.time.TimeMark
    public boolean l() {
        return TimeMark.a.a(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean n() {
        return TimeMark.a.b(this);
    }

    private a(TimeMark mark, long j10) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.f313404a = mark;
        this.f313405b = j10;
    }
}

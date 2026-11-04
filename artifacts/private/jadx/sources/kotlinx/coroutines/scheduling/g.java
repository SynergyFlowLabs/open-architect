package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class g extends z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f315479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f315480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f315481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f315482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private a f315483g;

    public g() {
        this(0, 0, 0L, null, 15, null);
    }

    private final a O0() {
        return new a(this.f315479c, this.f315480d, this.f315481e, this.f315482f);
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public Executor M0() {
        return this.f315483g;
    }

    public final void R0(@NotNull Runnable runnable, boolean z10, boolean z11) {
        this.f315483g.m(runnable, z10, z11);
    }

    public final void T0() {
        e1();
    }

    public final synchronized void U0(long j10) {
        this.f315483g.w0(j10);
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f315483g.close();
    }

    public final synchronized void e1() {
        this.f315483g.w0(1000L);
        this.f315483g = O0();
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a.o(this.f315483g, runnable, false, false, 6, null);
    }

    @Override // kotlinx.coroutines.n0
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        int i10 = 7 << 0;
        a.o(this.f315483g, runnable, false, true, 2, null);
    }

    public /* synthetic */ g(int i10, int i11, long j10, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? k.f315489c : i10, (i12 & 2) != 0 ? k.f315490d : i11, (i12 & 4) != 0 ? k.f315491e : j10, (i12 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public g(int i10, int i11, long j10, @NotNull String str) {
        this.f315479c = i10;
        this.f315480d = i11;
        this.f315481e = j10;
        this.f315482f = str;
        this.f315483g = O0();
    }
}

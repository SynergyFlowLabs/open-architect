package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class z extends e1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private e1 f335143g;

    public z(@NotNull e1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f335143g = delegate;
    }

    @Override // okio.e1
    public void a(@NotNull Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f335143g.a(condition);
    }

    @Override // okio.e1
    public void b() {
        this.f335143g.b();
    }

    @Override // okio.e1
    @NotNull
    public e1 c() {
        return this.f335143g.c();
    }

    @Override // okio.e1
    @NotNull
    public e1 d() {
        return this.f335143g.d();
    }

    @Override // okio.e1
    public long f() {
        return this.f335143g.f();
    }

    @Override // okio.e1
    @NotNull
    public e1 g(long j10) {
        return this.f335143g.g(j10);
    }

    @Override // okio.e1
    public boolean h() {
        return this.f335143g.h();
    }

    @Override // okio.e1
    public void j() throws IOException {
        this.f335143g.j();
    }

    @Override // okio.e1
    @NotNull
    public e1 k(long j10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f335143g.k(j10, unit);
    }

    @Override // okio.e1
    public long l() {
        return this.f335143g.l();
    }

    @Override // okio.e1
    public void m(@NotNull Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.f335143g.m(monitor);
    }

    @oj.i(name = "delegate")
    @NotNull
    public final e1 n() {
        return this.f335143g;
    }

    @NotNull
    public final z o(@NotNull e1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f335143g = delegate;
        return this;
    }

    public final /* synthetic */ void p(e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<set-?>");
        this.f335143g = e1Var;
    }
}

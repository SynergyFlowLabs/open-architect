package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/StateRecord\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2486:1\n1#2:2487\n*E\n"})
public abstract class e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36474c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private e1 f36476b;

    public e1(long j10) {
        this.f36475a = j10;
    }

    public abstract void b(@NotNull e1 e1Var);

    @NotNull
    public abstract e1 c();

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use snapshotId: Long version instead")
    public /* synthetic */ e1 e(int i10) {
        e1 e1VarC = c();
        e1VarC.f36475a = w.s(i10);
        return e1VarC;
    }

    @NotNull
    public e1 f(long j10) {
        e1 e1VarC = c();
        e1VarC.f36475a = j10;
        return e1VarC;
    }

    @Nullable
    public final e1 g() {
        return this.f36476b;
    }

    public final long h() {
        return this.f36475a;
    }

    public final void i(@Nullable e1 e1Var) {
        this.f36476b = e1Var;
    }

    public final void j(long j10) {
        this.f36475a = j10;
    }

    public e1() {
        this(b0.N().p());
    }

    @kotlin.l(message = "Use snapshotId: Long constructor instead")
    public e1(int i10) {
        this(w.s(i10));
    }
}

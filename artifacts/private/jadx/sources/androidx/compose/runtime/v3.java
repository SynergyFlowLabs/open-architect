package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,297:1\n4788#2,4:298\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:298,4\n*E\n"})
public final class v3<N> implements i<N> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36727d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<N> f36728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36730c;

    public v3(@NotNull i<N> iVar, int i10) {
        this.f36728a = iVar;
        this.f36729b = i10;
    }

    @Override // androidx.compose.runtime.i
    public N a() {
        return this.f36728a.a();
    }

    @Override // androidx.compose.runtime.i
    public void b(int i10, int i11) {
        this.f36728a.b(i10 + (this.f36730c == 0 ? this.f36729b : 0), i11);
    }

    @Override // androidx.compose.runtime.i
    public void clear() {
        m0.y("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.i
    public void e() {
        this.f36728a.e();
    }

    @Override // androidx.compose.runtime.i
    public void i(int i10, int i11, int i12) {
        int i13 = this.f36730c == 0 ? this.f36729b : 0;
        this.f36728a.i(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.i
    public void k(@NotNull Function2<? super N, Object, Unit> function2, @Nullable Object obj) {
        this.f36728a.k(function2, obj);
    }

    @Override // androidx.compose.runtime.i
    public void l(int i10, N n10) {
        this.f36728a.l(i10 + (this.f36730c == 0 ? this.f36729b : 0), n10);
    }

    @Override // androidx.compose.runtime.i
    public void m(int i10, N n10) {
        this.f36728a.m(i10 + (this.f36730c == 0 ? this.f36729b : 0), n10);
    }

    @Override // androidx.compose.runtime.i
    public void n(N n10) {
        this.f36730c++;
        this.f36728a.n(n10);
    }

    @Override // androidx.compose.runtime.i
    public void o() {
        boolean z10;
        if (this.f36730c > 0) {
            z10 = true;
            boolean z11 = true & true;
        } else {
            z10 = false;
        }
        if (!z10) {
            m0.y("OffsetApplier up called with no corresponding down");
        }
        this.f36730c--;
        this.f36728a.o();
    }
}

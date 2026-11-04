package androidx.compose.ui.platform;

import androidx.compose.runtime.d7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAndroidWindowInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n85#2:393\n117#2,2:394\n1#3:396\n*S KotlinDebug\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/LazyWindowInfo\n*L\n49#1:393\n49#1:394,2\n*E\n"})
public final class y2 implements w4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40972d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<androidx.compose.ui.unit.u> f40973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.n3<androidx.compose.ui.unit.u> f40974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40975c = d7.g(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.w4
    public int a() {
        return x4.f40964c.a().getValue().g();
    }

    @Override // androidx.compose.ui.platform.w4
    public long b() {
        if (this.f40974b == null) {
            Function0<androidx.compose.ui.unit.u> function0 = this.f40973a;
            this.f40974b = d7.g(androidx.compose.ui.unit.u.b(function0 != null ? function0.invoke().q() : androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);
            this.f40973a = null;
        }
        androidx.compose.runtime.n3<androidx.compose.ui.unit.u> n3Var = this.f40974b;
        Intrinsics.checkNotNull(n3Var);
        return n3Var.getValue().q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.w4
    public boolean c() {
        return ((Boolean) this.f40975c.getValue()).booleanValue();
    }

    public void e(int i10) {
        x4.f40964c.a().setValue(androidx.compose.ui.input.pointer.q0.a(i10));
    }

    public final void f(@Nullable Function0<androidx.compose.ui.unit.u> function0) {
        if (this.f40974b == null) {
            this.f40973a = function0;
        }
    }

    public void g(boolean z10) {
        this.f40975c.setValue(Boolean.valueOf(z10));
    }

    public final void h(@NotNull Function0<androidx.compose.ui.unit.u> function0) {
        androidx.compose.runtime.n3 n3Var = this.f40974b;
        if (n3Var != null) {
            n3Var.setValue(function0.invoke());
        }
    }
}

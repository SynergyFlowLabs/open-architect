package androidx.compose.ui.platform;

import androidx.compose.runtime.d7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n85#2:90\n117#2,2:91\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoImpl\n*L\n69#1:90\n69#1:91,2\n*E\n"})
public final class x4 implements w4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40965d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<androidx.compose.ui.unit.u> f40967a = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40968b = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f40964c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.n3<androidx.compose.ui.input.pointer.q0> f40966e = d7.g(androidx.compose.ui.input.pointer.q0.a(androidx.compose.ui.input.pointer.v.a()), null, 2, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.n3<androidx.compose.ui.input.pointer.q0> a() {
            return x4.f40966e;
        }

        private a() {
        }
    }

    @Override // androidx.compose.ui.platform.w4
    public int a() {
        return f40966e.getValue().g();
    }

    @Override // androidx.compose.ui.platform.w4
    public long b() {
        return this.f40967a.getValue().q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.w4
    public boolean c() {
        return ((Boolean) this.f40968b.getValue()).booleanValue();
    }

    public void e(long j10) {
        this.f40967a.setValue(androidx.compose.ui.unit.u.b(j10));
    }

    public void f(int i10) {
        f40966e.setValue(androidx.compose.ui.input.pointer.q0.a(i10));
    }

    public void g(boolean z10) {
        this.f40968b.setValue(Boolean.valueOf(z10));
    }
}

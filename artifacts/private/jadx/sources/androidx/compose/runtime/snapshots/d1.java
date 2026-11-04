package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStateObjectImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind\n*L\n1#1,63:1\n50#2:64\n47#2:65\n50#2:66\n*S KotlinDebug\n*F\n+ 1 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/StateObjectImpl\n*L\n34#1:64\n36#1:65\n41#1:66\n*E\n"})
public abstract class d1 implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36459b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.internal.a f36460a = new androidx.compose.runtime.internal.a(0);

    public final boolean a(int i10) {
        return (i.b(this.f36460a.get()) & i10) != 0;
    }

    public final void b(int i10) {
        int iB;
        do {
            iB = i.b(this.f36460a.get());
            if ((iB & i10) != 0) {
                return;
            }
        } while (!this.f36460a.compareAndSet(iB, i.b(iB | i10)));
    }
}

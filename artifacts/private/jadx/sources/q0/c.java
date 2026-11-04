package q0;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n85#2:68\n117#2,2:69\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n63#1:68\n63#1:69,2\n*E\n"})
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f350237c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<a, Boolean> f350238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f350239b;

    public /* synthetic */ c(int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function1);
    }

    @Override // q0.b
    public boolean a(int i10) {
        return this.f350238a.invoke(a.c(i10)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q0.b
    public int b() {
        return ((a) this.f350239b.getValue()).i();
    }

    public void c(int i10) {
        this.f350239b.setValue(a.c(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i10, Function1<? super a, Boolean> function1) {
        this.f350238a = function1;
        this.f350239b = d7.g(a.c(i10), null, 2, null);
    }
}

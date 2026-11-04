package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.b1;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,38:1\n118#2:39\n35#2,5:40\n119#2:45\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n34#1:39\n34#1:40,5\n34#1:45\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39050d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b1<c0> f39051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e0 f39052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39053c;

    public i(@NotNull b1<c0> b1Var, @NotNull e0 e0Var) {
        this.f39051a = b1Var;
        this.f39052b = e0Var;
    }

    public final boolean a(long j10) {
        f0 f0Var;
        List<f0> listB = this.f39052b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                f0Var = null;
                break;
            }
            f0Var = listB.get(i10);
            if (b0.d(f0Var.q(), j10)) {
                break;
            }
            i10++;
        }
        f0 f0Var2 = f0Var;
        if (f0Var2 != null) {
            return f0Var2.n();
        }
        return false;
    }

    @NotNull
    public final b1<c0> b() {
        return this.f39051a;
    }

    @Nullable
    public final MotionEvent c() {
        return this.f39052b.a();
    }

    @NotNull
    public final e0 d() {
        return this.f39052b;
    }

    public final boolean e() {
        return this.f39053c;
    }

    public final void f(boolean z10) {
        this.f39053c = z10;
    }
}

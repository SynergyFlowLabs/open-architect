package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n123#1:2169\n123#1:2170,2\n*E\n"})
public abstract class x3<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13393b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13394a;

    public /* synthetic */ x3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f13394a.getValue()).booleanValue();
    }

    public abstract void d(S s10);

    public final void e(boolean z10) {
        this.f13394a.setValue(Boolean.valueOf(z10));
    }

    public abstract void f(S s10);

    public abstract void g(@NotNull l3<S> l3Var);

    public abstract void h();

    private x3() {
        this.f13394a = d7.g(Boolean.FALSE, null, 2, null);
    }
}

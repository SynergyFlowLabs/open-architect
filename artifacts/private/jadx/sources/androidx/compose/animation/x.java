package androidx.compose.animation;

import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,959:1\n81#2:960\n114#2,2:961\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n197#1:960\n197#1:961,2\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13771e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d0 f13772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f13773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k3 f13774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private g1 f13775d;

    public x(@NotNull d0 d0Var, @NotNull f0 f0Var, float f10, @Nullable g1 g1Var) {
        this.f13772a = d0Var;
        this.f13773b = f0Var;
        this.f13774c = g4.b(f10);
        this.f13775d = g1Var;
    }

    @NotNull
    public final f0 a() {
        return this.f13773b;
    }

    @Nullable
    public final g1 b() {
        return this.f13775d;
    }

    @NotNull
    public final d0 c() {
        return this.f13772a;
    }

    public final float d() {
        return this.f13774c.V0();
    }

    public final void e(@Nullable g1 g1Var) {
        this.f13775d = g1Var;
    }

    public final void f(float f10) {
        this.f13774c.q(f10);
    }

    public /* synthetic */ x(d0 d0Var, f0 f0Var, float f10, g1 g1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, f0Var, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? e.d(false, null, 3, null) : g1Var);
    }
}

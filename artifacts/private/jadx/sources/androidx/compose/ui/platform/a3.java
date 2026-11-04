package androidx.compose.ui.platform;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,436:1\n81#2:437\n114#2,2:438\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n434#1:437\n434#1:438,2\n*E\n"})
final class a3 implements androidx.compose.ui.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f40281a = androidx.compose.runtime.g4.b(1.0f);

    @Override // androidx.compose.ui.c0
    public float B0() {
        return this.f40281a.V0();
    }

    public void a(float f10) {
        this.f40281a.q(f10);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.ui.c0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) androidx.compose.ui.c0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return androidx.compose.ui.c0.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return androidx.compose.ui.c0.a.d(this, coroutineContext);
    }
}

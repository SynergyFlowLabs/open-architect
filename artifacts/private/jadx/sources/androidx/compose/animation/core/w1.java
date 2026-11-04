package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n85#2:2172\n117#2,2:2173\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n168#1:2169\n168#1:2170,2\n180#1:2172\n180#1:2173,2\n*E\n"})
public final class w1<S> extends x3<S> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13348e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13350d;

    public w1(S s10) {
        super(null);
        this.f13349c = d7.g(s10, null, 2, null);
        this.f13350d = d7.g(s10, null, 2, null);
    }

    @Override // androidx.compose.animation.core.x3
    public S a() {
        return (S) this.f13349c.getValue();
    }

    @Override // androidx.compose.animation.core.x3
    public S b() {
        return (S) this.f13350d.getValue();
    }

    @Override // androidx.compose.animation.core.x3
    public void d(S s10) {
        this.f13349c.setValue(s10);
    }

    @Override // androidx.compose.animation.core.x3
    public void g(@NotNull l3<S> l3Var) {
    }

    @Override // androidx.compose.animation.core.x3
    public void h() {
    }

    public final boolean i() {
        return Intrinsics.areEqual(a(), b()) && !c();
    }

    @Override // androidx.compose.animation.core.x3
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void f(S s10) {
        this.f13350d.setValue(s10);
    }
}

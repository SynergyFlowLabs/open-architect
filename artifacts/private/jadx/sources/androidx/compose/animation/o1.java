package androidx.compose.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/TargetData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,418:1\n85#2:419\n117#2,2:420\n85#2:422\n117#2,2:423\n85#2:425\n117#2,2:426\n85#2:428\n117#2,2:429\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/TargetData\n*L\n372#1:419\n372#1:420,2\n378#1:422\n378#1:423,2\n387#1:425\n387#1:426,2\n397#1:428\n397#1:429,2\n*E\n"})
public final class o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13689e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f13690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f13691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f13692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f13693d;

    public /* synthetic */ o1(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((n0.g) this.f13693d.getValue()).B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((n0.g) this.f13691b.getValue()).B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((n0.n) this.f13690a.getValue()).y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((n0.g) this.f13692c.getValue()).B();
    }

    public final void e(long j10) {
        this.f13693d.setValue(n0.g.d(j10));
    }

    public final void f(long j10) {
        this.f13691b.setValue(n0.g.d(j10));
    }

    public final void g(long j10) {
        this.f13690a.setValue(n0.n.c(j10));
    }

    public final void h(long j10) {
        this.f13692c.setValue(n0.g.d(j10));
    }

    private o1(long j10, long j11, long j12) {
        this.f13690a = d7.g(n0.n.c(j10), null, 2, null);
        this.f13691b = d7.g(n0.g.d(j11), null, 2, null);
        this.f13692c = d7.g(n0.g.d(j12), null, 2, null);
        this.f13693d = d7.g(n0.g.d(j11), null, 2, null);
    }
}

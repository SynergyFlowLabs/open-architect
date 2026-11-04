package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/ReadonlySnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n1#1,2486:1\n166#2,14:2487\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/ReadonlySnapshot\n*L\n1372#1:2487,14\n*E\n"})
public final class j extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f36511j = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f36512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36513i;

    public j(long j10, @NotNull v vVar, @Nullable Function1<Object, Unit> function1) {
        super(j10, vVar, (DefaultConstructorMarker) null);
        this.f36512h = function1;
        this.f36513i = 1;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m G(@Nullable Function1<Object, Unit> function1) {
        Map<m0.b, m0.a> second;
        b0.w0(this);
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = m0.e.f322707a;
        if (gVar != null) {
            Pair<m0.a, Map<m0.b, m0.a>> pairI = m0.e.i(gVar, this, true, function1, null);
            m0.a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            first.b();
            second = pairI.getSecond();
            function1 = function1A;
        } else {
            second = null;
        }
        g gVar2 = new g(p(), i(), b0.V(function1, l(), false, 4, null), this);
        if (gVar != null) {
            m0.e.e(gVar, this, gVar2, second);
        }
        return gVar2;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> l() {
        return this.f36512h;
    }

    public void N(@Nullable l2<c1> l2Var) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (f()) {
            return;
        }
        w(this);
        super.d();
        m0.e.g(this);
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public l2<c1> j() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean n() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    public m o() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    public Function1<Object, Unit> r() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean s() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void v(@NotNull m mVar) {
        this.f36513i++;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void w(@NotNull m mVar) {
        int i10 = this.f36513i - 1;
        this.f36513i = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void x() {
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void y(@NotNull c1 c1Var) {
        b0.n0();
        throw new kotlin.a0();
    }
}

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
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n1#1,2486:1\n166#2,14:2487\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n*L\n1433#1:2487,14\n*E\n"})
public final class g extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f36486j = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Function1<Object, Unit> f36487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final m f36488i;

    public g(long j10, @NotNull v vVar, @Nullable Function1<Object, Unit> function1, @NotNull m mVar) {
        super(j10, vVar, (DefaultConstructorMarker) null);
        this.f36487h = function1;
        this.f36488i = mVar;
        mVar.v(this);
    }

    @NotNull
    public final m M() {
        return this.f36488i;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @Nullable
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> l() {
        return this.f36487h;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Void v(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Void w(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Void y(@NotNull c1 c1Var) {
        b0.n0();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public g G(@Nullable Function1<Object, Unit> function1) {
        Map<m0.b, m0.a> second;
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
        g gVar2 = new g(p(), i(), b0.V(function1, l(), false, 4, null), M());
        if (gVar != null) {
            m0.e.e(gVar, this, gVar2, second);
        }
        return gVar2;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (!f()) {
            if (p() != this.f36488i.p()) {
                b();
            }
            this.f36488i.w(this);
            super.d();
            m0.e.g(this);
        }
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
        return this.f36488i.o();
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
    public void x() {
    }
}

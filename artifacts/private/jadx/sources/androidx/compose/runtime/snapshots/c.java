package androidx.compose.runtime.snapshots;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2486:1\n166#2,14:2487\n166#2,14:2501\n1893#3:2515\n1893#3:2517\n33#4:2516\n33#4:2518\n34#5,5:2519\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1492#1:2487,14\n1512#1:2501,14\n1546#1:2515\n1487#1:2517\n1546#1:2516\n1487#1:2518\n1487#1:2519,5\n*E\n"})
public final class c extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f36455t = 8;

    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,2486:1\n1893#2:2487\n33#3:2488\n1#4:2489\n36#5:2490\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1\n*L\n1520#1:2487\n1520#1:2488\n1520#1:2490\n*E\n"})
    static final class a implements Function1<v, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f36456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f36457b;

        a(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            this.f36456a = function1;
            this.f36457b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final e invoke(v vVar) {
            long j10;
            synchronized (b0.Q()) {
                try {
                    j10 = b0.f36447f;
                    b0.f36447f += (long) 1;
                } finally {
                }
            }
            return new e(j10, vVar, this.f36456a, this.f36457b);
        }
    }

    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,2486:1\n1893#2:2487\n33#3:2488\n1#4:2489\n36#5:2490\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1\n*L\n1500#1:2487\n1500#1:2488\n1500#1:2490\n*E\n"})
    static final class b implements Function1<v, j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Object, Unit> f36458a;

        b(Function1<Object, Unit> function1) {
            this.f36458a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j invoke(v vVar) {
            long j10;
            synchronized (b0.Q()) {
                j10 = b0.f36447f;
                int i10 = 3 ^ 1;
                b0.f36447f += (long) 1;
            }
            return new j(j10, vVar, this.f36458a);
        }
    }

    public c(long j10, @NotNull v vVar) {
        super(j10, vVar, null, new Function1() { // from class: androidx.compose.runtime.snapshots.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.l0(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Object obj) {
        Unit unit;
        synchronized (b0.Q()) {
            try {
                List list = b0.f36451j;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Function1) list.get(i10)).invoke(obj);
                }
                unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    public m G(@Nullable Function1<Object, Unit> function1) {
        Map<m0.b, m0.a> second;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = m0.e.f322707a;
        if (gVar != null) {
            Pair<m0.a, Map<m0.b, m0.a>> pairI = m0.e.i(gVar, null, true, function1, null);
            m0.a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            first.b();
            second = pairI.getSecond();
            function1 = function1A;
        } else {
            second = null;
        }
        j jVar = (j) b0.q0(new b(function1));
        if (gVar != null) {
            m0.e.e(gVar, null, jVar, second);
        }
        return jVar;
    }

    @Override // androidx.compose.runtime.snapshots.e
    @NotNull
    public o P() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void d() {
        synchronized (b0.Q()) {
            z();
            Unit unit = Unit.f312394a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.e
    @NotNull
    public e g0(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        Function1<Object, Unit> function3;
        Map<m0.b, m0.a> second;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = m0.e.f322707a;
        if (gVar != null) {
            Pair<m0.a, Map<m0.b, m0.a>> pairI = m0.e.i(gVar, null, false, function1, function2);
            m0.a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            Function1<Object, Unit> function1B = first.b();
            second = pairI.getSecond();
            function1 = function1A;
            function3 = function1B;
        } else {
            function3 = function2;
            second = null;
        }
        e eVar = (e) b0.q0(new a(function1, function3));
        if (gVar != null) {
            m0.e.e(gVar, null, eVar, second);
        }
        return eVar;
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Void v(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public Void w(@NotNull m mVar) {
        m0.b();
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.snapshots.e, androidx.compose.runtime.snapshots.m
    public void x() {
        b0.H();
    }
}

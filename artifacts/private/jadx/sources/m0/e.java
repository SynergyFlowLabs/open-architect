package m0;

import androidx.collection.c3;
import androidx.compose.runtime.d2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.snapshots.b0;
import androidx.compose.runtime.snapshots.c1;
import androidx.compose.runtime.snapshots.h;
import androidx.compose.runtime.snapshots.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1893#2:243\n1893#2:265\n33#3:244\n33#3:266\n34#4,5:245\n34#4,5:250\n34#4,5:255\n34#4,5:260\n1#5:267\n*S KotlinDebug\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n147#1:243\n149#1:265\n147#1:244\n149#1:266\n192#1:245,5\n223#1:250,5\n231#1:255,5\n239#1:260,5\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static g<? extends b> f322707a;

    @d2
    @NotNull
    public static final <R extends m> R d(@Nullable m mVar, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, boolean z10, @NotNull Function2<? super Function1<Object, Unit>, ? super Function1<Object, Unit>, ? extends R> function3) {
        Map<b, a> second;
        g gVar = f322707a;
        if (gVar != null) {
            Pair<a, Map<b, a>> pairI = i(gVar, mVar, z10, function1, function2);
            a first = pairI.getFirst();
            Function1<Object, Unit> function1A = first.a();
            function2 = first.b();
            second = pairI.getSecond();
            function1 = function1A;
        } else {
            second = null;
        }
        R rInvoke = function3.invoke(function1, function2);
        if (gVar != null) {
            e(gVar, mVar, rInvoke, second);
        }
        return rInvoke;
    }

    @d2
    public static final void e(@NotNull g<? extends b> gVar, @Nullable m mVar, @NotNull m mVar2, @Nullable Map<b, a> map) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = gVar.get(i10);
            bVar.a(mVar2, mVar, map != null ? map.get(bVar) : null);
        }
    }

    public static final void f(@NotNull m mVar, @Nullable c3<c1> c3Var) {
        Set<? extends Object> setEmptySet;
        g<? extends b> gVar = f322707a;
        if (gVar == null || gVar.isEmpty()) {
            return;
        }
        if (c3Var == null || (setEmptySet = androidx.compose.runtime.collection.g.c(c3Var)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            gVar.get(i10).c(mVar, setEmptySet);
        }
    }

    public static final void g(@NotNull m mVar) {
        g<? extends b> gVar = f322707a;
        if (gVar != null) {
            int size = gVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                gVar.get(i10).d(mVar);
            }
        }
    }

    @d2
    private static /* synthetic */ void h() {
    }

    @d2
    @NotNull
    public static final Pair<a, Map<b, a>> i(@NotNull g<? extends b> gVar, @Nullable m mVar, boolean z10, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        int size = gVar.size();
        LinkedHashMap linkedHashMap = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = gVar.get(i10);
            a aVarB = bVar.b(mVar, z10);
            if (aVarB != null) {
                function1 = j(aVarB.a(), function1);
                function2 = j(aVarB.b(), function2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(bVar, aVarB);
            }
        }
        return TuplesKt.to(new a(function1, function2), linkedHashMap);
    }

    private static final Function1<Object, Unit> j(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: m0.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.k(function1, function2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f312394a;
    }

    @d2
    @NotNull
    public static final h l(@NotNull m.a aVar, @NotNull final b bVar) {
        synchronized (b0.Q()) {
            try {
                g<? extends b> gVarG = f322707a;
                if (gVarG == null) {
                    gVarG = androidx.compose.runtime.external.kotlinx.collections.immutable.a.G();
                }
                f322707a = gVarG.add(bVar);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new h() { // from class: m0.d
            @Override // androidx.compose.runtime.snapshots.h
            public final void dispose() {
                e.m(bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (b0.Q()) {
            try {
                g<? extends b> gVar = f322707a;
                g<? extends b> gVar2 = null;
                g<? extends b> gVarRemove = gVar != null ? gVar.remove(bVar) : null;
                if (gVarRemove != null && !gVarRemove.isEmpty()) {
                    gVar2 = gVarRemove;
                }
                f322707a = gVar2;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

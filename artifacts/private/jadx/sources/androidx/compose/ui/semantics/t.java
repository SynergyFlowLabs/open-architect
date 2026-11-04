package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.j4;
import androidx.compose.ui.platform.t2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1187#2,2:234\n1261#2,4:236\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n231#1:234,2\n231#1:236,4\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static AtomicInteger f41169a = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(t2 t2Var, SemanticsConfiguration semanticsConfiguration) {
        j4 j4VarB = t2Var.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends d0<?>, ? extends Object> entry : semanticsConfiguration) {
            d0<?> key = entry.getKey();
            Pair pair = TuplesKt.to(key.c(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        j4VarB.c("properties", linkedHashMap);
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super e0, Unit> function1) {
        return a0Var.B2(new ClearAndSetSemanticsElement(function1));
    }

    public static final int d() {
        return f41169a.addAndGet(1);
    }

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, boolean z10, @NotNull Function1<? super e0, Unit> function1) {
        return a0Var.B2(new AppendedSemanticsElement(z10, function1));
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(a0Var, z10, function1);
    }
}

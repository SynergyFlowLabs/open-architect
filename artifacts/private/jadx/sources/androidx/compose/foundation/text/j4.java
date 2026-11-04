package androidx.compose.foundation.text;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/LinksTextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,749:1\n35#2,5:750\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/LinksTextMeasurePolicy\n*L\n540#1:750,5\n*E\n"})
final class j4 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f20359a;

    public j4(@NotNull Function0<Boolean> function0) {
        this.f20359a = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(List list, j4 j4Var, androidx.compose.ui.layout.i2.a aVar) {
        List listA0 = p1.a0(list, j4Var.f20359a);
        if (listA0 != null) {
            int size = listA0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) listA0.get(i10);
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) pair.component1();
                Function0 function0 = (Function0) pair.component2();
                androidx.compose.ui.layout.i2.a.V(aVar, i2Var, function0 != null ? ((androidx.compose.ui.unit.q) function0.invoke()).x() : androidx.compose.ui.unit.q.f42709b.b(), 0.0f, 2, null);
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull final List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.foundation.text.i4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j4.g(list, this, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}

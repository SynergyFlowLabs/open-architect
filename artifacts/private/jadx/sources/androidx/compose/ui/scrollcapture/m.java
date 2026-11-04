package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.semantics.n;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.t;
import java.util.List;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,232:1\n198#1:233\n199#1:237\n200#1:239\n201#1:241\n202#1:243\n203#1,5:249\n1107#2:234\n1085#2,2:235\n1107#2:254\n1085#2,2:255\n136#3:238\n519#3:240\n44#3:242\n136#3:257\n519#3:258\n44#3:259\n136#3:260\n78#4,5:244\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n128#1:233\n128#1:237\n128#1:239\n128#1:241\n128#1:243\n128#1:249,5\n128#1:234\n128#1:235,2\n198#1:254\n198#1:255,2\n128#1:238\n128#1:240\n128#1:242\n199#1:257\n200#1:258\n201#1:259\n204#1:260\n138#1:244,5\n*E\n"})
public final class m {
    private static final boolean a(u uVar) {
        Function2<n0.g, kotlin.coroutines.d<? super n0.g>, Object> function2C = c(uVar);
        androidx.compose.ui.semantics.l lVar = (androidx.compose.ui.semantics.l) o.a(uVar.F(), z.f41190a.Q());
        return (function2C == null || lVar == null || lVar.a().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<u> b(u uVar) {
        return uVar.p(false, false, false);
    }

    @Nullable
    public static final Function2<n0.g, kotlin.coroutines.d<? super n0.g>, Object> c(@NotNull u uVar) {
        return (Function2) o.a(uVar.F(), n.f41142a.x());
    }

    private static final void d(u uVar, Function1<? super u, Boolean> function1) {
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new u[16], 0);
        dVar.k(dVar.R(), b(uVar));
        while (dVar.R() != 0) {
            u uVar2 = (u) dVar.r0(dVar.R() - 1);
            if (function1.invoke(uVar2).booleanValue()) {
                dVar.k(dVar.R(), b(uVar2));
            }
        }
    }

    private static final void e(u uVar, int i10, Function1<? super l, Unit> function1) {
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new u[16], 0);
        List<u> listB = b(uVar);
        while (true) {
            dVar.k(dVar.R(), listB);
            while (dVar.R() != 0) {
                u uVar2 = (u) dVar.r0(dVar.R() - 1);
                if (!y.i(uVar2) && !uVar2.F().i(z.f41190a.f())) {
                    k1 k1VarF = uVar2.f();
                    if (k1VarF == null) {
                        s0.a.j("Expected semantics node to have a coordinator.");
                        throw new a0();
                    }
                    g0 g0VarN = k1VarF.n();
                    s sVarE = t.e(h0.c(g0VarN));
                    if (sVarE.K()) {
                        continue;
                    } else if (a(uVar2)) {
                        int i11 = i10 + 1;
                        function1.invoke(new l(uVar2, i11, sVarE, g0VarN));
                        e(uVar2, i11, function1);
                    } else {
                        listB = b(uVar2);
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void f(u uVar, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        e(uVar, i10, function1);
    }
}

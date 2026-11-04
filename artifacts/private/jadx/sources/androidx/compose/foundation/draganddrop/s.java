package androidx.compose.foundation.draganddrop;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class s extends androidx.compose.ui.node.m {

    @NotNull
    private final l X;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final e f14168w;

    /* synthetic */ class a extends g0 implements Function1<androidx.compose.ui.draw.i, androidx.compose.ui.draw.o> {
        a(Object obj) {
            super(1, obj, e.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.draw.o invoke(androidx.compose.ui.draw.i iVar) {
            return ((e) this.receiver).c(iVar);
        }
    }

    public s(@NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        e eVar = new e();
        v9(androidx.compose.ui.draw.n.a(new a(eVar)));
        this.f14168w = eVar;
        this.X = (l) v9(new l(new Function1() { // from class: androidx.compose.foundation.draganddrop.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.H9(this.f14167a, (androidx.compose.ui.graphics.drawscope.f) obj);
            }
        }, function2, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H9(s sVar, androidx.compose.ui.graphics.drawscope.f fVar) {
        sVar.f14168w.f(fVar);
        return Unit.f312394a;
    }

    private static Object J9(s sVar) {
        return j1.j(new t0(sVar.X, l.class, "detectDragStart", "getDetectDragStart()Lkotlin/jvm/functions/Function2;", 0));
    }

    private static Object L9(s sVar) {
        return j1.j(new t0(sVar.X, l.class, "transferData", "getTransferData()Lkotlin/jvm/functions/Function1;", 0));
    }

    @NotNull
    public final Function2<n, kotlin.coroutines.d<? super Unit>, Object> I9() {
        return this.X.J9();
    }

    @NotNull
    public final Function1<n0.g, androidx.compose.ui.draganddrop.k> K9() {
        return this.X.L9();
    }

    public final void M9(@NotNull Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.X.M9(function2);
    }

    public final void N9(@NotNull Function1<? super n0.g, androidx.compose.ui.draganddrop.k> function1) {
        this.X.O9(function1);
    }
}

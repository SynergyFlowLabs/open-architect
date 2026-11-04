package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.a0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.input.pointer.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f14049a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super n0.g, Unit> function1) {
            this.f14049a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objC = androidx.compose.foundation.text.contextmenu.gestures.a.c(l0Var, this.f14049a, dVar);
            return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
        }
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull final r rVar) {
        return c(a0Var, new Function1() { // from class: androidx.compose.foundation.contextmenu.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.d(rVar, (n0.g) obj);
            }
        });
    }

    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull Function1<? super n0.g, Unit> function1) {
        return w0.e(a0Var, k.f14050a, new a(function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(r rVar, n0.g gVar) {
        rVar.b(new r.a.b(gVar.B(), null));
        return Unit.f312394a;
    }
}

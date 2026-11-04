package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.a0;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f18997a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f18998b = "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.";

    /* synthetic */ class a extends g0 implements Function1<Function1<? super b0.b, ? extends Boolean>, Unit> {
        a(Object obj) {
            super(1, obj, a0.a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super b0.b, ? extends Boolean> function1) {
            invoke2((Function1<? super b0.b, Boolean>) function1);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Function1<? super b0.b, Boolean> function1) {
            ((a0.a) this.receiver).b(function1);
        }
    }

    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull Function1<? super a0.a, Unit> function1) {
        return a0Var.B2(new AddTextContextMenuDataComponentsElement(function1));
    }

    @NotNull
    public static final b0.c d(@NotNull androidx.compose.ui.node.j jVar) {
        final a0.a aVar = new a0.a();
        g(jVar, new a(aVar), new Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e(aVar, (Function1) obj);
            }
        });
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(a0.a aVar, Function1 function1) {
        function1.invoke(aVar);
        return Unit.f312394a;
    }

    @NotNull
    public static final a0 f(@NotNull a0 a0Var, @NotNull Function1<? super b0.b, Boolean> function1) {
        return a0Var.B2(new FilterTextContextMenuDataComponentsElement(function1));
    }

    private static final void g(androidx.compose.ui.node.j jVar, final Function1<? super Function1<? super b0.b, Boolean>, Unit> function1, final Function1<? super Function1<? super a0.a, Unit>, Unit> function2) {
        q2.c(jVar, e.f18985a, new Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(j.h(function2, function1, (p2) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Function1 function1, Function1 function2, p2 p2Var) {
        if (p2Var instanceof androidx.compose.foundation.text.contextmenu.modifier.a) {
            function1.invoke(((androidx.compose.foundation.text.contextmenu.modifier.a) p2Var).v9());
        } else {
            if (!(p2Var instanceof d)) {
                throw new IllegalStateException(f18998b);
            }
            function2.invoke(((d) p2Var).v9());
        }
        return true;
    }
}

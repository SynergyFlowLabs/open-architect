package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<FocusTargetNode, Unit> {
        a(Object obj) {
            super(1, obj, y0.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        public final void X(FocusTargetNode focusTargetNode) {
            ((y0) this.receiver).a(focusTargetNode);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusTargetNode focusTargetNode) {
            X(focusTargetNode);
            return Unit.f312394a;
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the other overload with added parameters for focusability and onFocusChange")
    public static final /* synthetic */ r0 a() {
        return new FocusTargetNode(0, null, new a(y0.f37476a), 3, null);
    }

    @NotNull
    public static final r0 b(int i10, @Nullable Function2<? super p0, ? super p0, Unit> function2) {
        return new FocusTargetNode(i10, function2, null, 4, null);
    }

    public static /* synthetic */ r0 c(int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = w0.f37469b.a();
        }
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return b(i10, function2);
    }
}

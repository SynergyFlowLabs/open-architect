package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.gestures.c5;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
final class ClickableMessageRowKt$ClickableMessageRow$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onLongClick;

    ClickableMessageRowKt$ClickableMessageRow$1$1(Function0<Unit> function0, Function0<Unit> function1) {
        this.$onLongClick = function0;
        this.$onClick = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function0 onLongClick, n0.g gVar) {
        Intrinsics.checkNotNullParameter(onLongClick, "$onLongClick");
        onLongClick.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function0 onClick, n0.g gVar) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
        final Function0<Unit> function0 = this.$onLongClick;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$0(function0, (n0.g) obj);
            }
        };
        final Function0<Unit> function2 = this.$onClick;
        Object objP = c5.p(l0Var, null, function1, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClickableMessageRowKt$ClickableMessageRow$1$1.invoke$lambda$1(function2, (n0.g) obj);
            }
        }, dVar, 5, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }
}

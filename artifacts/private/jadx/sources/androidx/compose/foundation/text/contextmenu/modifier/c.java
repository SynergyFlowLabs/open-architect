package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class c extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function2<? super a0.a, ? super Context, Unit> f18983w;

    public c(@NotNull Function2<? super a0.a, ? super Context, Unit> function2) {
        this.f18983w = function2;
        v9(new a(new Function1() { // from class: androidx.compose.foundation.text.contextmenu.modifier.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.H9(this.f18982a, (a0.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H9(c cVar, a0.a aVar) {
        cVar.f18983w.invoke(aVar, androidx.compose.ui.node.i.a(cVar, AndroidCompositionLocals_androidKt.g()));
        return Unit.f312394a;
    }

    @NotNull
    public final Function2<a0.a, Context, Unit> I9() {
        return this.f18983w;
    }

    public final void J9(@NotNull Function2<? super a0.a, ? super Context, Unit> function2) {
        this.f18983w = function2;
    }
}

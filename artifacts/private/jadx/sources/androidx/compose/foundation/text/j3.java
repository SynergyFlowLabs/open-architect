package androidx.compose.foundation.text;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class j3 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j3 f20357a = new j3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.layout.i2.a, Unit> f20358b = new Function1() { // from class: androidx.compose.foundation.text.i3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return j3.g((androidx.compose.ui.layout.i2.a) obj);
        }
    };

    private j3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, f20358b, 4, null);
    }
}

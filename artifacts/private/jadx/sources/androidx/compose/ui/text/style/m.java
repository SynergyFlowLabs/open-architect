package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.text.e3;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "TextDrawStyleKt")
public final class m {
    @NotNull
    public static final p b(@NotNull p pVar, @NotNull p pVar2, float f10) {
        boolean z10 = pVar instanceof c;
        if (!z10 && !(pVar2 instanceof c)) {
            return p.f42231a.b(s0.q(pVar.u(), pVar2.u(), f10));
        }
        if (!z10 || !(pVar2 instanceof c)) {
            return (p) e3.d(pVar, pVar2, f10);
        }
        c cVar = (c) pVar;
        c cVar2 = (c) pVar2;
        return p.f42231a.a((i0) e3.d(cVar.o0(), cVar2.o0(), f10), androidx.compose.ui.util.e.r(cVar.r(), cVar2.r(), f10));
    }

    public static final long c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : q0.w(j10, q0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, Function0<Float> function0) {
        return Float.isNaN(f10) ? function0.invoke().floatValue() : f10;
    }
}

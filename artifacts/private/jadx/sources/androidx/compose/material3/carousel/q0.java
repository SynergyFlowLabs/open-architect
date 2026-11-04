package androidx.compose.material3.carousel;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,569:1\n286#2,3:570\n70#2,6:573\n289#2:579\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListKt\n*L\n566#1:570,3\n566#1:573,6\n566#1:579\n*E\n"})
public final class q0 {
    @NotNull
    public static final p0 a() {
        return p0.f26644h.a();
    }

    @NotNull
    public static final p0 b(float f10, float f11, int i10, float f12, @NotNull Function1<? super r0, Unit> function1) {
        s0 s0Var = new s0();
        function1.invoke(s0Var);
        return s0Var.e(f10, f11, i10, f12);
    }

    @NotNull
    public static final p0 c(float f10, float f11, int i10, @NotNull Function1<? super r0, Unit> function1) {
        s0 s0Var = new s0();
        function1.invoke(s0Var);
        return s0Var.d(f10, f11, i10);
    }

    @NotNull
    public static final o0 d(@NotNull o0 o0Var, @NotNull o0 o0Var2, float f10) {
        return new o0(androidx.compose.ui.util.e.r(o0Var.l(), o0Var2.l(), f10), androidx.compose.ui.util.e.r(o0Var.k(), o0Var2.k(), f10), androidx.compose.ui.util.e.r(o0Var.m(), o0Var2.m(), f10), f10 < 0.5f ? o0Var.o() : o0Var2.o(), f10 < 0.5f ? o0Var.n() : o0Var2.n(), f10 < 0.5f ? o0Var.p() : o0Var2.p(), androidx.compose.ui.util.e.r(o0Var.j(), o0Var2.j(), f10));
    }

    @NotNull
    public static final p0 e(@NotNull p0 p0Var, @NotNull p0 p0Var2, float f10) {
        ArrayList arrayList = new ArrayList(p0Var.size());
        int size = p0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(d(p0Var.get(i10), p0Var2.get(i10), f10));
        }
        return new p0(arrayList);
    }
}

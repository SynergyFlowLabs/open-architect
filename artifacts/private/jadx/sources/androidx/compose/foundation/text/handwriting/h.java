package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.r7;
import androidx.compose.ui.a0;
import androidx.compose.ui.input.pointer.y;
import androidx.compose.ui.node.o2;
import androidx.compose.ui.node.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n113#2:227\n113#2:228\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n217#1:227\n218#1:228\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f19358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f19359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final s f19360c;

    static {
        float fR = androidx.compose.ui.unit.h.r(40);
        f19358a = fR;
        float fR2 = androidx.compose.ui.unit.h.r(10);
        f19359b = fR2;
        f19360c = o2.a(fR2, fR, fR2, fR);
    }

    @NotNull
    public static final s a() {
        return f19360c;
    }

    public static final float b() {
        return f19359b;
    }

    public static final float c() {
        return f19358a;
    }

    @NotNull
    public static final a0 d(@NotNull a0 a0Var, boolean z10, boolean z11, @NotNull Function0<Unit> function0) {
        if (!z10 || !j.a()) {
            return a0Var;
        }
        if (z11) {
            a0Var = y.c(a0Var, r7.a(), false, f19360c);
        }
        return a0Var.B2(new StylusHandwritingElement(function0));
    }
}

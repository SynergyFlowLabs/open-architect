package androidx.compose.material.ripple;

import androidx.compose.foundation.u2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,530:1\n132#2:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n*L\n294#1:531\n*E\n"})
public abstract class u implements u2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24835c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a0 f24837b;

    public u(boolean z10, @NotNull final n7<l> n7Var) {
        this.f24836a = z10;
        this.f24837b = new a0(z10, new Function0() { // from class: androidx.compose.material.ripple.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.f(n7Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l f(n7 n7Var) {
        return (l) n7Var.getValue();
    }

    public abstract void c(@NotNull androidx.compose.foundation.interaction.l.b bVar, @NotNull s0 s0Var);

    public final void d(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, float f10, long j10) {
        this.f24837b.b(fVar, Float.isNaN(f10) ? n.a(fVar, this.f24836a, fVar.d()) : fVar.S7(f10), j10);
    }

    public abstract void e(@NotNull androidx.compose.foundation.interaction.l.b bVar);

    public final void g(@NotNull androidx.compose.foundation.interaction.g gVar, @NotNull s0 s0Var) {
        this.f24837b.c(gVar, s0Var);
    }
}

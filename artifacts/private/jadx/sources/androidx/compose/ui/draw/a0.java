package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.node.q1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/SimpleInnerShadowNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n1#2:866\n*E\n"})
public final class a0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, q1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f37248w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private q3 f37249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.shadow.j f37250t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private InnerShadowPainter f37251v;

    public a0(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        this.f37249s = q3Var;
        this.f37250t = jVar;
    }

    private final InnerShadowPainter v9() {
        InnerShadowPainter innerShadowPainter = this.f37251v;
        if (innerShadowPainter != null) {
            return innerShadowPainter;
        }
        InnerShadowPainter innerShadowPainterE = androidx.compose.ui.node.k.r(this).a().e(this.f37249s, this.f37250t);
        this.f37251v = innerShadowPainterE;
        return innerShadowPainterE;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.painter.b.h(v9(), cVar, cVar.d(), 0.0f, null, 6, null);
        cVar.E4();
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        this.f37251v = null;
        androidx.compose.ui.node.u.a(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            return Intrinsics.areEqual(this.f37249s, a0Var.f37249s) && Intrinsics.areEqual(this.f37250t, a0Var.f37250t);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37249s.hashCode() * 31) + this.f37250t.hashCode();
    }

    public final void w9(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        if (!Intrinsics.areEqual(this.f37249s, q3Var) || !Intrinsics.areEqual(this.f37250t, jVar)) {
            this.f37251v = null;
        }
        this.f37249s = q3Var;
        this.f37250t = jVar;
    }
}

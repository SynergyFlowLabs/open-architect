package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.node.q1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/SimpleDropShadowNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,865:1\n1#2:866\n*E\n"})
public final class z extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, q1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f37313w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private q3 f37314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.shadow.j f37315t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private DropShadowPainter f37316v;

    public z(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        this.f37314s = q3Var;
        this.f37315t = jVar;
    }

    private final DropShadowPainter v9() {
        DropShadowPainter dropShadowPainterC = this.f37316v;
        if (dropShadowPainterC == null) {
            dropShadowPainterC = androidx.compose.ui.node.k.r(this).a().c(this.f37314s, this.f37315t);
            this.f37316v = dropShadowPainterC;
        }
        return dropShadowPainterC;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.painter.b.h(v9(), cVar, cVar.d(), 0.0f, null, 6, null);
        cVar.E4();
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        this.f37316v = null;
        androidx.compose.ui.node.u.a(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof z)) {
            z zVar = (z) obj;
            return Intrinsics.areEqual(this.f37314s, zVar.f37314s) && Intrinsics.areEqual(this.f37315t, zVar.f37315t);
        }
        return false;
    }

    public int hashCode() {
        return (this.f37314s.hashCode() * 31) + this.f37315t.hashCode();
    }

    public final void w9(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        if (!Intrinsics.areEqual(this.f37314s, q3Var) || !Intrinsics.areEqual(this.f37315t, jVar)) {
            this.f37316v = null;
        }
        this.f37314s = q3Var;
        this.f37315t = jVar;
    }
}

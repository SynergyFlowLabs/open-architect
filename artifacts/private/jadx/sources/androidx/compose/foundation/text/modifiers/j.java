package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.f5;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.node.g0;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSelectableTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,167:1\n109#2,5:168\n*S KotlinDebug\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n*L\n89#1:168,5\n*E\n"})
public final class j extends androidx.compose.ui.node.m implements g0, androidx.compose.ui.node.t, androidx.compose.ui.node.v {
    public static final int Z = 8;

    @Nullable
    private Function1<? super w.a, Unit> X;

    @NotNull
    private final w Y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private n f20635w;

    public /* synthetic */ j(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, function1, i10, z10, i11, i12, list, function2, nVar, x0Var, f5Var, function3);
    }

    public final void G9(@NotNull androidx.compose.ui.text.f fVar, @NotNull y3 y3Var, @Nullable List<androidx.compose.ui.text.f.e<v0>> list, int i10, int i11, boolean z10, @NotNull androidx.compose.ui.text.font.y.b bVar, int i12, @Nullable Function1<? super p3, Unit> function1, @Nullable Function1<? super List<n0.j>, Unit> function2, @Nullable n nVar, @Nullable x0 x0Var, @Nullable f5 f5Var) {
        w wVar = this.Y;
        wVar.F9(wVar.V9(x0Var, y3Var), this.Y.X9(fVar), this.Y.W9(y3Var, list, i10, i11, z10, bVar, i12, f5Var), this.Y.U9(function1, function2, nVar, this.X));
        this.f20635w = nVar;
        j0.b(this);
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.Y.G9(cVar);
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.Y.R9(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.Y.N9(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        return this.Y.O9(c1Var, z0Var, j10);
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.Y.M9(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return this.Y.Q9(zVar, yVar, i10);
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        n nVar = this.f20635w;
        if (nVar != null) {
            nVar.l(g0Var);
        }
    }

    public /* synthetic */ j(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : nVar, (i13 & 2048) != 0 ? null : x0Var, (i13 & 4096) != 0 ? null : f5Var, (i13 & 8192) != 0 ? null : function3, null);
    }

    private j(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1<? super p3, Unit> function1, int i10, boolean z10, int i11, int i12, List<androidx.compose.ui.text.f.e<v0>> list, Function1<? super List<n0.j>, Unit> function2, n nVar, x0 x0Var, f5 f5Var, Function1<? super w.a, Unit> function3) {
        this.f20635w = nVar;
        this.X = function3;
        this.Y = (w) v9(new w(fVar, y3Var, bVar, function1, i10, z10, i11, i12, list, function2, this.f20635w, x0Var, f5Var, this.X, null));
        if (this.f20635w != null) {
            return;
        }
        androidx.compose.foundation.internal.e.h("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new kotlin.a0();
    }
}

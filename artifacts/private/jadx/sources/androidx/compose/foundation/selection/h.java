package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.j;
import androidx.compose.foundation.k1;
import androidx.compose.foundation.z2;
import androidx.compose.ui.node.j2;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class h extends k1 {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f18728x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private Function1<? super Boolean, Unit> f18729y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f18730z3;

    public /* synthetic */ h(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, jVar, z2Var, z11, z12, jVar2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sa(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(!z10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ta(h hVar) {
        hVar.f18729y3.invoke(Boolean.valueOf(!hVar.f18728x3));
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.c
    public void Q9(@NotNull e0 e0Var) {
        b0.a2(e0Var, v0.b.a(this.f18728x3));
    }

    @NotNull
    public final Function0<Unit> ua() {
        return this.f18730z3;
    }

    public final void va(boolean z10, @Nullable j jVar, @Nullable z2 z2Var, boolean z11, boolean z12, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function1<? super Boolean, Unit> function1) {
        if (this.f18728x3 != z10) {
            this.f18728x3 = z10;
            j2.b(this);
        }
        this.f18729y3 = function1;
        super.pa(jVar, z2Var, z11, z12, null, jVar2, this.f18730z3);
    }

    private h(final boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, final Function1<? super Boolean, Unit> function1) {
        super(jVar, z2Var, z11, z12, null, jVar2, new Function0() { // from class: androidx.compose.foundation.selection.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.sa(function1, z10);
            }
        }, null);
        this.f18728x3 = z10;
        this.f18729y3 = function1;
        this.f18730z3 = new Function0() { // from class: androidx.compose.foundation.selection.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.ta(this.f18727a);
            }
        };
    }
}

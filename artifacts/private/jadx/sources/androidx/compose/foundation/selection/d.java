package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.j;
import androidx.compose.foundation.k1;
import androidx.compose.foundation.z2;
import androidx.compose.ui.node.j2;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class d extends k1 {

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f18680x3;

    public /* synthetic */ d(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, jVar, z2Var, z11, z12, jVar2, function0);
    }

    @Override // androidx.compose.foundation.c
    public void Q9(@NotNull e0 e0Var) {
        b0.L1(e0Var, this.f18680x3);
    }

    public final void qa(boolean z10, @Nullable j jVar, @Nullable z2 z2Var, boolean z11, boolean z12, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function0<Unit> function0) {
        if (this.f18680x3 != z10) {
            this.f18680x3 = z10;
            j2.b(this);
        }
        super.pa(jVar, z2Var, z11, z12, null, jVar2, function0);
    }

    private d(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        super(jVar, z2Var, z11, z12, null, jVar2, function0, null);
        this.f18680x3 = z10;
    }
}

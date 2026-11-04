package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.j;
import androidx.compose.foundation.z2;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class SelectableElement extends e1<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final j f18638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final z2 f18639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.semantics.j f18642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f18643i;

    public /* synthetic */ SelectableElement(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, jVar, z2Var, z11, z12, jVar2, function0);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f18637c == selectableElement.f18637c && Intrinsics.areEqual(this.f18638d, selectableElement.f18638d) && Intrinsics.areEqual(this.f18639e, selectableElement.f18639e) && this.f18640f == selectableElement.f18640f && this.f18641g == selectableElement.f18641g && Intrinsics.areEqual(this.f18642h, selectableElement.f18642h) && this.f18643i == selectableElement.f18643i;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f18637c) * 31;
        j jVar = this.f18638d;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        z2 z2Var = this.f18639e;
        int iHashCode3 = (((((iHashCode2 + (z2Var != null ? z2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18640f)) * 31) + Boolean.hashCode(this.f18641g)) * 31;
        androidx.compose.ui.semantics.j jVar2 = this.f18642h;
        return ((iHashCode3 + (jVar2 != null ? androidx.compose.ui.semantics.j.n(jVar2.p()) : 0)) * 31) + this.f18643i.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("selectable");
        t2Var.b().c("selected", Boolean.valueOf(this.f18637c));
        t2Var.b().c("interactionSource", this.f18638d);
        t2Var.b().c("indicationNodeFactory", this.f18639e);
        t2Var.b().c("enabled", Boolean.valueOf(this.f18641g));
        t2Var.b().c("role", this.f18642h);
        t2Var.b().c("onClick", this.f18643i);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a() {
        int i10 = 2 ^ 0;
        return new d(this.f18637c, this.f18638d, this.f18639e, this.f18640f, this.f18641g, this.f18642h, this.f18643i, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d dVar) {
        dVar.qa(this.f18637c, this.f18638d, this.f18639e, this.f18640f, this.f18641g, this.f18642h, this.f18643i);
    }

    private SelectableElement(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        this.f18637c = z10;
        this.f18638d = jVar;
        this.f18639e = z2Var;
        this.f18640f = z11;
        this.f18641g = z12;
        this.f18642h = jVar2;
        this.f18643i = function0;
    }
}

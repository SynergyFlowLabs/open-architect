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
final class TriStateToggleableElement extends e1<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v0.a f18651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final j f18652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final z2 f18653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.semantics.j f18656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f18657i;

    public /* synthetic */ TriStateToggleableElement(v0.a aVar, j jVar, z2 z2Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, z2Var, z10, z11, jVar2, function0);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f18651c == triStateToggleableElement.f18651c && Intrinsics.areEqual(this.f18652d, triStateToggleableElement.f18652d) && Intrinsics.areEqual(this.f18653e, triStateToggleableElement.f18653e) && this.f18654f == triStateToggleableElement.f18654f && this.f18655g == triStateToggleableElement.f18655g && Intrinsics.areEqual(this.f18656h, triStateToggleableElement.f18656h) && this.f18657i == triStateToggleableElement.f18657i;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f18651c.hashCode() * 31;
        j jVar = this.f18652d;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        z2 z2Var = this.f18653e;
        int iHashCode3 = (((((iHashCode2 + (z2Var != null ? z2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18654f)) * 31) + Boolean.hashCode(this.f18655g)) * 31;
        androidx.compose.ui.semantics.j jVar2 = this.f18656h;
        return ((iHashCode3 + (jVar2 != null ? androidx.compose.ui.semantics.j.n(jVar2.p()) : 0)) * 31) + this.f18657i.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("triStateToggleable");
        t2Var.b().c("state", this.f18651c);
        t2Var.b().c("interactionSource", this.f18652d);
        t2Var.b().c("indicationNodeFactory", this.f18653e);
        t2Var.b().c("enabled", Boolean.valueOf(this.f18655g));
        t2Var.b().c("role", this.f18656h);
        t2Var.b().c("onClick", this.f18657i);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i a() {
        return new i(this.f18651c, this.f18652d, this.f18653e, this.f18654f, this.f18655g, this.f18656h, this.f18657i, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull i iVar) {
        iVar.qa(this.f18651c, this.f18652d, this.f18653e, this.f18654f, this.f18655g, this.f18656h, this.f18657i);
    }

    private TriStateToggleableElement(v0.a aVar, j jVar, z2 z2Var, boolean z10, boolean z11, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        this.f18651c = aVar;
        this.f18652d = jVar;
        this.f18653e = z2Var;
        this.f18654f = z10;
        this.f18655g = z11;
        this.f18656h = jVar2;
        this.f18657i = function0;
    }
}

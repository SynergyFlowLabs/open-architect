package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.j;
import androidx.compose.foundation.z2;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends e1<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final j f18645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final z2 f18646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.semantics.j f18649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f18650i;

    public /* synthetic */ ToggleableElement(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, jVar, z2Var, z11, z12, jVar2, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ToggleableElement.class == obj.getClass()) {
            ToggleableElement toggleableElement = (ToggleableElement) obj;
            if (this.f18644c == toggleableElement.f18644c && Intrinsics.areEqual(this.f18645d, toggleableElement.f18645d) && Intrinsics.areEqual(this.f18646e, toggleableElement.f18646e) && this.f18647f == toggleableElement.f18647f && this.f18648g == toggleableElement.f18648g && Intrinsics.areEqual(this.f18649h, toggleableElement.f18649h) && this.f18650i == toggleableElement.f18650i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f18644c) * 31;
        j jVar = this.f18645d;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        z2 z2Var = this.f18646e;
        int iHashCode3 = (((((iHashCode2 + (z2Var != null ? z2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18647f)) * 31) + Boolean.hashCode(this.f18648g)) * 31;
        androidx.compose.ui.semantics.j jVar2 = this.f18649h;
        return ((iHashCode3 + (jVar2 != null ? androidx.compose.ui.semantics.j.n(jVar2.p()) : 0)) * 31) + this.f18650i.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("toggleable");
        t2Var.b().c("value", t2Var.c());
        t2Var.b().c("interactionSource", this.f18645d);
        t2Var.b().c("indicationNodeFactory", this.f18646e);
        t2Var.b().c("enabled", Boolean.valueOf(this.f18648g));
        t2Var.b().c("role", this.f18649h);
        t2Var.b().c("onValueChange", this.f18650i);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h a() {
        int i10 = 4 ^ 0;
        return new h(this.f18644c, this.f18645d, this.f18646e, this.f18647f, this.f18648g, this.f18649h, this.f18650i, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h hVar) {
        hVar.va(this.f18644c, this.f18645d, this.f18646e, this.f18647f, this.f18648g, this.f18649h, this.f18650i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableElement(boolean z10, j jVar, z2 z2Var, boolean z11, boolean z12, androidx.compose.ui.semantics.j jVar2, Function1<? super Boolean, Unit> function1) {
        this.f18644c = z10;
        this.f18645d = jVar;
        this.f18646e = z2Var;
        this.f18647f = z11;
        this.f18648g = z12;
        this.f18649h = jVar2;
        this.f18650i = function1;
    }
}

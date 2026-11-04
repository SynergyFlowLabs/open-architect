package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends androidx.compose.ui.node.e1<k1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f13849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final z2 f13850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f13853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.semantics.j f13854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13855i;

    public /* synthetic */ ClickableElement(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z2Var, z10, z11, str, jVar2, function0);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.areEqual(this.f13849c, clickableElement.f13849c) && Intrinsics.areEqual(this.f13850d, clickableElement.f13850d) && this.f13851e == clickableElement.f13851e && this.f13852f == clickableElement.f13852f && Intrinsics.areEqual(this.f13853g, clickableElement.f13853g) && Intrinsics.areEqual(this.f13854h, clickableElement.f13854h) && this.f13855i == clickableElement.f13855i;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        androidx.compose.foundation.interaction.j jVar = this.f13849c;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        z2 z2Var = this.f13850d;
        int iHashCode2 = (((((iHashCode + (z2Var != null ? z2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13851e)) * 31) + Boolean.hashCode(this.f13852f)) * 31;
        String str = this.f13853g;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.j jVar2 = this.f13854h;
        return ((iHashCode3 + (jVar2 != null ? androidx.compose.ui.semantics.j.n(jVar2.p()) : 0)) * 31) + this.f13855i.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("clickable");
        t2Var.b().c("enabled", Boolean.valueOf(this.f13852f));
        t2Var.b().c("onClick", this.f13855i);
        t2Var.b().c("onClickLabel", this.f13853g);
        t2Var.b().c("role", this.f13854h);
        t2Var.b().c("interactionSource", this.f13849c);
        t2Var.b().c("indicationNodeFactory", this.f13850d);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k1 a() {
        return new k1(this.f13849c, this.f13850d, this.f13851e, this.f13852f, this.f13853g, this.f13854h, this.f13855i, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull k1 k1Var) {
        k1Var.pa(this.f13849c, this.f13850d, this.f13851e, this.f13852f, this.f13853g, this.f13854h, this.f13855i);
    }

    private ClickableElement(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        this.f13849c = jVar;
        this.f13850d = z2Var;
        this.f13851e = z10;
        this.f13852f = z11;
        this.f13853g = str;
        this.f13854h = jVar2;
        this.f13855i = function0;
    }
}

package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends androidx.compose.ui.node.e1<o1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f13856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final z2 f13857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f13860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.semantics.j f13861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f13863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f13864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f13865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f13866m;

    public /* synthetic */ CombinedClickableElement(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0 function0, String str2, Function0 function1, Function0 function2, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z2Var, z10, z11, str, jVar2, function0, str2, function1, function2, z12);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.areEqual(this.f13856c, combinedClickableElement.f13856c) && Intrinsics.areEqual(this.f13857d, combinedClickableElement.f13857d) && this.f13858e == combinedClickableElement.f13858e && this.f13859f == combinedClickableElement.f13859f && Intrinsics.areEqual(this.f13860g, combinedClickableElement.f13860g) && Intrinsics.areEqual(this.f13861h, combinedClickableElement.f13861h) && this.f13862i == combinedClickableElement.f13862i && Intrinsics.areEqual(this.f13863j, combinedClickableElement.f13863j) && this.f13864k == combinedClickableElement.f13864k && this.f13865l == combinedClickableElement.f13865l && this.f13866m == combinedClickableElement.f13866m;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        androidx.compose.foundation.interaction.j jVar = this.f13856c;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        z2 z2Var = this.f13857d;
        int iHashCode2 = (((((iHashCode + (z2Var != null ? z2Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13858e)) * 31) + Boolean.hashCode(this.f13859f)) * 31;
        String str = this.f13860g;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.j jVar2 = this.f13861h;
        int iN = (((iHashCode3 + (jVar2 != null ? androidx.compose.ui.semantics.j.n(jVar2.p()) : 0)) * 31) + this.f13862i.hashCode()) * 31;
        String str2 = this.f13863j;
        int iHashCode4 = (iN + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.f13864k;
        int iHashCode5 = (iHashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function1 = this.f13865l;
        return ((iHashCode5 + (function1 != null ? function1.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13866m);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("combinedClickable");
        t2Var.b().c("indicationNodeFactory", this.f13857d);
        t2Var.b().c("interactionSource", this.f13856c);
        t2Var.b().c("enabled", Boolean.valueOf(this.f13859f));
        t2Var.b().c("onClickLabel", this.f13860g);
        t2Var.b().c("role", this.f13861h);
        t2Var.b().c("onClick", this.f13862i);
        t2Var.b().c("onDoubleClick", this.f13865l);
        t2Var.b().c("onLongClick", this.f13864k);
        t2Var.b().c("onLongClickLabel", this.f13863j);
        t2Var.b().c("hapticFeedbackEnabled", Boolean.valueOf(this.f13866m));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o1 a() {
        return new o1(this.f13862i, this.f13863j, this.f13864k, this.f13865l, this.f13866m, this.f13856c, this.f13857d, this.f13858e, this.f13859f, this.f13860g, this.f13861h, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull o1 o1Var) {
        o1Var.ua(this.f13866m);
        o1Var.va(this.f13862i, this.f13863j, this.f13864k, this.f13865l, this.f13856c, this.f13857d, this.f13858e, this.f13859f, this.f13860g, this.f13861h);
    }

    private CombinedClickableElement(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0, String str2, Function0<Unit> function1, Function0<Unit> function2, boolean z12) {
        this.f13856c = jVar;
        this.f13857d = z2Var;
        this.f13858e = z10;
        this.f13859f = z11;
        this.f13860g = str;
        this.f13861h = jVar2;
        this.f13862i = function0;
        this.f13863j = str2;
        this.f13864k = function1;
        this.f13865l = function2;
        this.f13866m = z12;
    }
}

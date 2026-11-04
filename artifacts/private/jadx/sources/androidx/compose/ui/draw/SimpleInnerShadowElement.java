package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class SimpleInnerShadowElement extends e1<a0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37245e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q3 f37246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.shadow.j f37247d;

    public SimpleInnerShadowElement(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        this.f37246c = q3Var;
        this.f37247d = jVar;
    }

    public static /* synthetic */ SimpleInnerShadowElement o(SimpleInnerShadowElement simpleInnerShadowElement, q3 q3Var, androidx.compose.ui.graphics.shadow.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = simpleInnerShadowElement.f37246c;
        }
        if ((i10 & 2) != 0) {
            jVar = simpleInnerShadowElement.f37247d;
        }
        return simpleInnerShadowElement.n(q3Var, jVar);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleInnerShadowElement)) {
            return false;
        }
        SimpleInnerShadowElement simpleInnerShadowElement = (SimpleInnerShadowElement) obj;
        return Intrinsics.areEqual(this.f37246c, simpleInnerShadowElement.f37246c) && Intrinsics.areEqual(this.f37247d, simpleInnerShadowElement.f37247d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f37246c.hashCode() * 31) + this.f37247d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("innerShadow");
        t2Var.b().c("shape", this.f37246c);
        t2Var.b().c("innerShadow", this.f37247d);
    }

    @NotNull
    public final q3 l() {
        return this.f37246c;
    }

    @NotNull
    public final androidx.compose.ui.graphics.shadow.j m() {
        return this.f37247d;
    }

    @NotNull
    public final SimpleInnerShadowElement n(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        return new SimpleInnerShadowElement(q3Var, jVar);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0 a() {
        return new a0(this.f37246c, this.f37247d);
    }

    @NotNull
    public final androidx.compose.ui.graphics.shadow.j q() {
        return this.f37247d;
    }

    @NotNull
    public final q3 r() {
        return this.f37246c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull a0 a0Var) {
        a0Var.w9(this.f37246c, this.f37247d);
    }

    @NotNull
    public String toString() {
        return "SimpleInnerShadowElement(shape=" + this.f37246c + ", shadow=" + this.f37247d + ')';
    }
}

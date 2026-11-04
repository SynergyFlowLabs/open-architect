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
public final class SimpleDropShadowElement extends e1<z> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37242e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q3 f37243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.shadow.j f37244d;

    public SimpleDropShadowElement(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        this.f37243c = q3Var;
        this.f37244d = jVar;
    }

    public static /* synthetic */ SimpleDropShadowElement o(SimpleDropShadowElement simpleDropShadowElement, q3 q3Var, androidx.compose.ui.graphics.shadow.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = simpleDropShadowElement.f37243c;
        }
        if ((i10 & 2) != 0) {
            jVar = simpleDropShadowElement.f37244d;
        }
        return simpleDropShadowElement.n(q3Var, jVar);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDropShadowElement)) {
            return false;
        }
        SimpleDropShadowElement simpleDropShadowElement = (SimpleDropShadowElement) obj;
        return Intrinsics.areEqual(this.f37243c, simpleDropShadowElement.f37243c) && Intrinsics.areEqual(this.f37244d, simpleDropShadowElement.f37244d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f37243c.hashCode() * 31) + this.f37244d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("dropShadow");
        t2Var.b().c("shape", this.f37243c);
        t2Var.b().c("dropShadow", this.f37244d);
    }

    @NotNull
    public final q3 l() {
        return this.f37243c;
    }

    @NotNull
    public final androidx.compose.ui.graphics.shadow.j m() {
        return this.f37244d;
    }

    @NotNull
    public final SimpleDropShadowElement n(@NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        return new SimpleDropShadowElement(q3Var, jVar);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public z a() {
        return new z(this.f37243c, this.f37244d);
    }

    @NotNull
    public final androidx.compose.ui.graphics.shadow.j q() {
        return this.f37244d;
    }

    @NotNull
    public final q3 r() {
        return this.f37243c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z zVar) {
        zVar.w9(this.f37243c, this.f37244d);
    }

    @NotNull
    public String toString() {
        return "SimpleDropShadowElement(shape=" + this.f37243c + ", shadow=" + this.f37244d + ')';
    }
}

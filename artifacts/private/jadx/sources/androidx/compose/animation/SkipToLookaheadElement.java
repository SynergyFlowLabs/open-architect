package androidx.compose.animation;

import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class SkipToLookaheadElement extends androidx.compose.ui.node.e1<i1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12595e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final u0 f12596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f12597d;

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkipToLookaheadElement o(SkipToLookaheadElement skipToLookaheadElement, u0 u0Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u0Var = skipToLookaheadElement.f12596c;
        }
        if ((i10 & 2) != 0) {
            function0 = skipToLookaheadElement.f12597d;
        }
        return skipToLookaheadElement.n(u0Var, function0);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return Intrinsics.areEqual(this.f12596c, skipToLookaheadElement.f12596c) && Intrinsics.areEqual(this.f12597d, skipToLookaheadElement.f12597d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        u0 u0Var = this.f12596c;
        return ((u0Var == null ? 0 : u0Var.hashCode()) * 31) + this.f12597d.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("skipToLookahead");
        t2Var.b().c("scaleToBounds", this.f12596c);
        t2Var.b().c(com.google.firebase.perf.util.b.f124189b, this.f12597d);
    }

    @Nullable
    public final u0 l() {
        return this.f12596c;
    }

    @NotNull
    public final Function0<Boolean> m() {
        return this.f12597d;
    }

    @NotNull
    public final SkipToLookaheadElement n(@Nullable u0 u0Var, @NotNull Function0<Boolean> function0) {
        return new SkipToLookaheadElement(u0Var, function0);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i1 a() {
        return new i1(this.f12596c, this.f12597d);
    }

    @Nullable
    public final u0 q() {
        return this.f12596c;
    }

    @NotNull
    public final Function0<Boolean> r() {
        return this.f12597d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull i1 i1Var) {
        i1Var.z9(this.f12596c);
        i1Var.y9(this.f12597d);
    }

    @NotNull
    public String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.f12596c + ", isEnabled=" + this.f12597d + ')';
    }

    public /* synthetic */ SkipToLookaheadElement(u0 u0Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : u0Var, (i10 & 2) != 0 ? j1.f13544a : function0);
    }

    public SkipToLookaheadElement(@Nullable u0 u0Var, @NotNull Function0<Boolean> function0) {
        this.f12596c = u0Var;
        this.f12597d = function0;
    }
}

package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FillElement extends androidx.compose.ui.node.e1<x1> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f15786f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r1 f15787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f15789e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final FillElement a(float f10) {
            return new FillElement(r1.Vertical, f10, "fillMaxHeight");
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final FillElement b(float f10) {
            return new FillElement(r1.Both, f10, "fillMaxSize");
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final FillElement c(float f10) {
            return new FillElement(r1.Horizontal, f10, "fillMaxWidth");
        }

        private a() {
        }
    }

    public FillElement(@NotNull r1 r1Var, float f10, @NotNull String str) {
        this.f15787c = r1Var;
        this.f15788d = f10;
        this.f15789e = str;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f15787c == fillElement.f15787c && this.f15788d == fillElement.f15788d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f15787c.hashCode() * 31) + Float.hashCode(this.f15788d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d(this.f15789e);
        t2Var.b().c("fraction", Float.valueOf(this.f15788d));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public x1 a() {
        return new x1(this.f15787c, this.f15788d);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull x1 x1Var) {
        x1Var.z9(this.f15787c);
        x1Var.A9(this.f15788d);
    }
}

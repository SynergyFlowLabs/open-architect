package androidx.compose.foundation.lazy;

import androidx.compose.runtime.n7;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ParentSizeElement extends androidx.compose.ui.node.e1<s1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final n7<Integer> f16627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n7<Integer> f16628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f16629f;

    public /* synthetic */ ParentSizeElement(float f10, n7 n7Var, n7 n7Var2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : n7Var, (i10 & 4) != 0 ? null : n7Var2, str);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f16626c == parentSizeElement.f16626c && Intrinsics.areEqual(this.f16627d, parentSizeElement.f16627d) && Intrinsics.areEqual(this.f16628e, parentSizeElement.f16628e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        n7<Integer> n7Var = this.f16627d;
        int iHashCode = (n7Var != null ? n7Var.hashCode() : 0) * 31;
        n7<Integer> n7Var2 = this.f16628e;
        return ((iHashCode + (n7Var2 != null ? n7Var2.hashCode() : 0)) * 31) + Float.hashCode(this.f16626c);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d(this.f16629f);
        t2Var.e(Float.valueOf(this.f16626c));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s1 a() {
        return new s1(this.f16626c, this.f16627d, this.f16628e);
    }

    public final float m() {
        return this.f16626c;
    }

    @Nullable
    public final n7<Integer> n() {
        return this.f16628e;
    }

    @NotNull
    public final String o() {
        return this.f16629f;
    }

    @Nullable
    public final n7<Integer> p() {
        return this.f16627d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s1 s1Var) {
        s1Var.A9(this.f16626c);
        s1Var.C9(this.f16627d);
        s1Var.B9(this.f16628e);
    }

    public ParentSizeElement(float f10, @Nullable n7<Integer> n7Var, @Nullable n7<Integer> n7Var2, @NotNull String str) {
        this.f16626c = f10;
        this.f16627d = n7Var;
        this.f16628e = n7Var2;
        this.f16629f = str;
    }
}

package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import androidx.compose.ui.text.y3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class TextStringSimpleElement extends e1<e0> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20544j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f20545c;

    @Nullable
    private final x0 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y3 f20546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f20547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20551i;

    public /* synthetic */ TextStringSimpleElement(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, i10, z10, i11, i12, x0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (Intrinsics.areEqual(this.color, textStringSimpleElement.color) && Intrinsics.areEqual(this.f20545c, textStringSimpleElement.f20545c) && Intrinsics.areEqual(this.f20546d, textStringSimpleElement.f20546d) && Intrinsics.areEqual(this.f20547e, textStringSimpleElement.f20547e) && androidx.compose.ui.text.style.v.i(this.f20548f, textStringSimpleElement.f20548f) && this.f20549g == textStringSimpleElement.f20549g && this.f20550h == textStringSimpleElement.f20550h && this.f20551i == textStringSimpleElement.f20551i) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((((((((this.f20545c.hashCode() * 31) + this.f20546d.hashCode()) * 31) + this.f20547e.hashCode()) * 31) + androidx.compose.ui.text.style.v.j(this.f20548f)) * 31) + Boolean.hashCode(this.f20549g)) * 31) + this.f20550h) * 31) + this.f20551i) * 31;
        x0 x0Var = this.color;
        return iHashCode + (x0Var != null ? x0Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e0 a() {
        return new e0(this.f20545c, this.f20546d, this.f20547e, this.f20548f, this.f20549g, this.f20550h, this.f20551i, this.color, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull e0 e0Var) {
        e0Var.F9(e0Var.N9(this.color, this.f20546d), e0Var.P9(this.f20545c), e0Var.O9(this.f20546d, this.f20551i, this.f20550h, this.f20549g, this.f20547e, this.f20548f));
    }

    public /* synthetic */ TextStringSimpleElement(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, (i13 & 8) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : x0Var, null);
    }

    private TextStringSimpleElement(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var) {
        this.f20545c = str;
        this.f20546d = y3Var;
        this.f20547e = bVar;
        this.f20548f = i10;
        this.f20549g = z10;
        this.f20550h = i11;
        this.f20551i = i12;
        this.color = x0Var;
    }
}

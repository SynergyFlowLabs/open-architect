package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.f5;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class SelectableTextAnnotatedStringElement extends e1<j> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f20517o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f20518c;

    @Nullable
    private final x0 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y3 f20519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f20520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Function1<p3, Unit> f20521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f20523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f20525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final List<androidx.compose.ui.text.f.e<v0>> f20526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Function1<List<n0.j>, Unit> f20527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final n f20528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final f5 f20529n;

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, function1, i10, z10, i11, i12, list, function2, nVar, x0Var, f5Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, selectableTextAnnotatedStringElement.color) && Intrinsics.areEqual(this.f20518c, selectableTextAnnotatedStringElement.f20518c) && Intrinsics.areEqual(this.f20519d, selectableTextAnnotatedStringElement.f20519d) && Intrinsics.areEqual(this.f20526k, selectableTextAnnotatedStringElement.f20526k) && Intrinsics.areEqual(this.f20520e, selectableTextAnnotatedStringElement.f20520e) && Intrinsics.areEqual(this.f20529n, selectableTextAnnotatedStringElement.f20529n) && this.f20521f == selectableTextAnnotatedStringElement.f20521f && androidx.compose.ui.text.style.v.i(this.f20522g, selectableTextAnnotatedStringElement.f20522g) && this.f20523h == selectableTextAnnotatedStringElement.f20523h && this.f20524i == selectableTextAnnotatedStringElement.f20524i && this.f20525j == selectableTextAnnotatedStringElement.f20525j && this.f20527l == selectableTextAnnotatedStringElement.f20527l && Intrinsics.areEqual(this.f20528m, selectableTextAnnotatedStringElement.f20528m);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((this.f20518c.hashCode() * 31) + this.f20519d.hashCode()) * 31) + this.f20520e.hashCode()) * 31;
        Function1<p3, Unit> function1 = this.f20521f;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + androidx.compose.ui.text.style.v.j(this.f20522g)) * 31) + Boolean.hashCode(this.f20523h)) * 31) + this.f20524i) * 31) + this.f20525j) * 31;
        List<androidx.compose.ui.text.f.e<v0>> list = this.f20526k;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<n0.j>, Unit> function2 = this.f20527l;
        int iHashCode4 = (iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31;
        n nVar = this.f20528m;
        int iHashCode5 = (iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        f5 f5Var = this.f20529n;
        int iHashCode6 = (iHashCode5 + (f5Var != null ? f5Var.hashCode() : 0)) * 31;
        x0 x0Var = this.color;
        return iHashCode6 + (x0Var != null ? x0Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public j a() {
        return new j(this.f20518c, this.f20519d, this.f20520e, this.f20521f, this.f20522g, this.f20523h, this.f20524i, this.f20525j, this.f20526k, this.f20527l, this.f20528m, this.color, this.f20529n, null, 8192, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j jVar) {
        jVar.G9(this.f20518c, this.f20519d, this.f20526k, this.f20525j, this.f20524i, this.f20523h, this.f20520e, this.f20522g, this.f20521f, this.f20527l, this.f20528m, this.color, this.f20529n);
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : nVar, (i13 & 2048) != 0 ? null : x0Var, (i13 & 4096) != 0 ? null : f5Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1<? super p3, Unit> function1, int i10, boolean z10, int i11, int i12, List<androidx.compose.ui.text.f.e<v0>> list, Function1<? super List<n0.j>, Unit> function2, n nVar, x0 x0Var, f5 f5Var) {
        this.f20518c = fVar;
        this.f20519d = y3Var;
        this.f20520e = bVar;
        this.f20521f = function1;
        this.f20522g = i10;
        this.f20523h = z10;
        this.f20524i = i11;
        this.f20525j = i12;
        this.f20526k = list;
        this.f20527l = function2;
        this.f20528m = nVar;
        this.color = x0Var;
        this.f20529n = f5Var;
    }
}

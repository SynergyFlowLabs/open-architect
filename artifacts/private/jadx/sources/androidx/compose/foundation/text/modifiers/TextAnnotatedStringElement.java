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
public final class TextAnnotatedStringElement extends e1<w> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f20530s = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f20531c;

    @Nullable
    private final x0 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y3 f20532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f20533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Function1<p3, Unit> f20534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f20536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f20538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final List<androidx.compose.ui.text.f.e<v0>> f20539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Function1<List<n0.j>, Unit> f20540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final n f20541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final f5 f20542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final Function1<w.a, Unit> f20543o;

    public /* synthetic */ TextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, function1, i10, z10, i11, i12, list, function2, nVar, x0Var, f5Var, function3);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.areEqual(this.color, textAnnotatedStringElement.color) && Intrinsics.areEqual(this.f20531c, textAnnotatedStringElement.f20531c) && Intrinsics.areEqual(this.f20532d, textAnnotatedStringElement.f20532d) && Intrinsics.areEqual(this.f20539k, textAnnotatedStringElement.f20539k) && Intrinsics.areEqual(this.f20533e, textAnnotatedStringElement.f20533e) && this.f20534f == textAnnotatedStringElement.f20534f && this.f20543o == textAnnotatedStringElement.f20543o && androidx.compose.ui.text.style.v.i(this.f20535g, textAnnotatedStringElement.f20535g) && this.f20536h == textAnnotatedStringElement.f20536h && this.f20537i == textAnnotatedStringElement.f20537i && this.f20538j == textAnnotatedStringElement.f20538j && this.f20540l == textAnnotatedStringElement.f20540l && Intrinsics.areEqual(this.f20541m, textAnnotatedStringElement.f20541m);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((this.f20531c.hashCode() * 31) + this.f20532d.hashCode()) * 31) + this.f20533e.hashCode()) * 31;
        Function1<p3, Unit> function1 = this.f20534f;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + androidx.compose.ui.text.style.v.j(this.f20535g)) * 31) + Boolean.hashCode(this.f20536h)) * 31) + this.f20537i) * 31) + this.f20538j) * 31;
        List<androidx.compose.ui.text.f.e<v0>> list = this.f20539k;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<n0.j>, Unit> function2 = this.f20540l;
        int iHashCode4 = (iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31;
        n nVar = this.f20541m;
        int iHashCode5 = (iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        x0 x0Var = this.color;
        int iHashCode6 = (iHashCode5 + (x0Var != null ? x0Var.hashCode() : 0)) * 31;
        Function1<w.a, Unit> function3 = this.f20543o;
        return iHashCode6 + (function3 != null ? function3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.f20531c, this.f20532d, this.f20533e, this.f20534f, this.f20535g, this.f20536h, this.f20537i, this.f20538j, this.f20539k, this.f20540l, this.f20541m, this.color, this.f20542n, this.f20543o, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull w wVar) {
        wVar.F9(wVar.V9(this.color, this.f20532d), wVar.X9(this.f20531c), wVar.W9(this.f20532d, this.f20539k, this.f20538j, this.f20537i, this.f20536h, this.f20533e, this.f20535g, this.f20542n), wVar.U9(this.f20534f, this.f20540l, this.f20541m, this.f20543o));
    }

    public /* synthetic */ TextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : nVar, (i13 & 2048) != 0 ? null : x0Var, (i13 & 4096) != 0 ? null : f5Var, (i13 & 8192) != 0 ? null : function3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1<? super p3, Unit> function1, int i10, boolean z10, int i11, int i12, List<androidx.compose.ui.text.f.e<v0>> list, Function1<? super List<n0.j>, Unit> function2, n nVar, x0 x0Var, f5 f5Var, Function1<? super w.a, Unit> function3) {
        this.f20531c = fVar;
        this.f20532d = y3Var;
        this.f20533e = bVar;
        this.f20534f = function1;
        this.f20535g = i10;
        this.f20536h = z10;
        this.f20537i = i11;
        this.f20538j = i12;
        this.f20539k = list;
        this.f20540l = function2;
        this.f20541m = nVar;
        this.color = x0Var;
        this.f20542n = f5Var;
        this.f20543o = function3;
    }
}

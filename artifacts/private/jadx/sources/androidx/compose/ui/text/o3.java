package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class o3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f42019l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f42020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y3 f42021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<f.e<v0>> f42022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f42026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f42027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f42028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f42029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.font.x.b f42030k;

    @kotlin.l(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @kotlin.b1(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ o3(f fVar, y3 y3Var, List list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.x.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, (List<f.e<v0>>) list, i10, z10, i11, dVar, wVar, bVar, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o3 b(o3 o3Var, f fVar, y3 y3Var, List list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.x.b bVar, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fVar = o3Var.f42020a;
        }
        if ((i12 & 2) != 0) {
            y3Var = o3Var.f42021b;
        }
        if ((i12 & 4) != 0) {
            list = o3Var.f42022c;
        }
        if ((i12 & 8) != 0) {
            i10 = o3Var.f42023d;
        }
        if ((i12 & 16) != 0) {
            z10 = o3Var.f42024e;
        }
        if ((i12 & 32) != 0) {
            i11 = o3Var.f42025f;
        }
        if ((i12 & 64) != 0) {
            dVar = o3Var.f42026g;
        }
        if ((i12 & 128) != 0) {
            wVar = o3Var.f42027h;
        }
        if ((i12 & 256) != 0) {
            bVar = o3Var.j();
        }
        if ((i12 & 512) != 0) {
            j10 = o3Var.f42029j;
        }
        long j11 = j10;
        androidx.compose.ui.unit.w wVar2 = wVar;
        androidx.compose.ui.text.font.x.b bVar2 = bVar;
        int i13 = i11;
        androidx.compose.ui.unit.d dVar2 = dVar;
        boolean z11 = z10;
        List list2 = list;
        return o3Var.a(fVar, y3Var, list2, i10, z11, i13, dVar2, wVar2, bVar2, j11);
    }

    @kotlin.l(message = "Replaced with FontFamily.Resolver", replaceWith = @kotlin.b1(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void k() {
    }

    @kotlin.l(message = "Font.ResourceLoader is deprecated", replaceWith = @kotlin.b1(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @NotNull
    public final o3 a(@NotNull f fVar, @NotNull y3 y3Var, @NotNull List<f.e<v0>> list, int i10, boolean z10, int i11, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.text.font.x.b bVar, long j10) {
        return new o3(fVar, y3Var, list, i10, z10, i11, dVar, wVar, bVar, this.f42028i, j10);
    }

    public final long c() {
        return this.f42029j;
    }

    @NotNull
    public final androidx.compose.ui.unit.d d() {
        return this.f42026g;
    }

    @NotNull
    public final androidx.compose.ui.text.font.y.b e() {
        return this.f42028i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.f42020a, o3Var.f42020a) && Intrinsics.areEqual(this.f42021b, o3Var.f42021b) && Intrinsics.areEqual(this.f42022c, o3Var.f42022c) && this.f42023d == o3Var.f42023d && this.f42024e == o3Var.f42024e && androidx.compose.ui.text.style.v.i(this.f42025f, o3Var.f42025f) && Intrinsics.areEqual(this.f42026g, o3Var.f42026g) && this.f42027h == o3Var.f42027h && Intrinsics.areEqual(this.f42028i, o3Var.f42028i) && androidx.compose.ui.unit.b.g(this.f42029j, o3Var.f42029j);
    }

    @NotNull
    public final androidx.compose.ui.unit.w f() {
        return this.f42027h;
    }

    public final int g() {
        return this.f42023d;
    }

    public final int h() {
        return this.f42025f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f42020a.hashCode() * 31) + this.f42021b.hashCode()) * 31) + this.f42022c.hashCode()) * 31) + this.f42023d) * 31) + Boolean.hashCode(this.f42024e)) * 31) + androidx.compose.ui.text.style.v.j(this.f42025f)) * 31) + this.f42026g.hashCode()) * 31) + this.f42027h.hashCode()) * 31) + this.f42028i.hashCode()) * 31) + androidx.compose.ui.unit.b.t(this.f42029j);
    }

    @NotNull
    public final List<f.e<v0>> i() {
        return this.f42022c;
    }

    @NotNull
    public final androidx.compose.ui.text.font.x.b j() {
        androidx.compose.ui.text.font.x.b bVar = this.f42030k;
        return bVar == null ? t.f42263b.a(this.f42028i) : bVar;
    }

    public final boolean l() {
        return this.f42024e;
    }

    @NotNull
    public final y3 m() {
        return this.f42021b;
    }

    @NotNull
    public final f n() {
        return this.f42020a;
    }

    @NotNull
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f42020a) + ", style=" + this.f42021b + ", placeholders=" + this.f42022c + ", maxLines=" + this.f42023d + ", softWrap=" + this.f42024e + ", overflow=" + ((Object) androidx.compose.ui.text.style.v.k(this.f42025f)) + ", density=" + this.f42026g + ", layoutDirection=" + this.f42027h + ", fontFamilyResolver=" + this.f42028i + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.f42029j)) + ')';
    }

    public /* synthetic */ o3(f fVar, y3 y3Var, List list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.y.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, (List<f.e<v0>>) list, i10, z10, i11, dVar, wVar, bVar, j10);
    }

    private o3(f fVar, y3 y3Var, List<f.e<v0>> list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.x.b bVar, androidx.compose.ui.text.font.y.b bVar2, long j10) {
        this.f42020a = fVar;
        this.f42021b = y3Var;
        this.f42022c = list;
        this.f42023d = i10;
        this.f42024e = z10;
        this.f42025f = i11;
        this.f42026g = dVar;
        this.f42027h = wVar;
        this.f42028i = bVar2;
        this.f42029j = j10;
        this.f42030k = bVar;
    }

    private o3(f fVar, y3 y3Var, List<f.e<v0>> list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.x.b bVar, long j10) {
        this(fVar, y3Var, list, i10, z10, i11, dVar, wVar, bVar, androidx.compose.ui.text.font.s.a(bVar), j10);
    }

    private o3(f fVar, y3 y3Var, List<f.e<v0>> list, int i10, boolean z10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.y.b bVar, long j10) {
        this(fVar, y3Var, list, i10, z10, i11, dVar, wVar, (androidx.compose.ui.text.font.x.b) null, bVar, j10);
    }
}

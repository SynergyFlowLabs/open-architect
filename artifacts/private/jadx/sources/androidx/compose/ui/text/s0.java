package androidx.compose.ui.text;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f42139a = Integer.MAX_VALUE;

    @kotlin.l(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.b1(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final n0 a(@NotNull q0 q0Var, int i10, boolean z10, float f10) {
        return androidx.compose.ui.text.platform.j.b(q0Var, i10, z10 ? androidx.compose.ui.text.style.v.f42256b.c() : androidx.compose.ui.text.style.v.f42256b.a(), androidx.compose.ui.unit.c.b(0, o(f10), 0, 0, 13, null));
    }

    @kotlin.l(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.b1(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @NotNull
    public static final n0 b(@NotNull String str, @NotNull y3 y3Var, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull List<f.e<c3>> list, @NotNull List<f.e<v0>> list2, int i10, boolean z10) {
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        return androidx.compose.ui.text.platform.j.c(str, y3Var, list, list2, i10, z10 ? aVar.c() : aVar.a(), androidx.compose.ui.unit.c.b(0, o(f10), 0, 0, 13, null), dVar, bVar);
    }

    @kotlin.l(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @kotlin.b1(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @NotNull
    public static final n0 c(@NotNull String str, @NotNull y3 y3Var, @NotNull List<f.e<c3>> list, @NotNull List<f.e<v0>> list2, int i10, boolean z10, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.x.b bVar) {
        return androidx.compose.ui.text.platform.j.a(str, y3Var, list, list2, i10, z10, f10, dVar, bVar);
    }

    public static /* synthetic */ n0 d(q0 q0Var, int i10, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a(q0Var, i10, z10, f10);
    }

    public static /* synthetic */ n0 f(String str, y3 y3Var, List list, List list2, int i10, boolean z10, float f10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.x.b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        List list4 = list2;
        if ((i11 & 16) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        return c(str, y3Var, list3, list4, i12, z10, f10, dVar, bVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Paragraph that takes `ellipsis: Boolean` is deprecated, pass TextOverflow instead.")
    public static final /* synthetic */ n0 g(String str, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, List list2, int i10, boolean z10) {
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        return androidx.compose.ui.text.platform.j.c(str, y3Var, list, list2, i10, z10 ? aVar.c() : aVar.a(), j10, dVar, bVar);
    }

    @NotNull
    public static final n0 i(@NotNull String str, @NotNull y3 y3Var, long j10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull List<f.e<c3>> list, @NotNull List<f.e<v0>> list2, int i10, int i11) {
        return androidx.compose.ui.text.platform.j.c(str, y3Var, list, list2, i10, i11, j10, dVar, bVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Paragraph that takes ellipsis: Boolean is deprecated, pass TextOverflow instead.", replaceWith = @kotlin.b1(expression = "Paragraph(paragraphIntrinsics, constraints, maxLines, if (ellipsis) TextOverflow.Ellipsis else TextOverflow.Clip", imports = {}))
    public static final /* synthetic */ n0 k(q0 q0Var, long j10, int i10, boolean z10) {
        return androidx.compose.ui.text.platform.j.b(q0Var, i10, z10 ? androidx.compose.ui.text.style.v.f42256b.c() : androidx.compose.ui.text.style.v.f42256b.a(), j10);
    }

    public static /* synthetic */ n0 l(q0 q0Var, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return k(q0Var, j10, i10, z10);
    }

    @NotNull
    public static final n0 m(@NotNull q0 q0Var, long j10, int i10, int i11) {
        return androidx.compose.ui.text.platform.j.b(q0Var, i10, i11, j10);
    }

    public static /* synthetic */ n0 n(q0 q0Var, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = androidx.compose.ui.text.style.v.f42256b.a();
        }
        return m(q0Var, j10, i10, i11);
    }

    public static final int o(float f10) {
        return (int) Math.ceil(f10);
    }
}

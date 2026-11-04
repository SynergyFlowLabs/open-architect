package androidx.compose.ui.text;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {
    @NotNull
    public static final q0 a(@NotNull String str, @NotNull y3 y3Var, @NotNull List<? extends f.e<? extends f.a>> list, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull List<f.e<v0>> list2) {
        return androidx.compose.ui.text.platform.i.a(str, y3Var, list, list2, dVar, bVar);
    }

    @kotlin.l(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @kotlin.b1(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    @NotNull
    public static final q0 b(@NotNull String str, @NotNull y3 y3Var, @NotNull List<f.e<c3>> list, @NotNull List<f.e<v0>> list2, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.x.b bVar) {
        return androidx.compose.ui.text.platform.i.a(str, y3Var, list, list2, dVar, androidx.compose.ui.text.font.s.a(bVar));
    }

    @kotlin.l(message = "Use an overload that takes `annotations` instead", replaceWith = @kotlin.b1(expression = "ParagraphIntrinsics(text, style, spanStyles, density, fontFamilyResolver, placeholders)", imports = {}))
    @NotNull
    public static final q0 c(@NotNull String str, @NotNull y3 y3Var, @NotNull List<f.e<c3>> list, @NotNull List<f.e<v0>> list2, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar) {
        return androidx.compose.ui.text.platform.i.a(str, y3Var, list, list2, dVar, bVar);
    }

    public static /* synthetic */ q0 d(String str, y3 y3Var, List list, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list2, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return a(str, y3Var, list, dVar, bVar, list2);
    }

    public static /* synthetic */ q0 e(String str, y3 y3Var, List list, List list2, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.x.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return b(str, y3Var, list3, list2, dVar, bVar);
    }

    public static /* synthetic */ q0 f(String str, y3 y3Var, List list, List list2, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return c(str, y3Var, list3, list2, dVar, bVar);
    }
}

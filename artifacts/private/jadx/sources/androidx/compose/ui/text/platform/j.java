package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.s0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import java.util.List;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "AndroidParagraph_androidKt")
public final class j {
    @kotlin.l(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @b1(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @NotNull
    public static final n0 a(@NotNull String str, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull List<androidx.compose.ui.text.f.e<v0>> list2, int i10, boolean z10, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.x.b bVar) {
        h hVar = new h(str, y3Var, list, list2, androidx.compose.ui.text.font.s.a(bVar), dVar);
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        return new androidx.compose.ui.text.c(hVar, i10, z10 ? aVar.c() : aVar.a(), androidx.compose.ui.unit.c.b(0, s0.o(f10), 0, 0, 13, null), null);
    }

    @NotNull
    public static final n0 b(@NotNull q0 q0Var, int i10, int i11, long j10) {
        Intrinsics.checkNotNull(q0Var, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new androidx.compose.ui.text.c((h) q0Var, i10, i11, j10, null);
    }

    @NotNull
    public static final n0 c(@NotNull String str, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull List<androidx.compose.ui.text.f.e<v0>> list2, int i10, int i11, long j10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar) {
        return new androidx.compose.ui.text.c(new h(str, y3Var, list, list2, bVar, dVar), i10, i11, j10, null);
    }
}

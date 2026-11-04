package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    @NotNull
    public static final y a(@NotNull Typeface typeface) {
        return z.a(c(typeface));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @kotlin.b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @NotNull
    public static final n1 b(@NotNull Context context, @NotNull y yVar, @Nullable List<Pair<v0, q0>> list) {
        if (yVar instanceof k0) {
            return new androidx.compose.ui.text.platform.c((k0) yVar, context, list, null, 8, null);
        }
        if (yVar instanceof z0) {
            return new androidx.compose.ui.text.platform.d((z0) yVar);
        }
        if (yVar instanceof p) {
            return new androidx.compose.ui.text.platform.b();
        }
        if (yVar instanceof a1) {
            return ((a1) yVar).s();
        }
        throw new kotlin.k0();
    }

    @NotNull
    public static final n1 c(@NotNull Typeface typeface) {
        return new androidx.compose.ui.text.platform.s(typeface);
    }

    public static /* synthetic */ n1 d(Context context, y yVar, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = null;
            boolean z10 = true | false;
        }
        return b(context, yVar, list);
    }
}

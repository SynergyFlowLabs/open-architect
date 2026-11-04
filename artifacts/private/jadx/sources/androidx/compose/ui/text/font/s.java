package androidx.compose.ui.text.font;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    @kotlin.l(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @kotlin.b1(expression = "createFontFamilyResolver()", imports = {}))
    @NotNull
    public static final y.b a(@NotNull x.b bVar) {
        return new f0(new r(bVar), null, null, null, null, 30, null);
    }

    @kotlin.l(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @kotlin.b1(expression = "createFontFamilyResolver()", imports = {}))
    @NotNull
    public static final y.b b(@NotNull x.b bVar, @NotNull Context context) {
        return new f0(new q(bVar, context.getApplicationContext()), null, null, null, null, 30, null);
    }
}

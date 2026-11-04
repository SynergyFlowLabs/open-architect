package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.w3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    @NotNull
    public static final CharSequence a(@NotNull l lVar) {
        return lVar.subSequence(w3.l(lVar.h()), w3.k(lVar.h()));
    }

    @NotNull
    public static final CharSequence b(@NotNull l lVar, int i10) {
        return lVar.subSequence(w3.k(lVar.h()), Math.min(w3.k(lVar.h()) + i10, lVar.length()));
    }

    @NotNull
    public static final CharSequence c(@NotNull l lVar, int i10) {
        return lVar.subSequence(Math.max(0, w3.l(lVar.h()) - i10), w3.l(lVar.h()));
    }
}

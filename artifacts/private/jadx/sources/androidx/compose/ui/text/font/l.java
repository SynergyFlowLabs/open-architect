package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class l implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f41606a = new l();

    private l() {
    }

    @Override // androidx.compose.ui.text.font.d.a
    @Nullable
    public Typeface a(@NotNull Context context, @NotNull d dVar) {
        k kVar = dVar instanceof k ? (k) dVar : null;
        if (kVar != null) {
            return kVar.i(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.d.a
    @Nullable
    public Object b(@NotNull Context context, @NotNull d dVar, @NotNull kotlin.coroutines.d<?> dVar2) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }
}

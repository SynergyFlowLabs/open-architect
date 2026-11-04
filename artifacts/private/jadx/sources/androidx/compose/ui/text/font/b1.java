package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class b1 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b1 f41558a = new b1();

    private b1() {
    }

    @Override // androidx.compose.ui.text.font.d.a
    @Nullable
    public Typeface a(@NotNull Context context, @NotNull d dVar) {
        u uVar = dVar instanceof u ? (u) dVar : null;
        if (uVar != null) {
            return uVar.f(context);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.font.d.a
    @Nullable
    public Object b(@NotNull Context context, @NotNull d dVar, @NotNull kotlin.coroutines.d<? super Typeface> dVar2) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}

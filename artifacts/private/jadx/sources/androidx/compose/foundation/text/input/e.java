package androidx.compose.foundation.text.input;

import androidx.compose.runtime.k7;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    @k7
    @NotNull
    public static final c a(@NotNull c cVar, @NotNull y0.e eVar) {
        return d(cVar, new a(eVar));
    }

    @k7
    @NotNull
    public static final c b(@NotNull c cVar, @NotNull Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        return d(cVar, new d(function2));
    }

    @k7
    @NotNull
    public static final c c(@NotNull c cVar, int i10) {
        return d(cVar, new g(i10));
    }

    @k7
    @NotNull
    public static final c d(@NotNull c cVar, @NotNull c cVar2) {
        return new b(cVar, cVar2);
    }
}

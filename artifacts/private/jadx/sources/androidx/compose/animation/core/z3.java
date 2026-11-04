package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface z3<T, V extends w> {
    @NotNull
    Function1<T, V> a();

    @NotNull
    Function1<V, T> b();
}

package androidx.activity.result;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @NotNull
    <I, O> h<I> registerForActivityResult(@NotNull g.a<I, O> aVar, @NotNull a<O> aVar2);

    @NotNull
    <I, O> h<I> registerForActivityResult(@NotNull g.a<I, O> aVar, @NotNull k kVar, @NotNull a<O> aVar2);
}

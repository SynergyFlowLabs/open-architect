package com.planner5d.library.model.manager.config;

import kotlin.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface q {
    @kotlin.l(message = "use the one with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void a(@NotNull String str, @Nullable String str2);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "commit()", imports = {}))
    void b();

    @kotlin.l(message = "use the one with a typed key", replaceWith = @b1(expression = "remove()", imports = {}))
    void remove(@NotNull String str);
}

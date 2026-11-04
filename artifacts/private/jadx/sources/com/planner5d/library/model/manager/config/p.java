package com.planner5d.library.model.manager.config;

import java.util.Set;
import kotlin.Unit;
import kotlin.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface p {
    @Nullable
    Object A(@NotNull com.planner5d.library.services.r rVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void B(@NotNull String str, @Nullable String str2);

    @Nullable
    Object C(@NotNull String str, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    String D(@NotNull String str, @Nullable String str2);

    @NotNull
    q E();

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "getStringSet()", imports = {}))
    @Nullable
    Set<String> F(@NotNull String str, @Nullable Set<String> set);

    @Nullable
    Object G(@NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    void H(@NotNull com.planner5d.library.services.r rVar, @Nullable String str);

    @Nullable
    Object I(@NotNull String str, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object J(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "clear()", imports = {}))
    void K();

    @Nullable
    Object L(@NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void M(@NotNull String str, boolean z10);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "get()", imports = {}))
    boolean N(@NotNull String str, boolean z10);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void O(@NotNull String str, int i10);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void P(@NotNull String str, long j10);

    @Nullable
    Object Q(@NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super JSONObject> dVar);

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "remove()", imports = {}))
    void b(@NotNull com.planner5d.library.services.r rVar);

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object d(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    void e(@NotNull String str, @NotNull Set<String> set);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    void f(@NotNull com.planner5d.library.services.r rVar, boolean z10);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    void g(@NotNull com.planner5d.library.services.r rVar, int i10);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "set()", imports = {}))
    void h(@NotNull com.planner5d.library.services.r rVar, long j10);

    @Nullable
    Object i(@NotNull com.planner5d.library.services.r rVar, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<String>> dVar);

    @Nullable
    Object j(@NotNull com.planner5d.library.services.r rVar, @NotNull JSONObject jSONObject, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    long k(@NotNull com.planner5d.library.services.r rVar, long j10);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    int l(@NotNull com.planner5d.library.services.r rVar, int i10);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "get()", imports = {}))
    boolean m(@NotNull com.planner5d.library.services.r rVar, boolean z10);

    @Nullable
    Object n(@NotNull String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super String> dVar);

    @Nullable
    Object o(@NotNull com.planner5d.library.services.r rVar, long j10, @NotNull kotlin.coroutines.d<? super Long> dVar);

    @Nullable
    Object p(@NotNull com.planner5d.library.services.r rVar, int i10, @NotNull kotlin.coroutines.d<? super Integer> dVar);

    @Nullable
    Object q(@NotNull String str, @NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<String>> dVar);

    @Nullable
    Object r(@NotNull com.planner5d.library.services.r rVar, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "contains()", imports = {}))
    boolean s(@NotNull com.planner5d.library.services.r rVar);

    @Nullable
    Object t(@NotNull com.planner5d.library.services.r rVar, int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object u(@NotNull com.planner5d.library.services.r rVar, @Nullable String str, @NotNull kotlin.coroutines.d<? super String> dVar);

    @Nullable
    Object v(@NotNull String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @kotlin.l(message = "use coroutines", replaceWith = @b1(expression = "getString()", imports = {}))
    @Nullable
    String w(@NotNull com.planner5d.library.services.r rVar, @Nullable String str);

    @kotlin.l(message = "use coroutines with a typed key", replaceWith = @b1(expression = "contains()", imports = {}))
    boolean x(@NotNull String str);

    @Nullable
    Object y(@NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object z(@NotNull kotlin.coroutines.d<? super Set<String>> dVar);
}

package com.planner5d.library.model.manager;

import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public interface h {
    @Nullable
    List<Pair<Integer, String>> b();

    @Nullable
    Object c(@NotNull kotlin.coroutines.d<? super JSONArray> dVar);

    @Nullable
    Object d(@NotNull kotlin.coroutines.d<? super List<com.planner5d.library.model.manager.config.a>> dVar);

    @Nullable
    Object f(@NotNull kotlin.coroutines.d<? super String> dVar);

    @Nullable
    List<Pair<Integer, String>> h();

    @NotNull
    List<String> i();
}

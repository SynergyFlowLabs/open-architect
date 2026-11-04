package com.planner5d.library.contest.data;

import android.app.Activity;
import androidx.annotation.m1;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.database.model.project.Project;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface i {
    @Nullable
    Object a(@NotNull Activity activity, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object b(@NotNull Contest contest, @NotNull eb.d dVar, @Nullable Integer num, @NotNull kotlin.coroutines.d<? super Boolean> dVar2);

    @Nullable
    Object f(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super eb.d[]> dVar);

    @NotNull
    List<ContestPrize> h();

    @Nullable
    Object i(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object j(@Nullable Long l10, @NotNull kotlin.coroutines.d<? super Contest> dVar);

    @Nullable
    Object m(long j10, @NotNull kotlin.coroutines.d<? super String> dVar) throws Exception;

    @Nullable
    Object n(@NotNull Contest contest, @NotNull kotlin.coroutines.d<? super List<eb.a>> dVar);

    @Nullable
    Object o(long j10, boolean z10, @NotNull String[] strArr, @NotNull kotlin.coroutines.d<? super Pair<Integer, ? extends List<ContestPrize>>> dVar);

    @Nullable
    Object q(@NotNull kotlin.coroutines.d<? super List<hb.a>> dVar);

    @Nullable
    Object r(@NotNull kotlin.coroutines.d<? super Contest> dVar);

    @Nullable
    Object t(@NotNull kotlin.coroutines.d<? super List<Contest>> dVar);

    @m1
    @Nullable
    Project u(@NotNull Contest contest);

    @Nullable
    Object v(@NotNull kotlin.coroutines.d<? super Date> dVar);
}

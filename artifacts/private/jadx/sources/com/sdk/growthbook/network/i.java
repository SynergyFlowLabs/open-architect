package com.sdk.growthbook.network;

import com.sdk.growthbook.utils.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface i {
    void a(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function2);

    @NotNull
    p2 b(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function2);

    @NotNull
    kotlinx.coroutines.flow.i<s<String>> c(@NotNull String str);
}

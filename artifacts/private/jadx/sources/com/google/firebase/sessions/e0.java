package com.google.firebase.sessions;

import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface e0 {

    public static final class a {
        @NotNull
        public static Map<String, ProcessData> a(@NotNull e0 e0Var) {
            return e0Var.g(MapsKt.emptyMap());
        }
    }

    @NotNull
    String a();

    boolean b(@NotNull Map<String, ProcessData> map);

    boolean c(@NotNull Map<String, ProcessData> map);

    @NotNull
    String d();

    @NotNull
    Map<String, ProcessData> e();

    int f();

    @NotNull
    Map<String, ProcessData> g(@Nullable Map<String, ProcessData> map);

    void h();
}

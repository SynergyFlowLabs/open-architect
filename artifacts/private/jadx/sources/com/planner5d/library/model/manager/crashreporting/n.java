package com.planner5d.library.model.manager.crashreporting;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface n {

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f191214a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f191215b = "user_id";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f191216c = "database_version";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f191217d = "installation_hash";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f191218e = "debug";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f191219f = 0;

        private a() {
        }
    }

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @androidx.annotation.d
    void b(@NotNull Throwable th2, @Nullable String str, @Nullable String str2);

    @androidx.annotation.d
    void c(@Nullable String str, @Nullable String str2);

    @androidx.annotation.d
    void clear();

    @androidx.annotation.d
    void h(@NotNull String str);

    @androidx.annotation.d
    void setUserId(long j10);
}

package com.planner5d.library.activity.fragment.projects;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface g {

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f134997e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f134998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f134999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Date f135000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f135001d;

        public a(long j10, boolean z10, @NotNull Date date, @Nullable String str) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f134998a = j10;
            this.f134999b = z10;
            this.f135000c = date;
            this.f135001d = str;
        }

        @NotNull
        public final Date a() {
            return this.f135000c;
        }

        @Nullable
        public final String b() {
            return this.f135001d;
        }

        public final long c() {
            return this.f134998a;
        }

        public final boolean d() {
            return this.f134999b;
        }
    }

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super List<? extends a>> dVar);
}

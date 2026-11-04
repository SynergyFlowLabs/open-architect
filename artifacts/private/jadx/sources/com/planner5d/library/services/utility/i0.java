package com.planner5d.library.services.utility;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nDateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtils.kt\ncom/planner5d/library/services/utility/DateUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f225264a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f225265b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f225266c = 60000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f225267d = 3600000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f225268e = 86400000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f225269f = 604800000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f225270g = 2592000000L;

    private i0() {
    }

    @oj.n
    @NotNull
    public static final Date a(@NotNull Date date, long j10) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new Date(date.getTime() + j10);
    }

    @oj.n
    public static final long b(long j10) {
        return j10 * 86400000;
    }

    public static /* synthetic */ void c() {
    }

    @oj.n
    public static final long d(long j10) {
        return j10 * 3600000;
    }

    @oj.n
    public static final boolean e(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(1) != calendar2.get(1) || calendar.get(2) != calendar2.get(2)) {
            return false;
        }
        int i10 = 0 | 5;
        return calendar.get(5) == calendar2.get(5);
    }

    @oj.n
    public static final long f(long j10) {
        return j10 * 60000;
    }

    @oj.n
    public static final long g(long j10) {
        return j10 * 1000;
    }

    @oj.n
    @NotNull
    public static final Date h(@NotNull Date date, long j10) {
        Intrinsics.checkNotNullParameter(date, "date");
        return a(date, -j10);
    }

    @oj.n
    public static final long i(long j10) {
        return j10 * f225269f;
    }
}

package com.planner5d.library.services.backgroundexecutor.database;

import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@u(tableName = "crash_record")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(name = "timestamp_millis")
    private final long f224000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(name = "thread_id")
    private final long f224001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "thread_name")
    @NotNull
    private final String f224002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.exception.c f224003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @u0(autoGenerate = true)
    private final long f224004e;

    public b(long j10, long j11, @NotNull String threadName, @NotNull com.planner5d.library.model.exception.c exception, long j12) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f224000a = j10;
        this.f224001b = j11;
        this.f224002c = threadName;
        this.f224003d = exception;
        this.f224004e = j12;
    }

    @NotNull
    public final com.planner5d.library.model.exception.c a() {
        return this.f224003d;
    }

    public final long b() {
        return this.f224004e;
    }

    public final long c() {
        return this.f224001b;
    }

    @NotNull
    public final String d() {
        return this.f224002c;
    }

    public final long e() {
        return this.f224000a;
    }

    public /* synthetic */ b(long j10, long j11, String str, com.planner5d.library.model.exception.c cVar, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, cVar, (i10 & 16) != 0 ? 0L : j12);
    }
}

package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0
public final class Time {

    @NotNull
    public static final Time$$b Companion = new Time$$b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f124835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f124836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f124837c;

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Time$$a.f124838a.getDescriptor());
        }
        this.f124835a = j10;
        this.f124836b = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.f124837c = j10 / ((long) 1000);
        } else {
            this.f124837c = j12;
        }
    }

    public static /* synthetic */ Time c(Time time, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = time.f124835a;
        }
        return time.b(j10);
    }

    @oj.n
    public static final /* synthetic */ void h(Time time, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeLongElement(serialDescriptor, 0, time.f124835a);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || time.f124836b != time.f124835a * ((long) 1000)) {
            eVar.encodeLongElement(serialDescriptor, 1, time.f124836b);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 2) && time.f124837c == time.f124835a / ((long) 1000)) {
            return;
        }
        eVar.encodeLongElement(serialDescriptor, 2, time.f124837c);
    }

    public final long a() {
        return this.f124835a;
    }

    @NotNull
    public final Time b(long j10) {
        return new Time(j10);
    }

    public final long d() {
        return this.f124835a;
    }

    public final long e() {
        return this.f124837c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Time) && this.f124835a == ((Time) obj).f124835a;
    }

    public final long f() {
        return this.f124836b;
    }

    public final long g(@NotNull Time time) {
        Intrinsics.checkNotNullParameter(time, "time");
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.e.n0(this.f124835a - time.f124835a, kotlin.time.f.MILLISECONDS);
    }

    public int hashCode() {
        return Long.hashCode(this.f124835a);
    }

    @NotNull
    public String toString() {
        return "Time(ms=" + this.f124835a + ')';
    }

    public Time(long j10) {
        this.f124835a = j10;
        long j11 = 1000;
        this.f124836b = j10 * j11;
        this.f124837c = j10 / j11;
    }
}

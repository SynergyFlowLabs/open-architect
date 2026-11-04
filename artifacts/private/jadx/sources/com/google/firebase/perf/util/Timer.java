package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f124186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f124187b;

    class a implements Parcelable.Creator<Timer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i10) {
            return new Timer[i10];
        }
    }

    /* synthetic */ Timer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer g(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new Timer(i() + (micros - a()), micros);
    }

    private static long i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f124186a + c();
    }

    public long c() {
        return e(new Timer());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(@NonNull Timer timer) {
        return timer.f124187b - this.f124187b;
    }

    public long f() {
        return this.f124186a;
    }

    public void h() {
        this.f124186a = i();
        this.f124187b = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f124186a);
        parcel.writeLong(this.f124187b);
    }

    public Timer() {
        this(i(), a());
    }

    @l1
    Timer(long j10, long j11) {
        this.f124186a = j10;
        this.f124187b = j11;
    }

    @l1
    public Timer(long j10) {
        this(j10, j10);
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}

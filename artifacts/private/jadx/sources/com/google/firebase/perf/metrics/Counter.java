package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f123995b;

    class a implements Parcelable.Creator<Counter> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i10) {
            return new Counter[i10];
        }
    }

    /* synthetic */ Counter(Parcel parcel, a aVar) {
        this(parcel);
    }

    long a() {
        return this.f123995b.get();
    }

    @NonNull
    String b() {
        return this.f123994a;
    }

    public void c(long j10) {
        this.f123995b.addAndGet(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    void e(long j10) {
        this.f123995b.set(j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f123994a);
        parcel.writeLong(this.f123995b.get());
    }

    public Counter(@NonNull String str) {
        this.f123994a = str;
        this.f123995b = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.f123994a = parcel.readString();
        this.f123995b = new AtomicLong(parcel.readLong());
    }
}

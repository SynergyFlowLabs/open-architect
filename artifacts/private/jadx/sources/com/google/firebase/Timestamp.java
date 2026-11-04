package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.w0;
import java.time.Instant;
import java.util.Date;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f120418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f120416c = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new a();

    public static final class a implements Parcelable.Creator<Timestamp> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timestamp createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp[] newArray(int i10) {
            return new Timestamp[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> d(Date date) {
            long j10 = 1000;
            long time = date.getTime() / j10;
            int time2 = (int) ((date.getTime() % j10) * ((long) 1000000));
            return time2 < 0 ? TuplesKt.to(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : TuplesKt.to(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(long j10, int i10) {
            if (i10 < 0 || i10 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i10).toString());
            }
            if (-62135596800L > j10 || j10 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j10).toString());
            }
        }

        @oj.n
        @NotNull
        public final Timestamp c() {
            return new Timestamp(new Date());
        }

        private b() {
        }
    }

    public Timestamp(long j10, int i10) {
        f120416c.e(j10, i10);
        this.f120417a = j10;
        this.f120418b = i10;
    }

    @oj.n
    @NotNull
    public static final Timestamp n() {
        return f120416c.c();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Timestamp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.comparisons.a.o(this, other, new e1() { // from class: com.google.firebase.Timestamp.c
            @Override // kotlin.jvm.internal.e1, kotlin.reflect.q
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).l());
            }
        }, new e1() { // from class: com.google.firebase.Timestamp.d
            @Override // kotlin.jvm.internal.e1, kotlin.reflect.q
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).k());
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public int hashCode() {
        long j10 = this.f120417a;
        return (((((int) j10) * 1369) + ((int) (j10 >> 32))) * 37) + this.f120418b;
    }

    public final int k() {
        return this.f120418b;
    }

    public final long l() {
        return this.f120417a;
    }

    @NotNull
    public final Date o() {
        return new Date((this.f120417a * ((long) 1000)) + ((long) (this.f120418b / 1000000)));
    }

    @w0(26)
    @NotNull
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.f120417a, this.f120418b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @NotNull
    public String toString() {
        return "Timestamp(seconds=" + this.f120417a + ", nanoseconds=" + this.f120418b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f120417a);
        dest.writeInt(this.f120418b);
    }

    public Timestamp(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        b bVar = f120416c;
        Pair pairD = bVar.d(date);
        long jLongValue = ((Number) pairD.component1()).longValue();
        int iIntValue = ((Number) pairD.component2()).intValue();
        bVar.e(jLongValue, iIntValue);
        this.f120417a = jLongValue;
        this.f120418b = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w0(26)
    public Timestamp(@NotNull Instant time) {
        this(time.getEpochSecond(), time.getNano());
        Intrinsics.checkNotNullParameter(time, "time");
    }
}

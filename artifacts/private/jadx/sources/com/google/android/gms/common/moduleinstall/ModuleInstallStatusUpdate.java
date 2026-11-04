package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 1)
    private final int f106732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @SafeParcelable.c(getter = "getInstallState", id = 2)
    private final int f106733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBytesDownloaded", id = 3)
    @p0
    private final Long f106734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTotalBytesToDownload", id = 4)
    @p0
    private final Long f106735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorCode", id = 5)
    private final int f106736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final b f106737f;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public static final int f106738g1 = 0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public static final int f106739h1 = 1;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public static final int f106740i1 = 2;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public static final int f106741j1 = 3;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public static final int f106742k1 = 4;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public static final int f106743l1 = 5;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public static final int f106744m1 = 6;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public static final int f106745n1 = 7;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f106746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f106747b;

        b(long j10, long j11) {
            w.v(j11);
            this.f106746a = j10;
            this.f106747b = j11;
        }

        public long a() {
            return this.f106746a;
        }

        public long b() {
            return this.f106747b;
        }
    }

    @SafeParcelable.b
    @g6.a
    public ModuleInstallStatusUpdate(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @a int i11, @SafeParcelable.e(id = 3) @p0 Long l10, @SafeParcelable.e(id = 4) @p0 Long l11, @SafeParcelable.e(id = 5) int i12) {
        this.f106732a = i10;
        this.f106733b = i11;
        this.f106734c = l10;
        this.f106735d = l11;
        this.f106736e = i12;
        this.f106737f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new b(l10.longValue(), l11.longValue());
    }

    public int O1() {
        return this.f106736e;
    }

    @a
    public int T1() {
        return this.f106733b;
    }

    @p0
    public b b2() {
        return this.f106737f;
    }

    public int e2() {
        return this.f106732a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, e2());
        i6.b.F(parcel, 2, T1());
        i6.b.N(parcel, 3, this.f106734c, false);
        i6.b.N(parcel, 4, this.f106735d, false);
        i6.b.F(parcel, 5, O1());
        i6.b.b(parcel, iA);
    }
}

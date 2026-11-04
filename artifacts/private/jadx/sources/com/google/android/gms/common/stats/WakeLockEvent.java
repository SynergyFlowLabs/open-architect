package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fj.h;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "WakeLockEventCreator")
@g6.a
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeMillis", id = 2)
    private final long f106887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEventType", id = 11)
    private final int f106888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWakeLockName", id = 4)
    private final String f106889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSecondaryWakeLockName", id = 10)
    private final String f106890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCodePackage", id = 17)
    private final String f106891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWakeLockType", id = 5)
    private final int f106892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @h
    @SafeParcelable.c(getter = "getCallingPackages", id = 6)
    private final List f106893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEventKey", id = 12)
    private final String f106894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getElapsedRealtime", id = 8)
    private final long f106895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDeviceState", id = 14)
    private final int f106896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHostPackage", id = 13)
    private final String f106897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBeginPowerPercentage", id = 15)
    private final float f106898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeout", id = 16)
    private final long f106899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean f106900o;

    @SafeParcelable.b
    WakeLockEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 11) int i11, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) int i12, @SafeParcelable.e(id = 6) @h List list, @SafeParcelable.e(id = 12) String str2, @SafeParcelable.e(id = 8) long j11, @SafeParcelable.e(id = 14) int i13, @SafeParcelable.e(id = 10) String str3, @SafeParcelable.e(id = 13) String str4, @SafeParcelable.e(id = 15) float f10, @SafeParcelable.e(id = 16) long j12, @SafeParcelable.e(id = 17) String str5, @SafeParcelable.e(id = 18) boolean z10) {
        this.f106886a = i10;
        this.f106887b = j10;
        this.f106888c = i11;
        this.f106889d = str;
        this.f106890e = str3;
        this.f106891f = str5;
        this.f106892g = i12;
        this.f106893h = list;
        this.f106894i = str2;
        this.f106895j = j11;
        this.f106896k = i13;
        this.f106897l = str4;
        this.f106898m = f10;
        this.f106899n = j12;
        this.f106900o = z10;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int O1() {
        return this.f106888c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long T1() {
        return this.f106887b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String b2() {
        List list = this.f106893h;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i10 = this.f106896k;
        String str = this.f106890e;
        String str2 = this.f106897l;
        float f10 = this.f106898m;
        String str3 = this.f106891f;
        int i11 = this.f106892g;
        String str4 = this.f106889d;
        boolean z10 = this.f106900o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\t");
        sb2.append(str4);
        sb2.append("\t");
        sb2.append(i11);
        sb2.append("\t");
        sb2.append(strJoin);
        sb2.append("\t");
        sb2.append(i10);
        sb2.append("\t");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(f10);
        sb2.append("\t");
        sb2.append(str3 != null ? str3 : "");
        sb2.append("\t");
        sb2.append(z10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        int i11 = 1 << 1;
        i6.b.F(parcel, 1, this.f106886a);
        i6.b.K(parcel, 2, this.f106887b);
        i6.b.Y(parcel, 4, this.f106889d, false);
        i6.b.F(parcel, 5, this.f106892g);
        i6.b.a0(parcel, 6, this.f106893h, false);
        i6.b.K(parcel, 8, this.f106895j);
        i6.b.Y(parcel, 10, this.f106890e, false);
        i6.b.F(parcel, 11, this.f106888c);
        i6.b.Y(parcel, 12, this.f106894i, false);
        i6.b.Y(parcel, 13, this.f106897l, false);
        i6.b.F(parcel, 14, this.f106896k);
        i6.b.w(parcel, 15, this.f106898m);
        i6.b.K(parcel, 16, this.f106899n);
        i6.b.Y(parcel, 17, this.f106891f, false);
        i6.b.g(parcel, 18, this.f106900o);
        i6.b.b(parcel, iA);
    }
}

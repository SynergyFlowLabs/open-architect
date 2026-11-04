package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ParcelableGeofenceCreator")
@SafeParcelable.g({1000})
public final class zzek extends AbstractSafeParcelable implements com.google.android.gms.location.h {
    public static final Parcelable.Creator<zzek> CREATOR = new l3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestId", id = 1)
    private final String f108248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExpirationTime", id = 2)
    private final long f108249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getType", id = 3)
    private final short f108250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLatitude", id = 4)
    private final double f108251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLongitude", id = 5)
    private final double f108252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRadius", id = 6)
    private final float f108253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransitionTypes", id = 7)
    private final int f108254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getNotificationResponsiveness", id = 8)
    private final int f108255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = CreateTicketViewModelKt.EmailId, getter = "getLoiteringDelay", id = 9)
    private final int f108256i;

    @SafeParcelable.b
    public zzek(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 7) int i10, @SafeParcelable.e(id = 3) short s10, @SafeParcelable.e(id = 4) double d10, @SafeParcelable.e(id = 5) double d11, @SafeParcelable.e(id = 6) float f10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 8) int i11, @SafeParcelable.e(id = 9) int i12) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f10 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb2.append("invalid radius: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d10 > 90.0d || d10 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb3.append("invalid latitude: ");
            sb3.append(d10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb4.append("invalid longitude: ");
            sb4.append(d11);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 35);
            sb5.append("No supported transition specified: ");
            sb5.append(i10);
            throw new IllegalArgumentException(sb5.toString());
        }
        this.f108250c = s10;
        this.f108248a = str;
        this.f108251d = d10;
        this.f108252e = d11;
        this.f108253f = f10;
        this.f108249b = j10;
        this.f108254g = i13;
        this.f108255h = i11;
        this.f108256i = i12;
    }

    @Override // com.google.android.gms.location.h
    public final double A5() {
        return this.f108251d;
    }

    @Override // com.google.android.gms.location.h
    public final int A6() {
        return this.f108255h;
    }

    @Override // com.google.android.gms.location.h
    public final long D6() {
        return this.f108249b;
    }

    @Override // com.google.android.gms.location.h
    public final float R() {
        return this.f108253f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.f108253f == zzekVar.f108253f && this.f108251d == zzekVar.f108251d && this.f108252e == zzekVar.f108252e && this.f108250c == zzekVar.f108250c && this.f108254g == zzekVar.f108254g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f108251d);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f108252e);
        return ((((((((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f108253f)) * 31) + this.f108250c) * 31) + this.f108254g;
    }

    public final String toString() {
        String str;
        short s10 = this.f108250c;
        Locale locale = Locale.US;
        if (s10 != -1) {
            str = s10 != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.f108248a.replaceAll("\\p{C}", com.planner5d.library.model.payments.a.f222474i), Integer.valueOf(this.f108254g), Double.valueOf(this.f108251d), Double.valueOf(this.f108252e), Float.valueOf(this.f108253f), Integer.valueOf(this.f108255h / 1000), Integer.valueOf(this.f108256i), Long.valueOf(this.f108249b));
    }

    @Override // com.google.android.gms.location.h
    public final String w2() {
        return this.f108248a;
    }

    @Override // com.google.android.gms.location.h
    public final double w6() {
        return this.f108252e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f108248a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, str, false);
        i6.b.K(parcel, 2, this.f108249b);
        i6.b.U(parcel, 3, this.f108250c);
        i6.b.r(parcel, 4, this.f108251d);
        i6.b.r(parcel, 5, this.f108252e);
        i6.b.w(parcel, 6, this.f108253f);
        i6.b.F(parcel, 7, this.f108254g);
        i6.b.F(parcel, 8, this.f108255h);
        i6.b.F(parcel, 9, this.f108256i);
        i6.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.location.h
    public final int x6() {
        return this.f108254g;
    }

    @Override // com.google.android.gms.location.h
    public final int y6() {
        return this.f108256i;
    }
}

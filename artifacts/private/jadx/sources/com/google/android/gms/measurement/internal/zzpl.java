package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "UserAttributeParcelCreator")
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new we();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final int f110874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    public final String f110875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final long f110876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    @androidx.annotation.p0
    public final Long f110877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 6)
    @androidx.annotation.p0
    public final String f110878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 7)
    public final String f110879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    public final Double f110880g;

    @SafeParcelable.b
    zzpl(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 4) @androidx.annotation.p0 Long l10, @SafeParcelable.e(id = 5) Float f10, @SafeParcelable.e(id = 6) @androidx.annotation.p0 String str2, @SafeParcelable.e(id = 7) String str3, @SafeParcelable.e(id = 8) @androidx.annotation.p0 Double d10) {
        this.f110874a = i10;
        this.f110875b = str;
        this.f110876c = j10;
        this.f110877d = l10;
        this.f110880g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f110878e = str2;
        this.f110879f = str3;
    }

    @androidx.annotation.p0
    public final Object O1() {
        Long l10 = this.f110877d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f110880g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f110878e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        we.a(this, parcel, i10);
    }

    zzpl(xe xeVar) {
        this(xeVar.f110703c, xeVar.f110704d, xeVar.f110705e, xeVar.f110702b);
    }

    zzpl(String str, long j10, @androidx.annotation.p0 Object obj, String str2) {
        com.google.android.gms.common.internal.w.l(str);
        this.f110874a = 2;
        this.f110875b = str;
        this.f110876c = j10;
        this.f110879f = str2;
        if (obj == null) {
            this.f110877d = null;
            this.f110880g = null;
            this.f110878e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f110877d = (Long) obj;
            this.f110880g = null;
            this.f110878e = null;
        } else if (obj instanceof String) {
            this.f110877d = null;
            this.f110880g = null;
            this.f110878e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f110877d = null;
                this.f110880g = (Double) obj;
                this.f110878e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

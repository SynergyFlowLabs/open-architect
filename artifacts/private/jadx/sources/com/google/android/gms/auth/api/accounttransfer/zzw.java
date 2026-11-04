package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorTransferInfoCreator")
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f105139h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.d
    final Set f105140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccountType", id = 2)
    private String f105142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatus", id = 3)
    private int f105143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransferBytes", id = 4)
    private byte[] f105144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 5)
    private PendingIntent f105145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDeviceMetaData", id = 6)
    private DeviceMetaData f105146g;

    static {
        HashMap map = new HashMap();
        f105139h = map;
        map.put("accountType", FastJsonResponse.Field.s2("accountType", 2));
        map.put("status", FastJsonResponse.Field.p2("status", 3));
        int i10 = 1 & 4;
        map.put("transferBytes", FastJsonResponse.Field.O1("transferBytes", 4));
    }

    public zzw() {
        this.f105140a = new androidx.collection.c(3);
        this.f105141b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map c() {
        return f105139h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object e(FastJsonResponse.Field field) {
        int iB2 = field.B2();
        if (iB2 == 1) {
            return Integer.valueOf(this.f105141b);
        }
        if (iB2 == 2) {
            return this.f105142c;
        }
        if (iB2 == 3) {
            return Integer.valueOf(this.f105143d);
        }
        if (iB2 == 4) {
            return this.f105144e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.B2());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean g(FastJsonResponse.Field field) {
        return this.f105140a.contains(Integer.valueOf(field.B2()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void j(FastJsonResponse.Field field, String str, byte[] bArr) {
        int iB2 = field.B2();
        if (iB2 == 4) {
            this.f105144e = bArr;
            this.f105140a.add(Integer.valueOf(iB2));
        } else {
            throw new IllegalArgumentException("Field with id=" + iB2 + " is not known to be a byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void k(FastJsonResponse.Field field, String str, int i10) {
        int iB2 = field.B2();
        if (iB2 == 3) {
            this.f105143d = i10;
            this.f105140a.add(Integer.valueOf(iB2));
        } else {
            throw new IllegalArgumentException("Field with id=" + iB2 + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void m(FastJsonResponse.Field field, String str, String str2) {
        int iB2 = field.B2();
        if (iB2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iB2)));
        }
        this.f105142c = str2;
        this.f105140a.add(Integer.valueOf(iB2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        Set set = this.f105140a;
        if (set.contains(1)) {
            i6.b.F(parcel, 1, this.f105141b);
        }
        if (set.contains(2)) {
            i6.b.Y(parcel, 2, this.f105142c, true);
        }
        if (set.contains(3)) {
            i6.b.F(parcel, 3, this.f105143d);
        }
        if (set.contains(4)) {
            i6.b.m(parcel, 4, this.f105144e, true);
        }
        if (set.contains(5)) {
            i6.b.S(parcel, 5, this.f105145f, i10, true);
        }
        if (set.contains(6)) {
            i6.b.S(parcel, 6, this.f105146g, i10, true);
        }
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzw(@SafeParcelable.d Set set, @SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) byte[] bArr, @SafeParcelable.e(id = 5) PendingIntent pendingIntent, @SafeParcelable.e(id = 6) DeviceMetaData deviceMetaData) {
        this.f105140a = set;
        this.f105141b = i10;
        this.f105142c = str;
        this.f105143d = i11;
        this.f105144e = bArr;
        this.f105145f = pendingIntent;
        this.f105146g = deviceMetaData;
    }
}

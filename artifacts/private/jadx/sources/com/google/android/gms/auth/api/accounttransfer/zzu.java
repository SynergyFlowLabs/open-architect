package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthenticatorAnnotatedDataCreator")
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap f105132g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.d
    final Set f105133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getInfo", id = 2)
    private zzw f105135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignature", id = 3)
    private String f105136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPackageName", id = 4)
    private String f105137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getId", id = 5)
    private String f105138f;

    static {
        HashMap map = new HashMap();
        f105132g = map;
        map.put("authenticatorInfo", FastJsonResponse.Field.b2("authenticatorInfo", 2, zzw.class));
        map.put("signature", FastJsonResponse.Field.s2("signature", 3));
        map.put(io.sentry.protocol.z.b.f306542i, FastJsonResponse.Field.s2(io.sentry.protocol.z.b.f306542i, 4));
    }

    public zzu() {
        this.f105133a = new HashSet(3);
        this.f105134b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void b(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int iB2 = field.B2();
        if (iB2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iB2), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f105135c = (zzw) fastJsonResponse;
        this.f105133a.add(Integer.valueOf(iB2));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map c() {
        return f105132g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object e(FastJsonResponse.Field field) {
        int iB2 = field.B2();
        if (iB2 == 1) {
            return Integer.valueOf(this.f105134b);
        }
        if (iB2 == 2) {
            return this.f105135c;
        }
        if (iB2 == 3) {
            return this.f105136d;
        }
        if (iB2 == 4) {
            return this.f105137e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.B2());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean g(FastJsonResponse.Field field) {
        return this.f105133a.contains(Integer.valueOf(field.B2()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void m(FastJsonResponse.Field field, String str, String str2) {
        int iB2 = field.B2();
        if (iB2 == 3) {
            this.f105136d = str2;
        } else {
            if (iB2 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iB2)));
            }
            this.f105137e = str2;
        }
        this.f105133a.add(Integer.valueOf(iB2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        Set set = this.f105133a;
        if (set.contains(1)) {
            i6.b.F(parcel, 1, this.f105134b);
        }
        if (set.contains(2)) {
            i6.b.S(parcel, 2, this.f105135c, i10, true);
        }
        if (set.contains(3)) {
            i6.b.Y(parcel, 3, this.f105136d, true);
        }
        if (set.contains(4)) {
            i6.b.Y(parcel, 4, this.f105137e, true);
        }
        if (set.contains(5)) {
            i6.b.Y(parcel, 5, this.f105138f, true);
        }
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzu(@SafeParcelable.d Set set, @SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) zzw zzwVar, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) String str2, @SafeParcelable.e(id = 5) String str3) {
        this.f105133a = set;
        this.f105134b = i10;
        this.f105135c = zzwVar;
        this.f105136d = str;
        this.f105137e = str2;
        this.f105138f = str3;
    }
}

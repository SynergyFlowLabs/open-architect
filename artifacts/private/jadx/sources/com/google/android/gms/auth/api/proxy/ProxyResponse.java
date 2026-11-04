package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ProxyResponseCreator")
@g6.c
@a0
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105589g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final int f105590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 2)
    public final PendingIntent f105591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final int f105592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 5)
    public final byte[] f105593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.h(id = 1000)
    final int f105594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    final Bundle f105595f;

    @SafeParcelable.b
    ProxyResponse(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) int i11, @SafeParcelable.e(id = 2) PendingIntent pendingIntent, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) Bundle bundle, @SafeParcelable.e(id = 5) byte[] bArr) {
        this.f105594e = i10;
        this.f105590a = i11;
        this.f105592c = i12;
        this.f105595f = bundle;
        this.f105593d = bArr;
        this.f105591b = pendingIntent;
    }

    @NonNull
    public static ProxyResponse O1(int i10, @NonNull PendingIntent pendingIntent, int i11, @NonNull Map<String, String> map, @NonNull byte[] bArr) {
        return new ProxyResponse(1, i10, pendingIntent, i11, b2(map), bArr);
    }

    private static Bundle b2(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    @NonNull
    public Map<String, String> T1() {
        if (this.f105595f == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (String str : this.f105595f.keySet()) {
            map.put(str, this.f105595f.getString(str));
        }
        return map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105590a);
        i6.b.S(parcel, 2, this.f105591b, i10, false);
        i6.b.F(parcel, 3, this.f105592c);
        i6.b.k(parcel, 4, this.f105595f, false);
        i6.b.m(parcel, 5, this.f105593d, false);
        i6.b.F(parcel, 1000, this.f105594e);
        i6.b.b(parcel, iA);
    }

    public ProxyResponse(int i10, @NonNull PendingIntent pendingIntent, int i11, @NonNull Bundle bundle, @NonNull byte[] bArr) {
        this(1, i10, pendingIntent, i11, bundle, bArr);
    }

    public ProxyResponse(int i10, @NonNull Map<String, String> map, @NonNull byte[] bArr) {
        this(1, 0, null, i10, b2(map), bArr);
    }
}

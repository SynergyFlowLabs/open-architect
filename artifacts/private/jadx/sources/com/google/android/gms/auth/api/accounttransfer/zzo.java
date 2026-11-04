package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AccountTransferMsgCreator")
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f105119f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.d
    final Set f105120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList f105122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestType", id = 3)
    private int f105123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProgress", id = 4)
    private zzs f105124e;

    static {
        HashMap map = new HashMap();
        f105119f = map;
        map.put("authenticatorData", FastJsonResponse.Field.e2("authenticatorData", 2, zzu.class));
        map.put("progress", FastJsonResponse.Field.b2("progress", 4, zzs.class));
    }

    public zzo() {
        this.f105120a = new HashSet(1);
        this.f105121b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void a(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int iB2 = field.B2();
        if (iB2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(iB2), arrayList.getClass().getCanonicalName()));
        }
        this.f105122c = arrayList;
        this.f105120a.add(Integer.valueOf(iB2));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void b(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int iB2 = field.B2();
        if (iB2 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iB2), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f105124e = (zzs) fastJsonResponse;
        this.f105120a.add(Integer.valueOf(iB2));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map c() {
        return f105119f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object e(FastJsonResponse.Field field) {
        int iB2 = field.B2();
        if (iB2 == 1) {
            return Integer.valueOf(this.f105121b);
        }
        if (iB2 == 2) {
            return this.f105122c;
        }
        int i10 = 7 >> 4;
        if (iB2 == 4) {
            return this.f105124e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.B2());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean g(FastJsonResponse.Field field) {
        return this.f105120a.contains(Integer.valueOf(field.B2()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        Set set = this.f105120a;
        if (set.contains(1)) {
            i6.b.F(parcel, 1, this.f105121b);
        }
        if (set.contains(2)) {
            i6.b.d0(parcel, 2, this.f105122c, true);
        }
        if (set.contains(3)) {
            i6.b.F(parcel, 3, this.f105123d);
        }
        if (set.contains(4)) {
            i6.b.S(parcel, 4, this.f105124e, i10, true);
        }
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzo(@SafeParcelable.d Set set, @SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) zzs zzsVar) {
        this.f105120a = set;
        this.f105121b = i10;
        this.f105122c = arrayList;
        this.f105123d = i11;
        this.f105124e = zzsVar;
    }
}

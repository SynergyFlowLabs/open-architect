package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AccountTransferProgressCreator")
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.collection.a f105125g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisteredAccountTypes", id = 2)
    private List f105127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getInProgressAccountTypes", id = 3)
    private List f105128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSuccessAccountTypes", id = 4)
    private List f105129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFailedAccountTypes", id = 5)
    private List f105130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEscrowedAccountTypes", id = 6)
    private List f105131f;

    static {
        androidx.collection.a aVar = new androidx.collection.a();
        f105125g = aVar;
        aVar.put("registered", FastJsonResponse.Field.z2("registered", 2));
        aVar.put("in_progress", FastJsonResponse.Field.z2("in_progress", 3));
        aVar.put("success", FastJsonResponse.Field.z2("success", 4));
        aVar.put(MetricTracker.Action.FAILED, FastJsonResponse.Field.z2(MetricTracker.Action.FAILED, 5));
        aVar.put("escrowed", FastJsonResponse.Field.z2("escrowed", 6));
    }

    public zzs() {
        this.f105126a = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map c() {
        return f105125g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object e(FastJsonResponse.Field field) {
        switch (field.B2()) {
            case 1:
                return Integer.valueOf(this.f105126a);
            case 2:
                return this.f105127b;
            case 3:
                return this.f105128c;
            case 4:
                return this.f105129d;
            case 5:
                return this.f105130e;
            case 6:
                return this.f105131f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.B2());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean g(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void o(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int iB2 = field.B2();
        if (iB2 == 2) {
            this.f105127b = arrayList;
            return;
        }
        if (iB2 == 3) {
            this.f105128c = arrayList;
            return;
        }
        if (iB2 == 4) {
            this.f105129d = arrayList;
        } else if (iB2 == 5) {
            this.f105130e = arrayList;
        } else {
            if (iB2 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(iB2)));
            }
            this.f105131f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105126a);
        i6.b.a0(parcel, 2, this.f105127b, false);
        i6.b.a0(parcel, 3, this.f105128c, false);
        i6.b.a0(parcel, 4, this.f105129d, false);
        i6.b.a0(parcel, 5, this.f105130e, false);
        i6.b.a0(parcel, 6, this.f105131f, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    zzs(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @p0 List list, @SafeParcelable.e(id = 3) @p0 List list2, @SafeParcelable.e(id = 4) @p0 List list3, @SafeParcelable.e(id = 5) @p0 List list4, @SafeParcelable.e(id = 6) @p0 List list5) {
        this.f105126a = i10;
        this.f105127b = list;
        this.f105128c = list2;
        this.f105129d = list3;
        this.f105130e = list4;
        this.f105131f = list5;
    }
}

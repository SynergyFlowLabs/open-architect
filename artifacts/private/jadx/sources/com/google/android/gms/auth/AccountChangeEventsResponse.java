package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AccountChangeEventsResponseCreator")
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final List f105060b;

    @SafeParcelable.b
    AccountChangeEventsResponse(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) List list) {
        this.f105059a = i10;
        this.f105060b = (List) w.r(list);
    }

    @NonNull
    public List<AccountChangeEvent> O1() {
        return this.f105060b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105059a);
        i6.b.d0(parcel, 2, this.f105060b, false);
        i6.b.b(parcel, iA);
    }

    public AccountChangeEventsResponse(@NonNull List<AccountChangeEvent> list) {
        this.f105059a = 1;
        this.f105060b = (List) w.r(list);
    }
}

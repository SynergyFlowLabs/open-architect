package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FeatureCreator")
@g6.a
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getName", id = 1)
    private final String f105842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int f105843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = CreateTicketViewModelKt.EmailId, getter = "getVersion", id = 3)
    private final long f105844c;

    @SafeParcelable.b
    public Feature(@NonNull @SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) long j10) {
        this.f105842a = str;
        this.f105843b = i10;
        this.f105844c = j10;
    }

    @NonNull
    @g6.a
    public String O1() {
        return this.f105842a;
    }

    @g6.a
    public long T1() {
        long j10 = this.f105844c;
        return j10 == -1 ? this.f105843b : j10;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((O1() != null && O1().equals(feature.O1())) || (O1() == null && feature.O1() == null)) && T1() == feature.T1()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(O1(), Long.valueOf(T1()));
    }

    @NonNull
    public final String toString() {
        com.google.android.gms.common.internal.u.a aVarD = com.google.android.gms.common.internal.u.d(this);
        aVarD.a("name", O1());
        aVarD.a("version", Long.valueOf(T1()));
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, O1(), false);
        i6.b.F(parcel, 2, this.f105843b);
        i6.b.K(parcel, 3, T1());
        i6.b.b(parcel, iA);
    }

    @g6.a
    public Feature(@NonNull String str, long j10) {
        this.f105842a = str;
        this.f105844c = j10;
        this.f105843b = -1;
    }
}

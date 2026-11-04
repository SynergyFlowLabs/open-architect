package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GetPhoneNumberHintIntentRequestCreator")
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTheme", id = 1)
    private final int f105503a;

    public static final class a {
        private a() {
            throw null;
        }

        @NonNull
        public GetPhoneNumberHintIntentRequest a() {
            return new GetPhoneNumberHintIntentRequest(0);
        }

        /* synthetic */ a(k kVar) {
        }
    }

    @SafeParcelable.b
    GetPhoneNumberHintIntentRequest(@SafeParcelable.e(id = 1) int i10) {
        this.f105503a = i10;
    }

    @NonNull
    public static a O1() {
        return new a(null);
    }

    public boolean equals(@p0 Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return com.google.android.gms.common.internal.u.b(Integer.valueOf(this.f105503a), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f105503a));
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f105503a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f105503a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.b(parcel, iA);
    }
}

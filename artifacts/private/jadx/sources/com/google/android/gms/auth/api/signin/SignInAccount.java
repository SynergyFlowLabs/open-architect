package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInAccountCreator")
@SafeParcelable.g({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "", id = 4)
    @Deprecated
    final String f105644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleSignInAccount", id = 7)
    private final GoogleSignInAccount f105645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "", id = 8)
    @Deprecated
    final String f105646c;

    @SafeParcelable.b
    SignInAccount(@SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.e(id = 8) String str2) {
        this.f105645b = googleSignInAccount;
        this.f105644a = w.m(str, "8.3 and 8.4 SDKs require non-null email");
        this.f105646c = w.m(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @p0
    public final GoogleSignInAccount O1() {
        return this.f105645b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f105644a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 4, str, false);
        i6.b.S(parcel, 7, this.f105645b, i10, false);
        i6.b.Y(parcel, 8, this.f105646c, false);
        i6.b.b(parcel, iA);
    }
}

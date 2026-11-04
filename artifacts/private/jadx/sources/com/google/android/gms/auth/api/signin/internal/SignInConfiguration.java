package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInConfigurationCreator")
@SafeParcelable.g({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConsumerPkgName", id = 2)
    private final String f105660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleConfig", id = 5)
    private final GoogleSignInOptions f105661b;

    @SafeParcelable.b
    public SignInConfiguration(@NonNull @SafeParcelable.e(id = 2) String str, @NonNull @SafeParcelable.e(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.f105660a = com.google.android.gms.common.internal.w.l(str);
        this.f105661b = googleSignInOptions;
    }

    @NonNull
    public final GoogleSignInOptions O1() {
        return this.f105661b;
    }

    public final boolean equals(@p0 Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f105660a.equals(signInConfiguration.f105660a)) {
            GoogleSignInOptions googleSignInOptions = this.f105661b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f105661b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f105661b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new a().a(this.f105660a).a(this.f105661b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f105660a;
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, str, false);
        i6.b.S(parcel, 5, this.f105661b, i10, false);
        i6.b.b(parcel, iA);
    }
}

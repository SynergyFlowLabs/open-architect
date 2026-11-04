package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthorizationResultCreator")
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServerAuthCode", id = 1)
    @p0
    private final String f105454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccessToken", id = 2)
    @p0
    private final String f105455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIdToken", id = 3)
    @p0
    private final String f105456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGrantedScopes", id = 4)
    private final List f105457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "toGoogleSignInAccount", id = 5)
    @p0
    private final GoogleSignInAccount f105458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 6)
    @p0
    private final PendingIntent f105459f;

    @SafeParcelable.b
    public AuthorizationResult(@SafeParcelable.e(id = 1) @p0 String str, @SafeParcelable.e(id = 2) @p0 String str2, @SafeParcelable.e(id = 3) @p0 String str3, @NonNull @SafeParcelable.e(id = 4) List<String> list, @SafeParcelable.e(id = 5) @p0 GoogleSignInAccount googleSignInAccount, @SafeParcelable.e(id = 6) @p0 PendingIntent pendingIntent) {
        this.f105454a = str;
        this.f105455b = str2;
        this.f105456c = str3;
        this.f105457d = (List) com.google.android.gms.common.internal.w.r(list);
        this.f105459f = pendingIntent;
        this.f105458e = googleSignInAccount;
    }

    @p0
    public String O1() {
        return this.f105455b;
    }

    @NonNull
    public List<String> T1() {
        return this.f105457d;
    }

    @p0
    public PendingIntent b2() {
        return this.f105459f;
    }

    @p0
    public String e2() {
        return this.f105454a;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return com.google.android.gms.common.internal.u.b(this.f105454a, authorizationResult.f105454a) && com.google.android.gms.common.internal.u.b(this.f105455b, authorizationResult.f105455b) && com.google.android.gms.common.internal.u.b(this.f105456c, authorizationResult.f105456c) && com.google.android.gms.common.internal.u.b(this.f105457d, authorizationResult.f105457d) && com.google.android.gms.common.internal.u.b(this.f105459f, authorizationResult.f105459f) && com.google.android.gms.common.internal.u.b(this.f105458e, authorizationResult.f105458e);
    }

    public boolean f2() {
        return this.f105459f != null;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105454a, this.f105455b, this.f105456c, this.f105457d, this.f105459f, this.f105458e);
    }

    @p0
    public GoogleSignInAccount n2() {
        return this.f105458e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, e2(), false);
        i6.b.Y(parcel, 2, O1(), false);
        i6.b.Y(parcel, 3, this.f105456c, false);
        i6.b.a0(parcel, 4, T1(), false);
        int i11 = 4 ^ 5;
        i6.b.S(parcel, 5, n2(), i10, false);
        i6.b.S(parcel, 6, b2(), i10, false);
        i6.b.b(parcel, iA);
    }
}

package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GetSignInIntentRequestCreator")
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServerClientId", id = 1)
    private final String f105504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHostedDomainFilter", id = 2)
    @p0
    private final String f105505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 3)
    @p0
    private final String f105506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getNonce", id = 4)
    @p0
    private final String f105507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "requestVerifiedPhoneNumber", id = 5)
    private final boolean f105508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTheme", id = 6)
    private final int f105509f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f105510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f105511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f105512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private String f105513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f105514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f105515f;

        @NonNull
        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f105510a, this.f105511b, this.f105512c, this.f105513d, this.f105514e, this.f105515f);
        }

        @NonNull
        public a b(@p0 String str) {
            this.f105511b = str;
            return this;
        }

        @NonNull
        public a c(@p0 String str) {
            this.f105513d = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a d(boolean z10) {
            this.f105514e = z10;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            com.google.android.gms.common.internal.w.r(str);
            this.f105510a = str;
            return this;
        }

        @NonNull
        public final a f(@p0 String str) {
            this.f105512c = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f105515f = i10;
            return this;
        }
    }

    @SafeParcelable.b
    GetSignInIntentRequest(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) @p0 String str2, @SafeParcelable.e(id = 3) @p0 String str3, @SafeParcelable.e(id = 4) @p0 String str4, @SafeParcelable.e(id = 5) boolean z10, @SafeParcelable.e(id = 6) int i10) {
        com.google.android.gms.common.internal.w.r(str);
        this.f105504a = str;
        this.f105505b = str2;
        this.f105506c = str3;
        this.f105507d = str4;
        this.f105508e = z10;
        this.f105509f = i10;
    }

    @NonNull
    public static a O1() {
        return new a();
    }

    @NonNull
    public static a n2(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.common.internal.w.r(getSignInIntentRequest);
        a aVarO1 = O1();
        aVarO1.e(getSignInIntentRequest.e2());
        aVarO1.c(getSignInIntentRequest.b2());
        aVarO1.b(getSignInIntentRequest.T1());
        aVarO1.d(getSignInIntentRequest.f105508e);
        aVarO1.g(getSignInIntentRequest.f105509f);
        String str = getSignInIntentRequest.f105506c;
        if (str != null) {
            aVarO1.f(str);
        }
        return aVarO1;
    }

    @p0
    public String T1() {
        return this.f105505b;
    }

    @p0
    public String b2() {
        return this.f105507d;
    }

    @NonNull
    public String e2() {
        return this.f105504a;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return com.google.android.gms.common.internal.u.b(this.f105504a, getSignInIntentRequest.f105504a) && com.google.android.gms.common.internal.u.b(this.f105507d, getSignInIntentRequest.f105507d) && com.google.android.gms.common.internal.u.b(this.f105505b, getSignInIntentRequest.f105505b) && com.google.android.gms.common.internal.u.b(Boolean.valueOf(this.f105508e), Boolean.valueOf(getSignInIntentRequest.f105508e)) && this.f105509f == getSignInIntentRequest.f105509f;
    }

    @Deprecated
    public boolean f2() {
        return this.f105508e;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105504a, this.f105505b, this.f105507d, Boolean.valueOf(this.f105508e), Integer.valueOf(this.f105509f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 1, e2(), false);
        i6.b.Y(parcel, 2, T1(), false);
        i6.b.Y(parcel, 3, this.f105506c, false);
        i6.b.Y(parcel, 4, b2(), false);
        i6.b.g(parcel, 5, f2());
        i6.b.F(parcel, 6, this.f105509f);
        i6.b.b(parcel, iA);
    }
}

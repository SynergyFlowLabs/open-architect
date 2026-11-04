package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "BeginSignInRequestCreator")
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions f105460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions f105461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 3)
    @p0
    private final String f105462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isAutoSelectEnabled", id = 4)
    private final boolean f105463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTheme", id = 5)
    private final int f105464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPasskeysRequestOptions", id = 6)
    private final PasskeysRequestOptions f105465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPasskeyJsonRequestOptions", id = 7)
    private final PasskeyJsonRequestOptions f105466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getPreferImmediatelyAvailableCredentials", id = 8)
    private final boolean f105467h;

    @Deprecated
    @SafeParcelable.a(creator = "GoogleIdTokenRequestOptionsCreator")
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new n();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SafeParcelable.c(getter = "isSupported", id = 1)
        private final boolean f105468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SafeParcelable.c(getter = "getServerClientId", id = 2)
        @p0
        private final String f105469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SafeParcelable.c(getter = "getNonce", id = 3)
        @p0
        private final String f105470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SafeParcelable.c(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean f105471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SafeParcelable.c(getter = "getLinkedServiceId", id = 5)
        @p0
        private final String f105472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @SafeParcelable.c(getter = "getIdTokenDepositionScopes", id = 6)
        @p0
        private final List f105473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @SafeParcelable.c(getter = "requestVerifiedPhoneNumber", id = 7)
        private final boolean f105474g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f105475a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @p0
            private String f105476b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @p0
            private String f105477c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f105478d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @p0
            private String f105479e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @p0
            private List f105480f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f105481g = false;

            @NonNull
            public a a(@NonNull String str, @p0 List<String> list) {
                this.f105479e = (String) com.google.android.gms.common.internal.w.s(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f105480f = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions b() {
                return new GoogleIdTokenRequestOptions(this.f105475a, this.f105476b, this.f105477c, this.f105478d, this.f105479e, this.f105480f, this.f105481g);
            }

            @NonNull
            public a c(boolean z10) {
                this.f105478d = z10;
                return this;
            }

            @NonNull
            public a d(@p0 String str) {
                this.f105477c = str;
                return this;
            }

            @NonNull
            @Deprecated
            public a e(boolean z10) {
                this.f105481g = z10;
                return this;
            }

            @NonNull
            public a f(@NonNull String str) {
                this.f105476b = com.google.android.gms.common.internal.w.l(str);
                return this;
            }

            @NonNull
            public a g(boolean z10) {
                this.f105475a = z10;
                return this;
            }
        }

        @SafeParcelable.b
        GoogleIdTokenRequestOptions(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) @p0 String str2, @SafeParcelable.e(id = 4) boolean z11, @SafeParcelable.e(id = 5) @p0 String str3, @SafeParcelable.e(id = 6) @p0 List list, @SafeParcelable.e(id = 7) boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            com.google.android.gms.common.internal.w.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f105468a = z10;
            if (z10) {
                com.google.android.gms.common.internal.w.s(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f105469b = str;
            this.f105470c = str2;
            this.f105471d = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f105473f = arrayList;
            this.f105472e = str3;
            this.f105474g = z12;
        }

        @NonNull
        public static a O1() {
            return new a();
        }

        public boolean T1() {
            return this.f105471d;
        }

        @p0
        public List<String> b2() {
            return this.f105473f;
        }

        @p0
        public String e2() {
            return this.f105472e;
        }

        public boolean equals(@p0 Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f105468a == googleIdTokenRequestOptions.f105468a && com.google.android.gms.common.internal.u.b(this.f105469b, googleIdTokenRequestOptions.f105469b) && com.google.android.gms.common.internal.u.b(this.f105470c, googleIdTokenRequestOptions.f105470c) && this.f105471d == googleIdTokenRequestOptions.f105471d && com.google.android.gms.common.internal.u.b(this.f105472e, googleIdTokenRequestOptions.f105472e) && com.google.android.gms.common.internal.u.b(this.f105473f, googleIdTokenRequestOptions.f105473f) && this.f105474g == googleIdTokenRequestOptions.f105474g;
        }

        @p0
        public String f2() {
            return this.f105470c;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f105468a), this.f105469b, this.f105470c, Boolean.valueOf(this.f105471d), this.f105472e, this.f105473f, Boolean.valueOf(this.f105474g));
        }

        @p0
        public String n2() {
            return this.f105469b;
        }

        public boolean p2() {
            return this.f105468a;
        }

        @Deprecated
        public boolean q2() {
            return this.f105474g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = i6.b.a(parcel);
            i6.b.g(parcel, 1, p2());
            i6.b.Y(parcel, 2, n2(), false);
            i6.b.Y(parcel, 3, f2(), false);
            i6.b.g(parcel, 4, T1());
            i6.b.Y(parcel, 5, e2(), false);
            i6.b.a0(parcel, 6, b2(), false);
            i6.b.g(parcel, 7, q2());
            i6.b.b(parcel, iA);
        }
    }

    @Deprecated
    @SafeParcelable.a(creator = "PasskeyJsonRequestOptionsCreator")
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new o();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SafeParcelable.c(getter = "isSupported", id = 1)
        private final boolean f105482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SafeParcelable.c(getter = "getRequestJson", id = 2)
        private final String f105483b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f105484a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f105485b;

            @NonNull
            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f105484a, this.f105485b);
            }

            @NonNull
            public a b(@NonNull String str) {
                this.f105485b = str;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f105484a = z10;
                return this;
            }
        }

        @SafeParcelable.b
        PasskeyJsonRequestOptions(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) String str) {
            if (z10) {
                com.google.android.gms.common.internal.w.r(str);
            }
            this.f105482a = z10;
            this.f105483b = str;
        }

        @NonNull
        public static a O1() {
            return new a();
        }

        @NonNull
        public String T1() {
            return this.f105483b;
        }

        public boolean b2() {
            return this.f105482a;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f105482a == passkeyJsonRequestOptions.f105482a && com.google.android.gms.common.internal.u.b(this.f105483b, passkeyJsonRequestOptions.f105483b);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f105482a), this.f105483b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = i6.b.a(parcel);
            i6.b.g(parcel, 1, b2());
            i6.b.Y(parcel, 2, T1(), false);
            i6.b.b(parcel, iA);
        }
    }

    @Deprecated
    @SafeParcelable.a(creator = "PasskeysRequestOptionsCreator")
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new p();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SafeParcelable.c(getter = "isSupported", id = 1)
        private final boolean f105486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SafeParcelable.c(getter = "getChallenge", id = 2)
        private final byte[] f105487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SafeParcelable.c(getter = "getRpId", id = 3)
        private final String f105488c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f105489a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f105490b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f105491c;

            @NonNull
            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f105489a, this.f105490b, this.f105491c);
            }

            @NonNull
            public a b(@NonNull byte[] bArr) {
                this.f105490b = bArr;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f105491c = str;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f105489a = z10;
                return this;
            }
        }

        @SafeParcelable.b
        PasskeysRequestOptions(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) byte[] bArr, @SafeParcelable.e(id = 3) String str) {
            if (z10) {
                com.google.android.gms.common.internal.w.r(bArr);
                com.google.android.gms.common.internal.w.r(str);
            }
            this.f105486a = z10;
            this.f105487b = bArr;
            this.f105488c = str;
        }

        @NonNull
        public static a O1() {
            return new a();
        }

        @NonNull
        public byte[] T1() {
            return this.f105487b;
        }

        @NonNull
        public String b2() {
            return this.f105488c;
        }

        public boolean e2() {
            return this.f105486a;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f105486a == passkeysRequestOptions.f105486a && Arrays.equals(this.f105487b, passkeysRequestOptions.f105487b) && Objects.equals(this.f105488c, passkeysRequestOptions.f105488c);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f105486a), this.f105488c) * 31) + Arrays.hashCode(this.f105487b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = i6.b.a(parcel);
            i6.b.g(parcel, 1, e2());
            i6.b.m(parcel, 2, T1(), false);
            int i11 = 5 ^ 3;
            i6.b.Y(parcel, 3, b2(), false);
            i6.b.b(parcel, iA);
        }
    }

    @Deprecated
    @SafeParcelable.a(creator = "PasswordRequestOptionsCreator")
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new q();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SafeParcelable.c(getter = "isSupported", id = 1)
        private final boolean f105492a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f105493a = false;

            @NonNull
            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f105493a);
            }

            @NonNull
            public a b(boolean z10) {
                this.f105493a = z10;
                return this;
            }
        }

        @SafeParcelable.b
        PasswordRequestOptions(@SafeParcelable.e(id = 1) boolean z10) {
            this.f105492a = z10;
        }

        @NonNull
        public static a O1() {
            return new a();
        }

        public boolean T1() {
            return this.f105492a;
        }

        public boolean equals(@p0 Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f105492a == ((PasswordRequestOptions) obj).f105492a;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.u.c(Boolean.valueOf(this.f105492a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = i6.b.a(parcel);
            i6.b.g(parcel, 1, T1());
            i6.b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PasswordRequestOptions f105494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GoogleIdTokenRequestOptions f105495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PasskeysRequestOptions f105496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private PasskeyJsonRequestOptions f105497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f105498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f105499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f105500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f105501h;

        public a() {
            PasswordRequestOptions.a aVarO1 = PasswordRequestOptions.O1();
            aVarO1.b(false);
            this.f105494a = aVarO1.a();
            GoogleIdTokenRequestOptions.a aVarO2 = GoogleIdTokenRequestOptions.O1();
            aVarO2.g(false);
            this.f105495b = aVarO2.b();
            PasskeysRequestOptions.a aVarO3 = PasskeysRequestOptions.O1();
            aVarO3.d(false);
            this.f105496c = aVarO3.a();
            PasskeyJsonRequestOptions.a aVarO4 = PasskeyJsonRequestOptions.O1();
            aVarO4.c(false);
            this.f105497d = aVarO4.a();
        }

        @NonNull
        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f105494a, this.f105495b, this.f105498e, this.f105499f, this.f105500g, this.f105496c, this.f105497d, this.f105501h);
        }

        @NonNull
        public a b(boolean z10) {
            this.f105499f = z10;
            return this;
        }

        @NonNull
        public a c(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f105495b = (GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.w.r(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public a d(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f105497d = (PasskeyJsonRequestOptions) com.google.android.gms.common.internal.w.r(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public a e(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.f105496c = (PasskeysRequestOptions) com.google.android.gms.common.internal.w.r(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public a f(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f105494a = (PasswordRequestOptions) com.google.android.gms.common.internal.w.r(passwordRequestOptions);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f105501h = z10;
            return this;
        }

        @NonNull
        public final a h(@NonNull String str) {
            this.f105498e = str;
            return this;
        }

        @NonNull
        public final a i(int i10) {
            this.f105500g = i10;
            return this;
        }
    }

    @SafeParcelable.b
    BeginSignInRequest(@SafeParcelable.e(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.e(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.e(id = 3) @p0 String str, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) int i10, @SafeParcelable.e(id = 6) @p0 PasskeysRequestOptions passkeysRequestOptions, @SafeParcelable.e(id = 7) @p0 PasskeyJsonRequestOptions passkeyJsonRequestOptions, @SafeParcelable.e(id = 8) boolean z11) {
        this.f105460a = (PasswordRequestOptions) com.google.android.gms.common.internal.w.r(passwordRequestOptions);
        this.f105461b = (GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.w.r(googleIdTokenRequestOptions);
        this.f105462c = str;
        this.f105463d = z10;
        this.f105464e = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a aVarO1 = PasskeysRequestOptions.O1();
            aVarO1.d(false);
            passkeysRequestOptions = aVarO1.a();
        }
        this.f105465f = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a aVarO2 = PasskeyJsonRequestOptions.O1();
            aVarO2.c(false);
            passkeyJsonRequestOptions = aVarO2.a();
        }
        this.f105466g = passkeyJsonRequestOptions;
        this.f105467h = z11;
    }

    @NonNull
    public static a O1() {
        return new a();
    }

    @NonNull
    public static a q2(@NonNull BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.w.r(beginSignInRequest);
        a aVarO1 = O1();
        aVarO1.c(beginSignInRequest.T1());
        aVarO1.f(beginSignInRequest.f2());
        aVarO1.e(beginSignInRequest.e2());
        aVarO1.d(beginSignInRequest.b2());
        aVarO1.b(beginSignInRequest.f105463d);
        aVarO1.i(beginSignInRequest.f105464e);
        aVarO1.g(beginSignInRequest.f105467h);
        String str = beginSignInRequest.f105462c;
        if (str != null) {
            aVarO1.h(str);
        }
        return aVarO1;
    }

    @NonNull
    public GoogleIdTokenRequestOptions T1() {
        return this.f105461b;
    }

    @NonNull
    public PasskeyJsonRequestOptions b2() {
        return this.f105466g;
    }

    @NonNull
    public PasskeysRequestOptions e2() {
        return this.f105465f;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return com.google.android.gms.common.internal.u.b(this.f105460a, beginSignInRequest.f105460a) && com.google.android.gms.common.internal.u.b(this.f105461b, beginSignInRequest.f105461b) && com.google.android.gms.common.internal.u.b(this.f105465f, beginSignInRequest.f105465f) && com.google.android.gms.common.internal.u.b(this.f105466g, beginSignInRequest.f105466g) && com.google.android.gms.common.internal.u.b(this.f105462c, beginSignInRequest.f105462c) && this.f105463d == beginSignInRequest.f105463d && this.f105464e == beginSignInRequest.f105464e && this.f105467h == beginSignInRequest.f105467h;
    }

    @NonNull
    public PasswordRequestOptions f2() {
        return this.f105460a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105460a, this.f105461b, this.f105465f, this.f105466g, this.f105462c, Boolean.valueOf(this.f105463d), Integer.valueOf(this.f105464e), Boolean.valueOf(this.f105467h));
    }

    public boolean n2() {
        return this.f105467h;
    }

    public boolean p2() {
        return this.f105463d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, f2(), i10, false);
        i6.b.S(parcel, 2, T1(), i10, false);
        i6.b.Y(parcel, 3, this.f105462c, false);
        i6.b.g(parcel, 4, p2());
        i6.b.F(parcel, 5, this.f105464e);
        int i11 = 0 << 6;
        i6.b.S(parcel, 6, e2(), i10, false);
        i6.b.S(parcel, 7, b2(), i10, false);
        i6.b.g(parcel, 8, n2());
        i6.b.b(parcel, iA);
    }
}

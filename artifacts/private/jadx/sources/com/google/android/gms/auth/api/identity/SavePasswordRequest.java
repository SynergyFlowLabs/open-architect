package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SavePasswordRequestCreator")
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignInPassword", id = 1)
    private final SignInPassword f105531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 2)
    @p0
    private final String f105532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTheme", id = 3)
    private final int f105533c;

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SignInPassword f105534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f105535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f105536c;

        @NonNull
        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f105534a, this.f105535b, this.f105536c);
        }

        @NonNull
        public a b(@NonNull SignInPassword signInPassword) {
            this.f105534a = signInPassword;
            return this;
        }

        @NonNull
        public final a c(@NonNull String str) {
            this.f105535b = str;
            return this;
        }

        @NonNull
        public final a d(int i10) {
            this.f105536c = i10;
            return this;
        }
    }

    @SafeParcelable.b
    SavePasswordRequest(@SafeParcelable.e(id = 1) SignInPassword signInPassword, @SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) int i10) {
        this.f105531a = (SignInPassword) com.google.android.gms.common.internal.w.r(signInPassword);
        this.f105532b = str;
        this.f105533c = i10;
    }

    @NonNull
    public static a O1() {
        return new a();
    }

    @NonNull
    public static a b2(@NonNull SavePasswordRequest savePasswordRequest) {
        com.google.android.gms.common.internal.w.r(savePasswordRequest);
        a aVarO1 = O1();
        aVarO1.b(savePasswordRequest.T1());
        aVarO1.d(savePasswordRequest.f105533c);
        String str = savePasswordRequest.f105532b;
        if (str != null) {
            aVarO1.c(str);
        }
        return aVarO1;
    }

    @NonNull
    public SignInPassword T1() {
        return this.f105531a;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!com.google.android.gms.common.internal.u.b(this.f105531a, savePasswordRequest.f105531a) || !com.google.android.gms.common.internal.u.b(this.f105532b, savePasswordRequest.f105532b) || this.f105533c != savePasswordRequest.f105533c) {
            return false;
        }
        int i10 = 1 << 1;
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105531a, this.f105532b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, T1(), i10, false);
        i6.b.Y(parcel, 2, this.f105532b, false);
        i6.b.F(parcel, 3, this.f105533c);
        i6.b.b(parcel, iA);
    }
}

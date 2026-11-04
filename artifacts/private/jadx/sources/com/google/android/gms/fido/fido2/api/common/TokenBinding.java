package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "TokenBindingCreator")
@SafeParcelable.g({1})
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f107242c = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final TokenBinding f107243d = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getTokenBindingStatusAsString", id = 2, type = "java.lang.String")
    private final TokenBindingStatus f107244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTokenBindingId", id = 3)
    @androidx.annotation.p0
    private final String f107245b;

    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new x();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f107250a;

        static {
            int i10 = 6 | 1;
        }

        TokenBindingStatus(String str) {
            this.f107250a = str;
        }

        @NonNull
        public static TokenBindingStatus b(@NonNull String str) throws a {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f107250a)) {
                    return tokenBindingStatus;
                }
            }
            throw new a(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f107250a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeString(this.f107250a);
        }
    }

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(@NonNull String str) {
        this(TokenBindingStatus.PRESENT.toString(), (String) com.google.android.gms.common.internal.w.r(str));
    }

    @androidx.annotation.p0
    public String O1() {
        return this.f107245b;
    }

    @NonNull
    public String T1() {
        return this.f107244a.toString();
    }

    @NonNull
    public JSONObject b2() throws JSONException {
        try {
            return new JSONObject().put("status", this.f107244a).put("id", this.f107245b);
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return com.google.android.gms.internal.fido.m.a(this.f107244a, tokenBinding.f107244a) && com.google.android.gms.internal.fido.m.a(this.f107245b, tokenBinding.f107245b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f107244a, this.f107245b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, T1(), false);
        i6.b.Y(parcel, 3, O1(), false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    TokenBinding(@NonNull @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) @androidx.annotation.p0 String str2) {
        com.google.android.gms.common.internal.w.r(str);
        try {
            this.f107244a = TokenBindingStatus.b(str);
            this.f107245b = str2;
        } catch (a e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignRequestParamsCreator")
@SafeParcelable.g({1})
@Deprecated
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f107415i = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestId", id = 2)
    private final Integer f107416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeoutSeconds", id = 3)
    @p0
    private final Double f107417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAppId", id = 4)
    private final Uri f107418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDefaultSignChallenge", id = 5)
    private final byte[] f107419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisteredKeys", id = 6)
    private final List f107420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getChannelIdValue", id = 7)
    private final ChannelIdValue f107421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDisplayHint", id = 8)
    private final String f107422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f107423h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Integer f107424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        Double f107425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Uri f107426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        byte[] f107427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        List f107428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ChannelIdValue f107429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f107430g;

        @NonNull
        public SignRequestParams a() {
            return new SignRequestParams(this.f107424a, this.f107425b, this.f107426c, this.f107427d, this.f107428e, this.f107429f, this.f107430g);
        }

        @NonNull
        public a b(@NonNull Uri uri) {
            this.f107426c = uri;
            return this;
        }

        @NonNull
        public a c(@NonNull ChannelIdValue channelIdValue) {
            this.f107429f = channelIdValue;
            return this;
        }

        @NonNull
        public a d(@NonNull byte[] bArr) {
            this.f107427d = bArr;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f107430g = str;
            return this;
        }

        @NonNull
        public a f(@NonNull List<RegisteredKey> list) {
            this.f107428e = list;
            return this;
        }

        @NonNull
        public a g(@NonNull Integer num) {
            this.f107424a = num;
            return this;
        }

        @NonNull
        public a h(@p0 Double d10) {
            this.f107425b = d10;
            return this;
        }
    }

    @SafeParcelable.b
    SignRequestParams(@SafeParcelable.e(id = 2) Integer num, @SafeParcelable.e(id = 3) @p0 Double d10, @SafeParcelable.e(id = 4) Uri uri, @SafeParcelable.e(id = 5) byte[] bArr, @SafeParcelable.e(id = 6) List list, @SafeParcelable.e(id = 7) ChannelIdValue channelIdValue, @SafeParcelable.e(id = 8) String str) {
        this.f107416a = num;
        this.f107417b = d10;
        this.f107418c = uri;
        this.f107419d = bArr;
        w.b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f107420e = list;
        this.f107421f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            w.b((registeredKey.O1() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            registeredKey.T1();
            w.b(true, "register request has null challenge and no default challenge isprovided");
            if (registeredKey.O1() != null) {
                hashSet.add(Uri.parse(registeredKey.O1()));
            }
        }
        this.f107423h = hashSet;
        w.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f107422g = str;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Set<Uri> O1() {
        return this.f107423h;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Uri T1() {
        return this.f107418c;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public ChannelIdValue b2() {
        return this.f107421f;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public String e2() {
        return this.f107422g;
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return u.b(this.f107416a, signRequestParams.f107416a) && u.b(this.f107417b, signRequestParams.f107417b) && u.b(this.f107418c, signRequestParams.f107418c) && Arrays.equals(this.f107419d, signRequestParams.f107419d) && this.f107420e.containsAll(signRequestParams.f107420e) && signRequestParams.f107420e.containsAll(this.f107420e) && u.b(this.f107421f, signRequestParams.f107421f) && u.b(this.f107422g, signRequestParams.f107422g);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public List<RegisteredKey> f2() {
        return this.f107420e;
    }

    public int hashCode() {
        return u.c(this.f107416a, this.f107418c, this.f107417b, this.f107420e, this.f107421f, this.f107422g, Integer.valueOf(Arrays.hashCode(this.f107419d)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Integer n2() {
        return this.f107416a;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @p0
    public Double p2() {
        return this.f107417b;
    }

    @NonNull
    public byte[] q2() {
        return this.f107419d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.I(parcel, 2, n2(), false);
        i6.b.u(parcel, 3, p2(), false);
        i6.b.S(parcel, 4, T1(), i10, false);
        i6.b.m(parcel, 5, q2(), false);
        i6.b.d0(parcel, 6, f2(), false);
        i6.b.S(parcel, 7, b2(), i10, false);
        i6.b.Y(parcel, 8, e2(), false);
        i6.b.b(parcel, iA);
    }
}

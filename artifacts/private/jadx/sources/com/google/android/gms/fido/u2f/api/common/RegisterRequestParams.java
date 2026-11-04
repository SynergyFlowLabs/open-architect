package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RegisterRequestParamsCreator")
@SafeParcelable.g({1})
@Deprecated
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f107393i = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestId", id = 2)
    private final Integer f107394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeoutSeconds", id = 3)
    private final Double f107395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAppId", id = 4)
    private final Uri f107396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisterRequests", id = 5)
    private final List f107397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisteredKeys", id = 6)
    private final List f107398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getChannelIdValue", id = 7)
    private final ChannelIdValue f107399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDisplayHint", id = 8)
    private final String f107400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set f107401h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Integer f107402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Double f107403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Uri f107404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f107405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        List f107406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ChannelIdValue f107407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f107408g;

        @NonNull
        public RegisterRequestParams a() {
            return new RegisterRequestParams(this.f107402a, this.f107403b, this.f107404c, this.f107405d, this.f107406e, this.f107407f, this.f107408g);
        }

        @NonNull
        public a b(@NonNull Uri uri) {
            this.f107404c = uri;
            return this;
        }

        @NonNull
        public a c(@NonNull ChannelIdValue channelIdValue) {
            this.f107407f = channelIdValue;
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            this.f107408g = str;
            return this;
        }

        @NonNull
        public a e(@NonNull List<RegisterRequest> list) {
            this.f107405d = list;
            return this;
        }

        @NonNull
        public a f(@NonNull List<RegisteredKey> list) {
            this.f107406e = list;
            return this;
        }

        @NonNull
        public a g(@NonNull Integer num) {
            this.f107402a = num;
            return this;
        }

        @NonNull
        public a h(@NonNull Double d10) {
            this.f107403b = d10;
            return this;
        }
    }

    @SafeParcelable.b
    RegisterRequestParams(@SafeParcelable.e(id = 2) Integer num, @SafeParcelable.e(id = 3) Double d10, @SafeParcelable.e(id = 4) Uri uri, @SafeParcelable.e(id = 5) List list, @SafeParcelable.e(id = 6) List list2, @SafeParcelable.e(id = 7) ChannelIdValue channelIdValue, @SafeParcelable.e(id = 8) String str) {
        this.f107394a = num;
        this.f107395b = d10;
        this.f107396c = uri;
        int i10 = 2 | 0;
        w.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f107397d = list;
        this.f107398e = list2;
        this.f107399f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            w.b((uri == null && registerRequest.O1() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (registerRequest.O1() != null) {
                hashSet.add(Uri.parse(registerRequest.O1()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            w.b((uri == null && registeredKey.O1() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (registeredKey.O1() != null) {
                hashSet.add(Uri.parse(registeredKey.O1()));
            }
        }
        this.f107401h = hashSet;
        w.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f107400g = str;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Set<Uri> O1() {
        return this.f107401h;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Uri T1() {
        return this.f107396c;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public ChannelIdValue b2() {
        return this.f107399f;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public String e2() {
        return this.f107400g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return u.b(this.f107394a, registerRequestParams.f107394a) && u.b(this.f107395b, registerRequestParams.f107395b) && u.b(this.f107396c, registerRequestParams.f107396c) && u.b(this.f107397d, registerRequestParams.f107397d) && (((list = this.f107398e) == null && registerRequestParams.f107398e == null) || (list != null && (list2 = registerRequestParams.f107398e) != null && list.containsAll(list2) && registerRequestParams.f107398e.containsAll(this.f107398e))) && u.b(this.f107399f, registerRequestParams.f107399f) && u.b(this.f107400g, registerRequestParams.f107400g);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public List<RegisteredKey> f2() {
        return this.f107398e;
    }

    public int hashCode() {
        return u.c(this.f107394a, this.f107396c, this.f107395b, this.f107397d, this.f107398e, this.f107399f, this.f107400g);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Integer n2() {
        return this.f107394a;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    @NonNull
    public Double p2() {
        return this.f107395b;
    }

    @NonNull
    public List<RegisterRequest> q2() {
        return this.f107397d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.I(parcel, 2, n2(), false);
        i6.b.u(parcel, 3, p2(), false);
        i6.b.S(parcel, 4, T1(), i10, false);
        i6.b.d0(parcel, 5, q2(), false);
        i6.b.d0(parcel, 6, f2(), false);
        i6.b.S(parcel, 7, b2(), i10, false);
        i6.b.Y(parcel, 8, e2(), false);
        i6.b.b(parcel, iA);
    }
}

package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SaveAccountLinkingTokenRequestCreator")
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final String f105516g = "auth_code";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f105517h = "extra_token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConsentPendingIntent", id = 1)
    private final PendingIntent f105518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTokenType", id = 2)
    private final String f105519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServiceId", id = 3)
    private final String f105520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopes", id = 4)
    private final List f105521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 5)
    @p0
    private final String f105522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTheme", id = 6)
    private final int f105523f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f105524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f105525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f105526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f105527d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f105528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f105529f;

        @NonNull
        public SaveAccountLinkingTokenRequest a() {
            com.google.android.gms.common.internal.w.b(this.f105524a != null, "Consent PendingIntent cannot be null");
            com.google.android.gms.common.internal.w.b(SaveAccountLinkingTokenRequest.f105516g.equals(this.f105525b), "Invalid tokenType");
            com.google.android.gms.common.internal.w.b(!TextUtils.isEmpty(this.f105526c), "serviceId cannot be null or empty");
            com.google.android.gms.common.internal.w.b(this.f105527d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f105524a, this.f105525b, this.f105526c, this.f105527d, this.f105528e, this.f105529f);
        }

        @NonNull
        public a b(@NonNull PendingIntent pendingIntent) {
            this.f105524a = pendingIntent;
            return this;
        }

        @NonNull
        public a c(@NonNull List<String> list) {
            this.f105527d = list;
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            this.f105526c = str;
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f105525b = str;
            return this;
        }

        @NonNull
        public final a f(@NonNull String str) {
            this.f105528e = str;
            return this;
        }

        @NonNull
        public final a g(int i10) {
            this.f105529f = i10;
            return this;
        }
    }

    @SafeParcelable.b
    SaveAccountLinkingTokenRequest(@SafeParcelable.e(id = 1) PendingIntent pendingIntent, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) String str2, @SafeParcelable.e(id = 4) List list, @SafeParcelable.e(id = 5) @p0 String str3, @SafeParcelable.e(id = 6) int i10) {
        this.f105518a = pendingIntent;
        this.f105519b = str;
        this.f105520c = str2;
        this.f105521d = list;
        this.f105522e = str3;
        this.f105523f = i10;
    }

    @NonNull
    public static a O1() {
        return new a();
    }

    @NonNull
    public static a n2(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        com.google.android.gms.common.internal.w.r(saveAccountLinkingTokenRequest);
        a aVarO1 = O1();
        aVarO1.c(saveAccountLinkingTokenRequest.b2());
        aVarO1.d(saveAccountLinkingTokenRequest.e2());
        aVarO1.b(saveAccountLinkingTokenRequest.T1());
        aVarO1.e(saveAccountLinkingTokenRequest.f2());
        aVarO1.g(saveAccountLinkingTokenRequest.f105523f);
        String str = saveAccountLinkingTokenRequest.f105522e;
        if (!TextUtils.isEmpty(str)) {
            aVarO1.f(str);
        }
        return aVarO1;
    }

    @NonNull
    public PendingIntent T1() {
        return this.f105518a;
    }

    @NonNull
    public List<String> b2() {
        return this.f105521d;
    }

    @NonNull
    public String e2() {
        return this.f105520c;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.f105521d.size() == saveAccountLinkingTokenRequest.f105521d.size() && this.f105521d.containsAll(saveAccountLinkingTokenRequest.f105521d) && com.google.android.gms.common.internal.u.b(this.f105518a, saveAccountLinkingTokenRequest.f105518a) && com.google.android.gms.common.internal.u.b(this.f105519b, saveAccountLinkingTokenRequest.f105519b) && com.google.android.gms.common.internal.u.b(this.f105520c, saveAccountLinkingTokenRequest.f105520c) && com.google.android.gms.common.internal.u.b(this.f105522e, saveAccountLinkingTokenRequest.f105522e) && this.f105523f == saveAccountLinkingTokenRequest.f105523f) {
            return true;
        }
        return false;
    }

    @NonNull
    public String f2() {
        return this.f105519b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105518a, this.f105519b, this.f105520c, this.f105521d, this.f105522e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, T1(), i10, false);
        i6.b.Y(parcel, 2, f2(), false);
        i6.b.Y(parcel, 3, e2(), false);
        i6.b.a0(parcel, 4, b2(), false);
        i6.b.Y(parcel, 5, this.f105522e, false);
        i6.b.F(parcel, 6, this.f105523f);
        i6.b.b(parcel, iA);
    }
}

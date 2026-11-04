package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "TokenDataCreator")
@a0
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getToken", id = 2)
    private final String f105062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExpirationTimeSecs", id = 3)
    @p0
    private final Long f105063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isCached", id = 4)
    private final boolean f105064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "isSnowballed", id = 5)
    private final boolean f105065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGrantedScopes", id = 6)
    @p0
    private final List f105066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopeData", id = 7)
    @p0
    private final String f105067g;

    @SafeParcelable.b
    TokenData(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) @p0 Long l10, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) boolean z11, @SafeParcelable.e(id = 6) @p0 List list, @SafeParcelable.e(id = 7) @p0 String str2) {
        this.f105061a = i10;
        this.f105062b = w.l(str);
        this.f105063c = l10;
        this.f105064d = z10;
        this.f105065e = z11;
        this.f105066f = list;
        this.f105067g = str2;
    }

    @NonNull
    public final String O1() {
        return this.f105062b;
    }

    public final boolean equals(@p0 Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f105062b, tokenData.f105062b) && u.b(this.f105063c, tokenData.f105063c) && this.f105064d == tokenData.f105064d && this.f105065e == tokenData.f105065e && u.b(this.f105066f, tokenData.f105066f) && u.b(this.f105067g, tokenData.f105067g);
    }

    public final int hashCode() {
        return u.c(this.f105062b, this.f105063c, Boolean.valueOf(this.f105064d), Boolean.valueOf(this.f105065e), this.f105066f, this.f105067g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105061a);
        boolean z10 = true & false;
        i6.b.Y(parcel, 2, this.f105062b, false);
        i6.b.N(parcel, 3, this.f105063c, false);
        i6.b.g(parcel, 4, this.f105064d);
        i6.b.g(parcel, 5, this.f105065e);
        i6.b.a0(parcel, 6, this.f105066f, false);
        i6.b.Y(parcel, 7, this.f105067g, false);
        i6.b.b(parcel, iA);
    }
}

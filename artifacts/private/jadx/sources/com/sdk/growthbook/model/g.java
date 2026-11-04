package com.sdk.growthbook.model;

import com.sdk.growthbook.serializable_model.SerializableGBExperimentResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f266321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f266322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q f266323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f266325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f266326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f266327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Float f266328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Boolean f266329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final Boolean f266330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f266331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Boolean f266332l;

    public g(boolean z10, int i10, @NotNull q value, @Nullable String str, @Nullable String str2, @NotNull String key, @Nullable String str3, @Nullable Float f10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f266321a = z10;
        this.f266322b = i10;
        this.f266323c = value;
        this.f266324d = str;
        this.f266325e = str2;
        this.f266326f = key;
        this.f266327g = str3;
        this.f266328h = f10;
        this.f266329i = bool;
        this.f266330j = bool2;
        this.f266331k = str4;
        this.f266332l = bool3;
    }

    public static /* synthetic */ g n(g gVar, boolean z10, int i10, q qVar, String str, String str2, String str3, String str4, Float f10, Boolean bool, Boolean bool2, String str5, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = gVar.f266321a;
        }
        if ((i11 & 2) != 0) {
            i10 = gVar.f266322b;
        }
        if ((i11 & 4) != 0) {
            qVar = gVar.f266323c;
        }
        if ((i11 & 8) != 0) {
            str = gVar.f266324d;
        }
        if ((i11 & 16) != 0) {
            str2 = gVar.f266325e;
        }
        if ((i11 & 32) != 0) {
            str3 = gVar.f266326f;
        }
        if ((i11 & 64) != 0) {
            str4 = gVar.f266327g;
        }
        if ((i11 & 128) != 0) {
            f10 = gVar.f266328h;
        }
        if ((i11 & 256) != 0) {
            bool = gVar.f266329i;
        }
        if ((i11 & 512) != 0) {
            bool2 = gVar.f266330j;
        }
        if ((i11 & 1024) != 0) {
            str5 = gVar.f266331k;
        }
        if ((i11 & 2048) != 0) {
            bool3 = gVar.f266332l;
        }
        String str6 = str5;
        Boolean bool4 = bool3;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        String str7 = str4;
        Float f11 = f10;
        String str8 = str2;
        String str9 = str3;
        return gVar.m(z10, i10, qVar, str, str8, str9, str7, f11, bool5, bool6, str6, bool4);
    }

    public final int A() {
        return this.f266322b;
    }

    public final void B(@Nullable Float f10) {
        this.f266328h = f10;
    }

    public final void C(@Nullable String str) {
        this.f266327g = str;
    }

    public final void D(@Nullable Boolean bool) {
        this.f266329i = bool;
    }

    public final boolean a() {
        return this.f266321a;
    }

    @Nullable
    public final Boolean b() {
        return this.f266330j;
    }

    @Nullable
    public final String c() {
        return this.f266331k;
    }

    @Nullable
    public final Boolean d() {
        return this.f266332l;
    }

    public final int e() {
        return this.f266322b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f266321a == gVar.f266321a && this.f266322b == gVar.f266322b && Intrinsics.areEqual(this.f266323c, gVar.f266323c) && Intrinsics.areEqual(this.f266324d, gVar.f266324d) && Intrinsics.areEqual(this.f266325e, gVar.f266325e) && Intrinsics.areEqual(this.f266326f, gVar.f266326f) && Intrinsics.areEqual(this.f266327g, gVar.f266327g) && Intrinsics.areEqual((Object) this.f266328h, (Object) gVar.f266328h) && Intrinsics.areEqual(this.f266329i, gVar.f266329i) && Intrinsics.areEqual(this.f266330j, gVar.f266330j) && Intrinsics.areEqual(this.f266331k, gVar.f266331k) && Intrinsics.areEqual(this.f266332l, gVar.f266332l);
    }

    @NotNull
    public final q f() {
        return this.f266323c;
    }

    @Nullable
    public final String g() {
        return this.f266324d;
    }

    @Nullable
    public final String h() {
        return this.f266325e;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f266321a) * 31) + Integer.hashCode(this.f266322b)) * 31) + this.f266323c.hashCode()) * 31;
        String str = this.f266324d;
        boolean z10 = true;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f266325e;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f266326f.hashCode()) * 31;
        String str3 = this.f266327g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f266328h;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Boolean bool = this.f266329i;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f266330j;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f266331k;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.f266332l;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.f266326f;
    }

    @Nullable
    public final String j() {
        return this.f266327g;
    }

    @Nullable
    public final Float k() {
        return this.f266328h;
    }

    @Nullable
    public final Boolean l() {
        return this.f266329i;
    }

    @NotNull
    public final g m(boolean z10, int i10, @NotNull q value, @Nullable String str, @Nullable String str2, @NotNull String key, @Nullable String str3, @Nullable Float f10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str4, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        return new g(z10, i10, value, str, str2, key, str3, f10, bool, bool2, str4, bool3);
    }

    @NotNull
    public final SerializableGBExperimentResult o() {
        String str = this.f266326f;
        String str2 = this.f266327g;
        Float f10 = this.f266328h;
        Boolean bool = this.f266330j;
        String str3 = this.f266325e;
        String str4 = this.f266331k;
        Boolean bool2 = this.f266329i;
        return new SerializableGBExperimentResult(this.f266321a, this.f266322b, nf.a.b(this.f266323c), this.f266324d, str3, str, str2, f10, bool2, bool, str4, this.f266332l);
    }

    @Nullable
    public final Float p() {
        return this.f266328h;
    }

    @Nullable
    public final String q() {
        return this.f266331k;
    }

    @Nullable
    public final String r() {
        return this.f266324d;
    }

    @Nullable
    public final Boolean s() {
        return this.f266330j;
    }

    @Nullable
    public final String t() {
        return this.f266325e;
    }

    @NotNull
    public String toString() {
        return "GBExperimentResult(inExperiment=" + this.f266321a + ", variationId=" + this.f266322b + ", value=" + this.f266323c + ", hashAttribute=" + this.f266324d + ", hashValue=" + this.f266325e + ", key=" + this.f266326f + ", name=" + this.f266327g + ", bucket=" + this.f266328h + ", passthrough=" + this.f266329i + ", hashUsed=" + this.f266330j + ", featureId=" + this.f266331k + ", stickyBucketUsed=" + this.f266332l + ")";
    }

    public final boolean u() {
        return this.f266321a;
    }

    @NotNull
    public final String v() {
        return this.f266326f;
    }

    @Nullable
    public final String w() {
        return this.f266327g;
    }

    @Nullable
    public final Boolean x() {
        return this.f266329i;
    }

    @Nullable
    public final Boolean y() {
        return this.f266332l;
    }

    @NotNull
    public final q z() {
        return this.f266323c;
    }

    public /* synthetic */ g(boolean z10, int i10, q qVar, String str, String str2, String str3, String str4, Float f10, Boolean bool, Boolean bool2, String str5, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, qVar, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : f10, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2, (i11 & 1024) != 0 ? null : str5, (i11 & 2048) != 0 ? null : bool3);
    }
}

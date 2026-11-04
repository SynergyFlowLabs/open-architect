package com.planner5d.library.database.model.spaces;

import androidx.room.h0;
import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import com.facebook.appevents.p;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@u(indices = {@h0(unique = true, value = {"hash"}), @h0(unique = true, value = {"id"})}, tableName = "space")
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(name = "id")
    @u0(autoGenerate = true)
    private long f154202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(defaultValue = p.f99189d0, name = "user_id")
    private long f154203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "created")
    @Nullable
    private Date f154204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i(name = "title")
    @Nullable
    private String f154205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i(name = "address")
    @Nullable
    private String f154206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @i(name = "price_amount")
    @Nullable
    private Integer f154207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @i(name = "price_currency")
    @Nullable
    private String f154208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @i(name = "cover")
    @Nullable
    private String f154209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @i(defaultValue = "", name = "hash")
    @NotNull
    private String f154210i;

    public a() {
        this(0L, 0L, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ a k(a aVar, long j10, long j11, Date date, String str, String str2, Integer num, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f154202a;
        }
        return aVar.j(j10, (i10 & 2) != 0 ? aVar.f154203b : j11, (i10 & 4) != 0 ? aVar.f154204c : date, (i10 & 8) != 0 ? aVar.f154205d : str, (i10 & 16) != 0 ? aVar.f154206e : str2, (i10 & 32) != 0 ? aVar.f154207f : num, (i10 & 64) != 0 ? aVar.f154208g : str3, (i10 & 128) != 0 ? aVar.f154209h : str4, (i10 & 256) != 0 ? aVar.f154210i : str5);
    }

    public final void A(@Nullable String str) {
        this.f154208g = str;
    }

    public final void B(@Nullable String str) {
        this.f154205d = str;
    }

    public final void C(long j10) {
        this.f154203b = j10;
    }

    public final long a() {
        return this.f154202a;
    }

    public final long b() {
        return this.f154203b;
    }

    @Nullable
    public final Date c() {
        return this.f154204c;
    }

    @Nullable
    public final String d() {
        return this.f154205d;
    }

    @Nullable
    public final String e() {
        return this.f154206e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f154202a == aVar.f154202a && this.f154203b == aVar.f154203b && Intrinsics.areEqual(this.f154204c, aVar.f154204c) && Intrinsics.areEqual(this.f154205d, aVar.f154205d) && Intrinsics.areEqual(this.f154206e, aVar.f154206e) && Intrinsics.areEqual(this.f154207f, aVar.f154207f) && Intrinsics.areEqual(this.f154208g, aVar.f154208g) && Intrinsics.areEqual(this.f154209h, aVar.f154209h) && Intrinsics.areEqual(this.f154210i, aVar.f154210i);
    }

    @Nullable
    public final Integer f() {
        return this.f154207f;
    }

    @Nullable
    public final String g() {
        return this.f154208g;
    }

    @Nullable
    public final String h() {
        return this.f154209h;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f154202a) * 31) + Long.hashCode(this.f154203b)) * 31;
        Date date = this.f154204c;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.f154205d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154206e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f154207f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f154208g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f154209h;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return ((iHashCode7 + iHashCode2) * 31) + this.f154210i.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f154210i;
    }

    @NotNull
    public final a j(long j10, long j11, @Nullable Date date, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new a(j10, j11, date, str, str2, num, str3, str4, hash);
    }

    @Nullable
    public final String l() {
        return this.f154206e;
    }

    @Nullable
    public final String m() {
        return this.f154209h;
    }

    @Nullable
    public final Date n() {
        return this.f154204c;
    }

    @NotNull
    public final String o() {
        return this.f154210i;
    }

    public final long p() {
        return this.f154202a;
    }

    @Nullable
    public final Integer q() {
        return this.f154207f;
    }

    @Nullable
    public final String r() {
        return this.f154208g;
    }

    @Nullable
    public final String s() {
        return this.f154205d;
    }

    public final long t() {
        return this.f154203b;
    }

    @NotNull
    public String toString() {
        return "Space(id=" + this.f154202a + ", userId=" + this.f154203b + ", created=" + this.f154204c + ", title=" + this.f154205d + ", address=" + this.f154206e + ", priceAmount=" + this.f154207f + ", priceCurrency=" + this.f154208g + ", cover=" + this.f154209h + ", hash=" + this.f154210i + ")";
    }

    public final void u(@Nullable String str) {
        this.f154206e = str;
    }

    public final void v(@Nullable String str) {
        this.f154209h = str;
    }

    public final void w(@Nullable Date date) {
        this.f154204c = date;
    }

    public final void x(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f154210i = str;
    }

    public final void y(long j10) {
        this.f154202a = j10;
    }

    public final void z(@Nullable Integer num) {
        this.f154207f = num;
    }

    public a(long j10, long j11, @Nullable Date date, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f154202a = j10;
        this.f154203b = j11;
        this.f154204c = date;
        this.f154205d = str;
        this.f154206e = str2;
        this.f154207f = num;
        this.f154208g = str3;
        this.f154209h = str4;
        this.f154210i = hash;
    }

    public /* synthetic */ a(long j10, long j11, Date date, String str, String str2, Integer num, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? null : date, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? "" : str5);
    }
}

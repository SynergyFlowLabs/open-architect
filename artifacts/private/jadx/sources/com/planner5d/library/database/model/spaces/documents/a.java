package com.planner5d.library.database.model.spaces.documents;

import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import com.google.android.gms.common.internal.s;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@u(tableName = "document")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(defaultValue = "", name = "hash")
    @u0
    @NotNull
    private String f154224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(name = "space_hash")
    @Nullable
    private String f154225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "name")
    @Nullable
    private String f154226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i(name = "folder_hash")
    @Nullable
    private String f154227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i(name = "date_created")
    @Nullable
    private Date f154228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @i(name = "date_updated")
    @Nullable
    private Date f154229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @i(defaultValue = "NULL", name = "uri")
    @Nullable
    private String f154230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @i(defaultValue = "TRUE", name = s.f106625b)
    private boolean f154231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @i(defaultValue = "FALSE", name = "remote")
    private boolean f154232i;

    public a() {
        this(null, null, null, null, null, null, null, false, false, 511, null);
    }

    public static /* synthetic */ a k(a aVar, String str, String str2, String str3, String str4, Date date, Date date2, String str5, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f154224a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f154225b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f154226c;
        }
        if ((i10 & 8) != 0) {
            str4 = aVar.f154227d;
        }
        if ((i10 & 16) != 0) {
            date = aVar.f154228e;
        }
        if ((i10 & 32) != 0) {
            date2 = aVar.f154229f;
        }
        if ((i10 & 64) != 0) {
            str5 = aVar.f154230g;
        }
        if ((i10 & 128) != 0) {
            z10 = aVar.f154231h;
        }
        if ((i10 & 256) != 0) {
            z11 = aVar.f154232i;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        Date date3 = date2;
        String str6 = str5;
        Date date4 = date;
        String str7 = str3;
        return aVar.j(str, str2, str7, str4, date4, date3, str6, z12, z13);
    }

    public final void A(@Nullable String str) {
        this.f154226c = str;
    }

    public final void B(boolean z10) {
        this.f154232i = z10;
    }

    public final void C(@Nullable String str) {
        this.f154225b = str;
    }

    public final void D(@Nullable String str) {
        this.f154230g = str;
    }

    @NotNull
    public final String a() {
        return this.f154224a;
    }

    @Nullable
    public final String b() {
        return this.f154225b;
    }

    @Nullable
    public final String c() {
        return this.f154226c;
    }

    @Nullable
    public final String d() {
        return this.f154227d;
    }

    @Nullable
    public final Date e() {
        return this.f154228e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f154224a, aVar.f154224a) && Intrinsics.areEqual(this.f154225b, aVar.f154225b) && Intrinsics.areEqual(this.f154226c, aVar.f154226c) && Intrinsics.areEqual(this.f154227d, aVar.f154227d) && Intrinsics.areEqual(this.f154228e, aVar.f154228e) && Intrinsics.areEqual(this.f154229f, aVar.f154229f) && Intrinsics.areEqual(this.f154230g, aVar.f154230g) && this.f154231h == aVar.f154231h && this.f154232i == aVar.f154232i;
    }

    @Nullable
    public final Date f() {
        return this.f154229f;
    }

    @Nullable
    public final String g() {
        return this.f154230g;
    }

    public final boolean h() {
        return this.f154231h;
    }

    public int hashCode() {
        int iHashCode = this.f154224a.hashCode() * 31;
        String str = this.f154225b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154226c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154227d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.f154228e;
        int iHashCode5 = (iHashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f154229f;
        int iHashCode6 = (iHashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str4 = this.f154230g;
        return ((((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.f154231h)) * 31) + Boolean.hashCode(this.f154232i);
    }

    public final boolean i() {
        return this.f154232i;
    }

    @NotNull
    public final a j(@NotNull String hash, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Date date, @Nullable Date date2, @Nullable String str4, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new a(hash, str, str2, str3, date, date2, str4, z10, z11);
    }

    @Nullable
    public final Date l() {
        return this.f154228e;
    }

    @Nullable
    public final Date m() {
        return this.f154229f;
    }

    @Nullable
    public final String n() {
        return this.f154227d;
    }

    @NotNull
    public final String o() {
        return this.f154224a;
    }

    public final boolean p() {
        return this.f154231h;
    }

    @Nullable
    public final String q() {
        return this.f154226c;
    }

    public final boolean r() {
        return this.f154232i;
    }

    @Nullable
    public final String s() {
        return this.f154225b;
    }

    @Nullable
    public final String t() {
        return this.f154230g;
    }

    @NotNull
    public String toString() {
        return "Document(hash=" + this.f154224a + ", spaceHash=" + this.f154225b + ", name=" + this.f154226c + ", folderHash=" + this.f154227d + ", dateCreated=" + this.f154228e + ", dateUpdated=" + this.f154229f + ", uri=" + this.f154230g + ", local=" + this.f154231h + ", remote=" + this.f154232i + ")";
    }

    public final boolean u() {
        String str = this.f154230g;
        return !(str == null || str.length() == 0);
    }

    public final void v(@Nullable Date date) {
        this.f154228e = date;
    }

    public final void w(@Nullable Date date) {
        this.f154229f = date;
    }

    public final void x(@Nullable String str) {
        this.f154227d = str;
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f154224a = str;
    }

    public final void z(boolean z10) {
        this.f154231h = z10;
    }

    public a(@NotNull String hash, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Date date, @Nullable Date date2, @Nullable String str4, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f154224a = hash;
        this.f154225b = str;
        this.f154226c = str2;
        this.f154227d = str3;
        this.f154228e = date;
        this.f154229f = date2;
        this.f154230g = str4;
        this.f154231h = z10;
        this.f154232i = z11;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, Date date, Date date2, String str5, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : date, (i10 & 32) != 0 ? null : date2, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11);
    }
}

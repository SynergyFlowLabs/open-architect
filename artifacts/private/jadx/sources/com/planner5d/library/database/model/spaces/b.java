package com.planner5d.library.database.model.spaces;

import androidx.room.h0;
import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@u(indices = {@h0(unique = true, value = {"id"}), @h0(unique = true, value = {"space_id"})}, tableName = "space_attributes")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(name = "id")
    @u0(autoGenerate = true)
    private long f154211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(name = "space_id")
    private long f154212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "area")
    @Nullable
    private String f154213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i(name = "build_date")
    @Nullable
    private String f154214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i(name = "total_bedrooms")
    @Nullable
    private String f154215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @i(name = "total_bathrooms")
    @Nullable
    private String f154216f;

    public b() {
        this(0L, 0L, null, null, null, null, 63, null);
    }

    public static /* synthetic */ b h(b bVar, long j10, long j11, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = bVar.f154211a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = bVar.f154212b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = bVar.f154213c;
        }
        String str5 = str;
        if ((i10 & 8) != 0) {
            str2 = bVar.f154214d;
        }
        return bVar.g(j12, j13, str5, str2, (i10 & 16) != 0 ? bVar.f154215e : str3, (i10 & 32) != 0 ? bVar.f154216f : str4);
    }

    public final long a() {
        return this.f154211a;
    }

    public final long b() {
        return this.f154212b;
    }

    @Nullable
    public final String c() {
        return this.f154213c;
    }

    @Nullable
    public final String d() {
        return this.f154214d;
    }

    @Nullable
    public final String e() {
        return this.f154215e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f154211a == bVar.f154211a && this.f154212b == bVar.f154212b && Intrinsics.areEqual(this.f154213c, bVar.f154213c) && Intrinsics.areEqual(this.f154214d, bVar.f154214d) && Intrinsics.areEqual(this.f154215e, bVar.f154215e) && Intrinsics.areEqual(this.f154216f, bVar.f154216f);
    }

    @Nullable
    public final String f() {
        return this.f154216f;
    }

    @NotNull
    public final b g(long j10, long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new b(j10, j11, str, str2, str3, str4);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f154211a) * 31) + Long.hashCode(this.f154212b)) * 31;
        String str = this.f154213c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154214d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154215e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f154216f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f154213c;
    }

    @Nullable
    public final String j() {
        return this.f154214d;
    }

    public final long k() {
        return this.f154211a;
    }

    public final long l() {
        return this.f154212b;
    }

    @Nullable
    public final String m() {
        return this.f154216f;
    }

    @Nullable
    public final String n() {
        return this.f154215e;
    }

    public final void o(@Nullable String str) {
        this.f154213c = str;
    }

    public final void p(@Nullable String str) {
        this.f154214d = str;
    }

    public final void q(long j10) {
        this.f154211a = j10;
    }

    public final void r(long j10) {
        this.f154212b = j10;
    }

    public final void s(@Nullable String str) {
        this.f154216f = str;
    }

    public final void t(@Nullable String str) {
        this.f154215e = str;
    }

    @NotNull
    public String toString() {
        return "SpaceAttributes(id=" + this.f154211a + ", spaceId=" + this.f154212b + ", area=" + this.f154213c + ", buildDate=" + this.f154214d + ", totalBedrooms=" + this.f154215e + ", totalBathrooms=" + this.f154216f + ")";
    }

    public b(long j10, long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f154211a = j10;
        this.f154212b = j11;
        this.f154213c = str;
        this.f154214d = str2;
        this.f154215e = str3;
        this.f154216f = str4;
    }

    public /* synthetic */ b(long j10, long j11, String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }
}

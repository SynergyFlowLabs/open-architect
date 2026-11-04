package com.planner5d.library.project.fragment.roomstyle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f223752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f223753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f223754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f223755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f223756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f223757f;

    public j(long j10, @NotNull String name, @NotNull String title, @Nullable String str, boolean z10, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f223752a = j10;
        this.f223753b = name;
        this.f223754c = title;
        this.f223755d = str;
        this.f223756e = z10;
        this.f223757f = action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j h(j jVar, long j10, String str, String str2, String str3, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = jVar.f223752a;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = jVar.f223753b;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = jVar.f223754c;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = jVar.f223755d;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            z10 = jVar.f223756e;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            function0 = jVar.f223757f;
        }
        return jVar.g(j11, str4, str5, str6, z11, function0);
    }

    public final long a() {
        return this.f223752a;
    }

    @NotNull
    public final String b() {
        return this.f223753b;
    }

    @NotNull
    public final String c() {
        return this.f223754c;
    }

    @Nullable
    public final String d() {
        return this.f223755d;
    }

    public final boolean e() {
        return this.f223756e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f223752a == jVar.f223752a && Intrinsics.areEqual(this.f223753b, jVar.f223753b) && Intrinsics.areEqual(this.f223754c, jVar.f223754c) && Intrinsics.areEqual(this.f223755d, jVar.f223755d) && this.f223756e == jVar.f223756e && Intrinsics.areEqual(this.f223757f, jVar.f223757f);
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.f223757f;
    }

    @NotNull
    public final j g(long j10, @NotNull String name, @NotNull String title, @Nullable String str, boolean z10, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        return new j(j10, name, title, str, z10, action);
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.f223752a) * 31) + this.f223753b.hashCode()) * 31) + this.f223754c.hashCode()) * 31;
        String str = this.f223755d;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f223756e)) * 31) + this.f223757f.hashCode();
    }

    @NotNull
    public final Function0<Unit> i() {
        return this.f223757f;
    }

    @Nullable
    public final String j() {
        return this.f223755d;
    }

    @NotNull
    public final String k() {
        return this.f223753b;
    }

    public final long l() {
        return this.f223752a;
    }

    public final boolean m() {
        return this.f223756e;
    }

    @NotNull
    public final String n() {
        return this.f223754c;
    }

    @NotNull
    public String toString() {
        return "RoomStyleUiState(remoteId=" + this.f223752a + ", name=" + this.f223753b + ", title=" + this.f223754c + ", imageUrl=" + this.f223755d + ", selected=" + this.f223756e + ", action=" + this.f223757f + ")";
    }

    public /* synthetic */ j(long j10, String str, String str2, String str3, boolean z10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3, (i10 & 16) != 0 ? false : z10, function0);
    }
}

package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230270e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f230271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f230272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f230273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f230274d;

    public i() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ i f(i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f230271a;
        }
        if ((i10 & 2) != 0) {
            str2 = iVar.f230272b;
        }
        if ((i10 & 4) != 0) {
            str3 = iVar.f230273c;
        }
        if ((i10 & 8) != 0) {
            z10 = iVar.f230274d;
        }
        return iVar.e(str, str2, str3, z10);
    }

    @Nullable
    public final String a() {
        return this.f230271a;
    }

    @NotNull
    public final String b() {
        return this.f230272b;
    }

    @NotNull
    public final String c() {
        return this.f230273c;
    }

    public final boolean d() {
        return this.f230274d;
    }

    @NotNull
    public final i e(@Nullable String str, @NotNull String title, @NotNull String description, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new i(str, title, description, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f230271a, iVar.f230271a) && Intrinsics.areEqual(this.f230272b, iVar.f230272b) && Intrinsics.areEqual(this.f230273c, iVar.f230273c) && this.f230274d == iVar.f230274d;
    }

    @NotNull
    public final String g() {
        return this.f230273c;
    }

    @Nullable
    public final String h() {
        return this.f230271a;
    }

    public int hashCode() {
        String str = this.f230271a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f230272b.hashCode()) * 31) + this.f230273c.hashCode()) * 31) + Boolean.hashCode(this.f230274d);
    }

    @NotNull
    public final String i() {
        return this.f230272b;
    }

    public final boolean j() {
        return this.f230274d;
    }

    @NotNull
    public String toString() {
        return "SpaceCardData(imageUrl=" + this.f230271a + ", title=" + this.f230272b + ", description=" + this.f230273c + ", isLoading=" + this.f230274d + ")";
    }

    public i(@Nullable String str, @NotNull String title, @NotNull String description, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f230271a = str;
        this.f230272b = title;
        this.f230273c = description;
        this.f230274d = z10;
    }

    public /* synthetic */ i(String str, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10);
    }
}

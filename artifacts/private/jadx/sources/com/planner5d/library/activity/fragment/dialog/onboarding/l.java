package com.planner5d.library.activity.fragment.dialog.onboarding;

import androidx.annotation.f1;
import androidx.annotation.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Integer f132222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f132224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f132225d;

    public l(@f1 @Nullable Integer num, @v int i10, @NotNull String eventName, boolean z10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f132222a = num;
        this.f132223b = i10;
        this.f132224c = eventName;
        this.f132225d = z10;
    }

    public static /* synthetic */ l f(l lVar, Integer num, int i10, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = lVar.f132222a;
        }
        if ((i11 & 2) != 0) {
            i10 = lVar.f132223b;
        }
        if ((i11 & 4) != 0) {
            str = lVar.f132224c;
        }
        if ((i11 & 8) != 0) {
            z10 = lVar.f132225d;
        }
        return lVar.e(num, i10, str, z10);
    }

    @Nullable
    public final Integer a() {
        return this.f132222a;
    }

    public final int b() {
        return this.f132223b;
    }

    @NotNull
    public final String c() {
        return this.f132224c;
    }

    public final boolean d() {
        return this.f132225d;
    }

    @NotNull
    public final l e(@f1 @Nullable Integer num, @v int i10, @NotNull String eventName, boolean z10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new l(num, i10, eventName, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f132222a, lVar.f132222a) && this.f132223b == lVar.f132223b && Intrinsics.areEqual(this.f132224c, lVar.f132224c) && this.f132225d == lVar.f132225d;
    }

    @NotNull
    public final String g() {
        return this.f132224c;
    }

    public final int h() {
        return this.f132223b;
    }

    public int hashCode() {
        Integer num = this.f132222a;
        return ((((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.f132223b)) * 31) + this.f132224c.hashCode()) * 31) + Boolean.hashCode(this.f132225d);
    }

    public final boolean i() {
        return this.f132225d;
    }

    @Nullable
    public final Integer j() {
        return this.f132222a;
    }

    public final void k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f132224c = str;
    }

    public final void l(boolean z10) {
        this.f132225d = z10;
    }

    @NotNull
    public String toString() {
        return "OnboardingItem(title=" + this.f132222a + ", image=" + this.f132223b + ", eventName=" + this.f132224c + ", selected=" + this.f132225d + ")";
    }

    public /* synthetic */ l(Integer num, int i10, String str, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i10, str, (i11 & 8) != 0 ? false : z10);
    }
}

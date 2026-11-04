package com.planner5d.library.spaces.data;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230116d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c4.e f230118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f230119c;

    public f(@f1 int i10, @NotNull c4.e nameForStatistics, boolean z10) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        this.f230117a = i10;
        this.f230118b = nameForStatistics;
        this.f230119c = z10;
    }

    public static /* synthetic */ f e(f fVar, int i10, c4.e eVar, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f230117a;
        }
        if ((i11 & 2) != 0) {
            eVar = fVar.f230118b;
        }
        if ((i11 & 4) != 0) {
            z10 = fVar.f230119c;
        }
        return fVar.d(i10, eVar, z10);
    }

    public final int a() {
        return this.f230117a;
    }

    @NotNull
    public final c4.e b() {
        return this.f230118b;
    }

    public final boolean c() {
        return this.f230119c;
    }

    @NotNull
    public final f d(@f1 int i10, @NotNull c4.e nameForStatistics, boolean z10) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        return new f(i10, nameForStatistics, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f230117a == fVar.f230117a && this.f230118b == fVar.f230118b && this.f230119c == fVar.f230119c;
    }

    @NotNull
    public final c4.e f() {
        return this.f230118b;
    }

    public final boolean g() {
        return this.f230119c;
    }

    public final int h() {
        return this.f230117a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f230117a) * 31) + this.f230118b.hashCode()) * 31) + Boolean.hashCode(this.f230119c);
    }

    public final void i(boolean z10) {
        this.f230119c = z10;
    }

    @NotNull
    public String toString() {
        return "SurveyStepGoalsData(title=" + this.f230117a + ", nameForStatistics=" + this.f230118b + ", selected=" + this.f230119c + ")";
    }

    public /* synthetic */ f(int i10, c4.e eVar, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, eVar, (i11 & 4) != 0 ? false : z10);
    }
}

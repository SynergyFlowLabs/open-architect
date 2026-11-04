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
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230120d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c4.f f230122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f230123c;

    public g(@f1 int i10, @NotNull c4.f nameForStatistics, boolean z10) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        this.f230121a = i10;
        this.f230122b = nameForStatistics;
        this.f230123c = z10;
    }

    public static /* synthetic */ g e(g gVar, int i10, c4.f fVar, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f230121a;
        }
        if ((i11 & 2) != 0) {
            fVar = gVar.f230122b;
        }
        if ((i11 & 4) != 0) {
            z10 = gVar.f230123c;
        }
        return gVar.d(i10, fVar, z10);
    }

    public final int a() {
        return this.f230121a;
    }

    @NotNull
    public final c4.f b() {
        return this.f230122b;
    }

    public final boolean c() {
        return this.f230123c;
    }

    @NotNull
    public final g d(@f1 int i10, @NotNull c4.f nameForStatistics, boolean z10) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        return new g(i10, nameForStatistics, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f230121a == gVar.f230121a && this.f230122b == gVar.f230122b && this.f230123c == gVar.f230123c;
    }

    @NotNull
    public final c4.f f() {
        return this.f230122b;
    }

    public final boolean g() {
        return this.f230123c;
    }

    public final int h() {
        return this.f230121a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f230121a) * 31) + this.f230122b.hashCode()) * 31) + Boolean.hashCode(this.f230123c);
    }

    public final void i(boolean z10) {
        this.f230123c = z10;
    }

    @NotNull
    public String toString() {
        return "SurveyStepPersonalityData(title=" + this.f230121a + ", nameForStatistics=" + this.f230122b + ", selected=" + this.f230123c + ")";
    }

    public /* synthetic */ g(int i10, c4.f fVar, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, fVar, (i11 & 4) != 0 ? false : z10);
    }
}

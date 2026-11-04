package com.planner5d.library.spaces.data;

import androidx.annotation.f1;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230131e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f230133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f230134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c4.h f230135d;

    public j(@v int i10, @f1 int i11, @f1 int i12, @NotNull c4.h nameForStatistics) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        this.f230132a = i10;
        this.f230133b = i11;
        this.f230134c = i12;
        this.f230135d = nameForStatistics;
    }

    public static /* synthetic */ j f(j jVar, int i10, int i11, int i12, c4.h hVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = jVar.f230132a;
        }
        if ((i13 & 2) != 0) {
            i11 = jVar.f230133b;
        }
        if ((i13 & 4) != 0) {
            i12 = jVar.f230134c;
        }
        if ((i13 & 8) != 0) {
            hVar = jVar.f230135d;
        }
        return jVar.e(i10, i11, i12, hVar);
    }

    public final int a() {
        return this.f230132a;
    }

    public final int b() {
        return this.f230133b;
    }

    public final int c() {
        return this.f230134c;
    }

    @NotNull
    public final c4.h d() {
        return this.f230135d;
    }

    @NotNull
    public final j e(@v int i10, @f1 int i11, @f1 int i12, @NotNull c4.h nameForStatistics) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        return new j(i10, i11, i12, nameForStatistics);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f230132a == jVar.f230132a && this.f230133b == jVar.f230133b && this.f230134c == jVar.f230134c && this.f230135d == jVar.f230135d;
    }

    public final int g() {
        return this.f230132a;
    }

    @NotNull
    public final c4.h h() {
        return this.f230135d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f230132a) * 31) + Integer.hashCode(this.f230133b)) * 31) + Integer.hashCode(this.f230134c)) * 31) + this.f230135d.hashCode();
    }

    public final int i() {
        return this.f230134c;
    }

    public final int j() {
        return this.f230133b;
    }

    @NotNull
    public String toString() {
        return "SurveyStepUsageDataRow(image=" + this.f230132a + ", title=" + this.f230133b + ", subtitle=" + this.f230134c + ", nameForStatistics=" + this.f230135d + ")";
    }
}

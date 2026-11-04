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
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230124d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f230126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c4.g f230127c;

    public h(@v int i10, @f1 int i11, @NotNull c4.g nameForStatistics) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        this.f230125a = i10;
        this.f230126b = i11;
        this.f230127c = nameForStatistics;
    }

    public static /* synthetic */ h e(h hVar, int i10, int i11, c4.g gVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = hVar.f230125a;
        }
        if ((i12 & 2) != 0) {
            i11 = hVar.f230126b;
        }
        if ((i12 & 4) != 0) {
            gVar = hVar.f230127c;
        }
        return hVar.d(i10, i11, gVar);
    }

    public final int a() {
        return this.f230125a;
    }

    public final int b() {
        return this.f230126b;
    }

    @NotNull
    public final c4.g c() {
        return this.f230127c;
    }

    @NotNull
    public final h d(@v int i10, @f1 int i11, @NotNull c4.g nameForStatistics) {
        Intrinsics.checkNotNullParameter(nameForStatistics, "nameForStatistics");
        return new h(i10, i11, nameForStatistics);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f230125a == hVar.f230125a && this.f230126b == hVar.f230126b && this.f230127c == hVar.f230127c;
    }

    public final int f() {
        return this.f230125a;
    }

    @NotNull
    public final c4.g g() {
        return this.f230127c;
    }

    public final int h() {
        return this.f230126b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f230125a) * 31) + Integer.hashCode(this.f230126b)) * 31) + this.f230127c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SurveyStepSpaceTypeData(image=" + this.f230125a + ", title=" + this.f230126b + ", nameForStatistics=" + this.f230127c + ")";
    }
}

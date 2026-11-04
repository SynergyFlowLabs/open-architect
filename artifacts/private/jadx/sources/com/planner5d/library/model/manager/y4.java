package com.planner5d.library.model.manager;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public enum y4 {
    ProblemRendering(13, pc.b.r.yC),
    ProblemSynchronization(11, pc.b.r.zC),
    ProblemPayments(10, pc.b.r.xC),
    ProblemCrash(12, pc.b.r.uC),
    ProblemDownload(14, pc.b.r.vC),
    ProblemOther(15, pc.b.r.wC),
    QuestionGeneral(2, pc.b.r.AC),
    QuestionEducation(16, pc.b.r.BC),
    Idea(3, pc.b.r.tC);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f222413m = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f222414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f222415b;

    y4(int i10, int i11) {
        this.f222414a = i10;
        this.f222415b = i11;
    }

    @NotNull
    public static kotlin.enums.a<y4> l() {
        return f222413m;
    }

    public final int n() {
        return this.f222414a;
    }

    @NotNull
    public final String o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(this.f222415b);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}

package com.planner5d.library.widget.rate;

import com.planner5d.library.services.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public enum c {
    AfterTwoSessions(r.afterTwoSessions),
    OnThreeItemsAddedInEditor(r.onThreeItemsAddedInEditor),
    OnContestProjectSubmitted(r.onContestProjectSubmitted),
    OnContestPrizeClaimed(r.onContestPrizeClaimed),
    OnEditorExitAfterTrialUnlock(r.onEditorExitAfterTrialUnlock);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f258659h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f258660a;

    c(r rVar) {
        this.f258660a = rVar;
    }

    @NotNull
    public static kotlin.enums.a<c> l() {
        return f258659h;
    }

    @NotNull
    public final r n() {
        return this.f258660a;
    }
}

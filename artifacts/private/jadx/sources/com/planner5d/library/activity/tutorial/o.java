package com.planner5d.library.activity.tutorial;

import android.app.Activity;
import com.planner5d.library.widget.s1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f141863a;

    public o(@NotNull p tutorialManager) {
        Intrinsics.checkNotNullParameter(tutorialManager, "tutorialManager");
        this.f141863a = tutorialManager;
    }

    @Override // com.planner5d.library.widget.s1
    public void a(@NotNull String tutorialName, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(tutorialName, "tutorialName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f141863a.h(tutorialName, activity);
    }
}

package com.planner5d.library.services;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.f1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShareContestProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareContestProject.kt\ncom/planner5d/library/services/ShareContestProject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class g0 implements com.planner5d.library.contest.helper.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f224336f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f224337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f224338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f224339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f224340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l3 f224341e;

    @ij.a
    public g0(@NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull f1 scope, @NotNull b2 messageManager, @NotNull y0 imageManager, @NotNull l3 statisticsEventContests) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        this.f224337a = projectManager;
        this.f224338b = scope;
        this.f224339c = messageManager;
        this.f224340d = imageManager;
        this.f224341e = statisticsEventContests;
    }

    @Override // com.planner5d.library.contest.helper.b
    public void a(@NotNull Activity activity, @NotNull Project project, @NotNull Contest contest, @androidx.annotation.f1 int i10, @NotNull l3.b source) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(contest, "contest");
        Intrinsics.checkNotNullParameter(source, "source");
        String str = contest.uid;
        if (str != null) {
            this.f224341e.j1(Long.valueOf(Long.parseLong(str)), l3.a.share, source);
        }
        new l0(project, this.f224337a, this.f224338b, this.f224339c, this.f224340d, r3.k.contests, r3.l.contest).n(activity, activity.getString(i10), contest.A());
    }
}

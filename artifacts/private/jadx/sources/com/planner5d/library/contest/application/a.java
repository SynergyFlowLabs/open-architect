package com.planner5d.library.contest.application;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.contest.view.ContestDetailFragment;
import com.planner5d.library.contest.view.ContestFragment;
import com.planner5d.library.contest.view.MainContestPage;
import com.planner5d.library.contest.view.archive.ContestArchive;
import com.planner5d.library.contest.view.archive.ContestArchiveList;
import com.planner5d.library.contest.view.detail.ContestDetailsFragment;
import com.planner5d.library.contest.view.dialog.ContestRulesAgreement;
import com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog;
import com.planner5d.library.contest.view.voting.ContestVotingFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@fg.d(modules = {com.planner5d.library.contest.application.b.class, g0.class})
@w0(parameters = 1)
@f0
public abstract class a extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1517a f148393b = new C1517a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f148394c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f148395d;

    /* JADX INFO: renamed from: com.planner5d.library.contest.application.a$a, reason: collision with other inner class name */
    public static final class C1517a {
        public /* synthetic */ C1517a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            a aVar = a.f148395d;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void b(@NotNull a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            a.f148395d = aVar;
        }

        private C1517a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        a a(@NotNull com.planner5d.library.contest.application.b bVar);
    }

    @NotNull
    public abstract com.planner5d.library.contest.data.i f();

    @NotNull
    public abstract com.planner5d.library.model.manager.synchronization.k g();

    @NotNull
    public abstract com.planner5d.library.contest.helper.g h();

    @NotNull
    public abstract com.planner5d.library.contest.data.k i();

    public abstract void j(@NotNull com.planner5d.library.contest.helper.c cVar);

    public abstract void k(@NotNull ContestDetailFragment contestDetailFragment);

    public abstract void l(@NotNull ContestFragment contestFragment);

    public abstract void m(@NotNull MainContestPage mainContestPage);

    public abstract void n(@NotNull ContestArchive contestArchive);

    public abstract void o(@NotNull ContestArchiveList contestArchiveList);

    public abstract void p(@NotNull ContestDetailsFragment contestDetailsFragment);

    public abstract void q(@NotNull ContestRulesAgreement contestRulesAgreement);

    public abstract void r(@NotNull ContestPrizeDialog contestPrizeDialog);

    public abstract void s(@NotNull ContestVotingFragment contestVotingFragment);
}

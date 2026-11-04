package com.planner5d.library.contest.data;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestWinner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f148541a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148542b = 0;

    private j() {
    }

    @Nullable
    public final eb.a a(@NotNull Contest contest, @Nullable id.a aVar) {
        Intrinsics.checkNotNullParameter(contest, "<this>");
        if (aVar == null) {
            return null;
        }
        String str = aVar.f287076b;
        String str2 = aVar.f287080f;
        Integer numK = contest.K();
        if (numK != null) {
            return new eb.a(true, str, str2, numK, contest.L(), contest.E(), contest.A(), null, 128, null);
        }
        return null;
    }

    @NotNull
    public final eb.a b(@NotNull ContestWinner contestWinner) {
        Intrinsics.checkNotNullParameter(contestWinner, "<this>");
        return new eb.a(false, contestWinner.w(), contestWinner.A(), contestWinner.x(), contestWinner.y(), contestWinner.z(), contestWinner.v(), null, 128, null);
    }
}

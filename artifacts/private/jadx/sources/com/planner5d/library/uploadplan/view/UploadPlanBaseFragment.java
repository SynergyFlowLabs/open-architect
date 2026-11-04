package com.planner5d.library.uploadplan.view;

import android.os.Bundle;
import com.planner5d.library.activity.fragment.FragmentController;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class UploadPlanBaseFragment extends FragmentController {
    @Nullable
    protected final Unit y(@Nullable Pair<? extends Class<? extends FragmentController>, Bundle> pair) {
        if (pair == null) {
            return null;
        }
        this.f131538b.f(new com.planner5d.library.activity.helper.event.content.c(pair.getFirst(), pair.getSecond(), com.planner5d.library.activity.helper.event.content.e.SlideLeft), true);
        return Unit.f312394a;
    }
}

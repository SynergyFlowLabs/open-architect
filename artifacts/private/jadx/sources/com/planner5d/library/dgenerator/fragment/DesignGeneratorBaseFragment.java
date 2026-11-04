package com.planner5d.library.dgenerator.fragment;

import android.os.Bundle;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.helper.event.content.c;
import com.planner5d.library.activity.helper.event.content.e;
import com.planner5d.library.widget.c0;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DesignGeneratorBaseFragment extends FragmentController implements c0 {
    @Nullable
    protected final Unit y(@Nullable Pair<? extends Class<? extends FragmentController>, Bundle> pair) {
        if (pair == null) {
            return null;
        }
        boolean z10 = !false;
        this.f131538b.f(new c(pair.getFirst(), pair.getSecond(), e.SlideLeft), true);
        return Unit.f312394a;
    }
}

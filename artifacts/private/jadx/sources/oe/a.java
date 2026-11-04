package oe;

import android.os.Bundle;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.helper.event.content.c;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.util.navigation.external.NestedNavigationState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {
    public a(@NotNull Class<? extends FragmentController> fragmentClass, @NotNull NestedNavigationState nestedNavigationState) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(nestedNavigationState, "nestedNavigationState");
        i(fragmentClass);
        h(new i().i(r.nestedNavigationState, nestedNavigationState));
    }

    public a(@NotNull Class<? extends FragmentController> fragmentClass, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        i(fragmentClass);
        h(new i().h(r.startArguments, bundle));
    }
}

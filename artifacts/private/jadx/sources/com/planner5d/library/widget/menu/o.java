package com.planner5d.library.widget.menu;

import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface o {

    public static final class a {
        public static /* synthetic */ void a(o oVar, FragmentManager fragmentManager, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            oVar.showMenu(fragmentManager, str);
        }
    }

    void showMenu(@NotNull FragmentManager fragmentManager, @Nullable String str);
}

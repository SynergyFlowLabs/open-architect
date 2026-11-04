package ud;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.y1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class a implements b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f381234d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f381235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<? extends FragmentController> f381236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f381237c;

    public a(@NotNull y1 menuManager, @NotNull Class<? extends FragmentController> fragmentClass, @NotNull x navigator) {
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f381235a = menuManager;
        this.f381236b = fragmentClass;
        this.f381237c = navigator;
    }

    @Override // ud.b.a
    public void a() {
        com.planner5d.library.activity.helper.event.content.a aVarA = this.f381235a.a();
        if (Intrinsics.areEqual(aVarA.e(), this.f381236b)) {
            return;
        }
        int i10 = 5 & 2;
        x.g(this.f381237c, new com.planner5d.library.activity.helper.event.content.c(this.f381236b, (Bundle) null).j(aVarA), false, 2, null);
    }
}

package com.planner5d.library.widget.rate;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.rate.RateUsDialog;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.model.manager.statistics.b0;
import com.planner5d.library.model.manager.statistics.events.j1;
import com.planner5d.library.model.manager.statistics.events.n1;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.services.utility.h3;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258665e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f258666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f258667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private WeakReference<Activity> f258668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f258669d;

    @ij.a
    public e(@NotNull b0 statisticsManager, @NotNull k dialogLauncher) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f258666a = statisticsManager;
        this.f258667b = dialogLauncher;
    }

    private final void c(t3.c cVar, boolean z10, c cVar2, Function0<Unit> function0) {
        Activity activity;
        WeakReference<Activity> weakReference = this.f258668c;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            n1.f217163b.R(t3.a.closed, cVar, Boolean.valueOf(z10), cVar2);
            this.f258666a.t(g.class, "like:" + (z10 ? 1 : 0));
            j1.f216988b.q(z10 ? r3.f.submit : r3.f.close, r3.g.timer, this.f258669d, null);
            if (z10) {
                h3.g0(activity);
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar, t3.c cVar, c cVar2, Function0 function0, Boolean bool) {
        eVar.c(cVar, bool != null ? bool.booleanValue() : false, cVar2, function0);
    }

    public final void b(@NotNull Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f258668c = new WeakReference<>(activity);
        this.f258669d = i10;
    }

    public final boolean d(@NotNull final c condition, @NotNull final t3.c source, @NotNull final Function0<Unit> onRated) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onRated, "onRated");
        WeakReference<Activity> weakReference = this.f258668c;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        this.f258667b.c(RateUsDialog.class).m(new u() { // from class: com.planner5d.library.widget.rate.d
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                e.e(this.f258661a, source, condition, onRated, (Boolean) obj);
            }
        }).g();
        n1.f217163b.R(t3.a.shown, source, null, condition);
        return true;
    }
}

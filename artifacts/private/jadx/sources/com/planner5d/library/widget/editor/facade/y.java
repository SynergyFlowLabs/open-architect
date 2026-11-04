package com.planner5d.library.widget.editor.facade;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.p2;
import com.planner5d.library.widget.editor.helper.s3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f256168f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f256169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f256170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f256171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ij.c<p2> f256172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n3 f256173e;

    public y(@NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull ij.c<p2> stateProvider, @NotNull n3 projectPersistence) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(projectPersistence, "projectPersistence");
        this.f256169a = synchronizationManager;
        this.f256170b = projectManager;
        this.f256171c = userAuthorization;
        this.f256172d = stateProvider;
        this.f256173e = projectPersistence;
    }

    private final Project a() {
        Project projectI = this.f256172d.get().i();
        return projectI == null ? c() : projectI;
    }

    private final Project c() {
        Long lB;
        Bundle bundleB = this.f256172d.get().b();
        if (bundleB == null || (lB = s3.f256737f.a(bundleB).b()) == null) {
            return null;
        }
        return this.f256170b.Y(this.f256171c.a(), lB.longValue());
    }

    @NotNull
    public final Observable<Void> b() {
        if (this.f256173e.u()) {
            Observable<Void> observableX = this.f256169a.x();
            Intrinsics.checkNotNull(observableX);
            return observableX;
        }
        Observable<Void> observableR = this.f256169a.r(a());
        Intrinsics.checkNotNull(observableR);
        return observableR;
    }
}

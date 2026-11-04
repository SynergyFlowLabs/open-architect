package com.planner5d.library.widget.editor.facade;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.widget.editor.helper.e2;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.n1;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.q2;
import com.planner5d.library.widget.editor.helper.s2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f256138l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.i f256139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f256140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f256141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f256142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c0 f256143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.c0 f256144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q2 f256145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.projectresources.e f256146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f256147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.userimporteddata.n f256148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final k1 f256149k;

    @ij.a
    public s(@NotNull com.planner5d.library.model.manager.synchronization.i synchronizationManager, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull n3 projectPersistence, @NotNull c0 interfaceManager, @NotNull com.planner5d.library.activity.fragment.c0 projectReloadingHelper, @NotNull q2 helperEditorStateHolder, @NotNull com.planner5d.library.widget.editor.projectresources.e projectResources, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.userimporteddata.n userImportedModelNameProcessor, @NotNull k1 itemManager) {
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(projectPersistence, "projectPersistence");
        Intrinsics.checkNotNullParameter(interfaceManager, "interfaceManager");
        Intrinsics.checkNotNullParameter(projectReloadingHelper, "projectReloadingHelper");
        Intrinsics.checkNotNullParameter(helperEditorStateHolder, "helperEditorStateHolder");
        Intrinsics.checkNotNullParameter(projectResources, "projectResources");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(userImportedModelNameProcessor, "userImportedModelNameProcessor");
        Intrinsics.checkNotNullParameter(itemManager, "itemManager");
        this.f256139a = synchronizationManager;
        this.f256140b = projectManager;
        this.f256141c = userAuthorization;
        this.f256142d = projectPersistence;
        this.f256143e = interfaceManager;
        this.f256144f = projectReloadingHelper;
        this.f256145g = helperEditorStateHolder;
        this.f256146h = projectResources;
        this.f256147i = builtInDataManager;
        this.f256148j = userImportedModelNameProcessor;
        this.f256149k = itemManager;
    }

    @NotNull
    public final h a(@NotNull j2.a projectLoaderListener, @NotNull com.planner5d.library.widget.editor.helper.selector.a itemSelector, @NotNull w supportingViewsController) {
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        Intrinsics.checkNotNullParameter(itemSelector, "itemSelector");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        return new r(new y(this.f256139a, this.f256140b, this.f256141c, this.f256145g, this.f256142d), projectLoaderListener, this.f256143e, this.f256145g.a(), this.f256144f, itemSelector, supportingViewsController);
    }

    @NotNull
    public final h b(@NotNull j2.a projectLoaderListener, @NotNull w supportingViewsController) {
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        return a(projectLoaderListener, new com.planner5d.library.widget.editor.helper.selector.g(), supportingViewsController);
    }

    @NotNull
    public final h c(@NotNull j2.a projectLoaderListener, @NotNull w supportingViewsController, @NotNull n1 helperEditorAiChat) {
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        Intrinsics.checkNotNullParameter(helperEditorAiChat, "helperEditorAiChat");
        return a(projectLoaderListener, new com.planner5d.library.widget.editor.helper.selector.c(this.f256149k, helperEditorAiChat), supportingViewsController);
    }

    @NotNull
    public final h d(@NotNull j2.a projectLoaderListener) {
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        return a(projectLoaderListener, new com.planner5d.library.widget.editor.helper.selector.d(), new x());
    }

    @kotlin.l(message = "Avoid using this as it will be moved outside of EditorFactoryFacade")
    @NotNull
    public final we.c e(@NotNull h facade, @NotNull e contextProvider, @Nullable s2 s2Var, @Nullable n3 n3Var) {
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new we.d(this.f256146h, this.f256147i, s2Var, n3Var, facade, facade, contextProvider);
    }

    @kotlin.l(message = "Avoid using this as it will be moved outside of EditorFactoryFacade")
    @NotNull
    public final com.planner5d.library.widget.editor.helper.g f(@NotNull h facade, @NotNull we.c historyManager, @Nullable i0 i0Var, @Nullable com.planner5d.library.widget.editor.helper.e eVar, @Nullable e2 e2Var, @Nullable c cVar) {
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(historyManager, "historyManager");
        return new com.planner5d.library.widget.editor.helper.h(facade, historyManager, i0Var, this.f256147i, this.f256148j, eVar, e2Var, cVar);
    }

    @kotlin.l(message = "Avoid using this as it will be moved outside of EditorFactoryFacade")
    @NotNull
    public final com.planner5d.library.widget.editor.helper.g g(@NotNull h facade, @NotNull we.c historyManager, @Nullable c cVar) {
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(historyManager, "historyManager");
        return new com.planner5d.library.widget.editor.helper.h(facade, historyManager, null, this.f256147i, this.f256148j, null, null, cVar);
    }
}

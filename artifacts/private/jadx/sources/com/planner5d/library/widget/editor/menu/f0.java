package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmCloneMessage;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.h2;
import com.planner5d.library.widget.editor.helper.l1;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class f0 implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f257060i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f257062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f257063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f257064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final y1 f257065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f257066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f257067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f257068h;

    public f0(@NotNull g1 helper, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull b2 messageManager, @NotNull y1 menuManager, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.services.utility.p0 formatter) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f257061a = helper;
        this.f257062b = projectManager;
        this.f257063c = userAuthorization;
        this.f257064d = messageManager;
        this.f257065e = menuManager;
        this.f257066f = navigator;
        this.f257067g = dialogLauncher;
        this.f257068h = formatter;
    }

    private final void c(Activity activity) {
        Project projectI1 = this.f257061a.I1();
        Intrinsics.checkNotNullExpressionValue(projectI1, "getProject(...)");
        Project project = new Project(projectI1);
        Date dateJ1 = this.f257061a.J1();
        if (dateJ1 != null) {
            project.title = this.f257068h.E(dateJ1);
        }
        l1 l1Var = l1.f256518a;
        com.planner5d.library.model.manager.project.d0 d0Var = this.f257062b;
        b2 b2Var = this.f257064d;
        y1 y1Var = this.f257065e;
        h2 helperPreloader = this.f257061a.f256349u3;
        Intrinsics.checkNotNullExpressionValue(helperPreloader, "helperPreloader");
        l1Var.l(activity, d0Var, b2Var, y1Var, helperPreloader, this.f257063c.a(), project, this.f257066f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(f0 f0Var, Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            f0Var.c(activity);
        }
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull final Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        ConfirmCloneMessage.show(this.f257067g, (com.planner5d.library.activity.fragment.dialog.u<Boolean>) new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.menu.e0
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                f0.d(this.f257057a, activity, (Boolean) obj);
            }
        });
    }
}

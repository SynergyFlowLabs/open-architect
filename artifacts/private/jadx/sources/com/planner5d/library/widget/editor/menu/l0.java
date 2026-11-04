package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class l0 implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f257140g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f257142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f257143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f257144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b2 f257145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final y0 f257146f;

    public l0(@NotNull g1 helper, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull f1 scope, @NotNull b2 messageManager, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f257141a = helper;
        this.f257142b = userAuthorization;
        this.f257143c = projectManager;
        this.f257144d = scope;
        this.f257145e = messageManager;
        this.f257146f = imageManager;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        s2.b(this.f257141a.B3, o3.a.share, null, 2, null);
        if (this.f257141a.z1() || this.f257142b.b()) {
            Project projectI1 = this.f257141a.I1();
            Intrinsics.checkNotNullExpressionValue(projectI1, "getProject(...)");
            com.planner5d.library.services.l0.o(new com.planner5d.library.services.l0(projectI1, this.f257143c, this.f257144d, this.f257145e, this.f257146f, r3.k.projects, r3.l.project), activity, null, null, 6, null);
            return;
        }
        String string = activity.getString(com.planner5d.library.f.s.L1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(com.planner5d.library.f.s.VD, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = activity.getString(com.planner5d.library.f.s.DG, activity.getPackageName());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(com.planner5d.library.f.s.GF, string);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        new com.planner5d.library.services.f0(string2, string3, null, string4, this.f257141a.x1(), null).a(activity);
    }
}

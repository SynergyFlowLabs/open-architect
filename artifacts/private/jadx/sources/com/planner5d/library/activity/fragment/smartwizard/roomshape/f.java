package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import android.os.Bundle;
import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.smartwizard.s;
import com.planner5d.library.activity.fragment.smartwizard.v;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.converter.json.to.o;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.n3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nChooseRoomShapeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseRoomShapeViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomshape/ChooseRoomShapeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,96:1\n1863#2,2:97\n1557#2:99\n1628#2,3:100\n216#3,2:103\n*S KotlinDebug\n*F\n+ 1 ChooseRoomShapeViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomshape/ChooseRoomShapeViewModel\n*L\n50#1:97,2\n53#1:99\n53#1:100,3\n78#1:103,2\n*E\n"})
public final class f extends s {
    public static final int Z = 8;

    @NotNull
    private final List<Pair<i, kf.b>> X;

    @NotNull
    private final j2 Y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final v f135614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final oa.f f135615o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final o f135616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final Map<String, Pair<Project, ItemProject>> f135617t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private i f135618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final hf.c f135619w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public f(@NotNull v roomTypeChangeUseCase, @NotNull x navigator, @NotNull b2 messageManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull n3 helperProjectPersistence, @NotNull sd.e firebaseInAppMessageTrigger, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.application.b application, @NotNull oa.f windowDoorCatalogLoader, @NotNull o fromItemProject) {
        super(messageManager, navigator, networkStateUtility, application);
        Intrinsics.checkNotNullParameter(roomTypeChangeUseCase, "roomTypeChangeUseCase");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(windowDoorCatalogLoader, "windowDoorCatalogLoader");
        Intrinsics.checkNotNullParameter(fromItemProject, "fromItemProject");
        this.f135614n = roomTypeChangeUseCase;
        this.f135615o = windowDoorCatalogLoader;
        this.f135616s = fromItemProject;
        this.f135617t = new HashMap();
        this.f135618v = s.a.f135866a.a();
        this.f135619w = new hf.c();
        this.X = new ArrayList();
        this.Y = new j2(this, dialogLauncher, helperProjectPersistence, null, this, firebaseInAppMessageTrigger);
    }

    public final void A0(@NotNull i shape, @NotNull g1.j listener) {
        Pair<Project, ItemProject> pair;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135618v = shape;
        if (!this.f135617t.isEmpty() && this.f135617t.containsKey(shape.n()) && (pair = this.f135617t.get(shape.n())) != null) {
            p0((Project) pair.first, (ItemProject) pair.second, listener);
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void H(@NotNull Pair<Project, ItemProject> project, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void n0(@NotNull g1.j listener, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d0().o(Boolean.TRUE);
        for (i iVar : i.l()) {
            this.X.add(new Pair<>(iVar, new oa.a(iVar, this.f135619w).k()));
        }
        j2 j2Var = this.Y;
        List<Pair<i, kf.b>> list = this.X;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String strN = ((i) pair.first).n();
            o oVar = this.f135616s;
            oa.c cVar = oa.c.f333600a;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            arrayList.add(new Pair(strN, oVar.h(cVar.b((kf.b) second, this.f135615o), false)));
        }
        j2Var.j(arrayList, listener);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void u(@NotNull Map<String, ? extends Pair<Project, ItemProject>> projects, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i10 = 0 >> 2;
        int i11 = Y().getInt(r.smartWizardRoomType.f224891a, 2);
        for (Map.Entry<String, ? extends Pair<Project, ItemProject>> entry : projects.entrySet()) {
            v vVar = this.f135614n;
            Object second = entry.getValue().second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            vVar.a((ItemProject) second, i11);
        }
        this.f135617t.clear();
        this.f135617t.putAll(projects);
        A0(this.f135618v, listener);
    }

    public final void y0(@NotNull i chosenRoomShape) {
        Intrinsics.checkNotNullParameter(chosenRoomShape, "chosenRoomShape");
        Y().putString(r.smartWizardStatisticsRoomShape.f224891a, chosenRoomShape.n());
        x0();
    }

    public final void z0() {
        g0().putBoolean(r.smartWizardStatisticsChangeShape.f224891a, true);
    }
}

package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class v implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257186b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257187a;

    public v(@NotNull g1 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257187a = helper;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        ItemFloor activeFloor;
        com.planner5d.library.widget.editor.a aVarS1;
        View view;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        ItemProject itemProjectW1 = this.f257187a.w1();
        if (itemProjectW1 != null && (activeFloor = itemProjectW1.getActiveFloor()) != null && (aVarS1 = this.f257187a.s1()) != null && (view = this.f257187a.getView()) != null && !this.f257187a.D1()) {
            PointF pointF = new PointF(view.getWidth() / 2, view.getHeight() / 2);
            PointF pointF2 = new PointF(pointF.x, pointF.y);
            float f10 = pointF.x;
            pointF.x = f10 - (f10 / 2);
            PointF pointFJ = aVarS1.j(pointF);
            PointF pointFJ2 = aVarS1.j(pointF2);
            ItemRuler itemRuler = new ItemRuler(new com.planner5d.library.math.k(pointFJ.x, pointFJ.y), new com.planner5d.library.math.k(pointFJ2.x, pointFJ2.y), activeFloor);
            com.planner5d.library.widget.editor.projectresources.j jVarJ = this.f257187a.j();
            if (jVarJ != null) {
                jVarJ.a(itemRuler);
            }
            this.f257187a.r();
        }
    }
}

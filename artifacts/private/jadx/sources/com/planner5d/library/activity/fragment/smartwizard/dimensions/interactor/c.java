package com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor;

import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.smartwizard.dimensions.w;
import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.widget.editor.helper.a3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c implements na.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135529b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a3 f135530a = new a3();

    @ij.a
    public c() {
    }

    @Override // na.b
    @NotNull
    public Pair<com.planner5d.library.widget.editor.editaction.e, com.planner5d.library.widget.editor.editaction.e> a(float f10, @NotNull w data) {
        boolean zD;
        Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairA;
        Intrinsics.checkNotNullParameter(data, "data");
        ItemEditableWall itemEditableWallG = data.g();
        boolean zD2 = data.a().d();
        ItemEditableWall itemEditableWallE = data.e();
        if (data.a().e().b().s(data.a().f().b())) {
            zD = data.a().d();
        } else {
            zD = !data.a().d();
        }
        float length = itemEditableWallG.getLength();
        Pair<? extends com.planner5d.library.widget.editor.editaction.e, ? extends com.planner5d.library.widget.editor.editaction.e> pairA2 = this.f135530a.a(itemEditableWallG, zD2 ? a3.a.Right : a3.a.Left, f10, false);
        if (itemEditableWallE != null) {
            pairA = this.f135530a.a(itemEditableWallE, zD ? a3.a.Right : a3.a.Left, (itemEditableWallE.getLength() + itemEditableWallG.getLength()) - length, false);
        } else {
            pairA = null;
        }
        itemEditableWallG.getParentWalls().resetWalls();
        return new Pair<>(pairA2 != null ? (com.planner5d.library.widget.editor.editaction.e) pairA2.first : null, pairA != null ? (com.planner5d.library.widget.editor.editaction.e) pairA.first : null);
    }
}

package com.planner5d.library.widget.editor.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.services.l;
import com.planner5d.library.services.utility.v1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class e implements cf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f256914a = 0;

    @ij.a
    public e() {
    }

    @Override // cf.b
    public void a(@Nullable Item item, @NotNull String materialName, boolean z10) {
        boolean z11;
        Intrinsics.checkNotNullParameter(materialName, "materialName");
        if (!(item instanceof ItemRoom)) {
            timber.log.b.f381052a.d("Material toggle is available only for ItemRoom", new Object[0]);
            return;
        }
        v1.a<l.c> aVar = l.f224378d;
        ItemRoom itemRoom = (ItemRoom) item;
        String uid = itemRoom.getUid();
        if (Intrinsics.areEqual("floor", materialName)) {
            z11 = z10;
        } else {
            z11 = !itemRoom.getFloorHidden();
        }
        if (!Intrinsics.areEqual("ceil", materialName)) {
            z10 = !itemRoom.getCeilingHidden();
        }
        aVar.o(new l.c(new com.planner5d.library.widget.editor.editaction.l(uid, z11, z10), new com.planner5d.library.widget.editor.editaction.l(itemRoom.getUid(), !itemRoom.getFloorHidden(), !itemRoom.getCeilingHidden())));
    }
}

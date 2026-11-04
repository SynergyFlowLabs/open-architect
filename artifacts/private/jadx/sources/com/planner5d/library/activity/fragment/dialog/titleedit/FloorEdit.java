package com.planner5d.library.activity.fragment.dialog.titleedit;

import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.f;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class FloorEdit extends TitleEdit<ItemFloor, Pair<ItemFloor, String>> {
    public static final int $stable = 0;

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    protected Object T(long j10, @NotNull kotlin.coroutines.d<? super ItemFloor> dVar) {
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @NotNull
    protected String U() {
        String string = getString(f.s.Wr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public ItemFloor getModel() {
        Object objA = A();
        if (objA instanceof ItemFloor) {
            return (ItemFloor) objA;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public String getModelTitle(@Nullable ItemFloor itemFloor) {
        if (itemFloor != null) {
            return itemFloor.title;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @NotNull
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public String getTitle(@Nullable ItemFloor itemFloor) {
        String string = getString(itemFloor == null ? f.s.X : f.s.lz);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void save(@Nullable ItemFloor itemFloor, @Nullable String str) {
        if (itemFloor == null) {
            Object objA = A();
            ItemProject itemProject = objA instanceof ItemProject ? (ItemProject) objA : null;
            if (itemProject == null) {
                return;
            }
            ItemFloor itemFloor2 = new ItemFloor(itemProject.getNextFreeUid());
            itemFloor2.title = str;
            itemFloor = itemFloor2;
        }
        sendResultOnce(new Pair(itemFloor, str));
    }
}

package com.planner5d.library.widget.editor.facade;

import android.os.Bundle;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ProviderUid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface k0 {
    boolean E();

    boolean a();

    @Nullable
    com.planner5d.library.widget.editor.a b();

    @Nullable
    Bundle d();

    @Nullable
    ItemProject getItem();

    @Nullable
    Project getModel();

    boolean i();

    @NotNull
    ProviderUid j();

    boolean l();

    @Nullable
    String r();
}

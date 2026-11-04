package com.planner5d.library.widget.editor.editaction;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class i extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f254774c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ItemLayout.Flip f254775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@Nullable String str, @NotNull ItemLayout.Flip flip) {
        super(str);
        Intrinsics.checkNotNullParameter(flip, "flip");
        this.f254775b = flip;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Item itemA = provider.a(this.f254756a);
        if (itemA != null) {
            itemA.setLayout(itemA.getLayout(new ItemLayout()).setFlip(this.f254775b));
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NotNull h provider) {
        com.planner5d.library.widget.editor.editor3d.scene3d.j jVar;
        Intrinsics.checkNotNullParameter(provider, "provider");
        Item itemA = provider.a(this.f254756a);
        if (itemA == null || (jVar = provider.f254765c) == null) {
            return;
        }
        jVar.L(itemA, true);
    }
}

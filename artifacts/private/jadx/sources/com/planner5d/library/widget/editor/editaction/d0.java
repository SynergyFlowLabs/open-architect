package com.planner5d.library.widget.editor.editaction;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemRoom;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class d0 extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f254754c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f254755b;

    public d0(@Nullable String str, @Nullable String str2) {
        super(str);
        this.f254755b = str2;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Item itemA = provider.a(this.f254756a);
        if (itemA instanceof ItemRoom) {
            ((ItemRoom) itemA).setTitle(this.f254755b);
        }
    }
}

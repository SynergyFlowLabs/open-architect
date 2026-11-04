package com.planner5d.library.model.item;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.editor.editor2d.drawable.q;
import com.planner5d.library.widget.editor.editor2d.drawable.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class ItemUnknown extends Item {
    public static final int $stable = 8;

    @NotNull
    private final JSONObject json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemUnknown(@NotNull String uid, @NotNull JSONObject json) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = new JSONObject(json.toString());
    }

    @Override // com.planner5d.library.model.item.Item
    @NotNull
    protected w createDrawables() {
        w wVarG = w.g(new q());
        Intrinsics.checkNotNullExpressionValue(wVarG, "create(...)");
        return wVarG;
    }

    @NotNull
    public final JSONObject getJson() {
        return this.json;
    }

    @Override // com.planner5d.library.model.item.Item
    @NotNull
    public ItemMaterial[] getMaterials() {
        return new ItemMaterial[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemUnknown(@NotNull ItemUnknown item, @Nullable ProviderUid providerUid) {
        super(item, providerUid);
        Intrinsics.checkNotNullParameter(item, "item");
        this.json = new JSONObject(item.json.toString());
    }
}

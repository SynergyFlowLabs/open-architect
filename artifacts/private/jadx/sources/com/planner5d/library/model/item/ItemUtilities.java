package com.planner5d.library.model.item;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.f;
import com.planner5d.library.model.payments.a;
import com.planner5d.library.services.textspan.b;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nItemUtilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemUtilities.kt\ncom/planner5d/library/model/item/ItemUtilities\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n11483#2,9:32\n13409#2:41\n13410#2:43\n11492#2:44\n1#3:42\n*S KotlinDebug\n*F\n+ 1 ItemUtilities.kt\ncom/planner5d/library/model/item/ItemUtilities\n*L\n27#1:32,9\n27#1:41\n27#1:43\n27#1:44\n27#1:42\n*E\n"})
public final class ItemUtilities {
    public static final int $stable = 0;

    @NotNull
    public static final ItemUtilities INSTANCE = new ItemUtilities();

    private ItemUtilities() {
    }

    @NotNull
    public final String getTitle(@Nullable Context context, @Nullable Item item) {
        int i10;
        if (context != null) {
            if (item instanceof ItemNs) {
                return "#" + ((ItemNs) item).getModelId();
            }
            if (item instanceof ItemGround) {
                i10 = item instanceof ItemRoom ? f.s.Rz : f.s.At;
            } else if (item instanceof ItemWall) {
                i10 = item instanceof ItemRuler ? f.s.uA : f.s.bH;
            } else if (item instanceof ItemPr) {
                i10 = f.s.f169241l2;
            } else {
                i10 = item instanceof ItemPoint ? f.s.lu : f.s.qG;
            }
            String string = context.getString(i10);
            if (string != null) {
                return string;
            }
        }
        return a.f222474i;
    }

    @Nullable
    public final CharSequence getTitleWithIds(@NotNull Context context, @NotNull Item... items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.length == 0) {
            return null;
        }
        String title = getTitle(context, items[0]);
        ArrayList arrayList = new ArrayList();
        for (Item item : items) {
            String uid = item.getUid();
            if (uid != null) {
                arrayList.add(uid);
            }
        }
        String str = String.format("%1$s <small>(%2$s)</small>", Arrays.copyOf(new Object[]{title, CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return b.d(str);
    }
}

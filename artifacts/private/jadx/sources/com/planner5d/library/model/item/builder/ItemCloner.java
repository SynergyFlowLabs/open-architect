package com.planner5d.library.model.item.builder;

import androidx.annotation.NonNull;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ProviderUid;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public class ItemCloner {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Item> T[] clone(Class<T> cls, @NonNull T[] tArr, ItemFloor itemFloor, ProviderUid providerUid) {
        T[] tArr2 = (T[]) ((Item[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i10 = 0; i10 < tArr.length; i10++) {
            tArr2[i10] = clone(tArr[i10], itemFloor, providerUid);
        }
        return tArr2;
    }

    public static <T extends Item> T clone(@NonNull T t10, ItemFloor itemFloor, ProviderUid providerUid) {
        try {
            Class<?> cls = t10.getClass();
            if (!(t10 instanceof ItemRoom)) {
                return (T) cls.getConstructor(t10.getClass(), ProviderUid.class).newInstance(t10, providerUid);
            }
            if (itemFloor == null) {
                itemFloor = (ItemFloor) t10.getParentItem();
            }
            return (T) cls.getConstructor(t10.getClass(), ItemFloor.class, ProviderUid.class).newInstance(t10, itemFloor, providerUid);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}

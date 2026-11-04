package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public static List<io.sentry.i0> a(@Nullable List<io.sentry.internal.eventprocessor.a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<io.sentry.internal.eventprocessor.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().k());
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}

package org.locationtech.jts.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    public interface a {
        Object a(Object obj);
    }

    public static void a(Collection collection, a aVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }

    public static List b(Collection collection, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Boolean.TRUE.equals(aVar.a(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List c(Collection collection, a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a(it.next()));
        }
        return arrayList;
    }
}

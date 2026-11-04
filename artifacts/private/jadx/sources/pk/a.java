package pk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.collections4.iterators.v;

/* JADX INFO: loaded from: classes14.dex */
public class a extends Properties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f350194a = 1;

    @Override // java.util.Hashtable, java.util.Dictionary
    public synchronized Enumeration<Object> keys() {
        ArrayList arrayList;
        try {
            Set<Object> setKeySet = keySet();
            arrayList = new ArrayList(setKeySet.size());
            Iterator<Object> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            Collections.sort(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return new v(arrayList.iterator());
    }
}

package bm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.commonmark.node.v;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends v>, dm.a> f82329a = new HashMap(32);

    public void a(dm.a aVar) {
        Iterator<Class<? extends v>> it = aVar.J().iterator();
        while (it.hasNext()) {
            this.f82329a.put(it.next(), aVar);
        }
    }

    public void b(v vVar) {
        dm.a aVar = this.f82329a.get(vVar.getClass());
        if (aVar != null) {
            aVar.a(vVar);
        }
    }
}

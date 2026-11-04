package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f312782a;

    public p1(int i10) {
        this.f312782a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f312782a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f312782a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f312782a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f312782a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f312782a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f312782a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f312782a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f312782a.toArray(objArr);
    }
}

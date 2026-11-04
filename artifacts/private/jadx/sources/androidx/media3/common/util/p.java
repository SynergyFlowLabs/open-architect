package androidx.media3.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class p<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f61591a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private final Map<E, Integer> f61592b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private Set<E> f61593c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private List<E> f61594d = Collections.EMPTY_LIST;

    public int P3(E e10) {
        int iIntValue;
        synchronized (this.f61591a) {
            try {
                iIntValue = this.f61592b.containsKey(e10) ? this.f61592b.get(e10).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void c(E e10) {
        synchronized (this.f61591a) {
            try {
                ArrayList arrayList = new ArrayList(this.f61594d);
                arrayList.add(e10);
                this.f61594d = Collections.unmodifiableList(arrayList);
                Integer num = this.f61592b.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f61593c);
                    hashSet.add(e10);
                    this.f61593c = Collections.unmodifiableSet(hashSet);
                }
                this.f61592b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(E e10) {
        synchronized (this.f61591a) {
            try {
                Integer num = this.f61592b.get(e10);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f61594d);
                arrayList.remove(e10);
                this.f61594d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f61592b.remove(e10);
                    HashSet hashSet = new HashSet(this.f61593c);
                    hashSet.remove(e10);
                    this.f61593c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f61592b.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f61591a) {
            try {
                it = this.f61594d.iterator();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return it;
    }

    public Set<E> o() {
        Set<E> set;
        synchronized (this.f61591a) {
            try {
                set = this.f61593c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }
}

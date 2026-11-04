package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f336882a = new b();

    private static final class b implements f, d {
        @Override // org.apache.commons.lang3.b0.d
        public boolean a(ThreadGroup threadGroup) {
            return true;
        }

        @Override // org.apache.commons.lang3.b0.f
        public boolean b(Thread thread) {
            return true;
        }

        private b() {
        }
    }

    public static class c implements f, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f336883a;

        public c(String str) {
            c0.v(str != null, "The name must not be null", new Object[0]);
            this.f336883a = str;
        }

        @Override // org.apache.commons.lang3.b0.d
        public boolean a(ThreadGroup threadGroup) {
            return threadGroup != null && threadGroup.getName().equals(this.f336883a);
        }

        @Override // org.apache.commons.lang3.b0.f
        public boolean b(Thread thread) {
            return thread != null && thread.getName().equals(this.f336883a);
        }
    }

    public interface d {
        boolean a(ThreadGroup threadGroup);
    }

    public static class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f336884a;

        public e(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("The thread id must be greater than zero");
            }
            this.f336884a = j10;
        }

        @Override // org.apache.commons.lang3.b0.f
        public boolean b(Thread thread) {
            return thread != null && thread.getId() == this.f336884a;
        }
    }

    public interface f {
        boolean b(Thread thread);
    }

    public static Thread a(long j10) {
        Collection<Thread> collectionH = h(new e(j10));
        if (collectionH.isEmpty()) {
            return null;
        }
        return collectionH.iterator().next();
    }

    public static Thread b(long j10, String str) {
        c0.v(str != null, "The thread group name must not be null", new Object[0]);
        Thread threadA = a(j10);
        if (threadA == null || threadA.getThreadGroup() == null || !threadA.getThreadGroup().getName().equals(str)) {
            return null;
        }
        return threadA;
    }

    public static Thread c(long j10, ThreadGroup threadGroup) {
        c0.v(threadGroup != null, "The thread group must not be null", new Object[0]);
        Thread threadA = a(j10);
        if (threadA == null || !threadGroup.equals(threadA.getThreadGroup())) {
            return null;
        }
        return threadA;
    }

    public static Collection<ThreadGroup> d(ThreadGroup threadGroup, boolean z10, d dVar) {
        ThreadGroup[] threadGroupArr;
        int iEnumerate;
        c0.v(threadGroup != null, "The group must not be null", new Object[0]);
        c0.v(dVar != null, "The predicate must not be null", new Object[0]);
        int iActiveGroupCount = threadGroup.activeGroupCount();
        while (true) {
            int i10 = iActiveGroupCount + (iActiveGroupCount / 2) + 1;
            threadGroupArr = new ThreadGroup[i10];
            iEnumerate = threadGroup.enumerate(threadGroupArr, z10);
            if (iEnumerate < i10) {
                break;
            }
            iActiveGroupCount = iEnumerate;
        }
        ArrayList arrayList = new ArrayList(iEnumerate);
        for (int i11 = 0; i11 < iEnumerate; i11++) {
            if (dVar.a(threadGroupArr[i11])) {
                arrayList.add(threadGroupArr[i11]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> e(d dVar) {
        return d(n(), true, dVar);
    }

    public static Collection<ThreadGroup> f(String str) {
        return e(new c(str));
    }

    public static Collection<Thread> g(ThreadGroup threadGroup, boolean z10, f fVar) {
        Thread[] threadArr;
        int iEnumerate;
        c0.v(threadGroup != null, "The group must not be null", new Object[0]);
        c0.v(fVar != null, "The predicate must not be null", new Object[0]);
        int iActiveCount = threadGroup.activeCount();
        while (true) {
            int i10 = iActiveCount + (iActiveCount / 2) + 1;
            threadArr = new Thread[i10];
            iEnumerate = threadGroup.enumerate(threadArr, z10);
            if (iEnumerate < i10) {
                break;
            }
            iActiveCount = iEnumerate;
        }
        ArrayList arrayList = new ArrayList(iEnumerate);
        for (int i11 = 0; i11 < iEnumerate; i11++) {
            if (fVar.b(threadArr[i11])) {
                arrayList.add(threadArr[i11]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> h(f fVar) {
        return g(n(), true, fVar);
    }

    public static Collection<Thread> i(String str) {
        return h(new c(str));
    }

    public static Collection<Thread> j(String str, String str2) {
        int i10 = 5 << 0;
        c0.v(str != null, "The thread name must not be null", new Object[0]);
        c0.v(str2 != null, "The thread group name must not be null", new Object[0]);
        Collection<ThreadGroup> collectionE = e(new c(str2));
        if (collectionE.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        c cVar = new c(str);
        Iterator<ThreadGroup> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.addAll(g(it.next(), false, cVar));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> k(String str, ThreadGroup threadGroup) {
        return g(threadGroup, false, new c(str));
    }

    public static Collection<ThreadGroup> l() {
        return e(f336882a);
    }

    public static Collection<Thread> m() {
        return h(f336882a);
    }

    public static ThreadGroup n() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }
}

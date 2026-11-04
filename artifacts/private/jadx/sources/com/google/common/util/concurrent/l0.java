package com.google.common.util.concurrent;

import com.google.common.collect.b8;
import com.google.common.collect.x7;
import com.google.common.collect.z6;
import com.google.common.collect.z7;
import com.google.common.collect.z9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> f120184b = new z7().l().i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s1 f120185c = new s1(l0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<h>> f120186d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j f120187a;

    class a extends ThreadLocal<ArrayList<h>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<h> initialValue() {
            return x7.u(3);
        }
    }

    private interface b {
        h a();

        boolean b();
    }

    final class c extends ReentrantLock implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f120188a;

        /* synthetic */ c(l0 l0Var, h hVar, boolean z10, a aVar) {
            this(hVar, z10);
        }

        @Override // com.google.common.util.concurrent.l0.b
        public h a() {
            return this.f120188a;
        }

        @Override // com.google.common.util.concurrent.l0.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            l0.this.a(this);
            try {
                super.lock();
            } finally {
                l0.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            l0.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                l0.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            l0.this.a(this);
            try {
                return super.tryLock();
            } finally {
                l0.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                l0.h(this);
            }
        }

        private c(h lockGraphNode, boolean fair) {
            super(fair);
            this.f120188a = (h) com.google.common.base.j0.E(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            l0.this.a(this);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                l0.h(this);
            }
        }
    }

    final class e extends ReentrantReadWriteLock implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f120192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f120193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f120194c;

        /* synthetic */ e(l0 l0Var, h hVar, boolean z10, a aVar) {
            this(hVar, z10);
        }

        @Override // com.google.common.util.concurrent.l0.b
        public h a() {
            return this.f120194c;
        }

        @Override // com.google.common.util.concurrent.l0.b
        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        private e(h lockGraphNode, boolean fair) {
            super(fair);
            this.f120192a = l0.this.new d(this);
            this.f120193b = l0.this.new f(this);
            this.f120194c = (h) com.google.common.base.j0.E(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f120192a;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f120193b;
        }
    }

    private static class g extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f120198a = new StackTraceElement[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final z6<String> f120199b = z6.L(l0.class.getName(), g.class.getName(), h.class.getName());

        g(h node1, h node2) {
            super(node1.d() + " -> " + node2.d());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            int i10 = 7 << 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (l.class.getName().equals(stackTrace[i11].getClassName())) {
                    setStackTrace(f120198a);
                    return;
                } else {
                    if (!f120199b.contains(stackTrace[i11].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11, length));
                        return;
                    }
                }
            }
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<h, g> f120200a = new z7().l().i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<h, k> f120201b = new z7().l().i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f120202c;

        h(String lockName) {
            this.f120202c = (String) com.google.common.base.j0.E(lockName);
        }

        @fj.a
        private g c(h node, Set<h> seen) {
            if (!seen.add(this)) {
                return null;
            }
            g gVar = this.f120200a.get(node);
            if (gVar != null) {
                return gVar;
            }
            for (Map.Entry<h, g> entry : this.f120200a.entrySet()) {
                h key = entry.getKey();
                g gVarC = key.c(node, seen);
                if (gVarC != null) {
                    g gVar2 = new g(key, this);
                    gVar2.setStackTrace(entry.getValue().getStackTrace());
                    gVar2.initCause(gVarC);
                    return gVar2;
                }
            }
            return null;
        }

        void a(j policy, h acquiredLock) {
            com.google.common.base.j0.x0(this != acquiredLock, "Attempted to acquire multiple locks with the same rank %s", acquiredLock.d());
            if (this.f120200a.containsKey(acquiredLock)) {
                return;
            }
            k kVar = this.f120201b.get(acquiredLock);
            a aVar = null;
            if (kVar != null) {
                policy.b(new k(acquiredLock, this, kVar.a(), aVar));
                return;
            }
            g gVarC = acquiredLock.c(this, z9.z());
            if (gVarC == null) {
                this.f120200a.put(acquiredLock, new g(acquiredLock, this));
                return;
            }
            k kVar2 = new k(acquiredLock, this, gVarC, aVar);
            this.f120201b.put(acquiredLock, kVar2);
            policy.b(kVar2);
        }

        void b(j policy, List<h> acquiredLocks) {
            Iterator<h> it = acquiredLocks.iterator();
            while (it.hasNext()) {
                a(policy, it.next());
            }
        }

        String d() {
            return this.f120202c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f120203a = new a("THROW", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f120204b = new b("WARN", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f120205c = new c("DISABLED", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ i[] f120206d = k();

        final enum a extends i {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.l0.j
            public void b(k e10) {
                throw e10;
            }
        }

        final enum b extends i {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.l0.j
            public void b(k e10) {
                l0.f120185c.a().log(Level.SEVERE, "Detected potential deadlock", (Throwable) e10);
            }
        }

        final enum c extends i {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.util.concurrent.l0.j
            public void b(k e10) {
            }
        }

        private i(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ i[] k() {
            return new i[]{f120203a, f120204b, f120205c};
        }

        public static i valueOf(String name) {
            return (i) Enum.valueOf(i.class, name);
        }

        public static i[] values() {
            return (i[]) f120206d.clone();
        }

        /* synthetic */ i(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    public interface j {
        void b(k exception);
    }

    public static final class k extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f120207c;

        /* synthetic */ k(h hVar, h hVar2, g gVar, a aVar) {
            this(hVar, hVar2, gVar);
        }

        public g a() {
            return this.f120207c;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f120207c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }

        private k(h node1, h node2, g conflictingStackTrace) {
            super(node1, node2);
            this.f120207c = conflictingStackTrace;
            initCause(conflictingStackTrace);
        }
    }

    public static final class l<E extends Enum<E>> extends l0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<E, h> f120208e;

        @com.google.common.annotations.e
        l(j policy, Map<E, h> lockGraphNodes) {
            super(policy, null);
            this.f120208e = lockGraphNodes;
        }

        public ReentrantLock o(E rank) {
            return p(rank, false);
        }

        public ReentrantLock p(E rank, boolean fair) {
            if (this.f120187a == i.f120205c) {
                return new ReentrantLock(fair);
            }
            h hVar = this.f120208e.get(rank);
            Objects.requireNonNull(hVar);
            return new c(this, hVar, fair, null);
        }

        public ReentrantReadWriteLock q(E rank) {
            return r(rank, false);
        }

        public ReentrantReadWriteLock r(E rank, boolean fair) {
            if (this.f120187a == i.f120205c) {
                return new ReentrantReadWriteLock(fair);
            }
            h hVar = this.f120208e.get(rank);
            Objects.requireNonNull(hVar);
            return new e(this, hVar, fair, null);
        }
    }

    /* synthetic */ l0(j jVar, a aVar) {
        this(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b lock) {
        if (lock.b()) {
            return;
        }
        ArrayList<h> arrayList = f120186d.get();
        Objects.requireNonNull(arrayList);
        h hVarA = lock.a();
        hVarA.b(this.f120187a, arrayList);
        arrayList.add(hVarA);
    }

    @com.google.common.annotations.e
    static <E extends Enum<E>> Map<E, h> e(Class<E> clazz) {
        EnumMap enumMapW = b8.W(clazz);
        E[] enumConstants = clazz.getEnumConstants();
        int length = enumConstants.length;
        ArrayList arrayListU = x7.u(length);
        int i10 = 0;
        for (E e10 : enumConstants) {
            h hVar = new h(f(e10));
            arrayListU.add(hVar);
            enumMapW.put(e10, hVar);
        }
        for (int i11 = 1; i11 < length; i11++) {
            ((h) arrayListU.get(i11)).b(i.f120203a, arrayListU.subList(0, i11));
        }
        while (i10 < length - 1) {
            i10++;
            ((h) arrayListU.get(i10)).b(i.f120205c, arrayListU.subList(i10, length));
        }
        return Collections.unmodifiableMap(enumMapW);
    }

    private static String f(Enum<?> rank) {
        return rank.getDeclaringClass().getSimpleName() + "." + rank.name();
    }

    private static <E extends Enum<E>> Map<? extends E, h> g(Class<E> clazz) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> concurrentMap = f120184b;
        Map<? extends E, h> map = (Map) concurrentMap.get(clazz);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, h> mapE = e(clazz);
        return (Map) com.google.common.base.b0.a(concurrentMap.putIfAbsent(clazz, mapE), mapE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(b lock) {
        if (lock.b()) {
            return;
        }
        ArrayList<h> arrayList = f120186d.get();
        Objects.requireNonNull(arrayList);
        h hVarA = lock.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVarA) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static l0 i(j policy) {
        return new l0(policy);
    }

    public static <E extends Enum<E>> l<E> j(Class<E> enumClass, j policy) {
        com.google.common.base.j0.E(enumClass);
        com.google.common.base.j0.E(policy);
        return new l<>(policy, g(enumClass));
    }

    public ReentrantLock k(String lockName) {
        return l(lockName, false);
    }

    public ReentrantLock l(String lockName, boolean fair) {
        return this.f120187a == i.f120205c ? new ReentrantLock(fair) : new c(this, new h(lockName), fair, null);
    }

    public ReentrantReadWriteLock m(String lockName) {
        return n(lockName, false);
    }

    public ReentrantReadWriteLock n(String lockName, boolean fair) {
        return this.f120187a == i.f120205c ? new ReentrantReadWriteLock(fair) : new e(this, new h(lockName), fair, null);
    }

    private l0(j policy) {
        this.f120187a = (j) com.google.common.base.j0.E(policy);
    }

    private class d extends ReentrantReadWriteLock.ReadLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final e f120190a;

        d(e readWriteLock) {
            super(readWriteLock);
            this.f120190a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            l0.this.a(this.f120190a);
            try {
                super.lock();
                l0.h(this.f120190a);
            } catch (Throwable th2) {
                l0.h(this.f120190a);
                throw th2;
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            l0.this.a(this.f120190a);
            try {
                super.lockInterruptibly();
                e eVar = this.f120190a;
            } finally {
                l0.h(this.f120190a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            l0.this.a(this.f120190a);
            try {
                boolean zTryLock = super.tryLock();
                l0.h(this.f120190a);
                return zTryLock;
            } catch (Throwable th2) {
                l0.h(this.f120190a);
                throw th2;
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                l0.h(this.f120190a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            l0.this.a(this.f120190a);
            try {
                boolean zTryLock = super.tryLock(timeout, unit);
                l0.h(this.f120190a);
                return zTryLock;
            } catch (Throwable th2) {
                l0.h(this.f120190a);
                throw th2;
            }
        }
    }

    private class f extends ReentrantReadWriteLock.WriteLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final e f120196a;

        f(e readWriteLock) {
            super(readWriteLock);
            this.f120196a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            l0.this.a(this.f120196a);
            try {
                super.lock();
                e eVar = this.f120196a;
            } finally {
                l0.h(this.f120196a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            l0.this.a(this.f120196a);
            try {
                super.lockInterruptibly();
                e eVar = this.f120196a;
            } finally {
                l0.h(this.f120196a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            l0.this.a(this.f120196a);
            try {
                return super.tryLock();
            } finally {
                l0.h(this.f120196a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
                l0.h(this.f120196a);
            } catch (Throwable th2) {
                l0.h(this.f120196a);
                throw th2;
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            l0.this.a(this.f120196a);
            try {
                boolean zTryLock = super.tryLock(timeout, unit);
                l0.h(this.f120196a);
                return zTryLock;
            } catch (Throwable th2) {
                l0.h(this.f120196a);
                throw th2;
            }
        }
    }
}

package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@y
abstract class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b2 f125793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b2 f125794b;

    private static final class b extends b2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?> f125795c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object message, long offset) {
            return (List) t4.Q(message, offset);
        }

        private static <L> List<L> g(Object message, long offset, int additionalCapacity) {
            List<L> listB2;
            List<L> listF = f(message, offset);
            if (listF.isEmpty()) {
                if (listF instanceof a2) {
                    listB2 = new z1(additionalCapacity);
                } else {
                    listB2 = ((listF instanceof g3) && (listF instanceof s1.k)) ? ((s1.k) listF).b2(additionalCapacity) : new ArrayList<>(additionalCapacity);
                }
                t4.t0(message, offset, listB2);
                return listB2;
            }
            if (f125795c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + additionalCapacity);
                arrayList.addAll(listF);
                t4.t0(message, offset, arrayList);
                return arrayList;
            }
            if (listF instanceof r4) {
                z1 z1Var = new z1(listF.size() + additionalCapacity);
                z1Var.addAll((r4) listF);
                t4.t0(message, offset, z1Var);
                return z1Var;
            }
            if ((listF instanceof g3) && (listF instanceof s1.k)) {
                s1.k kVar = (s1.k) listF;
                if (!kVar.s1()) {
                    s1.k kVarB2 = kVar.b2(listF.size() + additionalCapacity);
                    t4.t0(message, offset, kVarB2);
                    return kVarB2;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.b2
        void c(Object message, long offset) {
            Object objUnmodifiableList;
            List list = (List) t4.Q(message, offset);
            if (list instanceof a2) {
                objUnmodifiableList = ((a2) list).T0();
            } else {
                if (f125795c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof g3) && (list instanceof s1.k)) {
                    s1.k kVar = (s1.k) list;
                    if (kVar.s1()) {
                        kVar.e1();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            t4.t0(message, offset, objUnmodifiableList);
        }

        @Override // com.google.protobuf.b2
        <E> void d(Object msg, Object otherMsg, long offset) {
            List listF = f(otherMsg, offset);
            List listG = g(msg, offset, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            t4.t0(msg, offset, listF);
        }

        @Override // com.google.protobuf.b2
        <L> List<L> e(Object message, long offset) {
            return g(message, offset, 10);
        }
    }

    private static final class c extends b2 {
        private c() {
            super();
        }

        static <E> s1.k<E> f(Object message, long offset) {
            return (s1.k) t4.Q(message, offset);
        }

        @Override // com.google.protobuf.b2
        void c(Object message, long offset) {
            f(message, offset).e1();
        }

        @Override // com.google.protobuf.b2
        <E> void d(Object msg, Object otherMsg, long offset) {
            s1.k kVarF = f(msg, offset);
            s1.k kVarF2 = f(otherMsg, offset);
            int size = kVarF.size();
            int size2 = kVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!kVarF.s1()) {
                    kVarF = kVarF.b2(size2 + size);
                }
                kVarF.addAll(kVarF2);
            }
            if (size > 0) {
                kVarF2 = kVarF;
            }
            t4.t0(msg, offset, kVarF2);
        }

        @Override // com.google.protobuf.b2
        <L> List<L> e(Object message, long offset) {
            s1.k kVarF = f(message, offset);
            if (kVarF.s1()) {
                return kVarF;
            }
            int size = kVarF.size();
            s1.k kVarB2 = kVarF.b2(size == 0 ? 10 : size * 2);
            t4.t0(message, offset, kVarB2);
            return kVarB2;
        }
    }

    static {
        f125793a = new b();
        f125794b = new c();
    }

    static b2 a() {
        return f125793a;
    }

    static b2 b() {
        return f125794b;
    }

    abstract void c(Object msg, long offset);

    abstract <L> void d(Object msg, Object otherMsg, long offset);

    abstract <L> List<L> e(Object msg, long offset);

    private b2() {
    }
}

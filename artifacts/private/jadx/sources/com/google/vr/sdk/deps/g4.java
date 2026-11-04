package com.google.vr.sdk.deps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class g4 extends e4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f129412c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private g4() {
        super((byte) 0);
    }

    private static <L> List<L> f(Object obj, long j10, int i10) {
        List<L> listN3;
        List<L> listG = g(obj, j10);
        if (listG.isEmpty()) {
            if (listG instanceof d4) {
                listN3 = new c4(i10);
            } else {
                listN3 = ((listG instanceof d5) && (listG instanceof u3)) ? ((u3) listG).N3(i10) : new ArrayList<>(i10);
            }
            f6.l(obj, j10, listN3);
            return listN3;
        }
        if (f129412c.isAssignableFrom(listG.getClass())) {
            ArrayList arrayList = new ArrayList(listG.size() + i10);
            arrayList.addAll(listG);
            f6.l(obj, j10, arrayList);
            return arrayList;
        }
        if (listG instanceof c6) {
            c4 c4Var = new c4(listG.size() + i10);
            c4Var.addAll((c6) listG);
            f6.l(obj, j10, c4Var);
            return c4Var;
        }
        if ((listG instanceof d5) && (listG instanceof u3)) {
            u3 u3Var = (u3) listG;
            if (!u3Var.y()) {
                u3 u3VarN3 = u3Var.N3(listG.size() + i10);
                f6.l(obj, j10, u3VarN3);
                return u3VarN3;
            }
        }
        return listG;
    }

    private static <E> List<E> g(Object obj, long j10) {
        return (List) f6.I(obj, j10);
    }

    @Override // com.google.vr.sdk.deps.e4
    final <L> List<L> b(Object obj, long j10) {
        return f(obj, j10, 10);
    }

    @Override // com.google.vr.sdk.deps.e4
    final <E> void c(Object obj, Object obj2, long j10) {
        List listG = g(obj2, j10);
        List listF = f(obj, j10, listG.size());
        int size = listF.size();
        int size2 = listG.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(listG);
        }
        if (size > 0) {
            listG = listF;
        }
        f6.l(obj, j10, listG);
    }

    @Override // com.google.vr.sdk.deps.e4
    final void e(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) f6.I(obj, j10);
        if (list instanceof d4) {
            objUnmodifiableList = ((d4) list).e();
        } else {
            if (f129412c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof d5) && (list instanceof u3)) {
                u3 u3Var = (u3) list;
                if (u3Var.y()) {
                    u3Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        f6.l(obj, j10, objUnmodifiableList);
    }

    /* synthetic */ g4(byte b10) {
        this();
    }
}

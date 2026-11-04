package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class g4 extends k4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f107639c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ g4(f4 f4Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.k4
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) k6.f(obj, j10);
        if (!(list instanceof e4)) {
            if (!f107639c.isAssignableFrom(list.getClass())) {
                if ((list instanceof e5) && (list instanceof x3)) {
                    x3 x3Var = (x3) list;
                    if (x3Var.h()) {
                        x3Var.g();
                    }
                } else {
                    objUnmodifiableList = Collections.unmodifiableList(list);
                }
            }
            return;
        }
        objUnmodifiableList = ((e4) list).j();
        k6.p(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.k4
    final void b(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List listE;
        List list3 = (List) k6.f(obj2, j10);
        int size = list3.size();
        List list4 = (List) k6.f(obj, j10);
        if (list4.isEmpty()) {
            if (list4 instanceof e4) {
                listE = new d4(size);
            } else {
                listE = ((list4 instanceof e5) && (list4 instanceof x3)) ? ((x3) list4).e(size) : new ArrayList(size);
            }
            k6.p(obj, j10, listE);
            list2 = listE;
        } else {
            if (f107639c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                k6.p(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof f6) {
                d4 d4Var = new d4(list4.size() + size);
                d4Var.addAll(d4Var.size(), (f6) list4);
                k6.p(obj, j10, d4Var);
                list = d4Var;
            } else if ((list4 instanceof e5) && (list4 instanceof x3)) {
                x3 x3Var = (x3) list4;
                if (!x3Var.h()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    x3 x3VarE = x3Var.e(list4.size() + size);
                    k6.p(obj, j10, x3VarE);
                    list2 = x3VarE;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        k6.p(obj, j10, size2 <= 0 ? list3 : list2);
    }

    private g4() {
        super(null);
    }
}

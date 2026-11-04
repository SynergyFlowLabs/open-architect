package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.r;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class f extends b0<com.google.gson.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f125342a = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125343a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f125343a = iArr;
            try {
                iArr[com.google.gson.stream.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125343a[com.google.gson.stream.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125343a[com.google.gson.stream.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125343a[com.google.gson.stream.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125343a[com.google.gson.stream.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125343a[com.google.gson.stream.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private com.google.gson.l b(com.google.gson.stream.a aVar, com.google.gson.stream.c cVar) throws IOException {
        int i10 = a.f125343a[cVar.ordinal()];
        if (i10 == 3) {
            return new r(aVar.jc());
        }
        if (i10 == 4) {
            return new r(new com.google.gson.internal.b0(aVar.jc()));
        }
        if (i10 == 5) {
            return new r(Boolean.valueOf(aVar.nextBoolean()));
        }
        if (i10 == 6) {
            aVar.a7();
            return com.google.gson.n.f125555a;
        }
        throw new IllegalStateException("Unexpected token: " + cVar);
    }

    private com.google.gson.l c(com.google.gson.stream.a aVar, com.google.gson.stream.c cVar) throws IOException {
        int i10 = a.f125343a[cVar.ordinal()];
        if (i10 == 1) {
            aVar.J0();
            return new com.google.gson.i();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.m1();
        return new com.google.gson.o();
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.google.gson.l read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar instanceof g) {
            return ((g) aVar).k0();
        }
        com.google.gson.stream.c cVarX = aVar.x();
        com.google.gson.l lVarC = c(aVar, cVarX);
        if (lVarC == null) {
            return b(aVar, cVarX);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strNa = lVarC instanceof com.google.gson.o ? aVar.na() : null;
                com.google.gson.stream.c cVarX2 = aVar.x();
                com.google.gson.l lVarC2 = c(aVar, cVarX2);
                boolean z10 = lVarC2 != null;
                if (lVarC2 == null) {
                    lVarC2 = b(aVar, cVarX2);
                }
                if (lVarC instanceof com.google.gson.i) {
                    ((com.google.gson.i) lVarC).L(lVarC2);
                } else {
                    ((com.google.gson.o) lVarC).L(strNa, lVarC2);
                }
                if (z10) {
                    arrayDeque.addLast(lVarC);
                    lVarC = lVarC2;
                }
            } else {
                if (lVarC instanceof com.google.gson.i) {
                    aVar.F0();
                } else {
                    aVar.F1();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarC;
                }
                lVarC = (com.google.gson.l) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, com.google.gson.l lVar) throws IOException {
        if (lVar == null || lVar.G()) {
            dVar.y();
            return;
        }
        if (lVar.K()) {
            r rVarW = lVar.w();
            if (rVarW.O()) {
                dVar.r0(rVarW.B());
                return;
            } else if (rVarW.M()) {
                dVar.x0(rVarW.l());
                return;
            } else {
                dVar.w0(rVarW.D());
                return;
            }
        }
        if (lVar.F()) {
            dVar.d();
            Iterator<com.google.gson.l> it = lVar.t().iterator();
            while (it.hasNext()) {
                write(dVar, it.next());
            }
            dVar.g();
            return;
        }
        if (!lVar.J()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        dVar.e();
        for (Map.Entry<String, com.google.gson.l> entry : lVar.v().entrySet()) {
            dVar.t(entry.getKey());
            write(dVar, entry.getValue());
        }
        dVar.h();
    }
}

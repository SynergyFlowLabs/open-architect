package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends b0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f125361c = b(z.f125653a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f125362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f125363b;

    class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f125364a;

        a(a0 a0Var) {
            this.f125364a = a0Var;
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Object.class) {
                return new k(fVar, this.f125364a, aVar2);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125365a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f125365a = iArr;
            try {
                iArr[com.google.gson.stream.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125365a[com.google.gson.stream.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125365a[com.google.gson.stream.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125365a[com.google.gson.stream.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125365a[com.google.gson.stream.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125365a[com.google.gson.stream.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ k(com.google.gson.f fVar, a0 a0Var, a aVar) {
        this(fVar, a0Var);
    }

    public static c0 a(a0 a0Var) {
        return a0Var == z.f125653a ? f125361c : b(a0Var);
    }

    private static c0 b(a0 a0Var) {
        return new a(a0Var);
    }

    private Object c(com.google.gson.stream.a aVar, com.google.gson.stream.c cVar) throws IOException {
        int i10 = b.f125365a[cVar.ordinal()];
        if (i10 == 3) {
            return aVar.jc();
        }
        if (i10 == 4) {
            return this.f125363b.b(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.nextBoolean());
        }
        if (i10 == 6) {
            aVar.a7();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + cVar);
    }

    private Object d(com.google.gson.stream.a aVar, com.google.gson.stream.c cVar) throws IOException {
        int i10 = b.f125365a[cVar.ordinal()];
        if (i10 == 1) {
            aVar.J0();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.m1();
        return new com.google.gson.internal.c0();
    }

    @Override // com.google.gson.b0
    public Object read(com.google.gson.stream.a aVar) throws IOException {
        com.google.gson.stream.c cVarX = aVar.x();
        Object objD = d(aVar, cVarX);
        if (objD == null) {
            return c(aVar, cVarX);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                String strNa = objD instanceof Map ? aVar.na() : null;
                com.google.gson.stream.c cVarX2 = aVar.x();
                Object objD2 = d(aVar, cVarX2);
                boolean z10 = objD2 != null;
                if (objD2 == null) {
                    objD2 = c(aVar, cVarX2);
                }
                if (objD instanceof List) {
                    ((List) objD).add(objD2);
                } else {
                    ((Map) objD).put(strNa, objD2);
                }
                if (z10) {
                    arrayDeque.addLast(objD);
                    objD = objD2;
                }
            } else {
                if (objD instanceof List) {
                    aVar.F0();
                } else {
                    aVar.F1();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.b0
    public void write(com.google.gson.stream.d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.y();
            return;
        }
        b0 b0VarU = this.f125362a.u(obj.getClass());
        if (!(b0VarU instanceof k)) {
            b0VarU.write(dVar, obj);
        } else {
            dVar.e();
            dVar.h();
        }
    }

    private k(com.google.gson.f fVar, a0 a0Var) {
        this.f125362a = fVar;
        this.f125363b = a0Var;
    }
}

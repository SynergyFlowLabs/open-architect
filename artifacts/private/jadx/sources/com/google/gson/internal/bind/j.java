package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.v;
import com.google.gson.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends b0<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f125357b = b(z.f125654b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f125358a;

    class a implements c0 {
        a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return j.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125360a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f125360a = iArr;
            try {
                iArr[com.google.gson.stream.c.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125360a[com.google.gson.stream.c.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125360a[com.google.gson.stream.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private j(a0 a0Var) {
        this.f125358a = a0Var;
    }

    public static c0 a(a0 a0Var) {
        return a0Var == z.f125654b ? f125357b : b(a0Var);
    }

    private static c0 b(a0 a0Var) {
        return new j(a0Var).new a();
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(com.google.gson.stream.a aVar) throws IOException {
        com.google.gson.stream.c cVarX = aVar.x();
        int i10 = b.f125360a[cVarX.ordinal()];
        int i11 = 2 ^ 1;
        if (i10 == 1) {
            aVar.a7();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f125358a.b(aVar);
        }
        throw new v("Expecting number, got: " + cVarX + "; at path " + aVar.S());
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
        dVar.r0(number);
    }
}

package com.google.gson;

import com.google.gson.internal.e0;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f125653a = new a("DOUBLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f125654b = new z("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.z.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.a0
        public Number b(com.google.gson.stream.a aVar) throws IOException {
            return new com.google.gson.internal.b0(aVar.jc());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f125655c = new z("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.z.c
        {
            a aVar = null;
        }

        private Number l(String str, com.google.gson.stream.a aVar) throws IOException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!aVar.l()) {
                        throw new com.google.gson.stream.e("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.h());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + str + "; at path " + aVar.h(), e10);
            }
        }

        @Override // com.google.gson.a0
        public Number b(com.google.gson.stream.a aVar) throws IOException, p {
            String strJc = aVar.jc();
            if (strJc.indexOf(46) >= 0) {
                return l(strJc, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strJc));
            } catch (NumberFormatException unused) {
                return l(strJc, aVar);
            }
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f125656d = new z("BIG_DECIMAL", 3) { // from class: com.google.gson.z.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(com.google.gson.stream.a aVar) throws IOException {
            String strJc = aVar.jc();
            try {
                return e0.b(strJc);
            } catch (NumberFormatException e10) {
                throw new p("Cannot parse " + strJc + "; at path " + aVar.h(), e10);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z[] f125657e = k();

    final enum a extends z {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Double b(com.google.gson.stream.a aVar) throws IOException {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    private z(String str, int i10) {
        super(str, i10);
    }

    private static /* synthetic */ z[] k() {
        return new z[]{f125653a, f125654b, f125655c, f125656d};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f125657e.clone();
    }

    /* synthetic */ z(String str, int i10, a aVar) {
        this(str, i10);
    }
}

package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.a f130696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f130697b;

    j(com.google.zxing.common.a aVar) {
        this.f130696a = aVar;
        this.f130697b = new s(aVar);
    }

    public static j a(com.google.zxing.common.a aVar) {
        if (aVar.h(1)) {
            return new g(aVar);
        }
        if (!aVar.h(2)) {
            return new k(aVar);
        }
        int iG = s.g(aVar, 1, 4);
        if (iG == 4) {
            return new a(aVar);
        }
        if (iG == 5) {
            return new b(aVar);
        }
        int iG2 = s.g(aVar, 1, 5);
        if (iG2 == 12) {
            return new c(aVar);
        }
        if (iG2 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                return new e(aVar, "310", "11");
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                return new e(aVar, "320", "11");
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                return new e(aVar, "310", "13");
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    protected final s b() {
        return this.f130697b;
    }

    protected final com.google.zxing.common.a c() {
        return this.f130696a;
    }

    public abstract String d() throws com.google.zxing.m, com.google.zxing.h;
}

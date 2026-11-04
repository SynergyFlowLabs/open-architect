package io.ably.lib.types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f288197c = "io.ably.lib.types.x";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f288198d = "delta";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f288199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.o f288200b;

    public static class a implements com.google.gson.t<x> {
        @Override // com.google.gson.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l b(x xVar, Type type, com.google.gson.s sVar) {
            return xVar.f288200b;
        }
    }

    public x(com.google.gson.o oVar) {
        this(oVar, null);
    }

    static x d(com.google.gson.o oVar) throws w {
        q qVarC;
        com.google.gson.l lVarS = oVar.S(f288198d);
        if (lVarS instanceof com.google.gson.o) {
            qVarC = q.c((com.google.gson.o) lVarS);
        } else {
            if (lVarS != null) {
                throw w.d("The value under the delta key is of the wrong type \"" + lVarS.getClass() + "\" when expected a map.");
            }
            qVarC = null;
        }
        return new x(oVar, qVarC);
    }

    static x e(org.msgpack.core.o oVar) throws IOException {
        q qVarD;
        org.msgpack.value.x xVar;
        org.msgpack.value.q qVarJ1 = oVar.j1();
        if (!(qVarJ1 instanceof org.msgpack.value.l) || (xVar = ((org.msgpack.value.l) qVarJ1).map().get(org.msgpack.value.y.z(f288198d))) == null) {
            qVarD = null;
        } else {
            if (!(xVar instanceof org.msgpack.value.l)) {
                throw new IOException("The delta extras unpacked to the wrong type \"" + xVar.getClass() + "\" when expected a map.");
            }
            qVarD = q.d(((org.msgpack.value.l) xVar).map());
        }
        com.google.gson.l lVarI = io.ably.lib.util.p.i(qVarJ1);
        if (lVarI instanceof com.google.gson.o) {
            return new x((com.google.gson.o) lVarI, qVarD);
        }
        throw new IOException("The extras unpacked to the wrong type \"" + lVarI.getClass() + "\" when expected a JsonObject.");
    }

    public com.google.gson.o b() {
        return this.f288200b;
    }

    public q c() {
        return this.f288199a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f288200b, ((x) obj).f288200b);
    }

    void f(org.msgpack.core.j jVar) {
        io.ably.lib.util.p.b(this.f288200b, jVar);
    }

    public int hashCode() {
        return Objects.hashCode(this.f288200b);
    }

    public String toString() {
        return "MessageExtras{delta=" + this.f288199a + ", raw=" + this.f288200b + AbstractJsonLexerKt.END_OBJ;
    }

    private x(com.google.gson.o oVar, q qVar) {
        if (oVar == null) {
            throw new NullPointerException("jsonObject cannot be null.");
        }
        this.f288200b = oVar;
        this.f288199a = qVar;
    }
}

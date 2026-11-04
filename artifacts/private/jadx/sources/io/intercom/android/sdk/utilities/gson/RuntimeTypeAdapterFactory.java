package io.intercom.android.sdk.utilities.gson;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.reflect.a;
import com.google.gson.stream.d;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class RuntimeTypeAdapterFactory<T> implements c0 {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final Map<String, Class<?>> labelToIgnoreSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToIgnoreLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z10) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z10;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z10) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z10);
    }

    @Override // com.google.gson.c0
    public <R> b0<R> create(f fVar, a<R> aVar) {
        if (aVar.getRawType() != this.baseType) {
            return null;
        }
        final b0<T> b0VarU = fVar.u(l.class);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            b0<T> b0VarV = fVar.v(this, a.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), b0VarV);
            linkedHashMap2.put(entry.getValue(), b0VarV);
        }
        for (Map.Entry<String, Class<?>> entry2 : this.labelToIgnoreSubtype.entrySet()) {
            b0<T> b0VarV2 = fVar.v(this, a.get((Class) entry2.getValue()));
            linkedHashMap3.put(entry2.getKey(), b0VarV2);
            linkedHashMap4.put(entry2.getValue(), b0VarV2);
        }
        return new b0<R>() { // from class: io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.b0
            public R read(com.google.gson.stream.a aVar2) throws IOException {
                l lVar = (l) b0VarU.read(aVar2);
                l lVarS = RuntimeTypeAdapterFactory.this.maintainType ? lVar.v().S(RuntimeTypeAdapterFactory.this.typeFieldName) : lVar.v().Z(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (lVarS != null) {
                    b0 b0Var = (b0) linkedHashMap.get(lVarS.D());
                    if (b0Var == null) {
                        b0Var = (b0) linkedHashMap3.get("UnSupported");
                    }
                    return (R) b0Var.fromJsonTree(lVar);
                }
                throw new p("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            @Override // com.google.gson.b0
            public void write(d dVar, R r10) throws IOException {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                b0 b0Var = (b0) linkedHashMap2.get(cls);
                if (b0Var == null) {
                    throw new p("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                o oVarV = b0Var.toJsonTree(r10).v();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    b0VarU.write(dVar, oVarV);
                    return;
                }
                o oVar = new o();
                if (oVarV.W(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    throw new p("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                oVar.L(RuntimeTypeAdapterFactory.this.typeFieldName, new r(str));
                for (Map.Entry<String, l> entry3 : oVarV.entrySet()) {
                    oVar.L(entry3.getKey(), entry3.getValue());
                }
                b0VarU.write(dVar, oVar);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerIgnoredSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToIgnoreSubtype.put(str, cls);
        this.subtypeToIgnoreLabel.put(cls, str);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}

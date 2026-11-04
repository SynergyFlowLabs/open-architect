package com.rabbitmq.tools.jsonrpc;

import com.rabbitmq.client.e2;
import com.rabbitmq.client.k;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class g extends e2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final org.slf4j.c f266105i = org.slf4j.e.k(g.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f266106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f266107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f266108h;

    public g(k kVar, Class<?> cls, Object obj, e eVar) throws IOException {
        super(kVar);
        this.f266106f = eVar;
        v(cls, obj);
    }

    private String t(Object obj, int i10, String str, Object obj2) {
        HashMap map = new HashMap();
        map.put("name", "JSONRPCError");
        map.put("code", Integer.valueOf(i10));
        map.put("message", str);
        map.put("error", obj2);
        return x(obj, "error", map);
    }

    private void v(Class<?> cls, Object obj) {
        this.f266108h = obj;
        this.f266107g = new j(cls);
    }

    private String x(Object obj, String str, Object obj2) {
        HashMap map = new HashMap();
        map.put("version", j.f266120g);
        if (obj != null) {
            map.put("id", obj);
        }
        map.put(str, obj2);
        return this.f266106f.c(map);
    }

    private String y(Object obj, Object obj2) {
        return x(obj, "result", obj2);
    }

    @Override // com.rabbitmq.client.e2
    public String q(String str, com.rabbitmq.client.a.c cVar) {
        return s(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String s(String str) {
        String strT;
        org.slf4j.c cVar = f266105i;
        if (cVar.O()) {
            cVar.D("Request: {}", str);
        }
        try {
            e.a aVarA = this.f266106f.a(str, this.f266107g);
            if (aVarA == null) {
                strT = t(null, 400, "Bad Request", null);
            } else if (j.f266120g.equals(aVarA.d())) {
                Object objA = aVarA.a();
                String strB = aVarA.b();
                Object[] objArrC = aVarA.c();
                if (aVarA.f()) {
                    strT = y(objA, this.f266107g);
                } else if (aVarA.e()) {
                    strT = t(objA, 403, "System methods forbidden", null);
                } else {
                    try {
                        Method methodW = w(strB, objArrC);
                        boolean zO = cVar.O();
                        Object obj = com.planner5d.library.model.payments.a.f222474i;
                        if (zO) {
                            ArrayList arrayList = new ArrayList();
                            if (objArrC != null) {
                                int length = objArrC.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    Object obj2 = objArrC[i10];
                                    arrayList.add(String.format("%s (%s)", obj2, obj2 == null ? com.planner5d.library.model.payments.a.f222474i : obj2.getClass()));
                                }
                            }
                            f266105i.i("About to invoke {} method with parameters {}", methodW, arrayList);
                        }
                        Object objInvoke = methodW.invoke(this.f266108h, objArrC);
                        org.slf4j.c cVar2 = f266105i;
                        if (cVar2.O()) {
                            if (objInvoke != null) {
                                obj = objInvoke.getClass();
                            }
                            cVar2.i("Invocation returned {} ({})", objInvoke, obj);
                        }
                        this = y(objA, objInvoke);
                        strT = this;
                    } catch (Throwable th2) {
                        f266105i.o("Error while processing JSON RPC request", th2);
                        strT = t(objA, 500, "Internal Server Error", th2);
                    }
                }
            } else {
                strT = t(null, 505, "JSONRPC version not supported", null);
            }
        } catch (ClassCastException unused) {
            strT = this.t(null, 400, "Bad Request", null);
        }
        org.slf4j.c cVar3 = f266105i;
        if (cVar3.O()) {
            cVar3.D("Response: {}", strT);
        }
        return strT;
    }

    public j u() {
        return this.f266107g;
    }

    public Method w(String str, Object[] objArr) {
        return this.f266107g.e(str, objArr.length).j();
    }

    public g(k kVar, Class<?> cls, Object obj) throws IOException {
        this(kVar, cls, obj, new a());
    }

    public g(k kVar, String str, Class<?> cls, Object obj, e eVar) throws IOException {
        super(kVar, str);
        this.f266106f = eVar;
        v(cls, obj);
    }

    public g(k kVar, String str, Class<?> cls, Object obj) throws IOException {
        this(kVar, str, cls, obj, new a());
    }
}

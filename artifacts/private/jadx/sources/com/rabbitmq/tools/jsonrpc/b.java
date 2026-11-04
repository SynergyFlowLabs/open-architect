package com.rabbitmq.tools.jsonrpc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final org.slf4j.c f266088b = org.slf4j.e.k(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ObjectMapper f266089a;

    public b(ObjectMapper objectMapper) {
        this.f266089a = objectMapper;
    }

    @Override // com.rabbitmq.tools.jsonrpc.e
    public e.a a(String str, j jVar) {
        MappingJsonFactory mappingJsonFactory = new MappingJsonFactory();
        ArrayList arrayList = new ArrayList();
        try {
            JsonParser jsonParserX = mappingJsonFactory.X(str);
            String strD2 = null;
            String strD3 = null;
            Object objAsText = null;
            while (jsonParserX.E2() != null) {
                try {
                    if (jsonParserX.t() == n.FIELD_NAME) {
                        String strR = jsonParserX.r();
                        n nVarE2 = jsonParserX.E2();
                        if ("method".equals(strR)) {
                            strD2 = jsonParserX.d2();
                        } else if ("id".equals(strR)) {
                            ValueNode valueNodeU2 = jsonParserX.U2();
                            if (valueNodeU2 instanceof ValueNode) {
                                ValueNode valueNode = valueNodeU2;
                                if (valueNode.isNull()) {
                                    objAsText = null;
                                } else if (valueNode.isTextual()) {
                                    objAsText = valueNode.asText();
                                } else if (valueNode.isNumber()) {
                                    objAsText = Long.valueOf(valueNode.asLong());
                                } else {
                                    f266088b.w("ID type not null, text, or number {}, ignoring", valueNode);
                                }
                            } else {
                                f266088b.w("ID not a scalar value {}, ignoring", valueNodeU2);
                            }
                        } else if ("version".equals(strR)) {
                            strD3 = jsonParserX.d2();
                        } else {
                            if ("params".equals(strR)) {
                                if (nVarE2 != n.START_ARRAY) {
                                    throw new IllegalStateException("Field params must be an array");
                                }
                                while (jsonParserX.E2() != n.END_ARRAY) {
                                    arrayList.add(jsonParserX.U2());
                                }
                                throw new f("Error during JSON parsing", e);
                            }
                            continue;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (jsonParserX != null) {
                            try {
                                jsonParserX.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            }
            jsonParserX.close();
            if (strD2 == null) {
                throw new IllegalArgumentException("Could not find method to invoke in request");
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            if (!arrayList.isEmpty()) {
                Method methodJ = jVar.e(strD2, arrayList.size()).j();
                for (int i10 = 0; i10 < methodJ.getParameterCount(); i10++) {
                    try {
                        arrayList2.add(d((u) arrayList.get(i10), methodJ.getParameterTypes()[i10]));
                    } catch (IOException e10) {
                        throw new f("Error during parameter conversion", e10);
                    }
                }
            }
            return new e.a(objAsText, strD3, strD2, arrayList2.toArray());
        } catch (IOException e11) {
            throw new f("Error during JSON parsing", e11);
        }
    }

    @Override // com.rabbitmq.tools.jsonrpc.e
    public e.b b(String str, Class<?> cls) {
        try {
            JsonParser jsonParserX = new MappingJsonFactory().X(str);
            Object objD = null;
            d dVar = null;
            Map map = null;
            while (jsonParserX.E2() != null) {
                try {
                    if (jsonParserX.t() == n.FIELD_NAME) {
                        String strR = jsonParserX.r();
                        if ("result".equals(strR)) {
                            jsonParserX.E2();
                            objD = cls == Void.TYPE ? null : d(jsonParserX.U2(), cls);
                        } else if ("error".equals(strR)) {
                            Map map2 = (Map) d(jsonParserX.U2(), Map.class);
                            dVar = new d(map2.toString(), (String) map2.get("name"), map2.get("code") == null ? 0 : ((Integer) map2.get("code")).intValue(), (String) map2.get("message"), map2);
                            map = map2;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (jsonParserX == null) {
                            throw th3;
                        }
                        try {
                            jsonParserX.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
            }
            jsonParserX.close();
            return new e.b(objD, map, dVar);
        } catch (IOException e10) {
            throw new f("Error during JSON parsing", e10);
        }
    }

    @Override // com.rabbitmq.tools.jsonrpc.e
    public String c(Object obj) {
        try {
            return this.f266089a.writeValueAsString(obj);
        } catch (l e10) {
            throw new f("Error during JSON serialization", e10);
        }
    }

    protected Object d(u uVar, Class<?> cls) throws IOException {
        if (!cls.isPrimitive()) {
            return this.f266089a.readValue(uVar.k(), cls);
        }
        ValueNode valueNode = (ValueNode) uVar;
        if (cls == Boolean.TYPE) {
            return Boolean.valueOf(valueNode.booleanValue());
        }
        if (cls == Character.TYPE) {
            return Character.valueOf(valueNode.textValue().charAt(0));
        }
        if (cls == Short.TYPE) {
            return Short.valueOf(valueNode.shortValue());
        }
        if (cls == Integer.TYPE) {
            return Integer.valueOf(valueNode.intValue());
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(valueNode.longValue());
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(valueNode.floatValue());
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(valueNode.doubleValue());
        }
        throw new IllegalArgumentException("Primitive type not supported: " + cls);
    }

    public b() {
        this(new ObjectMapper());
    }
}

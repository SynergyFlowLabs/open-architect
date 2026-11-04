package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f126235a = "List";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f126236b = "OrBuilderList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f126237c = "Map";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f126238d = "Bytes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f126239e;

    static {
        char[] cArr = new char[80];
        f126239e = cArr;
        Arrays.fill(cArr, ' ');
    }

    private p2() {
    }

    private static void a(int indent, StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = f126239e;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static boolean b(Object o10) {
        if (o10 instanceof Boolean) {
            return !((Boolean) o10).booleanValue();
        }
        if (o10 instanceof Integer) {
            return ((Integer) o10).intValue() == 0;
        }
        if (o10 instanceof Float) {
            return Float.floatToRawIntBits(((Float) o10).floatValue()) == 0;
        }
        if (o10 instanceof Double) {
            return Double.doubleToRawLongBits(((Double) o10).doubleValue()) == 0;
        }
        if (o10 instanceof String) {
            return o10.equals("");
        }
        if (o10 instanceof u) {
            return o10.equals(u.f126379f);
        }
        if (o10 instanceof n2) {
            return o10 == ((n2) o10).g1();
        }
        return (o10 instanceof Enum) && ((Enum) o10).ordinal() == 0;
    }

    private static String c(String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(pascalCase.charAt(0)));
        for (int i10 = 1; i10 < pascalCase.length(); i10++) {
            char cCharAt = pascalCase.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    static void d(StringBuilder buffer, int indent, String name, Object object) {
        if (object instanceof List) {
            Iterator it = ((List) object).iterator();
            while (it.hasNext()) {
                d(buffer, indent, name, it.next());
            }
        } else {
            if (!(object instanceof Map)) {
                buffer.append('\n');
                a(indent, buffer);
                buffer.append(c(name));
                if (object instanceof String) {
                    buffer.append(": \"");
                    buffer.append(c4.e((String) object));
                    buffer.append('\"');
                    return;
                }
                if (object instanceof u) {
                    buffer.append(": \"");
                    buffer.append(c4.a((u) object));
                    buffer.append('\"');
                    return;
                }
                if (object instanceof l1) {
                    buffer.append(" {");
                    e((l1) object, buffer, indent + 2);
                    buffer.append("\n");
                    a(indent, buffer);
                    buffer.append("}");
                    return;
                }
                if (!(object instanceof Map.Entry)) {
                    buffer.append(": ");
                    buffer.append(object);
                    return;
                }
                buffer.append(" {");
                Map.Entry entry = (Map.Entry) object;
                int i10 = indent + 2;
                d(buffer, i10, "key", entry.getKey());
                d(buffer, i10, "value", entry.getValue());
                buffer.append("\n");
                a(indent, buffer);
                buffer.append("}");
                return;
            }
            Iterator it2 = ((Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                d(buffer, indent, name, (Map.Entry) it2.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x017e, please report this as an issue */
    private static void e(n2 messageLite, StringBuilder buffer, int indent) {
        int i10;
        int i11;
        Method method;
        Method method2;
        Object objLl;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method5 = declaredMethods[i12];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i10);
            if (!strSubstring.endsWith(f126235a) || strSubstring.endsWith(f126236b) || strSubstring.equals(f126235a) || (method4 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method4.getReturnType().equals(List.class)) {
                    d(buffer, indent, strSubstring.substring(0, strSubstring.length() - 4), l1.ll(method4, messageLite, new Object[0]));
                }
                i10 = i11;
            }
            if (!strSubstring.endsWith(f126237c) || strSubstring.equals(f126237c) || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith(f126238d)) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objLl = l1.ll(method, messageLite, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) l1.ll(method2, messageLite, new Object[0])).booleanValue();
                                } else if (b(objLl)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    d(buffer, indent, strSubstring, objLl);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objLl = l1.ll(method, messageLite, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) l1.ll(method2, messageLite, new Object[0])).booleanValue();
                            } else if (b(objLl)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                d(buffer, indent, strSubstring, objLl);
                            }
                        }
                    }
                }
            } else {
                d(buffer, indent, strSubstring.substring(0, strSubstring.length() - 3), l1.ll(method3, messageLite, new Object[0]));
            }
            i10 = i11;
        }
        if (messageLite instanceof l1.e) {
            Iterator<Map.Entry<T, Object>> itI = ((l1.e) messageLite).extensions.I();
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                d(buffer, indent, "[" + ((l1.g) entry2.getKey()).i() + "]", entry2.getValue());
            }
        }
        p4 p4Var = ((l1) messageLite).unknownFields;
        if (p4Var != null) {
            p4Var.q(buffer, indent);
        }
    }

    static String f(n2 messageLite, String commentString) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(commentString);
        e(messageLite, sb2, 0);
        return sb2.toString();
    }
}

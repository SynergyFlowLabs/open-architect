package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50581a = "List";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50582b = "OrBuilderList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50583c = "Map";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50584d = "Bytes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f50585e;

    static {
        char[] cArr = new char[80];
        f50585e = cArr;
        Arrays.fill(cArr, ' ');
    }

    private s2() {
    }

    private static void a(int indent, StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = f50585e;
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
            return o10.equals(u.f50632f);
        }
        if (o10 instanceof q2) {
            return o10 == ((q2) o10).g1();
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
                    buffer.append(f4.e((String) object));
                    buffer.append('\"');
                    return;
                }
                if (object instanceof u) {
                    buffer.append(": \"");
                    buffer.append(f4.a((u) object));
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

    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x017a, please report this as an issue */
    private static void e(q2 messageLite, StringBuilder buffer, int indent) {
        int i10;
        int i11;
        Method method;
        Method method2;
        Object objW4;
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
            if (!strSubstring.endsWith(f50581a) || strSubstring.endsWith(f50582b) || strSubstring.equals(f50581a) || (method4 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method4.getReturnType().equals(List.class)) {
                    d(buffer, indent, strSubstring.substring(0, strSubstring.length() - 4), l1.w4(method4, messageLite, new Object[0]));
                }
                i10 = i11;
            }
            if (!strSubstring.endsWith(f50583c) || strSubstring.equals(f50583c) || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith(f50584d)) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objW4 = l1.w4(method, messageLite, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) l1.w4(method2, messageLite, new Object[0])).booleanValue();
                                } else if (b(objW4)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    d(buffer, indent, strSubstring, objW4);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objW4 = l1.w4(method, messageLite, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) l1.w4(method2, messageLite, new Object[0])).booleanValue();
                            } else if (b(objW4)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                d(buffer, indent, strSubstring, objW4);
                            }
                        }
                    }
                }
            } else {
                d(buffer, indent, strSubstring.substring(0, strSubstring.length() - 3), l1.w4(method3, messageLite, new Object[0]));
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
        s4 s4Var = ((l1) messageLite).unknownFields;
        if (s4Var != null) {
            s4Var.q(buffer, indent);
        }
    }

    static String f(q2 messageLite, String commentString) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(commentString);
        e(messageLite, sb2, 0);
        return sb2.toString();
    }
}

package com.google.vr.sdk.deps;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class m4<K, V> implements p2 {
    private m4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean A(byte b10) {
        return b10 < -16;
    }

    private static boolean B(byte b10) {
        return b10 > -65;
    }

    private static int C(byte b10) {
        return b10 & 63;
    }

    private static char b(int i10) {
        return (char) ((i10 >>> 10) + 55232);
    }

    static <K, V> int c(n4<K, V> n4Var, K k10, V v10) {
        return a3.a(n4Var.f129490a, 1, k10) + a3.a(n4Var.f129492c, 2, v10);
    }

    static String d(k2 k2Var) {
        return f(new y5(k2Var));
    }

    static String e(t4 t4Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m(t4Var, sb2, 0);
        return sb2.toString();
    }

    static String f(y5 y5Var) {
        StringBuilder sb2 = new StringBuilder(y5Var.b());
        for (int i10 = 0; i10 < y5Var.b(); i10++) {
            byte bA = y5Var.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String g(String str) {
        return d(k2.l(str));
    }

    static <K, V> void l(t2 t2Var, n4<K, V> n4Var, K k10, V v10) throws IOException {
        a3.e(t2Var, n4Var.f129490a, 1, k10);
        a3.e(t2Var, n4Var.f129492c, 2, v10);
    }

    private static void m(t4 t4Var, StringBuilder sb2, int i10) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : t4Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    n(sb2, i10, r(strConcat), i3.s(method2, t4Var, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String strValueOf3 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strReplaceFirst.substring(1, strReplaceFirst.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    n(sb2, i10, r(strConcat2), i3.s(method3, t4Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strReplaceFirst.length() != 0 ? "set".concat(strReplaceFirst) : new String("set"))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strReplaceFirst.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strReplaceFirst.length() != 0 ? "get".concat(strReplaceFirst) : new String("get"));
                Method method5 = (Method) map.get(strReplaceFirst.length() != 0 ? "has".concat(strReplaceFirst) : new String("has"));
                if (method4 != null) {
                    Object objS = i3.s(method4, t4Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) i3.s(method5, t4Var, new Object[0])).booleanValue();
                    } else if (p(objS)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        n(sb2, i10, r(strConcat3), objS);
                    }
                }
            }
        }
        if (t4Var instanceof i3.b) {
            Iterator<Map.Entry<FieldDescriptorType, Object>> itR = ((i3.b) t4Var).f129435f.r();
            if (itR.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        b6 b6Var = ((i3) t4Var).f129430c;
        if (b6Var != null) {
            b6Var.f(sb2, i10);
        }
    }

    static void n(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator<Map.Entry<K, V>> it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                n(sb2, i10, str, it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(g((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof k2) {
            sb2.append(": \"");
            sb2.append(d((k2) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i3) {
            sb2.append(" {");
            m((i3) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        n(sb2, i13, "key", entry.getKey());
        n(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    private static boolean p(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof k2) {
            return obj.equals(k2.f129465b);
        }
        if (obj instanceof t4) {
            return obj == ((t4) obj).g1();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static char q(int i10) {
        return (char) ((i10 & 1023) + 56320);
    }

    private static String r(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws v3 {
        if (B(b11) || (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) != 0 || B(b12) || B(b13)) {
            throw v3.h();
        }
        int iC = ((b10 & 7) << 18) | (C(b11) << 12) | (C(b12) << 6) | C(b13);
        cArr[i10] = b(iC);
        cArr[i10 + 1] = q(iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(byte b10, byte b11, byte b12, char[] cArr, int i10) throws v3 {
        if (B(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || B(b12)))) {
            throw v3.h();
        }
        cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | (C(b11) << 6) | C(b12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(byte b10, byte b11, char[] cArr, int i10) throws v3 {
        if (b10 < -62 || B(b11)) {
            throw v3.h();
        }
        cArr[i10] = (char) (((b10 & com.google.common.base.c.I) << 6) | C(b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(byte b10) {
        return b10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean z(byte b10) {
        return b10 < -32;
    }

    @Override // com.google.vr.sdk.deps.p2
    public byte[] a(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }

    /* synthetic */ m4(byte b10) {
        this();
    }
}

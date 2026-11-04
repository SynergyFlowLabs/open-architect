package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f108282a;

    static {
        char[] cArr = new char[80];
        f108282a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(yc ycVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(ycVar, sb2, 0);
        return sb2.toString();
    }

    static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
        } else {
            if (!(obj instanceof Map)) {
                sb2.append('\n');
                d(i10, sb2);
                if (!str.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Character.toLowerCase(str.charAt(0)));
                    for (int i11 = 1; i11 < str.length(); i11++) {
                        char cCharAt = str.charAt(i11);
                        if (Character.isUpperCase(cCharAt)) {
                            sb3.append("_");
                        }
                        sb3.append(Character.toLowerCase(cCharAt));
                    }
                    str = sb3.toString();
                }
                sb2.append(str);
                if (obj instanceof String) {
                    sb2.append(": \"");
                    ra raVar = ra.f108771b;
                    sb2.append(td.a(new qa(((String) obj).getBytes(ac.f108280a))));
                    sb2.append('\"');
                    return;
                }
                if (obj instanceof ra) {
                    sb2.append(": \"");
                    sb2.append(td.a((ra) obj));
                    sb2.append('\"');
                    return;
                }
                if (obj instanceof qb) {
                    sb2.append(" {");
                    c((qb) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    d(i10, sb2);
                    sb2.append("}");
                    return;
                }
                if (!(obj instanceof Map.Entry)) {
                    sb2.append(": ");
                    sb2.append(obj);
                    return;
                }
                int i12 = i10 + 2;
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                b(sb2, i12, "key", entry.getKey());
                b(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                d(i10, sb2);
                sb2.append("}");
                return;
            }
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    private static void c(yc ycVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ycVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), qb.v(method2, ycVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), qb.v(method, ycVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objV = qb.v(method4, ycVar, new Object[0]);
                    if (method5 == null) {
                        if (objV instanceof Boolean) {
                            if (((Boolean) objV).booleanValue()) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (objV instanceof Integer) {
                            if (((Integer) objV).intValue() != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (objV instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objV).floatValue()) != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (!(objV instanceof Double)) {
                            if (objV instanceof String) {
                                zEquals = objV.equals("");
                            } else if (objV instanceof ra) {
                                zEquals = objV.equals(ra.f108771b);
                            } else if (objV instanceof yc) {
                                if (objV != ((yc) objV).d()) {
                                    b(sb2, i10, strSubstring, objV);
                                }
                            } else if (!(objV instanceof Enum) || ((Enum) objV).ordinal() != 0) {
                                b(sb2, i10, strSubstring, objV);
                            }
                            if (!zEquals) {
                                b(sb2, i10, strSubstring, objV);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) != 0) {
                            b(sb2, i10, strSubstring, objV);
                        }
                    } else if (((Boolean) qb.v(method5, ycVar, new Object[0])).booleanValue()) {
                        b(sb2, i10, strSubstring, objV);
                    }
                }
            }
            i11 = 3;
        }
        if (ycVar instanceof nb) {
            Iterator itC = ((nb) ycVar).zzb.c();
            if (itC.hasNext()) {
                throw null;
            }
        }
        wd wdVar = ((qb) ycVar).zzc;
        if (wdVar != null) {
            wdVar.j(sb2, i10);
        }
    }

    private static void d(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f108282a, 0, i11);
            i10 -= i11;
        }
    }
}

package org.apache.commons.lang3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f337190a = '.';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f337192c = '$';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Class<?>> f337194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f337195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f337196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, String> f337197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, String> f337198i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f337191b = String.valueOf('.');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f337193d = String.valueOf('$');

    static class a implements Iterable<Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f337199a;

        /* JADX INFO: renamed from: org.apache.commons.lang3.m$a$a, reason: collision with other inner class name */
        class C2409a implements Iterator<Class<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ tk.h f337200a;

            C2409a(tk.h hVar) {
                this.f337200a = hVar;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Class<?> next() {
                Class<?> cls = (Class) this.f337200a.getValue();
                this.f337200a.setValue(cls.getSuperclass());
                return cls;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f337200a.getValue() != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        a(Class cls) {
            this.f337199a = cls;
        }

        @Override // java.lang.Iterable
        public Iterator<Class<?>> iterator() {
            return new C2409a(new tk.h(this.f337199a));
        }
    }

    static class b implements Iterable<Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f337202a;

        class a implements Iterator<Class<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Iterator<Class<?>> f337203a = Collections.EMPTY_SET.iterator();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f337204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set f337205c;

            a(Iterator it, Set set) {
                this.f337204b = it;
                this.f337205c = set;
            }

            private void c(Set<Class<?>> set, Class<?> cls) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!this.f337205c.contains(cls2)) {
                        set.add(cls2);
                    }
                    c(set, cls2);
                }
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Class<?> next() {
                if (this.f337203a.hasNext()) {
                    Class<?> next = this.f337203a.next();
                    this.f337205c.add(next);
                    return next;
                }
                Class<?> cls = (Class) this.f337204b.next();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                c(linkedHashSet, cls);
                this.f337203a = linkedHashSet.iterator();
                return cls;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f337203a.hasNext() || this.f337204b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        b(Iterable iterable) {
            this.f337202a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<Class<?>> iterator() {
            return new a(this.f337202a.iterator(), new HashSet());
        }
    }

    public enum c {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap map = new HashMap();
        f337194e = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        map.put(io.sentry.profilemeasurements.a.f306070m, cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Short.TYPE;
        map.put("short", cls4);
        Class cls5 = Integer.TYPE;
        map.put("int", cls5);
        Class cls6 = Long.TYPE;
        map.put("long", cls6);
        Class cls7 = Double.TYPE;
        map.put("double", cls7);
        Class cls8 = Float.TYPE;
        map.put("float", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        HashMap map2 = new HashMap();
        f337195f = map2;
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls4, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(cls7, Double.class);
        map2.put(cls8, Float.class);
        map2.put(cls9, cls9);
        f337196g = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                f337196g.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put("int", "I");
        map3.put("boolean", org.locationtech.jts.io.gml2.a.f338505w);
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", androidx.exifinterface.media.a.S4);
        map3.put(io.sentry.profilemeasurements.a.f306070m, "B");
        map3.put("double", "D");
        map3.put("char", "C");
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        f337197h = Collections.unmodifiableMap(map3);
        f337198i = Collections.unmodifiableMap(map4);
    }

    public static Method A(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList<Class> arrayList = new ArrayList();
        arrayList.addAll(e(cls));
        arrayList.addAll(g(cls));
        for (Class cls2 : arrayList) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + " " + org.apache.commons.lang3.c.c5(clsArr));
    }

    public static String B(Class<?> cls) {
        return cls == null ? "" : D(cls.getName());
    }

    public static String C(Object obj, String str) {
        return obj == null ? str : D(obj.getClass().getName());
    }

    public static String D(String str) {
        return G(l(str));
    }

    public static String E(Class<?> cls) {
        return cls == null ? "" : G(cls.getName());
    }

    public static String F(Object obj, String str) {
        return obj == null ? str : E(obj.getClass());
    }

    public static String G(String str) {
        if (z.A0(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb2.append(okhttp3.v.f334777p);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = f337198i;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb2);
    }

    public static String H(Class<?> cls) {
        return I(cls, "");
    }

    public static String I(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static String J(Object obj) {
        return K(obj, "");
    }

    public static String K(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static Iterable<Class<?>> L(Class<?> cls) {
        return M(cls, c.EXCLUDE);
    }

    public static Iterable<Class<?>> M(Class<?> cls, c cVar) {
        a aVar = new a(cls);
        return cVar != c.INCLUDE ? aVar : new b(aVar);
    }

    public static boolean N(Class<?> cls, Class<?> cls2) {
        return O(cls, cls2, a0.k(p.JAVA_1_5));
    }

    public static boolean O(Class<?> cls, Class<?> cls2, boolean z10) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z10) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = U(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = Y(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        boolean zEquals = cls3.equals(cls);
        Class cls4 = Long.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Float.TYPE;
        if (zEquals) {
            return cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (cls4.equals(cls)) {
            return cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls) || cls5.equals(cls)) {
            return false;
        }
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (Character.TYPE.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        Class cls7 = Short.TYPE;
        if (!cls7.equals(cls)) {
            if (Byte.TYPE.equals(cls)) {
                return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
            }
            return false;
        }
        if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls6.equals(cls2) && !cls5.equals(cls2)) {
            return false;
        }
        return true;
    }

    public static boolean P(Class<?>[] clsArr, Class<?>... clsArr2) {
        return Q(clsArr, clsArr2, a0.k(p.JAVA_1_5));
    }

    public static boolean Q(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z10) {
        if (!org.apache.commons.lang3.c.a1(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = org.apache.commons.lang3.c.f337036b;
        }
        if (clsArr2 == null) {
            clsArr2 = org.apache.commons.lang3.c.f337036b;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (!O(clsArr[i10], clsArr2[i10], z10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean R(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean S(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || T(cls);
    }

    public static boolean T(Class<?> cls) {
        return f337196g.containsKey(cls);
    }

    public static Class<?> U(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : f337195f.get(cls);
    }

    public static Class<?>[] V(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            clsArr2[i10] = U(clsArr[i10]);
        }
        return clsArr2;
    }

    private static String W(String str) {
        String strL = z.L(str);
        c0.P(strL, "className must not be null.", new Object[0]);
        if (!strL.endsWith(okhttp3.v.f334777p)) {
            return strL;
        }
        StringBuilder sb2 = new StringBuilder();
        while (strL.endsWith(okhttp3.v.f334777p)) {
            strL = strL.substring(0, strL.length() - 2);
            sb2.append("[");
        }
        String str2 = f337197h.get(strL);
        if (str2 != null) {
            sb2.append(str2);
        } else {
            sb2.append("L");
            sb2.append(strL);
            sb2.append(";");
        }
        return sb2.toString();
    }

    public static Class<?>[] X(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return org.apache.commons.lang3.c.f337036b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            clsArr[i10] = obj == null ? null : obj.getClass();
        }
        return clsArr;
    }

    public static Class<?> Y(Class<?> cls) {
        return f337196g.get(cls);
    }

    public static Class<?>[] Z(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            clsArr2[i10] = Y(clsArr[i10]);
        }
        return clsArr2;
    }

    public static List<Class<?>> a(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Class.forName(it.next()));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List<String> b(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static String c(Class<?> cls, int i10) {
        return cls == null ? "" : d(cls.getName(), i10);
    }

    public static String d(String str, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("len must be > 0");
        }
        if (str == null) {
            return "";
        }
        int iF = z.F(str, '.');
        String[] strArr = new String[iF + 1];
        int length = str.length() - 1;
        for (int i11 = iF; i11 >= 0; i11--) {
            int iLastIndexOf = str.lastIndexOf(46, length);
            String strSubstring = str.substring(iLastIndexOf + 1, length + 1);
            i10 -= strSubstring.length();
            if (i11 > 0) {
                i10--;
            }
            if (i11 == iF) {
                strArr[i11] = strSubstring;
            } else if (i10 > 0) {
                strArr[i11] = strSubstring;
            } else {
                strArr[i11] = strSubstring.substring(0, 1);
            }
            length = iLastIndexOf - 1;
        }
        return z.a1(strArr, '.');
    }

    public static List<Class<?>> e(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void f(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    f(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> g(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    public static String h(Class<?> cls) {
        return i(cls, "");
    }

    public static String i(Class<?> cls, String str) {
        String canonicalName;
        return (cls == null || (canonicalName = cls.getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String j(Object obj) {
        return k(obj, "");
    }

    public static String k(Object obj, String str) {
        String canonicalName;
        return (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) ? str : canonicalName;
    }

    private static String l(String str) {
        String strL = z.L(str);
        if (strL == null) {
            return null;
        }
        int i10 = 0;
        while (strL.startsWith("[")) {
            i10++;
            strL = strL.substring(1);
        }
        if (i10 < 1) {
            return strL;
        }
        if (strL.startsWith("L")) {
            strL = strL.substring(1, strL.endsWith(";") ? strL.length() - 1 : strL.length());
        } else if (strL.length() > 0) {
            strL = f337198i.get(strL.substring(0, 1));
        }
        StringBuilder sb2 = new StringBuilder(strL);
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(okhttp3.v.f334777p);
        }
        return sb2.toString();
    }

    public static Class<?> m(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return n(classLoader, str, true);
    }

    public static Class<?> n(ClassLoader classLoader, String str, boolean z10) throws ClassNotFoundException {
        try {
            Map<String, Class<?>> map = f337194e;
            return map.containsKey(str) ? map.get(str) : Class.forName(W(str), z10, classLoader);
        } catch (ClassNotFoundException e10) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                try {
                    return n(classLoader, str.substring(0, iLastIndexOf) + '$' + str.substring(iLastIndexOf + 1), z10);
                } catch (ClassNotFoundException unused) {
                    throw e10;
                }
            }
            throw e10;
        }
    }

    public static Class<?> o(String str) throws ClassNotFoundException {
        return p(str, true);
    }

    public static Class<?> p(String str, boolean z10) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = m.class.getClassLoader();
        }
        return n(contextClassLoader, str, z10);
    }

    public static String q(Class<?> cls) {
        return r(cls, "");
    }

    public static String r(Class<?> cls, String str) {
        return cls == null ? str : cls.getName();
    }

    public static String s(Object obj) {
        return t(obj, "");
    }

    public static String t(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String u(Class<?> cls) {
        return cls == null ? "" : w(cls.getName());
    }

    public static String v(Object obj, String str) {
        return obj == null ? str : w(obj.getClass().getName());
    }

    public static String w(String str) {
        return z(l(str));
    }

    public static String x(Class<?> cls) {
        return cls == null ? "" : z(cls.getName());
    }

    public static String y(Object obj, String str) {
        return obj == null ? str : x(obj.getClass());
    }

    public static String z(String str) {
        if (z.A0(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }
}

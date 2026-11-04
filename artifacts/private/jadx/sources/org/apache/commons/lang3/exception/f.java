package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.m;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f337160a = " [wrapped] ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f337161b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    private static <R, T extends Throwable> R A(Throwable th2) throws Throwable {
        throw th2;
    }

    public static <R> R B(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new UndeclaredThrowableException(th2);
    }

    @Deprecated
    public static Throwable a(Throwable th2) {
        return b(th2, null);
    }

    @Deprecated
    public static Throwable b(Throwable th2, String[] strArr) {
        Throwable thC;
        if (th2 == null) {
            return null;
        }
        if (strArr == null) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                return cause;
            }
            strArr = f337161b;
        }
        for (String str : strArr) {
            if (str != null && (thC = c(th2, str)) != null) {
                return thC;
            }
        }
        return null;
    }

    private static Throwable c(Throwable th2, String str) {
        Method method;
        try {
            method = th2.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
            try {
                return (Throwable) method.invoke(th2, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            }
        }
        return null;
    }

    @Deprecated
    public static String[] d() {
        return (String[]) org.apache.commons.lang3.c.I(f337161b);
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        return m.F(th2, null) + ": " + z.J(th2.getMessage());
    }

    public static Throwable f(Throwable th2) {
        List<Throwable> listN = n(th2);
        if (listN.size() < 2) {
            return null;
        }
        return listN.get(listN.size() - 1);
    }

    public static String g(Throwable th2) {
        Throwable thF = f(th2);
        if (thF != null) {
            th2 = thF;
        }
        return e(th2);
    }

    public static String[] h(Throwable th2) {
        List<String> listI;
        if (th2 == null) {
            return org.apache.commons.lang3.c.f337037c;
        }
        Throwable[] thArrO = o(th2);
        int length = thArrO.length;
        ArrayList arrayList = new ArrayList();
        int i10 = length - 1;
        List<String> listI2 = i(thArrO[i10]);
        while (true) {
            int i11 = length - 1;
            if (i11 < 0) {
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            if (i11 != 0) {
                listI = i(thArrO[length - 2]);
                y(listI2, listI);
            } else {
                listI = listI2;
            }
            if (i11 == i10) {
                arrayList.add(thArrO[i11].toString());
            } else {
                arrayList.add(f337160a + thArrO[i11].toString());
            }
            arrayList.addAll(listI2);
            listI2 = listI;
            length = i11;
        }
    }

    static List<String> i(Throwable th2) {
        StringTokenizer stringTokenizer = new StringTokenizer(l(th2), System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z10 = true;
            } else if (z10) {
                break;
            }
        }
        return arrayList;
    }

    static String[] j(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] k(Throwable th2) {
        return th2 == null ? org.apache.commons.lang3.c.f337037c : j(l(th2));
    }

    public static String l(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int m(Throwable th2) {
        return n(th2).size();
    }

    public static List<Throwable> n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2 != null && !arrayList.contains(th2)) {
            arrayList.add(th2);
            th2 = th2.getCause();
        }
        return arrayList;
    }

    public static Throwable[] o(Throwable th2) {
        List<Throwable> listN = n(th2);
        return (Throwable[]) listN.toArray(new Throwable[listN.size()]);
    }

    public static boolean p(Throwable th2, Class<? extends Throwable> cls) {
        if (th2 instanceof UndeclaredThrowableException) {
            th2 = th2.getCause();
        }
        return cls.isInstance(th2);
    }

    private static int q(Throwable th2, Class<?> cls, int i10, boolean z10) {
        if (th2 != null && cls != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            Throwable[] thArrO = o(th2);
            if (i10 >= thArrO.length) {
                return -1;
            }
            if (z10) {
                while (i10 < thArrO.length) {
                    if (cls.isAssignableFrom(thArrO[i10].getClass())) {
                        return i10;
                    }
                    i10++;
                }
            } else {
                while (i10 < thArrO.length) {
                    if (cls.equals(thArrO[i10].getClass())) {
                        return i10;
                    }
                    i10++;
                }
            }
        }
        return -1;
    }

    public static int r(Throwable th2, Class<?> cls) {
        return q(th2, cls, 0, false);
    }

    public static int s(Throwable th2, Class<?> cls, int i10) {
        return q(th2, cls, i10, false);
    }

    public static int t(Throwable th2, Class<?> cls) {
        return q(th2, cls, 0, true);
    }

    public static int u(Throwable th2, Class<?> cls, int i10) {
        return q(th2, cls, i10, true);
    }

    public static void v(Throwable th2) {
        w(th2, System.err);
    }

    public static void w(Throwable th2, PrintStream printStream) {
        if (th2 == null) {
            return;
        }
        c0.v(printStream != null, "The PrintStream must not be null", new Object[0]);
        for (String str : h(th2)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static void x(Throwable th2, PrintWriter printWriter) {
        if (th2 == null) {
            return;
        }
        c0.v(printWriter != null, "The PrintWriter must not be null", new Object[0]);
        for (String str : h(th2)) {
            printWriter.println(str);
        }
        printWriter.flush();
    }

    public static void y(List<String> list, List<String> list2) {
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("The List must not be null");
        }
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    public static <R> R z(Throwable th2) {
        return (R) A(th2);
    }
}

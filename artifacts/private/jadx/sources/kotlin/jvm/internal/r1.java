package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class r1 {
    public static int A(Object obj) {
        if (obj instanceof d0) {
            return ((d0) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof pj.n) {
            return 3;
        }
        if (obj instanceof pj.o) {
            return 4;
        }
        if (obj instanceof pj.p) {
            return 5;
        }
        if (obj instanceof pj.q) {
            return 6;
        }
        if (obj instanceof pj.r) {
            return 7;
        }
        if (obj instanceof pj.s) {
            return 8;
        }
        if (obj instanceof pj.t) {
            return 9;
        }
        if (obj instanceof pj.a) {
            return 10;
        }
        if (obj instanceof pj.b) {
            return 11;
        }
        if (obj instanceof pj.c) {
            return 12;
        }
        if (obj instanceof pj.d) {
            return 13;
        }
        if (obj instanceof pj.e) {
            return 14;
        }
        if (obj instanceof pj.f) {
            return 15;
        }
        if (obj instanceof pj.g) {
            return 16;
        }
        if (obj instanceof pj.h) {
            return 17;
        }
        if (obj instanceof pj.i) {
            return 18;
        }
        if (obj instanceof pj.j) {
            return 19;
        }
        if (obj instanceof pj.k) {
            return 20;
        }
        if (obj instanceof pj.l) {
            return 21;
        }
        return obj instanceof pj.m ? 22 : -1;
    }

    public static boolean B(Object obj, int i10) {
        return (obj instanceof kotlin.x) && A(obj) == i10;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof qj.a) || (obj instanceof qj.b));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof qj.a) || (obj instanceof qj.c));
    }

    public static boolean E(Object obj) {
        if (obj instanceof Iterator) {
            return !(obj instanceof qj.a) || (obj instanceof qj.d);
        }
        return false;
    }

    public static boolean F(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof qj.a) || (obj instanceof qj.e);
        }
        return false;
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof qj.a) || (obj instanceof qj.f));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof qj.a) || (obj instanceof qj.g));
    }

    public static boolean I(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof qj.a) || (obj instanceof qj.g.a);
        }
        return false;
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof qj.a) || (obj instanceof qj.h));
    }

    private static <T extends Throwable> T K(T t10) {
        return (T) Intrinsics.sanitizeStackTrace(t10, r1.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        N((obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof qj.a) && !(obj instanceof qj.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i10) {
        if (obj != null && !B(obj, i10)) {
            M(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Object r(Object obj, int i10, String str) {
        if (obj != null && !B(obj, i10)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw L(e10);
        }
    }
}

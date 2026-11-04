package zk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 zk.a, still in use, count: 1, list:
  (r0v0 zk.a) from 0x00aa: FILLED_NEW_ARRAY (r0v0 zk.a), (r5v0 zk.a), (r9v1 zk.a), (r10v2 zk.a), (r11v4 zk.a) A[WRAPPED] elemType: zk.a
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes14.dex */
public final class a {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a[] f413525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a[] f413526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a[] f413527n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?>[] f413529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f413530b;

    static {
        a aVar = CHAR;
        a aVar2 = INT;
        a aVar3 = FLOAT;
        a aVar4 = TIME;
        a aVar5 = CHAR_AND_INT;
        a aVar6 = INT_AND_TIME;
        a aVar7 = NULL;
        f413525l = new a[]{aVar, aVar, aVar2, aVar3, aVar4};
        f413526m = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f413527n = new a[]{aVar7, aVar5, aVar6, aVar, aVar2, aVar3, aVar4};
    }

    private a(String str, Class... clsArr) {
        super(str, i);
        this.f413530b = str;
        if (clsArr == null) {
            this.f413529a = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> clsS = s(cls);
            if (clsS != null) {
                arrayList.add(clsS);
            }
        }
        this.f413529a = (Class[]) arrayList.toArray(new Class[0]);
    }

    private static <E> Set<E> l(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static a n(char c10) {
        for (a aVar : f413525l) {
            if (aVar.f413530b.contains(String.valueOf(c10))) {
                return aVar;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c10);
    }

    public static a o(a aVar, a aVar2) {
        a aVar3 = UNUSED;
        if (aVar != aVar3) {
            if (aVar2 != aVar3) {
                a aVar4 = GENERAL;
                if (aVar != aVar4) {
                    if (aVar2 != aVar4) {
                        Set setL = l(aVar.f413529a);
                        setL.retainAll(l(aVar2.f413529a));
                        for (a aVar5 : f413526m) {
                            if (l(aVar5.f413529a).equals(setL)) {
                                return aVar5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return aVar;
        }
        return aVar2;
    }

    public static boolean q(a aVar, a aVar2) {
        return o(aVar, aVar2) == aVar;
    }

    public static a r(a aVar, a aVar2) {
        a aVar3 = UNUSED;
        if (aVar == aVar3 || aVar2 == aVar3 || aVar == (aVar3 = GENERAL) || aVar2 == aVar3) {
            return aVar3;
        }
        a aVar4 = CHAR_AND_INT;
        if ((aVar == aVar4 && aVar2 == INT_AND_TIME) || (aVar == INT_AND_TIME && aVar2 == aVar4)) {
            return INT;
        }
        Set setL = l(aVar.f413529a);
        setL.addAll(l(aVar2.f413529a));
        for (a aVar5 : f413527n) {
            if (l(aVar5.f413529a).equals(setL)) {
                return aVar5;
            }
        }
        return GENERAL;
    }

    private static Class<? extends Object> s(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f413528o.clone();
    }

    public boolean p(Class<?> cls) {
        Class<?>[] clsArr = this.f413529a;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @xl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(" conversion category");
        Class<?>[] clsArr = this.f413529a;
        if (clsArr != null && clsArr.length != 0) {
            StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
            for (Class<?> cls : this.f413529a) {
                stringJoiner.add(cls.getSimpleName());
            }
            sb2.append(" ");
            sb2.append(stringJoiner);
            return sb2.toString();
        }
        return sb2.toString();
    }
}

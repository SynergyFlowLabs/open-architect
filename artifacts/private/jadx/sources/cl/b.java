package cl;

import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes13.dex */
public enum b {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{AttributeType.DATE, "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{AttributeType.NUMBER, "choice"});


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b[] f86924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b[] f86925h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?>[] f86927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f86928b;

    static {
        int i10 = 3 & 0;
        b bVar = DATE;
        b bVar2 = NUMBER;
        f86924g = new b[]{bVar, bVar2};
        f86925h = new b[]{bVar, bVar2};
    }

    b(Class[] clsArr, String[] strArr) {
        this.f86927a = clsArr;
        this.f86928b = strArr;
    }

    private static <E> Set<E> l(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static b n(b bVar, b bVar2) {
        b bVar3 = UNUSED;
        if (bVar != bVar3) {
            if (bVar2 != bVar3) {
                b bVar4 = GENERAL;
                if (bVar != bVar4) {
                    if (bVar2 != bVar4) {
                        Set setL = l(bVar.f86927a);
                        setL.retainAll(l(bVar2.f86927a));
                        for (b bVar5 : f86925h) {
                            if (l(bVar5.f86927a).equals(setL)) {
                                return bVar5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static boolean p(b bVar, b bVar2) {
        return n(bVar, bVar2) == bVar;
    }

    public static b q(String str) {
        String lowerCase = str.toLowerCase();
        for (b bVar : f86924g) {
            for (String str2 : bVar.f86928b) {
                if (str2.equals(lowerCase)) {
                    return bVar;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + lowerCase);
    }

    public static b r(b bVar, b bVar2) {
        b bVar3 = UNUSED;
        return (bVar == bVar3 || bVar2 == bVar3 || bVar == (bVar3 = GENERAL) || bVar2 == bVar3 || bVar == (bVar3 = DATE) || bVar2 == bVar3) ? bVar3 : NUMBER;
    }

    public boolean o(Class<?> cls) {
        Class<?>[] clsArr = this.f86927a;
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
    public String toString() {
        StringBuilder sb2 = new StringBuilder(name());
        if (this.f86927a == null) {
            sb2.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class<?> cls : this.f86927a) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb2.append(stringJoiner);
        }
        return sb2.toString();
    }
}

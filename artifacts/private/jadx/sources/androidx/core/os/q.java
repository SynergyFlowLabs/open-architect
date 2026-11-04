package androidx.core.os;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
final class q implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Locale[] f48074c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Locale f48075d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Locale f48076e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Locale f48077f = p.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale[] f48078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f48079b;

    @w0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    q(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f48078a = f48074c;
            this.f48079b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb2, locale2);
                if (i10 < localeArr.length - 1) {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
                hashSet.add(locale2);
            }
        }
        this.f48078a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f48079b = sb2.toString();
    }

    private Locale e(Collection<String> collection, boolean z10) {
        int iF = f(collection, z10);
        if (iF == -1) {
            return null;
        }
        return this.f48078a[iF];
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    private int f(Collection<String> collection, boolean z10) {
        int iG;
        Locale[] localeArr = this.f48078a;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z10) {
            iG = g(f48077f);
            if (iG == 0) {
                return 0;
            }
            if (iG >= Integer.MAX_VALUE) {
                iG = Integer.MAX_VALUE;
            }
        } else {
            iG = Integer.MAX_VALUE;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            int iG2 = g(p.b(it.next()));
            if (iG2 == 0) {
                return 0;
            }
            if (iG2 < iG) {
                iG = iG2;
            }
        }
        if (iG == Integer.MAX_VALUE) {
            return 0;
        }
        return iG;
    }

    private int g(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f48078a;
            if (i10 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i10]) > 0) {
                return i10;
            }
            i10++;
        }
    }

    private static String h(Locale locale) {
        String strA = a.a(locale);
        return !strA.isEmpty() ? strA : "";
    }

    private static boolean i(Locale locale) {
        return f48075d.equals(locale) || f48076e.equals(locale);
    }

    @androidx.annotation.g0(from = 0, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return 0;
        }
        if (!i(locale) && !i(locale2)) {
            String strH = h(locale);
            if (!strH.isEmpty()) {
                return strH.equals(h(locale2)) ? 1 : 0;
            }
            String country = locale.getCountry();
            return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
        }
        return 0;
    }

    @l1
    static void k(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append(org.apache.commons.codec.language.l.f335457d);
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.os.r
    public String a() {
        return this.f48079b;
    }

    @Override // androidx.core.os.r
    @androidx.annotation.p0
    public Object b() {
        return null;
    }

    @Override // androidx.core.os.r
    public Locale c(@NonNull String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.r
    public int d(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f48078a;
            if (i10 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i10].equals(locale)) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        Locale[] localeArr = ((q) obj).f48078a;
        if (this.f48078a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f48078a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.r
    public Locale get(int i10) {
        if (i10 < 0) {
            return null;
        }
        Locale[] localeArr = this.f48078a;
        if (i10 < localeArr.length) {
            return localeArr[i10];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f48078a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f48078a.length == 0;
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f48078a.length;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f48078a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f48078a.length - 1) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            i10++;
        }
    }
}

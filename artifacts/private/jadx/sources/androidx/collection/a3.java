package androidx.collection;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n555#1:1788\n556#1:1792\n558#1,2:1794\n560#1,4:1797\n564#1:1804\n565#1:1808\n566#1:1810\n567#1,4:1813\n573#1:1818\n574#1,8:1820\n555#1:1828\n556#1:1832\n558#1,2:1834\n560#1,4:1837\n564#1:1844\n565#1:1848\n566#1:1850\n567#1,4:1853\n573#1:1858\n574#1,8:1860\n329#1,6:1870\n339#1,3:1877\n342#1,9:1881\n329#1,6:1890\n339#1,3:1897\n342#1,9:1901\n329#1,6:1910\n339#1,3:1917\n342#1,9:1921\n357#1,4:1930\n329#1,6:1934\n339#1,3:1941\n342#1,9:1945\n361#1:1954\n357#1,4:1955\n329#1,6:1959\n339#1,3:1966\n342#1,9:1970\n361#1:1979\n357#1,4:1980\n329#1,6:1984\n339#1,3:1991\n342#1,9:1995\n361#1:2004\n555#1:2005\n556#1:2009\n558#1,2:2011\n560#1,4:2014\n564#1:2021\n565#1:2025\n566#1:2027\n567#1,4:2030\n573#1:2035\n574#1,8:2037\n555#1:2045\n556#1:2049\n558#1,2:2051\n560#1,4:2054\n564#1:2061\n565#1:2065\n566#1:2067\n567#1,4:2070\n573#1:2075\n574#1,8:2077\n372#1,3:2085\n329#1,6:2088\n339#1,3:2095\n342#1,9:2099\n375#1:2108\n357#1,4:2109\n329#1,6:2113\n339#1,3:2120\n342#1,9:2124\n361#1:2133\n357#1,4:2134\n329#1,6:2138\n339#1,3:2145\n342#1,9:2149\n361#1:2158\n357#1,4:2159\n329#1,6:2163\n339#1,3:2170\n342#1,9:2174\n361#1:2183\n357#1,4:2184\n329#1,6:2188\n339#1,3:2195\n342#1,9:2199\n361#1:2208\n1165#2,3:1789\n1179#2:1793\n1175#2:1796\n1372#2,3:1801\n1386#2,3:1805\n1312#2:1809\n1303#2:1811\n1297#2:1812\n1309#2:1817\n1393#2:1819\n1165#2,3:1829\n1179#2:1833\n1175#2:1836\n1372#2,3:1841\n1386#2,3:1845\n1312#2:1849\n1303#2:1851\n1297#2:1852\n1309#2:1857\n1393#2:1859\n1399#2:1868\n1270#2:1869\n1399#2:1876\n1270#2:1880\n1399#2:1896\n1270#2:1900\n1399#2:1916\n1270#2:1920\n1399#2:1940\n1270#2:1944\n1399#2:1965\n1270#2:1969\n1399#2:1990\n1270#2:1994\n1165#2,3:2006\n1179#2:2010\n1175#2:2013\n1372#2,3:2018\n1386#2,3:2022\n1312#2:2026\n1303#2:2028\n1297#2:2029\n1309#2:2034\n1393#2:2036\n1165#2,3:2046\n1179#2:2050\n1175#2:2053\n1372#2,3:2058\n1386#2,3:2062\n1312#2:2066\n1303#2:2068\n1297#2:2069\n1309#2:2074\n1393#2:2076\n1399#2:2094\n1270#2:2098\n1399#2:2119\n1270#2:2123\n1399#2:2144\n1270#2:2148\n1399#2:2169\n1270#2:2173\n1399#2:2194\n1270#2:2198\n1220#2:2209\n1165#2,3:2210\n1179#2:2213\n1175#2:2214\n1372#2,3:2215\n1386#2,3:2218\n1312#2:2221\n1303#2:2222\n1297#2:2223\n1309#2:2224\n1393#2:2225\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n299#1:1788\n299#1:1792\n299#1:1794,2\n299#1:1797,4\n299#1:1804\n299#1:1808\n299#1:1810\n299#1:1813,4\n299#1:1818\n299#1:1820,8\n308#1:1828\n308#1:1832\n308#1:1834,2\n308#1:1837,4\n308#1:1844\n308#1:1848\n308#1:1850\n308#1:1853,4\n308#1:1858\n308#1:1860,8\n360#1:1870,6\n360#1:1877,3\n360#1:1881,9\n367#1:1890,6\n367#1:1897,3\n367#1:1901,9\n374#1:1910,6\n374#1:1917,3\n374#1:1921,9\n379#1:1930,4\n379#1:1934,6\n379#1:1941,3\n379#1:1945,9\n379#1:1954\n385#1:1955,4\n385#1:1959,6\n385#1:1966,3\n385#1:1970,9\n385#1:1979\n395#1:1980,4\n395#1:1984,6\n395#1:1991,3\n395#1:1995,9\n395#1:2004\n400#1:2005\n400#1:2009\n400#1:2011,2\n400#1:2014,4\n400#1:2021\n400#1:2025\n400#1:2027\n400#1:2030,4\n400#1:2035\n400#1:2037,8\n403#1:2045\n403#1:2049\n403#1:2051,2\n403#1:2054,4\n403#1:2061\n403#1:2065\n403#1:2067\n403#1:2070,4\n403#1:2075\n403#1:2077,8\n407#1:2085,3\n407#1:2088,6\n407#1:2095,3\n407#1:2099,9\n407#1:2108\n432#1:2109,4\n432#1:2113,6\n432#1:2120,3\n432#1:2124,9\n432#1:2133\n459#1:2134,4\n459#1:2138,6\n459#1:2145,3\n459#1:2149,9\n459#1:2158\n485#1:2159,4\n485#1:2163,6\n485#1:2170,3\n485#1:2174,9\n485#1:2183\n510#1:2184,4\n510#1:2188,6\n510#1:2195,3\n510#1:2199,9\n510#1:2208\n299#1:1789,3\n299#1:1793\n299#1:1796\n299#1:1801,3\n299#1:1805,3\n299#1:1809\n299#1:1811\n299#1:1812\n299#1:1817\n299#1:1819\n308#1:1829,3\n308#1:1833\n308#1:1836\n308#1:1841,3\n308#1:1845,3\n308#1:1849\n308#1:1851\n308#1:1852\n308#1:1857\n308#1:1859\n334#1:1868\n341#1:1869\n360#1:1876\n360#1:1880\n367#1:1896\n367#1:1900\n374#1:1916\n374#1:1920\n379#1:1940\n379#1:1944\n385#1:1965\n385#1:1969\n395#1:1990\n395#1:1994\n400#1:2006,3\n400#1:2010\n400#1:2013\n400#1:2018,3\n400#1:2022,3\n400#1:2026\n400#1:2028\n400#1:2029\n400#1:2034\n400#1:2036\n403#1:2046,3\n403#1:2050\n403#1:2053\n403#1:2058,3\n403#1:2062,3\n403#1:2066\n403#1:2068\n403#1:2069\n403#1:2074\n403#1:2076\n407#1:2094\n407#1:2098\n432#1:2119\n432#1:2123\n459#1:2144\n459#1:2148\n485#1:2169\n485#1:2173\n510#1:2194\n510#1:2198\n527#1:2209\n555#1:2210,3\n556#1:2213\n559#1:2214\n563#1:2215,3\n564#1:2218,3\n565#1:2221\n566#1:2222\n566#1:2223\n570#1:2224\n573#1:2225\n*E\n"})
public abstract class a3<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public Object[] f12132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public int f12133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public int f12134e;

    public /* synthetic */ a3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String G(a3 a3Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function2 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function2 function3 = function2;
        return a3Var.F(charSequence, charSequence2, charSequence3, i10, charSequence5, function3);
    }

    @kotlin.a1
    public static /* synthetic */ void r() {
    }

    @kotlin.a1
    public static /* synthetic */ void s() {
    }

    @kotlin.a1
    public static /* synthetic */ void w() {
    }

    @oj.j
    @NotNull
    public final String A(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return G(this, separator, null, null, 0, null, null, 62, null);
    }

    @oj.j
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return G(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @oj.j
    @NotNull
    public final String C(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return G(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @oj.j
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return G(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @oj.j
    @NotNull
    public final String E(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return G(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @oj.j
    @NotNull
    public final String F(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function2<? super K, ? super V, ? extends CharSequence> function2) {
        long[] jArr;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr2 = this.f12131b;
        Object[] objArr3 = this.f12132c;
        long[] jArr2 = this.f12130a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        Object obj = objArr2[i16];
                        Object obj2 = objArr3[i16];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        if (function2 == null) {
                            sb2.append(obj);
                            sb2.append('=');
                            sb2.append(obj2);
                        } else {
                            sb2.append(function2.invoke(obj, obj2));
                        }
                        i12++;
                    }
                    j10 >>= i13;
                    i15++;
                    i13 = i13;
                    objArr2 = objArr2;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                objArr = objArr2;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            jArr = jArr2;
            objArr = objArr2;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            objArr2 = objArr;
            jArr2 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean H() {
        return this.f12134e == 0;
    }

    public final boolean a(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(objArr[i13], objArr2[i13]).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean b() {
        return this.f12134e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005a A[LOOP:0: B:5:0x0012->B:18:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[SYNTHETIC] */
    public final boolean c(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(objArr[i13], objArr2[i13]).booleanValue()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb2.append("metadata=[");
        int iQ = q();
        for (int i10 = 0; i10 < iQ; i10++) {
            long j10 = (this.f12130a[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
            if (j10 == 128) {
                sb2.append("Empty");
            } else if (j10 == 254) {
                sb2.append("Deleted");
            } else {
                sb2.append(j10);
            }
            sb2.append(", ");
        }
        sb2.append("], ");
        sb2.append("keys=[");
        int length = this.f12131b.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(this.f12131b[i11]);
            sb2.append(", ");
        }
        sb2.append("], ");
        sb2.append("values=[");
        int length2 = this.f12132c.length;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(this.f12132c[i12]);
            sb2.append(", ");
        }
        sb2.append("]");
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Map<K, V> e() {
        return new g1(this);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (a3Var.v() != v()) {
            return false;
        }
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (a3Var.p(obj2) != null || !a3Var.g(obj2)) {
                                    return false;
                                }
                            } else if (!Intrinsics.areEqual(obj3, a3Var.p(obj2))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final boolean f(K k10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12133d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12130a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean g(K k10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12133d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12130a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[LOOP:0: B:5:0x0010->B:19:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[SYNTHETIC] */
    public final boolean h(V v10) {
        Object[] objArr = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && Intrinsics.areEqual(v10, objArr[(i10 << 3) + i12])) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final int i() {
        return v();
    }

    public final int j(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(objArr[i14], objArr2[i14]).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final int k(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12133d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12130a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void l(@NotNull Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        block.invoke(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @kotlin.a1
    public final void m(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void n(@NotNull Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12131b;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void o(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Nullable
    public final V p(K k10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12133d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12130a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f12132c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int q() {
        return this.f12133d;
    }

    public final V t(K k10, V v10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * b3.f12150j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f12133d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f12130a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.f12131b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        return iNumberOfTrailingZeros >= 0 ? (V) this.f12132c[iNumberOfTrailingZeros] : v10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[DONT_INVERT, PHI: r8
      0x007b: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[LOOP:0: B:9:0x0023->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[EDGE_INSN: B:31:0x0080->B:28:0x0080 BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007d], SYNTHETIC] */
    @NotNull
    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        Object[] objArr = this.f12131b;
        Object[] objArr2 = this.f12132c;
        long[] jArr = this.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i11++;
                            if (i11 < this.f12134e) {
                                sb2.append(AbstractJsonLexerKt.COMMA);
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final V u(K k10, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V vP = p(k10);
        if (vP == null) {
            vP = defaultValue.invoke();
        }
        return vP;
    }

    public final int v() {
        return this.f12134e;
    }

    public final boolean x() {
        return this.f12134e == 0;
    }

    public final boolean y() {
        return this.f12134e != 0;
    }

    @oj.j
    @NotNull
    public final String z() {
        return G(this, null, null, null, 0, null, null, 63, null);
    }

    private a3() {
        this.f12130a = b3.f12145e;
        Object[] objArr = t.a.f376160c;
        this.f12131b = objArr;
        this.f12132c = objArr;
    }
}

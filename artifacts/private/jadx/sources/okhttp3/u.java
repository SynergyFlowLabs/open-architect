package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements Iterable<Pair<? extends String, ? extends String>>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f334769b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f334770a;

    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f334771a = new ArrayList(20);

        @NotNull
        public final a a(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iQ3 = StringsKt.q3(line, AbstractJsonLexerKt.COLON, 0, false, 6, null);
            if (iQ3 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt.E5(strSubstring).toString();
            String strSubstring2 = line.substring(iQ3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            b(string, strSubstring2);
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = u.f334769b;
            bVar.f(name);
            bVar.g(value, name);
            g(name, value);
            return this;
        }

        @zl.a
        @NotNull
        public final a c(@NotNull String name, @NotNull Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            d(name, new Date(value.toEpochMilli()));
            return this;
        }

        @NotNull
        public final a d(@NotNull String name, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b(name, okhttp3.internal.http.c.b(value));
            return this;
        }

        @NotNull
        public final a e(@NotNull u headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                g(headers.n(i10), headers.w(i10));
            }
            return this;
        }

        @NotNull
        public final a f(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iQ3 = StringsKt.q3(line, AbstractJsonLexerKt.COLON, 1, false, 4, null);
            if (iQ3 != -1) {
                String strSubstring = line.substring(0, iQ3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iQ3 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                g(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                g("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            g("", strSubstring3);
            return this;
        }

        @NotNull
        public final a g(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f334771a.add(name);
            this.f334771a.add(StringsKt.E5(value).toString());
            return this;
        }

        @NotNull
        public final a h(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            u.f334769b.f(name);
            g(name, value);
            return this;
        }

        @NotNull
        public final u i() {
            return new u((String[]) this.f334771a.toArray(new String[0]), null);
        }

        @Nullable
        public final String j(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f334771a.size() - 2;
            int iC = kotlin.internal.n.c(size, 0, -2);
            if (iC <= size) {
                while (!StringsKt.N1(name, this.f334771a.get(size), true)) {
                    if (size != iC) {
                        size -= 2;
                    }
                }
                return this.f334771a.get(size + 1);
            }
            return null;
        }

        @NotNull
        public final List<String> k() {
            return this.f334771a;
        }

        @NotNull
        public final a l(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f334771a.size()) {
                if (StringsKt.N1(name, this.f334771a.get(i10), true)) {
                    this.f334771a.remove(i10);
                    this.f334771a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        @NotNull
        public final a m(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = u.f334769b;
            bVar.f(name);
            bVar.g(value, name);
            l(name);
            g(name, value);
            return this;
        }

        @zl.a
        @NotNull
        public final a n(@NotNull String name, @NotNull Instant value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return o(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final a o(@NotNull String name, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            m(name, okhttp3.internal.http.c.b(value));
            return this;
        }
    }

    @SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(jk.f.y("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jk.f.y("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(jk.f.O(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = kotlin.internal.n.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!StringsKt.N1(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "function moved to extension", replaceWith = @b1(expression = "headers.toHeaders()", imports = {}))
        @oj.i(name = "-deprecated_of")
        @NotNull
        public final u a(@NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return i(headers);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "function name changed", replaceWith = @b1(expression = "headersOf(*namesAndValues)", imports = {}))
        @oj.i(name = "-deprecated_of")
        @NotNull
        public final u b(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @oj.n
        @oj.i(name = "of")
        @NotNull
        public final u i(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.E5(key).toString();
                String string2 = StringsKt.E5(value).toString();
                f(string);
                g(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new u(strArr, null);
        }

        @oj.n
        @oj.i(name = "of")
        @NotNull
        public final u j(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = StringsKt.E5(str).toString();
            }
            int iC = kotlin.internal.n.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    f(str2);
                    g(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new u(strArr, null);
        }

        private b() {
        }
    }

    public /* synthetic */ u(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @oj.n
    @oj.i(name = "of")
    @NotNull
    public static final u t(@NotNull Map<String, String> map) {
        return f334769b.i(map);
    }

    @oj.n
    @oj.i(name = "of")
    @NotNull
    public static final u u(@NotNull String... strArr) {
        return f334769b.j(strArr);
    }

    @NotNull
    public final List<String> A(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 4 ^ 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (StringsKt.N1(name, n(i11), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(w(i11));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    @oj.i(name = "-deprecated_size")
    public final int c() {
        return size();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f334770a, ((u) obj).f334770a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f334770a);
    }

    public final long i() {
        String[] strArr = this.f334770a;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.f334770a[i10].length();
        }
        return length;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.to(n(i10), w(i10));
        }
        return kotlin.jvm.internal.i.a(pairArr);
    }

    @Nullable
    public final String k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f334769b.h(this.f334770a, name);
    }

    @Nullable
    public final Date l(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strK = k(name);
        if (strK != null) {
            return okhttp3.internal.http.c.a(strK);
        }
        return null;
    }

    @zl.a
    @Nullable
    public final Instant m(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Date dateL = l(name);
        if (dateL != null) {
            return dateL.toInstant();
        }
        return null;
    }

    @NotNull
    public final String n(int i10) {
        return this.f334770a[i10 * 2];
    }

    @NotNull
    public final Set<String> p() {
        TreeSet treeSet = new TreeSet(StringsKt.T1(q1.f312784a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(n(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final a s() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.k(), this.f334770a);
        return aVar;
    }

    @oj.i(name = "size")
    public final int size() {
        return this.f334770a.length / 2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strN = n(i10);
            String strW = w(i10);
            sb2.append(strN);
            sb2.append(": ");
            if (jk.f.O(strN)) {
                strW = "██";
            }
            sb2.append(strW);
            sb2.append("\n");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final Map<String, List<String>> v() {
        TreeMap treeMap = new TreeMap(StringsKt.T1(q1.f312784a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strN = n(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strN.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(w(i10));
        }
        return treeMap;
    }

    @NotNull
    public final String w(int i10) {
        return this.f334770a[(i10 * 2) + 1];
    }

    private u(String[] strArr) {
        this.f334770a = strArr;
    }
}

package androidx.room.util;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.room.h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f75095e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f75096f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75097g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f75098h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f75099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Map<String, a> f75100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Set<d> f75101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Set<f> f75102d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final g a(@NotNull w3.d database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return h.f(database, tableName);
        }

        private b() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @jj.e(jj.a.SOURCE)
    public @interface c {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public final List<String> f75114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @NotNull
        public final List<String> f75115e;

        public d(@NotNull String referenceTable, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List<String> columnNames, @NotNull List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f75111a = referenceTable;
            this.f75112b = onDelete;
            this.f75113c = onUpdate;
            this.f75114d = columnNames;
            this.f75115e = referenceColumnNames;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (Intrinsics.areEqual(this.f75111a, dVar.f75111a) && Intrinsics.areEqual(this.f75112b, dVar.f75112b) && Intrinsics.areEqual(this.f75113c, dVar.f75113c) && Intrinsics.areEqual(this.f75114d, dVar.f75114d)) {
                return Intrinsics.areEqual(this.f75115e, dVar.f75115e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f75111a.hashCode() * 31) + this.f75112b.hashCode()) * 31) + this.f75113c.hashCode()) * 31) + this.f75114d.hashCode()) * 31) + this.f75115e.hashCode();
        }

        @NotNull
        public String toString() {
            return "ForeignKey{referenceTable='" + this.f75111a + "', onDelete='" + this.f75112b + " +', onUpdate='" + this.f75113c + "', columnNames=" + this.f75114d + ", referenceColumnNames=" + this.f75115e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f75116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f75117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f75118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f75119d;

        public e(int i10, int i11, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f75116a = i10;
            this.f75117b = i11;
            this.f75118c = from;
            this.f75119d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull e other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.f75116a - other.f75116a;
            return i10 == 0 ? this.f75117b - other.f75117b : i10;
        }

        @NotNull
        public final String k() {
            return this.f75118c;
        }

        public final int l() {
            return this.f75116a;
        }

        public final int n() {
            return this.f75117b;
        }

        @NotNull
        public final String o() {
            return this.f75119d;
        }
    }

    public g(@NotNull String name, @NotNull Map<String, a> columns, @NotNull Set<d> foreignKeys, @Nullable Set<f> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f75099a = name;
        this.f75100b = columns;
        this.f75101c = foreignKeys;
        this.f75102d = set;
    }

    @n
    @NotNull
    public static final g a(@NotNull w3.d dVar, @NotNull String str) {
        return f75095e.a(dVar, str);
    }

    public boolean equals(@Nullable Object obj) {
        Set<f> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.f75099a, gVar.f75099a) && Intrinsics.areEqual(this.f75100b, gVar.f75100b) && Intrinsics.areEqual(this.f75101c, gVar.f75101c)) {
            Set<f> set2 = this.f75102d;
            if (set2 != null && (set = gVar.f75102d) != null) {
                return Intrinsics.areEqual(set2, set);
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f75099a.hashCode() * 31) + this.f75100b.hashCode()) * 31) + this.f75101c.hashCode();
    }

    @NotNull
    public String toString() {
        return "TableInfo{name='" + this.f75099a + "', columns=" + this.f75100b + ", foreignKeys=" + this.f75101c + ", indices=" + this.f75102d + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ g(String str, Map map, Set set, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i10 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull String name, @NotNull Map<String, a> columns, @NotNull Set<d> foreignKeys) {
        this(name, columns, foreignKeys, SetsKt.emptySet());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
    }

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final C0746a f75103h = new C0746a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final boolean f75106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final int f75107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @Nullable
        public final String f75108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oj.f
        public final int f75109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        public final int f75110g;

        /* JADX INFO: renamed from: androidx.room.util.g$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        public static final class C0746a {
            public /* synthetic */ C0746a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            @n
            @l1
            public final boolean b(@NotNull String current, @Nullable String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.areEqual(StringsKt.E5(strSubstring).toString(), str);
            }

            private C0746a() {
            }
        }

        public a(@NotNull String name, @NotNull String type, boolean z10, int i10, @Nullable String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f75104a = name;
            this.f75105b = type;
            this.f75106c = z10;
            this.f75107d = i10;
            this.f75108e = str;
            this.f75109f = i11;
            this.f75110g = b(type);
        }

        @n
        @l1
        public static final boolean a(@NotNull String str, @Nullable String str2) {
            return f75103h.b(str, str2);
        }

        @androidx.room.i.c
        private final int b(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.V2(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt.V2(upperCase, "CHAR", false, 2, null) || StringsKt.V2(upperCase, "CLOB", false, 2, null) || StringsKt.V2(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt.V2(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt.V2(upperCase, "REAL", false, 2, null) || StringsKt.V2(upperCase, "FLOA", false, 2, null) || StringsKt.V2(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        @androidx.room.i.c
        public static /* synthetic */ void c() {
        }

        public final boolean d() {
            return this.f75107d > 0;
        }

        public boolean equals(@Nullable Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f75107d != ((a) obj).f75107d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.f75104a, aVar.f75104a) || this.f75106c != aVar.f75106c) {
                return false;
            }
            if (this.f75109f == 1 && aVar.f75109f == 2 && (str3 = this.f75108e) != null && !f75103h.b(str3, aVar.f75108e)) {
                return false;
            }
            if (this.f75109f == 2 && aVar.f75109f == 1 && (str2 = aVar.f75108e) != null && !f75103h.b(str2, this.f75108e)) {
                return false;
            }
            int i10 = this.f75109f;
            return (i10 == 0 || i10 != aVar.f75109f || ((str = this.f75108e) == null ? aVar.f75108e == null : f75103h.b(str, aVar.f75108e))) && this.f75110g == aVar.f75110g;
        }

        public int hashCode() {
            return (((((this.f75104a.hashCode() * 31) + this.f75110g) * 31) + (this.f75106c ? 1231 : 1237)) * 31) + this.f75107d;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f75104a);
            sb2.append("', type='");
            sb2.append(this.f75105b);
            sb2.append("', affinity='");
            sb2.append(this.f75110g);
            sb2.append("', notNull=");
            sb2.append(this.f75106c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f75107d);
            sb2.append(", defaultValue='");
            String str = this.f75108e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @l(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public a(@NotNull String name, @NotNull String type, boolean z10, int i10) {
            this(name, type, z10, i10, null, 0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    public static final class f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f75120e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f75121f = "index_";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f75122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final boolean f75123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public final List<String> f75124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public List<String> f75125d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        public f(@NotNull String name, boolean z10, @NotNull List<String> columns, @NotNull List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f75122a = name;
            this.f75123b = z10;
            this.f75124c = columns;
            this.f75125d = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(h0.a.ASC.name());
                }
            }
            this.f75125d = (List) arrayList;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f75123b == fVar.f75123b && Intrinsics.areEqual(this.f75124c, fVar.f75124c) && Intrinsics.areEqual(this.f75125d, fVar.f75125d)) {
                return StringsKt.u2(this.f75122a, f75121f, false, 2, null) ? StringsKt.u2(fVar.f75122a, f75121f, false, 2, null) : Intrinsics.areEqual(this.f75122a, fVar.f75122a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.u2(this.f75122a, f75121f, false, 2, null) ? -1184239155 : this.f75122a.hashCode()) * 31) + (this.f75123b ? 1 : 0)) * 31) + this.f75124c.hashCode()) * 31) + this.f75125d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Index{name='" + this.f75122a + "', unique=" + this.f75123b + ", columns=" + this.f75124c + ", orders=" + this.f75125d + "'}";
        }

        @l(message = "Use {@link #Index(String, boolean, List, List)}")
        public f(@NotNull String name, boolean z10, @NotNull List<String> columns) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(h0.a.ASC.name());
            }
            this(name, z10, columns, arrayList);
        }
    }
}

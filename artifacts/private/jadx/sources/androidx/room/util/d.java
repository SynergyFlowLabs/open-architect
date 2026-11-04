package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.b1;
import androidx.annotation.l1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f75089d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String[] f75090e = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f75091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Set<String> f75092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Set<String> f75093c;

    @SourceDebugExtension({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> c(w3.d dVar, String str) throws IOException {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            Cursor cursorYd = dVar.yd("PRAGMA table_info(`" + str + "`)");
            try {
                if (cursorYd.getColumnCount() > 0) {
                    int columnIndex = cursorYd.getColumnIndex("name");
                    while (cursorYd.moveToNext()) {
                        String string = cursorYd.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        setCreateSetBuilder.add(string);
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(cursorYd, null);
                return SetsKt.build(setCreateSetBuilder);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorYd, th2);
                    throw th3;
                }
            }
        }

        private final Set<String> d(w3.d dVar, String str) throws IOException {
            Cursor cursorYd = dVar.yd("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String sql = cursorYd.moveToFirst() ? cursorYd.getString(cursorYd.getColumnIndexOrThrow("sql")) : "";
                kotlin.io.c.a(cursorYd, null);
                Intrinsics.checkNotNullExpressionValue(sql, "sql");
                return a(sql);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorYd, th2);
                    throw th3;
                }
            }
        }

        @n
        @l1
        @NotNull
        public final Set<String> a(@NotNull String createStatement) {
            Character ch2;
            Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return SetsKt.emptySet();
            }
            String strSubstring = createStatement.substring(StringsKt.q3(createStatement, '(', 0, false, 6, null) + 1, StringsKt.F3(createStatement, ')', 0, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i11);
                int i13 = i12 + 1;
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch3 = (Character) arrayDeque.peek();
                        if (ch3 != null && ch3.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.peek()) != null && ch2.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i10 + 1, i12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i14 = 0;
                    boolean z10 = false;
                    while (i14 <= length) {
                        boolean z11 = Intrinsics.compare((int) strSubstring2.charAt(!z10 ? i14 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i14++;
                        } else {
                            z10 = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i14, length + 1).toString());
                    i10 = i12;
                }
                i11++;
                i12 = i13;
            }
            String strSubstring3 = strSubstring.substring(i10 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt.E5(strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                for (String str2 : d.f75090e) {
                    if (StringsKt.u2(str, str2, false, 2, null)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
            return CollectionsKt.toSet(arrayList2);
        }

        @n
        @NotNull
        public final d b(@NotNull w3.d database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new d(tableName, c(database, tableName), d(database, tableName));
        }

        private a() {
        }
    }

    public d(@NotNull String name, @NotNull Set<String> columns, @NotNull Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f75091a = name;
        this.f75092b = columns;
        this.f75093c = options;
    }

    @n
    @l1
    @NotNull
    public static final Set<String> b(@NotNull String str) {
        return f75089d.a(str);
    }

    @n
    @NotNull
    public static final d c(@NotNull w3.d dVar, @NotNull String str) {
        return f75089d.b(dVar, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.f75091a, dVar.f75091a) && Intrinsics.areEqual(this.f75092b, dVar.f75092b)) {
            return Intrinsics.areEqual(this.f75093c, dVar.f75093c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f75091a.hashCode() * 31) + this.f75092b.hashCode()) * 31) + this.f75093c.hashCode();
    }

    @NotNull
    public String toString() {
        return "FtsTableInfo{name='" + this.f75091a + "', columns=" + this.f75092b + ", options=" + this.f75093c + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String name, @NotNull Set<String> columns, @NotNull String createSql) {
        this(name, columns, f75089d.a(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }
}

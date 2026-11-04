package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import androidx.annotation.b1;
import androidx.annotation.l1;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n145#1,7:185\n13644#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:185,7\n127#1:192,3\n*E\n"})
@oj.i(name = "CursorUtil")
public final class a {

    /* JADX INFO: renamed from: androidx.room.util.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nCursorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,184:1\n13644#2,3:185\n*S KotlinDebug\n*F\n+ 1 CursorUtil.kt\nandroidx/room/util/CursorUtil$wrapMappedColumns$2\n*L\n175#1:185,3\n*E\n"})
    public static final class C0745a extends CursorWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f75087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f75088b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0745a(Cursor cursor, String[] strArr, int[] iArr) {
            super(cursor);
            this.f75087a = strArr;
            this.f75088b = iArr;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getColumnIndex(@NotNull String columnName) {
            Intrinsics.checkNotNullParameter(columnName, "columnName");
            String[] strArr = this.f75087a;
            int[] iArr = this.f75088b;
            int length = strArr.length;
            int i10 = 0;
            int i11 = 3 >> 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = i12 + 1;
                if (StringsKt.N1(strArr[i10], columnName, true)) {
                    return iArr[i12];
                }
                i10++;
                i12 = i13;
            }
            return super.getColumnIndex(columnName);
        }
    }

    @NotNull
    public static final Cursor a(@NotNull Cursor c10) throws IOException {
        Intrinsics.checkNotNullParameter(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            kotlin.io.c.a(c10, null);
            return matrixCursor;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(c10, th2);
                throw th3;
            }
        }
    }

    private static final int b(Cursor cursor, String str) {
        return -1;
    }

    @l1
    public static final int c(@NotNull String[] columnNames, @NotNull String name) {
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() < name.length() + 2 || (!StringsKt.M1(str3, str, false, 2, null) && (str3.charAt(0) != '`' || !StringsKt.M1(str3, str2, false, 2, null)))) {
                i10++;
                i11 = i12;
            }
            return i11;
        }
        return -1;
    }

    public static final int d(@NotNull Cursor c10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c10, name);
    }

    public static final int e(@NotNull Cursor c10, @NotNull String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int iD = d(c10, name);
        if (iD >= 0) {
            return iD;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            int i10 = 1 >> 0;
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception unused) {
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strJoinToString$default);
    }

    public static final <R> R f(@NotNull Cursor cursor, @NotNull Function1<? super Cursor, ? extends R> block) throws IOException {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(cursor);
            h0.d(1);
            kotlin.io.c.a(cursor, null);
            h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                kotlin.io.c.a(cursor, th2);
                h0.c(1);
                throw th3;
            }
        }
    }

    @NotNull
    public static final Cursor g(@NotNull Cursor cursor, @NotNull String[] columnNames, @NotNull int[] mapping) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new C0745a(cursor, columnNames, mapping);
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }
}

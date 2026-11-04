package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.b1;
import androidx.room.b2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
@oj.i(name = "DBUtil")
public final class b {
    @Nullable
    public static final CancellationSignal a() {
        return w3.c.a.b();
    }

    public static final void b(@NotNull w3.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Cursor cursorYd = db2.yd("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorYd.moveToNext()) {
            try {
                listCreateListBuilder.add(cursorYd.getString(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorYd, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f312394a;
        kotlin.io.c.a(cursorYd, null);
        for (String triggerName : CollectionsKt.build(listCreateListBuilder)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (StringsKt.u2(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.X8("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final void c(@NotNull w3.d db2, @NotNull String tableName) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorYd = db2.yd("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (cursorYd.getCount() > 0) {
                throw new SQLiteConstraintException(d(cursorYd));
            }
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(cursorYd, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorYd, th2);
                throw th3;
            }
        }
    }

    private static final String d(Cursor cursor) {
        StringBuilder sb2 = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cursor.getString(0));
                sb2.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                Intrinsics.checkNotNullExpressionValue(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\n");
        sb2.append("Number of rows in violation: ");
        sb2.append(count);
        sb2.append("\n");
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append("\tParent Table = ");
            sb2.append(str2);
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append(str);
            sb2.append("\n");
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @l(message = "This is only used in the generated code and shouldn't be called directly.")
    @NotNull
    public static final Cursor e(@NotNull b2 db2, @NotNull w3.g sqLiteQuery, boolean z10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return f(db2, sqLiteQuery, z10, null);
    }

    @NotNull
    public static final Cursor f(@NotNull b2 db2, @NotNull w3.g sqLiteQuery, boolean z10, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorQuery) : cursorQuery;
    }

    public static final int g(@NotNull File databaseFile) throws IOException {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            kotlin.io.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(channel, th2);
                throw th3;
            }
        }
    }
}

package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.b1;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f75126c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f75127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public final String f75128b;

    @SourceDebugExtension({"SMAP\nViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,83:1\n145#2,7:84\n*S KotlinDebug\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n*L\n73#1:84,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final j a(@NotNull w3.d database, @NotNull String viewName) throws IOException {
            j jVar;
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            Cursor cursorYd = database.yd("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                if (cursorYd.moveToFirst()) {
                    String string = cursorYd.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(0)");
                    jVar = new j(string, cursorYd.getString(1));
                } else {
                    jVar = new j(viewName, null);
                }
                kotlin.io.c.a(cursorYd, null);
                return jVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorYd, th2);
                    throw th3;
                }
            }
        }

        private a() {
        }
    }

    public j(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f75127a = name;
        this.f75128b = str;
    }

    @n
    @NotNull
    public static final j a(@NotNull w3.d dVar, @NotNull String str) {
        return f75126c.a(dVar, str);
    }

    public boolean equals(@Nullable Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Intrinsics.areEqual(this.f75127a, jVar.f75127a)) {
            String str = this.f75128b;
            if (str != null) {
                zAreEqual = Intrinsics.areEqual(str, jVar.f75128b);
            } else {
                zAreEqual = jVar.f75128b == null;
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f75127a.hashCode() * 31;
        String str = this.f75128b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ViewInfo{name='" + this.f75127a + "', sql='" + this.f75128b + "'}";
    }
}

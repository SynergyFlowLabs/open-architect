package androidx.room;

import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
public class e2 extends w3.e.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f74804h = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private n f74805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b f74806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f74807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f74808g;

    @SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull w3.d db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorYd = db2.yd("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorYd.moveToFirst() && cursorYd.getInt(0) == 0) {
                    z10 = true;
                }
                kotlin.io.c.a(cursorYd, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorYd, th2);
                    throw th3;
                }
            }
        }

        public final boolean b(@NotNull w3.d db2) throws IOException {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorYd = db2.yd("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorYd.moveToFirst() && cursorYd.getInt(0) != 0) {
                    z10 = true;
                }
                kotlin.io.c.a(cursorYd, null);
                return z10;
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

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static abstract class b {

        @oj.f
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(@NotNull w3.d dVar);

        public abstract void dropAllTables(@NotNull w3.d dVar);

        public abstract void onCreate(@NotNull w3.d dVar);

        public abstract void onOpen(@NotNull w3.d dVar);

        public void onPostMigrate(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onPreMigrate(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        @NotNull
        public c onValidateSchema(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            validateMigration(db2);
            return new c(true, null);
        }

        @kotlin.l(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final boolean f74809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final String f74810b;

        public c(boolean z10, @Nullable String str) {
            this.f74809a = z10;
            this.f74810b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(@NotNull n configuration, @NotNull b delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f74805d = configuration;
        this.f74806e = delegate;
        this.f74807f = identityHash;
        this.f74808g = legacyHash;
    }

    private final void h(w3.d dVar) throws IOException {
        if (!f74804h.b(dVar)) {
            c cVarOnValidateSchema = this.f74806e.onValidateSchema(dVar);
            if (cVarOnValidateSchema.f74809a) {
                this.f74806e.onPostMigrate(dVar);
                j(dVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f74810b);
            }
        }
        Cursor cursorQf = dVar.qf(new w3.b(d2.f74749h));
        try {
            String string = cursorQf.moveToFirst() ? cursorQf.getString(0) : null;
            kotlin.io.c.a(cursorQf, null);
            if (!Intrinsics.areEqual(this.f74807f, string) && !Intrinsics.areEqual(this.f74808g, string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f74807f + ", found: " + string);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cursorQf, th2);
                throw th3;
            }
        }
    }

    private final void i(w3.d dVar) {
        dVar.X8(d2.f74748g);
    }

    private final void j(w3.d dVar) {
        i(dVar);
        dVar.X8(d2.a(this.f74807f));
    }

    @Override // w3.e.a
    public void b(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
    }

    @Override // w3.e.a
    public void d(@NotNull w3.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean zA = f74804h.a(db2);
        this.f74806e.createAllTables(db2);
        if (!zA) {
            c cVarOnValidateSchema = this.f74806e.onValidateSchema(db2);
            if (!cVarOnValidateSchema.f74809a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f74810b);
            }
        }
        j(db2);
        this.f74806e.onCreate(db2);
    }

    @Override // w3.e.a
    public void e(@NotNull w3.d db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        g(db2, i10, i11);
    }

    @Override // w3.e.a
    public void f(@NotNull w3.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.f(db2);
        h(db2);
        this.f74806e.onOpen(db2);
        this.f74805d = null;
    }

    @Override // w3.e.a
    public void g(@NotNull w3.d db2, int i10, int i11) {
        List<androidx.room.migration.b> listE;
        Intrinsics.checkNotNullParameter(db2, "db");
        n nVar = this.f74805d;
        if (nVar == null || (listE = nVar.f75016d.e(i10, i11)) == null) {
            n nVar2 = this.f74805d;
            if (nVar2 != null && !nVar2.a(i10, i11)) {
                this.f74806e.dropAllTables(db2);
                this.f74806e.createAllTables(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f74806e.onPreMigrate(db2);
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            ((androidx.room.migration.b) it.next()).a(db2);
        }
        c cVarOnValidateSchema = this.f74806e.onValidateSchema(db2);
        if (cVarOnValidateSchema.f74809a) {
            this.f74806e.onPostMigrate(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.f74810b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e2(@NotNull n configuration, @NotNull b delegate, @NotNull String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
    }
}

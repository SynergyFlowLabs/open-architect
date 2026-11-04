package w3;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import androidx.annotation.w0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends Closeable {

    @SourceDebugExtension({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2526a f385892b = new C2526a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final String f385893c = "SupportSQLite";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f385894a;

        /* JADX INFO: renamed from: w3.e$a$a, reason: collision with other inner class name */
        public static final class C2526a {
            public /* synthetic */ C2526a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2526a() {
            }
        }

        public a(int i10) {
            this.f385894a = i10;
        }

        private final void a(String str) {
            if (!StringsKt.N1(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                if (str.subSequence(i10, length + 1).toString().length() == 0) {
                } else {
                    try {
                        w3.c.a.c(new File(str));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public void b(@NotNull d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(@NotNull d db2) {
            String strS;
            Intrinsics.checkNotNullParameter(db2, "db");
            Objects.toString(db2);
            if (!db2.isOpen()) {
                String strS2 = db2.S();
                if (strS2 != null) {
                    a(strS2);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listX1 = null;
            try {
                try {
                    listX1 = db2.X1();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listX1 == null) {
                    strS = db2.S();
                    if (strS != null) {
                        return;
                    } else {
                        return;
                    }
                }
                Iterator<T> it = listX1.iterator();
                while (zHasNext) {
                    Object obj = ((Pair) it.next()).second;
                    Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                    a((String) obj);
                }
            } finally {
                if (listX1 != null) {
                    Iterator<T> it2 = listX1.iterator();
                    while (it2.hasNext()) {
                        Object obj2 = ((Pair) it2.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj2, "p.second");
                        a((String) obj2);
                    }
                } else {
                    strS = db2.S();
                    if (strS != null) {
                        a(strS);
                    }
                }
            }
        }

        public abstract void d(@NotNull d dVar);

        public void e(@NotNull d db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(@NotNull d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(@NotNull d dVar, int i10, int i11);
    }

    public interface c {
        @NotNull
        e a(@NotNull b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @NotNull
    d getReadableDatabase();

    @NotNull
    d getWritableDatabase();

    @w0(api = 16)
    void setWriteAheadLoggingEnabled(boolean z10);

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final C2527b f385895f = new C2527b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final Context f385896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final String f385897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public final a f385898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final boolean f385899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        public final boolean f385900e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Context f385901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private String f385902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private a f385903c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f385904d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f385905e;

            public a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f385901a = context;
            }

            @NotNull
            public a a(boolean z10) {
                this.f385905e = z10;
                return this;
            }

            @NotNull
            public b b() {
                String str;
                a aVar = this.f385903c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f385904d && ((str = this.f385902b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f385901a, this.f385902b, aVar, this.f385904d, this.f385905e);
            }

            @NotNull
            public a c(@NotNull a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f385903c = callback;
                return this;
            }

            @NotNull
            public a d(@Nullable String str) {
                this.f385902b = str;
                return this;
            }

            @NotNull
            public a e(boolean z10) {
                this.f385904d = z10;
                return this;
            }
        }

        /* JADX INFO: renamed from: w3.e$b$b, reason: collision with other inner class name */
        public static final class C2527b {
            public /* synthetic */ C2527b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @n
            @NotNull
            public final a a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private C2527b() {
            }
        }

        public b(@NotNull Context context, @Nullable String str, @NotNull a callback, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f385896a = context;
            this.f385897b = str;
            this.f385898c = callback;
            this.f385899d = z10;
            this.f385900e = z11;
        }

        @n
        @NotNull
        public static final a a(@NotNull Context context) {
            return f385895f.a(context);
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}

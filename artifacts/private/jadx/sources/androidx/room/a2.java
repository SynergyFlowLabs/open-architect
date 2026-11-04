package androidx.room;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a2 f74645a = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f74646b = "ROOM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f74647c = "room_master_table";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f74648d = "_CursorConverter";

    private a2() {
    }

    @oj.n
    @NotNull
    public static final <T extends b2> b2.a<T> a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (str == null || StringsKt.w3(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new b2.a<>(context, klass, str);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static final <T, C> T b(@NotNull Class<C> klass, @NotNull String suffix) {
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r10 = klass.getPackage();
        Intrinsics.checkNotNull(r10);
        String fullPackage = r10.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = StringsKt.j2(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            int i10 = 6 ^ 0;
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    @oj.n
    @NotNull
    public static final <T extends b2> b2.a<T> c(@NotNull Context context, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new b2.a<>(context, klass, null);
    }
}

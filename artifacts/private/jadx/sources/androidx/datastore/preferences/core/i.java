package androidx.datastore.preferences.core;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "PreferencesKeys")
public final class i {
    @oj.i(name = "booleanKey")
    @NotNull
    public static final f.a<Boolean> a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "byteArrayKey")
    @NotNull
    public static final f.a<byte[]> b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "doubleKey")
    @NotNull
    public static final f.a<Double> c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "floatKey")
    @NotNull
    public static final f.a<Float> d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "intKey")
    @NotNull
    public static final f.a<Integer> e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "longKey")
    @NotNull
    public static final f.a<Long> f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "stringKey")
    @NotNull
    public static final f.a<String> g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }

    @oj.i(name = "stringSetKey")
    @NotNull
    public static final f.a<Set<String>> h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new f.a<>(name);
    }
}

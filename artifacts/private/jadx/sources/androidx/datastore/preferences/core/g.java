package androidx.datastore.preferences.core;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPreferencesFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesFactory.kt\nandroidx/datastore/preferences/core/PreferencesFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
@oj.i(name = "PreferencesFactory")
public final class g {
    @oj.i(name = "create")
    @NotNull
    public static final f a(@NotNull f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return c((f.b[]) Arrays.copyOf(pairs, pairs.length));
    }

    @oj.i(name = "createEmpty")
    @NotNull
    public static final f b() {
        return new c(null, true, 1, null);
    }

    @oj.i(name = "createMutable")
    @NotNull
    public static final c c(@NotNull f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.m((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}

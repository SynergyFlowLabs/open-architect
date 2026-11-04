package kotlin.enums;

import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l0;
import kotlin.m2;
import kotlin.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @m2(markerClass = {s.class})
    @e1(version = "2.0")
    public static final /* synthetic */ <T extends Enum<T>> a<T> a() {
        throw new l0(null, 1, 0 == true ? 1 : 0);
    }

    @a1
    @e1(version = "1.8")
    @NotNull
    public static final <E extends Enum<E>> a<E> b(@NotNull Function0<E[]> entriesProvider) {
        Intrinsics.checkNotNullParameter(entriesProvider, "entriesProvider");
        return new d(entriesProvider.invoke());
    }

    @a1
    @e1(version = "1.8")
    @NotNull
    public static final <E extends Enum<E>> a<E> c(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new d(entries);
    }
}

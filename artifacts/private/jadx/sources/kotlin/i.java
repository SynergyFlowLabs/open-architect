package kotlin;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f312505a;

    static {
        Result.a aVar = Result.Companion;
        f312505a = Result.m785constructorimpl(kotlin.coroutines.intrinsics.b.l());
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.7")
    public static final <T, R> R b(@NotNull h<T, R> hVar, T t10) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return (R) new k(hVar.a(), t10).i();
    }
}

package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCacheWindowLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheWindowLogic.kt\nandroidx/compose/foundation/lazy/layout/CacheWindowLogicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,469:1\n1#2:470\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17407a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17408b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f17409c = -1;

    public static final void a(@NotNull i iVar, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int iJ = iVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            function2.invoke(Integer.valueOf(iVar.i(i10)), Integer.valueOf(iVar.e(i10)));
        }
    }
}

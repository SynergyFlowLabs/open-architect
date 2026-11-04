package androidx.compose.runtime.internal;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.r2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,92:1\n381#2,7:93\n381#2,7:100\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n76#1:93,7\n84#1:100,7\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, n3<Object>> f36039a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36040b;

    @r2
    public static final void a() {
        f36040b = true;
    }

    public static final boolean b() {
        return f36040b;
    }

    @androidx.compose.runtime.w
    @r2
    public static /* synthetic */ void c() {
    }

    @androidx.compose.runtime.w
    @r2
    @NotNull
    public static final <T> n7<T> d(@NotNull String str, T t10) {
        HashMap<String, n3<Object>> map = f36039a;
        n3<Object> n3VarG = map.get(str);
        if (n3VarG == null) {
            n3VarG = d7.g(t10, null, 2, null);
            map.put(str, n3VarG);
        }
        Intrinsics.checkNotNull(n3VarG, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return n3VarG;
    }

    @r2
    public static final void e(@NotNull String str, @Nullable Object obj) {
        boolean z10;
        HashMap<String, n3<Object>> map = f36039a;
        n3<Object> n3VarG = map.get(str);
        if (n3VarG == null) {
            n3VarG = d7.g(obj, null, 2, null);
            map.put(str, n3VarG);
            z10 = false;
        } else {
            z10 = true;
        }
        n3<Object> n3Var = n3VarG;
        if (z10) {
            n3Var.setValue(obj);
        }
    }
}

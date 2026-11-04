package androidx.compose.ui.node;

import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,96:1\n52#2:97\n53#2,4:105\n118#3:98\n35#3,5:99\n119#3:104\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n44#1:97\n44#1:105,4\n44#1:98\n44#1:99,5\n44#1:104\n*E\n"})
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40008a = d("ViewAdapter");

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <T extends s2> T a(@NotNull View view, int i10, @NotNull Function0<? extends T> function0) {
        s2 s2Var;
        d1 d1VarB = b(view);
        List<s2> listE = d1VarB.e();
        int size = listE.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                s2Var = null;
                break;
            }
            s2Var = listE.get(i11);
            if (s2Var.getId() == i10) {
                break;
            }
            i11++;
        }
        T t10 = s2Var instanceof s2 ? (T) s2Var : null;
        if (t10 != null) {
            return t10;
        }
        T tInvoke = function0.invoke();
        d1VarB.e().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public static final d1 b(@NotNull View view) {
        int i10 = f40008a;
        Object tag = view.getTag(i10);
        d1 d1Var = tag instanceof d1 ? (d1) tag : null;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1();
        view.setTag(i10, d1Var2);
        return d1Var2;
    }

    @Nullable
    public static final d1 c(@NotNull View view) {
        Object tag = view.getTag(f40008a);
        if (tag instanceof d1) {
            return (d1) tag;
        }
        return null;
    }

    public static final int d(@NotNull String str) {
        return str.hashCode() | 50331648;
    }
}

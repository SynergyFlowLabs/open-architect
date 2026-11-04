package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,96:1\n118#2:97\n35#2,5:98\n119#2:103\n35#2,5:104\n35#2,5:109\n35#2,5:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n52#1:97\n52#1:98,5\n52#1:103\n60#1:104,5\n64#1:109,5\n68#1:114,5\n*E\n"})
public final class d1 implements s2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39720c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<s2> f39722b = new ArrayList();

    @Override // androidx.compose.ui.node.s2
    public void a(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<s2> list = this.f39722b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.s2
    public void b(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<s2> list = this.f39722b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.s2
    public void c(@NotNull View view, @NotNull ViewGroup viewGroup) {
        List<s2> list = this.f39722b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(view, viewGroup);
        }
    }

    @NotNull
    public final <T extends s2> T d(int i10, @NotNull Function0<? extends T> function0) {
        s2 s2Var;
        List<s2> listE = e();
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
        e().add(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final List<s2> e() {
        return this.f39722b;
    }

    @Override // androidx.compose.ui.node.s2
    public int getId() {
        return this.f39721a;
    }
}

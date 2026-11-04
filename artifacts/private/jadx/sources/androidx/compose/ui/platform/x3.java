package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import io.sentry.p8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n295#2,2:124\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n*L\n122#1:124,2\n*E\n"})
public final class x3 {
    @Nullable
    public static final v3 a(@NotNull List<v3> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).e() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    @e.a({"PrimitiveInCollection"})
    @Nullable
    public static final Float b(@NotNull SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfiguration, androidx.compose.ui.semantics.n.f41142a.h());
        if (aVar == null || (function1 = (Function1) aVar.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    @Nullable
    public static final androidx.compose.ui.text.p3 c(@NotNull SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.o.a(semanticsConfiguration, androidx.compose.ui.semantics.n.f41142a.i());
        if (aVar == null || (function1 = (Function1) aVar.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.p3) arrayList.get(0);
    }

    @Nullable
    public static final View d(@NotNull t0 t0Var, int i10) {
        Object next;
        Iterator<T> it = t0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.compose.ui.node.l0) ((Map.Entry) next).getKey()).K() != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.b) entry.getValue();
        }
        return null;
    }

    @Nullable
    public static final String e(int i10) {
        androidx.compose.ui.semantics.j.a aVar = androidx.compose.ui.semantics.j.f41124b;
        if (androidx.compose.ui.semantics.j.m(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (androidx.compose.ui.semantics.j.m(i10, aVar.c())) {
            return "android.widget.CheckBox";
        }
        if (androidx.compose.ui.semantics.j.m(i10, aVar.f())) {
            return "android.widget.RadioButton";
        }
        if (androidx.compose.ui.semantics.j.m(i10, aVar.e())) {
            return p8.f306016p;
        }
        if (androidx.compose.ui.semantics.j.m(i10, aVar.d())) {
            return "android.widget.Spinner";
        }
        if (androidx.compose.ui.semantics.j.m(i10, aVar.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}

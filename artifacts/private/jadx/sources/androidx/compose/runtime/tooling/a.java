package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposeStackTraceBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeStackTraceBuilder.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,311:1\n1#2:312\n34#3,5:313\n34#3,5:318\n*S KotlinDebug\n*F\n+ 1 ComposeStackTraceBuilder.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceBuilder\n*L\n90#1:313,5\n162#1:318,5\n*E\n"})
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36667b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f36668a = new ArrayList();

    private final void a(l2 l2Var, Object obj) {
        c cVarB = b(l2Var, obj);
        if (cVarB != null) {
            this.f36668a.add(cVarB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    private final c b(l2 l2Var, Object obj) {
        ArrayList<Object> arrayListH;
        String strJ = l2Var.j();
        c0 c0VarE = strJ != null ? d0.e(strJ) : null;
        if (c0VarE == null) {
            return null;
        }
        if (obj == null) {
            return new c(c0VarE, null);
        }
        ArrayList<Object> arrayListH2 = l2Var.h();
        int i10 = 0;
        if (arrayListH2 != null) {
            int size = arrayListH2.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Object obj2 = arrayListH2.get(i12);
                if (Intrinsics.areEqual(obj2, obj)) {
                    break;
                }
                l2 l2VarH = h(obj2);
                if (l2VarH != null && (l2VarH.i() == -127 || (l2VarH.i() == 0 && (obj2 instanceof androidx.compose.runtime.g) && d((androidx.compose.runtime.g) obj2) == -127))) {
                    if ((l2VarH != null ? l2VarH.j() : null) == null) {
                        if (l2VarH != null && (arrayListH = l2VarH.h()) != null) {
                            int size2 = arrayListH.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                l2 l2VarH2 = h(arrayListH.get(i13));
                                if (l2VarH2 != null && e(l2VarH2)) {
                                    i11++;
                                }
                            }
                        }
                    } else if (l2VarH == null) {
                    }
                } else if (l2VarH == null && e(l2VarH)) {
                    i11++;
                }
            }
            i10 = i11;
        }
        return new c(c0VarE, Integer.valueOf(i10));
    }

    private final boolean c(l2 l2Var, Object obj) {
        ArrayList<Object> arrayListH = l2Var.h();
        boolean z10 = false;
        if (arrayListH == null) {
            if (!l2Var.e()) {
                a(l2Var, null);
                return true;
            }
            int iG = l2Var.g();
            int iF = l2Var.f();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iG <= iIntValue && iIntValue < iF) || (iG == iF && obj != null && iG == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    a(l2Var, null);
                }
            }
            return z10;
        }
        int size = arrayListH.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayListH.get(i10);
            if (obj2 instanceof androidx.compose.runtime.g) {
                if (Intrinsics.areEqual(obj2, obj)) {
                    a(l2Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof l2)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (c((l2) obj2, obj)) {
                    a(l2Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean e(l2 l2Var) {
        String strJ = l2Var.j();
        return strJ != null && StringsKt.u2(strJ, "C", false, 2, null);
    }

    private final l2 h(Object obj) {
        if (obj instanceof androidx.compose.runtime.g) {
            return g((androidx.compose.runtime.g) obj);
        }
        if (obj instanceof l2) {
            return (l2) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public abstract int d(@NotNull androidx.compose.runtime.g gVar);

    public final void f(@Nullable l2 l2Var, @Nullable Object obj) {
        if (l2Var != null) {
            if (obj == null) {
                a(l2Var, null);
            } else {
                if (c(l2Var, obj) || l2Var.e()) {
                    return;
                }
                a(l2Var, null);
            }
        }
    }

    @Nullable
    public abstract l2 g(@NotNull androidx.compose.runtime.g gVar);

    @NotNull
    public final List<c> i() {
        return this.f36668a;
    }
}

package androidx.compose.ui.node;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n151#2,2:50\n35#2,5:52\n153#2:57\n1#3:58\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:50,2\n32#1:52,5\n32#1:57\n*E\n"})
public final class c1 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39706a;

        static {
            int[] iArr = new int[l0.e.values().length];
            try {
                iArr[l0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l0.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l0.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39706a = iArr;
        }
    }

    @NotNull
    public static final List<List<androidx.compose.ui.layout.z0>> a(@NotNull androidx.compose.ui.layout.z zVar) {
        Intrinsics.checkNotNull(zVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        l0 l0VarI4 = ((b1) zVar).i4();
        boolean zB = b(l0VarI4);
        List<l0> listB0 = l0VarI4.b0();
        ArrayList arrayList = new ArrayList(listB0.size());
        int size = listB0.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = listB0.get(i10);
            arrayList.add(zB ? l0Var.X() : l0Var.Y());
        }
        return arrayList;
    }

    private static final boolean b(l0 l0Var) {
        int i10 = a.f39706a[l0Var.m0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new kotlin.k0();
        }
        l0 l0VarJ0 = l0Var.J0();
        if (l0VarJ0 != null) {
            return b(l0VarJ0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}

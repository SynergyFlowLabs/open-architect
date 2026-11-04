package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@r2
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,5012:1\n29#2,8:5013\n37#2:5027\n287#3,6:5021\n287#3,6:5034\n919#4,2:5028\n175#5,4:5030\n180#5,3:5041\n1#6:5040\n4788#7,4:5044\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n423#1:5013,8\n423#1:5027\n423#1:5021,6\n446#1:5034,6\n423#1:5028,2\n427#1:5030,4\n427#1:5041,3\n427#1:5040\n443#1:5044,4\n*E\n"})
public final class h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35810b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f35811a;

    public h3(@NotNull w5 w5Var) {
        this.f35811a = w5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b(h3 h3Var, i3 i3Var) {
        return Integer.valueOf(h3Var.f35811a.k(i3Var.a()));
    }

    private static final void c(z5 z5Var, int i10) {
        while (z5Var.k0() >= 0 && z5Var.i0() <= i10) {
            z5Var.s1();
            z5Var.V();
        }
    }

    private static final void d(z5 z5Var, int i10) {
        c(z5Var, i10);
        while (z5Var.h0() != i10 && !z5Var.D0()) {
            if (i10 < m0.U(z5Var)) {
                z5Var.D1();
            } else {
                z5Var.r1();
            }
        }
        if (!(z5Var.h0() == i10)) {
            m0.y("Unexpected slot table structure");
        }
        z5Var.D1();
    }

    @NotNull
    public final androidx.collection.a3<i3, h3> e(@NotNull i<?> iVar, @NotNull androidx.collection.s2<i3> s2Var) {
        Object[] objArr = s2Var.f12449a;
        int i10 = s2Var.f12450b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i12 >= i10) {
                break;
            }
            if (!this.f35811a.b0(((i3) objArr[i12]).a())) {
                androidx.collection.g2 g2Var = new androidx.collection.g2(i11, i13, null);
                Object[] objArr2 = s2Var.f12449a;
                int i14 = s2Var.f12450b;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object obj = objArr2[i15];
                    if (this.f35811a.b0(((i3) obj).a())) {
                        g2Var.a0(obj);
                    }
                }
                s2Var = g2Var;
                break;
            }
            i12++;
        }
        androidx.collection.s2 s2VarG = androidx.compose.runtime.collection.b.g(s2Var, new Function1() { // from class: androidx.compose.runtime.g3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return h3.b(this.f35801a, (i3) obj2);
            }
        });
        if (s2VarG.H()) {
            return androidx.collection.b3.b();
        }
        androidx.collection.k2 k2VarU = androidx.collection.b3.u();
        z5 z5VarA0 = this.f35811a.a0();
        try {
            Object[] objArr3 = s2VarG.f12449a;
            int i16 = s2VarG.f12450b;
            for (int i17 = 0; i17 < i16; i17++) {
                i3 i3Var = (i3) objArr3[i17];
                int iE = z5VarA0.E(i3Var.a());
                int iV0 = z5VarA0.V0(iE);
                c(z5VarA0, iV0);
                d(z5VarA0, iV0);
                z5VarA0.B(iE - z5VarA0.h0());
                k2VarU.q0(i3Var, m0.F(i3Var.b(), i3Var, z5VarA0, iVar));
            }
            c(z5VarA0, Integer.MAX_VALUE);
            Unit unit = Unit.f312394a;
            z5VarA0.M(true);
            return k2VarU;
        } catch (Throwable th2) {
            z5VarA0.M(false);
            throw th2;
        }
    }

    @NotNull
    public final w5 f() {
        return this.f35811a;
    }
}

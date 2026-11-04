package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.annotation.w0;
import androidx.collection.k2;
import androidx.compose.ui.platform.x3;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.d0;
import androidx.compose.ui.semantics.z;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPopulateViewStructure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,192:1\n357#2,4:193\n329#2,6:197\n339#2,3:204\n342#2,9:208\n361#2:217\n357#2,4:218\n329#2,6:222\n339#2,3:229\n342#2,9:233\n361#2:242\n1399#3:203\n1270#3:207\n1399#3:228\n1270#3:232\n1#4:243\n35#5,5:244\n*S KotlinDebug\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n*L\n70#1:193,4\n70#1:197,6\n70#1:204,3\n70#1:208,9\n70#1:217\n93#1:218,4\n93#1:222,6\n93#1:229,3\n93#1:233,9\n93#1:242\n70#1:203\n70#1:207\n93#1:228\n93#1:232\n160#1:244,5\n*E\n"})
public final class y {

    static final class a extends l0 implements pj.o<Integer, Integer, Integer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f37070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewStructure f37071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, ViewStructure viewStructure) {
            super(4);
            this.f37070a = iVar;
            this.f37071b = viewStructure;
        }

        public final void c(int i10, int i11, int i12, int i13) {
            this.f37070a.v(this.f37071b, i10, i11, 0, 0, i12 - i10, i13 - i11);
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x01b8 A[EDGE_INSN: B:175:0x01b8->B:66:0x01b8 BREAK  A[LOOP:0: B:9:0x0045->B:64:0x0197], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0195 A[DONT_INVERT, PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0195: PHI (r21v6 androidx.compose.ui.autofill.s) = (r21v5 androidx.compose.ui.autofill.s), (r21v7 androidx.compose.ui.autofill.s) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r23v11 v0.a) = (r23v10 v0.a), (r23v12 v0.a) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r24v6 androidx.compose.ui.autofill.u) = (r24v5 androidx.compose.ui.autofill.u), (r24v7 androidx.compose.ui.autofill.u) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r26v6 androidx.compose.ui.semantics.j) = (r26v5 androidx.compose.ui.semantics.j), (r26v7 androidx.compose.ui.semantics.j) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r29v6 androidx.compose.ui.text.f) = (r29v5 androidx.compose.ui.text.f), (r29v7 androidx.compose.ui.text.f) binds: [B:10:0x0053, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0197 A[LOOP:0: B:9:0x0045->B:64:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x025a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @w0(26)
    public static final void a(@NotNull ViewStructure viewStructure, @NotNull androidx.compose.ui.semantics.p pVar, @NotNull AutofillId autofillId, @Nullable String str, @NotNull androidx.compose.ui.spatial.f fVar) {
        long j10;
        char c10;
        long j11;
        v0.a aVar;
        s sVar;
        boolean z10;
        u uVar;
        Boolean bool;
        androidx.compose.ui.semantics.j jVar;
        boolean z11;
        Integer num;
        androidx.compose.ui.text.f fVar2;
        List list;
        Integer numValueOf;
        String strE;
        String[] strArrB;
        String[] strArrB2;
        k2<d0<?>, Object> k2VarT;
        z zVar;
        z zVar2;
        k2<d0<?>, Object> k2VarT2;
        v0.a aVar2;
        int i10;
        i iVar = i.f36978a;
        z zVar3 = z.f41190a;
        androidx.compose.ui.semantics.n nVar = androidx.compose.ui.semantics.n.f41142a;
        SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
        int i11 = 8;
        if (semanticsConfigurationQ0 == null || (k2VarT2 = semanticsConfigurationQ0.t()) == null) {
            j10 = 255;
            c10 = 7;
            j11 = -9187201950435737472L;
            aVar = null;
            sVar = null;
            z10 = false;
            uVar = null;
            bool = null;
            jVar = null;
            z11 = false;
            num = null;
            fVar2 = null;
        } else {
            Object[] objArr = k2VarT2.f12131b;
            j10 = 255;
            Object[] objArr2 = k2VarT2.f12132c;
            long[] jArr = k2VarT2.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                c10 = 7;
                sVar = null;
                z10 = false;
                aVar2 = null;
                uVar = null;
                bool = null;
                jVar = null;
                z11 = false;
                num = null;
                fVar2 = null;
                j11 = -9187201950435737472L;
                while (true) {
                    long j12 = jArr[i12];
                    Object[] objArr3 = objArr2;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j12 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                Object obj2 = objArr3[i15];
                                d0 d0Var = (d0) obj;
                                i10 = i11;
                                if (Intrinsics.areEqual(d0Var, zVar3.c())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    sVar = (s) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.d())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    String str2 = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (str2 != null) {
                                        iVar.t(viewStructure, str2);
                                    }
                                } else if (Intrinsics.areEqual(d0Var, zVar3.e())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    uVar = (u) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.g())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    fVar2 = (androidx.compose.ui.text.f) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.i())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    iVar.y(viewStructure, ((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.areEqual(d0Var, zVar3.B())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.D())) {
                                    z11 = true;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.F())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    jVar = (androidx.compose.ui.semantics.j) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.H())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.areEqual(d0Var, zVar3.O())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar2 = (v0.a) obj2;
                                } else if (Intrinsics.areEqual(d0Var, nVar.l())) {
                                    iVar.s(viewStructure, true);
                                } else if (Intrinsics.areEqual(d0Var, nVar.n())) {
                                    iVar.B(viewStructure, true);
                                } else if (Intrinsics.areEqual(d0Var, nVar.v())) {
                                    iVar.x(viewStructure, true);
                                } else if (Intrinsics.areEqual(d0Var, nVar.B())) {
                                    z10 = true;
                                }
                            } else {
                                i10 = i11;
                            }
                            j12 >>= i10;
                            i14++;
                            i11 = i10;
                        }
                        if (i13 != i11) {
                            break;
                        }
                        if (i12 != length) {
                            break;
                        }
                        i12++;
                        objArr2 = objArr3;
                        i11 = 8;
                    } else if (i12 != length) {
                        break;
                        break;
                    } else {
                        i12++;
                        objArr2 = objArr3;
                        i11 = 8;
                    }
                }
            } else {
                c10 = 7;
                j11 = -9187201950435737472L;
                sVar = null;
                z10 = false;
                aVar2 = null;
                uVar = null;
                bool = null;
                jVar = null;
                z11 = false;
                num = null;
                fVar2 = null;
            }
            aVar = aVar2;
        }
        SemanticsConfiguration semanticsConfigurationB = androidx.compose.ui.semantics.q.b(pVar);
        if (semanticsConfigurationB == null || (k2VarT = semanticsConfigurationB.t()) == null) {
            list = null;
        } else {
            Object[] objArr4 = k2VarT.f12131b;
            Object[] objArr5 = k2VarT.f12132c;
            long[] jArr2 = k2VarT.f12130a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i16 = 0;
                list = null;
                while (true) {
                    long j13 = jArr2[i16];
                    if ((((~j13) << c10) & j13 & j11) != j11) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j13 & j10) < 128) {
                                int i19 = (i16 << 3) + i18;
                                Object obj3 = objArr4[i19];
                                Object obj4 = objArr5[i19];
                                d0 d0Var2 = (d0) obj3;
                                zVar2 = zVar3;
                                if (Intrinsics.areEqual(d0Var2, zVar2.f())) {
                                    iVar.w(viewStructure, false);
                                } else if (Intrinsics.areEqual(d0Var2, zVar2.L())) {
                                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                zVar2 = zVar3;
                            }
                            j13 >>= 8;
                            i18++;
                            zVar3 = zVar2;
                        }
                        zVar = zVar3;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        zVar = zVar3;
                    }
                    if (i16 == length2) {
                        break;
                    }
                    i16++;
                    zVar3 = zVar;
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(pVar.K());
        if (pVar.o() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        iVar.l(viewStructure, autofillId, iIntValue);
        iVar.z(viewStructure, iIntValue, str, null, null);
        if (sVar != null) {
            numValueOf = Integer.valueOf(t.b(sVar));
        } else if (z10) {
            numValueOf = 1;
        } else {
            numValueOf = aVar != null ? 2 : null;
        }
        if (numValueOf != null) {
            iVar.m(viewStructure, numValueOf.intValue());
        }
        if (uVar != null && (strArrB2 = v.b(uVar)) != null) {
            iVar.k(viewStructure, strArrB2);
        }
        fVar.f().B(pVar.K(), new a(iVar, viewStructure));
        if (bool != null) {
            iVar.D(viewStructure, bool.booleanValue());
        }
        if (aVar != null) {
            iVar.o(viewStructure, true);
            iVar.p(viewStructure, aVar == v0.a.On);
        } else if (bool != null) {
            if (!(jVar == null ? false : androidx.compose.ui.semantics.j.m(jVar.p(), androidx.compose.ui.semantics.j.f41124b.h()))) {
                iVar.o(viewStructure, true);
                iVar.p(viewStructure, bool.booleanValue());
            }
        }
        boolean z12 = z11 || (uVar != null && (strArrB = v.b(uVar)) != null && ArraysKt.contains(strArrB, (String) ArraysKt.first(v.b(u.f37041a.t()))));
        if (z12) {
            iVar.u(viewStructure, true);
        }
        iVar.F(viewStructure, pVar.s0() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String str3 = "";
            for (int i20 = 0; i20 < size; i20++) {
                str3 = str3 + ((androidx.compose.ui.text.f) list.get(i20)).m() + '\n';
            }
            iVar.E(viewStructure, str3);
            iVar.r(viewStructure, "android.widget.TextView");
        }
        if (pVar.r0().isEmpty() && jVar != null && (strE = x3.e(jVar.p())) != null) {
            iVar.r(viewStructure, strE);
        }
        if (z10) {
            iVar.r(viewStructure, androidx.compose.ui.platform.s.T);
            if (num != null) {
                k.f36982a.a(viewStructure, num.intValue());
            }
            if (fVar2 != null) {
                iVar.n(viewStructure, iVar.d(fVar2.m()));
            }
            if (z12) {
                iVar.A(viewStructure, 129);
            }
        }
    }
}

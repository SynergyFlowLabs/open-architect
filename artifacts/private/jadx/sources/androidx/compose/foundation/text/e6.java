package androidx.compose.foundation.text;

import android.view.KeyEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class e6 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19195m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g4 f19196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.selection.u3 f19197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.y0 f19198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.selection.v4 f19201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.m0 f19202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final x7 f19203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final h3 f19204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final u3 f19205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.text.input.y0, Unit> f19206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19207l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19208a;

        static {
            int[] iArr = new int[s3.values().length];
            try {
                iArr[s3.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s3.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s3.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s3.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s3.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s3.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s3.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s3.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s3.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s3.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s3.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s3.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s3.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[s3.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[s3.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[s3.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[s3.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[s3.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[s3.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[s3.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[s3.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[s3.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[s3.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[s3.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[s3.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[s3.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[s3.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[s3.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[s3.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[s3.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[s3.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[s3.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[s3.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[s3.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[s3.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[s3.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[s3.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[s3.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[s3.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[s3.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[s3.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[s3.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[s3.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[s3.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[s3.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[s3.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[s3.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[s3.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[s3.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f19208a = iArr;
        }
    }

    public /* synthetic */ e6(g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.y0 y0Var, boolean z10, boolean z11, androidx.compose.foundation.text.selection.v4 v4Var, androidx.compose.ui.text.input.m0 m0Var, x7 x7Var, h3 h3Var, u3 u3Var2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g4Var, u3Var, y0Var, z10, z11, v4Var, m0Var, x7Var, h3Var, u3Var2, function1, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j A(androidx.compose.foundation.text.selection.r3 r3Var) {
        Integer numI = r3Var.i();
        if (numI != null) {
            return new androidx.compose.ui.text.input.h(0, numI.intValue() - androidx.compose.ui.text.w3.i(r3Var.A()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(androidx.compose.foundation.text.selection.r3 r3Var) {
        r3Var.G();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(androidx.compose.foundation.text.selection.r3 r3Var) {
        r3Var.O();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j D(androidx.compose.foundation.text.selection.r3 r3Var) {
        int iW = r3Var.w();
        if (iW == -1) {
            return null;
        }
        return new androidx.compose.ui.text.input.h(androidx.compose.ui.text.w3.i(r3Var.A()) - iW, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j E(androidx.compose.foundation.text.selection.r3 r3Var) {
        int iO = r3Var.o();
        if (iO != -1) {
            return new androidx.compose.ui.text.input.h(0, iO - androidx.compose.ui.text.w3.i(r3Var.A()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j F(androidx.compose.foundation.text.selection.r3 r3Var) {
        Integer numZ = r3Var.z();
        if (numZ == null) {
            return null;
        }
        return new androidx.compose.ui.text.input.h(androidx.compose.ui.text.w3.i(r3Var.A()) - numZ.intValue(), 0);
    }

    private final androidx.compose.ui.text.input.b G(KeyEvent keyEvent) {
        Integer numA;
        if (h6.a(keyEvent) && (numA = this.f19204i.a(keyEvent)) != null) {
            return new androidx.compose.ui.text.input.b(c5.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.text.input.y0 y0Var) {
        return Unit.f312394a;
    }

    private final void l(androidx.compose.ui.text.input.j jVar) {
        m(CollectionsKt.listOf(jVar));
    }

    private final void m(List<? extends androidx.compose.ui.text.input.j> list) {
        androidx.compose.ui.text.input.m mVarS = this.f19196a.s();
        List<? extends androidx.compose.ui.text.input.j> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new androidx.compose.ui.text.input.p());
        this.f19206k.invoke(mVarS.b(mutableList));
    }

    private final void n(Function1<? super androidx.compose.foundation.text.selection.r3, Unit> function1) {
        androidx.compose.foundation.text.selection.r3 r3Var = new androidx.compose.foundation.text.selection.r3(this.f19198c, this.f19202g, this.f19196a.n(), this.f19201f);
        function1.invoke(r3Var);
        if (androidx.compose.ui.text.w3.g(r3Var.A(), this.f19198c.l()) && Intrinsics.areEqual(r3Var.g(), this.f19198c.j())) {
            return;
        }
        this.f19206k.invoke(r3Var.j0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(s3 s3Var, e6 e6Var, kotlin.jvm.internal.i1.a aVar, androidx.compose.foundation.text.selection.r3 r3Var) {
        androidx.compose.ui.text.input.y0 y0VarH;
        androidx.compose.ui.text.input.y0 y0VarD;
        switch (s3Var == null ? -1 : a.f19208a[s3Var.ordinal()]) {
            case 1:
                e6Var.f19197b.A(false);
                return Unit.f312394a;
            case 2:
                e6Var.f19197b.y0();
                return Unit.f312394a;
            case 3:
                e6Var.f19197b.E();
                return Unit.f312394a;
            case 4:
                r3Var.d(new Function1() { // from class: androidx.compose.foundation.text.u5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.B((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                return Unit.f312394a;
            case 5:
                r3Var.e(new Function1() { // from class: androidx.compose.foundation.text.v5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.C((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                return Unit.f312394a;
            case 6:
                r3Var.H();
                return Unit.f312394a;
            case 7:
                r3Var.P();
                return Unit.f312394a;
            case 8:
                r3Var.M();
                return Unit.f312394a;
            case 9:
                r3Var.J();
                return Unit.f312394a;
            case 10:
                r3Var.W();
                return Unit.f312394a;
            case 11:
                r3Var.F();
                return Unit.f312394a;
            case 12:
                r3Var.m0();
                return Unit.f312394a;
            case 13:
                r3Var.l0();
                return Unit.f312394a;
            case 14:
                r3Var.V();
                return Unit.f312394a;
            case 15:
                r3Var.S();
                return Unit.f312394a;
            case 16:
                r3Var.T();
                return Unit.f312394a;
            case 17:
                r3Var.U();
                return Unit.f312394a;
            case 18:
                r3Var.R();
                return Unit.f312394a;
            case 19:
                r3Var.Q();
                return Unit.f312394a;
            case 20:
                List<androidx.compose.ui.text.input.j> listG0 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.w5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.D((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG0 != null) {
                    e6Var.m(listG0);
                    Unit unit = Unit.f312394a;
                }
                return Unit.f312394a;
            case 21:
                List<androidx.compose.ui.text.input.j> listG1 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.x5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.E((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG1 != null) {
                    e6Var.m(listG1);
                    Unit unit2 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 22:
                List<androidx.compose.ui.text.input.j> listG2 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.y5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.F((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG2 != null) {
                    e6Var.m(listG2);
                    Unit unit3 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 23:
                List<androidx.compose.ui.text.input.j> listG3 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.z5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.y((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG3 != null) {
                    e6Var.m(listG3);
                    Unit unit4 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 24:
                List<androidx.compose.ui.text.input.j> listG4 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.a6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.z((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG4 != null) {
                    e6Var.m(listG4);
                    Unit unit5 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 25:
                List<androidx.compose.ui.text.input.j> listG5 = r3Var.g0(new Function1() { // from class: androidx.compose.foundation.text.b6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e6.A((androidx.compose.foundation.text.selection.r3) obj);
                    }
                });
                if (listG5 != null) {
                    e6Var.m(listG5);
                    Unit unit6 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 26:
                if (e6Var.f19200e) {
                    aVar.f312744a = e6Var.f19196a.q().invoke(androidx.compose.ui.text.input.t.j(e6Var.f19207l)).booleanValue();
                } else {
                    e6Var.l(new androidx.compose.ui.text.input.b("\n", 1));
                }
                Unit unit7 = Unit.f312394a;
                return Unit.f312394a;
            case 27:
                if (e6Var.f19200e) {
                    aVar.f312744a = false;
                } else {
                    e6Var.l(new androidx.compose.ui.text.input.b("\t", 1));
                }
                Unit unit8 = Unit.f312394a;
                return Unit.f312394a;
            case 28:
                r3Var.X();
                return Unit.f312394a;
            case 29:
                r3Var.G().Y();
                return Unit.f312394a;
            case 30:
                r3Var.O().Y();
                return Unit.f312394a;
            case 31:
                r3Var.H().Y();
                return Unit.f312394a;
            case 32:
                r3Var.P().Y();
                return Unit.f312394a;
            case 33:
                r3Var.M().Y();
                return Unit.f312394a;
            case 34:
                r3Var.J().Y();
                return Unit.f312394a;
            case 35:
                r3Var.V().Y();
                return Unit.f312394a;
            case 36:
                r3Var.S().Y();
                return Unit.f312394a;
            case 37:
                r3Var.T().Y();
                return Unit.f312394a;
            case 38:
                r3Var.U().Y();
                return Unit.f312394a;
            case 39:
                r3Var.W().Y();
                return Unit.f312394a;
            case 40:
                r3Var.F().Y();
                return Unit.f312394a;
            case 41:
                r3Var.m0().Y();
                return Unit.f312394a;
            case 42:
                r3Var.l0().Y();
                return Unit.f312394a;
            case 43:
                r3Var.R().Y();
                return Unit.f312394a;
            case 44:
                r3Var.Q().Y();
                return Unit.f312394a;
            case 45:
                r3Var.f();
                return Unit.f312394a;
            case 46:
                x7 x7Var = e6Var.f19203h;
                if (x7Var != null) {
                    x7Var.c(r3Var.j0());
                }
                x7 x7Var2 = e6Var.f19203h;
                if (x7Var2 != null && (y0VarH = x7Var2.h()) != null) {
                    e6Var.f19206k.invoke(y0VarH);
                    Unit unit9 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 47:
                x7 x7Var3 = e6Var.f19203h;
                if (x7Var3 != null && (y0VarD = x7Var3.d()) != null) {
                    e6Var.f19206k.invoke(y0VarD);
                    Unit unit10 = Unit.f312394a;
                }
                return Unit.f312394a;
            case 48:
                t3.b();
            case 49:
                Unit unit11 = Unit.f312394a;
                return Unit.f312394a;
            default:
                throw new kotlin.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j y(androidx.compose.foundation.text.selection.r3 r3Var) {
        Integer numP = r3Var.p();
        if (numP != null) {
            return new androidx.compose.ui.text.input.h(0, numP.intValue() - androidx.compose.ui.text.w3.i(r3Var.A()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.j z(androidx.compose.foundation.text.selection.r3 r3Var) {
        Integer numL = r3Var.l();
        if (numL == null) {
            return null;
        }
        return new androidx.compose.ui.text.input.h(androidx.compose.ui.text.w3.i(r3Var.A()) - numL.intValue(), 0);
    }

    public final boolean o() {
        return this.f19199d;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 p() {
        return this.f19202g;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.v4 q() {
        return this.f19201f;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 r() {
        return this.f19197b;
    }

    public final boolean s() {
        return this.f19200e;
    }

    @NotNull
    public final g4 t() {
        return this.f19196a;
    }

    @Nullable
    public final x7 u() {
        return this.f19203h;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 v() {
        return this.f19198c;
    }

    public final boolean w(@NotNull KeyEvent keyEvent) {
        final s3 s3VarA;
        androidx.compose.ui.text.input.b bVarG = G(keyEvent);
        if (bVarG != null) {
            if (!this.f19199d) {
                return false;
            }
            l(bVarG);
            this.f19201f.b();
            return true;
        }
        if (androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && (s3VarA = this.f19205j.a(keyEvent)) != null && (!s3VarA.l() || this.f19199d)) {
            final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
            aVar.f312744a = true;
            n(new Function1() { // from class: androidx.compose.foundation.text.c6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e6.x(s3VarA, this, aVar, (androidx.compose.foundation.text.selection.r3) obj);
                }
            });
            x7 x7Var = this.f19203h;
            if (x7Var != null) {
                x7Var.a();
            }
            return aVar.f312744a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e6(g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.y0 y0Var, boolean z10, boolean z11, androidx.compose.foundation.text.selection.v4 v4Var, androidx.compose.ui.text.input.m0 m0Var, x7 x7Var, h3 h3Var, u3 u3Var2, Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, int i10) {
        this.f19196a = g4Var;
        this.f19197b = u3Var;
        this.f19198c = y0Var;
        this.f19199d = z10;
        this.f19200e = z11;
        this.f19201f = v4Var;
        this.f19202g = m0Var;
        this.f19203h = x7Var;
        this.f19204i = h3Var;
        this.f19205j = u3Var2;
        this.f19206k = function1;
        this.f19207l = i10;
    }

    public /* synthetic */ e6(g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.y0 y0Var, boolean z10, boolean z11, androidx.compose.foundation.text.selection.v4 v4Var, androidx.compose.ui.text.input.m0 m0Var, x7 x7Var, h3 h3Var, u3 u3Var2, Function1 function1, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(g4Var, u3Var, (i11 & 4) != 0 ? new androidx.compose.ui.text.input.y0((String) null, 0L, (androidx.compose.ui.text.w3) null, 7, (DefaultConstructorMarker) null) : y0Var, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, v4Var, (i11 & 64) != 0 ? androidx.compose.ui.text.input.m0.f41903a.a() : m0Var, (i11 & 128) != 0 ? null : x7Var, h3Var, (i11 & 512) != 0 ? w3.a() : u3Var2, (i11 & 1024) != 0 ? new Function1() { // from class: androidx.compose.foundation.text.d6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e6.k((androidx.compose.ui.text.input.y0) obj);
            }
        } : function1, i10, null);
    }
}

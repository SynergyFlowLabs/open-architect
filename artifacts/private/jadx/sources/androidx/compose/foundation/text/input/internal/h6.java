package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,318:1\n1#2:319\n61#3:320\n70#4:321\n22#5:322\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n313#1:320\n313#1:321\n313#1:322\n*E\n"})
public abstract class h6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f19620e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.selection.n f19621a = new androidx.compose.foundation.text.input.internal.selection.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.h3 f19622b = new androidx.compose.foundation.text.h3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.u3 f19623c = androidx.compose.foundation.text.w3.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.collection.b2 f19624d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19625a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.s3.values().length];
            try {
                iArr[androidx.compose.foundation.text.s3.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[androidx.compose.foundation.text.s3.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f19625a = iArr;
        }
    }

    private final float c(q6 q6Var) {
        androidx.compose.ui.layout.g0 g0VarK = q6Var.k();
        if (g0VarK == null) {
            return Float.NaN;
        }
        n0.j jVarW = null;
        if (!g0VarK.I()) {
            g0VarK = null;
        }
        if (g0VarK == null) {
            return Float.NaN;
        }
        androidx.compose.ui.layout.g0 g0VarE = q6Var.e();
        if (g0VarE != null) {
            if (!g0VarE.I()) {
                g0VarE = null;
            }
            if (g0VarE != null) {
                jVarW = androidx.compose.ui.layout.g0.W(g0VarE, g0VarK, false, 2, null);
            }
        }
        if (jVarW != null) {
            return Float.intBitsToFloat((int) (jVarW.z() & com.rabbitmq.client.k0.f265952a));
        }
        return Float.NaN;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0225  */
    /* JADX WARN: Code duplicated, block: B:93:0x0232  */
    /* JADX WARN: Code duplicated, block: B:97:0x0246  */
    /* JADX WARN: Code duplicated, block: B:99:0x024f  */
    private final boolean f(KeyEvent keyEvent, w6 w6Var, q6 q6Var, Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1, androidx.compose.ui.platform.z3 z3Var, boolean z10, boolean z11, Function0<Boolean> function0) {
        y6 y6VarX;
        Integer numA;
        boolean zBooleanValue = false;
        if (androidx.compose.foundation.text.h6.a(keyEvent) && (numA = this.f19622b.a(keyEvent)) != null) {
            String string = androidx.compose.foundation.text.c5.a(new StringBuilder(2), numA.intValue()).toString();
            if (!z10) {
                return false;
            }
            w6.H(w6Var, string, true, null, !i6.c(keyEvent), 4, null);
            this.f19621a.b();
            return true;
        }
        androidx.compose.foundation.text.s3 s3VarA = this.f19623c.a(keyEvent);
        if (s3VarA != null && (!s3VarA.l() || z10)) {
            androidx.compose.foundation.text.input.internal.selection.e eVar = new androidx.compose.foundation.text.input.internal.selection.e(w6Var, q6Var.f(), i6.c(keyEvent), c(q6Var), this.f19621a);
            switch (a.f19625a[s3VarA.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    function1.invoke(s3VarA);
                    Unit unit = Unit.f312394a;
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m && (s3VarA == androidx.compose.foundation.text.s3.UP || s3VarA == androidx.compose.foundation.text.s3.DOWN || s3VarA == androidx.compose.foundation.text.s3.LEFT_CHAR || s3VarA == androidx.compose.foundation.text.s3.RIGHT_CHAR)) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null && (y6VarX = eVar.x()) != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 4:
                    eVar.g(new Function1() { // from class: androidx.compose.foundation.text.input.internal.f6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h6.g((androidx.compose.foundation.text.input.internal.selection.e) obj);
                        }
                    });
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 5:
                    eVar.h(new Function1() { // from class: androidx.compose.foundation.text.input.internal.g6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h6.h((androidx.compose.foundation.text.input.internal.selection.e) obj);
                        }
                    });
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 6:
                    eVar.E();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 7:
                    eVar.N();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 8:
                    eVar.K();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 9:
                    eVar.G();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 10:
                    eVar.W();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 11:
                    eVar.B();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 12:
                    eVar.X();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 13:
                    eVar.C();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 14:
                    eVar.V();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 15:
                    eVar.S();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 16:
                    eVar.T();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 17:
                    eVar.U();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 18:
                    eVar.R();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 19:
                    eVar.Q();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 20:
                    eVar.J().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 21:
                    eVar.F().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 22:
                    eVar.L().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 23:
                    eVar.H().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 24:
                    eVar.V().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 25:
                    eVar.S().i();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 26:
                    if (z11) {
                        zBooleanValue = function0.invoke().booleanValue();
                    } else {
                        w6.H(w6Var, "\n", true, null, !i6.c(keyEvent), 4, null);
                        zBooleanValue = true;
                    }
                    Unit unit2 = Unit.f312394a;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 27:
                    if (!z11) {
                        w6.H(w6Var, "\t", true, null, !i6.c(keyEvent), 4, null);
                        zBooleanValue = true;
                    }
                    Unit unit3 = Unit.f312394a;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 28:
                    eVar.Y();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 29:
                    eVar.D().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 30:
                    eVar.M().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 31:
                    eVar.E().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 32:
                    eVar.N().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 33:
                    eVar.K().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 34:
                    eVar.G().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 35:
                    eVar.V().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 36:
                    eVar.S().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 37:
                    eVar.T().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 38:
                    eVar.U().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 39:
                    eVar.W().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 40:
                    eVar.B().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 41:
                    eVar.X().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 42:
                    eVar.C().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 43:
                    eVar.R().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 44:
                    eVar.Q().Z();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 45:
                    eVar.j();
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 46:
                    w6Var.O();
                    Unit unit4 = Unit.f312394a;
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 47:
                    w6Var.E();
                    Unit unit5 = Unit.f312394a;
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 48:
                    androidx.compose.foundation.text.t3.b();
                    Unit unit6 = Unit.f312394a;
                    zBooleanValue = true;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                case 49:
                    if (androidx.compose.foundation.s1.f18608m) {
                        z3Var.a();
                        zBooleanValue = true;
                    }
                    Unit unit7 = Unit.f312394a;
                    if (androidx.compose.foundation.s1.f18608m) {
                        zBooleanValue = !androidx.compose.ui.text.w3.g(eVar.k().h(), eVar.w());
                    }
                    if (!androidx.compose.ui.text.w3.g(eVar.w(), eVar.k().h())) {
                        w6Var.L(eVar.w());
                    }
                    if (eVar.x() != null) {
                        if (androidx.compose.ui.text.w3.h(w6Var.t().h())) {
                            w6Var.N(new n4(y6VarX));
                            return zBooleanValue;
                        }
                        w6Var.N(n4.d(eVar.l(), null, y6VarX, 1, null));
                    }
                    break;
                default:
                    throw new kotlin.k0();
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.foundation.text.input.internal.selection.e eVar) {
        eVar.D();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.foundation.text.input.internal.selection.e eVar) {
        eVar.M();
        return Unit.f312394a;
    }

    public boolean d(@NotNull KeyEvent keyEvent, @NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1, @NotNull androidx.compose.ui.platform.z3 z3Var, boolean z10, boolean z11, @NotNull Function0<Boolean> function0) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.a aVar = androidx.compose.ui.input.key.d.f38913b;
        if (androidx.compose.ui.input.key.d.g(iB, aVar.b())) {
            androidx.collection.b2 b2Var = this.f19624d;
            if (b2Var == null || !b2Var.d(jA)) {
                return false;
            }
            androidx.collection.b2 b2Var2 = this.f19624d;
            if (b2Var2 != null) {
                b2Var2.X(jA);
            }
            return true;
        }
        if (androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), aVar.c()) && !androidx.compose.foundation.text.h6.a(keyEvent)) {
            return false;
        }
        boolean zF = f(keyEvent, w6Var, q6Var, function1, z3Var, z10, z11, function0);
        if (zF) {
            androidx.collection.b2 b2Var3 = this.f19624d;
            if (b2Var3 == null) {
                b2Var3 = new androidx.collection.b2(3);
                this.f19624d = b2Var3;
            }
            b2Var3.U(jA);
        }
        return zF;
    }

    public boolean e(@NotNull KeyEvent keyEvent, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.focus.q qVar, @NotNull androidx.compose.ui.platform.z3 z3Var) {
        if (androidx.compose.ui.text.w3.h(w6Var.u().h()) || !androidx.compose.foundation.text.t3.a(keyEvent)) {
            return false;
        }
        d0Var.V();
        return true;
    }
}

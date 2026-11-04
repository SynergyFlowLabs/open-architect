package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.a4;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nUploadSizeLimitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSizeLimitDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/UploadSizeLimitDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n1282#2,6:68\n*S KotlinDebug\n*F\n+ 1 UploadSizeLimitDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/UploadSizeLimitDialogKt\n*L\n35#1:68,6\n*E\n"})
public final class UploadSizeLimitDialogKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nUploadSizeLimitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSizeLimitDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/UploadSizeLimitDialogKt$UploadSizeLimitDialog$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n1282#2,6:68\n*S KotlinDebug\n*F\n+ 1 UploadSizeLimitDialog.kt\nio/intercom/android/sdk/m5/conversation/ui/components/UploadSizeLimitDialogKt$UploadSizeLimitDialog$3\n*L\n40#1:68,6\n*E\n"})
    static final class AnonymousClass3 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onDismiss;

        AnonymousClass3(Function0<Unit> function0) {
            this.$onDismiss = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            c0Var.E(-891282084);
            boolean zD = c0Var.D(this.$onDismiss);
            final Function0<Unit> function0 = this.$onDismiss;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.AnonymousClass3.invoke$lambda$1$lambda$0(function0);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            a4.p((Function0) objI0, null, false, null, null, null, null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m225getLambda1$intercom_sdk_base_release(), c0Var, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UploadSizeLimitDialog(@NotNull final String title, @NotNull final String message, @Nullable Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        final Function0<Unit> function2;
        boolean z10;
        Object objI0;
        androidx.compose.runtime.c0 c0Var2;
        final Function0<Unit> function3;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2057533015);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(message) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 896) == 0) {
                function1 = function0;
                i12 |= c0VarR.k0(function1) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c0VarR.d()) {
                if (i13 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function2 = function1;
                }
                long jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
                androidx.compose.ui.window.k kVar = new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null);
                c0VarR.E(-537314259);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(function2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                c0Var2 = c0VarR;
                androidx.compose.material3.l.b((Function0) objI0, androidx.compose.runtime.internal.w.e(582096881, true, new AnonymousClass3(function2), c0VarR, 54), null, null, null, androidx.compose.runtime.internal.w.e(-905132043, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                        if ((i14 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        y3 type03 = intercomTheme.getTypography(c0Var3, i15).getType03();
                        q50.t(title, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-203197450, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                        if ((i14 & 11) == 2 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        y3 type04 = intercomTheme.getTypography(c0Var3, i15).getType04();
                        q50.t(message, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                    }
                }, c0VarR, 54), null, jM690getBackground0d7_KjU, 0L, 0L, 0L, 0.0f, kVar, c0Var2, 1769520, 3072, 7836);
                function3 = function2;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                function3 = function1;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3(title, message, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        function1 = function0;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function2 = function1;
            }
            long jM690getBackground0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
            androidx.compose.ui.window.k kVar2 = new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null);
            c0VarR.E(-537314259);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            c0Var2 = c0VarR;
            androidx.compose.material3.l.b((Function0) objI0, androidx.compose.runtime.internal.w.e(582096881, true, new AnonymousClass3(function2), c0VarR, 54), null, null, null, androidx.compose.runtime.internal.w.e(-905132043, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                    if ((i14 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    y3 type03 = intercomTheme.getTypography(c0Var3, i15).getType03();
                    q50.t(title, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-203197450, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                    if ((i14 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    y3 type04 = intercomTheme.getTypography(c0Var3, i15).getType04();
                    q50.t(message, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), null, jM690getBackground0d7_KjU2, 0L, 0L, 0L, 0.0f, kVar2, c0Var2, 1769520, 3072, 7836);
            function3 = function2;
        } else {
            if (i13 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function2 = function1;
            }
            long jM690getBackground0d7_KjU3 = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
            androidx.compose.ui.window.k kVar3 = new androidx.compose.ui.window.k(false, false, false, 5, (DefaultConstructorMarker) null);
            c0VarR.E(-537314259);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$2$lambda$1(function2);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            c0Var2 = c0VarR;
            androidx.compose.material3.l.b((Function0) objI0, androidx.compose.runtime.internal.w.e(582096881, true, new AnonymousClass3(function2), c0VarR, 54), null, null, null, androidx.compose.runtime.internal.w.e(-905132043, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                    if ((i14 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    y3 type03 = intercomTheme.getTypography(c0Var3, i15).getType03();
                    q50.t(title, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type03, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), androidx.compose.runtime.internal.w.e(-203197450, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i14) {
                    if ((i14 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    y3 type04 = intercomTheme.getTypography(c0Var3, i15).getType04();
                    q50.t(message, null, intercomTheme.getColors(c0Var3, i15).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, type04, c0Var3, 0, 0, 131066);
                }
            }, c0VarR, 54), null, jM690getBackground0d7_KjU3, 0L, 0L, 0L, 0.0f, kVar3, c0Var2, 1769520, 3072, 7836);
            function3 = function2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.t2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$3(title, message, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialog$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialog$lambda$3(String title, String message, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(message, "$message");
        UploadSizeLimitDialog(title, message, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void UploadSizeLimitDialogPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-532105575);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 4 ^ 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m226getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UploadSizeLimitDialogKt.UploadSizeLimitDialogPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadSizeLimitDialogPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        UploadSizeLimitDialogPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}

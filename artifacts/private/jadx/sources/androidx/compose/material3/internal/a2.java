package androidx.compose.material3.internal;

import androidx.compose.ui.platform.o4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,11:167\n99#1,18:181\n117#2,2:147\n34#2,6:149\n119#2:155\n34#2,6:160\n119#2:166\n117#2,2:199\n34#2,6:201\n119#2:207\n117#2,2:208\n34#2,6:210\n119#2:216\n117#2,2:217\n34#2,6:219\n119#2:225\n65#3:178\n60#4:179\n22#5:180\n118#6:226\n113#6:227\n63#7:228\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n*L\n42#1:137,10\n42#1:156,4\n42#1:167,11\n42#1:181,18\n42#1:147,2\n42#1:149,6\n42#1:155\n42#1:160,6\n42#1:166\n83#1:199,2\n83#1:201,6\n83#1:207\n87#1:208,2\n87#1:210,6\n87#1:216\n124#1:217,2\n124#1:219,6\n124#1:225\n46#1:178\n46#1:179\n46#1:180\n126#1:226\n127#1:227\n128#1:228\n*E\n"})
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f28650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f28651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f28652c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {145, 186}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f28656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f28657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f28658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f28659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28660h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28659g = obj;
            this.f28660h |= Integer.MIN_VALUE;
            return a2.a(null, 0L, 0, null, this);
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r((float) 0.125d);
        f28650a = fR;
        float fR2 = androidx.compose.ui.unit.h.r(18);
        f28651b = fR2;
        f28652c = fR / fR2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb A[LOOP:0: B:25:0x00d0->B:29:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[EDGE_INSN: B:62:0x00f7->B:31:0x00f7 BREAK  A[LOOP:0: B:25:0x00d0->B:29:0x00eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0133 -> B:47:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x017c -> B:54:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x019a -> B:47:0x013b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r20, long r21, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.c0, ? super java.lang.Float, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r25) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.a2.a(androidx.compose.ui.input.pointer.c, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object b(androidx.compose.ui.input.pointer.c cVar, long j10, int i10, Function2<? super androidx.compose.ui.input.pointer.c0, ? super Float, Unit> function2, Function1<? super n0.g, Float> function1, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        float f10;
        int i11;
        int i12;
        androidx.compose.ui.input.pointer.c0 c0Var;
        float f11;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        if (c(cVar.J6(), j10)) {
            return null;
        }
        float fD = d(cVar.getViewConfiguration(), i10);
        kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
        gVar.f312750a = j10;
        float f12 = 0.0f;
        while (true) {
            int i13 = 0;
            kotlin.jvm.internal.h0.e(0);
            int i14 = 1;
            Object objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, dVar, 1, null);
            kotlin.jvm.internal.h0.e(1);
            androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) objD1;
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    f10 = f12;
                    i11 = i13;
                    i12 = i14;
                    c0Var = null;
                    break;
                }
                c0Var = listE.get(i15);
                f10 = f12;
                i11 = i13;
                i12 = i14;
                if (Boolean.valueOf(androidx.compose.ui.input.pointer.b0.d(c0Var.s(), gVar.f312750a)).booleanValue()) {
                    break;
                }
                i15++;
                f12 = f10;
                i13 = i11;
                i14 = i12;
            }
            Intrinsics.checkNotNull(c0Var);
            androidx.compose.ui.input.pointer.c0 c0Var3 = c0Var;
            if (c0Var3.F()) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.r.e(c0Var3)) {
                List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                int size2 = listE2.size();
                int i16 = i11;
                while (true) {
                    if (i16 >= size2) {
                        c0Var2 = null;
                        break;
                    }
                    c0Var2 = listE2.get(i16);
                    if (Boolean.valueOf(c0Var2.w()).booleanValue()) {
                        break;
                    }
                    i16++;
                }
                androidx.compose.ui.input.pointer.c0 c0Var4 = c0Var2;
                if (c0Var4 == null) {
                    return null;
                }
                gVar.f312750a = c0Var4.s();
                f11 = f10;
            } else {
                float fFloatValue = f10 + (function1.invoke(n0.g.d(c0Var3.u())).floatValue() - function1.invoke(n0.g.d(c0Var3.y())).floatValue());
                if (Math.abs(fFloatValue) < fD) {
                    androidx.compose.ui.input.pointer.s sVar = androidx.compose.ui.input.pointer.s.Final;
                    kotlin.jvm.internal.h0.e(i11);
                    cVar.I6(sVar, dVar);
                    kotlin.jvm.internal.h0.e(i12);
                    if (c0Var3.F()) {
                        return null;
                    }
                    f11 = fFloatValue;
                } else {
                    function2.invoke(c0Var3, Float.valueOf(fFloatValue - (Math.signum(fFloatValue) * fD)));
                    if (c0Var3.F()) {
                        return c0Var3;
                    }
                    f11 = 0.0f;
                }
                f12 = f11;
            }
            f12 = f11;
        }
    }

    private static final boolean c(androidx.compose.ui.input.pointer.q qVar, long j10) {
        androidx.compose.ui.input.pointer.c0 c0Var;
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0Var = null;
                break;
            }
            c0Var = listE.get(i10);
            if (androidx.compose.ui.input.pointer.b0.d(c0Var.s(), j10)) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.input.pointer.c0 c0Var2 = c0Var;
        if (c0Var2 != null && c0Var2.w()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float d(@NotNull o4 o4Var, int i10) {
        return androidx.compose.ui.input.pointer.r0.i(i10, androidx.compose.ui.input.pointer.r0.f39113b.b()) ? o4Var.g() * f28652c : o4Var.g();
    }
}

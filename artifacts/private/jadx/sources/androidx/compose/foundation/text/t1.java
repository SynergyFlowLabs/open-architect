package androidx.compose.foundation.text;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicText.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.android.kt\nandroidx/compose/foundation/text/BasicText_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,167:1\n75#2:168\n75#2:169\n75#2:170\n75#2:177\n75#2:178\n75#2:179\n1282#3,6:171\n1282#3,6:180\n27#4,3:186\n31#4:213\n27#4,3:214\n31#4:241\n453#5,4:189\n461#5,5:198\n457#5,10:203\n453#5,4:217\n461#5,5:226\n457#5,10:231\n149#6,5:193\n149#6,5:221\n*S KotlinDebug\n*F\n+ 1 BasicText.android.kt\nandroidx/compose/foundation/text/BasicText_androidKt\n*L\n70#1:168\n72#1:169\n73#1:170\n104#1:177\n106#1:178\n107#1:179\n76#1:171,6\n110#1:180,6\n77#1:186,3\n77#1:213\n111#1:214,3\n111#1:241\n78#1:189,4\n78#1:198,5\n78#1:203,10\n112#1:217,4\n112#1:226,5\n112#1:231,10\n78#1:193,5\n112#1:221,5\n*E\n"})
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Executor> f21578a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.foundation.text.r1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t1.h();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21579b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21580c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21581d = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static Boolean f21582e;

    /* JADX WARN: Code duplicated, block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x00a7, TryCatch #0 {RejectedExecutionException -> 0x00a7, blocks: (B:11:0x0049, B:17:0x0057, B:19:0x006c, B:24:0x0078, B:26:0x008a, B:29:0x00a2, B:28:0x0092, B:21:0x0072, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[Catch: RejectedExecutionException -> 0x00a7, TryCatch #0 {RejectedExecutionException -> 0x00a7, blocks: (B:11:0x0049, B:17:0x0057, B:19:0x006c, B:24:0x0078, B:26:0x008a, B:29:0x00a2, B:28:0x0092, B:21:0x0072, B:13:0x004f), top: B:37:0x0049 }] */
    @androidx.compose.runtime.o
    public static final void d(@NotNull final androidx.compose.ui.text.f fVar, @NotNull final androidx.compose.ui.text.y3 y3Var, @NotNull final androidx.compose.ui.text.font.y.b bVar, @Nullable final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> list, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        boolean z10;
        boolean zK;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-650368117, i10, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)");
        }
        Executor executor = (Executor) c0Var.W(f21578a);
        if (executor == null || !l(fVar.length())) {
            c0Var.E(-517807721);
            c0Var.A();
        } else {
            c0Var.E(-518708178);
            final androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            if (((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32) {
                try {
                    if (c0Var.D(y3Var)) {
                        z10 = true;
                    } else if ((i10 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = z10 | c0Var.K(wVar.ordinal()) | c0Var.k0(list) | ((((i10 & 14) ^ 6) <= 4 && c0Var.D(fVar)) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(bVar);
                    objI0 = c0Var.i0();
                    if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        Object obj = new Runnable() { // from class: androidx.compose.foundation.text.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                t1.g(y3Var, wVar, list, fVar, dVar, bVar);
                            }
                        };
                        c0Var.Y(obj);
                        objI0 = obj;
                    }
                    executor.execute((Runnable) objI0);
                } catch (RejectedExecutionException unused) {
                }
                c0Var.A();
            } else {
                if ((i10 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zK = z10 | c0Var.K(wVar.ordinal()) | c0Var.k0(list) | ((((i10 & 14) ^ 6) <= 4 && c0Var.D(fVar)) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(bVar);
                objI0 = c0Var.i0();
                if (zK) {
                    Object obj2 = new Runnable() { // from class: androidx.compose.foundation.text.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t1.g(y3Var, wVar, list, fVar, dVar, bVar);
                        }
                    };
                    c0Var.Y(obj2);
                    objI0 = obj2;
                } else {
                    Object obj3 = new Runnable() { // from class: androidx.compose.foundation.text.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t1.g(y3Var, wVar, list, fVar, dVar, bVar);
                        }
                    };
                    c0Var.Y(obj3);
                    objI0 = obj3;
                }
                executor.execute((Runnable) objI0);
                c0Var.A();
            }
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b A[Catch: RejectedExecutionException -> 0x00b4, TryCatch #0 {RejectedExecutionException -> 0x00b4, blocks: (B:11:0x0055, B:17:0x0064, B:19:0x0076, B:24:0x0086, B:26:0x0099, B:29:0x00af, B:28:0x00a2, B:21:0x007d, B:13:0x005b), top: B:38:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[Catch: RejectedExecutionException -> 0x00b4, TryCatch #0 {RejectedExecutionException -> 0x00b4, blocks: (B:11:0x0055, B:17:0x0064, B:19:0x0076, B:24:0x0086, B:26:0x0099, B:29:0x00af, B:28:0x00a2, B:21:0x007d, B:13:0x005b), top: B:38:0x0055 }] */
    @androidx.compose.runtime.o
    public static final void e(@NotNull final String str, @NotNull final androidx.compose.ui.text.y3 y3Var, @NotNull final androidx.compose.ui.text.font.y.b bVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        boolean z10;
        boolean zK;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1589371739, i10, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) c0Var.W(f21578a);
        if (executor == null || !l(str.length())) {
            c0Var.E(1255196839);
            c0Var.A();
        } else {
            c0Var.E(1254328095);
            final androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            int i11 = 3 << 0;
            if (((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32) {
                try {
                    if (c0Var.D(y3Var)) {
                        z10 = true;
                    } else if ((i10 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = z10 | c0Var.K(wVar.ordinal()) | ((((i10 & 14) ^ 6) <= 4 && c0Var.D(str)) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(bVar);
                    objI0 = c0Var.i0();
                    if (zK || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        Object obj = new Runnable() { // from class: androidx.compose.foundation.text.s1
                            @Override // java.lang.Runnable
                            public final void run() {
                                t1.f(y3Var, wVar, str, dVar, bVar);
                            }
                        };
                        c0Var.Y(obj);
                        objI0 = obj;
                    }
                    executor.execute((Runnable) objI0);
                } catch (RejectedExecutionException unused) {
                }
                c0Var.A();
            } else {
                if ((i10 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zK = z10 | c0Var.K(wVar.ordinal()) | ((((i10 & 14) ^ 6) <= 4 && c0Var.D(str)) || (i10 & 6) == 4) | c0Var.D(dVar) | c0Var.k0(bVar);
                objI0 = c0Var.i0();
                if (zK) {
                    Object obj2 = new Runnable() { // from class: androidx.compose.foundation.text.s1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t1.f(y3Var, wVar, str, dVar, bVar);
                        }
                    };
                    c0Var.Y(obj2);
                    objI0 = obj2;
                } else {
                    Object obj3 = new Runnable() { // from class: androidx.compose.foundation.text.s1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t1.f(y3Var, wVar, str, dVar, bVar);
                        }
                    };
                    c0Var.Y(obj3);
                    objI0 = obj3;
                }
                executor.execute((Runnable) objI0);
                c0Var.A();
            }
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.unit.w wVar, String str, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.e eVarA = androidx.compose.runtime.snapshots.m.a.A(androidx.compose.runtime.snapshots.m.f36535e, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.m mVarU = eVarA.u();
                try {
                    androidx.compose.ui.text.r0.d(str, androidx.compose.ui.text.z3.d(y3Var, wVar), CollectionsKt.emptyList(), dVar, bVar, null, 32, null).i();
                    Unit unit = Unit.f312394a;
                    eVarA.B(mVarU);
                    eVarA.P().a();
                    eVarA.d();
                    Trace.endSection();
                } catch (Throwable th2) {
                    eVarA.B(mVarU);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    eVarA.d();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.unit.w wVar, List list, androidx.compose.ui.text.f fVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.e eVarA = androidx.compose.runtime.snapshots.m.a.A(androidx.compose.runtime.snapshots.m.f36535e, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.m mVarU = eVarA.u();
                try {
                    androidx.compose.ui.text.y3 y3VarD = androidx.compose.ui.text.z3.d(y3Var, wVar);
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    new androidx.compose.ui.text.i0(fVar, y3VarD, (List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>>) list, dVar, bVar).i();
                    Unit unit = Unit.f312394a;
                    eVarA.B(mVarU);
                    eVarA.P().a();
                    eVarA.d();
                    Trace.endSection();
                } catch (Throwable th2) {
                    eVarA.B(mVarU);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    eVarA.d();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor h() {
        return null;
    }

    public static final boolean i() {
        if (f21582e == null) {
            f21582e = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = f21582e;
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    @androidx.annotation.l1
    public static /* synthetic */ void j() {
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Executor> k() {
        return f21578a;
    }

    public static final boolean l(int i10) {
        if (i10 < 8 || i10 >= 1000 || !i()) {
            return false;
        }
        int i11 = 5 << 1;
        return true;
    }
}

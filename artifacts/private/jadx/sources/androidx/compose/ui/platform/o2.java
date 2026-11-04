package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,183:1\n1107#2:184\n1085#2,2:185\n32#3:187\n32#3:189\n1#4:188\n424#5,8:190\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n122#1:184\n122#1:185,2\n136#1:187\n175#1:189\n178#1:190,8\n*E\n"})
final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j3 f40674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f40676c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.collection.d<androidx.compose.ui.node.u2<androidx.compose.ui.text.input.e0>> f40677d = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.node.u2[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40678e;

    @SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,183:1\n490#2,6:184\n516#2:190\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession$createInputConnection$1$1\n*L\n156#1:184,6\n158#1:190\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.text.input.e0, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.text.input.e0 e0Var) {
            e0Var.a();
            androidx.compose.runtime.collection.d dVar = o2.this.f40677d;
            Object[] objArr = dVar.f35552a;
            int iR = dVar.R();
            int i10 = 0;
            while (true) {
                if (i10 >= iR) {
                    i10 = -1;
                    break;
                } else if (Intrinsics.areEqual((androidx.compose.ui.node.u2) objArr[i10], e0Var)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                o2.this.f40677d.r0(i10);
            }
            if (o2.this.f40677d.R() == 0) {
                o2.this.f40675b.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.text.input.e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    public o2(@NotNull j3 j3Var, @NotNull Function0<Unit> function0) {
        this.f40674a = j3Var;
        this.f40675b = function0;
    }

    @Nullable
    public final InputConnection c(@NotNull EditorInfo editorInfo) {
        synchronized (this.f40676c) {
            if (this.f40678e) {
                return null;
            }
            androidx.compose.ui.text.input.e0 e0VarA = androidx.compose.ui.text.input.l0.a(this.f40674a.a(editorInfo), new a());
            this.f40677d.d(new androidx.compose.ui.node.u2<>(e0VarA));
            return e0VarA;
        }
    }

    public final void d() {
        synchronized (this.f40676c) {
            try {
                this.f40678e = true;
                androidx.compose.runtime.collection.d<androidx.compose.ui.node.u2<androidx.compose.ui.text.input.e0>> dVar = this.f40677d;
                androidx.compose.ui.node.u2<androidx.compose.ui.text.input.e0>[] u2VarArr = dVar.f35552a;
                int iR = dVar.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    androidx.compose.ui.text.input.e0 e0Var = u2VarArr[i10].get();
                    if (e0Var != null) {
                        e0Var.a();
                    }
                }
                this.f40677d.r();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f40678e;
    }
}

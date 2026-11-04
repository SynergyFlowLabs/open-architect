package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,161:1\n85#2:162\n117#2,2:163\n604#3,7:165\n51#4,4:172\n51#4,4:176\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n120#1:162\n120#1:163,2\n124#1:165,7\n137#1:172,4\n148#1:176,4\n*E\n"})
final class d1 implements androidx.compose.ui.layout.g2, androidx.compose.ui.layout.g2.a, h1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f17360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h1 f17361b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g2.a f17364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17365f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17362c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n3 f17366g = d7.g(null, null, 2, null);

    public d1(@Nullable Object obj, @NotNull h1 h1Var) {
        this.f17360a = obj;
        this.f17361b = h1Var;
    }

    private final androidx.compose.ui.layout.g2 c() {
        return (androidx.compose.ui.layout.g2) this.f17366g.getValue();
    }

    private final void g(androidx.compose.ui.layout.g2 g2Var) {
        this.f17366g.setValue(g2Var);
    }

    @Override // androidx.compose.ui.layout.g2
    @NotNull
    public androidx.compose.ui.layout.g2.a a() {
        if (this.f17365f) {
            androidx.compose.foundation.internal.e.i("Pin should not be called on an already disposed item ");
        }
        if (this.f17363d == 0) {
            this.f17361b.t(this);
            androidx.compose.ui.layout.g2 g2VarB = b();
            this.f17364e = g2VarB != null ? g2VarB.a() : null;
        }
        this.f17363d++;
        return this;
    }

    @Nullable
    public final androidx.compose.ui.layout.g2 b() {
        return c();
    }

    public final void d() {
        this.f17365f = true;
    }

    public void e(int i10) {
        this.f17362c = i10;
    }

    public final void f(@Nullable androidx.compose.ui.layout.g2 g2Var) {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            if (g2Var != c()) {
                g(g2Var);
                if (this.f17363d > 0) {
                    androidx.compose.ui.layout.g2.a aVar2 = this.f17364e;
                    if (aVar2 != null) {
                        aVar2.release();
                    }
                    this.f17364e = g2Var != null ? g2Var.a() : null;
                }
            }
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.h1.a
    public int getIndex() {
        return this.f17362c;
    }

    @Override // androidx.compose.foundation.lazy.layout.h1.a
    @Nullable
    public Object getKey() {
        return this.f17360a;
    }

    @Override // androidx.compose.ui.layout.g2.a
    public void release() {
        if (this.f17365f) {
            return;
        }
        if (!(this.f17363d > 0)) {
            androidx.compose.foundation.internal.e.i("Release should only be called once");
        }
        int i10 = this.f17363d - 1;
        this.f17363d = i10;
        if (i10 == 0) {
            this.f17361b.u(this);
            androidx.compose.ui.layout.g2.a aVar = this.f17364e;
            if (aVar != null) {
                aVar.release();
            }
            this.f17364e = null;
        }
    }
}

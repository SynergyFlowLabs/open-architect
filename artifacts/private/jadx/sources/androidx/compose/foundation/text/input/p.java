package androidx.compose.foundation.text.input;

import androidx.annotation.l1;
import androidx.compose.foundation.b2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.g0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.List;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,781:1\n1107#2:782\n1085#2,2:783\n85#3:785\n117#3,2:786\n85#3:788\n117#3,2:789\n604#4,7:791\n604#4,7:798\n51#5,4:805\n1#6:809\n424#7,8:810\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n609#1:782\n609#1:783,2\n98#1:785\n98#1:786,2\n112#1:788\n112#1:789,2\n182#1:791,7\n196#1:798,7\n197#1:805,4\n463#1:810,8\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20305g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f20306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private j f20307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f20308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f20309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x f20310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a> f20311f;

    public interface a {
        void a(@NotNull l lVar, @NotNull l lVar2, boolean z10);
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,781:1\n1#2:782\n*E\n"})
    public static final class b implements c0<p, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f20312a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f20313b = 0;

        private b() {
        }

        @Override // androidx.compose.runtime.saveable.c0
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p b(@NotNull Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jB = x3.b(iIntValue, ((Integer) obj4).intValue());
            v.a.C0147a c0147a = v.a.C0147a.f20330a;
            Intrinsics.checkNotNull(obj5);
            v vVarC = c0147a.b(obj5);
            Intrinsics.checkNotNull(vVarC);
            return new p(str, jB, vVarC, (DefaultConstructorMarker) null);
        }

        @Override // androidx.compose.runtime.saveable.c0
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(@NotNull g0 g0Var, @NotNull p pVar) {
            return CollectionsKt.listOf(pVar.p().toString(), Integer.valueOf(w3.n(pVar.o())), Integer.valueOf(w3.i(pVar.o())), v.a.C0147a.f20330a.a(g0Var, pVar.q()));
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20314a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.input.internal.undo.c.values().length];
            try {
                iArr[androidx.compose.foundation.text.input.internal.undo.c.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.undo.c.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20314a = iArr;
        }
    }

    public /* synthetic */ p(String str, long j10, v vVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(l lVar, l lVar2, boolean z10) {
        z(lVar2);
        k();
        androidx.compose.runtime.collection.d<a> dVar = this.f20311f;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            aVarArr[i10].a(lVar, lVar2, (!z10 || lVar.a(lVar2) || lVar.d() == null) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(androidx.compose.foundation.text.input.c cVar, boolean z10, androidx.compose.foundation.text.input.internal.undo.c cVar2) {
        l lVarT = t();
        if (this.f20307b.l().a() == 0 && w3.g(lVarT.h(), this.f20307b.w())) {
            if (Intrinsics.areEqual(lVarT.d(), this.f20307b.p()) && Intrinsics.areEqual(lVarT.e(), this.f20307b.q()) && Intrinsics.areEqual(lVarT.c(), this.f20307b.o())) {
                return;
            }
            C(t(), new l(this.f20307b.toString(), this.f20307b.w(), this.f20307b.p(), this.f20307b.q(), r.d(this.f20307b.p(), this.f20307b.o()), null, 32, null), z10);
            return;
        }
        boolean z11 = false;
        boolean z12 = this.f20307b.l().a() != 0;
        l lVar = new l(this.f20307b.toString(), this.f20307b.w(), this.f20307b.p(), this.f20307b.q(), r.d(this.f20307b.p(), this.f20307b.o()), null, 32, null);
        if (cVar == null) {
            if (z12 && z10) {
                z11 = true;
            }
            C(lVarT, lVar, z11);
            v(lVarT, lVar, this.f20307b.l(), cVar2);
            return;
        }
        j jVar = new j(lVar, this.f20307b.l(), lVarT, null, 8, null);
        cVar.q0(jVar);
        boolean zZ1 = StringsKt.z1(jVar.e(), lVar);
        boolean z13 = !zZ1;
        boolean zG = w3.g(jVar.w(), lVar.h());
        boolean z14 = !zG;
        if (zZ1 && zG) {
            C(lVarT, j.R(jVar, 0L, lVar.d(), null, null, 13, null), z10);
        } else {
            B(jVar, z13, z14);
        }
        v(lVarT, t(), jVar.m(), cVar2);
    }

    static /* synthetic */ void f(p pVar, androidx.compose.foundation.text.input.c cVar, boolean z10, androidx.compose.foundation.text.input.internal.undo.c cVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        }
        pVar.e(cVar, z10, cVar2);
    }

    public static /* synthetic */ void i(p pVar, androidx.compose.foundation.text.input.c cVar, boolean z10, androidx.compose.foundation.text.input.internal.undo.c cVar2, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        }
        pVar.m().l().e();
        function1.invoke(pVar.m());
        pVar.e(cVar, z10, cVar2);
    }

    @l1
    public static /* synthetic */ void n() {
    }

    @b2
    public static /* synthetic */ void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean u() {
        return ((Boolean) this.f20308c.getValue()).booleanValue();
    }

    private final void v(l lVar, l lVar2, j.a aVar, androidx.compose.foundation.text.input.internal.undo.c cVar) {
        int i10 = c.f20314a[cVar.ordinal()];
        if (i10 == 1) {
            this.f20306a.c();
        } else if (i10 == 2) {
            w.c(this.f20306a, lVar, lVar2, aVar, true);
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            w.c(this.f20306a, lVar, lVar2, aVar, false);
        }
    }

    private final void x(boolean z10) {
        this.f20308c.setValue(Boolean.valueOf(z10));
    }

    private final void z(l lVar) {
        this.f20309d.setValue(lVar);
    }

    @a1
    @NotNull
    public final j A() {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            boolean zU = u();
            aVar.x(mVarG, mVarM, function1L);
            if (zU) {
                androidx.compose.foundation.internal.e.i("TextFieldState does not support concurrent or nested editing.");
            }
            x(true);
            return new j(t(), null, null, null, 14, null);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    @l1
    public final void B(@NotNull j jVar, boolean z10, boolean z11) {
        l lVarR = j.R(this.f20307b, 0L, null, null, null, 15, null);
        if (z10) {
            this.f20307b = new j(new l(jVar.toString(), jVar.w(), null, null, null, null, 60, null), null, null, null, 14, null);
        } else if (z11) {
            this.f20307b.O(x3.b(w3.n(jVar.w()), w3.i(jVar.w())));
        }
        if (z10 || z11 || !Intrinsics.areEqual(lVarR.d(), jVar.p())) {
            this.f20307b.i();
        }
        C(lVarR, j.R(this.f20307b, 0L, null, null, null, 15, null), true);
    }

    public final void c(@NotNull a aVar) {
        this.f20311f.d(aVar);
    }

    @a1
    public final void d(@NotNull j jVar) {
        j jVar2;
        boolean z10 = jVar.m().a() > 0;
        boolean zG = w3.g(jVar.w(), this.f20307b.w());
        boolean z11 = !zG;
        if (!z10 && zG) {
            jVar.I(true);
        }
        if (z10) {
            jVar2 = jVar;
            v(t(), j.R(jVar2, 0L, null, null, null, 15, null), jVar2.m(), androidx.compose.foundation.text.input.internal.undo.c.NeverMerge);
        } else {
            jVar2 = jVar;
        }
        B(jVar2, z10, z11);
    }

    public final void g(@NotNull Function1<? super j, Unit> function1) {
        j jVarA = A();
        try {
            function1.invoke(jVarA);
            d(jVarA);
            h0.d(1);
            k();
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            k();
            h0.c(1);
            throw th2;
        }
    }

    public final void h(@Nullable androidx.compose.foundation.text.input.c cVar, boolean z10, @NotNull androidx.compose.foundation.text.input.internal.undo.c cVar2, @NotNull Function1<? super j, Unit> function1) {
        m().l().e();
        function1.invoke(m());
        e(cVar, z10, cVar2);
    }

    public final void j(@NotNull Function1<? super j, Unit> function1) {
        m().l().e();
        function1.invoke(m());
        int i10 = 1 >> 0;
        C(t(), j.R(m(), 0L, null, null, null, 15, null), true);
    }

    @a1
    public final void k() {
        x(false);
    }

    @Nullable
    public final w3 l() {
        return t().d();
    }

    @NotNull
    public final j m() {
        return this.f20307b;
    }

    public final long o() {
        return t().h();
    }

    @NotNull
    public final CharSequence p() {
        return t().i();
    }

    @NotNull
    public final v q() {
        return this.f20306a;
    }

    @NotNull
    public final x r() {
        return this.f20310e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final l t() {
        return (l) this.f20309d.getValue();
    }

    @NotNull
    public String toString() {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            return "TextFieldState(selection=" + ((Object) w3.q(o())) + ", text=\"" + ((Object) p()) + "\")";
        } finally {
            aVar.x(mVarG, mVarM, function1L);
        }
    }

    public final void w(@NotNull a aVar) {
        this.f20311f.n0(aVar);
    }

    public final void y(@NotNull j jVar) {
        this.f20307b = jVar;
    }

    @e0.c
    public /* synthetic */ p(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private p(String str, long j10, v vVar) {
        this.f20306a = vVar;
        this.f20307b = new j(new l(str, x3.c(j10, 0, str.length()), null, null, null, null, 60, null), null, null, null, 14, null);
        this.f20308c = d7.g(Boolean.FALSE, null, 2, null);
        this.f20309d = d7.g(new l(str, j10, null, null, null, null, 60, null), null, 2, null);
        this.f20310e = new x(this);
        this.f20311f = new androidx.compose.runtime.collection.d<>(new a[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? x3.a(str.length()) : j10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p(String str, long j10) {
        this(str, j10, new v(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (DefaultConstructorMarker) null);
    }
}

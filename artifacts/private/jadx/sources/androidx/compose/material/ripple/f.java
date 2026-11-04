package androidx.compose.material.ripple;

import androidx.compose.runtime.m5;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.snapshots.l0;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.q0;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,173:1\n132#2:174\n216#3,2:175\n216#3,2:177\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n121#1:174\n134#1:175,2\n153#1:177,2\n*E\n"})
final class f extends u implements m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f24749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n7<q0> f24750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n7<l> f24751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final l0<androidx.compose.foundation.interaction.l.b, m> f24752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f24753i;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f24755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f24756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f24757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, f fVar, androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24755b = mVar;
            this.f24756c = fVar;
            this.f24757d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f24755b, this.f24756c, this.f24757d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24754a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    m mVar = this.f24755b;
                    this.f24754a = 1;
                    if (mVar.f(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f24756c.f24752h.remove(this.f24757d);
                this = Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                this.f24756c.f24752h.remove(this.f24757d);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ f(boolean z10, float f10, n7 n7Var, n7 n7Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, n7Var, n7Var2);
    }

    private final void l(androidx.compose.ui.graphics.drawscope.f fVar, long j10) {
        long j11;
        Iterator<Map.Entry<androidx.compose.foundation.interaction.l.b, m>> it = this.f24752h.entrySet().iterator();
        while (it.hasNext()) {
            m value = it.next().getValue();
            float fD = this.f24751g.getValue().d();
            if (fD == 0.0f) {
                j11 = j10;
            } else {
                j11 = j10;
                value.g(fVar, q0.w(j11, fD, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j10 = j11;
        }
    }

    @Override // androidx.compose.foundation.u2
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f24753i = Float.isNaN(this.f24749e) ? n.a(cVar, this.f24748d, cVar.d()) : cVar.S7(this.f24749e);
        long jM = this.f24750f.getValue().M();
        cVar.E4();
        d(cVar, this.f24749e, jM);
        l(cVar, jM);
    }

    @Override // androidx.compose.material.ripple.u
    public void c(@NotNull androidx.compose.foundation.interaction.l.b bVar, @NotNull s0 s0Var) {
        Iterator<Map.Entry<androidx.compose.foundation.interaction.l.b, m>> it = this.f24752h.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j();
        }
        m mVar = new m(this.f24748d ? n0.g.d(bVar.a()) : null, this.f24753i, this.f24748d, null);
        this.f24752h.put(bVar, mVar);
        kotlinx.coroutines.k.f(s0Var, null, null, new a(mVar, this, bVar, null), 3, null);
    }

    @Override // androidx.compose.material.ripple.u
    public void e(@NotNull androidx.compose.foundation.interaction.l.b bVar) {
        m mVar = this.f24752h.get(bVar);
        if (mVar != null) {
            mVar.j();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        this.f24752h.clear();
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        this.f24752h.clear();
    }

    private f(boolean z10, float f10, n7<q0> n7Var, n7<l> n7Var2) {
        super(z10, n7Var2);
        this.f24748d = z10;
        this.f24749e = f10;
        this.f24750f = n7Var;
        this.f24751g = n7Var2;
        this.f24752h = w6.i();
        this.f24753i = Float.NaN;
    }
}

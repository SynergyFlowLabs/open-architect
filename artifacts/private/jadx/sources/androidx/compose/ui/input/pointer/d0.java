package androidx.compose.ui.input.pointer;

import androidx.collection.b1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,288:1\n35#2,5:289\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n192#1:289,5\n*E\n"})
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b1<a> f38997a = new b1<>(0, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f38998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f38999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39000c;

        public /* synthetic */ a(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public final boolean a() {
            return this.f39000c;
        }

        public final long b() {
            return this.f38999b;
        }

        public final long c() {
            return this.f38998a;
        }

        private a(long j10, long j11, boolean z10) {
            this.f38998a = j10;
            this.f38999b = j11;
            this.f39000c = z10;
        }
    }

    public final void a() {
        this.f38997a.b();
    }

    @NotNull
    public final i b(@NotNull e0 e0Var, @NotNull s0 s0Var) {
        long jC;
        boolean zA;
        long jW;
        b1 b1Var = new b1(e0Var.b().size());
        List<f0> listB = e0Var.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = listB.get(i10);
            a aVarG = this.f38997a.g(f0Var.q());
            if (aVarG == null) {
                zA = false;
                jC = f0Var.x();
                jW = f0Var.s();
            } else {
                jC = aVarG.c();
                zA = aVarG.a();
                jW = s0Var.w(aVarG.b());
            }
            b1Var.n(f0Var.q(), new c0(f0Var.q(), f0Var.x(), f0Var.s(), f0Var.o(), f0Var.u(), jC, jW, zA, false, f0Var.w(), f0Var.p(), f0Var.v(), f0Var.r(), null));
            if (f0Var.o()) {
                this.f38997a.n(f0Var.q(), new a(f0Var.x(), f0Var.t(), f0Var.o(), null));
            } else {
                this.f38997a.q(f0Var.q());
            }
        }
        return new i(b1Var, e0Var);
    }
}

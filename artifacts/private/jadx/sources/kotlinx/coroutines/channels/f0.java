package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.internal.p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n1047#2,2:91\n1009#2,2:93\n1009#2,2:95\n1047#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
public class f0<E> extends n<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f313767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final j f313768n;

    public /* synthetic */ f0(int i10, j jVar, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, jVar, (i11 & 4) != 0 ? null : function1);
    }

    static /* synthetic */ <E> Object F2(f0<E> f0Var, E e10, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objI2 = f0Var.I2(e10, true);
        if (!(objI2 instanceof t.a)) {
            return Unit.f312394a;
        }
        t.f(objI2);
        Function1<E, Unit> function1 = f0Var.f313805b;
        if (function1 != null) {
            int i10 = 1 ^ 2;
            p1 p1VarC = kotlinx.coroutines.internal.r0.c(function1, e10, null, 2, null);
            if (p1VarC != null) {
                kotlin.p.a(p1VarC, f0Var.Q0());
                throw p1VarC;
            }
        }
        throw f0Var.Q0();
    }

    static /* synthetic */ <E> Object G2(f0<E> f0Var, E e10, kotlin.coroutines.d<? super Boolean> dVar) {
        Object objI2 = f0Var.I2(e10, true);
        if (objI2 instanceof t.c) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        return kotlin.coroutines.jvm.internal.b.a(true);
    }

    private final Object H2(E e10, boolean z10) {
        Function1<E, Unit> function1;
        p1 p1VarC;
        Object objP = super.p(e10);
        if (!t.m(objP) && !t.k(objP)) {
            if (z10 && (function1 = this.f313805b) != null && (p1VarC = kotlinx.coroutines.internal.r0.c(function1, e10, null, 2, null)) != null) {
                throw p1VarC;
            }
            return t.f313893b.c(Unit.f312394a);
        }
        return objP;
    }

    private final Object I2(E e10, boolean z10) {
        return this.f313768n == j.DROP_LATEST ? H2(e10, z10) : u2(e10);
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return F2(this, e10, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.n
    protected void U1(@NotNull kotlinx.coroutines.selects.n<?> nVar, @Nullable Object obj) {
        Object objP = p(obj);
        if (!(objP instanceof t.c)) {
            nVar.f(Unit.f312394a);
        } else {
            if (!(objP instanceof t.a)) {
                throw new IllegalStateException("unreachable");
            }
            t.f(objP);
            nVar.f(o.z());
        }
    }

    @Override // kotlinx.coroutines.channels.n
    @Nullable
    public Object a2(E e10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return G2(this, e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.n
    protected boolean j1() {
        return this.f313768n == j.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        return I2(e10, false);
    }

    @Override // kotlinx.coroutines.channels.n
    public boolean q2() {
        return false;
    }

    public f0(int i10, @NotNull j jVar, @Nullable Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.f313767m = i10;
        this.f313768n = jVar;
        if (jVar == j.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + j1.d(n.class).Q() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }
}

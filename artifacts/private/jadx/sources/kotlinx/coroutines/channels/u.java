package kotlinx.coroutines.channels;

import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f4;
import kotlinx.coroutines.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
public final class u<E> extends w0<u<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n<E> f313897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f313898f;

    public u(long j10, @Nullable u<E> uVar, @Nullable n<E> nVar, int i10) {
        super(j10, uVar, i10);
        this.f313897e = nVar;
        this.f313898f = new AtomicReferenceArray(o.f313835b * 2);
    }

    private final /* synthetic */ AtomicReferenceArray H() {
        return this.f313898f;
    }

    private final void M(int i10, Object obj) {
        H().set(i10 * 2, obj);
    }

    public final boolean D(int i10, @Nullable Object obj, @Nullable Object obj2) {
        return x2.a(H(), (i10 * 2) + 1, obj, obj2);
    }

    public final void E(int i10) {
        M(i10, null);
    }

    @Nullable
    public final Object F(int i10, @Nullable Object obj) {
        return H().getAndSet((i10 * 2) + 1, obj);
    }

    @NotNull
    public final n<E> G() {
        n<E> nVar = this.f313897e;
        Intrinsics.checkNotNull(nVar);
        return nVar;
    }

    public final E I(int i10) {
        return (E) H().get(i10 * 2);
    }

    @Nullable
    public final Object J(int i10) {
        return H().get((i10 * 2) + 1);
    }

    public final void K(int i10, boolean z10) {
        if (z10) {
            G().E2((this.f315133c * ((long) o.f313835b)) + ((long) i10));
        }
        A();
    }

    public final E L(int i10) {
        E eI = I(i10);
        E(i10);
        return eI;
    }

    public final void N(int i10, @Nullable Object obj) {
        H().set((i10 * 2) + 1, obj);
    }

    public final void O(int i10, E e10) {
        M(i10, e10);
    }

    @Override // kotlinx.coroutines.internal.w0
    public int y() {
        return o.f313835b;
    }

    @Override // kotlinx.coroutines.internal.w0
    public void z(int i10, @Nullable Throwable th2, @NotNull CoroutineContext coroutineContext) {
        Function1<E, Unit> function1;
        Function1<E, Unit> function2;
        int i11 = o.f313835b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        E eI = I(i10);
        while (true) {
            Object objJ = J(i10);
            if (!(objJ instanceof f4) && !(objJ instanceof r0)) {
                if (objJ == o.f313845l || objJ == o.f313846m) {
                    break;
                }
                if (objJ != o.f313842i && objJ != o.f313841h) {
                    if (objJ != o.f313844k && objJ != o.f313839f && objJ != o.z()) {
                        throw new IllegalStateException(("unexpected state: " + objJ).toString());
                    }
                }
            }
            if (D(i10, objJ, z10 ? o.f313845l : o.f313846m)) {
                E(i10);
                K(i10, !z10);
                if (z10 && (function1 = G().f313805b) != null) {
                    kotlinx.coroutines.internal.r0.a(function1, eI, coroutineContext);
                }
            }
        }
        E(i10);
        if (z10 && (function2 = G().f313805b) != null) {
            kotlinx.coroutines.internal.r0.a(function2, eI, coroutineContext);
        }
    }
}

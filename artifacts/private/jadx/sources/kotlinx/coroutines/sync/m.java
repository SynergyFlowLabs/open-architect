package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.w0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
final class m extends w0<m> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f315632e;

    public m(long j10, @Nullable m mVar, int i10) {
        super(j10, mVar, i10);
        this.f315632e = new AtomicReferenceArray(l.f315627f);
    }

    public final boolean D(int i10, @Nullable Object obj, @Nullable Object obj2) {
        return x2.a(F(), i10, obj, obj2);
    }

    @Nullable
    public final Object E(int i10) {
        return F().get(i10);
    }

    public final /* synthetic */ AtomicReferenceArray F() {
        return this.f315632e;
    }

    @Nullable
    public final Object G(int i10, @Nullable Object obj) {
        return F().getAndSet(i10, obj);
    }

    public final void H(int i10, @Nullable Object obj) {
        F().set(i10, obj);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.f315133c + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.internal.w0
    public int y() {
        return l.f315627f;
    }

    @Override // kotlinx.coroutines.internal.w0
    public void z(int i10, @Nullable Throwable th2, @NotNull CoroutineContext coroutineContext) {
        F().set(i10, l.f315626e);
        A();
    }
}

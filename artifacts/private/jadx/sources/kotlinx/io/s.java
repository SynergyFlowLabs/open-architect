package kotlinx.io;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSegmentPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentPool.kt\nkotlinx/io/RefCountingCopyTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
public final class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f315786b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater<s> f315787c = AtomicIntegerFieldUpdater.newUpdater(s.class, androidx.media3.exoplayer.upstream.h.f65998l);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f315788a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        private static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    @Override // kotlinx.io.u
    public void a() {
        f315787c.incrementAndGet(this);
    }

    @Override // kotlinx.io.u
    public boolean b() {
        return this.f315788a > 0;
    }

    @Override // kotlinx.io.u
    public boolean c() {
        if (this.f315788a == 0) {
            return false;
        }
        int iDecrementAndGet = f315787c.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.f315788a = 0;
            return false;
        }
        throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
    }
}

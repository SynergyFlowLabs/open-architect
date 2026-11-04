package okhttp3.internal.concurrent;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f334044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private c f334046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f334047d;

    public a(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f334044a = name;
        this.f334045b = z10;
        this.f334047d = -1L;
    }

    public final boolean a() {
        return this.f334045b;
    }

    @NotNull
    public final String b() {
        return this.f334044a;
    }

    public final long c() {
        return this.f334047d;
    }

    @Nullable
    public final c d() {
        return this.f334046c;
    }

    public final void e(@NotNull c queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        c cVar = this.f334046c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f334046c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f334047d = j10;
    }

    public final void h(@Nullable c cVar) {
        this.f334046c = cVar;
    }

    @NotNull
    public String toString() {
        return this.f334044a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}

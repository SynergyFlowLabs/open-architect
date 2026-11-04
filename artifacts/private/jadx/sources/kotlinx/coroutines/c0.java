package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f313550b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Throwable f313551a;

    public c0(@NotNull Throwable th2, boolean z10) {
        this.f313551a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    private final /* synthetic */ int b() {
        return this._handled$volatile;
    }

    private final /* synthetic */ void e(int i10) {
        this._handled$volatile = i10;
    }

    public final boolean a() {
        return f313550b.get(this) == 1;
    }

    public final boolean d() {
        return f313550b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return x0.a(this) + AbstractJsonLexerKt.BEGIN_LIST + this.f313551a + AbstractJsonLexerKt.END_LIST;
    }

    public /* synthetic */ c0(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}

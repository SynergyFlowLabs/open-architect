package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
final class m0 extends a3 implements kotlinx.coroutines.c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Throwable f315096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f315097c;

    public /* synthetic */ m0(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    private final Void T0() {
        String str;
        if (this.f315096b == null) {
            l0.e();
            throw new kotlin.a0();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f315097c;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString(), this.f315096b);
    }

    @Override // kotlinx.coroutines.a3
    @NotNull
    public a3 M0() {
        return this;
    }

    @Override // kotlinx.coroutines.n0
    public boolean N(@NotNull CoroutineContext coroutineContext) {
        T0();
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        T0();
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Void b(long j10, @NotNull kotlinx.coroutines.n<? super Unit> nVar) {
        T0();
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.a3, kotlinx.coroutines.n0
    @NotNull
    public kotlinx.coroutines.n0 Y(int i10, @Nullable String str) {
        T0();
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public kotlinx.coroutines.o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        T0();
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return kotlinx.coroutines.c1.a.a(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.a3, kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f315096b != null) {
            str = ", cause=" + this.f315096b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public m0(@Nullable Throwable th2, @Nullable String str) {
        this.f315096b = th2;
        this.f315097c = str;
    }
}

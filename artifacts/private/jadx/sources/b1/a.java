package b1;

import androidx.compose.animation.core.g3;
import androidx.compose.animation.core.l;
import androidx.compose.animation.core.w;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimateXAsStateClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateXAsStateClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class a<T, V extends w> implements c<androidx.compose.ui.tooling.animation.a<T, V>, c1.c<T>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77502f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.tooling.animation.a<T, V> f77503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private c1.c<T> f77504b = new c1.c<>(i().d().v(), i().d().v());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f77505c = i().h().getValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private g3<T, V> f77506d = k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f77507e;

    public a(@NotNull androidx.compose.ui.tooling.animation.a<T, V> aVar) {
        this.f77503a = aVar;
    }

    private final g3<T, V> k() {
        return l.e(i().e(), i().d().t(), getState().e(), getState().f(), i().d().w());
    }

    private final void m(long j10) {
        this.f77507e = j10;
        n(this.f77506d.g(j10));
    }

    private final void n(T t10) {
        this.f77505c = t10;
        i().h().setValue(t10);
    }

    @Override // b1.c
    public void a(long j10) {
        m(j10);
    }

    @Override // b1.c
    public long b() {
        return j.s(this.f77506d.e());
    }

    @Override // b1.c
    @NotNull
    public List<ComposeAnimatedProperty> c() {
        String strF = i().f();
        T t10 = this.f77505c;
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.Any");
        return CollectionsKt.listOf(new ComposeAnimatedProperty(strF, t10));
    }

    @Override // b1.c
    @NotNull
    public List<TransitionInfo> d(long j10) {
        return CollectionsKt.listOf(j.e(this.f77506d, i().f(), i().e(), j10));
    }

    @Override // b1.c
    public void e(@NotNull Object obj, @Nullable Object obj2) {
        c1.c<T> cVarT = j.t(this.f77505c, obj, obj2);
        if (cVarT != null) {
            g(cVarT);
        }
    }

    @Override // b1.c
    public long h() {
        return j.s(this.f77506d.e());
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.tooling.animation.a<T, V> i() {
        return this.f77503a;
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c1.c<T> getState() {
        return this.f77504b;
    }

    @Override // b1.c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void g(@NotNull c1.c<T> cVar) {
        this.f77504b = cVar;
        this.f77506d = k();
        a(0L);
    }
}

package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class j1<T> extends m4<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36168e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k1<T> f36169d;

    public j1(@NotNull Function1<? super v0, ? extends T> function1) {
        super(new Function0() { // from class: androidx.compose.runtime.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.k();
            }
        });
        this.f36169d = new k1<>(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k() {
        m0.z("Unexpected call to default provider");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.m4
    @NotNull
    public n4<T> e(T t10) {
        return new n4<>(this, t10, t10 == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.u0
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k1<T> c() {
        return this.f36169d;
    }
}

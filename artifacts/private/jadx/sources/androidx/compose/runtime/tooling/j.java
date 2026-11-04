package androidx.compose.runtime.tooling;

import androidx.compose.runtime.i0;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class j implements h, androidx.compose.runtime.changelist.g, CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f36691b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36692c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f36693a;

    public static final class a implements CoroutineContext.b<j> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public String toString() {
            return "CompositionErrorContext";
        }

        private a() {
        }
    }

    public j(@NotNull i0 i0Var) {
        this.f36693a = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(j jVar, Object obj) {
        return jVar.f36693a.i2(obj);
    }

    @Override // androidx.compose.runtime.tooling.h
    public boolean a(@NotNull Throwable th2, @NotNull final Object obj) {
        return d.c(th2, new Function0() { // from class: androidx.compose.runtime.tooling.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.g(this.f36689a, obj);
            }
        });
    }

    @Override // androidx.compose.runtime.changelist.g
    @NotNull
    public List<c> b(@Nullable Integer num) {
        return this.f36693a.J1();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.b<?> getKey() {
        return f36691b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}

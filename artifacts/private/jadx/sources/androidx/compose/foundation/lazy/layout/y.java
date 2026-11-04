package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.y.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,72:1\n50#1,3:73\n50#1,3:76\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n34#1:73,3\n40#1:76,3\n*E\n"})
public abstract class y<Interval extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17624a = 0;

    public interface a {

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.y$a$a, reason: collision with other inner class name */
        static final class C0114a implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0114a f17625a = new C0114a();

            C0114a() {
            }

            public final Void c(int i10) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return c(((Number) obj).intValue());
            }
        }

        @NotNull
        default Function1<Integer, Object> c() {
            return C0114a.f17625a;
        }

        @Nullable
        default Function1<Integer, Object> getKey() {
            return null;
        }
    }

    @Nullable
    public final Object D(int i10) {
        m.a<Interval> aVar = E().get(i10);
        return aVar.c().c().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    @NotNull
    public abstract m<Interval> E();

    public final int F() {
        return E().getSize();
    }

    @NotNull
    public final Object G(int i10) {
        Object objInvoke;
        m.a<Interval> aVar = E().get(i10);
        int iB = i10 - aVar.b();
        Function1<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? i2.a(i10) : objInvoke;
    }

    public final <T> T H(int i10, @NotNull Function2<? super Integer, ? super Interval, ? extends T> function2) {
        m.a<Interval> aVar = E().get(i10);
        return function2.invoke(Integer.valueOf(i10 - aVar.b()), aVar.c());
    }
}

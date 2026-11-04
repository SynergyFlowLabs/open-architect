package kotlin.properties;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f312873a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.properties.a$a, reason: collision with other inner class name */
    public static final class C2260a<T> extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<o<?>, T, T, Unit> f312874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2260a(T t10, n<? super o<?>, ? super T, ? super T, Unit> nVar) {
            super(t10);
            this.f312874b = nVar;
        }

        @Override // kotlin.properties.c
        protected void a(o<?> property, T t10, T t11) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f312874b.invoke(property, t10, t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<o<?>, T, T, Boolean> f312875b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t10, n<? super o<?>, ? super T, ? super T, Boolean> nVar) {
            super(t10);
            this.f312875b = nVar;
        }

        @Override // kotlin.properties.c
        protected boolean b(o<?> property, T t10, T t11) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f312875b.invoke(property, t10, t11).booleanValue();
        }
    }

    private a() {
    }

    @NotNull
    public final <T> f<Object, T> a() {
        return new kotlin.properties.b();
    }

    @NotNull
    public final <T> f<Object, T> b(T t10, @NotNull n<? super o<?>, ? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new C2260a(t10, onChange);
    }

    @NotNull
    public final <T> f<Object, T> c(T t10, @NotNull n<? super o<?>, ? super T, ? super T, Boolean> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new b(t10, onChange);
    }
}

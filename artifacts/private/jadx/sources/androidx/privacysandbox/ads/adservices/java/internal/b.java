package androidx.privacysandbox.ads.adservices.java.internal;

import com.google.common.util.concurrent.t1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    static final class a extends l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a<T> f73584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<T> f73585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.concurrent.futures.c.a<T> aVar, a1<? extends T> a1Var) {
            super(1);
            this.f73584a = aVar;
            this.f73585b = a1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            if (th2 == null) {
                this.f73584a.c((T) this.f73585b.m());
            } else if (th2 instanceof CancellationException) {
                this.f73584a.d();
            } else {
                this.f73584a.f(th2);
            }
        }
    }

    @NotNull
    public static final <T> t1<T> b(@NotNull final a1<? extends T> a1Var, @Nullable final Object obj) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        t1<T> t1VarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0353c() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.c.InterfaceC0353c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return b.d(a1Var, obj, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(t1VarA, "getFuture { completer ->…      }\n        tag\n    }");
        return t1VarA;
    }

    public static /* synthetic */ t1 c(a1 a1Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(a1Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(a1 this_asListenableFuture, Object obj, androidx.concurrent.futures.c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.E(new a(completer, this_asListenableFuture));
        return obj;
    }
}

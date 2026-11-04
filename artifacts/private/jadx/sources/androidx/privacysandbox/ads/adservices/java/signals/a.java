package androidx.privacysandbox.ads.adservices.java.signals;

import android.content.Context;
import androidx.annotation.a1;
import androidx.annotation.u;
import androidx.privacysandbox.ads.adservices.signals.h;
import com.google.common.util.concurrent.t1;
import com.rabbitmq.client.impl.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0718a f73609a = new C0718a(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.signals.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nProtectedSignalsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class C0718a {
        public /* synthetic */ C0718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.signals.b bVarA = androidx.privacysandbox.ads.adservices.signals.b.f73676a.a(context);
            if (bVarA != null) {
                return new b(bVarA);
            }
            return null;
        }

        private C0718a() {
        }
    }

    private static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final androidx.privacysandbox.ads.adservices.signals.b f73610b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.signals.a$b$a, reason: collision with other inner class name */
        @f(c = "androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1", f = "ProtectedSignalsManagerFutures.kt", i = {}, l = {k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
        static final class C0719a extends o implements Function2<s0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73611a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f73613c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0719a(h hVar, d<? super C0719a> dVar) {
                super(2, dVar);
                this.f73613c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return b.this.new C0719a(this.f73613c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73611a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.privacysandbox.ads.adservices.signals.b bVar = b.this.f73610b;
                    Intrinsics.checkNotNull(bVar);
                    h hVar = this.f73613c;
                    this.f73611a = 1;
                    if (bVar.b(hVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C0719a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public b(@Nullable androidx.privacysandbox.ads.adservices.signals.b bVar) {
            this.f73610b = bVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.signals.a
        @a1("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
        @u
        @NotNull
        public t1<Unit> b(@NotNull h request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(kotlinx.coroutines.k.b(t0.a(l1.a()), null, null, new C0719a(request, null), 3, null), null, 1, null);
        }
    }

    @n
    @Nullable
    public static final a a(@NotNull Context context) {
        return f73609a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @NotNull
    public abstract t1<Unit> b(@NotNull h hVar);
}

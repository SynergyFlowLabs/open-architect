package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.a1;
import androidx.privacysandbox.ads.adservices.topics.h;
import androidx.privacysandbox.ads.adservices.topics.u;
import com.google.common.util.concurrent.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
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
    public static final b f73614a = new b(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a, reason: collision with other inner class name */
    private static final class C0720a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final u f73615b;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a$a, reason: collision with other inner class name */
        @f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        static final class C0721a extends o implements Function2<s0, d<? super h>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f73616a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.b f73618c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0721a(androidx.privacysandbox.ads.adservices.topics.b bVar, d<? super C0721a> dVar) {
                super(2, dVar);
                this.f73618c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return C0720a.this.new C0721a(this.f73618c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f73616a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                u uVar = C0720a.this.f73615b;
                androidx.privacysandbox.ads.adservices.topics.b bVar = this.f73618c;
                this.f73616a = 1;
                Object objA = uVar.a(bVar, this);
                return objA == objL ? objL : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super h> dVar) {
                return ((C0721a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public C0720a(@NotNull u mTopicsManager) {
            Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
            this.f73615b = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.a
        @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
        @androidx.annotation.u
        @NotNull
        public t1<h> b(@NotNull androidx.privacysandbox.ads.adservices.topics.b request) {
            Intrinsics.checkNotNullParameter(request, "request");
            boolean z10 = false | true;
            return androidx.privacysandbox.ads.adservices.java.internal.b.c(k.b(t0.a(l1.e()), null, null, new C0721a(request, null), 3, null), null, 1, null);
        }
    }

    @SourceDebugExtension({"SMAP\nTopicsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @Nullable
        public final a a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            u uVarA = u.f73699a.a(context);
            if (uVarA != null) {
                return new C0720a(uVarA);
            }
            return null;
        }

        private b() {
        }
    }

    @n
    @Nullable
    public static final a a(@NotNull Context context) {
        return f73614a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_TOPICS")
    @NotNull
    public abstract t1<h> b(@NotNull androidx.privacysandbox.ads.adservices.topics.b bVar);
}

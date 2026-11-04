package androidx.privacysandbox.ads.adservices.adselection;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73454a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.r$a$a, reason: collision with other inner class name */
        static final class C0700a extends kotlin.jvm.internal.l0 implements Function1<Context, t> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73455a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0700a(Context context) {
                super(1);
                this.f73455a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final t invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new t(this.f73455a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @e.a({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final r a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
            if (aVar.a() >= 4) {
                return new w(context);
            }
            if (aVar.b() >= 9) {
                return (r) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "AdSelectionManager", new C0700a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @oj.n
    @e.a({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final r b(@NotNull Context context) {
        return f73454a.a(context);
    }

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @Nullable
    public abstract Object a(@NotNull q0 q0Var, @NotNull kotlin.coroutines.d<? super m0> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @Nullable
    public abstract Object c(@NotNull x0 x0Var, @NotNull kotlin.coroutines.d<? super j0> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.d
    @Nullable
    public abstract Object d(@NotNull y0 y0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object e(@NotNull g1 g1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object f(@NotNull j jVar, @NotNull kotlin.coroutines.d<? super j0> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @Nullable
    public abstract Object g(@NotNull q qVar, @NotNull kotlin.coroutines.d<? super j0> dVar);

    @androidx.annotation.a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.d
    @Nullable
    public abstract Object h(@NotNull k1 k1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}

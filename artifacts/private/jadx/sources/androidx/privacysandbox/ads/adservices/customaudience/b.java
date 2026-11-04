package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import androidx.annotation.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73522a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.customaudience.b$a$a, reason: collision with other inner class name */
        static final class C0705a extends kotlin.jvm.internal.l0 implements Function1<Context, d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73523a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0705a(Context context) {
                super(1);
                this.f73523a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(this.f73523a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @e.a({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
            if (aVar.a() >= 4) {
                return new g(context);
            }
            if (aVar.b() >= 9) {
                return (b) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "CustomAudienceManager", new C0705a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @oj.n
    @e.a({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final b d(@NotNull Context context) {
        return f73522a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @androidx.privacysandbox.ads.adservices.common.q.a
    @Nullable
    public abstract Object a(@NotNull o0 o0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object b(@NotNull p0 p0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @a1("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object c(@NotNull q0 q0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}

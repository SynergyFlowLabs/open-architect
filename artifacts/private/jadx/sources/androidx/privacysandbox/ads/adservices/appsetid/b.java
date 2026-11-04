package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73474a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.b$a$a, reason: collision with other inner class name */
        static final class C0702a extends l0 implements Function1<Context, d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f73475a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0702a(Context context) {
                super(1);
                this.f73475a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new d(this.f73475a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @e.a({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
            if (aVar.a() >= 4) {
                return new g(context);
            }
            if (aVar.b() >= 9) {
                return (b) androidx.privacysandbox.ads.adservices.internal.b.f73539a.a(context, "AppSetIdManager", new C0702a(context));
            }
            return null;
        }

        private a() {
        }
    }

    @n
    @e.a({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final b b(@NotNull Context context) {
        return f73474a.a(context);
    }

    @Nullable
    public abstract Object a(@NotNull kotlin.coroutines.d<? super androidx.privacysandbox.ads.adservices.appsetid.a> dVar);
}

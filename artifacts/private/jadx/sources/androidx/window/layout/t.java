package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.b1;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76439a = a.f76440a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f76441b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f76440a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private static final String f76442c = j1.d(t.class).Q();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static u f76443d = i.f76381a;

        private a() {
        }

        @oj.n
        @oj.i(name = "getOrCreate")
        @NotNull
        public final t a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return f76443d.a(new v(a0.f76376b, d(context)));
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP})
        public final void b(@NotNull u overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            f76443d = overridingDecorator;
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP})
        public final void c() {
            f76443d = i.f76381a;
        }

        @NotNull
        public final s d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            k kVar = null;
            try {
                WindowLayoutComponent windowLayoutComponentM = o.f76411a.m();
                if (windowLayoutComponentM != null) {
                    kVar = new k(windowLayoutComponentM);
                }
            } catch (Throwable unused) {
            }
            return kVar == null ? q.f76425c.a(context) : kVar;
        }
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    static void a(@NotNull u uVar) {
        f76439a.b(uVar);
    }

    @oj.n
    @oj.i(name = "getOrCreate")
    @NotNull
    static t b(@NotNull Context context) {
        return f76439a.a(context);
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    static void reset() {
        f76439a.c();
    }

    @NotNull
    kotlinx.coroutines.flow.i<x> c(@NotNull Activity activity);
}

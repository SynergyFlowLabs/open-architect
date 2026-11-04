package coil.util;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f87819a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function0<Long> f87820b = a.f87821a;

    /* synthetic */ class a extends g0 implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87821a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87822a = new b();

        b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10) {
        return j10;
    }

    public final long b() {
        return f87820b.invoke().longValue();
    }

    public final void c() {
        f87820b = b.f87822a;
    }

    public final void d(final long j10) {
        f87820b = new Function0() { // from class: coil.util.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(d0.e(j10));
            }
        };
    }
}

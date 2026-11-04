package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@k7
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f39405a = a.f39406a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39406a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final l f39407b = new C0304a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final l f39408c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final l f39409d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final l f39410e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final l f39411f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final p f39412g = new p(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final l f39413h = new b();

        /* JADX INFO: renamed from: androidx.compose.ui.layout.l$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Crop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,160:1\n1#2:161\n31#3:162\n53#4,3:163\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Crop$1\n*L\n52#1:162\n52#1:163,3\n*E\n"})
        public static final class C0304a implements l {
            C0304a() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                float fD = m.d(j10, j11);
                return w2.e((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillBounds$1\n+ 2 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,160:1\n156#2:161\n159#2:165\n57#3:162\n61#3:166\n60#4:163\n70#4:167\n53#4,3:170\n22#5:164\n22#5:168\n31#6:169\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillBounds$1\n*L\n125#1:161\n126#1:165\n125#1:162\n126#1:166\n125#1:163\n126#1:167\n124#1:170,3\n125#1:164\n126#1:168\n124#1:169\n*E\n"})
        public static final class b implements l {
            b() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                return w2.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillHeight$1\n+ 2 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,160:1\n159#2:161\n61#3:162\n70#4:163\n53#4,3:167\n22#5:164\n1#6:165\n31#7:166\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillHeight$1\n*L\n79#1:161\n79#1:162\n79#1:163\n79#1:167,3\n79#1:164\n79#1:166\n*E\n"})
        public static final class c implements l {
            c() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                return w2.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillWidth$1\n+ 2 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,160:1\n156#2:161\n57#3:162\n60#4:163\n53#4,3:167\n22#5:164\n1#6:165\n31#7:166\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$FillWidth$1\n*L\n91#1:161\n91#1:162\n91#1:163\n91#1:167,3\n91#1:164\n91#1:166\n*E\n"})
        public static final class d implements l {
            d() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                return w2.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Fit$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,160:1\n1#2:161\n31#3:162\n53#4,3:163\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Fit$1\n*L\n67#1:162\n67#1:163,3\n*E\n"})
        public static final class e implements l {
            e() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                float fE = m.e(j10, j11);
                return w2.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        @SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Inside$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n57#2:161\n61#2:164\n60#3:162\n70#3:165\n53#3,3:167\n53#3,3:172\n22#4:163\n31#5:166\n31#5:171\n1#6:170\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScale$Companion$Inside$1\n*L\n108#1:161\n108#1:164\n108#1:162\n108#1:165\n109#1:167,3\n111#1:172,3\n108#1:163\n109#1:166\n111#1:171\n*E\n"})
        public static final class f implements l {
            f() {
            }

            @Override // androidx.compose.ui.layout.l
            public long a(long j10, long j11) {
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) <= Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a))) {
                    return w2.e((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & com.rabbitmq.client.k0.f265952a));
                }
                float fE = m.e(j10, j11);
                return w2.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & com.rabbitmq.client.k0.f265952a));
            }
        }

        private a() {
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        @k7
        public static /* synthetic */ void h() {
        }

        @k7
        public static /* synthetic */ void j() {
        }

        @k7
        public static /* synthetic */ void l() {
        }

        @k7
        public static /* synthetic */ void n() {
        }

        @NotNull
        public final l a() {
            return f39407b;
        }

        @NotNull
        public final l c() {
            return f39413h;
        }

        @NotNull
        public final l e() {
            return f39409d;
        }

        @NotNull
        public final l g() {
            return f39410e;
        }

        @NotNull
        public final l i() {
            return f39408c;
        }

        @NotNull
        public final l k() {
            return f39411f;
        }

        @NotNull
        public final p m() {
            return f39412g;
        }
    }

    long a(long j10, long j11);
}

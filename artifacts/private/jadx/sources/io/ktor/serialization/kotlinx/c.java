package io.ktor.serialization.kotlinx;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.content.d0;
import io.ktor.http.content.w;
import io.ktor.http.m;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.io.c0;
import kotlinx.io.g0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.r0;
import kotlinx.serialization.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ui.l;
import ui.u;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nKotlinxSerializationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,126:1\n49#2:127\n51#2:131\n49#2:132\n51#2:136\n46#3:128\n51#3:130\n46#3:133\n51#3:135\n105#4:129\n105#4:134\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n*L\n47#1:127\n47#1:131\n62#1:132\n62#1:136\n47#1:128\n47#1:130\n62#1:133\n62#1:135\n47#1:129\n62#1:134\n*E\n"})
public final class c implements io.ktor.serialization.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f296403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<io.ktor.serialization.kotlinx.e> f296404b;

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class a implements i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f296405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Charset f296406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ri.b f296407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296408d;

        /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.c$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n*L\n1#1,49:1\n50#2:50\n62#3:51\n*E\n"})
        public static final class C2084a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f296409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Charset f296410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ri.b f296411c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.h f296412d;

            /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.c$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
            public static final class C2085a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f296413a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f296414b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f296415c;

                public C2085a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f296413a = obj;
                    this.f296414b |= Integer.MIN_VALUE;
                    return C2084a.this.emit(null, this);
                }
            }

            public C2084a(j jVar, Charset charset, ri.b bVar, io.ktor.utils.io.h hVar) {
                this.f296409a = jVar;
                this.f296410b = charset;
                this.f296411c = bVar;
                this.f296412d = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
            
                if (r8.emit(r10, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.d r10) {
                /*
                    r8 = this;
                    java.lang.String r7 = "Androeed.ru"
                    boolean r0 = r10 instanceof io.ktor.serialization.kotlinx.c.a.C2084a.C2085a
                    if (r0 == 0) goto L17
                    r0 = r10
                    io.ktor.serialization.kotlinx.c$a$a$a r0 = (io.ktor.serialization.kotlinx.c.a.C2084a.C2085a) r0
                    int r1 = r0.f296414b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r7 = 6
                    r3 = r1 & r2
                    r7 = 7
                    if (r3 == 0) goto L17
                    int r1 = r1 - r2
                    r0.f296414b = r1
                    goto L1c
                L17:
                    io.ktor.serialization.kotlinx.c$a$a$a r0 = new io.ktor.serialization.kotlinx.c$a$a$a
                    r0.<init>(r10)
                L1c:
                    java.lang.Object r10 = r0.f296413a
                    r7 = 3
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f296414b
                    r7 = 2
                    r3 = 2
                    r7 = 0
                    r4 = 1
                    r7 = 5
                    if (r2 == 0) goto L49
                    if (r2 == r4) goto L3f
                    if (r2 != r3) goto L34
                    kotlin.ResultKt.m(r10)
                    goto L78
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    r7 = 2
                    java.lang.String r9 = "c srlnntmeeoth ra//o///iu/ k e/eer vo/sowcbfe oliiu"
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3f:
                    java.lang.Object r8 = r0.f296415c
                    r7 = 0
                    kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                    r7 = 2
                    kotlin.ResultKt.m(r10)
                    goto L68
                L49:
                    kotlin.ResultKt.m(r10)
                    kotlinx.coroutines.flow.j r10 = r8.f296409a
                    io.ktor.serialization.kotlinx.e r9 = (io.ktor.serialization.kotlinx.e) r9
                    java.nio.charset.Charset r2 = r8.f296410b
                    ri.b r5 = r8.f296411c
                    io.ktor.utils.io.h r8 = r8.f296412d
                    r0.f296415c = r10
                    r0.f296414b = r4
                    r7 = 2
                    java.lang.Object r8 = r9.a(r2, r5, r8, r0)
                    if (r8 != r1) goto L63
                    r7 = 0
                    goto L76
                L63:
                    r6 = r10
                    r10 = r8
                    r10 = r8
                    r8 = r6
                    r8 = r6
                L68:
                    r7 = 2
                    r9 = 0
                    r0.f296415c = r9
                    r7 = 6
                    r0.f296414b = r3
                    java.lang.Object r8 = r8.emit(r10, r0)
                    r7 = 1
                    if (r8 != r1) goto L78
                L76:
                    r7 = 5
                    return r1
                L78:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    r7 = 0
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.c.a.C2084a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(i iVar, Charset charset, ri.b bVar, io.ktor.utils.io.h hVar) {
            this.f296405a = iVar;
            this.f296406b = charset;
            this.f296407c = bVar;
            this.f296408d = hVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super Object> jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f296405a.collect(new C2084a(jVar, this.f296406b, this.f296407c, this.f296408d), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 1, 1}, l = {63, 67}, m = "deserialize", n = {hi.c.C1916c.f285814c, "typeInfo", FirebaseAnalytics.d.P, hi.c.C1916c.f285814c, "serializer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296420d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296422f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296420d = obj;
            this.f296422f |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2086c extends o implements Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2086c(io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super C2086c> dVar) {
            super(2, dVar);
            this.f296425c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2086c c2086c = new C2086c(this.f296425c, dVar);
            c2086c.f296424b = obj;
            return c2086c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f296424b != null || this.f296425c.k());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C2086c) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class d implements i<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f296426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f296427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Charset f296428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ri.b f296429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f296430e;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 KotlinxSerializationConverter.kt\nio/ktor/serialization/kotlinx/KotlinxSerializationConverter\n*L\n1#1,49:1\n50#2:50\n47#3:51\n*E\n"})
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f296431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f296432b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Charset f296433c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ri.b f296434d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f296435e;

            /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.c$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
            public static final class C2087a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f296436a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f296437b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f296438c;

                public C2087a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f296436a = obj;
                    this.f296437b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, m mVar, Charset charset, ri.b bVar, Object obj) {
                this.f296431a = jVar;
                this.f296432b = mVar;
                this.f296433c = charset;
                this.f296434d = bVar;
                this.f296435e = obj;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
            
                if (r10.emit(r12, r6) == r0) goto L24;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.d r12) {
                /*
                    r10 = this;
                    java.lang.String r9 = "Androeed.ru"
                    boolean r0 = r12 instanceof io.ktor.serialization.kotlinx.c.d.a.C2087a
                    r9 = 1
                    if (r0 == 0) goto L1a
                    r0 = r12
                    r0 = r12
                    io.ktor.serialization.kotlinx.c$d$a$a r0 = (io.ktor.serialization.kotlinx.c.d.a.C2087a) r0
                    int r1 = r0.f296437b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L1a
                    int r1 = r1 - r2
                    r0.f296437b = r1
                L16:
                    r6 = r0
                    r6 = r0
                    r9 = 4
                    goto L20
                L1a:
                    io.ktor.serialization.kotlinx.c$d$a$a r0 = new io.ktor.serialization.kotlinx.c$d$a$a
                    r0.<init>(r12)
                    goto L16
                L20:
                    r9 = 7
                    java.lang.Object r12 = r6.f296436a
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r9 = 3
                    int r1 = r6.f296437b
                    r7 = 5
                    r7 = 2
                    r2 = 1
                    if (r1 == 0) goto L4a
                    if (r1 == r2) goto L41
                    r9 = 6
                    if (r1 != r7) goto L38
                    kotlin.ResultKt.m(r12)
                    goto L7e
                L38:
                    r9 = 2
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L41:
                    java.lang.Object r10 = r6.f296438c
                    r9 = 2
                    kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                    kotlin.ResultKt.m(r12)
                    goto L6f
                L4a:
                    kotlin.ResultKt.m(r12)
                    kotlinx.coroutines.flow.j r12 = r10.f296431a
                    r1 = r11
                    r9 = 5
                    io.ktor.serialization.kotlinx.e r1 = (io.ktor.serialization.kotlinx.e) r1
                    r11 = r2
                    io.ktor.http.m r2 = r10.f296432b
                    java.nio.charset.Charset r3 = r10.f296433c
                    r9 = 0
                    ri.b r4 = r10.f296434d
                    r9 = 1
                    java.lang.Object r5 = r10.f296435e
                    r6.f296438c = r12
                    r6.f296437b = r11
                    r9 = 3
                    java.lang.Object r10 = r1.b(r2, r3, r4, r5, r6)
                    if (r10 != r0) goto L6b
                    r9 = 5
                    goto L7c
                L6b:
                    r8 = r12
                    r12 = r10
                    r12 = r10
                    r10 = r8
                L6f:
                    r9 = 2
                    r11 = 0
                    r9 = 7
                    r6.f296438c = r11
                    r6.f296437b = r7
                    java.lang.Object r10 = r10.emit(r12, r6)
                    if (r10 != r0) goto L7e
                L7c:
                    r9 = 6
                    return r0
                L7e:
                    r9 = 3
                    kotlin.Unit r10 = kotlin.Unit.f312394a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.c.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public d(i iVar, m mVar, Charset charset, ri.b bVar, Object obj) {
            this.f296426a = iVar;
            this.f296427b = mVar;
            this.f296428c = charset;
            this.f296429d = bVar;
            this.f296430e = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super w> jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f296426a.collect(new a(jVar, this.f296427b, this.f296428c, this.f296429d, this.f296430e), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0}, l = {48}, m = "serialize", n = {"contentType", hi.c.C1916c.f285814c, "typeInfo", "value"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f296444e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f296446g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296444e = obj;
            this.f296446g |= Integer.MIN_VALUE;
            return c.this.b(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<w, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296448b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f296448b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296447a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((w) this.f296448b) != null);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w wVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(wVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull x format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f296403a = format;
        this.f296404b = io.ktor.serialization.kotlinx.b.a(format);
        if ((format instanceof kotlinx.serialization.a) || (format instanceof r0)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    private final w.a c(KSerializer<?> kSerializer, x xVar, Object obj, m mVar, Charset charset) {
        if (xVar instanceof r0) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new d0(((r0) xVar).encodeToString(kSerializer, obj), io.ktor.http.o.c(mVar, charset), null, 4, null);
        }
        if (xVar instanceof kotlinx.serialization.a) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            int i10 = 5 >> 0;
            return new io.ktor.http.content.c(((kotlinx.serialization.a) xVar).a(kSerializer, obj), mVar, null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + xVar).toString());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:30:0x00b4, B:32:0x00bb, B:34:0x00cb, B:36:0x00cf, B:38:0x00de, B:39:0x0107), top: B:43:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:30:0x00b4, B:32:0x00bb, B:34:0x00cb, B:36:0x00cf, B:38:0x00de, B:39:0x0107), top: B:43:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:30:0x00b4, B:32:0x00bb, B:34:0x00cb, B:36:0x00cf, B:38:0x00de, B:39:0x0107), top: B:43:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:30:0x00b4, B:32:0x00bb, B:34:0x00cb, B:36:0x00cf, B:38:0x00de, B:39:0x0107), top: B:43:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00de, please report this as an issue */
    @Override // io.ktor.serialization.d
    @Nullable
    public Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<Object> dVar) throws Throwable {
        b bVar2;
        Charset charset2;
        KSerializer<?> kSerializer;
        c0 c0Var;
        x xVar;
        if (dVar instanceof b) {
            bVar2 = (b) dVar;
            int i10 = bVar2.f296422f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f296422f = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(dVar);
            }
        } else {
            bVar2 = new b(dVar);
        }
        Object objZ0 = bVar2.f296420d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f296422f;
        if (i11 == 0) {
            ResultKt.m(objZ0);
            a aVar = new a(k.c(this.f296404b), charset, bVar, hVar);
            C2086c c2086c = new C2086c(hVar, null);
            bVar2.f296417a = charset;
            bVar2.f296418b = bVar;
            bVar2.f296419c = hVar;
            bVar2.f296422f = 1;
            objZ0 = k.z0(aVar, c2086c, bVar2);
            if (objZ0 != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            hVar = (io.ktor.utils.io.h) bVar2.f296419c;
            bVar = (ri.b) bVar2.f296418b;
            charset = (Charset) bVar2.f296417a;
            ResultKt.m(objZ0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = (KSerializer) bVar2.f296418b;
            charset2 = (Charset) bVar2.f296417a;
            ResultKt.m(objZ0);
        }
        c0Var = (c0) objZ0;
        try {
            xVar = this.f296403a;
            if (xVar instanceof r0) {
                return ((r0) xVar).decodeFromString(kSerializer, u.g(c0Var, charset2, 0, 2, null));
            }
            if (xVar instanceof kotlinx.serialization.a) {
                return ((kotlinx.serialization.a) xVar).b(kSerializer, g0.c(c0Var));
            }
            l.h(c0Var, 0L, 1, null);
            throw new IllegalStateException(("Unsupported format " + this.f296403a).toString());
        } catch (Throwable th2) {
            throw new io.ktor.serialization.f("Illegal input: " + th2.getMessage(), th2);
        }
        if (!this.f296404b.isEmpty() && (objZ0 != null || hVar.k())) {
            return objZ0;
        }
        KSerializer<?> kSerializerD = h.d(this.f296403a.getSerializersModule(), bVar);
        bVar2.f296417a = charset;
        bVar2.f296418b = kSerializerD;
        bVar2.f296419c = null;
        bVar2.f296422f = 2;
        objZ0 = io.ktor.utils.io.k.I(hVar, bVar2);
        if (objZ0 != objL) {
            charset2 = charset;
            kSerializer = kSerializerD;
            c0Var = (c0) objZ0;
            xVar = this.f296403a;
            if (xVar instanceof r0) {
                return ((r0) xVar).decodeFromString(kSerializer, u.g(c0Var, charset2, 0, 2, null));
            }
            if (xVar instanceof kotlinx.serialization.a) {
                return ((kotlinx.serialization.a) xVar).b(kSerializer, g0.c(c0Var));
            }
            l.h(c0Var, 0L, 1, null);
            throw new IllegalStateException(("Unsupported format " + this.f296403a).toString());
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.serialization.d
    @Nullable
    public Object b(@NotNull m mVar, @NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super w> dVar) {
        e eVar;
        m mVar2;
        Charset charset2;
        ri.b bVar2;
        Object obj2;
        KSerializer<?> kSerializerB;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f296446g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f296446g = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objZ0 = eVar.f296444e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f296446g;
        if (i11 == 0) {
            ResultKt.m(objZ0);
            mVar2 = mVar;
            charset2 = charset;
            d dVar2 = new d(k.c(this.f296404b), mVar2, charset2, bVar, obj);
            f fVar = new f(null);
            eVar.f296440a = mVar2;
            eVar.f296441b = charset2;
            eVar.f296442c = bVar;
            eVar.f296443d = obj;
            eVar.f296446g = 1;
            objZ0 = k.z0(dVar2, fVar, eVar);
            if (objZ0 == objL) {
                return objL;
            }
            bVar2 = bVar;
            obj2 = obj;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = eVar.f296443d;
            bVar2 = (ri.b) eVar.f296442c;
            Charset charset3 = (Charset) eVar.f296441b;
            m mVar3 = (m) eVar.f296440a;
            ResultKt.m(objZ0);
            mVar2 = mVar3;
            charset2 = charset3;
            obj2 = obj3;
        }
        w wVar = (w) objZ0;
        if (wVar != null) {
            return wVar;
        }
        try {
            kSerializerB = h.d(this.f296403a.getSerializersModule(), bVar2);
        } catch (kotlinx.serialization.c0 unused) {
            kSerializerB = h.b(obj2, this.f296403a.getSerializersModule());
        }
        return c(kSerializerB, this.f296403a, obj2, mVar2, charset2);
    }
}

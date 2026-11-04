package io.ktor.serialization.kotlinx.json;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.http.content.w;
import io.ktor.http.m;
import io.ktor.utils.io.p;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nKotlinxSerializationJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt\n*L\n1#1,112:1\n384#2,7:113\n56#3,4:120\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n*L\n78#1:113,7\n81#1:120,4\n*E\n"})
public final class g implements io.ktor.serialization.kotlinx.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Json f296466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Charset, io.ktor.serialization.kotlinx.json.b> f296467b;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {66}, m = "deserialize", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296468a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296470c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296468a = obj;
            this.f296470c |= Integer.MIN_VALUE;
            return g.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n+ 3 KotlinxSerializationJsonExtensions.kt\nio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions\n*L\n1#1,114:1\n29#2,4:115\n82#3,7:119\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
    public static final class b<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f296471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f296472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.serialization.kotlinx.json.b f296473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f296474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ KSerializer f296475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Charset f296476f;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", i = {0}, l = {120, 123, 124}, m = "emit", n = {"value"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f296477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f296478b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f296480d;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f296477a = obj;
                this.f296478b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(p pVar, io.ktor.serialization.kotlinx.json.b bVar, g gVar, KSerializer kSerializer, Charset charset) {
            this.f296472b = pVar;
            this.f296473c = bVar;
            this.f296474d = gVar;
            this.f296475e = kSerializer;
            this.f296476f = charset;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
        
            if (r11.d(r5) == r0) goto L31;
         */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r12, kotlin.coroutines.d<? super kotlin.Unit> r13) {
            /*
                r11 = this;
                java.lang.String r10 = "Androeed.ru"
                boolean r0 = r13 instanceof io.ktor.serialization.kotlinx.json.g.b.a
                if (r0 == 0) goto L17
                r0 = r13
                io.ktor.serialization.kotlinx.json.g$b$a r0 = (io.ktor.serialization.kotlinx.json.g.b.a) r0
                int r1 = r0.f296478b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f296478b = r1
            L14:
                r5 = r0
                r10 = 0
                goto L1f
            L17:
                r10 = 0
                io.ktor.serialization.kotlinx.json.g$b$a r0 = new io.ktor.serialization.kotlinx.json.g$b$a
                r10 = 3
                r0.<init>(r13)
                goto L14
            L1f:
                java.lang.Object r13 = r5.f296477a
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 3
                int r1 = r5.f296478b
                r8 = 4
                r8 = 3
                r9 = 2
                r2 = 1
                if (r1 == 0) goto L52
                if (r1 == r2) goto L4a
                r10 = 2
                if (r1 == r9) goto L45
                if (r1 != r8) goto L3b
                r10 = 1
                kotlin.ResultKt.m(r13)
                r10 = 7
                goto Lb8
            L3b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r10 = 1
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 4
                r11.<init>(r12)
                throw r11
            L45:
                kotlin.ResultKt.m(r13)
                r10 = 6
                goto Lab
            L4a:
                java.lang.Object r12 = r5.f296480d
                r10 = 3
                kotlin.ResultKt.m(r13)
                r10 = 3
                goto L7e
            L52:
                r10 = 5
                kotlin.ResultKt.m(r13)
                r10 = 0
                int r13 = r11.f296471a
                int r1 = r13 + 1
                r10 = 0
                r11.f296471a = r1
                if (r13 < 0) goto Lbc
                if (r13 <= 0) goto L7e
                io.ktor.utils.io.p r1 = r11.f296472b
                io.ktor.serialization.kotlinx.json.b r13 = r11.f296473c
                byte[] r13 = r13.c()
                r5.f296480d = r12
                r10 = 4
                r5.f296478b = r2
                r3 = 0
                r10 = r3
                r4 = 0
                r6 = 6
                r7 = 0
                r2 = r13
                r2 = r13
                r10 = 0
                java.lang.Object r13 = io.ktor.utils.io.t.u(r1, r2, r3, r4, r5, r6, r7)
                if (r13 != r0) goto L7e
                goto Lb6
            L7e:
                io.ktor.serialization.kotlinx.json.g r13 = r11.f296474d
                r10 = 3
                kotlinx.serialization.json.Json r13 = io.ktor.serialization.kotlinx.json.g.c(r13)
                kotlinx.serialization.KSerializer r1 = r11.f296475e
                kotlinx.serialization.d0 r1 = (kotlinx.serialization.d0) r1
                r10 = 5
                java.lang.String r12 = r13.encodeToString(r1, r12)
                io.ktor.utils.io.p r1 = r11.f296472b
                java.nio.charset.Charset r13 = r11.f296476f
                r10 = 4
                byte[] r2 = ui.u.l(r12, r13)
                r12 = 2
                r12 = 0
                r10 = 3
                r5.f296480d = r12
                r5.f296478b = r9
                r3 = 0
                r4 = 0
                r6 = 5
                r6 = 6
                r7 = 0
                java.lang.Object r12 = io.ktor.utils.io.t.u(r1, r2, r3, r4, r5, r6, r7)
                r10 = 6
                if (r12 != r0) goto Lab
                goto Lb6
            Lab:
                r10 = 1
                io.ktor.utils.io.p r11 = r11.f296472b
                r5.f296478b = r8
                java.lang.Object r11 = r11.d(r5)
                if (r11 != r0) goto Lb8
            Lb6:
                r10 = 5
                return r0
            Lb8:
                r10 = 1
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            Lbc:
                java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
                java.lang.String r12 = "Index overflow has happened"
                r11.<init>(r12)
                r10 = 5
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.g.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<p, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f296482b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f296484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ KSerializer<?> f296485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Charset f296486f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, KSerializer<?> kSerializer, Charset charset, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f296484d = obj;
            this.f296485e = kSerializer;
            this.f296486f = charset;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = g.this.new c(this.f296484d, this.f296485e, this.f296486f, dVar);
            cVar.f296482b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296481a;
            if (i10 == 0) {
                ResultKt.m(obj);
                p pVar = (p) this.f296482b;
                g gVar = g.this;
                Object obj2 = this.f296484d;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                KSerializer<?> kSerializer = this.f296485e;
                Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                Charset charset = this.f296486f;
                this.f296481a = 1;
                if (gVar.e((i) obj2, kSerializer, charset, pVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(pVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {80, 120, 89}, m = "serialize", n = {"$this$serialize", "serializer", hi.c.C1916c.f285814c, AppsFlyerProperties.CHANNEL, "jsonArraySymbols", AppsFlyerProperties.CHANNEL, "jsonArraySymbols"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f296492f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f296494h;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296492f = obj;
            this.f296494h |= Integer.MIN_VALUE;
            return g.this.e(null, null, null, null, this);
        }
    }

    public g(@NotNull Json format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f296466a = format;
        this.f296467b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
    
        if (io.ktor.utils.io.t.u(r3, r4, 0, 0, r8, 6, null) == r11) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object e(kotlinx.coroutines.flow.i<? extends T> r17, kotlinx.serialization.KSerializer<T> r18, java.nio.charset.Charset r19, io.ktor.utils.io.p r20, kotlin.coroutines.d<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.g.e(kotlinx.coroutines.flow.i, kotlinx.serialization.KSerializer, java.nio.charset.Charset, io.ktor.utils.io.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // io.ktor.serialization.kotlinx.e
    @Nullable
    public Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.utils.io.h hVar, @NotNull kotlin.coroutines.d<Object> dVar) throws io.ktor.serialization.f {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f296470c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296470c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f296468a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296470c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            if (Intrinsics.areEqual(charset, Charsets.UTF_8) && Intrinsics.areEqual(bVar.b(), j1.d(Sequence.class))) {
                Json json = this.f296466a;
                aVar.f296470c = 1;
                Object objA = io.ktor.serialization.kotlinx.json.c.a(json, hVar, bVar, aVar);
                return objA == objL ? objL : objA;
            }
            return null;
        } catch (Throwable th2) {
            throw new io.ktor.serialization.f("Illegal input: " + th2.getMessage(), th2);
        }
    }

    @Override // io.ktor.serialization.kotlinx.e
    @Nullable
    public Object b(@NotNull m mVar, @NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super w> dVar) {
        if (!Intrinsics.areEqual(charset, Charsets.UTF_8) || !Intrinsics.areEqual(bVar.b(), j1.d(i.class))) {
            return null;
        }
        return new io.ktor.http.content.f(new c(obj, io.ktor.serialization.kotlinx.h.d(this.f296466a.getSerializersModule(), h.a(bVar)), charset, null), io.ktor.http.o.c(mVar, charset), null, null, 12, null);
    }
}

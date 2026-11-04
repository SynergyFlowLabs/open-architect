package io.ktor.serialization;

import io.ktor.http.c1;
import io.ktor.http.content.v;
import io.ktor.http.d1;
import io.ktor.http.r0;
import io.ktor.http.v0;
import io.ktor.utils.io.o0;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.s;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,122:1\n49#2:123\n51#2:127\n46#3:124\n51#3:126\n105#4:125\n*S KotlinDebug\n*F\n+ 1 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n*L\n112#1:123\n112#1:127\n112#1:124\n112#1:126\n112#1:125\n*E\n"})
public final class e {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f296382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Charset f296383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ri.b f296384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296385d;

        /* JADX INFO: renamed from: io.ktor.serialization.e$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ContentConverter.kt\nio/ktor/serialization/ContentConverterKt\n*L\n1#1,49:1\n50#2:50\n112#3:51\n*E\n"})
        public static final class C2082a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f296386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Charset f296387b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ri.b f296388c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.h f296389d;

            /* JADX INFO: renamed from: io.ktor.serialization.e$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", i = {}, l = {51, 50}, m = "emit", n = {}, s = {})
            public static final class C2083a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f296390a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f296391b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f296392c;

                public C2083a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f296390a = obj;
                    this.f296391b |= Integer.MIN_VALUE;
                    return C2082a.this.emit(null, this);
                }
            }

            public C2082a(kotlinx.coroutines.flow.j jVar, Charset charset, ri.b bVar, io.ktor.utils.io.h hVar) {
                this.f296386a = jVar;
                this.f296387b = charset;
                this.f296388c = bVar;
                this.f296389d = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
            
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
                    boolean r0 = r10 instanceof io.ktor.serialization.e.a.C2082a.C2083a
                    if (r0 == 0) goto L17
                    r0 = r10
                    r7 = 0
                    io.ktor.serialization.e$a$a$a r0 = (io.ktor.serialization.e.a.C2082a.C2083a) r0
                    int r1 = r0.f296391b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    int r1 = r1 - r2
                    r7 = 5
                    r0.f296391b = r1
                    goto L1e
                L17:
                    r7 = 3
                    io.ktor.serialization.e$a$a$a r0 = new io.ktor.serialization.e$a$a$a
                    r7 = 7
                    r0.<init>(r10)
                L1e:
                    r7 = 0
                    java.lang.Object r10 = r0.f296390a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f296391b
                    r7 = 6
                    r3 = 2
                    r4 = 1
                    r7 = r7 | r4
                    if (r2 == 0) goto L47
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    r7 = 7
                    kotlin.ResultKt.m(r10)
                    goto L72
                L36:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3e:
                    java.lang.Object r8 = r0.f296392c
                    kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                    kotlin.ResultKt.m(r10)
                    r7 = 5
                    goto L65
                L47:
                    kotlin.ResultKt.m(r10)
                    kotlinx.coroutines.flow.j r10 = r8.f296386a
                    r7 = 3
                    io.ktor.serialization.d r9 = (io.ktor.serialization.d) r9
                    java.nio.charset.Charset r2 = r8.f296387b
                    ri.b r5 = r8.f296388c
                    io.ktor.utils.io.h r8 = r8.f296389d
                    r0.f296392c = r10
                    r0.f296391b = r4
                    java.lang.Object r8 = r9.a(r2, r5, r8, r0)
                    if (r8 != r1) goto L61
                    r7 = 6
                    goto L70
                L61:
                    r6 = r10
                    r6 = r10
                    r10 = r8
                    r8 = r6
                L65:
                    r9 = 0
                    r0.f296392c = r9
                    r0.f296391b = r3
                    java.lang.Object r8 = r8.emit(r10, r0)
                    if (r8 != r1) goto L72
                L70:
                    r7 = 5
                    return r1
                L72:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.e.a.C2082a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, Charset charset, ri.b bVar, io.ktor.utils.io.h hVar) {
            this.f296382a = iVar;
            this.f296383b = charset;
            this.f296384c = bVar;
            this.f296385d = hVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Object> jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f296382a.collect(new C2082a(jVar, this.f296383b, this.f296384c, this.f296385d), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {113}, m = "deserialize", n = {"body", "typeInfo"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296397d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296396c = obj;
            this.f296397d |= Integer.MIN_VALUE;
            return e.a(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f296400c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f296400c, dVar);
            cVar.f296399b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296398a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f296399b != null || this.f296400c.k());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((c) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @o0
    @Nullable
    public static final Object a(@NotNull List<? extends d> list, @NotNull io.ktor.utils.io.h hVar, @NotNull ri.b bVar, @NotNull Charset charset, @NotNull kotlin.coroutines.d<Object> dVar) throws io.ktor.serialization.c {
        b bVar2;
        if (dVar instanceof b) {
            bVar2 = (b) dVar;
            int i10 = bVar2.f296397d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f296397d = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(dVar);
            }
        } else {
            bVar2 = new b(dVar);
        }
        Object objZ0 = bVar2.f296396c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f296397d;
        if (i11 == 0) {
            ResultKt.m(objZ0);
            a aVar = new a(kotlinx.coroutines.flow.k.c(list), charset, bVar, hVar);
            c cVar = new c(hVar, null);
            bVar2.f296394a = hVar;
            bVar2.f296395b = bVar;
            bVar2.f296397d = 1;
            objZ0 = kotlinx.coroutines.flow.k.z0(aVar, cVar, bVar2);
            if (objZ0 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (ri.b) bVar2.f296395b;
            hVar = (io.ktor.utils.io.h) bVar2.f296394a;
            ResultKt.m(objZ0);
        }
        if (objZ0 != null) {
            return objZ0;
        }
        if (!hVar.k()) {
            return hVar;
        }
        s sVarA = bVar.a();
        if (sVarA != null && sVarA.A()) {
            return v.f295763a;
        }
        throw new io.ktor.serialization.c("No suitable converter found for " + bVar, null, 2, null);
    }

    @NotNull
    public static final Charset b(@NotNull v0 v0Var, @NotNull Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Charset charsetD = d(v0Var, defaultCharset);
        return charsetD == null ? defaultCharset : charsetD;
    }

    public static /* synthetic */ Charset c(v0 v0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return b(v0Var, charset);
    }

    @Nullable
    public static final Charset d(@NotNull v0 v0Var, @NotNull Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Iterator<r0> it = c1.e(v0Var.get(d1.f295782a.e())).iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (Intrinsics.areEqual(strA, "*")) {
                return defaultCharset;
            }
            Charsets charsets = Charsets.f313184a;
            if (ti.a.m(charsets, strA)) {
                return ti.a.i(charsets, strA);
            }
        }
        return null;
    }

    public static /* synthetic */ Charset e(v0 v0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return d(v0Var, charset);
    }
}

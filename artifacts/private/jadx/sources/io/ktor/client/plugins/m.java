package io.ktor.client.plugins;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294887a = pi.a.a("io.ktor.client.plugins.defaultTransformers");

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294890c;

        /* JADX INFO: renamed from: io.ktor.client.plugins.m$a$a, reason: collision with other inner class name */
        public static final class C2066a extends io.ktor.http.content.w.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final io.ktor.http.m f294891b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f294892c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f294893d;

            C2066a(io.ktor.http.m mVar, Object obj) {
                this.f294893d = obj;
                this.f294891b = mVar == null ? io.ktor.http.m.a.f295985a.l() : mVar;
                this.f294892c = ((byte[]) obj).length;
            }

            @Override // io.ktor.http.content.w
            public Long a() {
                return Long.valueOf(this.f294892c);
            }

            @Override // io.ktor.http.content.w
            public io.ktor.http.m b() {
                return this.f294891b;
            }

            @Override // io.ktor.http.content.w.a
            public byte[] h() {
                return (byte[]) this.f294893d;
            }
        }

        public static final class b extends io.ktor.http.content.w.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Long f294894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final io.ktor.http.m f294895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f294896d;

            b(io.ktor.util.pipeline.e<Object, fi.y> eVar, io.ktor.http.m mVar, Object obj) {
                this.f294896d = obj;
                String str = eVar.f().O().get(io.ktor.http.d1.f295782a.z());
                this.f294894b = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                this.f294895c = mVar == null ? io.ktor.http.m.a.f295985a.l() : mVar;
            }

            @Override // io.ktor.http.content.w
            public Long a() {
                return this.f294894b;
            }

            @Override // io.ktor.http.content.w
            public io.ktor.http.m b() {
                return this.f294895c;
            }

            @Override // io.ktor.http.content.w.e
            public io.ktor.utils.io.h h() {
                return (io.ktor.utils.io.h) this.f294896d;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            io.ktor.http.content.w wVarA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294888a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294889b;
                Object obj2 = this.f294890c;
                io.ktor.http.w0 w0VarO = ((fi.y) eVar.f()).O();
                io.ktor.http.d1 d1Var = io.ktor.http.d1.f295782a;
                if (w0VarO.get(d1Var.d()) == null) {
                    ((fi.y) eVar.f()).O().l(d1Var.d(), "*/*");
                }
                io.ktor.http.m mVarG = io.ktor.http.i1.g((io.ktor.http.g1) eVar.f());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (mVarG == null) {
                        mVarG = io.ktor.http.m.h.f296047a.i();
                    }
                    boolean z10 = false;
                    wVarA = new io.ktor.http.content.d0(str, mVarG, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    wVarA = new C2066a(mVarG, obj2);
                } else if (obj2 instanceof io.ktor.utils.io.h) {
                    wVarA = new b(eVar, mVarG, obj2);
                } else {
                    wVarA = obj2 instanceof io.ktor.http.content.w ? (io.ktor.http.content.w) obj2 : o.a(mVarG, (fi.y) eVar.f(), obj2);
                }
                if ((wVarA != null ? wVarA.b() : null) != null) {
                    ((fi.y) eVar.f()).O().remove(d1Var.C());
                    m.f294887a.J("Transformed with default transformers request body for " + ((fi.y) eVar.f()).i() + " from " + kotlin.jvm.internal.j1.d(obj2.getClass()));
                    this.f294889b = null;
                    this.f294888a = 1;
                    if (eVar.k(wVarA, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(dVar);
            aVar.f294889b = eVar;
            aVar.f294890c = obj;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, l = {71, 75, 75, 80, 80, com.planner5d.library.engine.input.f.b.B0, com.planner5d.library.engine.input.f.b.f160711n0, 115, 120, 136}, m = "invokeSuspend", n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f294900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f294901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.c f294902f;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.e1, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f294905c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.statement.c f294906d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f294905c = obj;
                this.f294906d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f294905c, this.f294906d, dVar);
                aVar.f294904b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294903a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        io.ktor.utils.io.e1 e1Var = (io.ktor.utils.io.e1) this.f294904b;
                        io.ktor.utils.io.h hVar = (io.ktor.utils.io.h) this.f294905c;
                        io.ktor.utils.io.p pVarC = e1Var.c();
                        this.f294903a = 1;
                        obj = io.ktor.utils.io.k.g(hVar, pVarC, Long.MAX_VALUE, this);
                        if (obj == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    ((Number) obj).longValue();
                    return Unit.f312394a;
                } catch (CancellationException e10) {
                    kotlinx.coroutines.t0.d(this.f294906d, e10);
                    throw e10;
                } catch (Throwable th2) {
                    kotlinx.coroutines.t0.c(this.f294906d, "Receive failed", th2);
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.client.c cVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294902f = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlinx.coroutines.a0 a0Var) {
            a0Var.complete();
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0363  */
        /* JADX WARN: Code duplicated, block: B:37:0x0176  */
        /* JADX WARN: Code duplicated, block: B:52:0x01db  */
        /* JADX WARN: Code duplicated, block: B:56:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:97:0x035b  */
        /* JADX WARN: Instruction removed from duplicated block: B:100:0x0363, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.util.pipeline.e eVar;
            ri.b bVarA;
            Object objI;
            io.ktor.util.pipeline.e eVar2;
            ri.b bVar;
            Object objK;
            ri.b bVar2;
            Object objK2;
            Object objK3;
            Object objD0;
            io.ktor.util.pipeline.e eVar3;
            Object objI2;
            io.ktor.util.pipeline.e eVar4;
            ri.b bVar3;
            Object objK4;
            Object objK5;
            Object objK6;
            byte[] bArr;
            Long lD;
            Object objK7;
            ri.b bVar4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            Object obj2 = null;
            switch (this.f294899c) {
                case 0:
                    ResultKt.m(obj);
                    eVar = (io.ktor.util.pipeline.e) this.f294900d;
                    io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.f294901e;
                    bVarA = dVar.a();
                    Object objB = dVar.b();
                    if (!(objB instanceof io.ktor.utils.io.h)) {
                        return Unit.f312394a;
                    }
                    io.ktor.client.statement.c cVarK = ((io.ktor.client.call.b) eVar.f()).k();
                    kotlin.reflect.d<?> dVarB = bVarA.b();
                    if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(Unit.class))) {
                        io.ktor.utils.io.i.a((io.ktor.utils.io.h) objB);
                        io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(bVarA, Unit.f312394a);
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294899c = 1;
                        objK4 = eVar.k(dVar2, this);
                        if (objK4 != objL) {
                            bVar2 = bVarA;
                            obj2 = (io.ktor.client.statement.d) objK4;
                            bVarA = bVar2;
                            if (obj2 != null) {
                                m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                            }
                            return Unit.f312394a;
                        }
                    } else if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(Integer.TYPE))) {
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294897a = eVar;
                        this.f294898b = bVarA;
                        this.f294899c = 2;
                        objI2 = io.ktor.utils.io.k.I((io.ktor.utils.io.h) objB, this);
                        if (objI2 != objL) {
                            eVar4 = eVar;
                            bVar3 = bVarA;
                            io.ktor.client.statement.d dVar3 = new io.ktor.client.statement.d(bVarA, kotlin.coroutines.jvm.internal.b.f(Integer.parseInt(io.ktor.utils.io.l0.a((kotlinx.io.c0) objI2))));
                            this.f294900d = eVar;
                            this.f294901e = bVar3;
                            this.f294897a = null;
                            this.f294898b = null;
                            this.f294899c = 3;
                            objK5 = eVar4.k(dVar3, this);
                            if (objK5 != objL) {
                                bVar2 = bVar3;
                                obj2 = (io.ktor.client.statement.d) objK5;
                                bVarA = bVar2;
                                if (obj2 != null) {
                                    m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                                }
                                return Unit.f312394a;
                            }
                        }
                    } else if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(kotlinx.io.c0.class)) || Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(kotlinx.io.c0.class))) {
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294897a = eVar;
                        this.f294898b = bVarA;
                        this.f294899c = 4;
                        objI = io.ktor.utils.io.k.I((io.ktor.utils.io.h) objB, this);
                        if (objI != objL) {
                            eVar2 = eVar;
                            bVar = bVarA;
                            io.ktor.client.statement.d dVar4 = new io.ktor.client.statement.d(bVarA, objI);
                            this.f294900d = eVar;
                            this.f294901e = bVar;
                            this.f294897a = null;
                            this.f294898b = null;
                            this.f294899c = 5;
                            objK6 = eVar2.k(dVar4, this);
                            if (objK6 != objL) {
                                bVar2 = bVar;
                                obj2 = (io.ktor.client.statement.d) objK6;
                                bVarA = bVar2;
                                if (obj2 != null) {
                                    m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                                }
                                return Unit.f312394a;
                            }
                        }
                    } else if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(byte[].class))) {
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294899c = 6;
                        objD0 = io.ktor.utils.io.k.d0((io.ktor.utils.io.h) objB, this);
                        if (objD0 != objL) {
                            eVar3 = eVar;
                            bArr = (byte[]) objD0;
                            lD = io.ktor.http.i1.d(((io.ktor.client.call.b) eVar3.f()).k());
                            if (!Intrinsics.areEqual(((io.ktor.client.call.b) eVar3.f()).j().getMethod(), io.ktor.http.j1.f295897b.d())) {
                                m.c(lD, bArr.length);
                            }
                            io.ktor.client.statement.d dVar5 = new io.ktor.client.statement.d(bVarA, bArr);
                            this.f294900d = eVar3;
                            this.f294901e = bVarA;
                            this.f294899c = 7;
                            objK7 = eVar3.k(dVar5, this);
                            if (objK7 != objL) {
                                bVar4 = bVarA;
                                bVarA = bVar4;
                                eVar = eVar3;
                                obj2 = (io.ktor.client.statement.d) objK7;
                                if (obj2 != null) {
                                    m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                                }
                                return Unit.f312394a;
                            }
                        }
                    } else if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(io.ktor.utils.io.h.class))) {
                        final kotlinx.coroutines.a0 a0VarA = s2.a((p2) cVarK.getCoroutineContext().get(p2.M2));
                        io.ktor.utils.io.d1 d1VarG = io.ktor.utils.io.t.G(eVar, this.f294902f.getCoroutineContext(), false, new a(objB, cVarK, null), 2, null);
                        io.ktor.utils.io.t.h(d1VarG, new Function0() { // from class: io.ktor.client.plugins.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return m.b.n(a0VarA);
                            }
                        });
                        io.ktor.client.statement.d dVar6 = new io.ktor.client.statement.d(bVarA, d1VarG.b());
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294899c = 8;
                        objK3 = eVar.k(dVar6, this);
                        if (objK3 != objL) {
                            bVar2 = bVarA;
                            obj2 = (io.ktor.client.statement.d) objK3;
                            bVarA = bVar2;
                            if (obj2 != null) {
                                m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                            }
                            return Unit.f312394a;
                        }
                    } else {
                        if (!Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(io.ktor.http.l1.class))) {
                            if (Intrinsics.areEqual(dVarB, kotlin.jvm.internal.j1.d(io.ktor.http.content.r.class))) {
                                io.ktor.http.v0 v0VarO = ((io.ktor.client.call.b) eVar.f()).k().O();
                                io.ktor.http.d1 d1Var = io.ktor.http.d1.f295782a;
                                String str = v0VarO.get(d1Var.C());
                                if (str == null) {
                                    throw new IllegalStateException("No content type provided for multipart");
                                }
                                io.ktor.http.m mVarB = io.ktor.http.m.f295981f.b(str);
                                if (!mVarB.h(io.ktor.http.m.g.f296037a.g())) {
                                    throw new IllegalStateException(("Expected multipart/form-data, got " + mVarB).toString());
                                }
                                String str2 = ((io.ktor.client.call.b) eVar.f()).k().O().get(d1Var.z());
                                io.ktor.client.statement.d dVar7 = new io.ktor.client.statement.d(bVarA, new io.ktor.http.cio.h(eVar.getCoroutineContext(), (io.ktor.utils.io.h) objB, str, str2 != null ? kotlin.coroutines.jvm.internal.b.g(Long.parseLong(str2)) : null, 0L, 16, null));
                                this.f294900d = eVar;
                                this.f294901e = bVarA;
                                this.f294899c = 10;
                                objK = eVar.k(dVar7, this);
                                if (objK != objL) {
                                    bVar2 = bVarA;
                                    obj2 = (io.ktor.client.statement.d) objK;
                                    bVarA = bVar2;
                                }
                            }
                            if (obj2 != null) {
                                m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                            }
                            return Unit.f312394a;
                        }
                        io.ktor.utils.io.i.a((io.ktor.utils.io.h) objB);
                        io.ktor.client.statement.d dVar8 = new io.ktor.client.statement.d(bVarA, cVarK.j());
                        this.f294900d = eVar;
                        this.f294901e = bVarA;
                        this.f294899c = 9;
                        objK2 = eVar.k(dVar8, this);
                        if (objK2 != objL) {
                            bVar2 = bVarA;
                            obj2 = (io.ktor.client.statement.d) objK2;
                            bVarA = bVar2;
                            if (obj2 != null) {
                                m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                            }
                            return Unit.f312394a;
                        }
                    }
                    return objL;
                case 1:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar5 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar5;
                    objK4 = obj;
                    obj2 = (io.ktor.client.statement.d) objK4;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 2:
                    ri.b bVar5 = (ri.b) this.f294898b;
                    io.ktor.util.pipeline.e eVar6 = (io.ktor.util.pipeline.e) this.f294897a;
                    bVar3 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar7 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar4 = eVar6;
                    eVar = eVar7;
                    bVarA = bVar5;
                    objI2 = obj;
                    io.ktor.client.statement.d dVar9 = new io.ktor.client.statement.d(bVarA, kotlin.coroutines.jvm.internal.b.f(Integer.parseInt(io.ktor.utils.io.l0.a((kotlinx.io.c0) objI2))));
                    this.f294900d = eVar;
                    this.f294901e = bVar3;
                    this.f294897a = null;
                    this.f294898b = null;
                    this.f294899c = 3;
                    objK5 = eVar4.k(dVar9, this);
                    if (objK5 != objL) {
                        bVar2 = bVar3;
                        obj2 = (io.ktor.client.statement.d) objK5;
                        bVarA = bVar2;
                        if (obj2 != null) {
                            m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                        }
                        return Unit.f312394a;
                    }
                    return objL;
                case 3:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar8 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar8;
                    objK5 = obj;
                    obj2 = (io.ktor.client.statement.d) objK5;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 4:
                    ri.b bVar6 = (ri.b) this.f294898b;
                    io.ktor.util.pipeline.e eVar9 = (io.ktor.util.pipeline.e) this.f294897a;
                    bVar = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar10 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar2 = eVar9;
                    eVar = eVar10;
                    bVarA = bVar6;
                    objI = obj;
                    io.ktor.client.statement.d dVar10 = new io.ktor.client.statement.d(bVarA, objI);
                    this.f294900d = eVar;
                    this.f294901e = bVar;
                    this.f294897a = null;
                    this.f294898b = null;
                    this.f294899c = 5;
                    objK6 = eVar2.k(dVar10, this);
                    if (objK6 != objL) {
                        bVar2 = bVar;
                        obj2 = (io.ktor.client.statement.d) objK6;
                        bVarA = bVar2;
                        if (obj2 != null) {
                            m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                        }
                        return Unit.f312394a;
                    }
                    return objL;
                case 5:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar11 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar11;
                    objK6 = obj;
                    obj2 = (io.ktor.client.statement.d) objK6;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 6:
                    ri.b bVar7 = (ri.b) this.f294901e;
                    eVar3 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    bVarA = bVar7;
                    objD0 = obj;
                    bArr = (byte[]) objD0;
                    lD = io.ktor.http.i1.d(((io.ktor.client.call.b) eVar3.f()).k());
                    if (!Intrinsics.areEqual(((io.ktor.client.call.b) eVar3.f()).j().getMethod(), io.ktor.http.j1.f295897b.d())) {
                        m.c(lD, bArr.length);
                    }
                    io.ktor.client.statement.d dVar11 = new io.ktor.client.statement.d(bVarA, bArr);
                    this.f294900d = eVar3;
                    this.f294901e = bVarA;
                    this.f294899c = 7;
                    objK7 = eVar3.k(dVar11, this);
                    if (objK7 != objL) {
                        bVar4 = bVarA;
                        bVarA = bVar4;
                        eVar = eVar3;
                        obj2 = (io.ktor.client.statement.d) objK7;
                        if (obj2 != null) {
                            m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                        }
                        return Unit.f312394a;
                    }
                    return objL;
                case 7:
                    bVar4 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar12 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar3 = eVar12;
                    objK7 = obj;
                    bVarA = bVar4;
                    eVar = eVar3;
                    obj2 = (io.ktor.client.statement.d) objK7;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 8:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar13 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar13;
                    objK3 = obj;
                    obj2 = (io.ktor.client.statement.d) objK3;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 9:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar14 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar14;
                    objK2 = obj;
                    obj2 = (io.ktor.client.statement.d) objK2;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                case 10:
                    bVar2 = (ri.b) this.f294901e;
                    io.ktor.util.pipeline.e eVar15 = (io.ktor.util.pipeline.e) this.f294900d;
                    ResultKt.m(obj);
                    eVar = eVar15;
                    objK = obj;
                    obj2 = (io.ktor.client.statement.d) objK;
                    bVarA = bVar2;
                    if (obj2 != null) {
                        m.f294887a.J("Transformed with default transformers response body for " + ((io.ktor.client.call.b) eVar.f()).j().getUrl() + " to " + bVarA.b());
                    }
                    return Unit.f312394a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // pj.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            b bVar = new b(this.f294902f, dVar2);
            bVar.f294900d = eVar;
            bVar.f294901e = dVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Long l10, long j10) {
        if (l10 != null && l10.longValue() != j10) {
            throw new IllegalStateException(("Content-Length mismatch: expected " + l10 + " bytes, but received " + j10 + " bytes").toString());
        }
    }

    public static final void d(@NotNull io.ktor.client.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.x().q(fi.e0.f275224h.b(), new a(null));
        cVar.y().q(io.ktor.client.statement.f.f295340h.b(), new b(cVar, null));
        o.b(cVar);
    }
}

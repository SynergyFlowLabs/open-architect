package io.ktor.client.plugins;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDefaultResponseValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultResponseValidation.kt\nio/ktor/client/plugins/DefaultResponseValidationKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,125:1\n21#2:126\n65#3,18:127\n*S KotlinDebug\n*F\n+ 1 DefaultResponseValidation.kt\nio/ktor/client/plugins/DefaultResponseValidationKt\n*L\n16#1:126\n16#1:127,18\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Unit> f294872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f294874c = "<no response text provided>";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f294875d = "<body failed decoding>";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f294876e = "Please, provide response text in constructor";

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {io.sentry.protocol.n.f306405g, "statusCode", io.sentry.protocol.n.f306405g, "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f294880d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f294880d = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0105  */
        /* JADX WARN: Code duplicated, block: B:41:0x010a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:44:0x0115 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:45:0x0117  */
        /* JADX WARN: Code duplicated, block: B:48:0x0122  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.client.statement.c cVar;
            int iH0;
            Object objA;
            io.ktor.client.statement.c cVarK;
            io.ktor.client.statement.c cVar2;
            int i10;
            io.ktor.client.statement.c cVar3;
            String str;
            Throwable o1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f294879c;
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    cVar = (io.ktor.client.statement.c) this.f294880d;
                    if (!((Boolean) cVar.h().getAttributes().f(w.k())).booleanValue()) {
                        l.f294873b.J("Skipping default response validation for " + cVar.h().j().getUrl());
                        return Unit.f312394a;
                    }
                    iH0 = cVar.j().H0();
                    io.ktor.client.call.b bVarH = cVar.h();
                    if (iH0 >= 300 && !bVarH.getAttributes().d(l.f294872a)) {
                        this.f294880d = cVar;
                        this.f294878b = iH0;
                        this.f294879c = 1;
                        objA = io.ktor.client.call.f.a(bVarH, this);
                        if (objA != objL) {
                        }
                        return objL;
                    }
                    return Unit.f312394a;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f294878b;
                    cVar3 = (io.ktor.client.statement.c) this.f294877a;
                    cVar2 = (io.ktor.client.statement.c) this.f294880d;
                    try {
                        ResultKt.m(obj);
                        str = (String) obj;
                    } catch (ti.c unused) {
                        str = l.f294875d;
                    }
                    if (300 > i10 && i10 < 400) {
                        o1Var = new k1(cVar3, str);
                    } else if (400 > i10 && i10 < 500) {
                        o1Var = new e(cVar3, str);
                    } else if (500 <= i10 || i10 >= 600) {
                        o1Var = new o1(cVar3, str);
                    } else {
                        o1Var = new s1(cVar3, str);
                    }
                    l.f294873b.J("Default response validation for " + cVar2.h().j().getUrl() + " failed with " + o1Var);
                    throw o1Var;
                }
                iH0 = this.f294878b;
                io.ktor.client.statement.c cVar4 = (io.ktor.client.statement.c) this.f294880d;
                ResultKt.m(obj);
                objA = obj;
                cVar = cVar4;
                this.f294880d = cVar;
                this.f294877a = cVarK;
                this.f294878b = iH0;
                this.f294879c = 2;
                int i12 = 4 >> 0;
                Object objD = io.ktor.client.statement.e.d(cVarK, null, this, 1, null);
                if (objD != objL) {
                    io.ktor.client.statement.c cVar5 = cVar;
                    obj = objD;
                    cVar2 = cVar5;
                    i10 = iH0;
                    cVar3 = cVarK;
                    str = (String) obj;
                    if (300 > i10) {
                        if (400 > i10) {
                            if (500 <= i10) {
                                o1Var = new o1(cVar3, str);
                            } else {
                                o1Var = new o1(cVar3, str);
                            }
                        } else if (500 <= i10) {
                            o1Var = new o1(cVar3, str);
                        } else {
                            o1Var = new o1(cVar3, str);
                        }
                    } else if (400 > i10) {
                        if (500 <= i10) {
                            o1Var = new o1(cVar3, str);
                        } else {
                            o1Var = new o1(cVar3, str);
                        }
                    } else if (500 <= i10) {
                        o1Var = new o1(cVar3, str);
                    } else {
                        o1Var = new o1(cVar3, str);
                    }
                    l.f294873b.J("Default response validation for " + cVar2.h().j().getUrl() + " failed with " + o1Var);
                    throw o1Var;
                }
                return objL;
            } catch (ti.c unused2) {
                cVar2 = cVar;
                i10 = iH0;
                cVar3 = cVarK;
                str = l.f294875d;
            }
            io.ktor.client.call.b bVar = (io.ktor.client.call.b) objA;
            bVar.getAttributes().a(l.f294872a, Unit.f312394a);
            cVarK = bVar.k();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Unit.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(Unit.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294872a = new io.ktor.util.a<>("ValidateMark", new ri.b(dVarD, sVarA));
        f294873b = pi.a.a("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static final void d(@NotNull final io.ktor.client.j<?> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        w.f(jVar, new Function1() { // from class: io.ktor.client.plugins.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e(jVar, (u) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(io.ktor.client.j jVar, u HttpResponseValidator) {
        Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.f(jVar.n());
        HttpResponseValidator.g(new a(null));
        return Unit.f312394a;
    }
}

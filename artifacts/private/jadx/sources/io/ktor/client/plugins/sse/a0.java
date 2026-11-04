package io.ktor.client.plugins.sse;

import androidx.compose.material3.os;
import io.ktor.http.r2;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,1117:1\n1078#1,4:1118\n1082#1,7:1123\n1090#1:1131\n1101#1:1132\n1078#1,4:1133\n1082#1,7:1138\n1090#1:1146\n1101#1:1147\n93#2:1122\n52#2:1130\n93#2:1137\n52#2:1145\n93#2:1148\n52#2:1149\n21#3:1150\n21#3:1169\n21#3:1188\n21#3:1207\n21#3:1226\n65#4,18:1151\n65#4,18:1170\n65#4,18:1189\n65#4,18:1208\n65#4,18:1227\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt\n*L\n74#1:1118,4\n74#1:1123,7\n74#1:1131\n74#1:1132\n499#1:1133,4\n499#1:1138,7\n499#1:1146\n499#1:1147\n74#1:1122\n74#1:1130\n499#1:1137\n499#1:1145\n1081#1:1148\n1081#1:1149\n17#1:1150\n18#1:1169\n19#1:1188\n20#1:1207\n21#1:1226\n17#1:1151,18\n18#1:1170,18\n19#1:1189,18\n20#1:1208,18\n21#1:1227,18\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Boolean> f294980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<kotlin.time.c> f294981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Boolean> f294982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Boolean> f294983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Function2<ri.b, String, Object>> f294984e;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1145, 1145}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,1117:1\n131#2:1118\n132#2,3:1121\n135#2,3:1143\n308#3,2:1119\n310#3,2:1146\n162#4:1124\n65#5,18:1125\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n*L\n1092#1:1118\n1092#1:1121,3\n1092#1:1143,3\n1092#1:1119,2\n1092#1:1146,2\n1092#1:1124\n1092#1:1125,18\n*E\n"})
    public static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.statement.g f294989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.x<T> f294990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.client.statement.g gVar, kotlinx.coroutines.x<T> xVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f294989e = gVar;
            this.f294990f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f294989e, this.f294990f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.x xVar;
            io.ktor.client.statement.g gVar;
            io.ktor.client.statement.c cVar;
            io.ktor.client.statement.c cVar2;
            kotlinx.coroutines.x xVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294988d;
            try {
                try {
                    try {
                        try {
                            try {
                                if (i10 == 0) {
                                    ResultKt.m(obj);
                                    io.ktor.client.statement.g gVar2 = this.f294989e;
                                    xVar = this.f294990f;
                                    this.f294985a = gVar2;
                                    this.f294986b = xVar;
                                    this.f294988d = 1;
                                    Object objG = gVar2.g(this);
                                    if (objG != objL) {
                                        gVar = gVar2;
                                        obj = objG;
                                    }
                                    return objL;
                                }
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        cVar2 = (io.ktor.client.statement.c) this.f294987c;
                                        xVar2 = (kotlinx.coroutines.x) this.f294986b;
                                        gVar = (io.ktor.client.statement.g) this.f294985a;
                                        try {
                                            ResultKt.m(obj);
                                            Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
                                            xVar2.R(obj);
                                            this.f294985a = Unit.f312394a;
                                            this.f294986b = null;
                                            this.f294987c = null;
                                            this.f294988d = 3;
                                            if (gVar.c(cVar2, this) == objL) {
                                                return objL;
                                            }
                                        } catch (Throwable th2) {
                                            io.ktor.client.statement.c cVar3 = cVar2;
                                            th = th2;
                                            cVar = cVar3;
                                            this.f294985a = th;
                                            this.f294986b = null;
                                            this.f294987c = null;
                                            this.f294988d = 4;
                                            if (gVar.c(cVar, this) != objL) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        if (i10 != 3) {
                                            if (i10 != 4) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            Throwable th3 = (Throwable) this.f294985a;
                                            ResultKt.m(obj);
                                            throw th3;
                                        }
                                        ResultKt.m(obj);
                                    }
                                    return Unit.f312394a;
                                }
                                xVar = (kotlinx.coroutines.x) this.f294986b;
                                gVar = (io.ktor.client.statement.g) this.f294985a;
                                ResultKt.m(obj);
                                Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
                            } catch (Throwable unused) {
                            }
                            io.ktor.client.call.b bVarH = cVar.h();
                            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                            kotlin.reflect.d dVarD = j1.d(Object.class);
                            ri.b bVar = new ri.b(dVarD, null);
                            this.f294985a = gVar;
                            this.f294986b = xVar;
                            this.f294987c = cVar;
                            this.f294988d = 2;
                            Object objE = bVarH.e(bVar, this);
                            if (objE != objL) {
                                kotlinx.coroutines.x xVar3 = xVar;
                                cVar2 = cVar;
                                obj = objE;
                                xVar2 = xVar3;
                                Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
                                xVar2.R(obj);
                                this.f294985a = Unit.f312394a;
                                this.f294986b = null;
                                this.f294987c = null;
                                this.f294988d = 3;
                                if (gVar.c(cVar2, this) == objL) {
                                }
                                return Unit.f312394a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            this.f294985a = th;
                            this.f294986b = null;
                            this.f294987c = null;
                            this.f294988d = 4;
                            if (gVar.c(cVar, this) != objL) {
                                throw th;
                            }
                        }
                        cVar = (io.ktor.client.statement.c) obj;
                        return objL;
                    } catch (CancellationException e10) {
                        this.f294990f.e(e10);
                    }
                } catch (Throwable th5) {
                    this.f294990f.f(a0.I(null, th5));
                }
            } catch (CancellationException e11) {
                throw io.ktor.client.utils.i.a(e11);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {173, 175}, m = "serverSentEvents-mY9Nd3A", n = {"block", io.sentry.cache.f.f305178k}, s = {"L$0", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294993c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294992b = obj;
            this.f294993c |= Integer.MIN_VALUE;
            int i10 = 3 ^ 0;
            return a0.S(null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {648, os.f31455l}, m = "serverSentEvents-Mswn-_c", n = {"block", io.sentry.cache.f.f305178k}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294996c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294995b = obj;
            this.f294996c |= Integer.MIN_VALUE;
            return a0.Q(null, null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1145, 1145}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,1117:1\n131#2:1118\n132#2,3:1121\n135#2,3:1143\n308#3,2:1119\n310#3,2:1146\n162#4:1124\n65#5,18:1125\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n*L\n1092#1:1118\n1092#1:1121,3\n1092#1:1143,3\n1092#1:1119,2\n1092#1:1146,2\n1092#1:1124\n1092#1:1125,18\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.statement.g f295001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.x f295002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.client.statement.g gVar, kotlinx.coroutines.x xVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f295001e = gVar;
            this.f295002f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f295001e, this.f295002f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x004f, B:46:0x00b5, B:51:0x00cd, B:52:0x00d6), top: B:70:0x004f }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00cd A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x004f, B:46:0x00b5, B:51:0x00cd, B:52:0x00d6), top: B:70:0x004f }] */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        
            if (r5.c(r0, r13) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        
            if (r5.c(r14, r13) == r1) goto L57;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.a0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1145, 1145}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,1117:1\n131#2:1118\n132#2,3:1121\n135#2,3:1143\n308#3,2:1119\n310#3,2:1146\n162#4:1124\n65#5,18:1125\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$processSession$2\n*L\n1092#1:1118\n1092#1:1121,3\n1092#1:1143,3\n1092#1:1119,2\n1092#1:1146,2\n1092#1:1124\n1092#1:1125,18\n*E\n"})
    public static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.statement.g f295007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.x f295008f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.ktor.client.statement.g gVar, kotlinx.coroutines.x xVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f295007e = gVar;
            this.f295008f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f295007e, this.f295008f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00b1 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:24:0x004c, B:49:0x00b1, B:53:0x00c9, B:54:0x00d3), top: B:70:0x004c }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:53:0x00c9 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:24:0x004c, B:49:0x00b1, B:53:0x00c9, B:54:0x00d3), top: B:70:0x004c }] */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
        
            if (r5.c(r14, r13) == r1) goto L59;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.a0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.s sVarA2;
        kotlin.reflect.s sVarA3;
        kotlin.reflect.s sVarA4;
        Class cls = Boolean.TYPE;
        kotlin.reflect.d dVarD = j1.d(Boolean.class);
        kotlin.reflect.s sVarD = null;
        try {
            sVarA = j1.A(cls);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294980a = new io.ktor.util.a<>("SSERequestFlag", new ri.b(dVarD, sVarA));
        kotlin.reflect.d dVarD2 = j1.d(kotlin.time.c.class);
        try {
            sVarA2 = j1.A(kotlin.time.c.class);
        } catch (Throwable unused2) {
            sVarA2 = null;
        }
        f294981b = new io.ktor.util.a<>("SSEReconnectionTime", new ri.b(dVarD2, sVarA2));
        kotlin.reflect.d dVarD3 = j1.d(Boolean.class);
        try {
            sVarA3 = j1.A(cls);
        } catch (Throwable unused3) {
            sVarA3 = null;
        }
        f294982c = new io.ktor.util.a<>("SSEShowCommentEvents", new ri.b(dVarD3, sVarA3));
        kotlin.reflect.d dVarD4 = j1.d(Boolean.class);
        try {
            sVarA4 = j1.A(cls);
        } catch (Throwable unused4) {
            sVarA4 = null;
        }
        f294983d = new io.ktor.util.a<>("SSEShowRetryEvents", new ri.b(dVarD4, sVarA4));
        kotlin.reflect.d dVarD5 = j1.d(Function2.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.f312969c;
            sVarD = j1.D(Function2.class, aVar.e(j1.A(ri.b.class)), aVar.e(j1.A(String.class)), aVar.e(j1.n(Object.class)));
        } catch (Throwable unused5) {
        }
        f294984e = new io.ktor.util.a<>("SSEDeserializer", new ri.b(dVarD5, sVarD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function1 function1, k0 install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object A0(@NotNull io.ktor.client.c cVar, @NotNull String str, @NotNull Function1<? super fi.y, Unit> function1, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objM = M(cVar, str, cVar2, bool, bool2, function1, function2, dVar);
        return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
    }

    @Nullable
    public static final Object B0(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = Q(cVar, function1, function2, cVar2, bool, bool2, function3, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    private static final <T> void C(fi.y yVar, io.ktor.util.a<T> aVar, T t10) {
        if (t10 != null) {
            yVar.c().a(aVar, t10);
        }
    }

    public static /* synthetic */ Object C0(io.ktor.client.c cVar, String str, Function1 function1, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.b1((fi.y) obj2);
                }
            };
        }
        return A0(cVar, str, function1, (i10 & 4) != 0 ? null : cVar2, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : bool2, function2, dVar);
    }

    @NotNull
    public static final io.ktor.util.a<Function2<ri.b, String, Object>> D() {
        return f294984e;
    }

    public static /* synthetic */ Object D0(io.ktor.client.c cVar, Function1 function1, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        return B0(cVar, function1, function2, cVar2, bool, bool2, function3, dVar);
    }

    @NotNull
    public static final io.ktor.util.a<kotlin.time.c> E() {
        return f294981b;
    }

    @Nullable
    public static final Object E0(@NotNull io.ktor.client.c cVar, @NotNull String str, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objU = U(cVar, str, function2, cVar2, bool, bool2, function1, function3, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.util.a<Boolean> F() {
        return f294982c;
    }

    public static /* synthetic */ Object F0(io.ktor.client.c cVar, String str, Function1 function1, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.c1((fi.y) obj2);
                }
            };
        }
        return E0(cVar, str, function1, function2, (i10 & 8) != 0 ? null : cVar2, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : bool2, function3, dVar);
    }

    @NotNull
    public static final io.ktor.util.a<Boolean> G() {
        return f294983d;
    }

    @Nullable
    public static final Object G0(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objS = S(cVar, function1, cVar2, bool, bool2, function2, dVar);
        return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.util.a<Boolean> H() {
        return f294980a;
    }

    public static /* synthetic */ Object H0(io.ktor.client.c cVar, Function1 function1, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        return G0(cVar, function1, cVar2, bool, bool2, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable I(io.ktor.client.statement.c cVar, Throwable th2) {
        return (!(th2 instanceof j0) || ((j0) th2).a() == null) ? new j0(cVar, th2, th2.getMessage()) : th2;
    }

    @Nullable
    public static final Object I0(@NotNull io.ktor.client.c cVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super fi.y, Unit> function1, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = K(cVar, str, str2, num, str3, cVar2, bool, bool2, function1, function2, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    private static final /* synthetic */ <T> Object J(io.ktor.client.c cVar, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1<? super fi.y, Unit> function1, Function1<? super fi.y, Unit> function2, kotlin.coroutines.d<? super T> dVar) {
        io.ktor.client.plugins.a0.b(cVar, m0.g());
        kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c(null, 1, null);
        fi.y yVar = new fi.y();
        function1.invoke(yVar);
        C(yVar, f294980a, Boolean.TRUE);
        C(yVar, f294981b, cVar2);
        C(yVar, f294982c, bool);
        C(yVar, f294983d, bool2);
        function2.invoke(yVar);
        Unit unit = Unit.f312394a;
        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar);
        Intrinsics.needClassReification();
        kotlinx.coroutines.k.f(cVar, null, null, new a(gVar, xVarC, null), 3, null);
        kotlin.jvm.internal.h0.e(0);
        Object objQ = xVarC.q(dVar);
        kotlin.jvm.internal.h0.e(1);
        return objQ;
    }

    public static /* synthetic */ Object J0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, Function1 function1, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.d1((fi.y) obj2);
                }
            };
        }
        if ((i10 & 32) != 0) {
            cVar2 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        return I0(cVar, str, str2, num, str3, function1, cVar2, bool, bool2, function2, dVar);
    }

    @Nullable
    public static final Object K(@NotNull io.ktor.client.c cVar, @Nullable final String str, @Nullable final String str2, @Nullable final Integer num, @Nullable final String str3, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objS = S(cVar, new Function1() { // from class: io.ktor.client.plugins.sse.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.r0(str, str2, num, str3, function1, (fi.y) obj);
            }
        }, cVar2, bool, bool2, function2, dVar);
        return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
    }

    @Nullable
    public static final Object K0(@NotNull io.ktor.client.c cVar, @NotNull String str, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        return W(cVar, str, function2, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object L(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            cVar2 = null;
        }
        if ((i10 & 32) != 0) {
            bool = null;
        }
        if ((i10 & 64) != 0) {
            bool2 = null;
        }
        if ((i10 & 128) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.q0((fi.y) obj2);
                }
            };
        }
        return K(cVar, str, str2, num, str3, cVar2, bool, bool2, function1, function2, dVar);
    }

    public static /* synthetic */ Object L0(io.ktor.client.c cVar, String str, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.W0((fi.y) obj2);
                }
            };
        }
        return K0(cVar, str, function2, cVar2, bool, bool2, function1, dVar);
    }

    @Nullable
    public static final Object M(@NotNull io.ktor.client.c cVar, @NotNull final String str, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objS = S(cVar, new Function1() { // from class: io.ktor.client.plugins.sse.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.t0(str, function1, (fi.y) obj);
            }
        }, cVar2, bool, bool2, function2, dVar);
        return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
    }

    @Nullable
    public static final Object M0(@NotNull io.ktor.client.c cVar, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        return Y(cVar, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object N(io.ktor.client.c cVar, String str, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.s0((fi.y) obj2);
                }
            };
        }
        return M(cVar, str, cVar2, bool, bool2, function1, function2, dVar);
    }

    public static /* synthetic */ Object N0(io.ktor.client.c cVar, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar2 = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            bool2 = null;
        }
        return M0(cVar, cVar2, bool, bool2, function1, dVar);
    }

    @Nullable
    public static final Object O(@NotNull io.ktor.client.c cVar, @Nullable final String str, @Nullable final String str2, @Nullable final Integer num, @Nullable final String str3, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = Q(cVar, new Function1() { // from class: io.ktor.client.plugins.sse.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.v0(str, str2, num, str3, function1, (fi.y) obj);
            }
        }, function2, cVar2, bool, bool2, function3, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    @Nullable
    public static final Object O0(@NotNull io.ktor.client.c cVar, @NotNull String str, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        return a0(cVar, str, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object P(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            cVar2 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        if ((i10 & 256) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.u0((fi.y) obj2);
                }
            };
        }
        return O(cVar, str, str2, num, str3, function2, cVar2, bool, bool2, function1, function3, dVar);
    }

    @Nullable
    public static final Object P0(@NotNull io.ktor.client.c cVar, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        return b0(cVar, function2, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public static final Object Q(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar3;
        Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function4;
        d0 d0Var;
        Throwable th2;
        d0 d0Var2;
        if (dVar instanceof c) {
            cVar3 = (c) dVar;
            int i10 = cVar3.f294996c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar3.f294996c = i10 - Integer.MIN_VALUE;
            } else {
                cVar3 = new c(dVar);
            }
        } else {
            cVar3 = new c(dVar);
        }
        c cVar4 = cVar3;
        Object obj = cVar4.f294995b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar4.f294996c;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    cVar4.f294994a = function3;
                    cVar4.f294996c = 1;
                    Object objB0 = b0(cVar, function2, cVar2, bool, bool2, function1, cVar4);
                    if (objB0 != objL) {
                        obj = objB0;
                        function4 = function3;
                    }
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var2 = (d0) cVar4.f294994a;
                    try {
                        ResultKt.m(obj);
                        t0.f(d0Var2, null, 1, null);
                        return Unit.f312394a;
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw I(d0Var2.h().k(), th2);
                    }
                }
                function4 = (Function2) cVar4.f294994a;
                ResultKt.m(obj);
                cVar4.f294994a = d0Var;
                cVar4.f294996c = 2;
                if (function4.invoke(d0Var, cVar4) != objL) {
                    d0Var2 = d0Var;
                    t0.f(d0Var2, null, 1, null);
                    return Unit.f312394a;
                }
                return objL;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th4) {
                th2 = th4;
                d0Var2 = d0Var;
                throw I(d0Var2.h().k(), th2);
            }
            d0Var = (d0) obj;
        } catch (Throwable th5) {
            t0.f(cVar, null, 1, null);
            throw th5;
        }
    }

    public static /* synthetic */ Object Q0(io.ktor.client.c cVar, String str, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.X0((fi.y) obj2);
                }
            };
        }
        return O0(cVar, str, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object R(io.ktor.client.c cVar, Function1 function1, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        return Q(cVar, function1, function2, cVar2, bool, bool2, function3, dVar);
    }

    public static /* synthetic */ Object R0(io.ktor.client.c cVar, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        return P0(cVar, function2, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public static final Object S(@NotNull io.ktor.client.c cVar, @NotNull Function1<? super fi.y, Unit> function1, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        Function2<? super b0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3;
        b0 b0Var;
        Throwable th2;
        b0 b0Var2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f294993c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f294993c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f294992b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f294993c;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    bVar2.f294991a = function2;
                    bVar2.f294993c = 1;
                    Object objY = Y(cVar, cVar2, bool, bool2, function1, bVar2);
                    if (objY != objL) {
                        obj = objY;
                        function3 = function2;
                    }
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var2 = (b0) bVar2.f294991a;
                    try {
                        ResultKt.m(obj);
                        t0.f(b0Var2, null, 1, null);
                        return Unit.f312394a;
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw I(b0Var2.h().k(), th2);
                    }
                }
                function3 = (Function2) bVar2.f294991a;
                ResultKt.m(obj);
                bVar2.f294991a = b0Var;
                bVar2.f294993c = 2;
                if (function3.invoke(b0Var, bVar2) != objL) {
                    b0Var2 = b0Var;
                    t0.f(b0Var2, null, 1, null);
                    return Unit.f312394a;
                }
                return objL;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th4) {
                th2 = th4;
                b0Var2 = b0Var;
                throw I(b0Var2.h().k(), th2);
            }
            b0Var = (b0) obj;
        } catch (Throwable th5) {
            t0.f(cVar, null, 1, null);
            throw th5;
        }
    }

    @Nullable
    public static final Object S0(@NotNull io.ktor.client.c cVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        return e0(cVar, str, str2, num, str3, function2, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object T(io.ktor.client.c cVar, Function1 function1, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        return S(cVar, function1, cVar2, bool, bool2, function2, dVar);
    }

    public static /* synthetic */ Object T0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            cVar2 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        if ((i10 & 256) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.Y0((fi.y) obj2);
                }
            };
        }
        return S0(cVar, str, str2, num, str3, function2, cVar2, bool, bool2, function1, dVar);
    }

    @Nullable
    public static final Object U(@NotNull io.ktor.client.c cVar, @NotNull final String str, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objQ = Q(cVar, new Function1() { // from class: io.ktor.client.plugins.sse.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.x0(str, function1, (fi.y) obj);
            }
        }, function2, cVar2, bool, bool2, function3, dVar);
        return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
    }

    @Nullable
    public static final Object U0(@NotNull io.ktor.client.c cVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        return g0(cVar, str, str2, num, str3, cVar2, bool, bool2, function1, dVar);
    }

    public static /* synthetic */ Object V(io.ktor.client.c cVar, String str, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.w0((fi.y) obj2);
                }
            };
        }
        return U(cVar, str, function2, cVar2, bool, bool2, function1, function3, dVar);
    }

    public static /* synthetic */ Object V0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            cVar2 = null;
        }
        if ((i10 & 32) != 0) {
            bool = null;
        }
        if ((i10 & 64) != 0) {
            bool2 = null;
        }
        if ((i10 & 128) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.Z0((fi.y) obj2);
                }
            };
        }
        return U0(cVar, str, str2, num, str3, cVar2, bool, bool2, function1, dVar);
    }

    @Nullable
    public static final Object W(@NotNull io.ktor.client.c cVar, @NotNull final String str, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        return b0(cVar, function2, cVar2, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.j0(str, function1, (fi.y) obj);
            }
        }, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    public static /* synthetic */ Object X(io.ktor.client.c cVar, String str, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            bool2 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.i0((fi.y) obj2);
                }
            };
        }
        return W(cVar, str, function2, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object Y(@NotNull io.ktor.client.c cVar, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        io.ktor.client.plugins.a0.b(cVar, m0.g());
        kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c(null, 1, null);
        fi.y yVar = new fi.y();
        function1.invoke(yVar);
        C(yVar, f294980a, kotlin.coroutines.jvm.internal.b.a(true));
        C(yVar, f294981b, cVar2);
        C(yVar, f294982c, bool);
        C(yVar, f294983d, bool2);
        kotlinx.coroutines.k.f(cVar, null, null, new d(new io.ktor.client.statement.g(yVar, cVar), xVarC, null), 3, null);
        return xVarC.q(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    public static /* synthetic */ Object Z(io.ktor.client.c cVar, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar2 = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        if ((i10 & 4) != 0) {
            bool2 = null;
        }
        return Y(cVar, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object a0(@NotNull io.ktor.client.c cVar, @NotNull final String str, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        return Y(cVar, cVar2, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.l0(str, function1, (fi.y) obj);
            }
        }, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object b0(@NotNull io.ktor.client.c cVar, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        io.ktor.client.plugins.a0.b(cVar, m0.g());
        kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c(null, 1, null);
        fi.y yVar = new fi.y();
        function1.invoke(yVar);
        C(yVar, f294980a, kotlin.coroutines.jvm.internal.b.a(true));
        C(yVar, f294981b, cVar2);
        C(yVar, f294982c, bool);
        C(yVar, f294983d, bool2);
        C(yVar, f294984e, function2);
        kotlinx.coroutines.k.f(cVar, null, null, new e(new io.ktor.client.statement.g(yVar, cVar), xVarC, null), 3, null);
        return xVarC.q(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    public static /* synthetic */ Object c0(io.ktor.client.c cVar, String str, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.k0((fi.y) obj2);
                }
            };
        }
        return a0(cVar, str, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    public static /* synthetic */ Object d0(io.ktor.client.c cVar, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar2 = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        return b0(cVar, function2, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    @Nullable
    public static final Object e0(@NotNull io.ktor.client.c cVar, @Nullable final String str, @Nullable final String str2, @Nullable final Integer num, @Nullable final String str3, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super d0> dVar) {
        return b0(cVar, function2, cVar2, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.n0(str, str2, num, str3, function1, (fi.y) obj);
            }
        }, dVar);
    }

    public static /* synthetic */ Object f0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            cVar2 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        if ((i10 & 256) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.m0((fi.y) obj2);
                }
            };
        }
        return e0(cVar, str, str2, num, str3, function2, cVar2, bool, bool2, function1, dVar);
    }

    @Nullable
    public static final Object g0(@NotNull io.ktor.client.c cVar, @Nullable final String str, @Nullable final String str2, @Nullable final Integer num, @Nullable final String str3, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull final Function1<? super fi.y, Unit> function1, @NotNull kotlin.coroutines.d<? super b0> dVar) {
        return Y(cVar, cVar2, bool, bool2, new Function1() { // from class: io.ktor.client.plugins.sse.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.p0(str, str2, num, str3, function1, (fi.y) obj);
            }
        }, dVar);
    }

    public static /* synthetic */ Object h0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            cVar2 = null;
        }
        if ((i10 & 32) != 0) {
            bool = null;
        }
        if ((i10 & 64) != 0) {
            bool2 = null;
        }
        if ((i10 & 128) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.o0((fi.y) obj2);
                }
            };
        }
        return g0(cVar, str, str2, num, str3, cVar2, bool, bool2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(String str, Function1 function1, fi.y serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        r2.m(serverSentEventsSession.i(), str);
        function1.invoke(serverSentEventsSession);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(String str, Function1 function1, fi.y serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        r2.m(serverSentEventsSession.i(), str);
        function1.invoke(serverSentEventsSession);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(String str, String str2, Integer num, String str3, Function1 function1, fi.y serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        fi.d0.r(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(String str, String str2, Integer num, String str3, Function1 function1, fi.y serverSentEventsSession) {
        Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        fi.d0.r(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(String str, String str2, Integer num, String str3, Function1 function1, fi.y serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        fi.d0.r(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(String str, Function1 function1, fi.y serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        r2.m(serverSentEvents.i(), str);
        function1.invoke(serverSentEvents);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(String str, String str2, Integer num, String str3, Function1 function1, fi.y serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        fi.d0.r(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(String str, Function1 function1, fi.y serverSentEvents) {
        Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        r2.m(serverSentEvents.i(), str);
        function1.invoke(serverSentEvents);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object y0(@NotNull io.ktor.client.c cVar, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull Function1<? super fi.y, Unit> function1, @NotNull Function2<? super ri.b, ? super String, ? extends Object> function2, @Nullable kotlin.time.c cVar2, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super d0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objO = O(cVar, str, str2, num, str3, function2, cVar2, bool, bool2, function1, function3, dVar);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    public static final void z(@NotNull io.ktor.client.j<?> jVar, @NotNull final Function1<? super k0, Unit> config) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        jVar.r(m0.g(), new Function1() { // from class: io.ktor.client.plugins.sse.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.A(config, (k0) obj);
            }
        });
    }

    public static /* synthetic */ Object z0(io.ktor.client.c cVar, String str, String str2, Integer num, String str3, Function1 function1, Function2 function2, kotlin.time.c cVar2, Boolean bool, Boolean bool2, Function2 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.sse.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a0.a1((fi.y) obj2);
                }
            };
        }
        if ((i10 & 64) != 0) {
            cVar2 = null;
        }
        if ((i10 & 128) != 0) {
            bool = null;
        }
        if ((i10 & 256) != 0) {
            bool2 = null;
        }
        return y0(cVar, str, str2, num, str3, function1, function2, cVar2, bool, bool2, function3, dVar);
    }
}

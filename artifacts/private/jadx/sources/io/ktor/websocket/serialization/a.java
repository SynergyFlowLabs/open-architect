package io.ktor.websocket.serialization;

import androidx.constraintlayout.core.motion.utils.v;
import hi.c;
import io.ktor.serialization.h;
import io.ktor.serialization.k;
import io.ktor.utils.io.o0;
import io.ktor.websocket.e;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlin.reflect.s;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebsocketChannelSerialization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,137:1\n65#2,18:138\n65#2,18:156\n*S KotlinDebug\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n*L\n33#1:138,18\n84#1:156,18\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: io.ktor.websocket.serialization.a$a, reason: collision with other inner class name */
    @f(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {108, me.relex.circleindicator.a.f332619e}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", c.C1916c.f285814c, "typeInfo", v.a.L}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C2111a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f297461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f297462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297463e;

        C2111a(kotlin.coroutines.d<? super C2111a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297462d = obj;
            this.f297463e |= Integer.MIN_VALUE;
            return a.b(null, null, null, null, this);
        }
    }

    @f(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160707m, com.planner5d.library.engine.input.f.b.I0}, m = "sendSerializedBase", n = {"$this$sendSerializedBase"}, s = {"L$0"})
    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297466c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297465b = obj;
            this.f297466c |= Integer.MIN_VALUE;
            return a.d(null, null, null, null, null, this);
        }
    }

    @o0
    public static final /* synthetic */ <T> Object a(io.ktor.websocket.o0 o0Var, h hVar, Charset charset, kotlin.coroutines.d<Object> dVar) throws k {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objB = b(o0Var, bVar, hVar, charset, dVar);
        h0.e(1);
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00b3, please report this as an issue */
    @o0
    @Nullable
    public static final Object b(@NotNull io.ktor.websocket.o0 o0Var, @NotNull ri.b bVar, @NotNull h hVar, @NotNull Charset charset, @NotNull kotlin.coroutines.d<Object> dVar) throws k {
        C2111a c2111a;
        ri.b bVar2;
        h hVar2;
        Charset charset2;
        ri.b bVar3;
        e eVar;
        s sVarA;
        if (dVar instanceof C2111a) {
            c2111a = (C2111a) dVar;
            int i10 = c2111a.f297463e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2111a.f297463e = i10 - Integer.MIN_VALUE;
            } else {
                c2111a = new C2111a(dVar);
            }
        } else {
            c2111a = new C2111a(dVar);
        }
        Object objJ = c2111a.f297462d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2111a.f297463e;
        if (i11 == 0) {
            ResultKt.m(objJ);
            n0<e> n0VarA = o0Var.a();
            bVar2 = bVar;
            c2111a.f297459a = bVar2;
            hVar2 = hVar;
            c2111a.f297460b = hVar2;
            charset2 = charset;
            c2111a.f297461c = charset2;
            c2111a.f297463e = 1;
            objJ = n0VarA.j(c2111a);
            if (objJ != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            Charset charset3 = (Charset) c2111a.f297461c;
            hVar2 = (h) c2111a.f297460b;
            ri.b bVar4 = (ri.b) c2111a.f297459a;
            ResultKt.m(objJ);
            charset2 = charset3;
            bVar2 = bVar4;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar2 = (e) c2111a.f297460b;
            bVar3 = (ri.b) c2111a.f297459a;
            ResultKt.m(objJ);
            eVar = eVar2;
        }
        if (bVar3.b().K(objJ)) {
            return objJ;
        }
        if (objJ == null) {
            sVarA = bVar3.a();
            if (sVarA == null && sVarA.A()) {
                return null;
            }
            throw new k("Frame has null content", null, eVar, 2, null);
        }
        throw new k("Can't deserialize value: expected value of type " + bVar3.b().Q() + ", got " + j1.d(objJ.getClass()).Q(), null, eVar, 2, null);
        e eVar3 = (e) objJ;
        if (!hVar2.b(eVar3)) {
            throw new k("Converter doesn't support frame type " + eVar3.g().name(), null, eVar3, 2, null);
        }
        c2111a.f297459a = bVar2;
        c2111a.f297460b = eVar3;
        c2111a.f297461c = null;
        c2111a.f297463e = 2;
        objJ = hVar2.a(charset2, bVar2, eVar3, c2111a);
        if (objJ != objL) {
            bVar3 = bVar2;
            eVar = eVar3;
            if (bVar3.b().K(objJ)) {
                return objJ;
            }
            if (objJ == null) {
                sVarA = bVar3.a();
                if (sVarA == null) {
                }
                throw new k("Frame has null content", null, eVar, 2, null);
            }
            throw new k("Can't deserialize value: expected value of type " + bVar3.b().Q() + ", got " + j1.d(objJ.getClass()).Q(), null, eVar, 2, null);
        }
        return objL;
    }

    @o0
    public static final /* synthetic */ <T> Object c(io.ktor.websocket.o0 o0Var, Object obj, h hVar, Charset charset, kotlin.coroutines.d<? super Unit> dVar) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        d(o0Var, obj, bVar, hVar, charset, dVar);
        h0.e(1);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r6.G((io.ktor.websocket.e) r11, r0) == r1) goto L21;
     */
    @io.ktor.utils.io.o0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull io.ktor.websocket.o0 r6, @org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull ri.b r8, @org.jetbrains.annotations.NotNull io.ktor.serialization.h r9, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            r5 = 0
            boolean r0 = r11 instanceof io.ktor.websocket.serialization.a.b
            r5 = 4
            if (r0 == 0) goto L16
            r0 = r11
            io.ktor.websocket.serialization.a$b r0 = (io.ktor.websocket.serialization.a.b) r0
            int r1 = r0.f297466c
            r5 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f297466c = r1
            goto L1c
        L16:
            r5 = 1
            io.ktor.websocket.serialization.a$b r0 = new io.ktor.websocket.serialization.a$b
            r0.<init>(r11)
        L1c:
            java.lang.Object r11 = r0.f297465b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297466c
            r3 = 2
            r5 = 4
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r11)
            goto L67
        L31:
            r5 = 7
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 5
            throw r6
        L3b:
            java.lang.Object r6 = r0.f297464a
            io.ktor.websocket.o0 r6 = (io.ktor.websocket.o0) r6
            kotlin.ResultKt.m(r11)
            goto L53
        L43:
            kotlin.ResultKt.m(r11)
            r0.f297464a = r6
            r5 = 1
            r0.f297466c = r4
            r5 = 2
            java.lang.Object r11 = r9.c(r10, r8, r7, r0)
            if (r11 != r1) goto L53
            goto L66
        L53:
            io.ktor.websocket.e r11 = (io.ktor.websocket.e) r11
            kotlinx.coroutines.channels.o0 r6 = r6.b()
            r7 = 0
            r0.f297464a = r7
            r0.f297466c = r3
            r5 = 4
            java.lang.Object r6 = r6.G(r11, r0)
            r5 = 5
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.serialization.a.d(io.ktor.websocket.o0, java.lang.Object, ri.b, io.ktor.serialization.h, java.nio.charset.Charset, kotlin.coroutines.d):java.lang.Object");
    }
}

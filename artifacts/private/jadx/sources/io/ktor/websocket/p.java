package io.ktor.websocket;

import androidx.collection.g3;
import io.sentry.n7;
import java.io.EOFException;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRawWebSocketCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebSocketCommon.kt\nio/ktor/websocket/RawWebSocketCommonKt\n+ 2 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,278:1\n14#2:279\n14#2:280\n14#2:281\n14#2:282\n14#2:283\n21#3,3:284\n*S KotlinDebug\n*F\n+ 1 RawWebSocketCommon.kt\nio/ktor/websocket/RawWebSocketCommonKt\n*L\n177#1:279\n178#1:280\n179#1:281\n180#1:282\n191#1:283\n160#1:284,3\n*E\n"})
public final class p {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {226, 227, com.planner5d.library.engine.input.f.b.P1, com.planner5d.library.engine.input.f.b.Q1, 255, 263}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "fin", n7.b.f305917e, "frameType", "flagsAndOpcode", "fin", "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f297394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f297395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f297397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        byte f297398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        byte f297399h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f297400i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f297401j;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297400i = obj;
            this.f297401j |= Integer.MIN_VALUE;
            int i10 = 3 & 0;
            return p.d(null, 0L, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {183, 193, 196, 197, 205, 211}, m = "writeFrame", n = {"$this$writeFrame", androidx.constraintlayout.core.motion.utils.v.a.L, "masking", n7.b.f305917e, "$this$writeFrame", androidx.constraintlayout.core.motion.utils.v.a.L, "masking", n7.b.f305917e, "formattedLength", "$this$writeFrame", androidx.constraintlayout.core.motion.utils.v.a.L, "masking", "$this$writeFrame", androidx.constraintlayout.core.motion.utils.v.a.L, "masking", "$this$writeFrame", "data", "maskKey"}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f297403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f297404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f297406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f297407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f297408g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297407f = obj;
            this.f297408g |= Integer.MIN_VALUE;
            return p.e(null, null, false, this);
        }
    }

    private static final kotlinx.io.c0 b(final kotlinx.io.c0 c0Var, final int i10) {
        return (kotlinx.io.c0) ui.q.c(4, new Function1() { // from class: io.ktor.websocket.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(i10, c0Var, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.io.c0 c(int i10, kotlinx.io.c0 c0Var, byte[] maskMemory) {
        Intrinsics.checkNotNullParameter(maskMemory, "maskMemory");
        ui.q.b(maskMemory, 0, i10);
        kotlinx.io.b bVar = new kotlinx.io.b();
        int iJ = (int) ui.l.j(c0Var);
        for (int i11 = 0; i11 < iJ; i11++) {
            bVar.m6((byte) (c0Var.readByte() ^ maskMemory[i11 % 4]));
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021d  */
    /* JADX WARN: Code duplicated, block: B:103:0x021f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0228  */
    /* JADX WARN: Code duplicated, block: B:107:0x022a  */
    /* JADX WARN: Code duplicated, block: B:110:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0231  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0247  */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x0215  */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x024d, please report this as an issue */
    @io.ktor.utils.io.o0
    @Nullable
    public static final Object d(@NotNull io.ktor.utils.io.h hVar, long j10, int i10, @NotNull kotlin.coroutines.d<? super e> dVar) throws h, m, EOFException {
        a aVar;
        long j11;
        int i11;
        Object objY;
        byte bByteValue;
        Object objY2;
        int i12;
        long j12;
        byte b10;
        io.ktor.utils.io.h hVar2;
        byte bByteValue2;
        int i13;
        int i14;
        i iVarA;
        int i15;
        int i16;
        Object objJ;
        byte b11;
        int i17;
        i iVar;
        Object objF;
        io.ktor.utils.io.h hVar3;
        i iVar2;
        byte b12;
        long j13;
        long j14;
        long jShortValue;
        boolean z10;
        int i18;
        Object objE;
        int i19;
        int i20;
        i iVar3;
        kotlinx.io.c0 c0VarB;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        io.ktor.utils.io.h hVar4 = hVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i21 = aVar.f297401j;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                aVar.f297401j = i21 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f297400i;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        switch (aVar.f297401j) {
            case 0:
                ResultKt.m(obj);
                aVar.f297392a = hVar4;
                j11 = j10;
                aVar.f297394c = j11;
                i11 = i10;
                aVar.f297396e = i11;
                aVar.f297401j = 1;
                objY = io.ktor.utils.io.k.y(hVar4, aVar);
                if (objY != objL) {
                    bByteValue = ((Number) objY).byteValue();
                    aVar.f297392a = hVar4;
                    aVar.f297394c = j11;
                    aVar.f297396e = i11;
                    aVar.f297398g = bByteValue;
                    aVar.f297401j = 2;
                    objY2 = io.ktor.utils.io.k.y(hVar4, aVar);
                    if (objY2 != objL) {
                        i12 = i11;
                        obj = objY2;
                        j12 = j11;
                        b10 = bByteValue;
                        hVar2 = hVar4;
                        bByteValue2 = ((Number) obj).byteValue();
                        i13 = b10 & com.google.common.base.c.f116464q;
                        if (i13 != 0 && i12 == 0) {
                            throw new m("Can't continue finished frames");
                        }
                        if (i13 == 0) {
                            i14 = i12;
                        } else {
                            i14 = i13;
                        }
                        iVarA = i.f297297c.a(i14);
                        if (iVarA == null) {
                            throw new IllegalStateException("Unsupported opcode: " + i14);
                        }
                        if (i13 == 0 && i12 != 0 && !iVarA.o()) {
                            throw new m("Can't start new data frame before finishing previous one");
                        }
                        if ((b10 & 128) != 0) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        if (!iVarA.o() && i15 == 0) {
                            throw new m("control frames can't be fragmented");
                        }
                        i16 = bByteValue2 & 127;
                        if (i16 == 126) {
                            aVar.f297392a = hVar2;
                            aVar.f297393b = iVarA;
                            aVar.f297394c = j12;
                            aVar.f297398g = b10;
                            aVar.f297399h = bByteValue2;
                            aVar.f297396e = i15;
                            aVar.f297401j = 3;
                            objJ = io.ktor.utils.io.k.J(hVar2, aVar);
                            if (objJ != objL) {
                                b11 = bByteValue2;
                                i17 = i15;
                                obj = objJ;
                                iVar = iVarA;
                                jShortValue = ((long) ((Number) obj).shortValue()) & okhttp3.internal.ws.g.f334653t;
                                i15 = i17;
                                bByteValue2 = b11;
                                b12 = b10;
                                io.ktor.utils.io.h hVar5 = hVar2;
                                iVar2 = iVar;
                                j13 = j12;
                                j14 = jShortValue;
                                hVar3 = hVar5;
                                if (!iVar2.o()) {
                                }
                                if ((bByteValue2 & 128) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (z10) {
                                        throw new kotlin.k0();
                                    }
                                    i18 = -1;
                                    if (j14 <= g3.f12256c) {
                                    }
                                    throw new h(j14);
                                }
                                aVar.f297392a = hVar3;
                                aVar.f297393b = iVar2;
                                aVar.f297394c = j13;
                                aVar.f297398g = b12;
                                aVar.f297396e = i15;
                                aVar.f297395d = j14;
                                aVar.f297401j = 5;
                                objE = io.ktor.utils.io.k.E(hVar3, aVar);
                                if (objE != objL) {
                                    int i22 = i15;
                                    obj = objE;
                                    i19 = i22;
                                    int iIntValue = ((Number) obj).intValue();
                                    i15 = i19;
                                    i18 = iIntValue;
                                    if (j14 <= g3.f12256c) {
                                    }
                                    throw new h(j14);
                                }
                            }
                        } else if (i16 != 127) {
                            long j15 = i16;
                            hVar3 = hVar2;
                            iVar2 = iVarA;
                            b12 = b10;
                            j13 = j12;
                            j14 = j15;
                            if (!iVar2.o() && j14 > 125) {
                                throw new m("control frames can't be larger than 125 bytes");
                            }
                            if ((bByteValue2 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                if (z10) {
                                    throw new kotlin.k0();
                                }
                                i18 = -1;
                                if (j14 <= g3.f12256c) {
                                }
                                throw new h(j14);
                            }
                            aVar.f297392a = hVar3;
                            aVar.f297393b = iVar2;
                            aVar.f297394c = j13;
                            aVar.f297398g = b12;
                            aVar.f297396e = i15;
                            aVar.f297395d = j14;
                            aVar.f297401j = 5;
                            objE = io.ktor.utils.io.k.E(hVar3, aVar);
                            if (objE != objL) {
                                int i23 = i15;
                                obj = objE;
                                i19 = i23;
                                int iIntValue2 = ((Number) obj).intValue();
                                i15 = i19;
                                i18 = iIntValue2;
                                if (j14 <= g3.f12256c || j14 > j13) {
                                    throw new h(j14);
                                }
                                aVar.f297392a = iVar2;
                                aVar.f297393b = null;
                                aVar.f297398g = b12;
                                aVar.f297396e = i15;
                                aVar.f297397f = i18;
                                aVar.f297401j = 6;
                                Object objG = io.ktor.utils.io.k.G(hVar3, (int) j14, aVar);
                                if (objG != objL) {
                                    i20 = i15;
                                    obj = objG;
                                    iVar3 = iVar2;
                                    c0VarB = (kotlinx.io.c0) obj;
                                    if (i18 != -1) {
                                        c0VarB = b(c0VarB, i18);
                                    }
                                    e.c cVar = e.f297265i;
                                    if (i20 != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    byte[] bArrC = kotlinx.io.g0.c(c0VarB);
                                    if ((b12 & com.google.common.primitives.t.f119782a) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if ((b12 & 32) != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if ((b12 & com.google.common.base.c.f116465r) != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return cVar.a(z11, iVar3, bArrC, z12, z13, z14);
                                }
                            }
                        } else {
                            aVar.f297392a = hVar2;
                            aVar.f297393b = iVarA;
                            aVar.f297394c = j12;
                            aVar.f297398g = b10;
                            aVar.f297399h = bByteValue2;
                            aVar.f297396e = i15;
                            aVar.f297401j = 4;
                            objF = io.ktor.utils.io.k.F(hVar2, aVar);
                            if (objF != objL) {
                                b11 = bByteValue2;
                                i17 = i15;
                                obj = objF;
                                iVar = iVarA;
                                jShortValue = ((Number) obj).longValue();
                                i15 = i17;
                                bByteValue2 = b11;
                                b12 = b10;
                                io.ktor.utils.io.h hVar6 = hVar2;
                                iVar2 = iVar;
                                j13 = j12;
                                j14 = jShortValue;
                                hVar3 = hVar6;
                                if (!iVar2.o()) {
                                }
                                if ((bByteValue2 & 128) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    if (z10) {
                                        throw new kotlin.k0();
                                    }
                                    i18 = -1;
                                    if (j14 <= g3.f12256c) {
                                    }
                                    throw new h(j14);
                                }
                                aVar.f297392a = hVar3;
                                aVar.f297393b = iVar2;
                                aVar.f297394c = j13;
                                aVar.f297398g = b12;
                                aVar.f297396e = i15;
                                aVar.f297395d = j14;
                                aVar.f297401j = 5;
                                objE = io.ktor.utils.io.k.E(hVar3, aVar);
                                if (objE != objL) {
                                    int i24 = i15;
                                    obj = objE;
                                    i19 = i24;
                                    int iIntValue3 = ((Number) obj).intValue();
                                    i15 = i19;
                                    i18 = iIntValue3;
                                    if (j14 <= g3.f12256c) {
                                    }
                                    throw new h(j14);
                                }
                            }
                        }
                    }
                }
                return objL;
            case 1:
                int i25 = aVar.f297396e;
                j11 = aVar.f297394c;
                io.ktor.utils.io.h hVar7 = (io.ktor.utils.io.h) aVar.f297392a;
                ResultKt.m(obj);
                i11 = i25;
                hVar4 = hVar7;
                objY = obj;
                bByteValue = ((Number) objY).byteValue();
                aVar.f297392a = hVar4;
                aVar.f297394c = j11;
                aVar.f297396e = i11;
                aVar.f297398g = bByteValue;
                aVar.f297401j = 2;
                objY2 = io.ktor.utils.io.k.y(hVar4, aVar);
                if (objY2 != objL) {
                    i12 = i11;
                    obj = objY2;
                    j12 = j11;
                    b10 = bByteValue;
                    hVar2 = hVar4;
                    bByteValue2 = ((Number) obj).byteValue();
                    i13 = b10 & com.google.common.base.c.f116464q;
                    if (i13 != 0) {
                    }
                    if (i13 == 0) {
                        i14 = i12;
                    } else {
                        i14 = i13;
                    }
                    iVarA = i.f297297c.a(i14);
                    if (iVarA == null) {
                        throw new IllegalStateException("Unsupported opcode: " + i14);
                    }
                    if (i13 == 0) {
                    }
                    if ((b10 & 128) != 0) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    if (!iVarA.o()) {
                    }
                    i16 = bByteValue2 & 127;
                    if (i16 == 126) {
                        aVar.f297392a = hVar2;
                        aVar.f297393b = iVarA;
                        aVar.f297394c = j12;
                        aVar.f297398g = b10;
                        aVar.f297399h = bByteValue2;
                        aVar.f297396e = i15;
                        aVar.f297401j = 3;
                        objJ = io.ktor.utils.io.k.J(hVar2, aVar);
                        if (objJ != objL) {
                            b11 = bByteValue2;
                            i17 = i15;
                            obj = objJ;
                            iVar = iVarA;
                            jShortValue = ((long) ((Number) obj).shortValue()) & okhttp3.internal.ws.g.f334653t;
                            i15 = i17;
                            bByteValue2 = b11;
                            b12 = b10;
                            io.ktor.utils.io.h hVar8 = hVar2;
                            iVar2 = iVar;
                            j13 = j12;
                            j14 = jShortValue;
                            hVar3 = hVar8;
                            if (!iVar2.o()) {
                            }
                            if ((bByteValue2 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                if (z10) {
                                    throw new kotlin.k0();
                                }
                                i18 = -1;
                                if (j14 <= g3.f12256c) {
                                    break;
                                }
                                throw new h(j14);
                            }
                            aVar.f297392a = hVar3;
                            aVar.f297393b = iVar2;
                            aVar.f297394c = j13;
                            aVar.f297398g = b12;
                            aVar.f297396e = i15;
                            aVar.f297395d = j14;
                            aVar.f297401j = 5;
                            objE = io.ktor.utils.io.k.E(hVar3, aVar);
                            if (objE != objL) {
                                int i26 = i15;
                                obj = objE;
                                i19 = i26;
                                int iIntValue4 = ((Number) obj).intValue();
                                i15 = i19;
                                i18 = iIntValue4;
                                if (j14 <= g3.f12256c) {
                                    break;
                                }
                                throw new h(j14);
                            }
                        }
                    } else if (i16 != 127) {
                        long j16 = i16;
                        hVar3 = hVar2;
                        iVar2 = iVarA;
                        b12 = b10;
                        j13 = j12;
                        j14 = j16;
                        if (!iVar2.o()) {
                        }
                        if ((bByteValue2 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (z10) {
                                throw new kotlin.k0();
                            }
                            i18 = -1;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                        aVar.f297392a = hVar3;
                        aVar.f297393b = iVar2;
                        aVar.f297394c = j13;
                        aVar.f297398g = b12;
                        aVar.f297396e = i15;
                        aVar.f297395d = j14;
                        aVar.f297401j = 5;
                        objE = io.ktor.utils.io.k.E(hVar3, aVar);
                        if (objE != objL) {
                            int i27 = i15;
                            obj = objE;
                            i19 = i27;
                            int iIntValue5 = ((Number) obj).intValue();
                            i15 = i19;
                            i18 = iIntValue5;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                    } else {
                        aVar.f297392a = hVar2;
                        aVar.f297393b = iVarA;
                        aVar.f297394c = j12;
                        aVar.f297398g = b10;
                        aVar.f297399h = bByteValue2;
                        aVar.f297396e = i15;
                        aVar.f297401j = 4;
                        objF = io.ktor.utils.io.k.F(hVar2, aVar);
                        if (objF != objL) {
                            b11 = bByteValue2;
                            i17 = i15;
                            obj = objF;
                            iVar = iVarA;
                            jShortValue = ((Number) obj).longValue();
                            i15 = i17;
                            bByteValue2 = b11;
                            b12 = b10;
                            io.ktor.utils.io.h hVar9 = hVar2;
                            iVar2 = iVar;
                            j13 = j12;
                            j14 = jShortValue;
                            hVar3 = hVar9;
                            if (!iVar2.o()) {
                            }
                            if ((bByteValue2 & 128) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                if (z10) {
                                    throw new kotlin.k0();
                                }
                                i18 = -1;
                                if (j14 <= g3.f12256c) {
                                    break;
                                }
                                throw new h(j14);
                            }
                            aVar.f297392a = hVar3;
                            aVar.f297393b = iVar2;
                            aVar.f297394c = j13;
                            aVar.f297398g = b12;
                            aVar.f297396e = i15;
                            aVar.f297395d = j14;
                            aVar.f297401j = 5;
                            objE = io.ktor.utils.io.k.E(hVar3, aVar);
                            if (objE != objL) {
                                int i28 = i15;
                                obj = objE;
                                i19 = i28;
                                int iIntValue6 = ((Number) obj).intValue();
                                i15 = i19;
                                i18 = iIntValue6;
                                if (j14 <= g3.f12256c) {
                                    break;
                                }
                                throw new h(j14);
                            }
                        }
                    }
                    break;
                }
                return objL;
            case 2:
                byte b13 = aVar.f297398g;
                i12 = aVar.f297396e;
                long j17 = aVar.f297394c;
                io.ktor.utils.io.h hVar10 = (io.ktor.utils.io.h) aVar.f297392a;
                ResultKt.m(obj);
                hVar2 = hVar10;
                j12 = j17;
                b10 = b13;
                bByteValue2 = ((Number) obj).byteValue();
                i13 = b10 & com.google.common.base.c.f116464q;
                if (i13 != 0) {
                }
                if (i13 == 0) {
                    i14 = i12;
                } else {
                    i14 = i13;
                }
                iVarA = i.f297297c.a(i14);
                if (iVarA == null) {
                    throw new IllegalStateException("Unsupported opcode: " + i14);
                }
                if (i13 == 0) {
                }
                if ((b10 & 128) != 0) {
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                if (!iVarA.o()) {
                }
                i16 = bByteValue2 & 127;
                if (i16 == 126) {
                    aVar.f297392a = hVar2;
                    aVar.f297393b = iVarA;
                    aVar.f297394c = j12;
                    aVar.f297398g = b10;
                    aVar.f297399h = bByteValue2;
                    aVar.f297396e = i15;
                    aVar.f297401j = 3;
                    objJ = io.ktor.utils.io.k.J(hVar2, aVar);
                    if (objJ != objL) {
                        b11 = bByteValue2;
                        i17 = i15;
                        obj = objJ;
                        iVar = iVarA;
                        jShortValue = ((long) ((Number) obj).shortValue()) & okhttp3.internal.ws.g.f334653t;
                        i15 = i17;
                        bByteValue2 = b11;
                        b12 = b10;
                        io.ktor.utils.io.h hVar11 = hVar2;
                        iVar2 = iVar;
                        j13 = j12;
                        j14 = jShortValue;
                        hVar3 = hVar11;
                        if (!iVar2.o()) {
                        }
                        if ((bByteValue2 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (z10) {
                                throw new kotlin.k0();
                            }
                            i18 = -1;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                        aVar.f297392a = hVar3;
                        aVar.f297393b = iVar2;
                        aVar.f297394c = j13;
                        aVar.f297398g = b12;
                        aVar.f297396e = i15;
                        aVar.f297395d = j14;
                        aVar.f297401j = 5;
                        objE = io.ktor.utils.io.k.E(hVar3, aVar);
                        if (objE != objL) {
                            int i29 = i15;
                            obj = objE;
                            i19 = i29;
                            int iIntValue7 = ((Number) obj).intValue();
                            i15 = i19;
                            i18 = iIntValue7;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                    }
                    break;
                } else if (i16 != 127) {
                    long j18 = i16;
                    hVar3 = hVar2;
                    iVar2 = iVarA;
                    b12 = b10;
                    j13 = j12;
                    j14 = j18;
                    if (!iVar2.o()) {
                    }
                    if ((bByteValue2 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (z10) {
                            throw new kotlin.k0();
                        }
                        i18 = -1;
                        if (j14 <= g3.f12256c) {
                            break;
                        }
                        throw new h(j14);
                    }
                    aVar.f297392a = hVar3;
                    aVar.f297393b = iVar2;
                    aVar.f297394c = j13;
                    aVar.f297398g = b12;
                    aVar.f297396e = i15;
                    aVar.f297395d = j14;
                    aVar.f297401j = 5;
                    objE = io.ktor.utils.io.k.E(hVar3, aVar);
                    if (objE != objL) {
                        int i210 = i15;
                        obj = objE;
                        i19 = i210;
                        int iIntValue8 = ((Number) obj).intValue();
                        i15 = i19;
                        i18 = iIntValue8;
                        if (j14 <= g3.f12256c) {
                            break;
                        }
                        throw new h(j14);
                    }
                } else {
                    aVar.f297392a = hVar2;
                    aVar.f297393b = iVarA;
                    aVar.f297394c = j12;
                    aVar.f297398g = b10;
                    aVar.f297399h = bByteValue2;
                    aVar.f297396e = i15;
                    aVar.f297401j = 4;
                    objF = io.ktor.utils.io.k.F(hVar2, aVar);
                    if (objF != objL) {
                        b11 = bByteValue2;
                        i17 = i15;
                        obj = objF;
                        iVar = iVarA;
                        jShortValue = ((Number) obj).longValue();
                        i15 = i17;
                        bByteValue2 = b11;
                        b12 = b10;
                        io.ktor.utils.io.h hVar12 = hVar2;
                        iVar2 = iVar;
                        j13 = j12;
                        j14 = jShortValue;
                        hVar3 = hVar12;
                        if (!iVar2.o()) {
                        }
                        if ((bByteValue2 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (z10) {
                                throw new kotlin.k0();
                            }
                            i18 = -1;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                        aVar.f297392a = hVar3;
                        aVar.f297393b = iVar2;
                        aVar.f297394c = j13;
                        aVar.f297398g = b12;
                        aVar.f297396e = i15;
                        aVar.f297395d = j14;
                        aVar.f297401j = 5;
                        objE = io.ktor.utils.io.k.E(hVar3, aVar);
                        if (objE != objL) {
                            int i211 = i15;
                            obj = objE;
                            i19 = i211;
                            int iIntValue9 = ((Number) obj).intValue();
                            i15 = i19;
                            i18 = iIntValue9;
                            if (j14 <= g3.f12256c) {
                                break;
                            }
                            throw new h(j14);
                        }
                    }
                }
                return objL;
            case 3:
                i17 = aVar.f297396e;
                b11 = aVar.f297399h;
                b10 = aVar.f297398g;
                j12 = aVar.f297394c;
                iVar = (i) aVar.f297393b;
                hVar2 = (io.ktor.utils.io.h) aVar.f297392a;
                ResultKt.m(obj);
                jShortValue = ((long) ((Number) obj).shortValue()) & okhttp3.internal.ws.g.f334653t;
                i15 = i17;
                bByteValue2 = b11;
                b12 = b10;
                io.ktor.utils.io.h hVar13 = hVar2;
                iVar2 = iVar;
                j13 = j12;
                j14 = jShortValue;
                hVar3 = hVar13;
                if (!iVar2.o()) {
                    break;
                }
                if ((bByteValue2 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (z10) {
                        throw new kotlin.k0();
                    }
                    i18 = -1;
                    if (j14 <= g3.f12256c) {
                        break;
                    }
                    throw new h(j14);
                }
                aVar.f297392a = hVar3;
                aVar.f297393b = iVar2;
                aVar.f297394c = j13;
                aVar.f297398g = b12;
                aVar.f297396e = i15;
                aVar.f297395d = j14;
                aVar.f297401j = 5;
                objE = io.ktor.utils.io.k.E(hVar3, aVar);
                if (objE != objL) {
                    int i212 = i15;
                    obj = objE;
                    i19 = i212;
                    int iIntValue10 = ((Number) obj).intValue();
                    i15 = i19;
                    i18 = iIntValue10;
                    if (j14 <= g3.f12256c) {
                        break;
                    }
                    throw new h(j14);
                }
                return objL;
            case 4:
                i17 = aVar.f297396e;
                b11 = aVar.f297399h;
                b10 = aVar.f297398g;
                j12 = aVar.f297394c;
                iVar = (i) aVar.f297393b;
                hVar2 = (io.ktor.utils.io.h) aVar.f297392a;
                ResultKt.m(obj);
                jShortValue = ((Number) obj).longValue();
                i15 = i17;
                bByteValue2 = b11;
                b12 = b10;
                io.ktor.utils.io.h hVar14 = hVar2;
                iVar2 = iVar;
                j13 = j12;
                j14 = jShortValue;
                hVar3 = hVar14;
                if (!iVar2.o()) {
                    break;
                }
                if ((bByteValue2 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (z10) {
                        throw new kotlin.k0();
                    }
                    i18 = -1;
                    if (j14 <= g3.f12256c) {
                        break;
                    }
                    throw new h(j14);
                }
                aVar.f297392a = hVar3;
                aVar.f297393b = iVar2;
                aVar.f297394c = j13;
                aVar.f297398g = b12;
                aVar.f297396e = i15;
                aVar.f297395d = j14;
                aVar.f297401j = 5;
                objE = io.ktor.utils.io.k.E(hVar3, aVar);
                if (objE != objL) {
                    int i213 = i15;
                    obj = objE;
                    i19 = i213;
                    int iIntValue11 = ((Number) obj).intValue();
                    i15 = i19;
                    i18 = iIntValue11;
                    if (j14 <= g3.f12256c) {
                        break;
                    }
                    throw new h(j14);
                }
                return objL;
            case 5:
                j14 = aVar.f297395d;
                i19 = aVar.f297396e;
                b12 = aVar.f297398g;
                j13 = aVar.f297394c;
                iVar2 = (i) aVar.f297393b;
                hVar3 = (io.ktor.utils.io.h) aVar.f297392a;
                ResultKt.m(obj);
                int iIntValue12 = ((Number) obj).intValue();
                i15 = i19;
                i18 = iIntValue12;
                if (j14 <= g3.f12256c) {
                    break;
                }
                throw new h(j14);
            case 6:
                i18 = aVar.f297397f;
                i20 = aVar.f297396e;
                b12 = aVar.f297398g;
                i iVar4 = (i) aVar.f297392a;
                ResultKt.m(obj);
                iVar3 = iVar4;
                c0VarB = (kotlinx.io.c0) obj;
                if (i18 != -1) {
                    c0VarB = b(c0VarB, i18);
                }
                e.c cVar2 = e.f297265i;
                if (i20 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                byte[] bArrC2 = kotlinx.io.g0.c(c0VarB);
                if ((b12 & com.google.common.primitives.t.f119782a) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((b12 & 32) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((b12 & com.google.common.base.c.f116465r) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return cVar2.a(z11, iVar3, bArrC2, z12, z13, z14);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138 A[PHI: r2 r6 r14
      0x0138: PHI (r2v24 io.ktor.websocket.e) = (r2v21 io.ktor.websocket.e), (r2v25 io.ktor.websocket.e) binds: [B:51:0x010a, B:57:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r6v11 io.ktor.utils.io.p) = (r6v8 io.ktor.utils.io.p), (r6v13 io.ktor.utils.io.p) binds: [B:51:0x010a, B:57:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r14v10 boolean) = (r14v7 boolean), (r14v16 boolean) binds: [B:51:0x010a, B:57:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        if (io.ktor.utils.io.t.w(r6, r13, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        r12 = r14;
        r13 = r2;
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        if (io.ktor.utils.io.t.z(r6, (short) r13, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
    
        if (io.ktor.utils.io.t.y(r6, r13, r0) == r1) goto L71;
     */
    @io.ktor.utils.io.o0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull io.ktor.utils.io.p r12, @org.jetbrains.annotations.NotNull io.ktor.websocket.e r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.p.e(io.ktor.utils.io.p, io.ktor.websocket.e, boolean, kotlin.coroutines.d):java.lang.Object");
    }
}

package io.ktor.util;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f296694a = 4096;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1}, l = {64, 66, 67, com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$4"})
    @SourceDebugExtension({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$copyToBoth$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f296700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f296702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f296703i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.h hVar, io.ktor.utils.io.p pVar, io.ktor.utils.io.p pVar2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296701g = hVar;
            this.f296702h = pVar;
            this.f296703i = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f296701g, this.f296702h, this.f296703i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0090 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:47:0x0121, B:26:0x0086, B:28:0x0090, B:30:0x0099, B:32:0x00a3, B:35:0x00c0, B:52:0x0129, B:53:0x012d, B:54:0x012e, B:62:0x0162, B:21:0x007c, B:46:0x011e, B:36:0x00cb, B:45:0x0112, B:50:0x0127), top: B:82:0x0008, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:44:0x010f  */
        /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:47:0x0121, B:26:0x0086, B:28:0x0090, B:30:0x0099, B:32:0x00a3, B:35:0x00c0, B:52:0x0129, B:53:0x012d, B:54:0x012e, B:62:0x0162, B:21:0x007c, B:46:0x011e, B:36:0x00cb, B:45:0x0112, B:50:0x0127), top: B:82:0x0008, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0138  */
        /* JADX WARN: Code duplicated, block: B:58:0x0152  */
        /* JADX WARN: Code duplicated, block: B:59:0x0154  */
        /* JADX WARN: Code duplicated, block: B:61:0x0160  */
        /* JADX WARN: Code duplicated, block: B:62:0x0162 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:47:0x0121, B:26:0x0086, B:28:0x0090, B:30:0x0099, B:32:0x00a3, B:35:0x00c0, B:52:0x0129, B:53:0x012d, B:54:0x012e, B:62:0x0162, B:21:0x007c, B:46:0x011e, B:36:0x00cb, B:45:0x0112, B:50:0x0127), top: B:82:0x0008, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0196  */
        /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x010f -> B:87:0x011e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.utils.io.p pVar;
            io.ktor.utils.io.p pVar2;
            Throwable th2;
            kotlinx.io.c0 c0Var;
            io.ktor.utils.io.h hVar;
            io.ktor.utils.io.p pVar3;
            io.ktor.utils.io.p pVar4;
            AutoCloseable autoCloseable;
            AutoCloseable autoCloseable2;
            io.ktor.utils.io.p pVar5;
            io.ktor.utils.io.p pVar6;
            io.ktor.utils.io.h hVar2;
            kotlinx.io.c0 c0VarPeek;
            kotlinx.io.c0 c0Var2;
            kotlinx.io.c0 c0VarPeek2;
            Throwable thE;
            io.ktor.utils.io.p pVar7;
            io.ktor.utils.io.p pVar8;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            try {
                switch (this.f296700f) {
                    case 0:
                        ResultKt.m(obj);
                        if (!this.f296701g.k() || (this.f296702h.h() && this.f296703i.h())) {
                            thE = this.f296701g.e();
                            if (thE != null) {
                                throw thE;
                            }
                            pVar7 = this.f296702h;
                            this.f296695a = null;
                            this.f296696b = null;
                            this.f296697c = null;
                            this.f296698d = null;
                            this.f296699e = null;
                            this.f296700f = 4;
                            if (pVar7.g(this) != objL) {
                                pVar8 = this.f296703i;
                                this.f296700f = 5;
                                if (pVar8.g(this) == objL) {
                                }
                                return Unit.f312394a;
                            }
                        } else {
                            io.ktor.utils.io.h hVar3 = this.f296701g;
                            this.f296695a = null;
                            this.f296696b = null;
                            this.f296697c = null;
                            this.f296698d = null;
                            this.f296699e = null;
                            this.f296700f = 1;
                            obj = io.ktor.utils.io.k.H(hVar3, 4096L, this);
                            if (obj != objL) {
                                autoCloseable2 = (AutoCloseable) obj;
                                pVar5 = this.f296702h;
                                pVar6 = this.f296703i;
                                hVar2 = this.f296701g;
                                c0Var2 = (kotlinx.io.c0) autoCloseable2;
                                c0VarPeek2 = c0Var2.peek();
                                this.f296695a = autoCloseable2;
                                this.f296696b = pVar5;
                                this.f296697c = pVar6;
                                this.f296698d = hVar2;
                                this.f296699e = c0Var2;
                                this.f296700f = 2;
                                if (io.ktor.utils.io.t.y(pVar5, c0VarPeek2, this) == objL) {
                                    autoCloseable = autoCloseable2;
                                    pVar4 = pVar5;
                                    pVar3 = pVar6;
                                    hVar = hVar2;
                                    c0Var = c0Var2;
                                    c0VarPeek = c0Var.peek();
                                    this.f296695a = autoCloseable;
                                    this.f296696b = pVar4;
                                    this.f296697c = pVar3;
                                    this.f296698d = hVar;
                                    this.f296699e = null;
                                    this.f296700f = 3;
                                    if (io.ktor.utils.io.t.y(pVar3, c0VarPeek, this) != objL) {
                                        try {
                                            autoCloseable2 = autoCloseable;
                                            Unit unit = Unit.f312394a;
                                            kotlin.jdk7.a.c(autoCloseable2, null);
                                            if (this.f296701g.k()) {
                                                thE = this.f296701g.e();
                                                if (thE != null) {
                                                    throw thE;
                                                }
                                                pVar7 = this.f296702h;
                                                this.f296695a = null;
                                                this.f296696b = null;
                                                this.f296697c = null;
                                                this.f296698d = null;
                                                this.f296699e = null;
                                                this.f296700f = 4;
                                                if (pVar7.g(this) != objL) {
                                                    pVar8 = this.f296703i;
                                                    this.f296700f = 5;
                                                    if (pVar8.g(this) == objL) {
                                                    }
                                                    return Unit.f312394a;
                                                }
                                            } else {
                                                thE = this.f296701g.e();
                                                if (thE != null) {
                                                    throw thE;
                                                }
                                                pVar7 = this.f296702h;
                                                this.f296695a = null;
                                                this.f296696b = null;
                                                this.f296697c = null;
                                                this.f296698d = null;
                                                this.f296699e = null;
                                                this.f296700f = 4;
                                                if (pVar7.g(this) != objL) {
                                                    pVar8 = this.f296703i;
                                                    this.f296700f = 5;
                                                    if (pVar8.g(this) == objL) {
                                                    }
                                                    return Unit.f312394a;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                kotlin.jdk7.a.c(autoCloseable2, th3);
                                                throw th4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return objL;
                    case 1:
                        ResultKt.m(obj);
                        autoCloseable2 = (AutoCloseable) obj;
                        pVar5 = this.f296702h;
                        pVar6 = this.f296703i;
                        hVar2 = this.f296701g;
                        c0Var2 = (kotlinx.io.c0) autoCloseable2;
                        c0VarPeek2 = c0Var2.peek();
                        this.f296695a = autoCloseable2;
                        this.f296696b = pVar5;
                        this.f296697c = pVar6;
                        this.f296698d = hVar2;
                        this.f296699e = c0Var2;
                        this.f296700f = 2;
                        if (io.ktor.utils.io.t.y(pVar5, c0VarPeek2, this) == objL) {
                            autoCloseable = autoCloseable2;
                            pVar4 = pVar5;
                            pVar3 = pVar6;
                            hVar = hVar2;
                            c0Var = c0Var2;
                            c0VarPeek = c0Var.peek();
                            this.f296695a = autoCloseable;
                            this.f296696b = pVar4;
                            this.f296697c = pVar3;
                            this.f296698d = hVar;
                            this.f296699e = null;
                            this.f296700f = 3;
                            if (io.ktor.utils.io.t.y(pVar3, c0VarPeek, this) != objL) {
                                autoCloseable2 = autoCloseable;
                                Unit unit2 = Unit.f312394a;
                                kotlin.jdk7.a.c(autoCloseable2, null);
                                if (this.f296701g.k()) {
                                    thE = this.f296701g.e();
                                    if (thE != null) {
                                        throw thE;
                                    }
                                    pVar7 = this.f296702h;
                                    this.f296695a = null;
                                    this.f296696b = null;
                                    this.f296697c = null;
                                    this.f296698d = null;
                                    this.f296699e = null;
                                    this.f296700f = 4;
                                    if (pVar7.g(this) != objL) {
                                        pVar8 = this.f296703i;
                                        this.f296700f = 5;
                                        if (pVar8.g(this) == objL) {
                                        }
                                        return Unit.f312394a;
                                    }
                                } else {
                                    thE = this.f296701g.e();
                                    if (thE != null) {
                                        throw thE;
                                    }
                                    pVar7 = this.f296702h;
                                    this.f296695a = null;
                                    this.f296696b = null;
                                    this.f296697c = null;
                                    this.f296698d = null;
                                    this.f296699e = null;
                                    this.f296700f = 4;
                                    if (pVar7.g(this) != objL) {
                                        pVar8 = this.f296703i;
                                        this.f296700f = 5;
                                        if (pVar8.g(this) == objL) {
                                        }
                                        return Unit.f312394a;
                                    }
                                }
                            }
                        }
                        return objL;
                    case 2:
                        c0Var = (kotlinx.io.c0) this.f296699e;
                        hVar = (io.ktor.utils.io.h) this.f296698d;
                        pVar3 = (io.ktor.utils.io.p) this.f296697c;
                        pVar4 = (io.ktor.utils.io.p) this.f296696b;
                        autoCloseable = (AutoCloseable) this.f296695a;
                        try {
                            ResultKt.m(obj);
                        } catch (Throwable th5) {
                            io.ktor.utils.io.h hVar4 = hVar;
                            io.ktor.utils.io.p pVar9 = pVar3;
                            io.ktor.utils.io.p pVar10 = pVar4;
                            autoCloseable2 = autoCloseable;
                            hVar4.c(th5);
                            io.ktor.utils.io.t.e(pVar10, th5);
                            io.ktor.utils.io.t.e(pVar9, th5);
                            Unit unit3 = Unit.f312394a;
                            kotlin.jdk7.a.c(autoCloseable2, null);
                            if (this.f296701g.k()) {
                                thE = this.f296701g.e();
                                if (thE != null) {
                                    throw thE;
                                }
                                pVar7 = this.f296702h;
                                this.f296695a = null;
                                this.f296696b = null;
                                this.f296697c = null;
                                this.f296698d = null;
                                this.f296699e = null;
                                this.f296700f = 4;
                                if (pVar7.g(this) != objL) {
                                    pVar8 = this.f296703i;
                                    this.f296700f = 5;
                                    if (pVar8.g(this) == objL) {
                                    }
                                    return Unit.f312394a;
                                }
                            } else {
                                thE = this.f296701g.e();
                                if (thE != null) {
                                    throw thE;
                                }
                                pVar7 = this.f296702h;
                                this.f296695a = null;
                                this.f296696b = null;
                                this.f296697c = null;
                                this.f296698d = null;
                                this.f296699e = null;
                                this.f296700f = 4;
                                if (pVar7.g(this) != objL) {
                                    pVar8 = this.f296703i;
                                    this.f296700f = 5;
                                    if (pVar8.g(this) == objL) {
                                    }
                                    return Unit.f312394a;
                                }
                            }
                            return objL;
                        }
                        c0VarPeek = c0Var.peek();
                        this.f296695a = autoCloseable;
                        this.f296696b = pVar4;
                        this.f296697c = pVar3;
                        this.f296698d = hVar;
                        this.f296699e = null;
                        this.f296700f = 3;
                        if (io.ktor.utils.io.t.y(pVar3, c0VarPeek, this) != objL) {
                            autoCloseable2 = autoCloseable;
                            Unit unit4 = Unit.f312394a;
                            kotlin.jdk7.a.c(autoCloseable2, null);
                            if (this.f296701g.k()) {
                                thE = this.f296701g.e();
                                if (thE != null) {
                                    throw thE;
                                }
                                pVar7 = this.f296702h;
                                this.f296695a = null;
                                this.f296696b = null;
                                this.f296697c = null;
                                this.f296698d = null;
                                this.f296699e = null;
                                this.f296700f = 4;
                                if (pVar7.g(this) != objL) {
                                    pVar8 = this.f296703i;
                                    this.f296700f = 5;
                                    if (pVar8.g(this) == objL) {
                                    }
                                    return Unit.f312394a;
                                }
                            } else {
                                thE = this.f296701g.e();
                                if (thE != null) {
                                    throw thE;
                                }
                                pVar7 = this.f296702h;
                                this.f296695a = null;
                                this.f296696b = null;
                                this.f296697c = null;
                                this.f296698d = null;
                                this.f296699e = null;
                                this.f296700f = 4;
                                if (pVar7.g(this) != objL) {
                                    pVar8 = this.f296703i;
                                    this.f296700f = 5;
                                    if (pVar8.g(this) == objL) {
                                    }
                                    return Unit.f312394a;
                                }
                            }
                        }
                        return objL;
                    case 3:
                        hVar2 = (io.ktor.utils.io.h) this.f296698d;
                        pVar6 = (io.ktor.utils.io.p) this.f296697c;
                        pVar5 = (io.ktor.utils.io.p) this.f296696b;
                        autoCloseable2 = (AutoCloseable) this.f296695a;
                        try {
                            ResultKt.m(obj);
                        } catch (Throwable th6) {
                            hVar2.c(th6);
                            io.ktor.utils.io.t.e(pVar5, th6);
                            io.ktor.utils.io.t.e(pVar6, th6);
                        }
                        Unit unit5 = Unit.f312394a;
                        kotlin.jdk7.a.c(autoCloseable2, null);
                        if (this.f296701g.k()) {
                            thE = this.f296701g.e();
                            if (thE != null) {
                                throw thE;
                            }
                            pVar7 = this.f296702h;
                            this.f296695a = null;
                            this.f296696b = null;
                            this.f296697c = null;
                            this.f296698d = null;
                            this.f296699e = null;
                            this.f296700f = 4;
                            if (pVar7.g(this) != objL) {
                                pVar8 = this.f296703i;
                                this.f296700f = 5;
                                if (pVar8.g(this) == objL) {
                                }
                                return Unit.f312394a;
                            }
                        } else {
                            thE = this.f296701g.e();
                            if (thE != null) {
                                throw thE;
                            }
                            pVar7 = this.f296702h;
                            this.f296695a = null;
                            this.f296696b = null;
                            this.f296697c = null;
                            this.f296698d = null;
                            this.f296699e = null;
                            this.f296700f = 4;
                            if (pVar7.g(this) != objL) {
                                pVar8 = this.f296703i;
                                this.f296700f = 5;
                                if (pVar8.g(this) == objL) {
                                }
                                return Unit.f312394a;
                            }
                        }
                        return objL;
                    case 4:
                        ResultKt.m(obj);
                        pVar8 = this.f296703i;
                        this.f296700f = 5;
                        if (pVar8.g(this) == objL) {
                            return objL;
                        }
                        return Unit.f312394a;
                    case 5:
                    case 7:
                        ResultKt.m(obj);
                        return Unit.f312394a;
                    case 6:
                        ResultKt.m(obj);
                        pVar = this.f296703i;
                        this.f296700f = 7;
                        if (pVar.g(this) == objL) {
                            return objL;
                        }
                        return Unit.f312394a;
                    case 8:
                        Throwable th7 = (Throwable) this.f296695a;
                        ResultKt.m(obj);
                        th = th7;
                        pVar2 = this.f296703i;
                        this.f296695a = th;
                        this.f296700f = 9;
                        if (pVar2.g(this) != objL) {
                            th2 = th;
                            throw th2;
                        }
                        return objL;
                    case 9:
                        th2 = (Throwable) this.f296695a;
                        ResultKt.m(obj);
                        throw th2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th8) {
                try {
                    io.ktor.utils.io.t.e(this.f296702h, th8);
                    io.ktor.utils.io.t.e(this.f296703i, th8);
                    io.ktor.utils.io.p pVar11 = this.f296702h;
                    this.f296695a = null;
                    this.f296696b = null;
                    this.f296697c = null;
                    this.f296698d = null;
                    this.f296699e = null;
                    this.f296700f = 6;
                    if (pVar11.g(this) != objL) {
                        pVar = this.f296703i;
                        this.f296700f = 7;
                        if (pVar.g(this) == objL) {
                        }
                        return Unit.f312394a;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    io.ktor.utils.io.p pVar12 = this.f296702h;
                    this.f296695a = th;
                    this.f296696b = null;
                    this.f296697c = null;
                    this.f296698d = null;
                    this.f296699e = null;
                    this.f296700f = 8;
                    if (pVar12.g(this) != objL) {
                        pVar2 = this.f296703i;
                        this.f296695a = th;
                        this.f296700f = 9;
                        if (pVar2.g(this) != objL) {
                            th2 = th;
                            throw th2;
                        }
                    }
                }
                return objL;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 32}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$split$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f296705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f296706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.b f296709f;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f296711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f296712c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f296713d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(io.ktor.utils.io.b bVar, byte[] bArr, int i10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f296711b = bVar;
                this.f296712c = bArr;
                this.f296713d = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f296711b, this.f296712c, this.f296713d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296710a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.utils.io.b bVar = this.f296711b;
                    byte[] bArr = this.f296712c;
                    int i11 = this.f296713d;
                    this.f296710a = 1;
                    if (io.ktor.utils.io.t.t(bVar, bArr, 0, i11, this) == objL) {
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
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: io.ktor.util.l$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        static final class C2092b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.b f296715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f296716c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f296717d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2092b(io.ktor.utils.io.b bVar, byte[] bArr, int i10, kotlin.coroutines.d<? super C2092b> dVar) {
                super(2, dVar);
                this.f296715b = bVar;
                this.f296716c = bArr;
                this.f296717d = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2092b(this.f296715b, this.f296716c, this.f296717d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296714a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    io.ktor.utils.io.b bVar = this.f296715b;
                    byte[] bArr = this.f296716c;
                    int i11 = this.f296717d;
                    this.f296714a = 1;
                    if (io.ktor.utils.io.t.t(bVar, bArr, 0, i11, this) == objL) {
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
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2092b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.utils.io.h hVar, io.ktor.utils.io.b bVar, io.ktor.utils.io.b bVar2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f296707d = hVar;
            this.f296708e = bVar;
            this.f296709f = bVar2;
            int i10 = 2 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f296707d, this.f296708e, this.f296709f, dVar);
            bVar.f296706c = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: all -> 0x001d, PHI: r1 r10
          0x004b: PHI (r1v7 byte[]) = (r1v6 byte[]), (r1v6 byte[]), (r1v8 byte[]) binds: [B:24:0x006c, B:26:0x00a4, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r10v1 kotlinx.coroutines.s0) = (r10v0 kotlinx.coroutines.s0), (r10v0 kotlinx.coroutines.s0), (r10v3 kotlinx.coroutines.s0) binds: [B:24:0x006c, B:26:0x00a4, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:18:0x004b, B:20:0x0053, B:23:0x0066, B:25:0x006e, B:28:0x00a7, B:32:0x00c1, B:14:0x0031), top: B:42:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0053 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:18:0x004b, B:20:0x0053, B:23:0x0066, B:25:0x006e, B:28:0x00a7, B:32:0x00c1, B:14:0x0031), top: B:42:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0065  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066 A[Catch: all -> 0x001d, PHI: r0 r1 r10
          0x0066: PHI (r0v9 java.lang.Object) = (r0v22 java.lang.Object), (r0v27 java.lang.Object) binds: [B:21:0x0063, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r1v6 byte[]) = (r1v7 byte[]), (r1v10 byte[]) binds: [B:21:0x0063, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r10v0 kotlinx.coroutines.s0) = (r10v1 kotlinx.coroutines.s0), (r10v4 kotlinx.coroutines.s0) binds: [B:21:0x0063, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:18:0x004b, B:20:0x0053, B:23:0x0066, B:25:0x006e, B:28:0x00a7, B:32:0x00c1, B:14:0x0031), top: B:42:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:18:0x004b, B:20:0x0053, B:23:0x0066, B:25:0x006e, B:28:0x00a7, B:32:0x00c1, B:14:0x0031), top: B:42:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006c -> B:18:0x004b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:18:0x004b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final void c(@NotNull io.ktor.utils.io.h hVar, @NotNull final io.ktor.utils.io.p first, @NotNull final io.ktor.utils.io.p second) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int i10 = 4 & 0;
        kotlinx.coroutines.k.f(f2.f314023a, kotlinx.coroutines.l1.a(), null, new a(hVar, first, second, null), 2, null).E(new Function1() { // from class: io.ktor.util.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.d(first, second, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(io.ktor.utils.io.p pVar, io.ktor.utils.io.p pVar2, Throwable th2) {
        if (th2 == null) {
            return Unit.f312394a;
        }
        io.ktor.utils.io.t.e(pVar, th2);
        io.ktor.utils.io.t.e(pVar2, th2);
        return Unit.f312394a;
    }

    @NotNull
    public static final Pair<io.ktor.utils.io.h, io.ktor.utils.io.h> e(@NotNull io.ktor.utils.io.h hVar, @NotNull kotlinx.coroutines.s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        final io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(true);
        final io.ktor.utils.io.b bVar2 = new io.ktor.utils.io.b(true);
        kotlinx.coroutines.k.f(coroutineScope, null, null, new b(hVar, bVar, bVar2, null), 3, null).E(new Function1() { // from class: io.ktor.util.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.f(bVar, bVar2, (Throwable) obj);
            }
        });
        return TuplesKt.to(bVar, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(io.ktor.utils.io.b bVar, io.ktor.utils.io.b bVar2, Throwable th2) {
        if (th2 == null) {
            return Unit.f312394a;
        }
        bVar.c(th2);
        bVar2.c(th2);
        return Unit.f312394a;
    }
}

package androidx.paging;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n120#2,8:225\n129#2:237\n12744#3,2:233\n18987#3,2:235\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n*L\n195#1:225,8\n195#1:237\n196#1:233,2\n199#1:235,2\n*E\n"})
public final class i3<T1, T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.o<T1, T2, m, kotlin.coroutines.d<? super Unit>, Object> f72260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.x<Unit> f72261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f72262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.x<Unit>[] f72263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object[] f72264e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {com.facebook.internal.p.f100029m, 230, androidx.compose.runtime.m0.f36245r}, m = "onNext", n = {"this", "value", FirebaseAnalytics.d.f120644b0, "this", "value", "$this$withLock_u24default$iv", FirebaseAnalytics.d.f120644b0, "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f72269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i3<T1, T2> f72270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72271g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i3<T1, T2> i3Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f72270f = i3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72269e = obj;
            this.f72271g |= Integer.MIN_VALUE;
            return this.f72270f.a(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i3(@NotNull pj.o<? super T1, ? super T2, ? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> send) {
        Intrinsics.checkNotNullParameter(send, "send");
        this.f72260a = send;
        this.f72261b = kotlinx.coroutines.z.c(null, 1, null);
        this.f72262c = kotlinx.coroutines.sync.g.b(false, 1, null);
        kotlinx.coroutines.x<Unit>[] xVarArr = new kotlinx.coroutines.x[2];
        for (int i10 = 0; i10 < 2; i10++) {
            xVarArr[i10] = kotlinx.coroutines.z.c(null, 1, null);
        }
        this.f72263d = xVarArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = d0.f71681a;
        }
        this.f72264e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x00b3, LOOP:0: B:33:0x00a4->B:37:0x00b0, LOOP_END, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x00b3, LOOP:1: B:42:0x00c0->B:46:0x00cc, LOOP_END, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:32:0x009f, B:34:0x00a6, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:48:0x00d1, B:52:0x00db, B:50:0x00d6, B:51:0x00d9, B:37:0x00b0), top: B:62:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(int i10, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        i3<T1, T2> i3Var;
        int i11;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar3;
        Object[] objArr;
        int length;
        int i12;
        boolean z10;
        Object[] objArr2;
        int length2;
        int i13;
        m mVar;
        pj.o<T1, T2, m, kotlin.coroutines.d<? super Unit>, Object> oVar;
        Object obj2;
        Object obj3;
        i3<T1, T2> i3Var2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f72271g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f72271g = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj4 = aVar.f72269e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i15 = aVar.f72271g;
        if (i15 == 0) {
            ResultKt.m(obj4);
            if (this.f72263d[i10].x()) {
                kotlinx.coroutines.x<Unit> xVar = this.f72261b;
                aVar.f72265a = this;
                aVar.f72266b = obj;
                aVar.f72268d = i10;
                aVar.f72271g = 1;
                if (xVar.q(aVar) != objL) {
                }
                return objL;
            }
            this.f72263d[i10].R(Unit.f312394a);
        } else {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (kotlinx.coroutines.sync.a) aVar.f72266b;
                    i3Var2 = (i3) aVar.f72265a;
                    try {
                        ResultKt.m(obj4);
                        i3Var2.f72261b.R(Unit.f312394a);
                        Unit unit = Unit.f312394a;
                        aVar3.i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar3.i(null);
                        throw th2;
                    }
                }
                i11 = aVar.f72268d;
                aVar2 = (kotlinx.coroutines.sync.a) aVar.f72267c;
                obj = aVar.f72266b;
                i3Var = (i3) aVar.f72265a;
                ResultKt.m(obj4);
                try {
                    objArr = i3Var.f72264e;
                    length = objArr.length;
                    i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            z10 = false;
                            break;
                        }
                        if (objArr[i12] == d0.f71681a) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    objArr2 = i3Var.f72264e;
                    objArr2[i11] = obj;
                    length2 = objArr2.length;
                    i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            if (z10) {
                                mVar = m.INITIAL;
                            } else if (i11 == 0) {
                                mVar = m.RECEIVER;
                            } else {
                                mVar = m.OTHER;
                            }
                            oVar = i3Var.f72260a;
                            Object[] objArr3 = i3Var.f72264e;
                            obj2 = objArr3[0];
                            obj3 = objArr3[1];
                            aVar.f72265a = i3Var;
                            aVar.f72266b = aVar2;
                            aVar.f72267c = null;
                            aVar.f72271g = 3;
                            if (oVar.invoke((T1) obj2, (T2) obj3, mVar, aVar) != objL) {
                                aVar3 = aVar2;
                                i3Var2 = i3Var;
                                i3Var2.f72261b.R(Unit.f312394a);
                                break;
                            }
                            return objL;
                        }
                        if (objArr2[i13] == d0.f71681a) {
                            aVar3 = aVar2;
                            break;
                        }
                        i13++;
                    }
                    Unit unit2 = Unit.f312394a;
                    aVar3.i(null);
                    return unit2;
                } catch (Throwable th4) {
                    kotlinx.coroutines.sync.a aVar4 = aVar2;
                    th2 = th4;
                    aVar3 = aVar4;
                    aVar3.i(null);
                    throw th2;
                }
            }
            i10 = aVar.f72268d;
            obj = aVar.f72266b;
            this = (i3) aVar.f72265a;
            ResultKt.m(obj4);
        }
        kotlinx.coroutines.sync.a aVar5 = this.f72262c;
        aVar.f72265a = this;
        aVar.f72266b = obj;
        aVar.f72267c = aVar5;
        aVar.f72268d = i10;
        aVar.f72271g = 2;
        if (aVar5.h(null, aVar) != objL) {
            i3Var = this;
            i11 = i10;
            aVar2 = aVar5;
            objArr = i3Var.f72264e;
            length = objArr.length;
            i12 = 0;
            while (true) {
                if (i12 < length) {
                    z10 = false;
                    break;
                }
                if (objArr[i12] == d0.f71681a) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            objArr2 = i3Var.f72264e;
            objArr2[i11] = obj;
            length2 = objArr2.length;
            i13 = 0;
            while (true) {
                if (i13 < length2) {
                    if (z10) {
                        mVar = m.INITIAL;
                    } else if (i11 == 0) {
                        mVar = m.RECEIVER;
                    } else {
                        mVar = m.OTHER;
                    }
                    oVar = i3Var.f72260a;
                    Object[] objArr4 = i3Var.f72264e;
                    obj2 = objArr4[0];
                    obj3 = objArr4[1];
                    aVar.f72265a = i3Var;
                    aVar.f72266b = aVar2;
                    aVar.f72267c = null;
                    aVar.f72271g = 3;
                    if (oVar.invoke((T1) obj2, (T2) obj3, mVar, aVar) != objL) {
                        aVar3 = aVar2;
                        i3Var2 = i3Var;
                        i3Var2.f72261b.R(Unit.f312394a);
                        break;
                    }
                } else {
                    if (objArr2[i13] == d0.f71681a) {
                        aVar3 = aVar2;
                        break;
                    }
                    i13++;
                }
            }
            Unit unit3 = Unit.f312394a;
            aVar3.i(null);
            return unit3;
        }
        return objL;
    }
}

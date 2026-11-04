package com.planner5d.library.modules.user.user;

import android.util.Pair;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f223194c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f223195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f223196b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserStorage$load$2", f = "UserStorage.kt", i = {2, 2, 2}, l = {32, 34, 37}, m = "invokeSuspend", n = {MetricConsts.Install, "user", "userSigned"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super id.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223200d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LogRecord m(JSONException jSONException) {
            return new LogRecord("user_storage", "failed_load", jSONException);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m1.this.new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007b A[Catch: JSONException -> 0x0028, TryCatch #0 {JSONException -> 0x0028, blocks: (B:9:0x0023, B:32:0x00af, B:36:0x00be, B:37:0x00e7, B:15:0x0034, B:26:0x0075, B:28:0x007b, B:23:0x005e), top: B:41:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: JSONException -> 0x0028, TryCatch #0 {JSONException -> 0x0028, blocks: (B:9:0x0023, B:32:0x00af, B:36:0x00be, B:37:0x00e7, B:15:0x0034, B:26:0x0075, B:28:0x007b, B:23:0x005e), top: B:41:0x000b }] */
        /* JADX WARN: Instruction removed from duplicated block: B:36:0x00be, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            id.a aVar;
            Pair<JSONObject, String> pairJ;
            Object objU;
            String str2;
            id.a aVar2;
            Pair<JSONObject, String> pair;
            String str3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223200d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.p pVar = m1.this.f223195a;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.user;
                    this.f223200d = 1;
                    obj = pVar.y(rVar, this);
                    if (obj != objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 == 2) {
                        ResultKt.m(obj);
                        str = (String) obj;
                        if (str != null) {
                            m1 m1Var = m1.this;
                            aVar = new id.a(new JSONObject(str));
                            pairJ = aVar.j();
                            com.planner5d.library.model.manager.config.p pVar2 = m1Var.f223195a;
                            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.userSignature;
                            this.f223197a = str;
                            this.f223198b = aVar;
                            this.f223199c = pairJ;
                            this.f223200d = 3;
                            objU = pVar2.u(rVar2, com.planner5d.library.model.payments.a.f222474i, this);
                            if (objU != objL) {
                                str2 = str;
                                obj = objU;
                                aVar2 = aVar;
                                pair = pairJ;
                            }
                            return objL;
                        }
                        return null;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair = (Pair) this.f223199c;
                    aVar2 = (id.a) this.f223198b;
                    str2 = (String) this.f223197a;
                    ResultKt.m(obj);
                }
                str3 = (String) obj;
                if (Intrinsics.areEqual(pair.second, str3)) {
                    return aVar2;
                }
                throw new JSONException("Invalid signature: " + str3 + ", " + pair.first + ", " + str2);
                if (((Boolean) obj).booleanValue()) {
                    com.planner5d.library.model.manager.config.p pVar3 = m1.this.f223195a;
                    com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.user;
                    this.f223200d = 2;
                    obj = pVar3.u(rVar3, "{}", this);
                    if (obj != objL) {
                        str = (String) obj;
                        if (str != null) {
                            m1 m1Var2 = m1.this;
                            aVar = new id.a(new JSONObject(str));
                            pairJ = aVar.j();
                            com.planner5d.library.model.manager.config.p pVar4 = m1Var2.f223195a;
                            com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.userSignature;
                            this.f223197a = str;
                            this.f223198b = aVar;
                            this.f223199c = pairJ;
                            this.f223200d = 3;
                            objU = pVar4.u(rVar4, com.planner5d.library.model.payments.a.f222474i, this);
                            if (objU != objL) {
                                str2 = str;
                                obj = objU;
                                aVar2 = aVar;
                                pair = pairJ;
                                str3 = (String) obj;
                                if (Intrinsics.areEqual(pair.second, str3)) {
                                    return aVar2;
                                }
                                throw new JSONException("Invalid signature: " + str3 + ", " + pair.first + ", " + str2);
                            }
                        }
                    }
                    return objL;
                }
            } catch (JSONException e10) {
                m1.this.g().v(new ij.c() { // from class: com.planner5d.library.modules.user.user.l1
                    @Override // ij.c
                    public final Object get() {
                        return m1.a.m(e10);
                    }
                });
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super id.a> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserStorage$oldStorageConvert$1", f = "UserStorage.kt", i = {2, 3, 4, 5, 7, 8, 8, 9, 9, 9, 10, 10, 10}, l = {com.planner5d.library.engine.input.f.b.f160725s, 76, com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.f160705l0, com.planner5d.library.engine.input.f.b.f160717p0, com.planner5d.library.engine.input.f.b.B0, 85, com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160696i0, 89, com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240", "user", "user", "paidDays", "user", "paidDays", "paidFrom", "user", "paidDays", "paidFrom"}, s = {"L$2", "L$2", "L$2", "L$2", "L$0", "L$0", "I$0", "L$0", "I$0", "J$0", "L$0", "I$0", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f223207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f223208g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m1.this.new b(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:24:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:27:0x0110 A[PHI: r14
          0x0110: PHI (r14v10 java.lang.Object) = (r14v9 java.lang.Object), (r14v0 java.lang.Object) binds: [B:25:0x010c, B:15:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x011d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0121  */
        /* JADX WARN: Code duplicated, block: B:34:0x0146  */
        /* JADX WARN: Code duplicated, block: B:38:0x016b  */
        /* JADX WARN: Code duplicated, block: B:42:0x018e  */
        /* JADX WARN: Code duplicated, block: B:45:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:46:0x01af  */
        /* JADX WARN: Code duplicated, block: B:50:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:53:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:54:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:58:0x0216  */
        /* JADX WARN: Code duplicated, block: B:62:0x024a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0259  */
        /* JADX WARN: Code duplicated, block: B:69:0x0280  */
        /* JADX WARN: Code duplicated, block: B:71:0x029a  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            id.a aVar;
            m1 m1Var;
            Object objU;
            m1 m1Var2;
            id.a aVar2;
            id.a aVar3;
            id.a aVar4;
            id.a aVar5;
            id.a aVar6;
            id.a aVar7;
            id.a aVar8;
            id.a aVar9;
            int iIntValue;
            Object objO;
            int i10;
            id.a aVar10;
            long jLongValue2;
            String strL;
            Object objU2;
            String str;
            id.a aVar11;
            long j10;
            fd.o.a aVar12;
            Object objP;
            fd.o.a aVar13;
            int i11;
            long j11;
            id.a aVar14;
            id.a aVar15;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            switch (this.f223208g) {
                case 0:
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.p pVar = m1.this.f223195a;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.user;
                    this.f223208g = 1;
                    obj = pVar.y(rVar, this);
                    if (obj != objL) {
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.f312394a;
                        }
                        com.planner5d.library.model.manager.config.p pVar2 = m1.this.f223195a;
                        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.userId;
                        this.f223208g = 2;
                        obj = pVar2.o(rVar2, 0L, this);
                        if (obj != objL) {
                            jLongValue = ((Number) obj).longValue();
                            if (jLongValue <= 0) {
                                return Unit.f312394a;
                            }
                            aVar = new id.a(jLongValue);
                            m1Var = m1.this;
                            com.planner5d.library.model.manager.config.p pVar3 = m1Var.f223195a;
                            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.userHash;
                            this.f223202a = aVar;
                            this.f223203b = m1Var;
                            this.f223204c = aVar;
                            this.f223205d = aVar;
                            this.f223208g = 3;
                            objU = pVar3.u(rVar3, null, this);
                            if (objU != objL) {
                                m1Var2 = m1Var;
                                aVar2 = aVar;
                                obj = objU;
                                aVar3 = aVar2;
                                aVar.f287077c = (String) obj;
                                com.planner5d.library.model.manager.config.p pVar4 = m1Var2.f223195a;
                                com.planner5d.library.services.r rVar4 = com.planner5d.library.services.r.userSupportHash;
                                this.f223202a = aVar2;
                                this.f223203b = m1Var2;
                                this.f223204c = aVar3;
                                this.f223205d = aVar3;
                                this.f223208g = 4;
                                obj = pVar4.u(rVar4, null, this);
                                if (obj != objL) {
                                    aVar4 = aVar3;
                                    aVar4.f287078d = (String) obj;
                                    com.planner5d.library.model.manager.config.p pVar5 = m1Var2.f223195a;
                                    com.planner5d.library.services.r rVar5 = com.planner5d.library.services.r.userName;
                                    this.f223202a = aVar2;
                                    this.f223203b = m1Var2;
                                    this.f223204c = aVar3;
                                    this.f223205d = aVar3;
                                    this.f223208g = 5;
                                    obj = pVar5.u(rVar5, null, this);
                                    if (obj != objL) {
                                        aVar5 = aVar3;
                                        aVar5.f287076b = (String) obj;
                                        com.planner5d.library.model.manager.config.p pVar6 = m1Var2.f223195a;
                                        com.planner5d.library.services.r rVar6 = com.planner5d.library.services.r.userEmail;
                                        this.f223202a = aVar2;
                                        this.f223203b = m1Var2;
                                        this.f223204c = aVar3;
                                        this.f223205d = aVar3;
                                        this.f223208g = 6;
                                        obj = pVar6.u(rVar6, null, this);
                                        if (obj == objL) {
                                            aVar6 = aVar3;
                                            aVar6.f287079e = (String) obj;
                                            com.planner5d.library.model.manager.config.p pVar7 = m1Var2.f223195a;
                                            com.planner5d.library.services.r rVar7 = com.planner5d.library.services.r.userImage;
                                            this.f223202a = aVar2;
                                            this.f223203b = aVar3;
                                            this.f223204c = null;
                                            this.f223205d = null;
                                            this.f223208g = 7;
                                            obj = pVar7.u(rVar7, null, this);
                                            if (obj != objL) {
                                                aVar7 = aVar3;
                                                aVar8 = aVar2;
                                                aVar7.f287080f = (String) obj;
                                                com.planner5d.library.model.manager.config.p pVar8 = m1.this.f223195a;
                                                com.planner5d.library.services.r rVar8 = com.planner5d.library.services.r.userPaidDays;
                                                this.f223202a = aVar8;
                                                this.f223203b = null;
                                                this.f223208g = 8;
                                                obj = pVar8.p(rVar8, 0, this);
                                                if (obj == objL) {
                                                    aVar9 = aVar8;
                                                    iIntValue = ((Number) obj).intValue();
                                                    com.planner5d.library.model.manager.config.p pVar9 = m1.this.f223195a;
                                                    com.planner5d.library.services.r rVar9 = com.planner5d.library.services.r.userPaidFrom;
                                                    this.f223202a = aVar9;
                                                    this.f223206e = iIntValue;
                                                    this.f223208g = 9;
                                                    objO = pVar9.o(rVar9, 0L, this);
                                                    if (objO != objL) {
                                                        id.a aVar16 = aVar9;
                                                        i10 = iIntValue;
                                                        obj = objO;
                                                        aVar10 = aVar16;
                                                        jLongValue2 = ((Number) obj).longValue();
                                                        strL = m1.this.l(aVar10, jLongValue2, i10);
                                                        com.planner5d.library.model.manager.config.p pVar10 = m1.this.f223195a;
                                                        com.planner5d.library.services.r rVar10 = com.planner5d.library.services.r.userPaidHash;
                                                        this.f223202a = aVar10;
                                                        this.f223203b = strL;
                                                        this.f223206e = i10;
                                                        this.f223207f = jLongValue2;
                                                        this.f223208g = 10;
                                                        objU2 = pVar10.u(rVar10, null, this);
                                                        if (objU2 != objL) {
                                                            str = strL;
                                                            obj = objU2;
                                                            aVar11 = aVar10;
                                                            j10 = jLongValue2;
                                                            if (Intrinsics.areEqual(str, obj)) {
                                                                aVar12 = fd.o.f275196f;
                                                                com.planner5d.library.model.manager.config.p pVar11 = m1.this.f223195a;
                                                                com.planner5d.library.services.r rVar11 = com.planner5d.library.services.r.userPaidSnapshots;
                                                                this.f223202a = aVar11;
                                                                this.f223203b = aVar11;
                                                                this.f223204c = aVar12;
                                                                this.f223206e = i10;
                                                                this.f223207f = j10;
                                                                this.f223208g = 11;
                                                                objP = pVar11.p(rVar11, 0, this);
                                                                if (objP != objL) {
                                                                    long j12 = j10;
                                                                    aVar13 = aVar12;
                                                                    obj = objP;
                                                                    i11 = i10;
                                                                    j11 = j12;
                                                                    aVar14 = aVar11;
                                                                    aVar15 = aVar14;
                                                                    aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                                    aVar11 = aVar15;
                                                                }
                                                            } else {
                                                                aVar11.h(fd.o.f275196f.b());
                                                            }
                                                            m1.this.m(aVar11);
                                                            return Unit.f312394a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 1:
                    ResultKt.m(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.f312394a;
                    }
                    com.planner5d.library.model.manager.config.p pVar12 = m1.this.f223195a;
                    com.planner5d.library.services.r rVar12 = com.planner5d.library.services.r.userId;
                    this.f223208g = 2;
                    obj = pVar12.o(rVar12, 0L, this);
                    if (obj != objL) {
                        jLongValue = ((Number) obj).longValue();
                        if (jLongValue <= 0) {
                            return Unit.f312394a;
                        }
                        aVar = new id.a(jLongValue);
                        m1Var = m1.this;
                        com.planner5d.library.model.manager.config.p pVar13 = m1Var.f223195a;
                        com.planner5d.library.services.r rVar13 = com.planner5d.library.services.r.userHash;
                        this.f223202a = aVar;
                        this.f223203b = m1Var;
                        this.f223204c = aVar;
                        this.f223205d = aVar;
                        this.f223208g = 3;
                        objU = pVar13.u(rVar13, null, this);
                        if (objU != objL) {
                            m1Var2 = m1Var;
                            aVar2 = aVar;
                            obj = objU;
                            aVar3 = aVar2;
                            aVar.f287077c = (String) obj;
                            com.planner5d.library.model.manager.config.p pVar14 = m1Var2.f223195a;
                            com.planner5d.library.services.r rVar14 = com.planner5d.library.services.r.userSupportHash;
                            this.f223202a = aVar2;
                            this.f223203b = m1Var2;
                            this.f223204c = aVar3;
                            this.f223205d = aVar3;
                            this.f223208g = 4;
                            obj = pVar14.u(rVar14, null, this);
                            if (obj != objL) {
                                aVar4 = aVar3;
                                aVar4.f287078d = (String) obj;
                                com.planner5d.library.model.manager.config.p pVar15 = m1Var2.f223195a;
                                com.planner5d.library.services.r rVar15 = com.planner5d.library.services.r.userName;
                                this.f223202a = aVar2;
                                this.f223203b = m1Var2;
                                this.f223204c = aVar3;
                                this.f223205d = aVar3;
                                this.f223208g = 5;
                                obj = pVar15.u(rVar15, null, this);
                                if (obj != objL) {
                                    aVar5 = aVar3;
                                    aVar5.f287076b = (String) obj;
                                    com.planner5d.library.model.manager.config.p pVar16 = m1Var2.f223195a;
                                    com.planner5d.library.services.r rVar16 = com.planner5d.library.services.r.userEmail;
                                    this.f223202a = aVar2;
                                    this.f223203b = m1Var2;
                                    this.f223204c = aVar3;
                                    this.f223205d = aVar3;
                                    this.f223208g = 6;
                                    obj = pVar16.u(rVar16, null, this);
                                    if (obj == objL) {
                                        aVar6 = aVar3;
                                        aVar6.f287079e = (String) obj;
                                        com.planner5d.library.model.manager.config.p pVar17 = m1Var2.f223195a;
                                        com.planner5d.library.services.r rVar17 = com.planner5d.library.services.r.userImage;
                                        this.f223202a = aVar2;
                                        this.f223203b = aVar3;
                                        this.f223204c = null;
                                        this.f223205d = null;
                                        this.f223208g = 7;
                                        obj = pVar17.u(rVar17, null, this);
                                        if (obj != objL) {
                                            aVar7 = aVar3;
                                            aVar8 = aVar2;
                                            aVar7.f287080f = (String) obj;
                                            com.planner5d.library.model.manager.config.p pVar18 = m1.this.f223195a;
                                            com.planner5d.library.services.r rVar18 = com.planner5d.library.services.r.userPaidDays;
                                            this.f223202a = aVar8;
                                            this.f223203b = null;
                                            this.f223208g = 8;
                                            obj = pVar18.p(rVar18, 0, this);
                                            if (obj == objL) {
                                                aVar9 = aVar8;
                                                iIntValue = ((Number) obj).intValue();
                                                com.planner5d.library.model.manager.config.p pVar19 = m1.this.f223195a;
                                                com.planner5d.library.services.r rVar19 = com.planner5d.library.services.r.userPaidFrom;
                                                this.f223202a = aVar9;
                                                this.f223206e = iIntValue;
                                                this.f223208g = 9;
                                                objO = pVar19.o(rVar19, 0L, this);
                                                if (objO != objL) {
                                                    id.a aVar17 = aVar9;
                                                    i10 = iIntValue;
                                                    obj = objO;
                                                    aVar10 = aVar17;
                                                    jLongValue2 = ((Number) obj).longValue();
                                                    strL = m1.this.l(aVar10, jLongValue2, i10);
                                                    com.planner5d.library.model.manager.config.p pVar110 = m1.this.f223195a;
                                                    com.planner5d.library.services.r rVar110 = com.planner5d.library.services.r.userPaidHash;
                                                    this.f223202a = aVar10;
                                                    this.f223203b = strL;
                                                    this.f223206e = i10;
                                                    this.f223207f = jLongValue2;
                                                    this.f223208g = 10;
                                                    objU2 = pVar110.u(rVar110, null, this);
                                                    if (objU2 != objL) {
                                                        str = strL;
                                                        obj = objU2;
                                                        aVar11 = aVar10;
                                                        j10 = jLongValue2;
                                                        if (Intrinsics.areEqual(str, obj)) {
                                                            aVar12 = fd.o.f275196f;
                                                            com.planner5d.library.model.manager.config.p pVar111 = m1.this.f223195a;
                                                            com.planner5d.library.services.r rVar111 = com.planner5d.library.services.r.userPaidSnapshots;
                                                            this.f223202a = aVar11;
                                                            this.f223203b = aVar11;
                                                            this.f223204c = aVar12;
                                                            this.f223206e = i10;
                                                            this.f223207f = j10;
                                                            this.f223208g = 11;
                                                            objP = pVar111.p(rVar111, 0, this);
                                                            if (objP != objL) {
                                                                long j13 = j10;
                                                                aVar13 = aVar12;
                                                                obj = objP;
                                                                i11 = i10;
                                                                j11 = j13;
                                                                aVar14 = aVar11;
                                                                aVar15 = aVar14;
                                                                aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                                aVar11 = aVar15;
                                                            }
                                                        } else {
                                                            aVar11.h(fd.o.f275196f.b());
                                                        }
                                                        m1.this.m(aVar11);
                                                        return Unit.f312394a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 2:
                    ResultKt.m(obj);
                    jLongValue = ((Number) obj).longValue();
                    if (jLongValue <= 0) {
                        return Unit.f312394a;
                    }
                    aVar = new id.a(jLongValue);
                    m1Var = m1.this;
                    com.planner5d.library.model.manager.config.p pVar112 = m1Var.f223195a;
                    com.planner5d.library.services.r rVar112 = com.planner5d.library.services.r.userHash;
                    this.f223202a = aVar;
                    this.f223203b = m1Var;
                    this.f223204c = aVar;
                    this.f223205d = aVar;
                    this.f223208g = 3;
                    objU = pVar112.u(rVar112, null, this);
                    if (objU != objL) {
                        m1Var2 = m1Var;
                        aVar2 = aVar;
                        obj = objU;
                        aVar3 = aVar2;
                        aVar.f287077c = (String) obj;
                        com.planner5d.library.model.manager.config.p pVar113 = m1Var2.f223195a;
                        com.planner5d.library.services.r rVar113 = com.planner5d.library.services.r.userSupportHash;
                        this.f223202a = aVar2;
                        this.f223203b = m1Var2;
                        this.f223204c = aVar3;
                        this.f223205d = aVar3;
                        this.f223208g = 4;
                        obj = pVar113.u(rVar113, null, this);
                        if (obj != objL) {
                            aVar4 = aVar3;
                            aVar4.f287078d = (String) obj;
                            com.planner5d.library.model.manager.config.p pVar114 = m1Var2.f223195a;
                            com.planner5d.library.services.r rVar114 = com.planner5d.library.services.r.userName;
                            this.f223202a = aVar2;
                            this.f223203b = m1Var2;
                            this.f223204c = aVar3;
                            this.f223205d = aVar3;
                            this.f223208g = 5;
                            obj = pVar114.u(rVar114, null, this);
                            if (obj != objL) {
                                aVar5 = aVar3;
                                aVar5.f287076b = (String) obj;
                                com.planner5d.library.model.manager.config.p pVar115 = m1Var2.f223195a;
                                com.planner5d.library.services.r rVar115 = com.planner5d.library.services.r.userEmail;
                                this.f223202a = aVar2;
                                this.f223203b = m1Var2;
                                this.f223204c = aVar3;
                                this.f223205d = aVar3;
                                this.f223208g = 6;
                                obj = pVar115.u(rVar115, null, this);
                                if (obj == objL) {
                                    aVar6 = aVar3;
                                    aVar6.f287079e = (String) obj;
                                    com.planner5d.library.model.manager.config.p pVar116 = m1Var2.f223195a;
                                    com.planner5d.library.services.r rVar116 = com.planner5d.library.services.r.userImage;
                                    this.f223202a = aVar2;
                                    this.f223203b = aVar3;
                                    this.f223204c = null;
                                    this.f223205d = null;
                                    this.f223208g = 7;
                                    obj = pVar116.u(rVar116, null, this);
                                    if (obj != objL) {
                                        aVar7 = aVar3;
                                        aVar8 = aVar2;
                                        aVar7.f287080f = (String) obj;
                                        com.planner5d.library.model.manager.config.p pVar117 = m1.this.f223195a;
                                        com.planner5d.library.services.r rVar117 = com.planner5d.library.services.r.userPaidDays;
                                        this.f223202a = aVar8;
                                        this.f223203b = null;
                                        this.f223208g = 8;
                                        obj = pVar117.p(rVar117, 0, this);
                                        if (obj == objL) {
                                            aVar9 = aVar8;
                                            iIntValue = ((Number) obj).intValue();
                                            com.planner5d.library.model.manager.config.p pVar118 = m1.this.f223195a;
                                            com.planner5d.library.services.r rVar118 = com.planner5d.library.services.r.userPaidFrom;
                                            this.f223202a = aVar9;
                                            this.f223206e = iIntValue;
                                            this.f223208g = 9;
                                            objO = pVar118.o(rVar118, 0L, this);
                                            if (objO != objL) {
                                                id.a aVar18 = aVar9;
                                                i10 = iIntValue;
                                                obj = objO;
                                                aVar10 = aVar18;
                                                jLongValue2 = ((Number) obj).longValue();
                                                strL = m1.this.l(aVar10, jLongValue2, i10);
                                                com.planner5d.library.model.manager.config.p pVar119 = m1.this.f223195a;
                                                com.planner5d.library.services.r rVar119 = com.planner5d.library.services.r.userPaidHash;
                                                this.f223202a = aVar10;
                                                this.f223203b = strL;
                                                this.f223206e = i10;
                                                this.f223207f = jLongValue2;
                                                this.f223208g = 10;
                                                objU2 = pVar119.u(rVar119, null, this);
                                                if (objU2 != objL) {
                                                    str = strL;
                                                    obj = objU2;
                                                    aVar11 = aVar10;
                                                    j10 = jLongValue2;
                                                    if (Intrinsics.areEqual(str, obj)) {
                                                        aVar12 = fd.o.f275196f;
                                                        com.planner5d.library.model.manager.config.p pVar1110 = m1.this.f223195a;
                                                        com.planner5d.library.services.r rVar1110 = com.planner5d.library.services.r.userPaidSnapshots;
                                                        this.f223202a = aVar11;
                                                        this.f223203b = aVar11;
                                                        this.f223204c = aVar12;
                                                        this.f223206e = i10;
                                                        this.f223207f = j10;
                                                        this.f223208g = 11;
                                                        objP = pVar1110.p(rVar1110, 0, this);
                                                        if (objP != objL) {
                                                            long j14 = j10;
                                                            aVar13 = aVar12;
                                                            obj = objP;
                                                            i11 = i10;
                                                            j11 = j14;
                                                            aVar14 = aVar11;
                                                            aVar15 = aVar14;
                                                            aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                            aVar11 = aVar15;
                                                        }
                                                    } else {
                                                        aVar11.h(fd.o.f275196f.b());
                                                    }
                                                    m1.this.m(aVar11);
                                                    return Unit.f312394a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 3:
                    aVar = (id.a) this.f223205d;
                    aVar3 = (id.a) this.f223204c;
                    m1Var2 = (m1) this.f223203b;
                    aVar2 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar.f287077c = (String) obj;
                    com.planner5d.library.model.manager.config.p pVar1111 = m1Var2.f223195a;
                    com.planner5d.library.services.r rVar1111 = com.planner5d.library.services.r.userSupportHash;
                    this.f223202a = aVar2;
                    this.f223203b = m1Var2;
                    this.f223204c = aVar3;
                    this.f223205d = aVar3;
                    this.f223208g = 4;
                    obj = pVar1111.u(rVar1111, null, this);
                    if (obj != objL) {
                        aVar4 = aVar3;
                        aVar4.f287078d = (String) obj;
                        com.planner5d.library.model.manager.config.p pVar1112 = m1Var2.f223195a;
                        com.planner5d.library.services.r rVar1112 = com.planner5d.library.services.r.userName;
                        this.f223202a = aVar2;
                        this.f223203b = m1Var2;
                        this.f223204c = aVar3;
                        this.f223205d = aVar3;
                        this.f223208g = 5;
                        obj = pVar1112.u(rVar1112, null, this);
                        if (obj != objL) {
                            aVar5 = aVar3;
                            aVar5.f287076b = (String) obj;
                            com.planner5d.library.model.manager.config.p pVar1113 = m1Var2.f223195a;
                            com.planner5d.library.services.r rVar1113 = com.planner5d.library.services.r.userEmail;
                            this.f223202a = aVar2;
                            this.f223203b = m1Var2;
                            this.f223204c = aVar3;
                            this.f223205d = aVar3;
                            this.f223208g = 6;
                            obj = pVar1113.u(rVar1113, null, this);
                            if (obj == objL) {
                                aVar6 = aVar3;
                                aVar6.f287079e = (String) obj;
                                com.planner5d.library.model.manager.config.p pVar1114 = m1Var2.f223195a;
                                com.planner5d.library.services.r rVar1114 = com.planner5d.library.services.r.userImage;
                                this.f223202a = aVar2;
                                this.f223203b = aVar3;
                                this.f223204c = null;
                                this.f223205d = null;
                                this.f223208g = 7;
                                obj = pVar1114.u(rVar1114, null, this);
                                if (obj != objL) {
                                    aVar7 = aVar3;
                                    aVar8 = aVar2;
                                    aVar7.f287080f = (String) obj;
                                    com.planner5d.library.model.manager.config.p pVar1115 = m1.this.f223195a;
                                    com.planner5d.library.services.r rVar1115 = com.planner5d.library.services.r.userPaidDays;
                                    this.f223202a = aVar8;
                                    this.f223203b = null;
                                    this.f223208g = 8;
                                    obj = pVar1115.p(rVar1115, 0, this);
                                    if (obj == objL) {
                                        aVar9 = aVar8;
                                        iIntValue = ((Number) obj).intValue();
                                        com.planner5d.library.model.manager.config.p pVar1116 = m1.this.f223195a;
                                        com.planner5d.library.services.r rVar1116 = com.planner5d.library.services.r.userPaidFrom;
                                        this.f223202a = aVar9;
                                        this.f223206e = iIntValue;
                                        this.f223208g = 9;
                                        objO = pVar1116.o(rVar1116, 0L, this);
                                        if (objO != objL) {
                                            id.a aVar19 = aVar9;
                                            i10 = iIntValue;
                                            obj = objO;
                                            aVar10 = aVar19;
                                            jLongValue2 = ((Number) obj).longValue();
                                            strL = m1.this.l(aVar10, jLongValue2, i10);
                                            com.planner5d.library.model.manager.config.p pVar1117 = m1.this.f223195a;
                                            com.planner5d.library.services.r rVar1117 = com.planner5d.library.services.r.userPaidHash;
                                            this.f223202a = aVar10;
                                            this.f223203b = strL;
                                            this.f223206e = i10;
                                            this.f223207f = jLongValue2;
                                            this.f223208g = 10;
                                            objU2 = pVar1117.u(rVar1117, null, this);
                                            if (objU2 != objL) {
                                                str = strL;
                                                obj = objU2;
                                                aVar11 = aVar10;
                                                j10 = jLongValue2;
                                                if (Intrinsics.areEqual(str, obj)) {
                                                    aVar12 = fd.o.f275196f;
                                                    com.planner5d.library.model.manager.config.p pVar1118 = m1.this.f223195a;
                                                    com.planner5d.library.services.r rVar1118 = com.planner5d.library.services.r.userPaidSnapshots;
                                                    this.f223202a = aVar11;
                                                    this.f223203b = aVar11;
                                                    this.f223204c = aVar12;
                                                    this.f223206e = i10;
                                                    this.f223207f = j10;
                                                    this.f223208g = 11;
                                                    objP = pVar1118.p(rVar1118, 0, this);
                                                    if (objP != objL) {
                                                        long j15 = j10;
                                                        aVar13 = aVar12;
                                                        obj = objP;
                                                        i11 = i10;
                                                        j11 = j15;
                                                        aVar14 = aVar11;
                                                        aVar15 = aVar14;
                                                        aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                        aVar11 = aVar15;
                                                    }
                                                } else {
                                                    aVar11.h(fd.o.f275196f.b());
                                                }
                                                m1.this.m(aVar11);
                                                return Unit.f312394a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 4:
                    aVar4 = (id.a) this.f223205d;
                    aVar3 = (id.a) this.f223204c;
                    m1Var2 = (m1) this.f223203b;
                    aVar2 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar4.f287078d = (String) obj;
                    com.planner5d.library.model.manager.config.p pVar1119 = m1Var2.f223195a;
                    com.planner5d.library.services.r rVar1119 = com.planner5d.library.services.r.userName;
                    this.f223202a = aVar2;
                    this.f223203b = m1Var2;
                    this.f223204c = aVar3;
                    this.f223205d = aVar3;
                    this.f223208g = 5;
                    obj = pVar1119.u(rVar1119, null, this);
                    if (obj != objL) {
                        aVar5 = aVar3;
                        aVar5.f287076b = (String) obj;
                        com.planner5d.library.model.manager.config.p pVar11110 = m1Var2.f223195a;
                        com.planner5d.library.services.r rVar11110 = com.planner5d.library.services.r.userEmail;
                        this.f223202a = aVar2;
                        this.f223203b = m1Var2;
                        this.f223204c = aVar3;
                        this.f223205d = aVar3;
                        this.f223208g = 6;
                        obj = pVar11110.u(rVar11110, null, this);
                        if (obj == objL) {
                            aVar6 = aVar3;
                            aVar6.f287079e = (String) obj;
                            com.planner5d.library.model.manager.config.p pVar11111 = m1Var2.f223195a;
                            com.planner5d.library.services.r rVar11111 = com.planner5d.library.services.r.userImage;
                            this.f223202a = aVar2;
                            this.f223203b = aVar3;
                            this.f223204c = null;
                            this.f223205d = null;
                            this.f223208g = 7;
                            obj = pVar11111.u(rVar11111, null, this);
                            if (obj != objL) {
                                aVar7 = aVar3;
                                aVar8 = aVar2;
                                aVar7.f287080f = (String) obj;
                                com.planner5d.library.model.manager.config.p pVar11112 = m1.this.f223195a;
                                com.planner5d.library.services.r rVar11112 = com.planner5d.library.services.r.userPaidDays;
                                this.f223202a = aVar8;
                                this.f223203b = null;
                                this.f223208g = 8;
                                obj = pVar11112.p(rVar11112, 0, this);
                                if (obj == objL) {
                                    aVar9 = aVar8;
                                    iIntValue = ((Number) obj).intValue();
                                    com.planner5d.library.model.manager.config.p pVar11113 = m1.this.f223195a;
                                    com.planner5d.library.services.r rVar11113 = com.planner5d.library.services.r.userPaidFrom;
                                    this.f223202a = aVar9;
                                    this.f223206e = iIntValue;
                                    this.f223208g = 9;
                                    objO = pVar11113.o(rVar11113, 0L, this);
                                    if (objO != objL) {
                                        id.a aVar110 = aVar9;
                                        i10 = iIntValue;
                                        obj = objO;
                                        aVar10 = aVar110;
                                        jLongValue2 = ((Number) obj).longValue();
                                        strL = m1.this.l(aVar10, jLongValue2, i10);
                                        com.planner5d.library.model.manager.config.p pVar11114 = m1.this.f223195a;
                                        com.planner5d.library.services.r rVar11114 = com.planner5d.library.services.r.userPaidHash;
                                        this.f223202a = aVar10;
                                        this.f223203b = strL;
                                        this.f223206e = i10;
                                        this.f223207f = jLongValue2;
                                        this.f223208g = 10;
                                        objU2 = pVar11114.u(rVar11114, null, this);
                                        if (objU2 != objL) {
                                            str = strL;
                                            obj = objU2;
                                            aVar11 = aVar10;
                                            j10 = jLongValue2;
                                            if (Intrinsics.areEqual(str, obj)) {
                                                aVar12 = fd.o.f275196f;
                                                com.planner5d.library.model.manager.config.p pVar11115 = m1.this.f223195a;
                                                com.planner5d.library.services.r rVar11115 = com.planner5d.library.services.r.userPaidSnapshots;
                                                this.f223202a = aVar11;
                                                this.f223203b = aVar11;
                                                this.f223204c = aVar12;
                                                this.f223206e = i10;
                                                this.f223207f = j10;
                                                this.f223208g = 11;
                                                objP = pVar11115.p(rVar11115, 0, this);
                                                if (objP != objL) {
                                                    long j16 = j10;
                                                    aVar13 = aVar12;
                                                    obj = objP;
                                                    i11 = i10;
                                                    j11 = j16;
                                                    aVar14 = aVar11;
                                                    aVar15 = aVar14;
                                                    aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                    aVar11 = aVar15;
                                                }
                                            } else {
                                                aVar11.h(fd.o.f275196f.b());
                                            }
                                            m1.this.m(aVar11);
                                            return Unit.f312394a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 5:
                    aVar5 = (id.a) this.f223205d;
                    aVar3 = (id.a) this.f223204c;
                    m1Var2 = (m1) this.f223203b;
                    aVar2 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar5.f287076b = (String) obj;
                    com.planner5d.library.model.manager.config.p pVar11116 = m1Var2.f223195a;
                    com.planner5d.library.services.r rVar11116 = com.planner5d.library.services.r.userEmail;
                    this.f223202a = aVar2;
                    this.f223203b = m1Var2;
                    this.f223204c = aVar3;
                    this.f223205d = aVar3;
                    this.f223208g = 6;
                    obj = pVar11116.u(rVar11116, null, this);
                    if (obj == objL) {
                        aVar6 = aVar3;
                        aVar6.f287079e = (String) obj;
                        com.planner5d.library.model.manager.config.p pVar11117 = m1Var2.f223195a;
                        com.planner5d.library.services.r rVar11117 = com.planner5d.library.services.r.userImage;
                        this.f223202a = aVar2;
                        this.f223203b = aVar3;
                        this.f223204c = null;
                        this.f223205d = null;
                        this.f223208g = 7;
                        obj = pVar11117.u(rVar11117, null, this);
                        if (obj != objL) {
                            aVar7 = aVar3;
                            aVar8 = aVar2;
                            aVar7.f287080f = (String) obj;
                            com.planner5d.library.model.manager.config.p pVar11118 = m1.this.f223195a;
                            com.planner5d.library.services.r rVar11118 = com.planner5d.library.services.r.userPaidDays;
                            this.f223202a = aVar8;
                            this.f223203b = null;
                            this.f223208g = 8;
                            obj = pVar11118.p(rVar11118, 0, this);
                            if (obj == objL) {
                                aVar9 = aVar8;
                                iIntValue = ((Number) obj).intValue();
                                com.planner5d.library.model.manager.config.p pVar11119 = m1.this.f223195a;
                                com.planner5d.library.services.r rVar11119 = com.planner5d.library.services.r.userPaidFrom;
                                this.f223202a = aVar9;
                                this.f223206e = iIntValue;
                                this.f223208g = 9;
                                objO = pVar11119.o(rVar11119, 0L, this);
                                if (objO != objL) {
                                    id.a aVar111 = aVar9;
                                    i10 = iIntValue;
                                    obj = objO;
                                    aVar10 = aVar111;
                                    jLongValue2 = ((Number) obj).longValue();
                                    strL = m1.this.l(aVar10, jLongValue2, i10);
                                    com.planner5d.library.model.manager.config.p pVar111110 = m1.this.f223195a;
                                    com.planner5d.library.services.r rVar111110 = com.planner5d.library.services.r.userPaidHash;
                                    this.f223202a = aVar10;
                                    this.f223203b = strL;
                                    this.f223206e = i10;
                                    this.f223207f = jLongValue2;
                                    this.f223208g = 10;
                                    objU2 = pVar111110.u(rVar111110, null, this);
                                    if (objU2 != objL) {
                                        str = strL;
                                        obj = objU2;
                                        aVar11 = aVar10;
                                        j10 = jLongValue2;
                                        if (Intrinsics.areEqual(str, obj)) {
                                            aVar12 = fd.o.f275196f;
                                            com.planner5d.library.model.manager.config.p pVar111111 = m1.this.f223195a;
                                            com.planner5d.library.services.r rVar111111 = com.planner5d.library.services.r.userPaidSnapshots;
                                            this.f223202a = aVar11;
                                            this.f223203b = aVar11;
                                            this.f223204c = aVar12;
                                            this.f223206e = i10;
                                            this.f223207f = j10;
                                            this.f223208g = 11;
                                            objP = pVar111111.p(rVar111111, 0, this);
                                            if (objP != objL) {
                                                long j17 = j10;
                                                aVar13 = aVar12;
                                                obj = objP;
                                                i11 = i10;
                                                j11 = j17;
                                                aVar14 = aVar11;
                                                aVar15 = aVar14;
                                                aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                                aVar11 = aVar15;
                                            }
                                        } else {
                                            aVar11.h(fd.o.f275196f.b());
                                        }
                                        m1.this.m(aVar11);
                                        return Unit.f312394a;
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 6:
                    aVar6 = (id.a) this.f223205d;
                    aVar3 = (id.a) this.f223204c;
                    m1Var2 = (m1) this.f223203b;
                    aVar2 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar6.f287079e = (String) obj;
                    com.planner5d.library.model.manager.config.p pVar111112 = m1Var2.f223195a;
                    com.planner5d.library.services.r rVar111112 = com.planner5d.library.services.r.userImage;
                    this.f223202a = aVar2;
                    this.f223203b = aVar3;
                    this.f223204c = null;
                    this.f223205d = null;
                    this.f223208g = 7;
                    obj = pVar111112.u(rVar111112, null, this);
                    if (obj != objL) {
                        aVar7 = aVar3;
                        aVar8 = aVar2;
                        aVar7.f287080f = (String) obj;
                        com.planner5d.library.model.manager.config.p pVar111113 = m1.this.f223195a;
                        com.planner5d.library.services.r rVar111113 = com.planner5d.library.services.r.userPaidDays;
                        this.f223202a = aVar8;
                        this.f223203b = null;
                        this.f223208g = 8;
                        obj = pVar111113.p(rVar111113, 0, this);
                        if (obj == objL) {
                            aVar9 = aVar8;
                            iIntValue = ((Number) obj).intValue();
                            com.planner5d.library.model.manager.config.p pVar111114 = m1.this.f223195a;
                            com.planner5d.library.services.r rVar111114 = com.planner5d.library.services.r.userPaidFrom;
                            this.f223202a = aVar9;
                            this.f223206e = iIntValue;
                            this.f223208g = 9;
                            objO = pVar111114.o(rVar111114, 0L, this);
                            if (objO != objL) {
                                id.a aVar112 = aVar9;
                                i10 = iIntValue;
                                obj = objO;
                                aVar10 = aVar112;
                                jLongValue2 = ((Number) obj).longValue();
                                strL = m1.this.l(aVar10, jLongValue2, i10);
                                com.planner5d.library.model.manager.config.p pVar111115 = m1.this.f223195a;
                                com.planner5d.library.services.r rVar111115 = com.planner5d.library.services.r.userPaidHash;
                                this.f223202a = aVar10;
                                this.f223203b = strL;
                                this.f223206e = i10;
                                this.f223207f = jLongValue2;
                                this.f223208g = 10;
                                objU2 = pVar111115.u(rVar111115, null, this);
                                if (objU2 != objL) {
                                    str = strL;
                                    obj = objU2;
                                    aVar11 = aVar10;
                                    j10 = jLongValue2;
                                    if (Intrinsics.areEqual(str, obj)) {
                                        aVar12 = fd.o.f275196f;
                                        com.planner5d.library.model.manager.config.p pVar111116 = m1.this.f223195a;
                                        com.planner5d.library.services.r rVar111116 = com.planner5d.library.services.r.userPaidSnapshots;
                                        this.f223202a = aVar11;
                                        this.f223203b = aVar11;
                                        this.f223204c = aVar12;
                                        this.f223206e = i10;
                                        this.f223207f = j10;
                                        this.f223208g = 11;
                                        objP = pVar111116.p(rVar111116, 0, this);
                                        if (objP != objL) {
                                            long j18 = j10;
                                            aVar13 = aVar12;
                                            obj = objP;
                                            i11 = i10;
                                            j11 = j18;
                                            aVar14 = aVar11;
                                            aVar15 = aVar14;
                                            aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                            aVar11 = aVar15;
                                        }
                                    } else {
                                        aVar11.h(fd.o.f275196f.b());
                                    }
                                    m1.this.m(aVar11);
                                    return Unit.f312394a;
                                }
                            }
                        }
                    }
                    return objL;
                case 7:
                    aVar7 = (id.a) this.f223203b;
                    aVar8 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar7.f287080f = (String) obj;
                    com.planner5d.library.model.manager.config.p pVar111117 = m1.this.f223195a;
                    com.planner5d.library.services.r rVar111117 = com.planner5d.library.services.r.userPaidDays;
                    this.f223202a = aVar8;
                    this.f223203b = null;
                    this.f223208g = 8;
                    obj = pVar111117.p(rVar111117, 0, this);
                    if (obj == objL) {
                        aVar9 = aVar8;
                        iIntValue = ((Number) obj).intValue();
                        com.planner5d.library.model.manager.config.p pVar111118 = m1.this.f223195a;
                        com.planner5d.library.services.r rVar111118 = com.planner5d.library.services.r.userPaidFrom;
                        this.f223202a = aVar9;
                        this.f223206e = iIntValue;
                        this.f223208g = 9;
                        objO = pVar111118.o(rVar111118, 0L, this);
                        if (objO != objL) {
                            id.a aVar113 = aVar9;
                            i10 = iIntValue;
                            obj = objO;
                            aVar10 = aVar113;
                            jLongValue2 = ((Number) obj).longValue();
                            strL = m1.this.l(aVar10, jLongValue2, i10);
                            com.planner5d.library.model.manager.config.p pVar111119 = m1.this.f223195a;
                            com.planner5d.library.services.r rVar111119 = com.planner5d.library.services.r.userPaidHash;
                            this.f223202a = aVar10;
                            this.f223203b = strL;
                            this.f223206e = i10;
                            this.f223207f = jLongValue2;
                            this.f223208g = 10;
                            objU2 = pVar111119.u(rVar111119, null, this);
                            if (objU2 != objL) {
                                str = strL;
                                obj = objU2;
                                aVar11 = aVar10;
                                j10 = jLongValue2;
                                if (Intrinsics.areEqual(str, obj)) {
                                    aVar12 = fd.o.f275196f;
                                    com.planner5d.library.model.manager.config.p pVar1111110 = m1.this.f223195a;
                                    com.planner5d.library.services.r rVar1111110 = com.planner5d.library.services.r.userPaidSnapshots;
                                    this.f223202a = aVar11;
                                    this.f223203b = aVar11;
                                    this.f223204c = aVar12;
                                    this.f223206e = i10;
                                    this.f223207f = j10;
                                    this.f223208g = 11;
                                    objP = pVar1111110.p(rVar1111110, 0, this);
                                    if (objP != objL) {
                                        long j19 = j10;
                                        aVar13 = aVar12;
                                        obj = objP;
                                        i11 = i10;
                                        j11 = j19;
                                        aVar14 = aVar11;
                                        aVar15 = aVar14;
                                        aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                        aVar11 = aVar15;
                                    }
                                } else {
                                    aVar11.h(fd.o.f275196f.b());
                                }
                                m1.this.m(aVar11);
                                return Unit.f312394a;
                            }
                        }
                    }
                    return objL;
                case 8:
                    aVar9 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    iIntValue = ((Number) obj).intValue();
                    com.planner5d.library.model.manager.config.p pVar1111111 = m1.this.f223195a;
                    com.planner5d.library.services.r rVar1111111 = com.planner5d.library.services.r.userPaidFrom;
                    this.f223202a = aVar9;
                    this.f223206e = iIntValue;
                    this.f223208g = 9;
                    objO = pVar1111111.o(rVar1111111, 0L, this);
                    if (objO != objL) {
                        id.a aVar114 = aVar9;
                        i10 = iIntValue;
                        obj = objO;
                        aVar10 = aVar114;
                        jLongValue2 = ((Number) obj).longValue();
                        strL = m1.this.l(aVar10, jLongValue2, i10);
                        com.planner5d.library.model.manager.config.p pVar1111112 = m1.this.f223195a;
                        com.planner5d.library.services.r rVar1111112 = com.planner5d.library.services.r.userPaidHash;
                        this.f223202a = aVar10;
                        this.f223203b = strL;
                        this.f223206e = i10;
                        this.f223207f = jLongValue2;
                        this.f223208g = 10;
                        objU2 = pVar1111112.u(rVar1111112, null, this);
                        if (objU2 != objL) {
                            str = strL;
                            obj = objU2;
                            aVar11 = aVar10;
                            j10 = jLongValue2;
                            if (Intrinsics.areEqual(str, obj)) {
                                aVar12 = fd.o.f275196f;
                                com.planner5d.library.model.manager.config.p pVar1111113 = m1.this.f223195a;
                                com.planner5d.library.services.r rVar1111113 = com.planner5d.library.services.r.userPaidSnapshots;
                                this.f223202a = aVar11;
                                this.f223203b = aVar11;
                                this.f223204c = aVar12;
                                this.f223206e = i10;
                                this.f223207f = j10;
                                this.f223208g = 11;
                                objP = pVar1111113.p(rVar1111113, 0, this);
                                if (objP != objL) {
                                    long j110 = j10;
                                    aVar13 = aVar12;
                                    obj = objP;
                                    i11 = i10;
                                    j11 = j110;
                                    aVar14 = aVar11;
                                    aVar15 = aVar14;
                                    aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                    aVar11 = aVar15;
                                }
                            } else {
                                aVar11.h(fd.o.f275196f.b());
                            }
                            m1.this.m(aVar11);
                            return Unit.f312394a;
                        }
                    }
                    return objL;
                case 9:
                    i10 = this.f223206e;
                    aVar10 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    jLongValue2 = ((Number) obj).longValue();
                    strL = m1.this.l(aVar10, jLongValue2, i10);
                    com.planner5d.library.model.manager.config.p pVar1111114 = m1.this.f223195a;
                    com.planner5d.library.services.r rVar1111114 = com.planner5d.library.services.r.userPaidHash;
                    this.f223202a = aVar10;
                    this.f223203b = strL;
                    this.f223206e = i10;
                    this.f223207f = jLongValue2;
                    this.f223208g = 10;
                    objU2 = pVar1111114.u(rVar1111114, null, this);
                    if (objU2 != objL) {
                        str = strL;
                        obj = objU2;
                        aVar11 = aVar10;
                        j10 = jLongValue2;
                        if (Intrinsics.areEqual(str, obj)) {
                            aVar12 = fd.o.f275196f;
                            com.planner5d.library.model.manager.config.p pVar1111115 = m1.this.f223195a;
                            com.planner5d.library.services.r rVar1111115 = com.planner5d.library.services.r.userPaidSnapshots;
                            this.f223202a = aVar11;
                            this.f223203b = aVar11;
                            this.f223204c = aVar12;
                            this.f223206e = i10;
                            this.f223207f = j10;
                            this.f223208g = 11;
                            objP = pVar1111115.p(rVar1111115, 0, this);
                            if (objP != objL) {
                                long j111 = j10;
                                aVar13 = aVar12;
                                obj = objP;
                                i11 = i10;
                                j11 = j111;
                                aVar14 = aVar11;
                                aVar15 = aVar14;
                                aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                                aVar11 = aVar15;
                            }
                        } else {
                            aVar11.h(fd.o.f275196f.b());
                        }
                        m1.this.m(aVar11);
                        return Unit.f312394a;
                    }
                    return objL;
                case 10:
                    j10 = this.f223207f;
                    i10 = this.f223206e;
                    str = (String) this.f223203b;
                    aVar11 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    if (Intrinsics.areEqual(str, obj)) {
                        aVar12 = fd.o.f275196f;
                        com.planner5d.library.model.manager.config.p pVar1111116 = m1.this.f223195a;
                        com.planner5d.library.services.r rVar1111116 = com.planner5d.library.services.r.userPaidSnapshots;
                        this.f223202a = aVar11;
                        this.f223203b = aVar11;
                        this.f223204c = aVar12;
                        this.f223206e = i10;
                        this.f223207f = j10;
                        this.f223208g = 11;
                        objP = pVar1111116.p(rVar1111116, 0, this);
                        if (objP != objL) {
                            long j112 = j10;
                            aVar13 = aVar12;
                            obj = objP;
                            i11 = i10;
                            j11 = j112;
                            aVar14 = aVar11;
                            aVar15 = aVar14;
                            aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                            aVar11 = aVar15;
                        }
                        return objL;
                    }
                    aVar11.h(fd.o.f275196f.b());
                    m1.this.m(aVar11);
                    return Unit.f312394a;
                case 11:
                    j11 = this.f223207f;
                    i11 = this.f223206e;
                    aVar13 = (fd.o.a) this.f223204c;
                    aVar14 = (id.a) this.f223203b;
                    aVar15 = (id.a) this.f223202a;
                    ResultKt.m(obj);
                    aVar14.h(aVar13.a(((Number) obj).intValue(), i11, j11));
                    aVar11 = aVar15;
                    m1.this.m(aVar11);
                    return Unit.f312394a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m1(@NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull final fg.e<t1> logRecordManager) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f223195a = preferences;
        this.f223196b = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.modules.user.user.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.j(logRecordManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t1 g() {
        return (t1) this.f223196b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord i(Throwable th2) {
        return new LogRecord("user_storage", "convert_load", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 j(fg.e eVar) {
        return (t1) eVar.get();
    }

    @androidx.annotation.m1
    private final void k() {
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new b(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l(id.a aVar, long j10, int i10) {
        String strH = com.planner5d.library.services.utility.e0.h(com.planner5d.library.services.utility.e0.h(com.planner5d.library.services.utility.e0.h(j10 + "_" + i10, "MD5") + "_" + aVar.f287077c + "_planner5d", com.planner5d.library.services.utility.e0.f225194b) + "_" + aVar.f287075a + "_" + aVar.f287079e, "MD5");
        Intrinsics.checkNotNullExpressionValue(strH, "hash(...)");
        return strH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord n(Throwable th2) {
        return new LogRecord("user_storage", "failed_save", th2);
    }

    @androidx.annotation.m1
    @Nullable
    public final id.a h() {
        try {
            k();
        } catch (Throwable th2) {
            g().v(new ij.c() { // from class: com.planner5d.library.modules.user.user.j1
                @Override // ij.c
                public final Object get() {
                    return m1.i(th2);
                }
            });
        }
        return (id.a) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, true, new a(null), 1, null);
    }

    @e.a({"ApplySharedPref"})
    @androidx.annotation.m1
    public final void m(@Nullable id.a aVar) {
        try {
            com.planner5d.library.model.manager.config.q qVarE = this.f223195a.E();
            if (aVar != null) {
                Pair<JSONObject, String> pairJ = aVar.j();
                qVarE.a(com.planner5d.library.services.r.user.f224891a, ((JSONObject) pairJ.first).toString());
                qVarE.a(com.planner5d.library.services.r.userSignature.f224891a, (String) pairJ.second);
            } else {
                qVarE.remove(com.planner5d.library.services.r.user.f224891a);
                qVarE.remove(com.planner5d.library.services.r.userSignature.f224891a);
            }
            qVarE.b();
        } catch (Throwable th2) {
            g().v(new ij.c() { // from class: com.planner5d.library.modules.user.user.k1
                @Override // ij.c
                public final Object get() {
                    return m1.n(th2);
                }
            });
        }
    }
}
